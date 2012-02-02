package at.srfg.kmt.ehealth.phrs.presentation.services;

import at.srfg.kmt.ehealth.phrs.security.services.*;
import at.srfg.kmt.ehealth.phrs.PhrsConstants;
import at.srfg.kmt.ehealth.phrs.dataexchange.client.ActorClient;
import at.srfg.kmt.ehealth.phrs.dataexchange.util.DateUtil;
import at.srfg.kmt.ehealth.phrs.persistence.api.Triple;
import at.srfg.kmt.ehealth.phrs.persistence.api.ValueType;
import at.srfg.kmt.ehealth.phrs.presentation.utils.DynaUtil;
import at.srfg.kmt.ehealth.phrs.support.test.CoreTestData;
import com.google.code.morphia.query.Query;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.joda.time.DateTime;
import org.junit.After;
import org.junit.Ignore;
import static org.junit.Assert.*;
import at.srfg.kmt.ehealth.phrs.Constants;
import at.srfg.kmt.ehealth.phrs.dataexchange.client.DynaBeanClient;
import at.srfg.kmt.ehealth.phrs.dataexchange.client.MedicationClient;
import at.srfg.kmt.ehealth.phrs.dataexchange.util.DynaBeanUtil;
import at.srfg.kmt.ehealth.phrs.model.baseform.BasePhrsModel;
import at.srfg.kmt.ehealth.phrs.persistence.api.GenericRepositoryException;
import at.srfg.kmt.ehealth.phrs.persistence.api.GenericTriplestore;
import at.srfg.kmt.ehealth.phrs.persistence.api.GenericTriplestoreLifecycle;
import at.srfg.kmt.ehealth.phrs.persistence.api.TripleException;
import at.srfg.kmt.ehealth.phrs.persistence.client.PhrsStoreClient;
import org.junit.Before;
import org.junit.Test;
import at.srfg.kmt.ehealth.phrs.model.baseform.MedicationTreatment;
import org.apache.commons.beanutils.DynaBean;
import at.srfg.kmt.ehealth.phrs.model.baseform.MedicationTreatmentMatrix;
import at.srfg.kmt.ehealth.phrs.persistence.util.MultiIterable;
import at.srfg.kmt.ehealth.phrs.presentation.services.InteropAccessService;
import java.util.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import at.srfg.kmt.ehealth.phrs.presentation.services.InteropTermTransformer;
import at.srfg.kmt.ehealth.phrs.presentation.utils.HealthyUtils;
import org.junit.*;
import at.srfg.kmt.ehealth.phrs.persistence.client.CommonDao;
import at.srfg.kmt.ehealth.phrs.persistence.client.InteropClients;

public class InteropProcessor {

    private static final Logger LOGGER = LoggerFactory.getLogger(InteropProcessor.class.getName());
    public final static String DATE_PATTERN_INTEROP_DATE_TIME = "yyyyMMddHHmm";
    public final static String REFERENCE_NOTE_PREFIX = "resourcephr=";
    public static final String USER_PROTOCOL_ID = Constants.PROTOCOL_ID_UNIT_TEST;
    public static final String PROTOCOL_ID_NAMESPACE = Constants.ICARDEA_DOMAIN_PIX_OID;
    
 
    private MedicationClient medicationClient;
    private ActorClient actorClient;
    private PhrsStoreClient phrsClient;
    private InteropAccessService iaccess;

    private boolean printDynabean = false;

    public InteropProcessor() {
        init();
    }

    public InteropProcessor(PhrsStoreClient phrsClient) {
        this.phrsClient = phrsClient;

        init();
    }

    protected void init() {
        if (phrsClient == null) {
            phrsClient = PhrsStoreClient.getInstance();
        }
        
        iaccess = phrsClient.getInteropService();

        //get this one, we set the creator differently
        medicationClient = phrsClient.getInteropClients().getMedicationClient();

        //assign actor
        actorClient = phrsClient.getInteropClients().getActorClient();//new ActorClient(triplestore);

        setupTest();

    }

    private void setupTest() {
        boolean hasTest = false;
        try {
            //Constants.PHRS_NAMESPACE
            String p1 = actorClient.getProtocolId(PROTOCOL_ID_NAMESPACE, Constants.OWNER_URI_CORE_PORTAL_TEST_USER);
            if (p1 != null) {
                hasTest = true;
            }
        } catch (Exception e) {
            LOGGER.error("Failed to find protocolId for user, must create - user=" + Constants.PROTOCOL_ID_UNIT_TEST + " for namespace=" + PROTOCOL_ID_NAMESPACE, e);
        }
        try {
            //Constants.PHRS_NAMESPACE
            String p1 = actorClient.getProtocolId(Constants.OWNER_URI_CORE_PORTAL_TEST_USER);
            if (p1 != null) {
                hasTest = true;
            }
        } catch (Exception e) {
            LOGGER.error("Failed to find protocolId for user, must create - user=" + Constants.OWNER_URI_CORE_PORTAL_TEST_USER + " for default namespace=" + Constants.PHRS_NAMESPACE, e);
        }
        try {
            if (!hasTest) {
                actorClient.register(PROTOCOL_ID_NAMESPACE, Constants.OWNER_URI_CORE_PORTAL_TEST_USER, Constants.PROTOCOL_ID_UNIT_TEST);
            }
            //actorClient.register(Constants.OWNER_URI_CORE_PORTAL_TEST_USER, Constants.PROTOCOL_ID_UNIT_TEST);
        } catch (Exception e) {
            LOGGER.error("Failed to Register Test protocol ID=" + Constants.PROTOCOL_ID_UNIT_TEST + " for namespace=" + PROTOCOL_ID_NAMESPACE, e);
        }
    }

// +++++++++++++++ start helpers
    public CommonDao getCommonDao() {
        return getPhrsStoreClient().getCommonDao();
    }

    public InteropClients getInteropClients() {
        return getPhrsStoreClient().getInteropClients();
    }

    public void sendMessages(Object repositoryObject) {
        iaccess.sendMessages(repositoryObject);
    }

    public int loadSampleTestDataSet(String owner) {

        CoreTestData core = new CoreTestData(phrsClient);
        //return count
        return core.addTestMedications_2_forPortalTestForOwnerUri(owner);

    }

    public PhrsStoreClient getPhrsStoreClient() {
        return phrsClient;
    }

    public static int showList(String title, List<String> results) {
        int count = 0;
        System.out.println("Title:" + title);
        for (String result : results) {
            count++;
            System.out.println("item (" + count + ") uri=" + result);
        }
        return count;
    }

    public static int showMap(String title, Map<String, String> map) {
        int count = 0;
        System.out.println("Title:" + title);
        for (String key : map.keySet()) {
            count++;
            System.out.println("item (" + count + ") thing=" + key + " val=" + map.get(key));
        }
        return count;
    }

    public static String parseReferenceNote(String note) {
        String out = null;
        if (note != null) {
            note = note.trim();
        }
        if (note != null) {
            if (note.contains(REFERENCE_NOTE_PREFIX)) {
                //or def parts, then use parts.size()
                String[] parts = note.split(REFERENCE_NOTE_PREFIX);

                if (parts != null && parts.length > 0) {
                    //split on whitespace, take [0]
                    out = parts[1];
                    if (out != null) {
                        out = out.trim();
                        String[] parts2 = out.split(" ");
                        if (parts2 != null && parts2.length > 0) {
                            out = parts2[0];
                        }
                    }
                }
            } else {
                //no parsing
                //out = note    
            }
        }
        return out;
    }
// +++++++++++++++ end helpers

    /**
     *
     * @param ownerUri
     * @param phrsClass
     * @param onlyNewMessages - true collect only new messages; false - all
     * message, known and unknown to phrweb portal
     * @return
     */
    public Set<DynaBean> findInteropMessagesForUser(String ownerUri, String phrsClass, boolean onlyNewMessages) {
        Set<DynaBean> beans = new HashSet<DynaBean>();
        if (ownerUri != null && phrsClass != null) {
            try {

                final Map<String, String> queryMap = new HashMap<String, String>();

                queryMap.put(Constants.RDFS_TYPE, phrsClass);
                queryMap.put(Constants.OWNER, ownerUri);

                Iterable<String> resources = getPhrsStoreClient().getGenericTriplestore().getForPredicatesAndValues(queryMap);

                //check each results, has it been tagged?

                //import the message, and also save it back to the Interop Service to tag it and make other listeners aware of it.
                if (resources != null) {
                    //transform message to


                    DynaBeanClient dynaBeanClient = getInteropClients().getDynaBeanClient();

                    for (String messageResourceUri : resources) {
                        try {
                            String referenceNote = null;
                            DynaBean dynaBean = dynaBeanClient.getDynaBean(messageResourceUri);
                            try {
                                referenceNote = DynaUtil.getStringProperty(dynaBean, Constants.SKOS_NOTE);
                            } catch (Exception e) {
                                e.printStackTrace();
                                // LOGGER.error(" message error, interop ownerUri= "+ownerUri+" messageResourceUri="+messageResourceUri, e)
                            }
                            if (referenceNote != null) {
                                String aboutResourceUri = parseReferenceNote((String) referenceNote);

                                if (aboutResourceUri != null && aboutResourceUri.length() != 0) {
                                    //existing, already imported
                                    if (!onlyNewMessages) {
                                        beans.add(dynaBean);
                                    }
                                } else {
                                    //new
                                    beans.add(dynaBean);
                                }
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                            //LOGGER.error(" message error, interop ownerUri= "+ownerUri+" messageResourceUri="+messageResourceUri, e);
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                // LOGGER.error(" message error, interop ownerUri= "+ownerUri+" messageResourceUri="+messageResourceUri, e)
            }
        }
        return beans;

    }

    public String buildNullFrequency() {
        String value = null;
        try {
            value = medicationClient.buildNullFrequency();
        } catch (Exception e) {
        }
        if (value == null) {
            value = null;
        }

        return value;
    }

    public Map<String, String> sendMedicationMessage(MedicationTreatment domain) {
        //MedicationTreatment domain = (MedicationTreatment) resource;

        //res.note is by default not sharable
        /**
         * Use the note to tag this record. Be sure to write note to multiple
         * messages such as Vital signs with separate messages for Body weight,
         * height, sys, diastolic
         *
         */
        //create reference to phrweb object for note
        String messageId = null;
        Map<String, String> messageIdMap = new HashMap<String, String>();

        String resourceType = domain.getClass().getCanonicalName();
        BasePhrsModel res = (BasePhrsModel) domain;
        String owner = res.getOwnerUri();

        String status = transformStatus(res.getStatus());
        status = status != null && status.length() > 0 ? status : Constants.STATUS_RUNNING;

        String categoryCode = transformCategory(res.getCategory(), resourceType);
        categoryCode = categoryCode != null ? categoryCode : null;

        String valueCode = transformCode(res.getCode());
        valueCode = valueCode != null ? valueCode : null;

        String dateStringStart = transformDate(res.getBeginDate(), res.getEndDate());
        dateStringStart = dateStringStart != null ? dateStringStart : null;

        String dateStringEnd = transformDate(res.getEndDate(), (Date) null);
        dateStringEnd = dateStringEnd != null ? dateStringEnd : null;

        String theParentId = res.getResourceUri();

        try {


            String name = domain.getLabel() != null ? domain.getLabel() : domain.getCode();

            String freqCode = domain.getFrequencyCode();
            //String dosageValue = domain.getTreatmentMatrix().getDosage() != null ? domain.getTreatmentMatrix().getDosage().toString() : "0";
            String dosageQuantity = domain.getTreatmentMatrix().getDosageQuantity();
            String dosageValue = domain.getTreatmentMatrix().getDosage() != null ? domain.getTreatmentMatrix().getDosage().toString() : "0";

            String doseUnits = domain.getTreatmentMatrix().getDosageUnits();

            String doseInterval = domain.getTreatmentMatrix().getDosageInterval();
            String doseTimeOfDay = domain.getTreatmentMatrix().getDosageTimeOfDay();

            String adminRoute = domain.getTreatmentMatrix().getAdminRoute();
            adminRoute = tranformMedicationAdminRoute(adminRoute, doseUnits);

            MedicationClient medicationclient = getInteropClients().getMedicationClient();

            String interopRef = findMessageWithReference(owner, theParentId, Constants.PHRS_MEDICATION_CLASS, null);


            if (interopRef == null) {
                String referenceNote = createReferenceNote(domain.getResourceUri());

                messageId = medicationclient.addMedicationSign(
                        owner,
                        referenceNote,
                        status,
                        dateStringStart,
                        dateStringEnd,//dateStringEnd,
                        medicationclient.buildNullFrequency(),//doseInterval, frequency,
                        adminRoute,
                        dosageQuantity,//dosageValue,
                        doseUnits,
                        name);
                if (messageId != null && messageId.length() > 0) {

                    messageIdMap.put("default", messageId);
                }
            } else {
                //update
                updateMessageMedication(theParentId, interopRef, Constants.HL7V3_STATUS, status);
                updateMessageMedication(theParentId, interopRef, Constants.HL7V3_START_DATE, dateStringStart);
                updateMessageMedication(theParentId, interopRef, Constants.HL7V3_END_DATE, dateStringEnd);

                //FIXXME - not needed, but refactor to new buildFrequency from interval and TOD time of day

                //Never changes. updateMessageMedication(theParentId, interopRef, HL7V3_ADMIN_ROUTE, adminRoute);

                //Drug name change requires code. Dont update. updateMessageMedication(theParentId, interopRef, HL7V3_ADMIN_ROUTE, adminRoute);                                           
                //This needs a URI
                String newDosageURI = buildMedicationDosage(dosageValue, doseUnits);


                //PHRS_MEDICATION_DOSAGE if updating or HL7V3_DOSAGE if retrieving from EHR data
                //String newDosageURI = medicationClient.buildDosage(newDossageValue, newDosageUnit);

                updateMessageMedication(theParentId,
                        interopRef,
                        Constants.PHRS_MEDICATION_DOSAGE,
                        newDosageURI);

//                        if((domain.getCreatorUri()!=null 
//                            && (domain.getCreatorUri().equalsIgnoreCase(Constants.EXTERN)
//                                 || domain.getCreatorUri().contains("at.srfg."))
//                            ) || (domain.getOriginStatus()!=null 
//                                && domain.getOriginStatus().equalsIgnoreCase(PhrsConstants.INTEROP_ORIGIN_STATUS_IMPORTED))   ) {

                //add this for any changes...if EHR record ignore change to 
                if (domain.getOriginStatus() != null
                        && domain.getOriginStatus().equalsIgnoreCase(PhrsConstants.INTEROP_ORIGIN_STATUS_IMPORTED)) {
                    // dont update    
                } else {
                    //PHR born resource
                    updateMessageMedication(theParentId, interopRef, Constants.HL7V3_END_DATE, dateStringEnd);
                }
            }

        } catch (RuntimeException e) {
            e.printStackTrace();

        } catch (TripleException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return messageIdMap;
    }

    /**
     *
     * @param ownerUri
     * @param resourceUri
     * @param categoryCode - this can be null, it is used to select a specific
     * code within a phrsClass e.g. ObservationClass includes resources by code
     * for Body height, symptom
     * @param phrsClass - The Phrs class Constants.PHRS_MEDICATION_CLASS,
     * PHRS_VITAL_SIGN_CLASS, PHRS_OBSERVATION_ENTRY_CLASS
     * @return
     */
    public String findMessageWithReference(String ownerUri, String resourceUri, String phrsClass, String categoryCode) {
        //owner, theParentId, Constants.PHRS_OBSERVATION_ENTRY_CLASS,categoryCode
        //String value = findInteropMessageWithReferenceTag(ownerUri, resourceUri, phrsClass, categoryCode);
        String value = findMessageWithReference(ownerUri, resourceUri, phrsClass);
        return value;
    }

    public String findMessageWithReference(String ownerUri, String resourceUri, String phrsClass) {

        //List<String> list = new ArrayList();
        //Set<DynaBean> queryResultBeans = new HashSet<DynaBean>();
        String result = null;
        if (ownerUri != null && phrsClass != null && resourceUri != null) {

            try {
                Set<DynaBean> results = findInteropMessagesForUser(ownerUri, phrsClass, false);//check false old and new messages
                if (results != null) {

                    for (DynaBean dynaBean : results) {
                        try {
                            String messageUri = dynaBean.getDynaClass().getName();
                            boolean match = false;

                            String note = DynaUtil.getStringProperty(dynaBean, Constants.SKOS_NOTE);
                            if (note != null) {
                                String foundRef = parseReferenceNote(note);
                                if (foundRef != null && foundRef.equals(resourceUri)) {
                                    match = true;
                                }
                            }
                            if (match) {
                                //list.add(messageUri);
                                result = messageUri;
                                break;
                                //queryResultBeans.add(dynaBean);
                            }

                        } catch (Exception e) {
                            e.printStackTrace();
                            // LOGGER.error(" message error, interop ownerUri= "+ownerUri+" messageResourceUri="+messageResourceUri, e)
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return result;

    }

    public static String createReferenceNote(String resourceUri) {
        String referenceNote = null;
        if (resourceUri != null) {
            referenceNote = InteropAccessService.REFERENCE_NOTE_PREFIX + resourceUri; //"" //res.note is by default not sharable
        } else {
            referenceNote = "error";
        }
        return referenceNote;
    }

    public void createManufactureName(String subjectUri, String drugName, String drugCode) {
        MedicationClient medicationClient = PhrsStoreClient.getInstance().getInteropClients().getMedicationClient();
        /*
         * triplestore.persist(subject,
         * "http://www.icardea.at/phrs/hl7V3#manufacturedProduct",
         * buildManufacturedProduct(drugName, drugCode), RESOURCE);
         */
        String newDrugProductUri = null;
        try {
            newDrugProductUri = medicationClient.buildManufacturedProduct(drugName, drugCode);
        } catch (TripleException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }


        assertNotNull(newDrugProductUri);

        try {
            // update 
            medicationClient.updateMedication(
                    subjectUri,
                    //Constants.MANUFACTURED_PRODUCT,
                    PhrsConstants.MEDICATION_PROPERTY_MANUFACTURED_PRODUCT_URI,
                    newDrugProductUri);
        } catch (TripleException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String transformStatus(String status) {
        String out = status;

        return out;
    }

    public String transformCode(String code) {
        String out = code;

        return out;
    }

    public String transformCategory(String category, String type) {
        String out = category;

        return out;
    }

    public String transformDate(Date date, Date defaultDate) {
        Date theDate = date;
        if (theDate == null) {
            if (defaultDate != null) {
                theDate = defaultDate;
            }
        }
        if (theDate != null) {

            return HealthyUtils.formatDate(theDate, (String) null, InteropAccessService.DATE_PATTERN_INTEROP_DATE_TIME);
        }
        return null;
    }

    public String tranformMedicationAdminRoute(String adminRoute, String doseUnits) {
        String out = adminRoute;
        out = Constants.HL7V3_ORAL_ADMINISTRATION;


        return out;
    }

    public List<String> importNewMessages(String ownerUri, String phrsClass) {
        return importNewMessages(ownerUri, phrsClass, true, null);
    }

    public List<String> importNewMessages(String ownerUri, String phrsClass, boolean importMessage) {
        return importNewMessages(ownerUri, phrsClass, importMessage, null);
    }

    public List<String> importNewMessages(String ownerUri, String phrsClass, boolean importMessage, List phrResources) {

        List<String> list = new ArrayList();
        if (ownerUri != null && phrsClass != null) {

            try {
                //Find new messages (true),ignore known messages that have been imported
                Set<DynaBean> results = findInteropMessagesForUser(ownerUri, phrsClass, true);
                //check each results, has it been tagged?

                //import the message, and also save it back to the Interop Service to tag it and make other listeners aware of it.
                if (results != null) {
                    //int resSize = results.size();

                    for (DynaBean dynaBean : results) {
                        String messageUri = null;

                        try {

                            messageUri = dynaBean.getDynaClass().getName();

                            //http://www.icardea.at/phrs#owner
                            String owner = DynaUtil.getStringProperty(dynaBean, Constants.OWNER);

                            String creator = DynaUtil.getStringProperty(dynaBean, Constants.CREATOR);

                            Object repositoryObject = transformInteropMessage(ownerUri, phrsClass, dynaBean, messageUri);

                            if (repositoryObject != null) {

                                if (dynaBean.getDynaClass().getName() != null) {
                                    //add only the URI
                                    list.add(dynaBean.getDynaClass().getName());
                                }
                                if (phrResources != null) {
                                    phrResources.add(repositoryObject);
                                }
                            }
                            if (importMessage && repositoryObject != null) {
                                //save transformed resource to local store

                                getCommonDao().crudSaveResource(repositoryObject, ownerUri, "interopservice");
                                //saved, now has resourceUri
                                String resourceUri = null;
                                if (repositoryObject instanceof BasePhrsModel) {
                                    resourceUri = ((BasePhrsModel) repositoryObject).getResourceUri();
                                }
//                                else if (repositoryObject instanceof BasePhrsMetadata) {
//                                resourceUri = ((BasePhrsMetadata) repositoryObject).getResourceUri();
//
//                                }
//                              mark it, known to both portal and core that this resource has been imported OK
                                if (resourceUri != null) {
                                    //user resourceUri of saved resource to make reference
                                    String note = createReferenceNote(resourceUri);
                                    //mark the message to associate it with this resource
                                    this.updateInteropReferenceNote(messageUri, note);  //throws exception                          
                                } else {
                                    throw new Exception("Missing resourceUri from newly imported  saved resource");
                                }

                            }

                        } catch (Exception e) {
                            e.printStackTrace();
                            LOGGER.error(" message error, interop ownerUri= " + ownerUri, e);
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                LOGGER.error("", e);
            } catch (java.lang.Error e) {
                //System.out.println("java lang error sesame error");
                e.printStackTrace();
                LOGGER.error("possible sesame error", e);
            }
        }


        return list;

    }

    public boolean compareOwners(String givenOwnerUri, String messageOwner) {
        boolean valid = false;
        //should be ok, check again
        if (messageOwner != null && messageOwner.length() > 0 && givenOwnerUri != null) {
            if (messageOwner.equals(givenOwnerUri)) {
                valid = true;
            }

        }

        return valid;
    }

    /**
     *
     * @param givenOwnerUri
     * @param phrsClass
     * @param dynabean
     * @param messageResourceUri
     * @return a new phr resource the property originImported is set to True.
     * This is a transient property that is detected later when persisting the
     * imported resource for the first time
     *
     *
     */
    public Object transformInteropMessage(String givenOwnerUri, String phrsClass, DynaBean dynabean, String messageResourceUri) {
        Object theObject = null;
        //Import medications
        if (Constants.PHRS_MEDICATION_CLASS.equals(phrsClass)) {
            theObject = this.transformInteropMedicationMessage(givenOwnerUri, phrsClass, dynabean, messageResourceUri);
        }
        return theObject;
    }

    public Object transformInteropMedicationMessage(String givenOwnerUri, String phrsClass, DynaBean dynabean, String messageResourceUri) {
        Object theObject = null;
        try {

            if (dynabean != null && phrsClass != null) {
                LOGGER.debug("phrsClass=" + phrsClass + " bean properties =");

                //switch (phrsClass) {
                //   case Constants.PHRS_MEDICATION_CLASS:
                String messageOwner = DynaUtil.getStringProperty(dynabean, Constants.OWNER, null);
                if (messageOwner != null) {
                    messageOwner = messageOwner.trim();
                }
                //Map props = bean.getProperties() //check ownerUri of message


                if (!compareOwners(givenOwnerUri, messageOwner)) {
                    LOGGER.error("Message ownerUri does not match given givenOwnerUri=" + givenOwnerUri + " med.OwnerUri=");

                } else {

                    // Constants.HL7V3_DATE_START  Constants.HL7V3_DATE_END
                    // Constants.HL7V3_STATUS Constants.HL7V3_FREQUENCY Constants.HL7V3_ADMIN_ROUTE Constants.HL7V3_DOSAGE
                    // Constants.HL7V3_DRUG_NAME Constants.HL7V3_CODE

                    MedicationTreatment med = new MedicationTreatment();
                    med.setNewImport(true);

                    med.setOwnerUri(messageOwner);

                    med.setCreatorUri(DynaUtil.getStringProperty(dynabean, Constants.CREATOR, "EHR"));//FIXXME 

                    String stdStatus = DynaUtil.getValueResourceUri(dynabean, Constants.HL7V3_STATUS, null);//TODO default

                    med.setStatusStandard(stdStatus); //med.status = "medicationSummary_medicationStatus_true"
                    //InteropAccessService.getDynaBeanPropertyValue(bean, Constants.HL7V3_STATUS, null)

                    med.setStatus(InteropTermTransformer.transformStandardStatusToLocal(stdStatus, Constants.PHRS_MEDICATION_CLASS));
                    //there is no code here, but it is likely a dynabean
                    //deprecated med.setCode(DynaUtil.getStringProperty(dynabean, Constants.HL7V3_CODE, null));//TODO is this drug code?
                    //check the origin of this message....
                    med.setOrigin(DynaUtil.getStringProperty(dynabean, Constants.ORIGIN, PhrsConstants.INTEROP_ORIGIN_DEFAULT_EHR));

                    med.setOriginStatus(PhrsConstants.INTEROP_ORIGIN_STATUS_IMPORTED);

                    med.setExternalReference(messageResourceUri);


                    Map<String, String> attrMedName = getMedicationNameAttributes(dynabean);
                    String medName = getMapValue(attrMedName, Constants.HL7V3_DRUG_NAME, "Drug");
                    med.setTitle(medName);
                    String productCode = getMapValue(attrMedName, Constants.HL7V3_VALUE, null);
                    med.setProductCode(productCode);

                    med.getTreatmentMatrix().setAdminRoute(DynaUtil.getValueResourceUri(dynabean, Constants.HL7V3_ADMIN_ROUTE, Constants.HL7V3_ORAL_ADMINISTRATION));
                    //this is a uri to another dynabean with dosage and units

                    //ISSUE check DOSAGE is QUANTITY but we do not need double? Keep as String
                    //ISSUE check dosage per unit not received from EHR, but web form no longer asks.

                    med.getTreatmentMatrix().setDosage(0d);

                    Map<String, String> doseAttrs = getMedicationDosageAttributes(dynabean);
                    String doseQuantity = getMapValue(doseAttrs, Constants.HL7V3_DOSAGE_VALUE, "0");
                    med.getTreatmentMatrix().setDosageQuantity(doseQuantity);

                    String doseUnits = getMapValue(doseAttrs, Constants.HL7V3_DOSAGE_UNIT, "http://www.icardea.at/phrs/instances/pills");
                    med.getTreatmentMatrix().setDosageUnits(doseUnits);

                    //FIXXME - TOD and interval are not expected from EHR.  this create the frequency node
                    String interval = "http://www.icardea.at/phrs/instances/other";
                    med.getTreatmentMatrix().setDosageInterval(interval);

                    String tod = "http://www.icardea.at/phrs/instances/NotSpecified";
                    med.getTreatmentMatrix().setDosageTimeOfDay(tod);


                    //dates. always need a start date
                    String dateBegin = DynaUtil.getStringProperty(dynabean, Constants.HL7V3_DATE_START);
                    //set new date if not found
                    Date beginDate = transformDateFromMessage(dateBegin, new Date());	//HealthyUtils.formatDate( dateBegin, (String)null, DATE_PATTERN_INTEROP_DATE_TIME)

                    String dateEnd = DynaUtil.getStringProperty(dynabean, Constants.HL7V3_DATE_END, null);
                    Date endDate = transformDateFromMessage(dateEnd, (Date) null);		//HealthyUtils.formatDate( dateEnd, (String)null, DATE_PATTERN_INTEROP_DATE_TIME)//transformDate(dateEnd)

                    med.setBeginDate(beginDate);
                    med.setEndDate(endDate);


                    med.setCreateDate(new Date());
                    med.setModifyDate(med.getCreateDate());
                    med.setType(MedicationTreatment.class.toString());

                    theObject = med;

                    if (med != null) {
                        System.out.println("medication imported resourceUri=" + med.getResourceUri() + " name=" + med.getTitle() + " code=" + med.getProductCode());
                        LOGGER.debug("medication imported  name=" + med.getTitle() + " code=" + med.getProductCode());
                    }
                }

            }
        } catch (Exception e) {

            if (dynabean != null) {
                LOGGER.error(
                        "Interop Message transformation failed, ownerUri=" + givenOwnerUri + " phrsClass=" + phrsClass, e);
            } else {
                LOGGER.error("Interop Message transformation failed, dynabean NULL, ownerUri="
                        + givenOwnerUri + " phrsClass=" + phrsClass, e);
            }
        }
        return theObject;
    }

    //HL7V3_DRUG_NAME
    public static String getMapValue(Map<String, String> map, String key) {
        return getMapValue(map, key, null);
    }

    public static String getMapValue(Map<String, String> map, String key, String defaultValue) {
        String value = null;
        if (map != null && key != null && map.containsKey(key)) {
            value = map.get(key);
        }
        if (value == null) {
            value = defaultValue;
        }
        return value;
    }

    public DynaBean getByDynabeanOrUri(Object obj) {
        try {
            if (obj != null) {
                if (obj instanceof DynaBean) {
                    return (DynaBean) obj;
                }
            } else if (obj instanceof String) {
                DynaBeanClient dbc = PhrsStoreClient.getInstance().getInteropClients().getDynaBeanClient();
                DynaBean dynaBean = dbc.getDynaBean((String) obj);

            }
        } catch (Exception e) {
            LOGGER.error("", e);
        }

        return null;

    }

    /**
     * Get the dosage details and put them into a map
     *
     * @param medicationDynabean
     * @return
     */
    public Map getMedicationDosageAttributes(DynaBean medicationDynabean) {
        Map map = null;
        try {
            DynaBean dynaBean = (DynaBean) DynaUtil.getDynaBeanProperty(medicationDynabean, Constants.HL7V3_DOSAGE); //http://www.icardea.at/phrs/hl7V3#dosage  (medicationDynabean);

            if (dynaBean != null) {



                //DynaBeanClient dbc = PhrsStoreClient.getInstance().getInteropClients().getDynaBeanClient();
                //DynaBean dynaBean = dbc.getDynaBean(uri);

                if (dynaBean != null) {
                    String dosage = DynaUtil.getStringProperty(dynaBean, Constants.HL7V3_DOSAGE_VALUE); //Constants.HL7V3_DOSAGE
                    String units = DynaUtil.getValueResourceUri(dynaBean, Constants.HL7V3_DOSAGE_UNIT);
                    map = new HashMap();

                    if (dosage != null) {
                        dosage = dosage.trim();
                    }
                    if (dosage != null && dosage.length() > 0) {
                        map.put(Constants.HL7V3_DOSAGE_VALUE, dosage);
                    }
                    if (units != null) {
                        units = units.trim();
                    }
                    if (units != null && units.length() > 0) {
                        map.put(Constants.HL7V3_DOSAGE_UNIT, units);
                    }
                }


            }

        } catch (Exception e) {
            LOGGER.error("", e);
        }

        return map;
    }

    /**
     * Get name and product code attributes. These might be stored simply as a
     * name or as complex subnode
     *
     * @param medicationDynabean
     * @return
     */
    //Simple has HL7V3_DRUG_NAME string
    //dyn MANUFACTURED_PRODUCT_CLASS http://www.icardea.at/phrs/hl7V3#manufacturedProduct 
    //dyn ... MANUFACTURED_LABEL_DRUG_CLASS http://www.icardea.at/phrs/hl7V3#manufacturedLabeledDrug
    //String ......HL7V3_DRUG_NAME http://www.icardea.at/phrs/hl7V3#drugName
    //
    //Complex with drug code node dynabean HL7V3_CODE
    //dyn MANUFACTURED_PRODUCT
    //dyn ... MANUFACTURED_LABEL_DRUG
    //dyn ... HL7V3_CODE
    //String ...... HL7V3_VALUE ..drug code
    //String ...... SKOS_PREFLABEL
    //
    //    MANUFACTURED_PRODUCT
    //            "#";
    //    
    //    HL7_CLASS_CODE 
    //            ICARDEA_HL7V3_NS + "#classCode";
    //    
    //    MANUFACTURED_LABEL_DRUG = 
    //            ICARDEA_HL7V3_NS + "#manufacturedLabeledDrug";
    //    
    public Map getMedicationNameAttributes(DynaBean medicationDynabean) {
        Map map = null;
        try {
            DynaBean dynaBeanMfgProduct = DynaUtil.getDynaBeanProperty(
                    medicationDynabean,
                    PhrsConstants.MEDICATION_PROPERTY_MANUFACTURED_PRODUCT_URI);//TODO replace with Constants.MANUFACTURED_PRODUCT, not MANUFACTURED_PRODUCT_CLASS

            if (dynaBeanMfgProduct != null) {
                DynaBean mfgLabelDrugBean = DynaUtil.getDynaBeanProperty(
                        dynaBeanMfgProduct,
                        Constants.MANUFACTURED_LABEL_DRUG);//not MANUFACTURED_LABEL_DRUG_CLASS

                //Name provided either complex or simple
                //
                //simple:
                //HL7V3_DRUG_NAME literal
                //
                //or complex:                 
                //HL7V3_CODE dyna
                //....SKOS_PREFLABEL literal
                //....HL7V3_VALUE literal

                if (mfgLabelDrugBean != null) {
                    String name, drugId = null;
                    //simple name usually from PHR add  FIXXME WRONG!
                    name = DynaUtil.getStringProperty(mfgLabelDrugBean, Constants.HL7V3_DRUG_NAME); //Constants.HL7V3_DOSAGE
                    //or complex name and code from EHR FIXXME WRONG!
                    DynaBean codeBean = (DynaBean) DynaUtil.getDynaBeanProperty(mfgLabelDrugBean, Constants.HL7V3_CODE);

                    //Try to get name and code from a complex representation
                    if (codeBean != null) {
                        String name2 = DynaUtil.getStringProperty(codeBean, Constants.SKOS_PREFLABEL);
                        name = name2 != null && name2.length() > 0 ? name2 : name;

                        drugId = DynaUtil.getStringProperty(codeBean, Constants.HL7V3_VALUE);
                    }

                    map = new HashMap();

                    if (name != null) {
                        name = name.trim();
                    }
                    if (name != null && name.length() > 0) {
                        map.put(Constants.HL7V3_DRUG_NAME, name);
                        //extra 
                        map.put(Constants.SKOS_PREFLABEL, name);
                    }
                    if (drugId != null) {
                        drugId = drugId.trim();
                    }
                    //this is a resource...another dynabean!
                    if (drugId != null && drugId.length() > 0) {
                        map.put(Constants.HL7V3_VALUE, drugId);
                    }
                }


            }
        } catch (Exception e) {
            LOGGER.error("", e);
        }
        return map;
    }

    /**
     * Transform to date string yyyyMMddHHmm
     *
     * @param date
     * @param dateTime
     * @return
     *
     */
    public static Date transformDateFromMessage(String dateMessage, Date defaultDate) {
        Date theDate = null;
        try {
            if (dateMessage != null) {
                theDate = DateUtil.getFormatedDate(dateMessage);
            }
            if (theDate != null) {
                theDate = defaultDate != null ? defaultDate : new Date();
            }
        } catch (Exception e) {
            LOGGER.error("transforming date", e);
        }
        return theDate;
    }

    public String buildMedicationDosage(String dosageValue, String dosageUnits) {
        String newDosageURI = null;
        try {
            newDosageURI = medicationClient.buildDosage(dosageValue, dosageUnits);
            //newDosageURI = getInteropClients().getMedicationClient().buildDosage(dosageValue, dosageUnits);

        } catch (Exception e) {
            LOGGER.error("buildMedicationDosage dosageValue=" + dosageValue + " dosageUnits=" + dosageUnits, e);
        }
        return newDosageURI;
    }

    /**
     *
     * @param resourceUri
     * @param interopResourceId
     * @param predicate
     * @param newValue
     */
    public boolean updateMessageVitals(String resourceUri, String interopResourceId, String predicate, String newValue) {
        boolean success = false;
        try {
            updateInteropStatement(interopResourceId, predicate, newValue);
            //getInteropClients().getVitalSignClient().updateVitalSign(interopResourceId, predicate, newValue);
            success = true;
        } catch (Exception e) {
            LOGGER.error("Interop client updateMessageVitals, interop resource= " + resourceUri + " interopResourceId=" + interopResourceId, e);
        }
        return success;
    }

    /**
     * This cannot not be used directly for the drug name and code or dosage and
     * dosage units - these nodes must be created and the URI assigned here
     *
     * @param resourceUri - not used directly to update the
     * @param interopResourceId
     * @param predicate
     * @param newValue
     */
    public boolean updateMessageMedication(String resourceUri, String interopResourceId, String predicate, String newValue) {
        boolean success = false;
        try {
            updateInteropStatement(interopResourceId, predicate, newValue);
            // getInteropClients().getMedicationClient().updateMedication(interopResourceId, predicate, newValue);
            success = true;
        } catch (Exception e) {
            LOGGER.error("Interop client updateMessageMedication, interop resource= " + resourceUri + " interopResourceId=" + interopResourceId, e);
        }
        return success;
    }

    /**
     *
     * @param interopResourceId
     * @param predicate
     * @param newValue
     * @throws Exception
     *
     */
    public void updateInteropStatement(String interopResourceId, String predicate, String newValue)
            throws Exception {
        if (interopResourceId != null && newValue != null && predicate != null) {
            phrsClient.updateTriple(interopResourceId, predicate, newValue, true);
        }

    }

    /**
     *
     * @param phrResourceUri - currently not needed
     * @param interopResourceId
     * @param predicate
     * @param newValue
     * @throws Exception
     */
    public void updateInteropStatement(String phrResourceUri, String interopResourceId, String predicate, String newValue)
            throws Exception {
        if (interopResourceId != null && newValue != null && predicate != null) {
            phrsClient.updateTriple(interopResourceId, predicate, newValue, true);
        }
        //updateInteropStatement(resourceUri,interopResourceId,predicate,newValue);
    }

    /**
     *
     * @param interopResourceId
     * @param value
     * @throws Exception
     */
    public void updateInteropReferenceNote(String interopResourceId, String newValue) throws Exception {
        if (interopResourceId != null && newValue != null) {
            phrsClient.updateSkosNote(interopResourceId, newValue);
        }
    }

    /**
     *
     * @param resourceUri
     * @param interopResourceId
     * @param predicate
     * @param newValue
     */
    public boolean updateMessageProblem(String resourceUri, String interopResourceId, String predicate, String newValue) {
        boolean success = false;
        try {
            updateInteropStatement(interopResourceId, predicate, newValue);
            //getInteropClients().getProblemEntryClient().updateProblemEntry(interopResourceId, predicate, newValue);
            success = true;
        } catch (Exception e) {
            LOGGER.error("Interop client updateMessageProblem, interop resource= " + resourceUri + " interopResourceId=" + interopResourceId, e);
        }
        return success;
    }

    public void registerProtocolId(String owneruri, String protocolId, String namespace) {
        //phrsStoreClient.getInteropClients().getActorClient().register
        if (namespace == null) {
            namespace = Constants.ICARDEA_DOMAIN_PIX_OID;

        }
        //AUTHORIZE_USER_PREFIX_TEST   
        try {
            getInteropClients().getActorClient().register(namespace, owneruri, protocolId);
            LOGGER.debug("registered protocolId in core for owneruri= " + owneruri + " protocolId= " + protocolId + " namespace=" + namespace);

        } catch (TripleException e) {
            LOGGER.error("owneruri= " + owneruri + " protocolId= " + protocolId, e);
        }

    }
}

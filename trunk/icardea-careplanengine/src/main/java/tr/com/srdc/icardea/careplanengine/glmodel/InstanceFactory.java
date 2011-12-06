/**
 *
 * 		Author			Date
 * 		---------		------------
 *		METU_SRDC		January 2006
 *
 *		Description
 *		-----------
 *		InstanceFactory class is responsible for creating
 *		an OWL Model object from a specified OWL file URI
 *		and also creating objects when requested with class
 *		name.
 *
 */

package tr.com.srdc.icardea.careplanengine.glmodel;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Vector;


import com.hp.hpl.jena.util.FileUtils;

import edu.stanford.smi.protegex.owl.ProtegeOWL;
import edu.stanford.smi.protegex.owl.jena.JenaOWLModel;
import edu.stanford.smi.protegex.owl.model.OWLIndividual;
import edu.stanford.smi.protegex.owl.model.OWLModel;
import edu.stanford.smi.protegex.owl.model.OWLNamedClass;
import edu.stanford.smi.protegex.owl.model.RDFProperty;
import edu.stanford.smi.protegex.owl.model.RDFResource;
import edu.stanford.smi.protegex.owl.model.event.PropertyValueAdapter;

public class InstanceFactory {

	protected JenaOWLModel 	mOWLModel = null;
	protected Class 	aClass = null;

    private static Hashtable<URI, InstanceFactory> instances = new Hashtable<URI, InstanceFactory>();

    /**
     * In order to avoid the long time while loading the ontology,
     * for every uri there is a single instance of InstanceFactory.
     * @param uriString of the Ontology
     * @return instance of InstanceFactory
     */
    // addition of getInstance method (mehmet olduz)
    // todo: if the previous instance (which has a different uri) is not needed, change this method so that only one instance of InstanceFactory is in memory
    public static synchronized InstanceFactory getInstance(String uriString) {
        try {
            URI uri = new URI(uriString);
            if(instances.get(uri)==null)
                instances.put(uri, new InstanceFactory(uriString));
            return instances.get(uri);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void loadProtegePlugins(){
        ProtegeOWL.createJenaOWLModel(); // force protege to load the plugins at the beginning
    }
    //erdem: Added model generation option from inputstream
    private InstanceFactory(String aURI) {
        try {
//            ProtegeOWL.createJenaOWLModel();
            long start = new java.util.Date().getTime();
            URI uri = new URI(aURI);
            if(uri.isAbsolute()){
        		mOWLModel = ProtegeOWL.createJenaOWLModelFromURI(aURI);
            }else{
				File inputFile = new File(aURI);
				FileInputStream fis = new FileInputStream(inputFile);
				mOWLModel = ProtegeOWL.createJenaOWLModelFromInputStream(fis);
//            SimpleDateFormat df = new SimpleDateFormat();
//            Logger.getLogger(this.getClass()).log(Level.DEBUG, ("ENTRY TIME:::" +  df.format(new java.util.Date().getTime()));
//            Logger.getLogger(this.getClass()).log(Level.DEBUG, ("EXIT TIME:::" +  df.format(new java.util.Date().getTime()));
            }
            Logger.getLogger(this.getClass()).log(Level.DEBUG, ("LOADED in " + (new java.util.Date().getTime()-start) + " ms" ));
        }
		catch(Exception e) {
			e.printStackTrace();
		}
	}

    public synchronized File dumpFile(String filename) {
        // FIXME: [Mustafa] By default, dumped OWL files are saved to owl folder under icardea home.
    	return dumpFile("owl", filename);
    }

    public synchronized File dumpFile(String relativeDirectory, String filename) {

    	if(mOWLModel != null){
    		Collection errors = new ArrayList();
            File file = new File(relativeDirectory+ "/" +filename);
            mOWLModel.save(file.toURI(), FileUtils.langXMLAbbrev, errors);
    		Logger.getLogger(this.getClass()).log(Level.DEBUG, ("File saved with " + errors.size() + " errors."));
            return file;
        }
    	else
    		Logger.getLogger(this.getClass()).log(Level.DEBUG, ("mOWLModel is null."));
        return null;
    }
    
	public OWLModel getMOWLModel() {
		return mOWLModel;
	}

	public void setMOWLModel(JenaOWLModel model) {
		mOWLModel = model;
	}

	public Vector<String> getClassNames() {
		Vector<String> vec = new Vector<String>();

        if(mOWLModel != null) {
            Iterator it = mOWLModel.listOWLNamedClasses();
            while(it.hasNext()) {
				vec.addElement(((OWLNamedClass) it.next()).getLocalName());
			}
		}
        return vec;
	}

	public Vector<String> getIndividualNames(String aClassName) {
        Vector<String> individualNameList = new Vector<String>();

		if(aClassName != null) {
			OWLNamedClass aClass;
	    	aClass = mOWLModel.getOWLNamedClass(aClassName);
            for (Object o : aClass.getInstances(true)) {
                try {
                    OWLIndividual individual = (OWLIndividual) o;
                    individualNameList.addElement(individual.getLocalName());
                }
                catch (Exception e) {
                    e.printStackTrace();
                    return null;
                }
            }
		}
		return individualNameList;
	}

	public Object createIndividual(String aClassName, String anIndividualName) {
		OWLNamedClass lOWLNamedClass = null;
		Object lObject = null;

		try {
			lOWLNamedClass = mOWLModel.getOWLNamedClass(aClassName);
			Class lClass = Class.forName(Configuration.PACKAGE_NAME + "." + aClassName);
			lObject = mOWLModel.getOWLIndividual(anIndividualName).as(lClass);
			lOWLNamedClass.addPropertyValueListener(new PropertyValueAdapter() {
				public void propertyValueChanged(RDFResource resource, RDFProperty property, Collection oldValues){
		            Logger.getLogger(this.getClass()).log(Level.DEBUG, ("Property value changed."));
		        }

				public void browserTextChanged(RDFResource arg0) {
					// TODO Auto-generated method stub
					Logger.getLogger(this.getClass()).log(Level.DEBUG, ("Browser Text changed."));
				}

				public void nameChanged(RDFResource arg0, String arg1) {
					// TODO Auto-generated method stub
					Logger.getLogger(this.getClass()).log(Level.DEBUG, ("Name changed."));
				}

				public void visibilityChanged(RDFResource arg0) {
					// TODO Auto-generated method stub
					Logger.getLogger(this.getClass()).log(Level.DEBUG, ("Visibility changed."));
				}

		    });
		}
		catch(NullPointerException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

//		Debug.info(this, "Successfully created Java object from individual");
		return lObject;
	}

	public Vector<Guideline> createGuidelines() {
		Vector<Guideline> lGuidelineVector = new Vector<Guideline>();
		Vector<String> lGuidelineNames = this.getIndividualNames(Configuration.GUIDELINE_CLASSNAME_IN_OWL);
        for (String lGuidelineName : lGuidelineNames) {
            lGuidelineVector.addElement((Guideline) this.createIndividual(Configuration.GUIDELINE_CLASSNAME_IN_OWL, lGuidelineName));
        }
		return lGuidelineVector;
	}

	public Vector getAlgoSteps(Guideline aGuideline) {

		Vector lSteps = new Vector();
		Algorithm lAlgorithm = null;

		lAlgorithm = aGuideline.getAlgorithm();

		Iterator it = lAlgorithm.listSteps();
		while(it.hasNext()) {

			OWLIndividual lOWLIndividual = ((OWLIndividual)it.next());
			lSteps.addElement((this.createIndividual(lOWLIndividual.getProtegeType().getName(),lOWLIndividual.getLocalName())));
		}

		return lSteps;
	}
	

	public Vector getEligibilityCriteria(Guideline aGuideline) {

		Vector lEligibilityCriterias = new Vector();

		Iterator it = aGuideline.listEligibility_criteria();
		while(it.hasNext()) {

			OWLIndividual lOWLIndividual = ((OWLIndividual)it.next());
			lEligibilityCriterias.addElement((this.createIndividual(lOWLIndividual.getProtegeType().getName(),lOWLIndividual.getLocalName())));
		}

		return lEligibilityCriterias;
	}

	public Vector<Object> getDecisionOptions(Decision_Step aDecisionStep) {

		Vector<Object> lDecisionOptions = new Vector<Object>();

		Iterator it = aDecisionStep.listOptions();
		while(it.hasNext()) {

			OWLIndividual lOWLIndividual = (OWLIndividual) it.next();
			lDecisionOptions.addElement((this.createIndividual(lOWLIndividual.getProtegeType().getName(),lOWLIndividual.getLocalName())));
		}
		return lDecisionOptions;
	}
	
	//ibrahim 23.03.2006
	public Medical_Action_Entity getMedicalActionEntity (Medical_Action_Entity input) {
		
		Medical_Action_Entity maEntity;
		OWLIndividual lOWLIndividual = (OWLIndividual) input;
		
		Object obj = this.createIndividual(lOWLIndividual.getProtegeType().getName(),lOWLIndividual.getLocalName());
		Logger.getLogger(this.getClass()).log(Level.DEBUG, (obj.getClass().getName()));
		maEntity = (Medical_Action_Entity) obj;
		
		return maEntity;
	}
	
	public Vector getBranches(Branch_Step aBranchStep) {

		Vector lBranches = new Vector();

		Iterator it = aBranchStep.listBranches();
		while(it.hasNext()) {

			OWLIndividual lOWLIndividual = (OWLIndividual) it.next();
			lBranches.addElement((this.createIndividual(lOWLIndividual.getProtegeType().getName(),lOWLIndividual.getLocalName())));
		}
		return lBranches;
	}

	// findMethodIndex(Class, String) simply finds a specific method's index in the Class declaration
	// This method can be useful for processing dynamically loaded classes
    public static int findMethodIndex(Class aClass, String aMethodName) {

		Method[] lMethods = aClass.getMethods();
		int index;
		for(index=0; index<lMethods.length; index++) {
            if(lMethods[index].getName().equals(aMethodName))
				break;
		}
        if(index==lMethods.length)
            return -1;
        return index;
	}
/////22.03.2006 ibrahim
	public Vector getActionTasks(Action_Step actionStep) {
		Vector tasksList = new Vector();
		Iterator it = actionStep.listTasks();
		try {
		while(it.hasNext()) {
			OWLIndividual lOWLIndividual = ((OWLIndividual)it.next());
			tasksList.addElement((this.createIndividual(lOWLIndividual.getProtegeType().getName(),lOWLIndividual.getLocalName())));
		}
		}
		catch(Exception exc) {
			exc.printStackTrace();
		}
		return tasksList;
	}
	
	public Guideline_Step getStep(Guideline_Step input ) {
		
		OWLIndividual lOWLIndividual = (OWLIndividual) input;
		try {
		Object obj = this.createIndividual(lOWLIndividual.getProtegeType().getName(),lOWLIndividual.getLocalName());
		
		return (Guideline_Step) obj ;
	
		}
		catch(Exception exc) {
			exc.printStackTrace();
			return null;
		}
		
	}
	
//////////// 27.03.06 ibrahim
/* types of dataEntities can only be determined via instance factory, 
 * the method below retrieves the  type of a DefaultData_Entity, utilizing OWLi nstance
 * 
 */
	public Data_Entity getEntity(Data_Entity inputDataEntity) {
		
		OWLIndividual lOWLIndividual = (OWLIndividual) inputDataEntity;
		try {
		Object obj = this.createIndividual(lOWLIndividual.getProtegeType().getName(),lOWLIndividual.getLocalName());
		
		return (Data_Entity) obj ;
		}
		catch(Exception exc) {
			exc.printStackTrace();
			return null;
		}
		
	}

	// 04/04/2006 [ts]
	public Vector getDataItems(Data_Item_List dataItemList) {
		
		Vector dataItems = new Vector();
		
		if (dataItemList == null) {
			return null;
		
		}
		try {
		
			
		Iterator it = dataItemList.listEntry_array();
		while(it.hasNext()) {
			OWLIndividual lOWLIndividual = ((OWLIndividual)it.next());
			dataItems.addElement((Data_Item) (this.createIndividual(lOWLIndividual.getProtegeType().getName(),lOWLIndividual.getLocalName())));
		
		}
		return dataItems;
		
		}
		catch(Exception exc) {
			exc.printStackTrace();
		}
		return null;
	}
	

	public Object getDataItemValue(Data_Item dataItem) {
		
		OWLIndividual lOWLIndividual = (OWLIndividual) dataItem.getData_value();
		
		try {
			//ERDEM TRACE
			if(this == null){
				System.out.println("this = null");
			}else if(lOWLIndividual == null){
				System.out.println("lOWLIndividual = null");
			}else if(lOWLIndividual.getProtegeType() == null){
				System.out.println("lOWLIndividual.getProtegeType = null");
			}
		Object obj = this.createIndividual(lOWLIndividual.getProtegeType().getName(),lOWLIndividual.getLocalName());
		
		return obj ;
		}
		catch(Exception exc) {
			exc.printStackTrace();
			return null;
		}
	}
	// mustafa 30.03.2006
	// types of Nestables can only be got via InstanceFactory.
	public Nestable getNestable(Nestable inputNestable) {
		
		OWLIndividual lOWLIndividual = (OWLIndividual) inputNestable;
		
		try{
			Object obj = this.createIndividual(lOWLIndividual.getProtegeType().getName(),lOWLIndividual.getLocalName());
			return (Nestable) obj;
		}
		catch(Exception ex){
			ex.printStackTrace();
			return null;
		}
		
	}
	// 20.04.06 [itasyurt]
	/// do not confuse with !!!!!!!!!"Get_Data_Action "
	/// gets the instance of a data item
	public Data_Item getDataItem(Data_Item inputDataItem ) {
		try{
			OWLIndividual lOWLIndividual = (OWLIndividual) inputDataItem;
			
			Object obj = this.createIndividual(lOWLIndividual.getProtegeType().getName(),lOWLIndividual.getLocalName());
			return (Data_Item) obj;
		}
		catch(Exception ex){
			ex.printStackTrace();
			return null;
		}
		
	 
	}
	
	public Observation_Value getObservationValue (Observation_Value input ) {
		try{
            Object obj = this.createIndividual(input.getProtegeType().getName(), input.getLocalName());
            return (Observation_Value) obj;
		}
		catch(Exception ex){
			ex.printStackTrace();
			return null;
		}
		
	}

	public String getDisplayName(String uniqueName) {
		// TODO Auto-generated method stub

        OWLNamedClass aClass;
        aClass = mOWLModel.getOWLNamedClass("Action_Specification");
        for (Object o : aClass.getInstances(true)) {
            try {
                if(o instanceof Action_Specification){
                    Action_Specification individual = (Action_Specification) o;
                    if(individual.getName().equals(uniqueName)) {
                        return  individual.getName2();
                    }
                }
            }
            catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
		return null;
	}

	public Case_Condition getObservationValue(Decision_Option option) {
		try{
			OWLIndividual lOWLIndividual = (OWLIndividual) option.getCondition_value();

			Object obj = this.createIndividual(lOWLIndividual.getProtegeType().getName(),lOWLIndividual.getLocalName());
			return (Case_Condition) obj;
		}
		catch(Exception ex){
			ex.printStackTrace();
			return null;
		}
	}

	public Guideline_Expression getConditionValue(Guideline_Expression expr) {
		try{
			OWLIndividual lOWLIndividual = (OWLIndividual) expr;
			
			Object obj = this.createIndividual(lOWLIndividual.getProtegeType().getName(),lOWLIndividual.getLocalName());
			
			return (Guideline_Expression) obj;
		}
		catch(Exception ex){
			ex.printStackTrace();
			return null;
		}
		
	}


}


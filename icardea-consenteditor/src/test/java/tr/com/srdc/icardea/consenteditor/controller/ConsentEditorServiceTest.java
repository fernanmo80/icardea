/**
 * 
 */
package tr.com.srdc.icardea.consenteditor.controller;

import static org.junit.Assert.fail;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import tr.com.srdc.icardea.consenteditor.controller.message.ConsentDocumentRequest;
import tr.com.srdc.icardea.consenteditor.controller.message.ConsentDocumentResponse;
import tr.com.srdc.icardea.consenteditor.controller.message.GeneralConsentRequest;
import tr.com.srdc.icardea.consenteditor.controller.message.MyListResponse;
import tr.com.srdc.icardea.consenteditor.controller.message.PatientIDRequest;
import tr.com.srdc.icardea.consenteditor.controller.message.PatientIDResponse;
import tr.com.srdc.icardea.consenteditor.controller.message.RegisterConsentDocumentRequest;
import tr.com.srdc.icardea.consenteditor.controller.message.ResourceListResponse;
import tr.com.srdc.icardea.consenteditor.controller.message.SubjectListResponse;
import tr.com.srdc.icardea.consenteditor.model.ConsentDocument;
import tr.com.srdc.icardea.consenteditor.model.ConsentDocumentMetaDataType;

/**
 * @author erdem
 *
 */
public class ConsentEditorServiceTest {
	
	public static Logger logger = Logger.getLogger(ConsentEditorService.class);
	static ConsentEditorService ces;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ces = new ConsentEditorService();		
	}

	/**
	 * Test method for {@link tr.com.srdc.icardea.consenteditor.controller.ConsentEditorService#ConsentEditorService()}.
	 */
	@Test
	public void testConsentEditorService() {		
		if(ces == null){
			fail("Consent Editor could not be created.");
		}
	}

	
	/**
	 * Test method for {@link tr.com.srdc.icardea.consenteditor.controller.ConsentEditorService#getPatientID(tr.com.srdc.icardea.consenteditor.controller.message.PatientIDRequest)}.
	 */
	@Test
	public void testGetPatientID() {		
		PatientIDRequest pidRequest = new PatientIDRequest();
		PatientIDResponse pidResponse = ces.getPatientID(pidRequest);		
		String patientId = pidResponse.getPatientID();
		
		if(patientId == null){
			fail("Could not get the patient id of the current user");
		}
	}
	
	/**
	 * Test method for {@link tr.com.srdc.icardea.consenteditor.controller.ConsentEditorService#registerConsentDocument(tr.com.srdc.icardea.consenteditor.controller.message.RegisterConsentDocumentRequest)}.
	 */
	@Test
	public void testRegisterConsentDocument() {
		try{
		
		RegisterConsentDocumentRequest rcdr = new RegisterConsentDocumentRequest();

		ConsentDocument cd = new ConsentDocument();
		
		ConsentDocumentMetaDataType cdmd = new ConsentDocumentMetaDataType();
		cdmd.setPatientId("f");
		cdmd.setDefinition("Test 1");
		
		cd.setId("12345");
		cd.setConsentDocumentMetaData(cdmd);
		
		rcdr.setConsentDocument(cd);
		ces.registerConsentDocument(rcdr);
		ConsentDocument cd2 = new ConsentDocument();
		
		ConsentDocumentMetaDataType cdmd2 = new ConsentDocumentMetaDataType();
		cdmd2.setPatientId("f");
		cdmd2.setDefinition("Test 2");
		
		cd2.setId("54321");
		cd2.setConsentDocumentMetaData(cdmd2);
		
		rcdr.setConsentDocument(cd2);
				
		ces.registerConsentDocument(rcdr);
		}catch (Exception ex){
			fail("Could not save the consent document");
		}
	}
	
	/**
	 * Test method for {@link tr.com.srdc.icardea.consenteditor.controller.ConsentEditorService#getCurrentConsentDocumentByPatientId(tr.com.srdc.icardea.consenteditor.controller.message.ConsentDocumentRequest)}.
	 */
	@Test
	public void testGetCurrentConsentDocumentByPatientId() {
		ConsentDocumentRequest cdr = new ConsentDocumentRequest();
		cdr.setPatientID("f");
		ConsentDocumentResponse cdre = ces.getCurrentConsentDocumentByPatientId(cdr);		
		assert(cdre.getConsentDocuments().get(0).getId().equals("54321"));
	}
	
	/**
	 * Test method for {@link tr.com.srdc.icardea.consenteditor.controller.ConsentEditorService#getConsentDocuments(tr.com.srdc.icardea.consenteditor.controller.message.ConsentDocumentRequest)}.
	 */
	@Test
	public void testGetConsentDocuments() {
		ConsentDocumentRequest cdr = new ConsentDocumentRequest();
		cdr.setPatientID("f");
		ConsentDocumentResponse cdre = ces.getConsentDocuments(cdr);
		logger.info("CD Size:" + cdre.getConsentDocuments().size());
		assert(cdre.getConsentDocuments().size() == 2);
	}
	
	/**
	 * Test method for {@link tr.com.srdc.icardea.consenteditor.controller.ConsentEditorService#setCurrentConsentDocumentOfPatient(tr.com.srdc.icardea.consenteditor.controller.message.GeneralConsentRequest)}.
	 */
	@Test
	public void testSetCurrentConsentDocumentOfPatient() {
		GeneralConsentRequest gcr = new GeneralConsentRequest();
		gcr.setPatientID("f");
		gcr.setConsentID("12345");
		ces.setCurrentConsentDocumentOfPatient(gcr);
		
		ConsentDocumentRequest cdr = new ConsentDocumentRequest();
		cdr.setPatientID("f");
		ConsentDocumentResponse cdre = ces.getCurrentConsentDocumentByPatientId(cdr);
		assert(cdre.getConsentDocuments().get(0).getId().equals("12345"));
	}

	/**
	 * Test method for {@link tr.com.srdc.icardea.consenteditor.controller.ConsentEditorService#deleteConsentDocument(tr.com.srdc.icardea.consenteditor.controller.message.GeneralConsentRequest)}.
	 */
	@Test
	public void testDeleteConsentDocument() {
		GeneralConsentRequest gcr = new GeneralConsentRequest();
		gcr.setConsentID("12345");
		ces.deleteConsentDocument(gcr);
		
		ConsentDocumentRequest cdr = new ConsentDocumentRequest();
		cdr.setPatientID("f");
		ConsentDocumentResponse cdre = ces.getConsentDocuments(cdr);
		assert(cdre.getConsentDocuments().size() == 1);
		
		GeneralConsentRequest gcr2 = new GeneralConsentRequest();
		gcr2.setConsentID("54321");
		ces.deleteConsentDocument(gcr2);
		
		ConsentDocumentRequest cdr2 = new ConsentDocumentRequest();
		cdr2.setPatientID("f");
		ConsentDocumentResponse cdre2 = ces.getConsentDocuments(cdr2);
		assert(cdre2.getConsentDocuments().size() == 0);
	}

	/**
	 * Test method for {@link tr.com.srdc.icardea.consenteditor.controller.ConsentEditorService#getResourceList(tr.com.srdc.icardea.consenteditor.controller.message.GeneralConsentRequest)}.
	 */
	@Test
	public void testGetResourceList() {
		GeneralConsentRequest gcr = new GeneralConsentRequest();
		gcr.setPatientID("e");
		ResourceListResponse rlr = ces.getResourceList(gcr);
		assert(rlr.getTempList() != null);
	}

	/**
	 * Test method for {@link tr.com.srdc.icardea.consenteditor.controller.ConsentEditorService#getSubjectList(tr.com.srdc.icardea.consenteditor.controller.message.GeneralConsentRequest)}.
	 */
	@Test
	public void testGetSubjectList() {
		GeneralConsentRequest gcr = new GeneralConsentRequest();
		gcr.setPatientID("e");
		SubjectListResponse slr = ces.getSubjectList(gcr);
		assert(slr.getTempList() != null);
	}

	/**
	 * Test method for {@link tr.com.srdc.icardea.consenteditor.controller.ConsentEditorService#getActionList(tr.com.srdc.icardea.consenteditor.controller.message.GeneralConsentRequest)}.
	 */
	@Test
	public void testGetActionList() {
		GeneralConsentRequest gcr = new GeneralConsentRequest();
		gcr.setPatientID("e");
		MyListResponse mlr = ces.getActionList(gcr);
		assert(mlr.getTempList() != null);
	}

}

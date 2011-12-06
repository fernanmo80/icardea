package tr.com.srdc.icardea.careplaneditor;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import tr.com.srdc.icardea.platform.model.Patient;
import tr.com.srdc.icardea.platform.model.careplan.MedicalCareplan;
import tr.com.srdc.icardea.platform.service.CareplanRepositoryService;
import tr.com.srdc.icardea.platform.service.DummyPatientSubscriptionServiceImp;
import tr.com.srdc.icardea.platform.service.PatientSubscriptionService;
import tr.com.srdc.icardea.platform.service.dummy.DummyCareplanRepositoryServiceImpl;

/**
 * 
 */

/**
 * @author eliferylmz
 *
 */
public class CareplanEditorTest {

	public static Logger logger = Logger.getLogger(PatientSubscriptionService.class);
	static PatientSubscriptionService pss;
	static CareplanRepositoryService crs;
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		pss = new DummyPatientSubscriptionServiceImp();
		crs = new DummyCareplanRepositoryServiceImpl();
	}
	@Test
	public void testPatientSubscriptionService() {		
		if(pss == null){
			fail("Patient Subscription Service could not be created.");
		}
	}
	@Test
	public void testCareplanRepositoryService() {		
		if(crs == null){
			fail("Careplan Repository Service could not be created.");
		}
	}
	
//	@Test
//	public void testRegisterPatient() {
//		ArrayList<String> ids=new ArrayList<String>();
//		Patient p = new Patient("2345678", "Andreas", "Schmidt", "03/11/1953","Male","Sudden Death",ids);
//		try{
//			pss.registerPatient(p);
//		}catch (Exception ex){
//			fail("Could not register the patient");
//		}
//	}
	
//	@Test
//	public void testListRegisteredPatients() {
//		if( pss.listRegisteredPatients() == null){
//			fail("Could not list the registered patient");
//		}
//	}
	
//	@Test
//	public void testListGuidelines() {
//		ArrayList<String> ids=new ArrayList<String>();
//		Patient p = new Patient("2345678", "Andreas", "Schmidt", "03/11/1953","Male","Sudden Death",ids);
//		if( pss.listGuidelines(p) == null){
//			fail("Could not list the guidelines");
//		}
//	}
	
//	@Test
//	public void testListCareplans(){
//		if( crs.listCareplans() == null){
//			fail("Could not list the careplans");
//		}
//	}
	
//	@Test
//	public void testCreateCareplan(){
//		MedicalCareplan careplan = new MedicalCareplan();
//		List<MedicalCareplan> careplans = crs.createCareplan(careplan);
//		if (!careplans.contains(careplan)) {
//			fail("Could not create the careplan");
//		}
//		
//	}
	
//	@Test
//	public void testUpdateCareplan(){
//		MedicalCareplan careplan = new MedicalCareplan();
//		List<MedicalCareplan> careplans = crs.updateCareplan(careplan);
//		if (!careplans.contains(careplan)) {
//			fail("Could not update the careplan");
//		}
//	}
	
//	@Test
//	public void testDeleteCareplan(){
//		MedicalCareplan careplan = new MedicalCareplan();
//		List<MedicalCareplan> careplans = crs.deleteCareplan(careplan);
//		if (careplans.contains(careplan)) {
//			fail("Could not delete the careplan");
//		}
//	}
	

	/**
	 * @throws java.lang.Exception
	 */
//	@AfterClass
//	public static void tearDownAfterClass() throws Exception {
//	}

	/**
	 * @throws java.lang.Exception
	 */
//	@Before
//	public void setUp() throws Exception {
//	}
//
//	/**
//	 * @throws java.lang.Exception
//	 */
//	@After
//	public void tearDown() throws Exception {
//	}

}
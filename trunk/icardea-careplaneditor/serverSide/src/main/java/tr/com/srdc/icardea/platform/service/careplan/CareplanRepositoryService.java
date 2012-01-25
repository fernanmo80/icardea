package tr.com.srdc.icardea.platform.service.careplan;

import java.util.List;

import tr.com.srdc.icardea.platform.model.careplan.MedicalCareplan;

/**
 * Consider using Hibernate Pojo s as remote function call arguments and return values.
 * 
 * TODO Actual instance of {@link MedicalCareplan} is not required other than create/update methods.
 * Consider replacing {@link MedicalCareplan} arguments by IDs.
 * 
 * TODO any update results in retrieval of full careplan list. Find a way in Flex to remove this necessity.
 * 
 * @author cihancimen
 *
 */
public interface CareplanRepositoryService {

	List<MedicalCareplan> listCareplans();
	
	List<MedicalCareplan> createCareplan(MedicalCareplan careplan);
	
	/**
	 * This method can be used when properties other than id is changed.
	 * So there is no explicit update methods defined(e.g. setStatus()).
	 * @param careplan Updated careplan.
	 */
	List<MedicalCareplan> updateCareplan(MedicalCareplan careplan);
	
	List<MedicalCareplan> deleteCareplan(MedicalCareplan careplan);
	
	
//	void assignHealthcareActor(MedicalCareplan careplan);
	
	
}

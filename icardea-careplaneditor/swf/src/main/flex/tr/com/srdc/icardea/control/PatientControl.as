package tr.com.srdc.icardea.control
{
	import tr.com.srdc.icardea.model.userRoles.Patient;
	
	
	
	public interface PatientControl
	{
		function listRegisteredPatients():void;
		function createPatient(patient:Patient):void;
		function updatePatient(patient:Patient):void;
		function deletePatient(patient:Patient):void;
	}
}
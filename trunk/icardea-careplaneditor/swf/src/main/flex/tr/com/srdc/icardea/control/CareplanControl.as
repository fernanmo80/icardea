package tr.com.srdc.icardea.control
{
	import tr.com.srdc.icardea.model.careplan.MedicalCareplan;
	
	public interface CareplanControl
	{
		function listCareplans():void;
		function createCareplan(careplan:MedicalCareplan):void;
		function updateCareplan(careplan:MedicalCareplan):void;
		function deleteCareplan(careplan:MedicalCareplan):void;
	}
}
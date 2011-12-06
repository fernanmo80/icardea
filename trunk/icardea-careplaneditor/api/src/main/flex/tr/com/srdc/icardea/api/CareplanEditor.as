package tr.com.srdc.icardea.api
{
	//import CareManagementDBInterface;
	import mx.collections.ArrayCollection;

	public class CareplanEditor 
	{
		/*FIXME There are some commented variables. They are of types that are not yet defined*/
		//public var _controller:CareplanEditorGUI;
		public var _repositoryInterface:MCPRepositoryInterface;
		//public var _patientService:HISPatientServiceInterface;
		//public var _patientMonitor:PatientParameterMonitorInterface;
		//public var _clinicalDataSource:CareManagementDBInterface;

		public function constructTemplate():MedicalCareplanTemplate
		{
			// Not yet implemented
		return null;
		}

		public function validateTemplate(MedicalCareplanTemplate):void
		{
			// Not yet implemented
		}

		public function askForApproval():void
		{
			// Not yet implemented
		}

		public function retrieveTemplates(aCriteria:String):ArrayCollection
		{
			// Not yet implemented
		return null;
		}

		public function modifyTemplate():MedicalCareplanTemplate
		{
			// Not yet implemented
		return null;
		}

		public function approveTemplate(aApprove:Boolean, aMcpID:String):void
		{
			// Not yet implemented
		}

		public function retrievePatients(aCriteria:String):ArrayCollection
		{
			// Not yet implemented
		return null;
		}

		public function linkEHREndpoint():void
		{
			// Not yet implemented
		}

		public function linkPHREndpoint():void
		{
			// Not yet implemented
		}

		public function linkCIEDEndpoint():void
		{
			// Not yet implemented
		}

		public function retrievePatientData(aPatientIdentifier:String):Patient
		{
			// Not yet implemented
		return null;
		}

		public function constructPMCP():void
		{
			// Not yet implemented
		}

		public function validatePMCP():void
		{
			// Not yet implemented
		}

		public function retrievePMCPs(aPatientIdentifier:String):ArrayCollection
		{
			// Not yet implemented
		return null;
		}

		public function finalizePMCP(aPmcpid:String):void
		{
			// Not yet implemented
		}
	}
}
package tr.com.srdc.icardea.api
{
	import mx.collections.ArrayCollection;
	
	public class MCPRepository 
	{
		public var _controller:MCPRepositoryInterface;

		public function addTemplate(aTemplate:MedicalCareplanTemplate):void
		{
			// Not yet implemented
		}

		public function retrieveTemplates(aCriteria:String):ArrayCollection
		{
			// Not yet implemented
		return null;
		}

		public function approveTemplate(aApprove:Boolean):void
		{
			// Not yet implemented
		}

		public function addPMCP(PersonalizedMedicalCareplan):void
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

		public function assignHealthcareActorToPatient(aAssignment:PatientHealthcareActorAssignment):void
		{
			// Not yet implemented
		}

		public function updatePMCPConfiguration(PersonalizedMedicalCareplan):void
		{
			// Not yet implemented
		}

		public function addPMCPInstance(PersonalizedMedicalCareplanInstance):void
		{
			// Not yet implemented
		}

		public function retrievePMCPInstances(aCriteria:String):ArrayCollection
		{
			// Not yet implemented
		return null;
		}
	}
}
package tr.com.srdc.icardea.api
{
	//import AlarmManager;
	import mx.collections.ArrayCollection;
	import mx.controls.Alert;
	import mx.messaging.Channel;
	import mx.messaging.ChannelSet;
	import mx.messaging.channels.AMFChannel;
	import mx.rpc.events.FaultEvent;
	import mx.rpc.events.ResultEvent;
	import mx.rpc.remoting.RemoteObject;
	
	public class MCPRepositoryInterface
	{
		public var _repositoryInterface:CareplanEditor;
		//public var _repository:AlarmManager;
		public var _controller:MCPRepository;
		private var patientDAO:RemoteObject;
		private var careplanDAO:RemoteObject;
		private var personalizedCareplanDAO:RemoteObject;
		
		[Bindable]
		public var templates:ArrayCollection;
		
		public function MCPRepositoryInterface(){
			patientDAO = new RemoteObject("patientDAO");
			var cs:ChannelSet = new ChannelSet();
			var customChannel:Channel = new AMFChannel("my-amf","/careplan-repo/messagebroker/amf");
			cs.addChannel(customChannel);
			patientDAO.channelSet = cs;
			patientDAO.addEventListener("fault", onFaultEvent);
			
			careplanDAO = new RemoteObject("medicalcareplantemplateDAO");
			var cs:ChannelSet = new ChannelSet();
			var customChannel:Channel = new AMFChannel("my-amf","/careplan-repo/messagebroker/amf");
			cs.addChannel(customChannel);
			careplanDAO.channelSet = cs;
			careplanDAO.addEventListener("fault", onFaultEvent);
			
			personalizedCareplanDAO = new RemoteObject("personalizedmedicalcareplanDAO");
			var cs:ChannelSet = new ChannelSet();
			var customChannel:Channel = new AMFChannel("my-amf","/careplan-repo/messagebroker/amf");
			cs.addChannel(customChannel);
			personalizedCareplanDAO.channelSet = cs;
			personalizedCareplanDAO.addEventListener("fault", onFaultEvent);
		}

		public function addTemplate(template:MedicalCareplanTemplate):void
		{
			careplanDAO.addEventListener("result", addTemplateResult);
			careplanDAO.save(template);
		}

		public function retrieveTemplates(aCriteria:String):void
		{
			careplanDAO.addEventListener("result", retrieveTemplateResult);
			careplanDAO.findAll();
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
		
		private function onFaultEvent(event:FaultEvent):void{
			Alert.show(event.fault.message, "Error");
		}
		
		private function retrieveTemplateResult(event:ResultEvent):void{
			this.templates = event.result as ArrayCollection
			careplanDAO.removeEventListener("result", retrieveTemplateResult);  
		}
		
		private function addTemplateResult(event:ResultEvent):void{
			careplanDAO.removeEventListener("result", addTemplateResult);
			//retrieve templates
			retrieveTemplates(null);  
		}
	}
}
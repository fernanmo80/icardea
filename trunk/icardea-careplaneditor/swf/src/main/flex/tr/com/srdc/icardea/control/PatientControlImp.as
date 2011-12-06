package tr.com.srdc.icardea.control
{
	import mx.collections.ArrayCollection;
	import mx.controls.Alert;
	import mx.messaging.Channel;
	import mx.messaging.ChannelSet;
	import mx.messaging.channels.SecureAMFChannel;
	import mx.rpc.events.FaultEvent;
	import mx.rpc.events.ResultEvent;
	import mx.rpc.remoting.RemoteObject;
	
	import tr.com.srdc.icardea.model.userRoles.Patient;
	import tr.com.srdc.icardea.patient.PatientModel;
	
	
	
	public class PatientControlImp implements PatientControl
	{
		[Bindable]
		private var model:PatientModel;
		private static var USER_SERVICE:String = 'subscriptionService';
		
		public function PatientControlImp(model:PatientModel)
		{
			this.model = model;
			
			//Init remote object
			
			
		}
		
		//FIXME At request this object is re-initialized is this really necessary.
		// Service initialization
		private function getUserService() : RemoteObject {
			var service : RemoteObject = new RemoteObject(USER_SERVICE);
			var cs:ChannelSet = new ChannelSet();
			var customChannel:Channel = new SecureAMFChannel("my-amf","/icardea_careplaneditor/messagebroker/amf");
			cs.addChannel(customChannel);
			service.channelSet = cs;
			service.addEventListener("fault", handleFault);
			return service;
		}

		public function createPatient(patient:Patient):void{
			var service:RemoteObject  = getUserService();
			service.addEventListener(ResultEvent.RESULT, createPatientResult);
			service.addEventListener(FaultEvent.FAULT, handleFault);
			service.createPatient(patient);
		}
		
		public function updatePatient(patient:Patient):void{
			var service:RemoteObject  = getUserService();
			service.addEventListener(ResultEvent.RESULT, updatePatientResult);
			service.addEventListener(FaultEvent.FAULT, handleFault);
			service.updatePatient(patient);
		}
		
		public function listRegisteredPatients():void{
			var service:RemoteObject  = getUserService();
			service.addEventListener(ResultEvent.RESULT, listPatientsResult);
			service.addEventListener(FaultEvent.FAULT, handleFault);
			service.listRegisteredPatients();
		}
		
		public function deletePatient(patient:Patient):void{
			var service:RemoteObject  = getUserService();
			service.addEventListener(ResultEvent.RESULT, deletePatientResult);
			service.addEventListener(FaultEvent.FAULT, handleFault);
			service.deletePatient(patient);
		}
		
		
		//Result handlers
		public function listPatientsResult(event:ResultEvent):void{
			model.patients = event.result as ArrayCollection;
		}
		
		public function createPatientResult(event:ResultEvent):void{
			model.patients = event.result as ArrayCollection;
			Alert.show("Patient successfully created.","Creation Successful");
		}
		
		public function deletePatientResult(event:ResultEvent):void{
			model.patients = event.result as ArrayCollection;
			Alert.show("Patient successfully deleted.","Deletion Successful");
		}

		public function updatePatientResult(event:ResultEvent):void{
			model.patients = event.result as ArrayCollection;
			Alert.show("Patient successfully updated.","Update Successful");
		}
		
		//Fault Handlers
		public function handleFault(event:FaultEvent):void{
			Alert.show(event.fault.name +"\n" + event.fault.message, "Error");
		}
		

	}
}
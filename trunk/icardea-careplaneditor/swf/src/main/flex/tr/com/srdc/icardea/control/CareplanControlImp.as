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
	
	import tr.com.srdc.icardea.careplan.CareplanModel;
	import tr.com.srdc.icardea.model.careplan.MedicalCareplan;
	
	public class CareplanControlImp implements CareplanControl
	{
		[Bindable]
		private var model:CareplanModel;
		private static var USER_SERVICE:String = 'careplanService';
		
		public function CareplanControlImp(model:CareplanModel)
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

		public function createCareplan(careplan:MedicalCareplan):void{
			var service:RemoteObject  = getUserService();
			service.addEventListener(ResultEvent.RESULT, createCareplanResult);
			service.addEventListener(FaultEvent.FAULT, handleFault);
			service.createCareplan(careplan);
		}
		
		public function updateCareplan(careplan:MedicalCareplan):void{
			var service:RemoteObject  = getUserService();
			service.addEventListener(ResultEvent.RESULT, updateCareplanResult);
			service.addEventListener(FaultEvent.FAULT, handleFault);
			service.updateCareplan(careplan);
		}
		
		public function listCareplans():void{
			var service:RemoteObject  = getUserService();
			service.addEventListener(ResultEvent.RESULT, listCareplansResult);
			service.addEventListener(FaultEvent.FAULT, handleFault);
			service.listCareplans();
		}
		
		public function deleteCareplan(careplan:MedicalCareplan):void{
			var service:RemoteObject  = getUserService();
			service.addEventListener(ResultEvent.RESULT, deleteCareplanResult);
			service.addEventListener(FaultEvent.FAULT, handleFault);
			service.deleteCareplan(careplan);
		}
		
		
		//Result handlers
		public function listCareplansResult(event:ResultEvent):void{
			model.careplans = event.result as ArrayCollection;
		}
		
		public function createCareplanResult(event:ResultEvent):void{
			model.careplans = event.result as ArrayCollection;
			Alert.show("Careplan successfully created.","Creation Successful");
		}
		
		public function deleteCareplanResult(event:ResultEvent):void{
			model.careplans = event.result as ArrayCollection;
			Alert.show("Careplan successfully deleted.","Deletion Successful");
		}

		public function updateCareplanResult(event:ResultEvent):void{
			model.careplans = event.result as ArrayCollection;
			Alert.show("Careplan successfully updated.","Update Successful");
		}
		
		//Fault Handlers
		public function handleFault(event:FaultEvent):void{
			Alert.show(event.fault.name +"\n" + event.fault.message, "Error");
		}
		

	}
}
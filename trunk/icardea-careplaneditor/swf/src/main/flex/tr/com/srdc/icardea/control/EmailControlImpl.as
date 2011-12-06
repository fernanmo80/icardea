package tr.com.srdc.icardea.control
{
	import mx.controls.Alert;
	import mx.messaging.Channel;
	import mx.messaging.ChannelSet;
	import mx.messaging.channels.SecureAMFChannel;
	import mx.rpc.events.FaultEvent;
	import mx.rpc.events.ResultEvent;
	import mx.rpc.remoting.RemoteObject;
	
	import tr.com.srdc.icardea.model.userRoles.Person;
	
	public class EmailControlImpl implements EmailControl
	{
		private var service : RemoteObject;
		public static const EMAIL_SERVICE : String = "emailService";
		
		public function EmailControlImpl()
		{
			service = getEmailService();
		}
		
		// Service initialization
		private function getEmailService() : RemoteObject {
			var service : RemoteObject = new RemoteObject(EMAIL_SERVICE);
			var cs:ChannelSet = new ChannelSet();
			var customChannel:Channel = new SecureAMFChannel("my-amf","/icardea_careplaneditor/messagebroker/amf");
			cs.addChannel(customChannel);
			service.channelSet = cs;
			service.addEventListener("fault", handleFault);
			return service;
		}
		
		//Implemented Service Methods
		public function sendEmail(person:Person):void{
			service.addEventListener("result", sendEmailResult);
			service.sendEmail(person);
		}
		
		//Handlers of service methods
		private function sendEmailResult(event:ResultEvent):void{
			Alert.show("Mail Sent to the user");
		}
		private function handleFault(event:FaultEvent, token:Object = null):void{
			Alert.show(event.fault.message);
		}	

	}
}
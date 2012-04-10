package tr.com.srdc.icardea.control
{
	import mx.collections.ArrayCollection;
	import mx.controls.Alert;
	import mx.messaging.Channel;
	import mx.messaging.ChannelSet;
	import mx.messaging.channels.SecureAMFChannel;
	import mx.rpc.AsyncResponder;
	import mx.rpc.AsyncToken;
	import mx.rpc.events.FaultEvent;
	import mx.rpc.events.ResultEvent;
	import mx.rpc.remoting.RemoteObject;
	
	import tr.com.srdc.icardea.events.LoginEvent;
	import tr.com.srdc.icardea.model.userControl.Model;
	import tr.com.srdc.icardea.model.userControl.ModelImpl;
	import tr.com.srdc.icardea.model.userRoles.Person;

	public class UserControlImpl implements UserControl
	{
		private var model : Model;
		private var view : iCardea;
		public static const USER_SERVICE : String = "subscriptionService";
		private const BAD_CREDENTIALS : String = "Invalid Username or Password";
		
		//Constructor
		public function UserControlImpl(userModel : Model, view : iCardea){
			model = userModel;			
			this.view = view;
			view.addEventListener(LoginEvent.LOGIN_EVENT, sendLoginRequest);
			//service.doLogout();
		}
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
		
		public function doLogout():void {
			var service : RemoteObject = getUserService();
			service.addEventListener("result", logoutResult);
			service.doLogout();
		}
		
		
		//Implemented Service Methods
		public function addPerson(person:Person) : void{
			var service : RemoteObject = getUserService();
			service.addEventListener("result", addPersonResult);
			service.addEventListener("fault", handleFault2);
			service.addPerson(person);
		}
		public function updatePerson(person:Person) : void{
			var service : RemoteObject = getUserService();
			service.addEventListener("result", updatePersonResult);
			service.updatePerson(person);
		}
		public function getPersons() : void{
			var service : RemoteObject = getUserService();
			service.addEventListener("result", getPersonsResult);
			service.getPersons();
		}
		public function getPersonByUsername(username:String) : void{
			var service : RemoteObject = getUserService();
			service.addEventListener("result", getPersonByUsernameResult);
			service.getPersonByUsername(username);
		}
		public function removePersonByUsername(username:String) : void{
			var service : RemoteObject = getUserService();
			service.addEventListener("result", removePersonByUsernameResult);
			service.removePersonByUsername(username);
		}
		
		//Handlers of service methods
		private function addPersonResult(event:ResultEvent):void{
			model.usersCollection = event.result as ArrayCollection;
		}
		private function getPersonsResult(event:ResultEvent):void{
			model.usersCollection = event.result as ArrayCollection;
		}
		private function getPersonByUsernameResult(event:ResultEvent):void{
			model.authenticatedUser = event.result as Person;			
		}
		private function updatePersonResult(event:ResultEvent):void{
			model.authenticatedUser = event.result as Person;
			Alert.show("User updated");
		}
		private function removePersonByUsernameResult(event:ResultEvent):void{
			model.usersCollection = event.result as ArrayCollection;
		}
		private function logoutResult(event:ResultEvent):void {
			model.isAdmin = false;
			
			model.workFlowState = ModelImpl.WINDOW_LOGIN_FORM;
			Alert.show("You have successfully logged out!");
		}
		 
		private function sendLoginRequest(event:LoginEvent) : void{
			var service : RemoteObject = getUserService();
			var token : AsyncToken = service.channelSet.login(event.person.username, event.person.password);
			token.addResponder(new AsyncResponder(getLoginResult, handleFault));
			model.currentUsername = event.person.username;
		}
		
		private function getLoginResult(event:ResultEvent, token:Object = null):void{
			model.roles = new ArrayCollection(event.result.authorities);
			if(event.result.authorities.indexOf(ModelImpl.ROLE_ADMIN) >= 0) {
				model.workFlowState = ModelImpl.WINDOW_LIST_USERS;
				//view.userBar.includeInLayout = true;
				view.authName.text = "Welcome " + model.currentUsername;
				model.isAdmin = true;
				getPersons();
			} else if(event.result.authorities.indexOf(ModelImpl.ROLE_USERS) >= 0) {
				model.isUser = true;
				//view.userBar.includeInLayout = true;
				view.authName.text = "Welcome " + model.currentUsername;
				model.workFlowState = ModelImpl.WINDOW_USER_FORM;
				getPersonByUsername(model.currentUsername);
				
			
			}else {
				Alert.show(BAD_CREDENTIALS);
			}
		}
		
		public function getOrganizations():void {
			var service : RemoteObject = getUserService();
			service.addEventListener("result", getOrganizationsResult);
			service.getOrganizations();
		}
		
		private function getOrganizationsResult(event:ResultEvent):void {
			model.organizationsList = event.result as ArrayCollection;
		}
		
		
		private function handleFault(event:FaultEvent, token:Object = null):void{
			Alert.show(event.fault.message);
		}
		private function handleFault2(event:FaultEvent, token:Object = null):void{
			Alert.show(event.fault.message + " ozan");
		}		
	}
}
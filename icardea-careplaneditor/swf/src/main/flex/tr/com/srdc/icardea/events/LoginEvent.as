package tr.com.srdc.icardea.events
{
	import flash.events.Event;
	
	import tr.com.srdc.icardea.model.userRoles.Person;
	public class LoginEvent extends Event{
		public static const LOGIN_EVENT : String = "loginEvent";
		public var person : Person;
		
		public function LoginEvent(p:Person){
			super(LOGIN_EVENT, true);
			person = p;
		}
	}
}
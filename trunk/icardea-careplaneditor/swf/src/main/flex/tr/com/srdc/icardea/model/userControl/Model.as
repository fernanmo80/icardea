
package tr.com.srdc.icardea.model.userControl
{
	import flash.events.IEventDispatcher;	
	import mx.collections.ArrayCollection;
	import tr.com.srdc.icardea.model.userRoles.Person;
	
	[Bindable]
	public interface Model extends IEventDispatcher{
		function set organizationsList(organizations : ArrayCollection) : void;
		function get organizationsList() : ArrayCollection;
		function set usersCollection(users : ArrayCollection) : void;
		function get usersCollection() : ArrayCollection;
		function set workFlowState(value : uint) : void;
		function get workFlowState() : uint;
		function set roles(value : ArrayCollection) : void;
		function get roles() : ArrayCollection;
		function set currentUsername(value : String) : void;
		function get currentUsername() : String;
		function set authenticatedUser(value : Person) : void;
		function get authenticatedUser() : Person;
		function set isAdmin(value : Boolean) : void;
		function get isAdmin() : Boolean;
		function set isUser(value : Boolean) : void;
		function get isUser() : Boolean;
		
	}
}



package tr.com.srdc.icardea.model.userControl
{

	
	import flash.events.Event;
	import flash.events.IEventDispatcher;
	import flash.net.URLLoader;
	
	import mx.collections.ArrayCollection;
	
	
	[Bindable]
	public interface ProfileModel extends IEventDispatcher {

		function set profileLoader(pl : URLLoader) : void;
		function get profileLoader() : URLLoader;
		function set languageData(pl : Object) : void;
		function get languageData() : Object;
		function set profiles(pl : ArrayCollection) : void;
		function get profiles() : ArrayCollection;
		function set numOfProfiles(nop : int) : void;
		function get numOfProfiles() : int;
	}
}


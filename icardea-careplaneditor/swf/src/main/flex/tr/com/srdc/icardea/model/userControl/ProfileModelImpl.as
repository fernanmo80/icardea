
package icardea.model {

	import flash.events.Event;
	import flash.events.EventDispatcher;
	import flash.net.URLLoader;
	import flash.net.URLRequest;
	
	import mx.collections.ArrayCollection;
	import mx.controls.Alert;
	
	
	[Bindable]
	public class ProfileModelImpl extends EventDispatcher implements ProfileModel {

		private static var instance:ProfileModelImpl;		
		private var _profileLoader:URLLoader;
		private var _languageData:Object;		
		private var _profiles:ArrayCollection;		
		private var _numOfProfiles:int;		
		
		public function set profileLoader(value : URLLoader) : void{
			_profileLoader = value;
		}
		public function get profileLoader() : URLLoader{
			return _profileLoader;
		}
		public function set languageData(value : Object) : void{
			_languageData = value;
		}
		public function get languageData() : Object{
			return _languageData;
		}
		public function set profiles(value : ArrayCollection) : void{
			_profiles = value;
		}
		public function get profiles() : ArrayCollection{
			return _profiles;
		}
		public function set numOfProfiles(value : int) : void{
			_numOfProfiles = value;
		}
		public function get numOfProfiles() : int{
			return _numOfProfiles;
		}
		
		public function ProfileModelImpl(numOfProfiles:int) {
			if(instance != null){
				Alert.show('can not construct model twice!','Error');
			}			
			profiles = new ArrayCollection();
			this.numOfProfiles = numOfProfiles;
		}
	}
}


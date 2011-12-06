package icardea.control
{
	import flash.net.URLLoader;
	import flash.net.URLRequest;
	
	import icardea.model.ProfileLanguage;
	import icardea.model.ProfileModel;
	
	import mx.binding.utils.BindingUtils;
	import mx.controls.Alert;
	import mx.resources.ResourceManager;
	
	//[ResourceBundle("Platform")]
	[Bindable]
	public class ProfileControlImpl implements ProfileControl
	{
		private static var instance:ProfileControlImpl;
		
		public var PLATFORM_SERVER_HOST:String = "platform.host";
		public var PLATFORM_SERVER_PORT:String = "platform.port";
		public var PLATFORM_SERVER_EXTENSION:String = "platform.extension";
		public var PLATFORM_SERVER_SSL:String = "platform.ssl";
		public var TURKISH_PROFILE:String = "TurkishProfile.xml";
		public var ENGLISH_PROFILE:String = "EnglishProfile.xml";
		
		public var serverURI:String;
		public var serverPort:String;
		public var serverExtension:String;
		public var isSecure:Boolean;
		public var profileModel:ProfileModel;
		public var view:iCardea;
		
		
		public function ProfileControlImpl(pModel:ProfileModel,dispObject:iCardea)
		{
			if(instance != null){
				Alert.show("Can not create two TestSettings");
				return;
			}
			profileModel = pModel;
			view = dispObject;
			populateConfigurations();
			loadProfile(getFullServerURI()+ "/profile/" + TURKISH_PROFILE);
			loadProfile(getFullServerURI()+ "/profile/" + ENGLISH_PROFILE);
			BindingUtils.bindSetter(profileSelected, view.profileSelector, "selectedItem");
			ProfileLanguage.getInstance();
		}
		
		public static function getInstance(pModel:ProfileModel,dispObject:iCardea):ProfileControlImpl {
			if(!instance){
				instance = new ProfileControlImpl(pModel,dispObject);
			}
			return instance;
		}
		
		public function populateConfigurations():void {
			/*serverURI = ResourceManager.getInstance().getString("Platform", PLATFORM_SERVER_HOST,null);
			serverPort = ResourceManager.getInstance().getNumber("Platform", PLATFORM_SERVER_PORT).toString();			
			serverExtension = ResourceManager.getInstance().getString("Platform", PLATFORM_SERVER_EXTENSION,null);	
			isSecure = ResourceManager.getInstance().getBoolean("Platform", PLATFORM_SERVER_SSL);*/
			
			serverURI = "localhost"; //"195.142.27.167";
			serverPort = "8080";
			serverExtension = "icardea/flex-client";
			isSecure = false;
		 }
		
		public function getFullServerURI():String{
			if(isSecure){
				trace(serverURI);
				trace(serverPort);
				trace(serverExtension);
				return "https://" + serverURI+":"+serverPort+"/"+serverExtension;
			}else{
				return "http://" + serverURI+":"+serverPort+"/"+serverExtension;
			}
		}
		
		public function profileSelected(ignore:Object):void {
			var languageName:String = "";
			if(view.profileSelector.selectedItem != null){
				languageName = view.profileSelector.selectedItem.languageName;
			}
			
			for(var i:int=0; i < profileModel.profiles.length ;i++){
				if(profileModel.profiles.getItemAt(i).languageName == languageName)
					profileModel.languageData = profileModel.profiles.getItemAt(i).languageData;
			}

			for(var txt:String in profileModel.languageData) {
				if(ProfileLanguage.getInstance().hasOwnProperty(txt)) {
					ProfileLanguage.getInstance()[txt] = profileModel.languageData[txt];
				}
			}									
		}
		
		public function loadProfile(profileURL:String):void {
			profileModel.profileLoader = new URLLoader();
			profileModel.profileLoader.addEventListener(Event.COMPLETE, profileLoaderCompleteHandler);
			try {
				var req:URLRequest = new URLRequest(profileURL);
                profileModel.profileLoader.load(req);
            } catch (error:Error) {
               trace("loadProfileError")
            }
		}
		
		
		private function profileLoaderCompleteHandler(e:Event):void {
			var profileXML:XML = new XML(e.target.data);
			profileModel.languageData = new Object();
						
			for each(var child:XML in profileXML.children()[0].children()) {
				profileModel.languageData[child.localName()] = child.toString();
				//trace('LD: ' + child.localName() + ' = ' + child.toString());
			}
			
			var profileObj:Object = new Object();
			profileObj['languageData'] = profileModel.languageData;
			profileObj['profileName'] = profileXML.@name;
			profileObj['languageName'] = profileXML.children()[0].@name;
			profileObj['languageFlag'] = profileXML.children()[0].@flag;
			
			profileModel.profiles.addItem(profileObj);
			if(profileModel.profiles.length == profileModel.numOfProfiles){
				profileSelected(null);		
			}			
		}
	}
}

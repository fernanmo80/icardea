package  tr.com.srdc.icardea.control
{
	
	[Bindable]
	public interface ProfileControl
	{	
		function populateConfigurations():void;		
		function getFullServerURI():String;
		function profileSelected(ignore:Object):void;
		function loadProfile(profileURL:String):void;
	}
}

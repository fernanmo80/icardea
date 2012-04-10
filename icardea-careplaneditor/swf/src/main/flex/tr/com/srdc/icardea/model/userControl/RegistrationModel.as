package tr.com.srdc.icardea.model.userControl
{
	[RemoteClass(alias="tr.com.srdc.icardea.platform.service.login.RegistrationModel")]
	[Bindable]
	public class RegistrationModel
	{
		public var openId:String;
		public var fullName:String;
		public var emailAddress:String;
		public var phoneNumber:String;
		public var role:String;
		public var dateOfBirth:String;	
		public var is_verified:String;
		public var address:String;
		
	}
}
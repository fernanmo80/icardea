
package tr.com.srdc.icardea.model.userControl
{
	[RemoteClass(alias="tr.com.srdc.icardea.platform.model.Contact")]
	[Bindable]
	public class Contact
	{
		public var id : String;
	    public var addressLine : String;
	    public var faxNumber : String;
	    public var email : String;
	    public var phoneNumber : String;
	    public var mobileNumber : String;
	    public var gtalk : String;
		public function Contact()
		{
		}

	}
}


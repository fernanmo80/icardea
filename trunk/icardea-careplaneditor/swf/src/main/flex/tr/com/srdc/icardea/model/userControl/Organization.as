
package tr.com.srdc.icardea.model.userControl
{
	import tr.com.srdc.icardea.model.userControl.Contact;
	[RemoteClass(alias="tr.com.srdc.icardea.platform.model.Organization")]
	[Bindable]
	public class Organization
	{
		public var id : String;
	    public var name : String;
	    public var identifier : String;
	    public var contact:Contact;
		public function Organization()
		{
		}

	}
}


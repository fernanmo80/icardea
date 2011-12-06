
package tr.com.srdc.icardea.model.userRoles
{
	import mx.collections.ArrayCollection;
	
	import tr.com.srdc.icardea.model.userControl.Contact;
	import tr.com.srdc.icardea.model.userControl.Organization;
	
	[RemoteClass(alias="tr.com.srdc.icardea.platform.model.Person")]
	[Bindable]
	public class Person
	{
		public var identifier : String;
	    public var alternateIdentifier : String;
	    public var name : String;
	    public var surname : String;
	    public var middleName : String;
	    public var title : String;
	    public var role : String;
	    public var username : String;
	    public var password : String;
	    public var organization : Organization = new Organization;
	    public var contact : Contact = new Contact;
	    public var myPatients:ArrayCollection = new ArrayCollection;
		public function Person()
		{
		}

	}
}


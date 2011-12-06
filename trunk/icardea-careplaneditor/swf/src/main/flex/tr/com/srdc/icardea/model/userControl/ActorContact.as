
package tr.com.srdc.icardea.model.userControl{
	[Bindable]
	[XmlClass(alias="Contact")]
	public class ActorContact{
		public function ActorContact(){
			
		}

		[XmlElement(alias="Email")]
		public  var email : String = "";
		[XmlElement(alias="MobilePhoneNumber")]
		public  var mobilePhoneNumber : String = "";
		[XmlElement(alias="PhoneNumber")]
		public  var phoneNumber : String = "";
		[XmlElement(alias="FaxNumber")]
		public  var faxNumber : String = "";
		[XmlElement(alias="GTalk")]
		public  var gTalk : String = "";
		}
}


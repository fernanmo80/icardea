
package tr.com.srdc.icardea.model.userRoles{
	[Bindable]
	[XmlClass(alias="Receiver")]
	public class Receiver{
		public function Receiver(){
			/* ctor not implemented */
		}

		[XmlAttribute]
		public  var ref : String = "";
		}
}

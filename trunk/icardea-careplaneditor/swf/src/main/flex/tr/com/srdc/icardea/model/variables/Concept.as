
package tr.com.srdc.icardea.model.variables{
	[Bindable]
	[XmlClass(alias="Concept", ordered="true")]
	public class Concept{
		public function Concept(){
			
		}

		[XmlAttribute(order="1")]
		public  var code : String = "";
		[XmlAttribute(order="2")]
		public  var name : String = "";
		[XmlAttribute(order="3")]
		public  var schemeID : String = "";
		}
}


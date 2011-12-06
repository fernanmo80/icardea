
package tr.com.srdc.icardea.model.variables{
	[Bindable]
	[XmlClass(alias="DataSource", ordered="true")]
	public class DataSource{
		public function DataSource(){
			
		}

		[XmlAttribute(order="1")]
		public  var code : String = "";
		[XmlAttribute(order="2")]
		public  var name : String = "";
		[XmlAttribute(order="3")]
		public  var attribute : String = "";
		[XmlAttribute(order="4")]
		public  var schemeID : String = "";
		
		}
}


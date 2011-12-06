
package tr.com.srdc.icardea.model.userControl{
	[Bindable]
	[XmlClass(alias="History")]
	public class History{
		public function History(){
			
		}

		[XmlElement(alias="ChangedBy")]	
   		public  var changedBy : String = "";
   		[XmlElement(alias="DateTime")]	
		public  var dateTime : Date = new Date;
		[XmlElement(alias="Description")]	
		public  var description : String = "";
		[XmlAttribute(alias="ID")]	
		public  var id : String = "";
		[XmlElement(alias="Version")]	
		public  var version : String = "";
		}
}


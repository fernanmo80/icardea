
package tr.com.srdc.icardea.model.steps{
	[Bindable]
	[XmlClass(alias="FinalStep")]
	public class FinalStep{
		public function FinalStep(){
			
		}
		
		public  var ownName : String = "finalStep";
		
		[XmlAttribute(alias="ID")]	
		public  var id : String = "";
				
		[XmlAttribute(alias="name")]	
		public  var name : String = "Guideline Finalized!";
			
		[XmlElement(alias="DUMY", ignoreOn="serialize")]	
		public  var fname : String;
		
		}
}

package tr.com.srdc.icardea.model.variables{
	import mx.collections.ArrayCollection;
	
	[Bindable]
	[XmlClass(alias="Variable", ordered="true")]
	public class Variable{
		public function Variable(){
			
		}
		
		public var varList:ArrayCollection = new ArrayCollection;
		public var flag:Boolean = false;
		public var children:ArrayCollection = new ArrayCollection;
		
		[XmlAttribute]
		public  var name : String = "";
		[XmlAttribute]
		public  var type : String = "";
		[XmlAttribute]
		public  var refValue : String = "";
		[XmlArray(alias="*" ,order="1", type = "tr.com.srdc.icardea.model.variables.Concept")]
		public  var concept : ArrayCollection = new ArrayCollection;
		[XmlArray(alias="*", order="2", type = "tr.com.srdc.icardea.model.variables.DataSource")]
		public  var dataSource : ArrayCollection = new ArrayCollection;
		[XmlElement(alias="RefinementScript", order="3")]
		public  var refinementScript : String = "";
		
		}
}


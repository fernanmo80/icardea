
package tr.com.srdc.icardea.model.steps.recordAction{
	import mx.collections.ArrayCollection;
	
	import tr.com.srdc.icardea.model.variables.Concept;
	import tr.com.srdc.icardea.model.steps.NextStep;
	import tr.com.srdc.icardea.model.steps.recordAction.ValueForRecord;
	
	[Bindable]
    [XmlClass(alias="RecordActionStep")]
     public class RecordActionStep{
		public function RecordActionStep(){
			
		}
	
		public var ownName:String = "recordActionStep";
		
		[XmlAttribute(alias="ID")]		
		public var id : String = "";	
		[XmlAttribute(alias="name")]		
		public var name : String = "";		
		[XmlElement(alias="NextStep")]
		public var nextStep:NextStep = new NextStep;
		[XmlElement(alias="Value")]		
		public var valueForRecord : ValueForRecord = new ValueForRecord;
		[XmlElement(alias="Concept")]		
		public var concept:Concept = new Concept;
		[XmlArray(alias="*", type = "tr.com.srdc.icardea.model.variables.DataSource")]
		public var dataSources:ArrayCollection = new ArrayCollection;
				
		}
}
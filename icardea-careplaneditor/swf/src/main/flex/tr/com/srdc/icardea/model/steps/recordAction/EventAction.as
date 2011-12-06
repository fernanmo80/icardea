
package tr.com.srdc.icardea.model.steps.recordAction{
	import mx.collections.ArrayCollection;
	
	[Bindable]
    [XmlClass(alias="Event")]
     public class EventAction{
		public function EventAction(){
			
		}
	
		public var ownName:String = "eventAction";
		
		[XmlArray(alias="*", type = "tr.com.srdc.icardea.model.variables.DataSource")]
		public  var dataSources : ArrayCollection = new ArrayCollection;
	
		}
}


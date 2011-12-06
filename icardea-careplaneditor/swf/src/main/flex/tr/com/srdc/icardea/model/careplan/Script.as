
package tr.com.srdc.icardea.model.careplan{
	import mx.collections.ArrayCollection;
	
	import tr.com.srdc.icardea.model.steps.NextStep;
	import tr.com.srdc.icardea.model.variables.Variable;
	
		
	[Bindable]
	public class Script{
		public function Script(){
			
		}

		public var variableList:ArrayCollection = new ArrayCollection;
		public var refineVar:Variable = new Variable;
		public var scriptResult:String="";
		public var evaluationNext:NextStep = new NextStep;
		
	}
}


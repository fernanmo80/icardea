
package tr.com.srdc.icardea.model.mainStructure{
	import mx.collections.ArrayCollection;
	import tr.com.srdc.icardea.model.steps.ConsultStep;
	import tr.com.srdc.icardea.model.steps.DecisionStep;
	import tr.com.srdc.icardea.model.steps.RecommendationStep;
	import tr.com.srdc.icardea.model.steps.StartStep;
	import tr.com.srdc.icardea.model.steps.FinalStep;
	import tr.com.srdc.icardea.model.steps.WaitStep;
	import tr.com.srdc.icardea.model.steps.EligibilityCriteria;
	import tr.com.srdc.icardea.model.steps.recordAction.RecordActionStep;
	
	
	[Bindable]
	[XmlClass(alias="Algorithm", ordered="true")]

	public class Algorithm{
		public function Algorithm(){
			
		}
		public function addConsult(cs:ConsultStep):void{
			if(this.consultStep == null)
				this.consultStep = new ArrayCollection;
			this.consultStep.addItem(cs);	
		}
		public function addDecision(cs:DecisionStep):void{
			if(this.decisionStep == null)
				this.decisionStep = new ArrayCollection;
			this.decisionStep.addItem(cs);	
		}
		public function addRecommendation(cs:RecommendationStep):void{
			if(this.recommendationStep == null)
				this.recommendationStep = new ArrayCollection;
			this.recommendationStep.addItem(cs);	
		}
		public function addWait(ws:WaitStep):void{
			if(this.waitStep == null)
				this.waitStep = new ArrayCollection;
			this.waitStep.addItem(ws);	
		}
		public function addRecord(recs:RecordActionStep):void{
			if(this.recordActionStep == null)
				this.recordActionStep = new ArrayCollection;
			this.recordActionStep.addItem(recs);	
		}
		
		[XmlElement(alias="StartStep", order="1")]	
		public  var startStep : StartStep;
		[XmlElement(alias="FinalStep", order="2") ]	
		public  var finalStep : FinalStep;
		[XmlArray(alias="*", order="3", type = "tr.com.srdc.icardea.model.steps.ConsultStep")]	
		public  var consultStep : ArrayCollection;
		[XmlArray(alias="*", order="4", type = "tr.com.srdc.icardea.model.steps.DecisionStep")]	
		public  var decisionStep : ArrayCollection;
		[XmlArray(alias="*", order="5", type = "tr.com.srdc.icardea.model.steps.RecommendationStep")]	
		public  var recommendationStep : ArrayCollection;
		[XmlArray(alias="*", order="6", type = "tr.com.srdc.icardea.model.steps.WaitStep")]	
		public  var waitStep : ArrayCollection;
		[XmlArray(alias="*", order="7", type = "tr.com.srdc.icardea.model.steps.recordAction.RecordActionStep")]	
		public  var recordActionStep : ArrayCollection;
		
		}
}


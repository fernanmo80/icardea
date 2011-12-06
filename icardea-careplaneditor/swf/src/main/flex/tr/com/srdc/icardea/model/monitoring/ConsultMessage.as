package tr.com.srdc.icardea.model.monitoring
{
	[RemoteClass(alias="tr.com.srdc.icardea.careplanengine.agents.afAgent.ConsultMessage")]
	[Bindable]
	public class ConsultMessage
	{
		public function ConsultMessage()
		{
		}
		public var careplanProcessorID:String;
		public var consultHTMLString:String;
		public var stepID:String;
	

	}
}
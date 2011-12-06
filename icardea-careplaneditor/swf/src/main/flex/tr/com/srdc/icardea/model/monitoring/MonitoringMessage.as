package tr.com.srdc.icardea.model.monitoring
{
	[RemoteClass(alias="tr.com.srdc.icardea.careplanengine.agents.afAgent.MonitoringMessage")]
	[Bindable]
	public class MonitoringMessage
	{
		public function MonitoringMessage()
		{
		}
		public var careplanProcessorID:String;
		public var stepID:String;
		public var status:String;
		public var monitorMessage:String;
		public var isMonitored:Boolean = false;

	}
}
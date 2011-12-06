package tr.com.srdc.icardea.careplanengine.agents.afAgent;

public class MonitoringMessage {
	private String careplanProcessorID;
	private String stepID;
	private String status;
	private String monitoringMessage;
	private boolean isMonitored;
	
	public void setCareplanProcessorID(String careplanProcessorID) {
		this.careplanProcessorID = careplanProcessorID;
	}
	public String getCareplanProcessorID() {
		return careplanProcessorID;
	}
	
	public MonitoringMessage() {
			
	}
	public void setStepID(String stepID) {
		this.stepID = stepID;
	}
	public String getStepID() {
		return stepID;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus() {
		return status;
	}
	public void setMonitoringMessage(String monitoringMessage) {
		this.monitoringMessage = monitoringMessage;
	}
	public String getMonitoringMessage() {
		return monitoringMessage;
	}
	public MonitoringMessage(String careplanProcessorID, String stepID, String status, String monitoringMessage) {
		super();
		this.careplanProcessorID = careplanProcessorID;
		this.stepID = stepID;
		this.status = status;
		this.monitoringMessage = monitoringMessage;
	}
	public void setMonitored(boolean isMonitored) {
		this.isMonitored = isMonitored;
	}
	public boolean isMonitored() {
		return isMonitored;
	}

	
}

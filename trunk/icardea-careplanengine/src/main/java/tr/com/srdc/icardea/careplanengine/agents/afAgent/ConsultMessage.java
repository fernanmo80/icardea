package tr.com.srdc.icardea.careplanengine.agents.afAgent;

public class ConsultMessage {
	private String careplanProcessorID;
	private String consultHTMLString;
	private String stepID;

	public String getStepID() {
		return stepID;
	}

	public void setStepID(String stepID) {
		this.stepID = stepID;
	}
	
	public void setCareplanProcessorID(String careplanProcessorID) {
		this.careplanProcessorID = careplanProcessorID;
	}
	public String getCareplanProcessorID() {
		return careplanProcessorID;
	}
	public void setConsultHTMLString(String consultHTMLString) {
		this.consultHTMLString = consultHTMLString;
	}
	public String getConsultHTMLString() {
		return consultHTMLString;
	}
	public ConsultMessage() {
			
	}
	
	public ConsultMessage(String careplanProcessorID, String consultHTMLString, String stepID) {
		super();
		this.careplanProcessorID = careplanProcessorID;
		this.consultHTMLString = consultHTMLString;
		this.stepID = stepID;
	}
}

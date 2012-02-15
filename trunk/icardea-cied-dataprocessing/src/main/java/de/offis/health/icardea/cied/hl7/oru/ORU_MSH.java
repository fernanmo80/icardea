package de.offis.health.icardea.cied.hl7.oru;

public class ORU_MSH {

	public String fieldSeparator=""; //"|";
	public String encodingCharacters=""; //"^~\\&";
	public String sendingApplication=""; //"PCS";
	public String sendingFacility=""; //"STJ";
	public String receivingApplication=""; //"EMRS";
	public String receivingFacility=""; //"102027";
	//MSH_DateTimeOfMessage=current system time
	public String messageType_messagecode=""; //"ORU";
	public String messageType_triggerevent=""; //"R01";
	public String messageType_message_structure_id=""; //"ORU_R01";
	public String messageControlID=""; //"PCS102773";
	public String processingID=""; //"P";
	public String versionID=""; //"2.5";
	/**
	 * @return the fieldSeparator
	 */
	public String getFieldSeparator() {
		return fieldSeparator;
	}
	/**
	 * @param fieldSeparator the fieldSeparator to set
	 */
	public void setFieldSeparator(String fieldSeparator) {
		this.fieldSeparator = fieldSeparator;
	}
	/**
	 * @return the encodingCharacters
	 */
	public String getEncodingCharacters() {
		return encodingCharacters;
	}
	/**
	 * @param encodingCharacters the encodingCharacters to set
	 */
	public void setEncodingCharacters(String encodingCharacters) {
		this.encodingCharacters = encodingCharacters;
	}
	/**
	 * @return the sendingApplication
	 */
	public String getSendingApplication() {
		return sendingApplication;
	}
	/**
	 * @param sendingApplication the sendingApplication to set
	 */
	public void setSendingApplication(String sendingApplication) {
		this.sendingApplication = sendingApplication;
	}
	/**
	 * @return the sendingFacility
	 */
	public String getSendingFacility() {
		return sendingFacility;
	}
	/**
	 * @param sendingFacility the sendingFacility to set
	 */
	public void setSendingFacility(String sendingFacility) {
		this.sendingFacility = sendingFacility;
	}
	/**
	 * @return the receivingApplication
	 */
	public String getReceivingApplication() {
		return receivingApplication;
	}
	/**
	 * @param receivingApplication the receivingApplication to set
	 */
	public void setReceivingApplication(String receivingApplication) {
		this.receivingApplication = receivingApplication;
	}
	/**
	 * @return the receivingFacility
	 */
	public String getReceivingFacility() {
		return receivingFacility;
	}
	/**
	 * @param receivingFacility the receivingFacility to set
	 */
	public void setReceivingFacility(String receivingFacility) {
		this.receivingFacility = receivingFacility;
	}
	/**
	 * @return the messageType_messagecode
	 */
	public String getMessageType_messagecode() {
		return messageType_messagecode;
	}
	/**
	 * @param messageTypeMessagecode the messageType_messagecode to set
	 */
	public void setMessageType_messagecode(String messageTypeMessagecode) {
		messageType_messagecode = messageTypeMessagecode;
	}
	/**
	 * @return the messageType_triggerevent
	 */
	public String getMessageType_triggerevent() {
		return messageType_triggerevent;
	}
	/**
	 * @param messageTypeTriggerevent the messageType_triggerevent to set
	 */
	public void setMessageType_triggerevent(String messageTypeTriggerevent) {
		messageType_triggerevent = messageTypeTriggerevent;
	}
	/**
	 * @return the messageType_message_structure_id
	 */
	public String getMessageType_message_structure_id() {
		return messageType_message_structure_id;
	}
	/**
	 * @param messageTypeMessageStructureId the messageType_message_structure_id to set
	 */
	public void setMessageType_message_structure_id(
			String messageTypeMessageStructureId) {
		messageType_message_structure_id = messageTypeMessageStructureId;
	}
	/**
	 * @return the messageControlID
	 */
	public String getMessageControlID() {
		return messageControlID;
	}
	/**
	 * @param messageControlID the messageControlID to set
	 */
	public void setMessageControlID(String messageControlID) {
		this.messageControlID = messageControlID;
	}
	/**
	 * @return the processingID
	 */
	public String getProcessingID() {
		return processingID;
	}
	/**
	 * @param processingID the processingID to set
	 */
	public void setProcessingID(String processingID) {
		this.processingID = processingID;
	}
	/**
	 * @return the versionID
	 */
	public String getVersionID() {
		return versionID;
	}
	/**
	 * @param versionID the versionID to set
	 */
	public void setVersionID(String versionID) {
		this.versionID = versionID;
	}
}
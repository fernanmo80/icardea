package de.offis.health.icardea.cied.hl7.oru;

public class ORU_OBR {
	//OBR Segment  IHE_PCD_TF_Rev1-2_Vol2_TI_2010-09-30.pdf page 47
	public String setID="";
	public String placerOrderNumber_entityIdentifier="";
	public String fillerOrderNumber_entityIdentifier="";
	public String universalServiceIdentifier_identifier="";
	public String universalServiceIdentifier_text="";
	public String observationData_Time_time="";
	public String observationEndData_Time_time="";
	public String resultsRptStatusChngDate_Time_time="";
	public String resultStatus="";
	/**
	 * @return the setID
	 */
	public String getSetID() {
		return setID;
	}
	/**
	 * @param setID the setID to set
	 */
	public void setSetID(String setID) {
		this.setID = setID;
	}
	/**
	 * @return the placerOrderNumber_entityIdentifier
	 */
	public String getPlacerOrderNumber_entityIdentifier() {
		return placerOrderNumber_entityIdentifier;
	}
	/**
	 * @param placerOrderNumberEntityIdentifier the placerOrderNumber_entityIdentifier to set
	 */
	public void setPlacerOrderNumber_entityIdentifier(
			String placerOrderNumberEntityIdentifier) {
		placerOrderNumber_entityIdentifier = placerOrderNumberEntityIdentifier;
	}
	/**
	 * @return the fillerOrderNumber_entityIdentifier
	 */
	public String getFillerOrderNumber_entityIdentifier() {
		return fillerOrderNumber_entityIdentifier;
	}
	/**
	 * @param fillerOrderNumberEntityIdentifier the fillerOrderNumber_entityIdentifier to set
	 */
	public void setFillerOrderNumber_entityIdentifier(
			String fillerOrderNumberEntityIdentifier) {
		fillerOrderNumber_entityIdentifier = fillerOrderNumberEntityIdentifier;
	}
	/**
	 * @return the universalServiceIdentifier_identifier
	 */
	public String getUniversalServiceIdentifier_identifier() {
		return universalServiceIdentifier_identifier;
	}
	/**
	 * @param universalServiceIdentifierIdentifier the universalServiceIdentifier_identifier to set
	 */
	public void setUniversalServiceIdentifier_identifier(
			String universalServiceIdentifierIdentifier) {
		universalServiceIdentifier_identifier = universalServiceIdentifierIdentifier;
	}
	/**
	 * @return the universalServiceIdentifier_text
	 */
	public String getUniversalServiceIdentifier_text() {
		return universalServiceIdentifier_text;
	}
	/**
	 * @param universalServiceIdentifierText the universalServiceIdentifier_text to set
	 */
	public void setUniversalServiceIdentifier_text(
			String universalServiceIdentifierText) {
		universalServiceIdentifier_text = universalServiceIdentifierText;
	}
	/**
	 * @return the observationData_Time_time
	 */
	public String getObservationData_Time_time() {
		return observationData_Time_time;
	}
	/**
	 * @param observationDataTimeTime the observationData_Time_time to set
	 */
	public void setObservationData_Time_time(String observationDataTimeTime) {
		observationData_Time_time = observationDataTimeTime;
	}
	/**
	 * @return the observationEndData_Time_time
	 */
	public String getObservationEndData_Time_time() {
		return observationEndData_Time_time;
	}
	/**
	 * @param observationEndDataTimeTime the observationEndData_Time_time to set
	 */
	public void setObservationEndData_Time_time(String observationEndDataTimeTime) {
		observationEndData_Time_time = observationEndDataTimeTime;
	}
	/**
	 * @return the resultsRptStatusChngDate_Time_time
	 */
	public String getResultsRptStatusChngDate_Time_time() {
		return resultsRptStatusChngDate_Time_time;
	}
	/**
	 * @param resultsRptStatusChngDateTimeTime the resultsRptStatusChngDate_Time_time to set
	 */
	public void setResultsRptStatusChngDate_Time_time(
			String resultsRptStatusChngDateTimeTime) {
		resultsRptStatusChngDate_Time_time = resultsRptStatusChngDateTimeTime;
	}
	/**
	 * @return the resultStatus
	 */
	public String getResultStatus() {
		return resultStatus;
	}
	/**
	 * @param resultStatus the resultStatus to set
	 */
	public void setResultStatus(String resultStatus) {
		this.resultStatus = resultStatus;
	}

}
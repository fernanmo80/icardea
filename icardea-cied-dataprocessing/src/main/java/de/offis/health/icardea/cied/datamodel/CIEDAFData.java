package de.offis.health.icardea.cied.datamodel;

/**
 * TODO: Describe what this data model class stores for further processing
 * 
 * @author MYang
 */

public class CIEDAFData {
	/* @author MYang
	*/
	//private String mdc_IDC_SET_LEADCHNL_CHAMBER_PACING_AMPLITUDE_AF=null;
	private String mdc_IDC_STAT_TACHYTHERAPY_SHOCKS_DELIVERED_RECENT=null;
	private String mdc_IDC_STAT_TACHYTHERAPY_SHOCKS_ABORTED_RECENT=null;	
	private String mdc_IDC_EPISODE_DURATION=null;
	private String mdc_IDC_EPISODE_TYPE_AF=null;
	private String mdc_IDC_EPISODE_TYPE_SVT=null;
	//private String mdc_IDC_MSMT_LEADHVCHNL_STATUS=null;
	/**
	 * @return the mdc_IDC_STAT_TACHYTHERAPY_SHOCKS_DELIVERED_RECENT
	 */
	public String getMdc_IDC_STAT_TACHYTHERAPY_SHOCKS_DELIVERED_RECENT() {
		return mdc_IDC_STAT_TACHYTHERAPY_SHOCKS_DELIVERED_RECENT;
	}
	/**
	 * @param mdcIDCSTATTACHYTHERAPYSHOCKSDELIVEREDRECENT the mdc_IDC_STAT_TACHYTHERAPY_SHOCKS_DELIVERED_RECENT to set
	 */
	public void setMdc_IDC_STAT_TACHYTHERAPY_SHOCKS_DELIVERED_RECENT(
			String mdcIDCSTATTACHYTHERAPYSHOCKSDELIVEREDRECENT) {
		mdc_IDC_STAT_TACHYTHERAPY_SHOCKS_DELIVERED_RECENT = mdcIDCSTATTACHYTHERAPYSHOCKSDELIVEREDRECENT;
	}
	/**
	 * @return the mdc_IDC_STAT_TACHYTHERAPY_SHOCKS_ABORTED_RECENT_
	 */
	public String getMdc_IDC_STAT_TACHYTHERAPY_SHOCKS_ABORTED_RECENT() {
		return mdc_IDC_STAT_TACHYTHERAPY_SHOCKS_ABORTED_RECENT;
	}
	/**
	 * @param mdcIDCSTATTACHYTHERAPYSHOCKSABORTEDRECENT the mdc_IDC_STAT_TACHYTHERAPY_SHOCKS_ABORTED_RECENT_ to set
	 */
	public void setMdc_IDC_STAT_TACHYTHERAPY_SHOCKS_ABORTED_RECENT(
			String mdcIDCSTATTACHYTHERAPYSHOCKSABORTEDRECENT) {
		mdc_IDC_STAT_TACHYTHERAPY_SHOCKS_ABORTED_RECENT = mdcIDCSTATTACHYTHERAPYSHOCKSABORTEDRECENT;
	}
	/**
	 * @return the mdc_IDC_EPISODE_DURATION_AF
	 */
	public String getMdc_IDC_EPISODE_DURATION() {
		return mdc_IDC_EPISODE_DURATION;
	}
	/**
	 * @param mdcIDCEPISODEDURATIONAF the mdc_IDC_EPISODE_DURATION_AF to set
	 */
	public void setMdc_IDC_EPISODE_DURATION(String mdcIDCEPISODEDURATIONAF) {
		mdc_IDC_EPISODE_DURATION = mdcIDCEPISODEDURATIONAF;
	}
	/**
	 * @return the mdc_IDC_EPISODE_TYPE_AF
	 */
	public String getMdc_IDC_EPISODE_TYPE_AF() {
		return mdc_IDC_EPISODE_TYPE_AF;
	}
	/**
	 * @param mdcIDCEPISODETYPEAF the mdc_IDC_EPISODE_TYPE_AF to set
	 */
	public void setMdc_IDC_EPISODE_TYPE_AF(String mdcIDCEPISODETYPEAF) {
		mdc_IDC_EPISODE_TYPE_AF = mdcIDCEPISODETYPEAF;
	}
	/**
	 * @return the mdc_IDC_EPISODE_TYPE_SVT
	 */
	public String getMdc_IDC_EPISODE_TYPE_SVT() {
		return mdc_IDC_EPISODE_TYPE_SVT;
	}
	/**
	 * @param mdcIDCEPISODETYPESVT the mdc_IDC_EPISODE_TYPE_SVT to set
	 */
	public void setMdc_IDC_EPISODE_TYPE_SVT(String mdcIDCEPISODETYPESVT) {
		mdc_IDC_EPISODE_TYPE_SVT = mdcIDCEPISODETYPESVT;
	}
}
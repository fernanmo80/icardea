package de.offis.health.icardea.ppm;
/**
 * @author cLuepkes
 *
 */

import org.apache.log4j.Logger;

public class DactPatternDataSet {
	//private static Logger logger = Logger.getLogger(DactPatternDataSet.class);
	
	//  `pattern_id`,
	Integer patternID = 0;
	//`prerequisite_db_relations`,
	String preReqRelations ="";
	//`prerequisiute_db_attributes`,
	String preReqAttributes ="";
	// Is the preReqValid for Patient?
	boolean preReqFullFilled = false;
	//`prerequisite_view`,
	String viewPreReq = "";
	// `conclusion_db_attribute`,
	String conCluAttribute ="";
	// `conclusion_db_relation`,
	String concluRelation ="";
	// `confidence_view`,
	String viewConf ="";
	//`conclusion_view`,
	String viewConclu="";
	//`support_view`,
	String viewSupport = "";
	//`approvedstatus_view`,
	String viewApproved = "";
	//`validforpatient`,
	boolean validForPat=false;
	//`creationdate`,
	String creationDate ="";
	//`creationsource`,
	String creationSource ="";
	//`active`
	Boolean active = true;
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DactPatternDataSet [patternID=" + patternID
				+ ", preReqRelations=" + preReqRelations
				+ ", preReqAttributes=" + preReqAttributes
				+ ", preReqFullFilled=" + preReqFullFilled + ", viewPreReq="
				+ viewPreReq + ", conCluAttribute=" + conCluAttribute
				+ ", concluRelation=" + concluRelation + ", viewConf="
				+ viewConf + ", viewConclu=" + viewConclu + ", viewSupport="
				+ viewSupport + ", viewApproved=" + viewApproved
				+ ", validForPat=" + validForPat + ", creationDate="
				+ creationDate + ", creationSource=" + creationSource
				+ ", active=" + active + "]";
	}
	
	public String toHealthCareActorString() {
		return "DactPatternDataSet [patternID=" + patternID
				+ ", viewPreReq=" + viewPreReq
				+ ", viewConclu=" + viewConclu
				+ ", viewConf="	+ viewConf 
				+ ", viewSupport=" + viewSupport 
				+ ", viewApproved=" + viewApproved
				+ ", validForPat=" + validForPat 
				+ ", creationDate="	+ creationDate 
				+ ", creationSource=" + creationSource
				+ "]";
	}
	
	
	}

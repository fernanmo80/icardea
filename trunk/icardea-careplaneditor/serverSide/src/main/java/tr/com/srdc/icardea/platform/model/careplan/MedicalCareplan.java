package tr.com.srdc.icardea.platform.model.careplan;

import tr.com.srdc.icardea.hibernate.System;

/**
 * This class is a basic representation of a MedicalCareplan that can be stored
 * in database together with its diagram representation.<br>
 * 
 * Fields of this class is subject to change since actual careplan repository
 * implementation may require more fields of a careplan other than string
 * content.
 * 
 * @author cihancimen
 * 
 */
public class MedicalCareplan {

	/**
	 * Diagram content's XML serialization
	 */
	private String diagram;
	/**
	 * Medical Careplan's XML serialization
	 */
	private String careplan;
	/**
	 * Used for identifying careplan amongst others.
	 */
	private String id;
	
	/**
	 * Following fields are directly taken from FLEX GUI 
	 */
	
	
	private String status;
	private String name;
	private String version;
	private String ICD10Code;
	private String url;
	

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	public MedicalCareplan() {

	}
	
	public MedicalCareplan(String diagram, String careplan, String id,
			String name, String version, String ICD10Code) {
		super();
		this.diagram = diagram;
		this.careplan = careplan;
		this.id = id;
		this.name = name;
		this.version = version;
		this.ICD10Code = ICD10Code;
		this.status = status;
	}
	public String getDiagram() {
		return diagram;
	}
	public void setDiagram(String diagram) {
		this.diagram = diagram;
	}
	public String getCareplan() {
		return careplan;
	}
	public void setCareplan(String careplan) {
		this.careplan = careplan;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getICD10Code() {
		return ICD10Code;
	}
	public void setICD10Code(String ICD10Code) {
		this.ICD10Code = ICD10Code;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	
	
	
	
	
	

}

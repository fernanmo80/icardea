package tr.com.srdc.icardea.careplan.pojo;

import java.util.List;
import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Transient;
import javax.persistence.Embeddable;

/**
 * <p>Pojo mapping TABLE PersonalizedMedicalCareplan</p>
 * <p></p>
 *
 * <p>Generated at Sun Feb 06 21:02:52 EET 2011</p>
 * @author Salto-db Generator v1.0.16 / EJB3
 * 
 */
@Entity
@Table(name = "PersonalizedMedicalCareplan", catalog = "medicalcareplanrepository")
@SuppressWarnings("serial")
public class Personalizedmedicalcareplan implements Serializable {

	/**
	 * Attribute id.
	 */
	private Integer id;
	
	/**
	 * Attribute patient
	 */
	 private Patient patient;	

	/**
	 * Attribute medicalcareplantemplate
	 */
	 private Medicalcareplantemplate medicalcareplantemplate;	

	/**
	 * Attribute content.
	 */
	private String content;
	
	/**
	 * Attribute diagramContent.
	 */
	private String diagramContent;
	
	/**
	 * Attribute identifier.
	 */
	private String identifier;
	
	/**
	 * Attribute creationDate.
	 */
	private Timestamp creationDate;
	
	
	/**
	 * <p> 
	 * </p>
	 * @return id
	 */
	@Basic
	@Id
	@Column(name = "id")
		public Integer getId() {
		return id;
	}

	/**
	 * @param id new value for id 
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	
	/**
	 * get patient
	 */
	@ManyToOne
	@JoinColumn(name = "Patient_id")
	public Patient getPatient() {
		return this.patient;
	}
	
	/**
	 * set patient
	 */
	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	/**
	 * get medicalcareplantemplate
	 */
	@ManyToOne
	@JoinColumn(name = "MedicalCarePlanTemplate_id")
	public Medicalcareplantemplate getMedicalcareplantemplate() {
		return this.medicalcareplantemplate;
	}
	
	/**
	 * set medicalcareplantemplate
	 */
	public void setMedicalcareplantemplate(Medicalcareplantemplate medicalcareplantemplate) {
		this.medicalcareplantemplate = medicalcareplantemplate;
	}

	/**
	 * <p> 
	 * </p>
	 * @return content
	 */
	@Basic
	@Column(name = "content", length = 2147483647)
		public String getContent() {
		return content;
	}

	/**
	 * @param content new value for content 
	 */
	public void setContent(String content) {
		this.content = content;
	}
	
	/**
	 * <p> 
	 * </p>
	 * @return diagramContent
	 */
	@Basic
	@Column(name = "diagramContent", length = 2147483647)
		public String getDiagramContent() {
		return diagramContent;
	}

	/**
	 * @param diagramContent new value for diagramContent 
	 */
	public void setDiagramContent(String diagramContent) {
		this.diagramContent = diagramContent;
	}
	
	/**
	 * <p> 
	 * </p>
	 * @return identifier
	 */
	@Basic
	@Column(name = "identifier", length = 45)
		public String getIdentifier() {
		return identifier;
	}

	/**
	 * @param identifier new value for identifier 
	 */
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}
	
	/**
	 * <p> 
	 * </p>
	 * @return creationDate
	 */
	@Basic
	@Column(name = "creationDate")
		public Timestamp getCreationDate() {
		return creationDate;
	}

	/**
	 * @param creationDate new value for creationDate 
	 */
	public void setCreationDate(Timestamp creationDate) {
		this.creationDate = creationDate;
	}
	


}
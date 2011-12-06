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
 * <p>Pojo mapping TABLE MedicalCarePlanTemplate</p>
 * <p></p>
 *
 * <p>Generated at Sun Feb 06 21:02:52 EET 2011</p>
 * @author Salto-db Generator v1.0.16 / EJB3
 * 
 */
@Entity
@Table(name = "MedicalCarePlanTemplate", catalog = "medicalcareplanrepository")
@SuppressWarnings("serial")
public class Medicalcareplantemplate implements Serializable {

	/**
	 * Attribute id.
	 */
	private Integer id;
	
	/**
	 * Attribute content.
	 */
	private String content;
	
	/**
	 * Attribute identifier.
	 */
	private String identifier;
	
	/**
	 * Attribute diagramContent.
	 */
	private String diagramContent;
	
	/**
	 * Attribute approved.
	 */
	private Boolean approved;
	
	/**
	 * Attribute iCD10Code.
	 */
	private String iCD10Code;
	
	/**
	 * Attribute creationDate.
	 */
	private Timestamp creationDate;
	
	/**
	 * Attribute name.
	 */
	private String name;
	
	/**
	 * List of Personalizedmedicalcareplan
	 */
	private List<Personalizedmedicalcareplan> personalizedmedicalcareplans = null;

	
	/**
	 * <p> 
	 * </p>
	 * @return id
	 */
	@Basic
	@Id
	@GeneratedValue
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
	 * @return approved
	 */
	@Basic
	@Column(name = "approved")
		public Boolean getApproved() {
		return approved;
	}

	/**
	 * @param approved new value for approved 
	 */
	public void setApproved(Boolean approved) {
		this.approved = approved;
	}
	
	/**
	 * <p> 
	 * </p>
	 * @return iCD10Code
	 */
	@Basic
	@Column(name = "iCD10Code", length = 45)
		public String getICD10Code() {
		return iCD10Code;
	}

	/**
	 * @param iCD10Code new value for iCD10Code 
	 */
	public void setICD10Code(String iCD10Code) {
		this.iCD10Code = iCD10Code;
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
	
	/**
	 * <p> 
	 * </p>
	 * @return name
	 */
	@Basic
	@Column(name = "name", length = 45)
		public String getName() {
		return name;
	}

	/**
	 * @param name new value for name 
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Get the list of Personalizedmedicalcareplan
	 */
	 @OneToMany(mappedBy="medicalcareplantemplate")
	 public List<Personalizedmedicalcareplan> getPersonalizedmedicalcareplans() {
	 	return this.personalizedmedicalcareplans;
	 }
	 
	/**
	 * Set the list of Personalizedmedicalcareplan
	 */
	 public void setPersonalizedmedicalcareplans(List<Personalizedmedicalcareplan> personalizedmedicalcareplans) {
	 	this.personalizedmedicalcareplans = personalizedmedicalcareplans;
	 }


}
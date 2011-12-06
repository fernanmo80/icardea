package tr.com.srdc.icardea.careplanengine.entities.patientDataEntities;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import tr.com.srdc.icardea.careplanengine.glmodel.Medication;

/**
 * @author itasyurt 01.05.06
 *
 */
public class MedicationEntity extends PatientDataEntity {

	protected PhysicalQuantityEntity checkDoseQuantity;
	
	protected PhysicalQuantityEntity dosageQuantity;
	
	protected SymbolEntity doseFormCd;
	
	protected PhysicalQuantityEntity rateQuantity;
	
	protected SymbolEntity routeCd;
	
	protected  PhysicalQuantityEntity strengthQuantity;
	
	public MedicationEntity() {
		super();
		// TODO Auto-generated constructor stub
		
	}
	public MedicationEntity (Medication medication) {
		super(medication);
		
		if (medication.getCheck_dose_quantity()!= null)
			this.checkDoseQuantity= new PhysicalQuantityEntity(medication.getCheck_dose_quantity());
	
		if (medication.getDosage_quantity()!=null)
			this.dosageQuantity= new PhysicalQuantityEntity(medication.getDosage_quantity());
		
		if (medication.getDoseform_cd()!=null) 
			this.doseFormCd = new SymbolEntity(medication.getDoseform_cd());
		
		if (medication.getRate_quantity()!=null) {
			this.rateQuantity= new PhysicalQuantityEntity(medication.getRate_quantity());
			
		}
		
		if (medication.getRoute_cd()!=null) {
			this.routeCd = new SymbolEntity(medication.getRoute_cd());
			
		}
		
		if (medication.getStrength_quantity()!= null) {
			this.strengthQuantity = new PhysicalQuantityEntity(medication.getStrength_quantity()); 
			
		}
		
		
	}

	/**
	 * @return Returns the checkDoseQuantity.
	 */
	public PhysicalQuantityEntity getCheckDoseQuantity() {
		return checkDoseQuantity;
	}

	/**
	 * @param checkDoseQuantity The checkDoseQuantity to set.
	 */
	public void setCheckDoseQuantity(PhysicalQuantityEntity checkDoseQuantity) {
		this.checkDoseQuantity = checkDoseQuantity;
	}

	/**
	 * @return Returns the dosageQuantity.
	 */
	public PhysicalQuantityEntity getDosageQuantity() {
		return dosageQuantity;
	}

	/**
	 * @param dosageQuantity The dosageQuantity to set.
	 */
	public void setDosageQuantity(PhysicalQuantityEntity dosageQuantity) {
		this.dosageQuantity = dosageQuantity;
	}

	/**
	 * @return Returns the doseFormCd.
	 */
	public SymbolEntity getDoseFormCd() {
		return doseFormCd;
	}

	/**
	 * @param doseFormCd The doseFormCd to set.
	 */
	public void setDoseFormCd(SymbolEntity doseFormCd) {
		this.doseFormCd = doseFormCd;
	}

	/**
	 * @return Returns the rateQuantity.
	 */
	public PhysicalQuantityEntity getRateQuantity() {
		return rateQuantity;
	}

	/**
	 * @param rateQuantity The rateQuantity to set.
	 */
	public void setRateQuantity(PhysicalQuantityEntity rateQuantity) {
		this.rateQuantity = rateQuantity;
	}

	/**
	 * @return Returns the routeCd.
	 */
	public SymbolEntity getRouteCd() {
		return routeCd;
	}

	/**
	 * @param routeCd The routeCd to set.
	 */
	public void setRouteCd(SymbolEntity routeCd) {
		this.routeCd = routeCd;
	}

	/**
	 * @return Returns the strengthQuantity.
	 */
	public PhysicalQuantityEntity getStrengthQuantity() {
		return strengthQuantity;
	}

	/**
	 * @param strengthQuantity The strengthQuatity to set.
	 */
	public void setStrengthQuantity(PhysicalQuantityEntity strengthQuantity) {
		this.strengthQuantity = strengthQuantity;
	}
	
	public Element toXmlElement(Document doc) {
		try {
			
			Element element = doc.createElement("Medication");
			
			
			///activity time
			if(this.activityTime!= null) {
			element.appendChild( this.activityTime.toXmlElement("Activity_Time_ME",doc));
			}
			
			///bodySitecd
			if(this.bodySiteCd!=null) {
				element.appendChild(this.bodySiteCd.toXmlElement("Body_Site_Cd_ME",doc));
			}
		
			
			/// check dose quantity
			
			if (this.checkDoseQuantity!= null) {
				
				element.appendChild(this.checkDoseQuantity.toXmlElement("Check_Dose_Quantity_ME",doc));
				
			}
			/// confidentialityCd
			if(this.confidentialityCd!=null) {
				element.appendChild(this.confidentialityCd.toXmlElement("Confidentiality_Cd_ME",doc));
			}
			
			/// critical duration
			if(this.criticalDuration!=null) {
				element.appendChild(this.criticalDuration.toXmlElement("Critical_Duration_ME",doc));
			}
			
			/// critical time
			if (this.criticalTime!=null) {
				element.appendChild(this.criticalTime.toXmlElement("Critical_Time_ME",doc));
			}
			
			/// dosage quantity
			if (this.dosageQuantity!= null) {
			
				element.appendChild(this.dosageQuantity.toXmlElement("Dosage_Quantity_ME",doc) );
				
			}
			/// dose form cd
			if(this.doseFormCd!= null) {
				
				element.appendChild((this.doseFormCd.toXmlElement("Dose_Form_Cd_ME",doc)));
				
				
			}
			
			///id node
			
			if(this.id!=null) {
				Node idNode = doc.createElement("Id_ME");
				idNode.setTextContent(this.id);
				element.appendChild(idNode);
				
			}
			
			///interpreatation cd
			
			if(this.interpretationCd!=null) {
				element.appendChild(this.interpretationCd.toXmlElement("Interpretation_Cd_ME",doc));
			}
			/// method cd
			if(this.methodCd!=null) {
				element.appendChild(this.methodCd.toXmlElement("Method_Cd_ME",doc));
				
			}
			/// mood cd
			if (this.moodCd!= null) {
				element.appendChild(this.moodCd.toXmlElement("Mood_Cd_ME",doc));
			}
			
			/// rate quantity
			
			if (this.rateQuantity!= null) {
				element.appendChild(this.rateQuantity.toXmlElement("Rate_Quantity_ME",doc));
			}
			
					
			/// recording time
			if (this.recordingTime!=null) {
				element.appendChild(this.recordingTime.toXmlElement("Recording_Time_ME",doc));
			}
			
			///route cd
			
			if (this.routeCd!= null) {
				element.appendChild(this.routeCd.toXmlElement("Route_Cd_ME",doc));
				
			}
			
			/// service cd 
			
			if(this.serviceCd!=null) {
				element.appendChild(this.serviceCd.toXmlElement("Service_Cd_ME",doc));
			}
			
			/// status cd
			if(this.statusCd!= null) {
				element.appendChild(this.statusCd.toXmlElement("Status_Cd_ME",doc));
				
			}
			/// strength quantity
			if (this.strengthQuantity!= null) {
				element.appendChild(this.strengthQuantity.toXmlElement("Strength_Quantity_ME",doc));
				
			}
			return element;
			
			
			
		}
		catch(Exception exc) {
			exc.printStackTrace();
			return null;
		}
		
	}
	
	public void fromXmlElement (Element element) {

		try {
		NodeList nodeList = element.getChildNodes();
	
		
		int listLength = nodeList.getLength();
		
		for (int i=0;i<listLength;++i) {
			
			Node current = nodeList.item(i);
			if (current.getNodeType()==Node.ELEMENT_NODE) {
				String tagName = current.getNodeName();
				
				if(tagName.equals("Activity_Time_ME")) {
					this.activityTime = new TimeIntervalEntity();
					this.activityTime.fromXmlElement ((Element) current);
					
				}
				else if(tagName.equals("Body_Site_Cd_ME")) {
					
					this.bodySiteCd = new ConceptEntity();
					this.bodySiteCd.fromXmlElement ((Element) current);
					
				}
			
				else if(tagName.equals("Confidentiality_Cd_ME")) {
					this.confidentialityCd = new SymbolEntity();
					this.confidentialityCd.fromXmlElement ((Element) current);
					
				}
				else if(tagName.equals("Critical_Duration_ME")) {
					this.criticalDuration = new DurationIntervalEntity();
					this.criticalDuration.fromXmlElement ((Element) current);
				}
				else if(tagName.equals("Critical_Time_ME")) {
					this.criticalTime = new TimeIntervalEntity();
					this.criticalTime.fromXmlElement((Element) current);
					
				}
				else if(tagName.equals("Id_ME")) {
					this.id = current.getTextContent();
					
				}
				else if(tagName.equals("Interpretation_Cd_ME")) {
					
					this.interpretationCd =new SymbolEntity();
					this.interpretationCd.fromXmlElement((Element) current);
					
				}
				else if(tagName.equals("Method_Cd_ME")) {
					
					this.methodCd = new ConceptEntity();
					this.methodCd.fromXmlElement((Element) current);
				}
				else if(tagName.equals("Mood_Cd_ME")) {
					this.moodCd = new SymbolEntity();
					this.moodCd.fromXmlElement ((Element) current);
					
				}
				else if(tagName.equals("Recording_Time_ME")) {
					
					this.recordingTime = new TimeLiteralEntity();
					this.recordingTime.fromXmlElement ((Element) current);
					
				}
				else if(tagName.equals("Service_Cd_ME")) {
					
					this.serviceCd = new ConceptEntity();
					this.serviceCd.fromXmlElement((Element)current);
					
				}
				
				else if(tagName.equals("Status_Cd_ME")) {
					
					this.statusCd = new SymbolEntity();
					this.statusCd.fromXmlElement((Element)current);
					
				}
				
				/*
				 * attributes specific to Medication
				 */
				
				else if (tagName.equals("Check_Dose_Quantity_ME")) {
					
					this.checkDoseQuantity = new PhysicalQuantityEntity();
					this.checkDoseQuantity.fromXmlElement((Element)current);
					
				}
				
				else if (tagName.equals("Dosage_Quantity_ME")) {
					this.dosageQuantity = new PhysicalQuantityEntity();
					this.dosageQuantity.fromXmlElement((Element) current);
					
				}
				
				else if (tagName.equals("Dose_Form_Cd_ME")) {
					
					this.doseFormCd = new SymbolEntity();
					this.doseFormCd.fromXmlElement((Element) current);
					
				}
				else if (tagName.equals("Rate_Quantity_ME")) {
					
					this.rateQuantity= new PhysicalQuantityEntity();
					this.rateQuantity.fromXmlElement((Element) current);
					
					
					
				}
				else if (tagName.equals("Route_Cd_ME")) {
					
					this.routeCd = new SymbolEntity();
					this.routeCd.fromXmlElement((Element) current);
					
				}
				else if (tagName.equals("Strength_Quantity_ME")) {
					
					this.strengthQuantity = new PhysicalQuantityEntity();
					this.strengthQuantity.fromXmlElement((Element) current);
					
					
					
				}
				
			}
		}
	}	
	catch(Exception exc) {
		exc.printStackTrace();
	
	}
	
	}
	
	

}

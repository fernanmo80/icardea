package tr.com.srdc.icardea.careplanengine.entities.patientDataEntities;

import  org.w3c.dom.*;
import  org.w3c.dom.Document;

import tr.com.srdc.icardea.careplanengine.agents.guidelineAgent.FactoryRetriever;
import tr.com.srdc.icardea.careplanengine.glmodel.Index;
import tr.com.srdc.icardea.careplanengine.glmodel.Observation;
import tr.com.srdc.icardea.careplanengine.glmodel.Observation_Value;
import tr.com.srdc.icardea.careplanengine.glmodel.Range;
import tr.com.srdc.icardea.careplanengine.glmodel.Ratio;
import tr.com.srdc.icardea.careplanengine.glmodel.Text_Value;

public class ObservationEntity extends PatientDataEntity  {


	

	protected int  certainity;
	
	protected String derivationExpression;
	
	protected RangeEntity normalRange;
	
	protected int severity;
	
	protected ObservationValueEntity value;
		
	
	public ObservationEntity() {
		super();
		// TODO Auto-generated constructor stub
		
	}
	public ObservationEntity(Observation observation, String guidelineURI) {
		
		super(observation);
		
		if (observation.hasCertainty()) {
		 this.certainity = observation.getCertainty();
		}
		
		if (observation.hasDerivation_expression()) {
			this.derivationExpression= new String (observation.getDerivation_expression());
			
		}
		
		if (observation.hasNormal_range()) {
			this.normalRange = new RangeEntity (observation.getNormal_range());
		}
		
		if (observation.hasSeverity()) {
			this.severity = observation.getSeverity();
		}
		
		if (observation.hasValue()) {
			
			Observation_Value val = observation.getValue();
			Observation_Value retrieved = FactoryRetriever.retrieveObservationValue(guidelineURI, val);
			
			if (retrieved instanceof Index) {
				this.value = new IndexEntity((Index)retrieved);
			}
			if (retrieved instanceof Text_Value) {
				this.value = new TextValueEntity((Text_Value)retrieved);
			}
			
			if(retrieved instanceof Range) {
				this.value = new RangeEntity((Range) retrieved);
				
			}
			
			if (retrieved instanceof Ratio) {
				
				this.value = new RatioEntity((Ratio) retrieved);
				
			}
			
			
			
		}
	
		
		
		/*
		 * 
		 */
		//TODO: value'lar eklenecek
	}


	/**
	 * @return Returns the certainity.
	 */
	public int getCertainity() {
		return certainity;
	}


	/**
	 * @param certainity The certainity to set.
	 */
	public void setCertainity(int certainity) {
		this.certainity = certainity;
	}


	/**
	 * @return Returns the derivationExpression.
	 */
	public String getDerivationExpression() {
		return derivationExpression;
	}


	/**
	 * @param derivationExpression The derivationExpression to set.
	 */
	public void setDerivationExpression(String derivationExpression) {
		this.derivationExpression = derivationExpression;
	}


	/**
	 * @return Returns the severity.
	 */
	public int getSeverity() {
		return severity;
	}


	/**
	 * @param severity The severity to set.
	 */
	public void setSeverity(int severity) {
		this.severity = severity;
	}


	/**
	 * @return Returns the value.
	 */
	public ObservationValueEntity getValue() {
		return value;
	}


	/**
	 * @param value The value to set.
	 */
	public void setValue(ObservationValueEntity value) {
		this.value = value;
	}
	
	/**
	 * @return Returns the normalRange.
	 */
	public RangeEntity getNormalRange() {
		return normalRange;
	}


	/**
	 * @param normalRange The normalRange to set.
	 */
	public void setNormalRange(RangeEntity normalRange) {
		this.normalRange = normalRange;
	}
	
	
	public Element  toXmlElement(Document doc) {
		try {
			
			
			Element element= doc.createElement("Observation");
			///activity time
			if(this.activityTime!= null) {
			element.appendChild( this.activityTime.toXmlElement("Activity_Time_OB",doc));
			}
			///bodySite cd
			if(this.bodySiteCd!=null) {
			element.appendChild(this.bodySiteCd.toXmlElement("Body_Site_Cd_OB",doc));
			}
			///certainity
			Node certainityNode = doc.createElement("Certainity_OB");
			certainityNode.setTextContent(""+certainity);
			element.appendChild(certainityNode);
			
			/// confidentialityCd
			if(this.confidentialityCd!=null) {
				element.appendChild(this.confidentialityCd.toXmlElement("Confidentiality_Cd_OB",doc));
			}
			
			/// critical duration
			if(this.criticalDuration!=null) {
				element.appendChild(this.criticalDuration.toXmlElement("Critical_Duration_OB",doc));
			}
			
			/// critical time
			if (this.criticalTime!=null) {
				element.appendChild(this.criticalTime.toXmlElement("Critical_Time_OB",doc));
			}
			/// derivation Expression
			if (this.derivationExpression!= null) {
				Node derivationExpNode = doc.createElement("Derivation_Expression_OB");
				derivationExpNode.setTextContent(this.derivationExpression);
				element.appendChild(derivationExpNode);
			}
			
			///id node
			
			if(this.id!=null) {
				Node idNode = doc.createElement("Id_OB");
				idNode.setTextContent(this.id);
				element.appendChild(idNode);
				
			}
			
			///interpretation cd
			
			if(this.interpretationCd!=null) {
				element.appendChild(this.interpretationCd.toXmlElement("Interpretation_Cd_OB",doc));
			}
			/// method cd
			if(this.methodCd!=null) {
				element.appendChild(this.methodCd.toXmlElement("Method_Cd_OB",doc));
				
			}
			/// mood cd
			if (this.moodCd!= null) {
				element.appendChild(this.moodCd.toXmlElement("Mood_Cd_OB",doc));
			}
			
			/// normal range
			if (this.normalRange!=null) {
				element.appendChild(this.normalRange.toXmlElement("Normal_Range_OB",doc));
			}
			
			/// recording time
			if (this.recordingTime!=null) {
				element.appendChild(this.recordingTime.toXmlElement("Recording_Time_OB",doc));
			}
			
		
			
			/// service cd 
			
			if(this.serviceCd!=null) {
				element.appendChild(this.serviceCd.toXmlElement("Service_Cd_OB",doc));
			}
			
			///severity
			Node severityNode = doc.createElement("Severity_OB");
			severityNode.setTextContent(""+this.severity);
			element.appendChild(severityNode);
			
			/// status cd
			if(this.statusCd!= null) {
				element.appendChild(this.statusCd.toXmlElement("Status_Cd_OB",doc));
				
			}
			/// value
			if (this.value!= null) {
				element.appendChild(this.value.toXmlElement(doc));
			}
			
			
			
			return element;
			
			
		}
		catch(Exception exc) {
			
			
			exc.printStackTrace();
			return null;
			
		}
		
	}
	
	public void fromXmlElement(Element element) {
		try {
			
			NodeList nodeList = element.getChildNodes();
			
			int listLength = nodeList.getLength();
			
			for (int i=0;i<listLength;++i) {
				
				Node current = nodeList.item(i);
				if (current.getNodeType()==Node.ELEMENT_NODE) {
					String tagName = current.getNodeName();
					
					if(tagName.equals("Activity_Time_OB")) {
						this.activityTime = new TimeIntervalEntity();
						this.activityTime.fromXmlElement ((Element) current);
						
					}
					else if(tagName.equals("Body_Site_Cd_OB")) {
						
						this.bodySiteCd = new ConceptEntity();
						this.bodySiteCd.fromXmlElement ((Element) current);
						
					}
					else if(tagName.equals("Certainity_OB")) {
						try {
						this.certainity = Integer.parseInt(current.getTextContent());
						}
						catch (Exception exc) {
							exc.printStackTrace();
						}
						
					}
					else if(tagName.equals("Confidentiality_Cd_OB")) {
						this.confidentialityCd = new SymbolEntity();
						this.confidentialityCd.fromXmlElement ((Element) current);
						
					}
					else if(tagName.equals("Critical_Duration_OB")) {
						this.criticalDuration = new DurationIntervalEntity();
						this.criticalDuration.fromXmlElement ((Element) current);
					}
					else if(tagName.equals("Critical_Time_OB")) {
						this.criticalTime = new TimeIntervalEntity();
						this.criticalTime.fromXmlElement((Element) current);
						
					}
					else if(tagName.equals("Derivation_Expression_OB")) {
						this.derivationExpression = current.getTextContent();
						
					}
					else if(tagName.equals("Id_OB")) {
						this.id = current.getTextContent();
						
					}
					else if(tagName.equals("Interpretation_Cd_OB")) {
						
						this.interpretationCd =new SymbolEntity();
						this.interpretationCd.fromXmlElement((Element) current);
						
					}
					else if(tagName.equals("Method_Cd_OB")) {
						
						this.methodCd = new ConceptEntity();
						this.methodCd.fromXmlElement((Element) current);
					}
					else if(tagName.equals("Mood_Cd_OB")) {
						this.moodCd = new SymbolEntity();
						this.moodCd.fromXmlElement ((Element) current);
						
					}
					else if(tagName.equals("Normal_Range_OB")) {
						
						this.normalRange = new RangeEntity();
						this.normalRange.fromXmlElement ((Element) current);
						
					}
					else if(tagName.equals("Recording_Time_OB")) {
						
						this.recordingTime = new TimeLiteralEntity();
						this.recordingTime.fromXmlElement ((Element) current);
						
					}
					else if(tagName.equals("Service_Cd_OB")) {
						
						this.serviceCd = new ConceptEntity();
						this.serviceCd.fromXmlElement((Element)current);
						
					}
					else if(tagName.equals("Severity_OB")) {
						
						try {
							this.severity = Integer.parseInt(current.getTextContent());
							}
							catch (Exception exc) {
								exc.printStackTrace();
							}
						
						
					}
					else if(tagName.equals("Status_Cd_OB")) {
						
						this.statusCd = new SymbolEntity();
						this.statusCd.fromXmlElement((Element)current);
						
					}
					/*
					 *   
					 *   The part below chooses the type of the value,
					 *   and fills the value attribute
					 * 
					 */
					else if(tagName.equals("Text_Value")) {
						this.value = new TextValueEntity();
						this.value.fromXmlElement((Element)current);
						
					}
					else if(tagName.equals("Physical_Quantity")) {
						
						this.value = new PhysicalQuantityEntity();
						this.value.fromXmlElement((Element)current);
						
					} 
					else if(tagName.equals("Index_Value")) {
						
						this.value = new IndexEntity();
						this.value.fromXmlElement((Element)current);
						
					}
					else if(tagName.equals("Range")) {
						
						this.value = new RangeEntity();
						this.value.fromXmlElement((Element)current);
						
					}	
					else if(tagName.equals("Ratio")) {
						this.value = new RatioEntity();
						this.value.fromXmlElement((Element)current);
						
					}
					
					
				}
			}
			
			
			
		}
		
		catch(Exception exc) {
			exc.printStackTrace();
		}
	}


	
	
	
	

}

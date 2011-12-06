package tr.com.srdc.icardea.careplanengine.agents.guidelineAgent.handlers;

import tr.com.srdc.icardea.careplanengine.agents.guidelineAgent.FactoryRetriever;
import tr.com.srdc.icardea.careplanengine.entities.patientDataEntities.*;
import tr.com.srdc.icardea.careplanengine.glmodel.*;
import tr.com.srdc.icardea.careplanengine.glmodel.impl.*;
import org.xml.sax.*;
import org.w3c.dom.*;



import java.io.*;
import java.util.ArrayList;
import org.apache.xerces.parsers.DOMParser;

public class EHRFiller {

	/**
	 * @param guidelineURI 
	 * @param args
	 */
	public static void fillEMR(EHR_Entity ehrEntity, String data, String guidelineURI) {

		try {

			Data_Item dataItem = ehrEntity.getOutput();

			Data_Item retrievedDataItem = FactoryRetriever.retrieveDataItem(guidelineURI, dataItem);

			Object dataItemValue = FactoryRetriever.retrieveDataItemValue(guidelineURI, retrievedDataItem);

			DOMParser parser = new DOMParser();
			parser.parse(new InputSource(new StringReader(data)));
			Document doc = parser.getDocument();

			Node root = doc.getFirstChild();



			if (dataItemValue instanceof Observation) {

				Observation observation = (Observation) dataItemValue;
				ObservationEntity observationEntity = new ObservationEntity();
				observationEntity.fromXmlElement((Element) root);

				fillObservation(observation, observationEntity, guidelineURI);



			} else if (dataItemValue instanceof Medication) {

				Medication medication = (Medication) dataItemValue;
				MedicationEntity medicationEntity = new MedicationEntity();
				medicationEntity.fromXmlElement((Element) root);
				fillMedication(medication, medicationEntity);

			} else if (dataItemValue instanceof Procedure) {

				Procedure procedure = (Procedure) dataItemValue;

			}


		} catch (Exception exc) {
			exc.printStackTrace();
		}

	}

	public static void fillMedication(Medication medication, MedicationEntity medicationEntity) {
		try {
			TimeIntervalEntity activityTime = medicationEntity.getActivityTime();
			if (activityTime != null) {
				fillTimeInterval(medication.getActivity_time(), activityTime);

			}
		} catch (Exception exc) {
			exc.printStackTrace();
		}
		try {

			ConceptEntity bodySiteCd = medicationEntity.getBodySiteCd();


			if (bodySiteCd != null) {

				fillConcept(medication.getBody_site_cd(), bodySiteCd);

			}

		} catch (Exception exc) {

			exc.printStackTrace();

		}


		PhysicalQuantityEntity checkDoseQuantity = medicationEntity.getCheckDoseQuantity();

		try {
			if (checkDoseQuantity != null) {
				fillPQ(medication.getCheck_dose_quantity(), checkDoseQuantity);
			}


		} catch (Exception exc) {

			exc.printStackTrace();

		}


		try {
			SymbolEntity confidentialityCd = medicationEntity.getConfidentialityCd();
			if (confidentialityCd != null) {

				medication.setConfidentiality_cd(confidentialityCd.getSymbolValue());

			}




		} catch (Exception exc) {

			exc.printStackTrace();

		}

		try {
			DurationIntervalEntity criticalDuration = medicationEntity.getCriticalDuration();

			if (criticalDuration != null) {

				fillDurationInterval(medication.getCritical_duration(), criticalDuration);


			}


		} catch (Exception exc) {
			exc.printStackTrace();

		}

		try {
			TimeIntervalEntity criticalTime = medicationEntity.getCriticalTime();

			if (criticalTime != null) {
				fillTimeInterval(medication.getCritical_time(), criticalTime);



			}


		} catch (Exception exc) {
			exc.printStackTrace();

		}

		try {
			PhysicalQuantityEntity dosageQuantity = medicationEntity.getDosageQuantity();

			if (dosageQuantity != null) {
				fillPQ(medication.getDosage_quantity(), dosageQuantity);

			}

		} catch (Exception exc) {

			exc.printStackTrace();

		}

		try {

			SymbolEntity doseFormCd = medicationEntity.getDoseFormCd();

			if (doseFormCd != null) {
				medication.setDoseform_cd(doseFormCd.getSymbolValue());

			}

		} catch (Exception exc) {

			exc.printStackTrace();

		}

		try {

			String id = medicationEntity.getId();

			if (id != null) {

				medication.setId(id);

			}


		} catch (Exception exc) {
			exc.printStackTrace();

		}

		try {
			SymbolEntity interpretationCd = medicationEntity.getInterpretationCd();

			if (interpretationCd != null) {

				ArrayList list = new ArrayList();
				list.add(new String(interpretationCd.getSymbolValue()));
				medication.setInterpretation_cd(list);




			}


		} catch (Exception exc) {
			exc.printStackTrace();

		}

		try {
			ConceptEntity methodCd = medicationEntity.getMethodCd();

			if (methodCd != null) {


				fillConcept(medication.getMethod_cd(), methodCd);




			}


		} catch (Exception exc) {
			exc.printStackTrace();

		}

		try {
			SymbolEntity moodCd = medicationEntity.getMoodCd();

			if (moodCd != null) {

				medication.setMood_cd(moodCd.getSymbolValue());


			}


		} catch (Exception exc) {
			exc.printStackTrace();

		}
		try {
			PhysicalQuantityEntity rateQuantity = medicationEntity.getRateQuantity();
			if (rateQuantity != null) {

				fillPQ(medication.getRate_quantity(), rateQuantity);


			}
		} catch (Exception exc) {
			exc.printStackTrace();


		}
		try {
			TimeLiteralEntity recordingTime = medicationEntity.getRecordingTime();

			if (recordingTime != null) {

				fillTimeLiteral(medication.getRecording_time(), recordingTime);


			}


		} catch (Exception exc) {
			exc.printStackTrace();

		}

		try {
			SymbolEntity routeCd = medicationEntity.getRouteCd();
			if (routeCd != null) {
				medication.setRoute_cd(routeCd.getSymbolValue());
			}

		} catch (Exception exc) {

			exc.printStackTrace();

		}
		try {
			ConceptEntity serviceCd = medicationEntity.getServiceCd();


			if (serviceCd != null) {

				fillConcept(medication.getService_cd(), serviceCd);

			}


		} catch (Exception exc) {
			exc.printStackTrace();

		}


		try {
			SymbolEntity statusCd = medicationEntity.getStatusCd();
			if (statusCd != null) {
				medication.setStatus_cd(statusCd.getSymbolValue());
			}


		} catch (Exception exc) {
			exc.printStackTrace();
		}


		try {
			PhysicalQuantityEntity strengthQuantity = medicationEntity.getStrengthQuantity();
			if (strengthQuantity != null) {
				fillPQ(medication.getStrength_quantity(), strengthQuantity);
			}


		} catch (Exception exc) {

			exc.printStackTrace();

		}


	}

	public static void fillProcedure(Procedure procedure, ProcedureEntity procedureEntity) {

		try {
			TimeIntervalEntity activityTime = procedureEntity.getActivityTime();
			if (activityTime != null) {
				fillTimeInterval(procedure.getActivity_time(), activityTime);

			}
		} catch (Exception exc) {
			exc.printStackTrace();
		}

		try {

			ConceptEntity bodySiteCd = procedureEntity.getBodySiteCd();


			if (bodySiteCd != null) {

				fillConcept(procedure.getBody_site_cd(), bodySiteCd);

			}

		} catch (Exception exc) {

			exc.printStackTrace();

		}






		try {
			SymbolEntity confidentialityCd = procedureEntity.getConfidentialityCd();
			if (confidentialityCd != null) {

				procedure.setConfidentiality_cd(confidentialityCd.getSymbolValue());

			}




		} catch (Exception exc) {

			exc.printStackTrace();

		}


		try {
			DurationIntervalEntity criticalDuration = procedureEntity.getCriticalDuration();

			if (criticalDuration != null) {

				fillDurationInterval(procedure.getCritical_duration(), criticalDuration);


			}


		} catch (Exception exc) {
			exc.printStackTrace();

		}

		try {
			TimeIntervalEntity criticalTime = procedureEntity.getCriticalTime();

			if (criticalTime != null) {
				fillTimeInterval(procedure.getCritical_time(), criticalTime);



			}


		} catch (Exception exc) {
			exc.printStackTrace();

		}




		try {

			String id = procedureEntity.getId();

			if (id != null) {

				procedure.setId(id);

			}


		} catch (Exception exc) {
			exc.printStackTrace();

		}

		try {
			SymbolEntity interpretationCd = procedureEntity.getInterpretationCd();

			if (interpretationCd != null) {

				ArrayList list = new ArrayList();
				list.add(new String(interpretationCd.getSymbolValue()));
				procedure.setInterpretation_cd(list);




			}


		} catch (Exception exc) {
			exc.printStackTrace();

		}

		try {
			ConceptEntity methodCd = procedureEntity.getMethodCd();

			if (methodCd != null) {


				fillConcept(procedure.getMethod_cd(), methodCd);




			}


		} catch (Exception exc) {
			exc.printStackTrace();

		}

		try {
			SymbolEntity moodCd = procedureEntity.getMoodCd();

			if (moodCd != null) {

				procedure.setMood_cd(moodCd.getSymbolValue());


			}


		} catch (Exception exc) {
			exc.printStackTrace();

		}

		try {
			TimeLiteralEntity recordingTime = procedureEntity.getRecordingTime();

			if (recordingTime != null) {

				fillTimeLiteral(procedure.getRecording_time(), recordingTime);


			}


		} catch (Exception exc) {
			exc.printStackTrace();

		}


		try {
			ConceptEntity serviceCd = procedureEntity.getServiceCd();


			if (serviceCd != null) {

				fillConcept(procedure.getService_cd(), serviceCd);

			}


		} catch (Exception exc) {
			exc.printStackTrace();

		}


		try {
			SymbolEntity statusCd = procedureEntity.getStatusCd();
			if (procedure.getStatus_cd() != null) {
				procedure.setStatus_cd(statusCd.getSymbolValue());

			}


		} catch (Exception exc) {
			exc.printStackTrace();
		}


		try {
			ConceptEntity entrySiteCd = procedureEntity.getEntrySiteCd();
			if (procedure.getEntry_site_cd() != null) {
				fillConcept(procedure.getEntry_site_cd(), entrySiteCd);

			}


		} catch (Exception exc) {
			exc.printStackTrace();

		}


	}

	public static void fillObservation(Observation observation, ObservationEntity observationEntity, String guidelineURI) {

		try {
			TimeIntervalEntity activityTime = observationEntity.getActivityTime();
			if (activityTime != null) {
				fillTimeInterval(observation.getActivity_time(), activityTime);

			}
		} catch (Exception exc) {
			exc.printStackTrace();
		}

		try {
			ConceptEntity bodySiteCd = observationEntity.getBodySiteCd();

			if (bodySiteCd != null) {
				fillConcept(observation.getBody_site_cd(), bodySiteCd);
			}
		} catch (Exception exc) {
			exc.printStackTrace();

		}

		try {
			observation.setCertainty(observationEntity.getCertainity());
		} catch (Exception exc) {

			exc.printStackTrace();

		}

		try {
			SymbolEntity confidentialityCd = observationEntity.getConfidentialityCd();
			if (confidentialityCd != null) {

				observation.setConfidentiality_cd(confidentialityCd.getSymbolValue());

			}




		} catch (Exception exc) {

			exc.printStackTrace();

		}

		try {
			DurationIntervalEntity criticalDuration = observationEntity.getCriticalDuration();

			if (criticalDuration != null) {

				fillDurationInterval(observation.getCritical_duration(), criticalDuration);


			}


		} catch (Exception exc) {
			exc.printStackTrace();

		}

		try {
			TimeIntervalEntity criticalTime = observationEntity.getCriticalTime();

			if (criticalTime != null) {
				fillTimeInterval(observation.getCritical_time(), criticalTime);



			}


		} catch (Exception exc) {
			exc.printStackTrace();

		}

		try {
			String derivationExpression = observationEntity.getDerivationExpression();

			if (derivationExpression != null) {

				observation.setDerivation_expression(derivationExpression);

			}


		} catch (Exception exc) {
			exc.printStackTrace();

		}

		try {

			String id = observationEntity.getId();

			if (id != null) {

				observation.setId(id);

			}


		} catch (Exception exc) {
			exc.printStackTrace();

		}

		try {
			SymbolEntity interpretationCd = observationEntity.getInterpretationCd();

			if (interpretationCd != null) {

				ArrayList list = new ArrayList();
				list.add(new String(interpretationCd.getSymbolValue()));
				observation.setInterpretation_cd(list);




			}


		} catch (Exception exc) {
			exc.printStackTrace();

		}

		try {
			ConceptEntity methodCd = observationEntity.getMethodCd();

			if (methodCd != null) {


				fillConcept(observation.getMethod_cd(), methodCd);




			}


		} catch (Exception exc) {
			exc.printStackTrace();

		}

		try {
			SymbolEntity moodCd = observationEntity.getMoodCd();

			if (moodCd != null) {

				observation.setMood_cd(moodCd.getSymbolValue());


			}


		} catch (Exception exc) {
			exc.printStackTrace();

		}

		try {
			RangeEntity normalRange = observationEntity.getNormalRange();

			if (normalRange != null) {

				fillRange(observation.getNormal_range(), normalRange);


			}


		} catch (Exception exc) {
			exc.printStackTrace();

		}

		try {
			TimeLiteralEntity recordingTime = observationEntity.getRecordingTime();

			if (recordingTime != null) {

				fillTimeLiteral(observation.getRecording_time(), recordingTime);


			}


		} catch (Exception exc) {
			exc.printStackTrace();

		}



		try {
			ConceptEntity serviceCd = observationEntity.getServiceCd();


			if (serviceCd != null) {

				fillConcept(observation.getService_cd(), serviceCd);

			}


		} catch (Exception exc) {
			exc.printStackTrace();

		}

		try {
			int severity = observationEntity.getSeverity();
			observation.setSeverity(severity);



		} catch (Exception exc) {
			exc.printStackTrace();
		}

		try {
			SymbolEntity statusCd = observationEntity.getStatusCd();
			if (observation.getStatus_cd() != null) {
				observation.setStatus_cd(statusCd.getSymbolValue());

			}


		} catch (Exception exc) {
			exc.printStackTrace();
		}




		try {
			ObservationValueEntity value = observationEntity.getValue();

			if (value != null) {
				fillValue(observation.getValue(), value, guidelineURI);
			}



		} catch (Exception exc) {
			exc.printStackTrace();
		}






	}

	private static void fillValue(Observation_Value value, ObservationValueEntity valueEntity, String guidelineURI) {


		try {
			if (value == null) {
			}
			Observation_Value retrieved = FactoryRetriever.retrieveObservationValue(guidelineURI, value);
			if (retrieved instanceof Text_Value) {
				Text_Value textVal = (Text_Value) retrieved;
				textVal.setText(((TextValueEntity) valueEntity).getText());

			} else if (retrieved instanceof Index) {
				Index indexVal = (Index) retrieved;
				try {

					indexVal.setIndex(((IndexEntity) valueEntity).getIndex());
				} catch (ClassCastException cce) {
					String indexText = ((TextValueEntity) valueEntity).getText();
					indexVal.setIndex(Float.parseFloat(indexText));

				}


			} else if (retrieved instanceof Range) {
				Range rangeVal = (Range) retrieved;
				RangeEntity rangeEntity = (RangeEntity) valueEntity;

				fillRange(rangeVal, rangeEntity);


			}
		} catch (Exception exc) {

			exc.printStackTrace();

		}



	}

	private static void fillTimeLiteral(Time_Literal timeLiteral, TimeLiteralEntity timeLiteralEntity) {

		try {
			String day = timeLiteralEntity.getDay();
			if (day != null) {
				timeLiteral.setDay(day);
			}
		} catch (Exception exc) {

			exc.printStackTrace();
		}

		try {
			String displayName = timeLiteralEntity.getDisplayName();
			if (displayName != null) {
				timeLiteral.setDisplay_name(displayName);
			}
		} catch (Exception exc) {

			exc.printStackTrace();
		}

		try {
			String hour = timeLiteralEntity.getHour();
			if (hour != null) {
				timeLiteral.setHour(hour);
			}
		} catch (Exception exc) {

			exc.printStackTrace();
		}

		try {
			String millisecond = timeLiteralEntity.getMillisecond();
			if (millisecond != null) {
				timeLiteral.setMillisecond(millisecond);
			}
		} catch (Exception exc) {

			exc.printStackTrace();
		}

		try {
			String minute = timeLiteralEntity.getMinute();
			if (minute != null) {
				timeLiteral.setMinute(minute);
			}
		} catch (Exception exc) {

			exc.printStackTrace();
		}

		try {
			String month = timeLiteralEntity.getMonth();
			if (month != null) {
				timeLiteral.setMonth(month);
			}
		} catch (Exception exc) {

			exc.printStackTrace();
		}

		try {
			String hour = timeLiteralEntity.getHour();
			if (hour != null) {
				timeLiteral.setHour(hour);
			}
		} catch (Exception exc) {

			exc.printStackTrace();
		}

		try {
			String plusHour = timeLiteralEntity.getPlusHour();

			if (plusHour != null) {
				timeLiteral.setPlus_hour(plusHour);
			}
		} catch (Exception exc) {

			exc.printStackTrace();
		}

		try {
			String second = timeLiteralEntity.getSecond();
			if (second != null) {
				timeLiteral.setSecond(second);
			}
		} catch (Exception exc) {

			exc.printStackTrace();
		}

		try {
			String year = timeLiteralEntity.getYear();
			if (year != null) {
				timeLiteral.setYear(year);
			}
		} catch (Exception exc) {

			exc.printStackTrace();
		}

		try {
			SymbolEntity timeZone = timeLiteralEntity.getTimeZone();
			if (timeZone != null) {
				timeLiteral.setTime_zone(timeZone.getSymbolValue());
			}
		} catch (Exception exc) {

			exc.printStackTrace();
		}



	}

	private static void fillRange(Range range, RangeEntity rangeEntity) {

		try {
			if (range.getDisplay_name() != null) {

				range.setDisplay_name(rangeEntity.getDisplayName());
			}

		} catch (Exception exc) {
			exc.printStackTrace();


		}
		try {
			PhysicalQuantityEntity lower = rangeEntity.getLowerBound();
			if (lower != null) {

				fillPQ(range.getLower_bound(), lower);
			}

		} catch (Exception exc) {
			exc.printStackTrace();


		}
		try {
			PhysicalQuantityEntity upper = rangeEntity.getUpperBound();
			if (upper != null) {

				fillPQ(range.getUpper_bound(), upper);
			}

		} catch (Exception exc) {
			exc.printStackTrace();


		}
	}

	private static void fillPQ(Physical_Quantity pq, PhysicalQuantityEntity pqEntity) {
		try {
			pq.setDisplay_name(pqEntity.getDisplayName());

		} catch (Exception exc) {
			exc.printStackTrace();

		}

		try {
			pq.setPq_value(pqEntity.getPqValue());

		} catch (Exception exc) {
			exc.printStackTrace();

		}

		try {

			pq.setPrecision(pqEntity.getPrecision());

		} catch (Exception exc) {
			exc.printStackTrace();

		}

		try {
			pq.setUnit(pqEntity.getUnit());

		} catch (Exception exc) {
			exc.printStackTrace();

		}

	}

	private static void fillDurationInterval(Duration_Interval durationInterval, DurationIntervalEntity durationIntervalEntity) {

		try {



			DurationEntity maxDuration = durationIntervalEntity.getMaxDuration();

			if (maxDuration != null) {

				fillDuration(durationInterval.getMax_duration(), maxDuration);

			}


			DurationEntity minDuration = durationIntervalEntity.getMinDuration();

			if (minDuration != null) {

				fillDuration(durationInterval.getMin_duration(), minDuration);

			}

			if (durationInterval.hasDisplay_name()) {

				durationInterval.setDisplay_name(durationIntervalEntity.getDisplayName());

			}





		} catch (Exception exc) {

			exc.printStackTrace();

		}

	}

	private static void fillDuration(Duration duration, DurationEntity durationEntity) {
		// TODO Auto-generated method stub
		try {
			if (duration.hasDisplay_name()) {
				duration.setDisplay_name(durationEntity.getDisplayName());
			}

			if (duration.hasSpecification()) {
				duration.setSpecification(durationEntity.getSpecification());
			}

			if (duration.hasEncoding_language()) {
				duration.setEncoding_language(durationEntity.getEncodingLanguage());
			}

		} catch (Exception exc) {
			exc.printStackTrace();

		}
	}

	private static void fillConcept(Concept concept, ConceptEntity conceptEntity) {

		if (concept == null) {
		}
		try {
			if (concept.hasConcept_id()) {
				concept.setConcept_id(conceptEntity.getConceptID());

			}

			if (concept.hasConcept_name()) {
				concept.setConcept_name(conceptEntity.getConceptName());

			}

			if (concept.hasConcept_source()) {
				concept.setConcept_source(conceptEntity.getConceptSource());

			}
		} catch (Exception exc) {

			exc.printStackTrace();

		}

	}

	private static void fillTimeInterval(Time_Interval timeInterval, TimeIntervalEntity timeIntervalEntity) {

		try {

			if (timeInterval.hasDisplay_name()) {

				timeInterval.setDisplay_name(timeIntervalEntity.getDisplayName());

			}
			try {
				TimeLiteralEntity minTimeStamp = timeIntervalEntity.getMinTimeStamp();
				if (minTimeStamp != null) {
					fillTimeLiteral(timeInterval.getMin_time_stamp(), minTimeStamp);

				}

			} catch (Exception exc) {
				exc.printStackTrace();

			}


			try {
				TimeLiteralEntity maxTimeStamp = timeIntervalEntity.getMaxTimeStamp();
				if (maxTimeStamp != null) {
					fillTimeLiteral(timeInterval.getMax_time_stamp(), maxTimeStamp);

				}

			} catch (Exception exc) {
				exc.printStackTrace();

			}
		} catch (Exception exc) {
			exc.printStackTrace();
		}

	}

	@SuppressWarnings("unused")
	private static void fillValue(Observation observation, Node valueNode, String guidelineURI) {
		try {
			String valueType = valueNode.getNodeName();

			if (valueType.equals("Text_Value")) {
				Node textNode = valueNode.getFirstChild();
				if (textNode.getNodeType() == Node.TEXT_NODE) {

					Observation_Value val = FactoryRetriever.retrieveObservationValue(guidelineURI, observation.getValue());
					if (val instanceof DefaultText_Value) {
						((DefaultText_Value) val).setText(textNode.getTextContent().trim());

					}

				}

			} else if (valueType.equals("Index_Value")) {
				Node indexNode = ((Element) valueNode).getElementsByTagName("Index").item(0);
				if (indexNode.getNodeType() == Node.ELEMENT_NODE) {

					String indexValue = indexNode.getTextContent();
					Observation_Value val = FactoryRetriever.retrieveObservationValue(guidelineURI, observation.getValue());
					if (val instanceof DefaultIndex) {
						((DefaultIndex) val).setIndex(Float.parseFloat(indexValue));
					}

				}
			}

		} catch (Exception exc) {
			exc.printStackTrace();
		}


	}

	private static void fillTimeInterval(Time_Literal timeLiteral, Node node) {

		try {
			/// add year
			NodeList yearList = ((Element) node).getElementsByTagName("Year");

			if (yearList != null) {
				Node yearNode = yearList.item(0);
				String yearStr = yearNode.getTextContent().trim();
				if (yearStr.equals("")) {
					yearStr = "0";
				}
				timeLiteral.setYear(yearStr);


			} else {
				timeLiteral.setYear("0");
			}


			/// add month
			NodeList monthList = ((Element) node).getElementsByTagName("Month");

			if (monthList != null) {
				Node monthNode = monthList.item(0);
				String monthStr = monthNode.getTextContent().trim();
				if (monthStr.equals("")) {
					monthStr = "0";
				}
				timeLiteral.setMonth(monthStr);


			} else {
				timeLiteral.setMonth("0");
			}


			/// add day

			NodeList dayList = ((Element) node).getElementsByTagName("Day");

			if (dayList != null) {
				Node dayNode = dayList.item(0);
				String dayStr = dayNode.getTextContent().trim();
				if (dayStr.equals("")) {
					dayStr = "0";
				}
				timeLiteral.setDay(dayStr);
			} else {
				timeLiteral.setDay("0");
			}



			/// add hour
			NodeList hourList = ((Element) node).getElementsByTagName("Hour");

			if (hourList != null) {
				Node hourNode = hourList.item(0);
				String hourStr = hourNode.getTextContent().trim();
				if (hourStr.equals("")) {
					hourStr = "0";
				}
				timeLiteral.setHour(hourStr);

			} else {
				timeLiteral.setHour("0");
			}
			/// add minute

			NodeList minuteList = ((Element) node).getElementsByTagName("Minute");

			if (minuteList != null) {
				Node minuteNode = minuteList.item(0);
				String minuteStr = minuteNode.getTextContent().trim();
				if (minuteStr.equals("")) {
					minuteStr = "0";
				}
				timeLiteral.setMinute(minuteStr);
			} else {
				timeLiteral.setMinute("0");
			}




			/// add second
			NodeList secondList = ((Element) node).getElementsByTagName("Second");

			if (secondList != null) {
				Node secondNode = secondList.item(0);
				String secondStr = secondNode.getTextContent().trim();
				if (secondStr.equals("")) {
					secondStr = "0";
				}
				timeLiteral.setSecond(secondStr);
			} else {
				timeLiteral.setSecond("0");
			}

			/*
			Logger.getLogger(this.getClass()).log(Level.DEBUG, (timeLiteral.getYear());
			Logger.getLogger(this.getClass()).log(Level.DEBUG, (timeLiteral.getMonth());
			Logger.getLogger(this.getClass()).log(Level.DEBUG, (timeLiteral.getDay());
			Logger.getLogger(this.getClass()).log(Level.DEBUG, (timeLiteral.getHour());
			Logger.getLogger(this.getClass()).log(Level.DEBUG, (timeLiteral.getMinute());
			Logger.getLogger(this.getClass()).log(Level.DEBUG, (timeLiteral.getSecond());

			 */


		} catch (Exception exc) {
			exc.printStackTrace();

		}


	}
}

package de.offis.health.icardea.cied.pdf.parser;

import org.apache.log4j.Logger;

import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;

import de.offis.health.icardea.cied.hl7.oru.ORU_OBX;
import de.offis.health.icardea.cied.pdf.interfaces.OBXParserInterface_BatteryandLead;
import de.offis.health.icardea.cied.pdf.interfaces.OBXParserInterface_Parameters;
import de.offis.health.icardea.cied.pdf.interfaces.OBXParserInterface_TransmissionNotes;
import de.offis.health.icardea.cied.pdf.interfaces.OBXParserInterface_VTVFCounters;
import de.offis.health.icardea.common.exception.InvalidParameterValueException;
import de.offis.health.icardea.common.exception.PropertyFileNotFoundException;
import de.offis.health.icardea.common.exception.PropertyNotFoundException;
import de.offis.health.icardea.tools.GlobalTools;

/**
 * This class offers setObservationValue for only iCARDEA PPM required
 * items
 * 
 * @author MYang
 */

public class OBXParser_Nomenclature_ICARDEA extends AbstractPDFParser {
	private static Logger logger = Logger.getLogger(OBXParser_Nomenclature_ICARDEA.class);
	
	private OBXParser_Nomenclature_ICARDEA() throws InvalidParameterValueException, PropertyFileNotFoundException {
		super("ICARDEANomenclature", "en");
	}
	
	public OBXParser_Nomenclature_ICARDEA(String languageCode) throws InvalidParameterValueException, PropertyFileNotFoundException {
		super("ICARDEANomenclature", languageCode);
	}
	
	/*
	 * Common OBX Value except setObservationValue
	 */
	private ORU_OBX ORU_SetValue (int idc_nomenclature_index, ORU_OBX oru_obx) throws PropertyNotFoundException{
		oru_obx.setValueType(getProperty(String.valueOf(idc_nomenclature_index)+"_ValueType"));
		oru_obx.setObservationIdentifier_identifier(String.valueOf(idc_nomenclature_index));
		oru_obx.setObservationIdentifier_text(getProperty(String.valueOf(idc_nomenclature_index)+"_ObservationIdentifier_text"));
		oru_obx.setObservationIdentifier_nameOfCodingSystem("ICARDEA");
		
		oru_obx.setObservationNameOfCodingSystem(getProperty(String.valueOf(idc_nomenclature_index)+"_Observation_Name_Of_CodingSystem"));
		oru_obx.setObservationValueIdentifier(getProperty(String.valueOf(idc_nomenclature_index)+"_Observation_Value_Identifier"));
		//oru_obx.setObservationValue is under below
		
		oru_obx.setUnits_Identifier(getProperty(String.valueOf(idc_nomenclature_index)+"_Units_identifier"));
		oru_obx.setAbnormalFlags("");
		oru_obx.setObservationResultStatus("F");
		oru_obx.setDateTimeoftheObservation_time("");
		oru_obx.setObservationMethod_identifier("");
		oru_obx.setObservationMethod_text("");
		oru_obx.setObservationSubID(getProperty(String.valueOf(idc_nomenclature_index)+"_Observation_Sub_ID"));
		
		return oru_obx;
	}
	
	public ORU_OBX parse_obx_BatteryandLeadMeasurements (String observationValue, int idc_nomenclature_index) throws PropertyNotFoundException
	{
		ORU_OBX oru_obx=new ORU_OBX();
		oru_obx=ORU_SetValue(idc_nomenclature_index, oru_obx);
		switch(idc_nomenclature_index) {
	
		case 180404:
			oru_obx.setObservationValue(observationValue);
			break;
		default:
			oru_obx.setObservationValue("");
			break;
		}
		return oru_obx;
	}

	public ORU_OBX parse_obx_Parameters (int observation_Sub_ID, String observationValue, int idc_nomenclature_index) throws PropertyNotFoundException
	{
		ORU_OBX oru_obx=new ORU_OBX();
		oru_obx=ORU_SetValue(idc_nomenclature_index, oru_obx);
		switch(idc_nomenclature_index) {
		
		case 180406:
			oru_obx.setObservationValue(observationValue);
			oru_obx.setObservationSubID(String.valueOf(observation_Sub_ID));
			break;
		case 180407:
			oru_obx.setObservationValue(observationValue);
			oru_obx.setObservationSubID(String.valueOf(observation_Sub_ID));
			break;
		case 180408:
			oru_obx.setObservationValue(observationValue);
			oru_obx.setObservationSubID(String.valueOf(observation_Sub_ID));
			break;
		default:
			oru_obx.setObservationValue("");
			break;
		}
		return oru_obx;
	}
}

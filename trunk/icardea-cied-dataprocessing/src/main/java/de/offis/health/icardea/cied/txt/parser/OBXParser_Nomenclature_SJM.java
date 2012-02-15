package de.offis.health.icardea.cied.txt.parser;

import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;

import de.offis.health.icardea.cied.hl7.oru.ORU_OBX;
import de.offis.health.icardea.cied.pdf.interfaces.OBXParserInterface_BatteryandLead;
import de.offis.health.icardea.cied.pdf.interfaces.OBXParserInterface_Parameters;
import de.offis.health.icardea.cied.pdf.interfaces.OBXParserInterface_TransmissionNotes;
import de.offis.health.icardea.cied.pdf.interfaces.OBXParserInterface_VTVFCounters;
import de.offis.health.icardea.cied.pdf.parser.AbstractPDFParser;
import de.offis.health.icardea.cied.pdf.parser.PDF2HL7_HAPI_Parser;
import de.offis.health.icardea.common.exception.InvalidParameterValueException;
import de.offis.health.icardea.common.exception.PropertyFileNotFoundException;
import de.offis.health.icardea.common.exception.PropertyNotFoundException;
import de.offis.health.icardea.tools.GlobalTools;

public class OBXParser_Nomenclature_SJM extends AbstractPDFParser {
	
	private static Logger logger = Logger.getLogger(OBXParser_Nomenclature_SJM.class);
	
	private OBXParser_Nomenclature_SJM() throws InvalidParameterValueException, PropertyFileNotFoundException {
		super("IEEENomenclature", "en");
	}
	
	public OBXParser_Nomenclature_SJM(String languageCode) throws InvalidParameterValueException, PropertyFileNotFoundException {
		super("IEEENomenclature", languageCode);
	}
	/*
	 * Common OBX Value except setObservationValue
	 */
	private ORU_OBX ORU_SetValue (int idc_nomenclature_index, ORU_OBX oru_obx) throws PropertyNotFoundException{
		oru_obx.setValueType(getProperty(String.valueOf(idc_nomenclature_index)+"_ValueType"));
		oru_obx.setObservationIdentifier_identifier(String.valueOf(idc_nomenclature_index));
		oru_obx.setObservationIdentifier_text(getProperty(String.valueOf(idc_nomenclature_index)+"_ObservationIdentifier_text"));
		oru_obx.setObservationIdentifier_nameOfCodingSystem("MDC");
		
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
	
	public ORU_OBX parse_obx_MDC_IDC_PG (String observationValue, int idc_nomenclature_index) throws PropertyNotFoundException
	{
		ORU_OBX oru_obx=new ORU_OBX();
		oru_obx=ORU_SetValue(idc_nomenclature_index, oru_obx);
		
		switch(idc_nomenclature_index) {
		case 720897:
			oru_obx.setObservationValue(observationValue);
			break;
		case 720898:
			oru_obx.setObservationValue(observationValue);
			break;	
		case 720899:
			oru_obx.setObservationValue(observationValue);
			break;	
		case 720900:
			oru_obx.setObservationValue(observationValue);
			break;	
		case 721025:
			oru_obx.setObservationValue(observationValue);
			break;	
		case 721026:
			oru_obx.setObservationValue(observationValue);
			break;	
		default:
			oru_obx.setObservationValue("");
			break;
		}
		return oru_obx;
	}
	
	public ORU_OBX parse_obx_MDC_IDC_MSMT_BATTERY(int observation_Sub_ID,
			String observationValue, int idc_nomenclature_index) throws PropertyNotFoundException {
		ORU_OBX oru_obx=new ORU_OBX();
		oru_obx=ORU_SetValue(idc_nomenclature_index, oru_obx);
		
		switch(idc_nomenclature_index) {
		case 721216:
			oru_obx.setObservationValue(observationValue);
			oru_obx.setObservationSubID(String.valueOf(observation_Sub_ID));
			break;
		case 721344:
			oru_obx.setObservationValue(observationValue);
			oru_obx.setObservationSubID(String.valueOf(observation_Sub_ID));
			break;
		default:
			oru_obx.setObservationValue("");
			break;
		}
		return oru_obx;
	}
	
	public ORU_OBX parse_obx_MDC_IDC_LEAD(int observation_Sub_ID,
			String observationValue, int idc_nomenclature_index) throws PropertyNotFoundException {
		ORU_OBX oru_obx=new ORU_OBX();
		oru_obx=ORU_SetValue(idc_nomenclature_index, oru_obx);
		
		switch(idc_nomenclature_index) {
		case 721216:
			oru_obx.setObservationValue(observationValue);
			oru_obx.setObservationSubID(String.valueOf(observation_Sub_ID));
			break;
		case 721344:
			oru_obx.setObservationValue(observationValue);
			oru_obx.setObservationSubID(String.valueOf(observation_Sub_ID));
			break;
		default:
			oru_obx.setObservationValue("");
			break;
		}
		return oru_obx;
	}
	
	public ORU_OBX parse_obx_MDC_IDC_MSMT_CAP(int observation_Sub_ID,
			String observationValue, int idc_nomenclature_index) throws PropertyNotFoundException {
		ORU_OBX oru_obx=new ORU_OBX();
		oru_obx=ORU_SetValue(idc_nomenclature_index, oru_obx);
		
		switch(idc_nomenclature_index) {
		case 721664:
			oru_obx.setObservationValue(observationValue);
			oru_obx.setObservationSubID(String.valueOf(observation_Sub_ID));
			break;
		case 721728:
			oru_obx.setObservationValue(observationValue);
			oru_obx.setObservationSubID(String.valueOf(observation_Sub_ID));
			break;
		default:
			oru_obx.setObservationValue("");
			break;
		}
		return oru_obx;
	}
	
	public ORU_OBX parse_obx_MDC_IDC_SET_BRADY(int observation_Sub_ID,
			String observationValue, int idc_nomenclature_index) throws PropertyNotFoundException {
		ORU_OBX oru_obx=new ORU_OBX();
		oru_obx=ORU_SetValue(idc_nomenclature_index, oru_obx);
		
		switch(idc_nomenclature_index) {
		case 730752:
			oru_obx.setObservationValue(observationValue);
			oru_obx.setObservationSubID(String.valueOf(observation_Sub_ID));
			break;
		case 730816:
			oru_obx.setObservationValue(observationValue);
			oru_obx.setObservationSubID(String.valueOf(observation_Sub_ID));
			break;
		case 730880:
			oru_obx.setObservationValue(observationValue);
			oru_obx.setObservationSubID(String.valueOf(observation_Sub_ID));
			break;
		case 731136:
			oru_obx.setObservationValue(observationValue);
			oru_obx.setObservationSubID(String.valueOf(observation_Sub_ID));
			break;
		case 731200:
			oru_obx.setObservationValue(observationValue);
			oru_obx.setObservationSubID(String.valueOf(observation_Sub_ID));
			break;
		case 731264:
			oru_obx.setObservationValue(observationValue);
			oru_obx.setObservationSubID(String.valueOf(observation_Sub_ID));
			break;
		case 731328:
			oru_obx.setObservationValue(observationValue);
			oru_obx.setObservationSubID(String.valueOf(observation_Sub_ID));
			break;
		default:
			oru_obx.setObservationValue("");
			break;
		}
		return oru_obx;
	}

	public ORU_OBX parse_obx_MDC_IDC_SET_LEADCHNL_CHAMBER_SENSING(int observation_Sub_ID,
			String observationValue, int idc_nomenclature_index) throws PropertyNotFoundException {
		ORU_OBX oru_obx=new ORU_OBX();
		oru_obx=ORU_SetValue(idc_nomenclature_index, oru_obx);
		
		switch(idc_nomenclature_index) {
		case 729536:
			oru_obx.setObservationValue(observationValue);
			oru_obx.setObservationSubID(String.valueOf(observation_Sub_ID));
			break;
		case 729537:
			oru_obx.setObservationValue(observationValue);
			oru_obx.setObservationSubID(String.valueOf(observation_Sub_ID));
			break;
		case 729538:
			oru_obx.setObservationValue(observationValue);
			oru_obx.setObservationSubID(String.valueOf(observation_Sub_ID));
			break;
		default:
			oru_obx.setObservationValue("");
			break;
		}
		return oru_obx;
	}
	
	public ORU_OBX parse_obx_MDC_IDC_SET_LEADCHNL_CHAMBER_PACING(int observation_Sub_ID,
			String observationValue, int idc_nomenclature_index) throws PropertyNotFoundException {
		ORU_OBX oru_obx=new ORU_OBX();
		oru_obx=ORU_SetValue(idc_nomenclature_index, oru_obx);
		
		switch(idc_nomenclature_index) {
		case 729984:
			oru_obx.setObservationValue(observationValue);
			oru_obx.setObservationSubID(String.valueOf(observation_Sub_ID));
			break;
		case 729985:
			oru_obx.setObservationValue(observationValue);
			oru_obx.setObservationSubID(String.valueOf(observation_Sub_ID));
			break;
		case 729986:
			oru_obx.setObservationValue(observationValue);
			oru_obx.setObservationSubID(String.valueOf(observation_Sub_ID));
			break;
		
		case 730048:
			oru_obx.setObservationValue(observationValue);
			oru_obx.setObservationSubID(String.valueOf(observation_Sub_ID));
			break;
		case 730049:
			oru_obx.setObservationValue(observationValue);
			oru_obx.setObservationSubID(String.valueOf(observation_Sub_ID));
			break;
		case 730050:
			oru_obx.setObservationValue(observationValue);
			oru_obx.setObservationSubID(String.valueOf(observation_Sub_ID));
			break;
		
		default:
			oru_obx.setObservationValue("");
			break;
		}
		return oru_obx;
	}
	
	public ORU_OBX parse_obx_MDC_IDC_EPISODE (int observation_Sub_ID, String observationValue, int idc_nomenclature_index) throws Exception
	{
		ORU_OBX oru_obx=new ORU_OBX();
		oru_obx=ORU_SetValue(idc_nomenclature_index, oru_obx);
		
		switch(idc_nomenclature_index) {
		case 739536:
			oru_obx.setObservationValue(observationValue);
			oru_obx.setObservationSubID(String.valueOf(observation_Sub_ID));
			break;
		case 739552:
			oru_obx.setObservationValue(observationValue);
			oru_obx.setObservationSubID(String.valueOf(observation_Sub_ID));
			break;
		case 739568:
			//754882^MDC_IDC_ENUM_EPISODE_TYPE_Epis_VT^MDC or
			//Epis_VT^VT
			
			if (observationValue.equals("VT-1")||observationValue.equals("VT-2")){
				/*
				 * VT-1 and VT-2 belong to VT 
				 */
				observationValue="VT";
			}
			oru_obx.setObservationValueIdentifier("Epis_"+observationValue);
			oru_obx.setObservationValue(observationValue);
			//oru_obx.setObservationNameOfCodingSystem("MDC");
			oru_obx.setObservationSubID(String.valueOf(observation_Sub_ID));

			break;
		case 739600:
			oru_obx.setObservationValueIdentifier("VENDOR_TYPE_STJ_Epis_"+observationValue);
			oru_obx.setObservationValue(observationValue);
			oru_obx.setObservationSubID(String.valueOf(observation_Sub_ID));
			break;
		case 739680:
			oru_obx.setObservationValue(observationValue);
			oru_obx.setObservationSubID(String.valueOf(observation_Sub_ID));
			break;
		case 739696:
			oru_obx.setObservationValue(observationValue);
			oru_obx.setObservationSubID(String.valueOf(observation_Sub_ID));
			break;
		case 739712:
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
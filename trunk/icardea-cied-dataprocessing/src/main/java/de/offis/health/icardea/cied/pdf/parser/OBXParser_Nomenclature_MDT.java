package de.offis.health.icardea.cied.pdf.parser;

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
 * This class offers setObservationValue for each ISO/IEEE 11073 Nomenclature MDT defined
 * items
 * 
 * @author MYang
 */

public class OBXParser_Nomenclature_MDT extends AbstractPDFParser {
	
	private static Logger logger = Logger.getLogger(OBXParser_Nomenclature_MDT.class);
	
	private OBXParser_Nomenclature_MDT() throws InvalidParameterValueException, PropertyFileNotFoundException {
		super("IEEENomenclature", "en");
	}
	
	public OBXParser_Nomenclature_MDT(String languageCode) throws InvalidParameterValueException, PropertyFileNotFoundException {
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
	
	public ORU_OBX parse_obx_VTVFCounters (int index, String observationValue, int idc_nomenclature_index) throws PropertyNotFoundException
			{
		ORU_OBX oru_obx=new ORU_OBX();
		oru_obx=ORU_SetValue(idc_nomenclature_index, oru_obx);
		switch(idc_nomenclature_index) {
		
		case 737952:
			oru_obx.setObservationValue(observationValue);
			oru_obx.setObservationValueIdentifier("Epis_"+observationValue);
			oru_obx.setObservationSubID(String.valueOf(index));
			break;
		case 738000:
			oru_obx.setObservationValue(observationValue);
			oru_obx.setObservationSubID(String.valueOf(index));
			break;
		case 738017:
			oru_obx.setObservationValue(observationValue);
			oru_obx.setObservationSubID(String.valueOf(index));
			break;	
		case 738018:
			oru_obx.setObservationValue(observationValue);
			oru_obx.setObservationSubID(String.valueOf(index));
			break;	
		default:
			oru_obx.setObservationValue("");
			break;
		}
		return oru_obx;
		
			}
	
	public ORU_OBX parse_obx_VTVFCounters (String observationValue, int idc_nomenclature_index) throws PropertyNotFoundException
	{
		ORU_OBX oru_obx=new ORU_OBX();
		oru_obx=ORU_SetValue(idc_nomenclature_index, oru_obx);
		switch(idc_nomenclature_index) {
		
		case 737824:
			oru_obx.setObservationValue(observationValue);
			break;
		case 737856:
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
		
		case 720901://MDC_IDC_PG_IMPLANT_DT
			oru_obx.setObservationValue(observationValue);
			oru_obx.setObservationSubID(String.valueOf(observation_Sub_ID));
			break;
		case 729984://MDC_IDC_SET_LEADCHNL_RA_PACING_AMPLITUDE
			oru_obx.setObservationValue(observationValue);
			oru_obx.setObservationSubID(String.valueOf(observation_Sub_ID));
			break;
		case 729985://MDC_IDC_SET_LEADCHNL_RV_PACING_AMPLITUDE
			oru_obx.setObservationValue(observationValue);
			oru_obx.setObservationSubID(String.valueOf(observation_Sub_ID));
			break;
		case 729987://MDC_IDC_SET_LEADCHNL_LV_PACING_AMPLITUDE
			oru_obx.setObservationValue(observationValue);
			oru_obx.setObservationSubID(String.valueOf(observation_Sub_ID));
			break;
			
		case 730752://MDC_IDC_SET_BRADY_MODE
			oru_obx.setObservationValue(observationValue);
			oru_obx.setObservationValueIdentifier("MODE");
			oru_obx.setObservationSubID(String.valueOf(observation_Sub_ID));
			break;
		case 730880://MDC_IDC_SET_BRADY_LOWRATE
			oru_obx.setObservationValue(observationValue);
			oru_obx.setObservationSubID(String.valueOf(observation_Sub_ID));
			break;
		case 731136://MDC_IDC_SET_BRADY_MAX_TRACKING_RATE
			oru_obx.setObservationValue(observationValue);
			oru_obx.setObservationSubID(String.valueOf(observation_Sub_ID));
			break;
		case 731200://MDC_IDC_SET_BRADY_MAX_SENSOR_RATE
			oru_obx.setObservationValue(observationValue);
			oru_obx.setObservationSubID(String.valueOf(observation_Sub_ID));
			break;
		case 731264://MDC_IDC_SET_BRADY_SAV_DELAY
			oru_obx.setObservationValue(observationValue);
			oru_obx.setObservationSubID(String.valueOf(observation_Sub_ID));
			break;
		case 731328://MDC_IDC_SET_BRADY_PAV_DELAY
			oru_obx.setObservationValue(observationValue);
			oru_obx.setObservationSubID(String.valueOf(observation_Sub_ID));
			break;
		case 731456://MDC_IDC_SET_BRADY_AT_MODE_SWITCH_RATE
			oru_obx.setObservationValue(observationValue);
			oru_obx.setObservationSubID(String.valueOf(observation_Sub_ID));
			break;
			
		//Zone Information
		case 731712://MDC_IDC_SET_ZONE_VENDOR_TYPE
			oru_obx.setObservationValue(observationValue);
			oru_obx.setObservationValueIdentifier("ZONE_VENDOR_TYPE_MDT");
			oru_obx.setObservationSubID(String.valueOf(observation_Sub_ID));
			break;
		case 731648://MDC_IDC_SET_ZONE_TYPE
			oru_obx.setObservationValue(observationValue);
			oru_obx.setObservationValueIdentifier("ZONE_TYPE");
			oru_obx.setObservationSubID(String.valueOf(observation_Sub_ID));
			break;
		case 731776://MDC_IDC_SET_ZONE_STATUS
			oru_obx.setObservationValue(observationValue);
			oru_obx.setObservationValueIdentifier("ZONE_STATUS");
			oru_obx.setObservationSubID(String.valueOf(observation_Sub_ID));
			break;
		case 731840://MDC_IDC_SET_ZONE_DETECTION_INTERVAL
			oru_obx.setObservationValue(observationValue);
			oru_obx.setObservationSubID(String.valueOf(observation_Sub_ID));
			break;
			
		default:
			oru_obx.setObservationValue("");
			break;
		}
		return oru_obx;
	}
	
	public ORU_OBX parse_obx_TransmissionNotes (String observationValue, int idc_nomenclature_index) throws PropertyNotFoundException
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
	
	public ORU_OBX parse_obx_BatteryandLeadMeasurements (String observationValue, int idc_nomenclature_index) throws PropertyNotFoundException
	{
		ORU_OBX oru_obx=new ORU_OBX();
		oru_obx=ORU_SetValue(idc_nomenclature_index, oru_obx);
		switch(idc_nomenclature_index) {
		case 721344:
			oru_obx.setObservationValue(observationValue);
			break;
		case 721408:
			oru_obx.setObservationValue(observationValue);
			break;
		case 721664:
			oru_obx.setObservationValue(observationValue);
			break;
		case 721728:
			oru_obx.setObservationValue(observationValue);
			break;
		default:
			oru_obx.setObservationValue("");
			break;
		}
		return oru_obx;
	}
	
	public ORU_OBX parse_obx_ArrhythmiaEpisodeList (int observation_Sub_ID, String observationValue, int idc_nomenclature_index) throws Exception
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
			oru_obx.setObservationValueIdentifier("Epis_"+observationValue);
			oru_obx.setObservationValue(observationValue);
			//oru_obx.setObservationNameOfCodingSystem("MDC");
			oru_obx.setObservationSubID(String.valueOf(observation_Sub_ID));
			break;
		case 739680:
			oru_obx.setObservationValue(observationValue);
			oru_obx.setObservationSubID(String.valueOf(observation_Sub_ID));
			break;
		case 739696:
			oru_obx.setObservationValueIdentifier("Thearpy");
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
	
	public ORU_OBX parse_obx_PatientInformation(int observation_Sub_ID,
			String observationValue, int idc_nomenclature_index) throws PropertyNotFoundException
			{
		ORU_OBX oru_obx=new ORU_OBX();
		oru_obx=ORU_SetValue(idc_nomenclature_index, oru_obx);
		
		switch(idc_nomenclature_index) {
		case 720961:
			oru_obx.setObservationValue(observationValue);
			oru_obx.setObservationSubID(String.valueOf(observation_Sub_ID));
			break;
		case 720962:
			oru_obx.setObservationValue(observationValue);
			oru_obx.setObservationSubID(String.valueOf(observation_Sub_ID));
			break;
		case 720963:
			oru_obx.setObservationValue(observationValue);
			oru_obx.setObservationValueIdentifier(observationValue);
			oru_obx.setObservationSubID(String.valueOf(observation_Sub_ID));
			break;
		case 720964:
			oru_obx.setObservationValue(observationValue);
			oru_obx.setObservationSubID(String.valueOf(observation_Sub_ID));
			break;
		case 720966:
			oru_obx.setObservationValue(observationValue);
			oru_obx.setObservationValueIdentifier(observationValue);
			oru_obx.setObservationSubID(String.valueOf(observation_Sub_ID));
			break;
		default:
			oru_obx.setObservationValue("");
			break;
		}
		return oru_obx;
			}
	
	public ORU_OBX parse_obx_Battery(int observation_Sub_ID,
			String observationValue, int idc_nomenclature_index ) throws PropertyNotFoundException
			{
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
	
	public ORU_OBX parse_obx_Leader(int observation_Sub_ID,
			String observationValue, int idc_nomenclature_index) throws PropertyNotFoundException{
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

	public ORU_OBX parse_obx_ArrhythmiaEpisodeList(String observationValue,
			int idc_nomenclature_index) throws PropertyNotFoundException {
		ORU_OBX oru_obx=new ORU_OBX();
		oru_obx=ORU_SetValue(idc_nomenclature_index, oru_obx);
		//Only for ATP
		switch(idc_nomenclature_index) {
		case 737888:
			oru_obx.setObservationValue(observationValue);
			break;
		default:
			oru_obx.setObservationValue("");
			break;
		}
		return oru_obx;
	}
}
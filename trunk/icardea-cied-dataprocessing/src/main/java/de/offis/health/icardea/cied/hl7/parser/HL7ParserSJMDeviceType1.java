package de.offis.health.icardea.cied.hl7.parser;

import de.offis.health.icardea.cied.hl7.interfaces.HL7Parser;
import de.offis.health.icardea.common.exception.PropertyNotFoundException;
//import de.offis.health.icardea.cied.hl7.parser.*;

public class HL7ParserSJMDeviceType1 extends AbstractHL7Parser implements HL7Parser{

	//public String[] keywords_head="MSH|:PID|:PV1|:NTE|:OBR|".split(":");  
	//public String[] keywords_numenclature="739568:737824:739712".split(":"); 
	
	public static String keywords_MSH="MSH\\|";
	public static String keywords_PID="PID\\|";
	public static String keywords_PV1="PV1\\|";
	public static String keywords_NTE="NTE\\|";
	public static String keywords_OBX_ORU="(OBX\\|)|(OBR\\|)";
	public static String keywords_numenclature=""; //"(739568\\^)|(739712\\^)|(737824\\^)";  
	public static String filename="";
	public static String filepath="";
	public static String newfilename="";
	public static String newfilepath="";
	String regEx="MSH|PID|PV1|NTE|OBR";
	
	//WriteAndReadText writeandreadtext=new WriteAndReadText();
	public String getDeviceName() throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		String deviceName = null;
		deviceName = "SJM123456";
		return deviceName;
	}

	@Override
	public String getHL7_ORU_MSH() throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		
		WriteAndReadText.readTextbyLine(filename, newfilename, filepath, newfilepath, keywords_MSH);
		return super.getHL7_ORU_MSH();
	}
	
	@Override
	public String getHL7_ORU_PID() throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		WriteAndReadText.readTextbyLine(filename, newfilename, filepath, newfilepath, keywords_PID);
		return super.getHL7_ORU_PID();
	}

	@Override
	public String getHL7_ORU_PV1() throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		WriteAndReadText.readTextbyLine(filename,newfilename,filepath, newfilepath, keywords_PV1);
		return super.getHL7_ORU_PV1();
	}

	@Override
	public String getHL7_ORU_NTE() throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		WriteAndReadText.readTextbyLine(filename,newfilename,filepath, newfilepath, keywords_NTE);
		return super.getHL7_ORU_NTE();
	}

	@Override
	public String getHL7_ORU_OBR() throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		WriteAndReadText.readTextbyLine(filename, newfilename, filepath, newfilepath, keywords_numenclature);
		return super.getHL7_ORU_OBR();
	}

	@Override
	public String getMDC_IDC_EPISODE_DURATION_AF()
			throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		WriteAndReadText.readTextbyLine(filename,newfilename, filepath, newfilepath, keywords_numenclature);
		return super.getMDC_IDC_EPISODE_DURATION_AF();
	}

	@Override
	public String getMDC_IDC_EPISODE_TYPE_AF() throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		return super.getMDC_IDC_EPISODE_TYPE_AF();
	}

	@Override
	public String getMDC_IDC_EPISODE_TYPE_SVT()
			throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		return super.getMDC_IDC_EPISODE_TYPE_SVT();
	}

	@Override
	public String getMDC_IDC_EPISODE_TYPE_VT() throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		return super.getMDC_IDC_EPISODE_TYPE_VT();
	}

	@Override
	public String getMDC_IDC_LEAD_CONNECTION_STATUS()
			throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		return super.getMDC_IDC_LEAD_CONNECTION_STATUS();
	}

	@Override
	public String getMDC_IDC_MSMT_BATTERY_VOLTAGE()
			throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		return super.getMDC_IDC_MSMT_BATTERY_VOLTAGE();
	}

	@Override
	public String getMDC_IDC_MSMT_LEADHVCHNL_STATUS()
			throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		return super.getMDC_IDC_MSMT_LEADHVCHNL_STATUS();
	}

	@Override
	public String getMDC_IDC_SET_LEADCHNL_CHAMBER_PACING_AMPLITUDE()
			throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		return super.getMDC_IDC_SET_LEADCHNL_CHAMBER_PACING_AMPLITUDE();
	}

	@Override
	public String getMDC_IDC_STAT_TACHYTHERAPY_ATP_DELIVERED_RECENT_VT()
			throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		return super.getMDC_IDC_STAT_TACHYTHERAPY_ATP_DELIVERED_RECENT_VT();
	}

	@Override
	public String getMDC_IDC_STAT_TACHYTHERAPY_SHOCKS_ABORTED_RECENT_AF()
			throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		return super.getMDC_IDC_STAT_TACHYTHERAPY_SHOCKS_ABORTED_RECENT_AF();
	}

	@Override
	public String getMDC_IDC_STAT_TACHYTHERAPY_SHOCKS_ABORTED_RECENT_VT()
			throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		return super.getMDC_IDC_STAT_TACHYTHERAPY_SHOCKS_ABORTED_RECENT_VT();
	}

	@Override
	public String getMDC_IDC_STAT_TACHYTHERAPY_SHOCKS_DELIVERED_RECENT_AF()
			throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		return super.getMDC_IDC_STAT_TACHYTHERAPY_SHOCKS_DELIVERED_RECENT_AF();
	}

	@Override
	public String getMDC_IDC_STAT_TACHYTHERAPY_SHOCKS_DELIVERED_RECENT_VT()
			throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		return super.getMDC_IDC_STAT_TACHYTHERAPY_SHOCKS_DELIVERED_RECENT_VT();
	}
	/*
    public static void main(String[] args) throws PropertyNotFoundException {
		//String fileName = "HL7_ORU_input.hl7";
    	HL7ParserSJMDeviceType1 type1 =new HL7ParserSJMDeviceType1();
		type1.getHL7_ORU_MSH();
		type1.getMDC_IDC_EPISODE_DURATION_AF();
	}*/
}

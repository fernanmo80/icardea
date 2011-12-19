/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package gr.forth.ics.icardea.listener;

import ca.uhn.hl7v2.model.v23.segment.*;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.model.v23.message.*;
import ca.uhn.hl7v2.model.v23.datatype.*;
import ca.uhn.hl7v2.model.Message;
import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import gr.forth.ics.icardea.CTSClient;


/**
 *
 * @author petrakis
 */
public class CDAConverter {

      static Socket requestSocket;
	static InputStreamReader ir;
 	static OutputStreamWriter or;
        static BufferedWriter out;
        static BufferedReader in;
 	static String message;

    static String sendMessage(String msg){
                msg=(char)11+msg+(char)28+(char)13;

		try{
                     //1. creating a socket to connect to the server
			requestSocket = new Socket(Config.GetSetting("PIX_ip"), Integer.parseInt(Config.GetSetting("PIX_port")));
			//System.out.println("Connected to "+host+" in port "+port);
			//2. get Input and Output streams


                         or = new OutputStreamWriter(requestSocket.getOutputStream());
                        out = new BufferedWriter(or);
			out.flush();

                        ir = new InputStreamReader(requestSocket.getInputStream());
                        in = new BufferedReader(ir);
			//out.writeObject(msg);
                        out.write(msg);
			out.flush();
			System.out.println("ask PIX>" + msg);


                        /*Get response*/
                        message="";
                        String c;
                        while(true){
                           if(in.ready()==false){
                                if(message.trim().length()!=0){
                                    break;
                                }
                                else{
                                    continue;
                                }

                            }

                            c = in.readLine().trim();
                            if(c==null){
                                break;
                            }

                            message =message+ c+"\r";
                         }

                         System.out.println("PIX server response>" + message);
                         return message;
		}
		catch(Exception ioException){
			ioException.printStackTrace();
                        return "";
		}
	}

    private static String getDateTime() {
        DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        Date date = new Date();
        return dateFormat.format(date);
    }

    private static boolean StoreVisitNo(String visit_no, String pat_id){
        DataInputStream in=null;
        BufferedWriter out=null;
        try{
            String filestr="";
            boolean flag=false;
            FileInputStream fs = new FileInputStream(Config.GetSetting("config")+"\\visits.txt");
            in = new DataInputStream(fs);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            while ((filestr = br.readLine()) != null)
                {
                    if(filestr.trim().length()>0){
                        String tmp[]=filestr.trim().split("\\|");
                        if(tmp[0].trim().equals(visit_no)){
                            flag=true;
                            break;
                        }
                    }
                }
            if(flag==true)
                return true;
            FileWriter fstream = new FileWriter(Config.GetSetting("config")+"\\visits.txt",true);
            out = new BufferedWriter(fstream);
            out.append(visit_no+"|"+pat_id);
            out.newLine();
            
        }
        catch(Exception ex){
            System.err.println("Cannot store visit number: " + ex.getMessage());
            return false;
        }
        finally{
            try {
                if (in != null) {
                    in.close();
                }
                if (out != null) {
                    out.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(CDAConverter.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return true;
    }


    /*public static String ParseDFT(ca.uhn.hl7v2.model.v22.message.DFT_P03 dftMsg){
        String res="";
        try{
            ca.uhn.hl7v2.model.v22.segment.MSH msh = dftMsg.getMSH();
            ca.uhn.hl7v2.model.v22.segment.PID pid = dftMsg.getPID();
            ca.uhn.hl7v2.model.v22.segment.FT1 ft1 = dftMsg.getFT1();
            ft1.get
        } catch (HL7Exception ex) {
            Logger.getLogger(ListenerService.class.getName()).log(Level.SEVERE, null, ex);
            res="";
        } catch (IOException ex) {
            Logger.getLogger(ListenerService.class.getName()).log(Level.SEVERE, null, ex);
            res="";
        } catch (Exception ex) {
            Logger.getLogger(ListenerService.class.getName()).log(Level.SEVERE, null, ex);
            res="";
        }
        return res;
    }*/

    public static String ParseADT(ADT_A01 adtMsg){
        String res="", msg_code="";
        String content_items="",problistentries="", proc_entries="", general="", contents="", labentries="";
        String problist_template="",contents_template="", general_template="", proc_template="",labentry_template="";
        try{
            String cpath=Config.GetSetting("config");

            /*System.out.println("***********RECEIVED HL7 MESSAGE**********");
            System.out.println(adtMsg.encode());
            System.out.println("*****************************************");*/
            
            MSH msh = adtMsg.getMSH();
            PID pid = adtMsg.getPID();
            PV1 pv1=adtMsg.getPV1();

            String current_date=getDateTime();

            if(msh.getMsh10_MessageControlID().getValue()!=null)
                 msg_code=msh.getMsh10_MessageControlID().getValue();
            else
                 msg_code=msh.getDateTimeOfMessage().getTs1_TimeOfAnEvent().getValue();
            


            String filestr="";
            FileInputStream fs = new FileInputStream(cpath+"\\templates\\general.xml");
            DataInputStream in = new DataInputStream(fs);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            while ((filestr = br.readLine()) != null)
                {
                    general_template=general_template+filestr+"\r\n";
                }
            in.close();

            filestr="";
            fs = new FileInputStream(cpath+"\\templates\\contents.xml");
            in = new DataInputStream(fs);
            br = new BufferedReader(new InputStreamReader(in));
            while ((filestr = br.readLine()) != null)
                {
                    contents_template=contents_template+filestr+"\r\n";
                }
            in.close();

            filestr="";
            fs = new FileInputStream(cpath+"\\templates\\labentry.xml");
            in = new DataInputStream(fs);
            br = new BufferedReader(new InputStreamReader(in));
            while ((filestr = br.readLine()) != null)
            {
                  labentry_template=labentry_template+filestr+"\r\n";
            }
            in.close();

            filestr="";
            fs = new FileInputStream(cpath+"\\templates\\probentry.xml");
            in = new DataInputStream(fs);
            br = new BufferedReader(new InputStreamReader(in));
            while ((filestr = br.readLine()) != null)
                {
                    problist_template=problist_template+filestr+"\r\n";
                }
            in.close();
            
            filestr="";
            fs = new FileInputStream(cpath+"\\templates\\procentry.xml");
            in = new DataInputStream(fs);
            br = new BufferedReader(new InputStreamReader(in));
            while ((filestr = br.readLine()) != null)
                {
                    proc_template=problist_template+filestr+"\r\n";
                }
            in.close();


            /*GENERAL*/
            general=general_template;
            general=general.replace("TMP_CDA_EXT", "c"+msg_code);
            general=general.replace("TMP_CDA_RELATEDDOC", "");
            general=general.replace("TMP_CREATION_DATE", current_date);
            general=general.replace("TMP_AUTHOR_TIME", current_date);
            general=general.replace("TMP_AUTHOR_GIVEN", "V1");
            general=general.replace("TMP_AUTHOR_FAMILY", "HL7_LISTENER");
            general=general.replace("TMP_LEGALAUTH_TIME", current_date);
            if(pid.getPatientName().getGivenName()!=null)
                general=general.replace("TMP_GIVEN_NAME", pid.getPatientName().getGivenName().toString());
            if(pid.getPatientName().getFamilyName()!=null)
                general=general.replace("TMP_FAMILY_NAME", pid.getPatientName().getFamilyName().toString());
            if(pid.getSex()!=null)
                general=general.replace("TMP_SEX", pid.getSex().toString());
            if(pid.getDateOfBirth()!=null)
                general=general.replace("TMP_BIRTHDATE", pid.getDateOfBirth().getTimeOfAnEvent().toString());
            //ask PIX
            String id="",namespace="ORBIS&www.salk.at&DNS";
            if(pid.getPatientIDInternalID(0).getCx1_ID()!=null)
                id=pid.getPatientIDInternalID(0).getCx1_ID().toString();
            /*if(pid.getPatientIDInternalID(0).getCx4_AssigningAuthority().getHd1_NamespaceID().getValue()!=null)
                namespace=pid.getPatientIDInternalID(0).getCx4_AssigningAuthority().getHd1_NamespaceID().getValue();
            if(pid.getPatientIDInternalID(0).getCx4_AssigningAuthority().getHd2_UniversalID().getValue()!=null)
                namespace+="&"+pid.getPatientIDInternalID(0).getCx4_AssigningAuthority().getHd2_UniversalID().getValue();
            if(pid.getPatientIDInternalID(0).getCx4_AssigningAuthority().getHd3_UniversalIDType().getValue()!=null)
                namespace+="&"+pid.getPatientIDInternalID(0).getCx4_AssigningAuthority().getHd3_UniversalIDType().getValue();*/
            /*if(pid.getPatientIDInternalID(0).getCx1_ID()!=null)
                general=general.replace("TMP_PATIENTID_ROOT", pid.getPatientIDInternalID(0).getCx1_ID().toString());
            if(pid.getPatientIDInternalID(0).getCx4_AssigningAuthority().getHd1_NamespaceID().getValue()!=null)
                general=general.replace("TMP_PATIENTID_EXT", pid.getPatientIDInternalID(0).getCx4_AssigningAuthority().getHd1_NamespaceID().getValue());*/
            String socket_msg="MSH|^~\\&|EHRListener|EHR|PIX|EHR|"+current_date+"||QBP^Q23^QBP_Q21|ListenerMsg|P|2.5\r"+
                                "QPD|IHE PIX Query|ListenerQry|"+id+"^^^"+namespace+"|\r"+
                                "RCP|I\r";
           
            /*String visit_no="";
            if (pv1.getVisitNumber()!=null && pv1.getVisitNumber().getID()!=null){
                    visit_no=pv1.getVisitNumber().getID().getValue();
                    StoreVisitNo(visit_no, id);
            }*/

            String resp=sendMessage(socket_msg);
            if(resp.equals(""))
                return "";

                    try{
                        int k=resp.indexOf("PID");
                        if(k>=0){
                            resp=resp.substring(k);
                            String segs[]=resp.replace("|", "000").split("000");
                            String ehr_id[];
                            if(segs.length>=4){
                                String tmpstr[]=segs[3].split("~");
                                ehr_id=tmpstr[0].replace("^", "000").split("000");
                                id=ehr_id[0];
                                String namespace_tmp[]=ehr_id[3].split("&");
                                namespace=namespace_tmp[1]+"&"+namespace_tmp[2];
                            }
                        }
                        else if(resp.indexOf("ERR")>=0){
                            System.err.println("PIX Query Error!!!");
                            return "";
                        }
                        else{
                            String address="",dob="19800124",sex="M",lname="Tester", fname="Tester";
                            String new_pid="p"+id;
                            String iid="i"+id;
                            socket_msg="MSH|^~\\&|EHRListener|EHR|PIX|EHR|"+current_date+"||ADT^A01^ADT_A01|ListenerMsg|P|2.3.1\r"+
					"EVN||"+current_date+"\r"+
					"PID|||"+new_pid+"^^^icardea.pix&1.2.826.0.1.3680043.2.44.248240.1&ISO~"+id+"^^^"+namespace+"~"+iid+"^^^CIED&bbe3a050-079a-11e0-81e0-0800200c9a66&UUID||"+lname+"^"+fname+"||"+dob+"|"+sex+"|||"+address+"||||||||\r"+
					"PV1||O\r";

                            resp=sendMessage(socket_msg);
                            if(resp.indexOf("ERR")>=0){
                                System.err.println("PIX Feed Error!!!");
                                return "";
                            }
                            namespace="1.2.826.0.1.3680043.2.44.248240.1&ISO";
                            id=new_pid;
                        }
                    }
                    catch(Exception ex){
                        System.err.println("Cannot retrieve EHR id:"+ex.getMessage());
                        return "";
                    }
                    finally{
                        general=general.replace("TMP_PATIENTID_ROOT", namespace);
                        general=general.replace("TMP_PATIENTID_EXT", id);
                        Audit.patientid=id;
                    }

            
            //Message m=;
            //ca.uhn.hl7v2.model.v25.message.RSP_K23 pix_msg=(ca.uhn.hl7v2.model.v25.message.RSP_K23)m;
            //err=pix_msg.getERR();
            
            /********/

            CTSClient cts =new CTSClient(Config.GetSetting("CTS_URL"));
            //String cts_res1=cts.translateCode("ICD10","F90.1", "UMLS");
            //System.out.println("CTS RESULT: "+cts_res1);

            /*DG1,AL1*/
            content_items="";
            problistentries="";

            int number_of_dg1=adtMsg.getDG1Reps();
            for(int i=0;i<number_of_dg1;i++)
            {
                        String entry=problist_template;
                        DG1 prob=adtMsg.getDG1(i);

                        entry=entry.replace("TMP_PROB_TYPECODE", "282291009");
                        entry=entry.replace("TMP_PROB_TYPEDESCR", "Diagnosis");

                        /*if(prob.getDiagnosisType()!=null){
                            entry=entry.replace("TMP_PROB_XSITYPE", prob.getDiagnosisType().getValue());
                        }
                        else
                        {
                            entry=entry.replace("TMP_PROB_XSITYPE", "");
                        }*/

                        entry=entry.replace("TMP_PROB_XSITYPE", "CD");

                        /*SOS-Codemapping needed*/
                        String probcode="",probtext="",probcs="",probcsname="";
                        Boolean b=false;


                        //CTS call
                        if(prob.getDg13_DiagnosisCode().getCe1_Identifier().getValue()!=null && prob.getDg13_DiagnosisCode().getCe3_NameOfCodingSystem().getValue()!=null){
                            System.out.println("********ASK CTS**********");
                            String cts_res=cts.translateCode(prob.getDg13_DiagnosisCode().getCe3_NameOfCodingSystem().getValue().replace("I10","ICD10"),prob.getDg13_DiagnosisCode().getCe1_Identifier().getValue(), "UMLS");
                            System.out.println("CTS RESULT: "+cts_res);
                            if(cts_res!=null && cts_res.trim().length()>0){
                                    probcode=cts_res;
                                    if(prob.getDg13_DiagnosisCode().getCe2_Text().getValue()!=null){
                                        probtext=prob.getDg13_DiagnosisCode().getCe2_Text().getValue();
                                    }
                                    else
                                    {
                                        probtext="";
                                    }
                                    probcs="UMLS";
                                    probcsname="UMLS";
                                    entry=entry.replace("TMP_PROB_VALUE_CODE",probcode);
                                    entry=entry.replace("TMP_PROB_VALUE_CODINGSYSTEMNAME",probcsname);
                                    entry=entry.replace("TMP_PROB_VALUE_CODINGSYSTEM", probcs);
                                    entry=entry.replace("TMP_PROB_VALUE_DISPLAYNAME", probtext);
                                    b=true;
                                }
                            }
                        /*if(prob.getDg13_DiagnosisCode().getCe1_Identifier().getValue()!=null){
                            filestr="";
                            fs = new FileInputStream(cpath+"\\codes\\cts.txt");
                            in = new DataInputStream(fs);
                            br = new BufferedReader(new InputStreamReader(in));
                            while ((filestr = br.readLine()) != null)
                            {
                                String tmp[]=filestr.split("\\|");
                                String tmp1[]=tmp[0].split("\\^");
                                String tmp2[]=tmp[1].split("\\^");
                                if(tmp1[0].equals(prob.getDg13_DiagnosisCode().getCe1_Identifier().getValue())){
                                    probcode=tmp2[0];
                                    probtext=tmp2[1];
                                    probcs=tmp2[2];
                                    probcsname=tmp2[2];
                                    b=true;
                                    break;
                                }
                            }
                            in.close();
                            if(b==true){
                                entry=entry.replace("TMP_PROB_VALUE_CODE", probcode);
                                entry=entry.replace("TMP_PROB_VALUE_CODINGSYSTEMNAME", probcsname);
                                entry=entry.replace("TMP_PROB_VALUE_CODINGSYSTEM", probcs);
                                entry=entry.replace("TMP_PROB_VALUE_DISPLAYNAME", probtext);
                                content_items+="<item>"+probtext+"</item>\r\n";
                            }
                        }*/

                        if(b==false){
                        if(prob.getDg13_DiagnosisCode().getCe1_Identifier().getValue()!=null){
                            entry=entry.replace("TMP_PROB_VALUE_CODE", prob.getDg13_DiagnosisCode().getCe1_Identifier().getValue());
                        }
                        else
                        {
                            entry=entry.replace("TMP_PROB_VALUE_CODE", "");
                        }


                        if(prob.getDg13_DiagnosisCode().getCe3_NameOfCodingSystem().getValue()!=null){
                            entry=entry.replace("TMP_PROB_VALUE_CODINGSYSTEMNAME", prob.getDg13_DiagnosisCode().getCe3_NameOfCodingSystem().getValue());
                        }
                        else
                        {
                            entry=entry.replace("TMP_PROB_VALUE_CODINGSYSTEMNAME", "");
                        }

                        /*SOS-Codemapping needed*/
                        if(prob.getDg13_DiagnosisCode().getCe3_NameOfCodingSystem().getValue()!=null){
                            entry=entry.replace("TMP_PROB_VALUE_CODINGSYSTEM", prob.getDg13_DiagnosisCode().getCe3_NameOfCodingSystem().getValue());
                        }
                        else
                        {
                            entry=entry.replace("TMP_PROB_VALUE_CODINGSYSTEM", "");
                        }

               

                        if(prob.getDg13_DiagnosisCode().getCe2_Text().getValue()!=null){
                            entry=entry.replace("TMP_PROB_VALUE_DISPLAYNAME", prob.getDg13_DiagnosisCode().getCe2_Text().getValue());
                            content_items+="<item>"+prob.getDg13_DiagnosisCode().getCe2_Text().getValue()+"</item>\r\n";
                        }
                        else
                        {
                            entry=entry.replace("TMP_PROB_VALUE_DISPLAYNAME", "");
                            content_items+="<item></item>\r\n";
                        }
                        }

                        if(prob.getDg15_DiagnosisDateTime().getTs1_TimeOfAnEvent().getValue()!=null){
                            entry=entry.replace("TMP_PROB_DATE_LOW", prob.getDg15_DiagnosisDateTime().getTs1_TimeOfAnEvent().toString());
                        }
                        else
                        {
                            entry=entry.replace("TMP_PROB_DATE_LOW", "");
                        }

                        if(prob.getDg15_DiagnosisDateTime().getTs1_TimeOfAnEvent().getValue()!=null){
                            entry=entry.replace("TMP_PROB_DATE_HIGH", prob.getDg15_DiagnosisDateTime().getTs1_TimeOfAnEvent().toString());
                        }
                        else
                        {
                            entry=entry.replace("TMP_PROB_DATE_HIGH", "");
                        }

                        //???
                        entry=entry.replace("TMP_PROB_STATUS", "completed");

                        /*if(prob.get!=null){
                            entry=entry.replace("TMP_PROB_STATUS", prob.getDg15_DiagnosisDateTime().getTs1_TimeOfAnEvent().toString());
                        }
                        else
                        {
                            entry=entry.replace("TMP_PROB_STATUS", "Completed");
                        }*/


                        problistentries+=entry;
            }

            int number_of_al1=adtMsg.getAL1Reps();
            for(int i=0;i<number_of_al1;i++)
            {
                        String entry=problist_template;
                        AL1 prob=adtMsg.getAL1(i);

                        entry=entry.replace("TMP_PROB_TYPECODE", "418799008");
                        entry=entry.replace("TMP_PROB_TYPEDESCR", "Symptom");

                        /*if(prob.getAllergyType().getValue()!=null){
                            entry=entry.replace("TMP_PROB_XSITYPE", prob.getAllergyType().getValue());
                        }
                        else
                        {
                            entry=entry.replace("TMP_PROB_XSITYPE", "");
                        }*/

                        entry=entry.replace("TMP_PROB_XSITYPE", "CD");

                        /*SOS-Codemapping needed*/
                        String probcode="",probtext="",probcs="",probcsname="";
                        Boolean b=false;

                        //CTS call
                        if(prob.getAl13_AllergyCodeMnemonicDescription().getCe1_Identifier().getValue()!=null && prob.getAl13_AllergyCodeMnemonicDescription().getCe3_NameOfCodingSystem().getValue()!=null){
                            System.out.println("********ASK CTS**********");
                            String cts_res=cts.translateCode(prob.getAl13_AllergyCodeMnemonicDescription().getCe3_NameOfCodingSystem().getValue().replace("I10","ICD10"),prob.getAl13_AllergyCodeMnemonicDescription().getCe1_Identifier().getValue(), "UMLS");
                            System.out.println("CTS RESULT: "+cts_res);
                            if(cts_res!=null && cts_res.trim().length()>0){
                                    probcode=cts_res;
                                    if(prob.getAl13_AllergyCodeMnemonicDescription().getCe2_Text().getValue()!=null){
                                        probtext=prob.getAl13_AllergyCodeMnemonicDescription().getCe2_Text().getValue();
                                    }
                                    else
                                    {
                                        probtext="";
                                    }
                                    probcs="UMLS";
                                    probcsname="UMLS";
                                    entry=entry.replace("TMP_PROB_VALUE_CODE",probcode);
                                    entry=entry.replace("TMP_PROB_VALUE_CODINGSYSTEMNAME",probcsname);
                                    entry=entry.replace("TMP_PROB_VALUE_CODINGSYSTEM", probcs);
                                    entry=entry.replace("TMP_PROB_VALUE_DISPLAYNAME", probtext);
                                    b=true;
                                }
                            }
                        /*
                        if(prob.getAl13_AllergyCodeMnemonicDescription().getCe1_Identifier().getValue()!=null){
                            filestr="";
                            fs = new FileInputStream(cpath+"\\codes\\cts.txt");
                            in = new DataInputStream(fs);
                            br = new BufferedReader(new InputStreamReader(in));
                            while ((filestr = br.readLine()) != null)
                            {
                                String tmp[]=filestr.split("\\|");
                                String tmp1[]=tmp[0].split("\\^");
                                String tmp2[]=tmp[1].split("\\^");
                                if(tmp1[0].equals(prob.getAl13_AllergyCodeMnemonicDescription().getCe1_Identifier().getValue())){
                                    probcode=tmp2[0];
                                    probtext=tmp2[1];
                                    probcs=tmp2[2];
                                    probcsname=tmp2[2];
                                    b=true;
                                    break;
                                }
                            }
                            in.close();
                            if(b==true){
                                entry=entry.replace("TMP_PROB_VALUE_CODE", probcode);
                                entry=entry.replace("TMP_PROB_VALUE_CODINGSYSTEMNAME", probcsname);
                                entry=entry.replace("TMP_PROB_VALUE_CODINGSYSTEM", probcs);
                                entry=entry.replace("TMP_PROB_VALUE_DISPLAYNAME", probtext);
                                content_items+="<item>"+probtext+"</item>\r\n";
                            }
                        }*/

                        if(b==false){
                        if(prob.getAl13_AllergyCodeMnemonicDescription().getCe1_Identifier().getValue()!=null){
                            entry=entry.replace("TMP_PROB_VALUE_CODE", prob.getAl13_AllergyCodeMnemonicDescription().getCe1_Identifier().getValue());
                        }
                        else
                        {
                            entry=entry.replace("TMP_PROB_VALUE_CODE", "");
                        }


                        if(prob.getAl13_AllergyCodeMnemonicDescription().getCe3_NameOfCodingSystem().getValue()!=null){
                            entry=entry.replace("TMP_PROB_VALUE_CODINGSYSTEMNAME", prob.getAl13_AllergyCodeMnemonicDescription().getCe3_NameOfCodingSystem().getValue());
                        }
                        else
                        {
                            entry=entry.replace("TMP_PROB_VALUE_CODINGSYSTEMNAME", "");
                        }

                        /*SOS-Codemapping needed*/
                        if(prob.getAl13_AllergyCodeMnemonicDescription().getCe3_NameOfCodingSystem().getValue()!=null){
                            entry=entry.replace("TMP_PROB_VALUE_CODINGSYSTEM", prob.getAl13_AllergyCodeMnemonicDescription().getCe3_NameOfCodingSystem().getValue());
                        }
                        else
                        {
                            entry=entry.replace("TMP_PROB_VALUE_CODINGSYSTEM", "");
                        }



                        if(prob.getAl13_AllergyCodeMnemonicDescription().getCe2_Text().getValue()!=null){
                            entry=entry.replace("TMP_PROB_VALUE_DISPLAYNAME", prob.getAl13_AllergyCodeMnemonicDescription().getCe2_Text().getValue());
                            content_items+="<item>"+prob.getAl13_AllergyCodeMnemonicDescription().getCe2_Text().getValue()+"</item>\r\n";
                        }
                        else
                        {
                            entry=entry.replace("TMP_PROB_VALUE_DISPLAYNAME", "");
                            content_items+="<item></item>\r\n";
                        }
                        }

                        if(prob.getAl16_IdentificationDate().getValue()!=null){
                            entry=entry.replace("TMP_PROB_DATE_LOW", prob.getAl16_IdentificationDate().getValue());
                        }
                        else
                        {
                            entry=entry.replace("TMP_PROB_DATE_LOW", "");
                        }

                        if(prob.getAl16_IdentificationDate().getValue()!=null){
                            entry=entry.replace("TMP_PROB_DATE_HIGH", prob.getAl16_IdentificationDate().getValue());
                        }
                        else
                        {
                            entry=entry.replace("TMP_PROB_DATE_HIGH", "");
                        }

                        if(prob.getAl14_AllergySeverity().getValue()!=null){
                            entry=entry.replace("TMP_PROB_SEVERITY", prob.getAl14_AllergySeverity().getValue());
                        }
                        else
                        {
                            entry=entry.replace("TMP_PROB_SEVERITY", "");
                        }

                        //???
                        entry=entry.replace("TMP_PROB_STATUS", "completed");


                        problistentries+=entry;
            }


            if((number_of_dg1+number_of_al1)>0){
                contents+=contents_template.replace("TMP_CONTENTS_TITLE","PROBLEM LIST");
                contents=contents.replace("TMP_CONTENTS_CODESYSTEMNAME","LOINC");
                contents=contents.replace("TMP_CONTENTS_CODESYSTEM","2.16.840.1.113883.6.1");
                contents=contents.replace("TMP_CONTENTS_ITEMS", content_items);
                contents=contents.replace("TMP_ENTRIES", problistentries);
            }

            
            /*PR1*/
            content_items="";
            proc_entries="";
            int number_of_proc=adtMsg.getPROCEDUREReps();
            for(int i=0;i<number_of_proc;i++)
            {
                        String entry=proc_template;
                        PR1 proc=adtMsg.getPROCEDURE(i).getPR1();

                        /*SOS-Codemapping needed*/
                        String probcode="",probtext="",probcs="",probcsname="";
                        Boolean b=false;

                         //CTS call
                        if(proc.getProcedureCode().getCe1_Identifier().getValue()!=null && proc.getProcedureCode().getCe3_NameOfCodingSystem().getValue()!=null){
                            System.out.println("********ASK CTS**********");
                            String cts_res=cts.translateCode(proc.getProcedureCode().getCe3_NameOfCodingSystem().getValue().replace("I10","ICD10"),proc.getProcedureCode().getCe1_Identifier().getValue(), "UMLS");
                            System.out.println("CTS RESULT: "+cts_res);
                            if(cts_res!=null && cts_res.trim().length()>0){
                                    probcode=cts_res;
                                    if(proc.getPr13_ProcedureCode().getCe2_Text().getValue()!=null){
                                        probtext=proc.getPr13_ProcedureCode().getCe2_Text().getValue();
                                    }
                                    else
                                    {
                                        probtext="";
                                    }
                                    probcs="UMLS";
                                    probcsname="UMLS";
                                    entry=entry.replace("TMP_PROC_CODE",probcode);
                                    entry=entry.replace("TMP_PROC_CODING_NAME",probcsname);
                                    entry=entry.replace("TMP_PROC_CODING_SYSTEM", probcs);
                                    entry=entry.replace("TMP_PROC_TEXT", probtext);
                                    b=true;
                                }
                            }

                        /*if(proc.getProcedureCode().getCe1_Identifier().getValue()!=null){
                            filestr="";
                            fs = new FileInputStream(cpath+"\\codes\\cts.txt");
                            in = new DataInputStream(fs);
                            br = new BufferedReader(new InputStreamReader(in));
                            while ((filestr = br.readLine()) != null)
                            {
                                String tmp[]=filestr.split("\\|");
                                String tmp1[]=tmp[0].split("\\^");
                                String tmp2[]=tmp[1].split("\\^");
                                if(tmp1[0].equals(proc.getProcedureCode().getCe1_Identifier().getValue())){
                                    probcode=tmp2[0];
                                    probtext=tmp2[1];
                                    probcs=tmp2[2];
                                    probcsname=tmp2[2];
                                    b=true;
                                    break;
                                }
                            }
                            in.close();
                            if(b==true){
                                entry=entry.replace("TMP_PROC_CODE", probcode);
                                entry=entry.replace("TMP_PROC_CODING_SYSTEM", probcs);
                                entry=entry.replace("TMP_PROC_CODING_NAME", probcsname);
                                entry=entry.replace("TMP_PROC_TEXT", probtext);
                                content_items+="<item>"+probtext+"</item>\r\n";
                            }
                        }*/

                        if(b==false){
                        if(proc.getProcedureCode().getCe1_Identifier().getValue()!=null){
                            entry=entry.replace("TMP_PROC_CODE", proc.getProcedureCode().getCe1_Identifier().getValue());
                        }
                        else
                        {
                            entry=entry.replace("TMP_PROC_CODE", "");
                        }


                        /*SOS-Codemapping needed*/
                        if(proc.getProcedureCode().getCe3_NameOfCodingSystem().getValue()!=null){
                            entry=entry.replace("TMP_PROC_CODING_SYSTEM", proc.getProcedureCode().getCe3_NameOfCodingSystem().getValue());
                        }
                        else
                        {
                            entry=entry.replace("TMP_PROC_CODING_SYSTEM", "");
                        }

                        if(proc.getProcedureCode().getCe3_NameOfCodingSystem().getValue()!=null){
                            entry=entry.replace("TMP_PROC_CODING_NAME", proc.getProcedureCode().getCe3_NameOfCodingSystem().getValue());
                        }
                        else
                        {
                            entry=entry.replace("TMP_PROC_CODING_NAME", "");
                        }

                        if(proc.getPr13_ProcedureCode().getCe2_Text().getValue()!=null){
                            entry=entry.replace("TMP_PROC_TEXT", proc.getPr13_ProcedureCode().getCe2_Text().getValue());
                            content_items+="<item>"+proc.getPr13_ProcedureCode().getCe2_Text().getValue()+"</item>\r\n";
                        }
                        else
                        {
                            entry=entry.replace("TMP_PROC_TEXT", "");
                            content_items+="<item></item>\r\n";
                        }
                        }

                        if(proc.getPr15_ProcedureDateTime().getTs1_TimeOfAnEvent()!=null){
                            entry=entry.replace("TMP_PROC_LOW", proc.getPr15_ProcedureDateTime().getTs1_TimeOfAnEvent().toString());
                        }
                        else
                        {
                            entry=entry.replace("TMP_PROC_LOW", "");
                        }

                        if(proc.getPr15_ProcedureDateTime().getTs1_TimeOfAnEvent()!=null){
                            entry=entry.replace("TMP_PROC_HIGH", proc.getPr15_ProcedureDateTime().getTs1_TimeOfAnEvent().toString());
                        }
                        else
                        {
                            entry=entry.replace("TMP_PROC_HIGH", "");
                        }


                        proc_entries+=entry;
            }


            if(number_of_proc>0){
                contents+=contents_template;
                contents=contents.replace("TMP_CONTENTS_TITLE","PROCEDURES");
                contents=contents.replace("TMP_CONTENTS_CODESYSTEMNAME","LOINC");
                contents=contents.replace("TMP_CONTENTS_CODESYSTEM","2.16.840.1.113883.6.1");
                contents=contents.replace("TMP_CONTENTS_ITEMS", content_items);
                contents=contents.replace("TMP_ENTRIES", proc_entries);
            }
            
            
            
            /*OBX*/
            /*content_items="";
            labentries="";
            int number_of_obx=adtMsg.getOBXReps();
            for(int i=0;i<number_of_obx;i++)
            {
                        String entry=labentry_template;
                        OBX obx=adtMsg.getOBX(i);

                        
                        String probcode="",probtext="",probcs="",probcsname="";
                        Boolean b=false;
                        if(obx.getObservationIdentifier().getIdentifier()!=null){
                            filestr="";
                            fs = new FileInputStream(cpath+"\\codes\\cts.txt");
                            in = new DataInputStream(fs);
                            br = new BufferedReader(new InputStreamReader(in));
                            while ((filestr = br.readLine()) != null)
                            {
                                String tmp[]=filestr.split("\\|");
                                String tmp1[]=tmp[0].split("\\^");
                                String tmp2[]=tmp[1].split("\\^");
                                if(tmp1[0].equals(obx.getObservationIdentifier().getIdentifier().getValue())){
                                    probcode=tmp2[0];
                                    probtext=tmp2[1];
                                    probcs=tmp2[2];
                                    probcsname=tmp2[2];
                                    b=true;
                                    break;
                                }
                            }
                            in.close();
                            if(b==true){
                                entry=entry.replace("TMP_LAB_CODE", probcode);
                                entry=entry.replace("TMP_LAB_CODINGSYSTEM", probcs);
                                entry=entry.replace("TMP_LAB_CODING_NAME", probcsname);
                                entry=entry.replace("TMP_LAB_TEXT", probtext);
                                content_items+="<item>"+probtext+"</item>\r\n";
                            }
                        }

                        if(b==false){
                        if(obx.getObservationIdentifier().getIdentifier().getValue()!=null){
                            entry=entry.replace("TMP_LAB_CODE", obx.getObservationIdentifier().getIdentifier().getValue());
                        }
                        else
                        {
                            entry=entry.replace("TMP_LAB_CODE", "");
                        }

                        
                        if(obx.getObservationIdentifier().getNameOfCodingSystem().getValue()!=null){
                            entry=entry.replace("TMP_LAB_CODINGSYSTEM", obx.getObservationIdentifier().getNameOfCodingSystem().getValue());
                        }
                        else
                        {
                            entry=entry.replace("TMP_LAB_CODINGSYSTEM", "");
                        }

                        if(obx.getObservationIdentifier().getNameOfCodingSystem().getValue()!=null){
                            entry=entry.replace("TMP_LAB_CODING_NAME", obx.getObservationIdentifier().getNameOfCodingSystem().getValue());
                        }
                        else
                        {
                            entry=entry.replace("TMP_LAB_CODING_NAME", "");
                        }

                        if(obx.getObservationIdentifier().getText().getValue()!=null){
                            entry=entry.replace("TMP_LAB_TEXT", obx.getObservationIdentifier().getText().getValue());
                            content_items+="<item>"+obx.getObservationIdentifier().getText().toString()+"</item>\r\n";
                        }
                        else
                        {
                            entry=entry.replace("TMP_LAB_TEXT", "");
                            content_items+="<item></item>\r\n";
                        }
                        }

                        if(obx.getDateTimeOfTheObservation().getTimeOfAnEvent()!=null){
                            entry=entry.replace("TMP_LAB_DATE", obx.getDateTimeOfTheObservation().getTimeOfAnEvent().toString());
                        }
                        else
                        {
                            entry=entry.replace("TMP_LAB_DATE", "");
                        }

                        if("NM".equals(obx.getObx2_ValueType().getValue())){
                            entry=entry.replace("TMP_XSITYPE", "PQ");
                            if(obx.getObservationValue(0).getData()!=null){
                                entry=entry.replace("TMP_LAB_VALUE", obx.getObservationValue(0).getData().toString());
                                entry=entry.replace("TMP_LAB_UNIT", obx.getObx6_Units().getComponent(0).toString());
                            }
                            else
                            {
                                entry=entry.replace("TMP_LAB_VALUE", "");
                                entry=entry.replace("TMP_LAB_UNIT", "");
                            }
                        }
                        else if("ST".equals(obx.getObx2_ValueType().getValue()))
                        {
                            entry=entry.replace("TMP_XSITYPE", "CE");
                            if(obx.getObservationValue(0).getData()!=null){
                                entry=entry.replace("TMP_LAB_VALUE", obx.getObservationValue(0).getData().toString());
                                entry=entry.replace("TMP_LAB_UNIT", "");
                            }
                            else{
                                entry=entry.replace("TMP_LAB_VALUE", "");
                                entry=entry.replace("TMP_LAB_UNIT", "");
                            }
                        }
                         else
                             ;

                        labentries+=entry;
            }

            if(number_of_obx>0){
                contents+=contents_template;
                contents=contents.replace("TMP_CONTENTS_TITLE","LAB RESULTS");
                contents=contents.replace("TMP_CONTENTS_CODESYSTEMNAME","LOINC");
                contents=contents.replace("TMP_CONTENTS_CODESYSTEM","2.16.840.1.113883.6.1");
                contents=contents.replace("TMP_CONTENTS_ITEMS", content_items);
                contents=contents.replace("TMP_ENTRIES", labentries);
            }*/



           
           

           res=general.replace("TMP_MEDICAL_DATA", contents);

           if(contents.trim().length()==0){
               System.out.println("HL7 message has no medical data!");
               return "";
            }

        } catch (HL7Exception ex) {
            Logger.getLogger(ListenerService.class.getName()).log(Level.SEVERE, null, ex);
            res="";
        } catch (IOException ex) {
            Logger.getLogger(ListenerService.class.getName()).log(Level.SEVERE, null, ex);
            res="";
        } catch (Exception ex) {
            Logger.getLogger(ListenerService.class.getName()).log(Level.SEVERE, null, ex);
            res="";
        }

        return msg_code+"CDACONTENTS:"+res.replaceAll("&", "&amp;");
    }

    public static String ParseADT(ADT_A03 adtMsg){
        String res="", msg_code="";
        String content_items="",problistentries="", proc_entries="", general="", contents="", labentries="";
        String problist_template="",contents_template="", general_template="", proc_template="",labentry_template="";
        try{
            String cpath=Config.GetSetting("config");

            /*System.out.println("***********RECEIVED HL7 MESSAGE**********");
            System.out.println(adtMsg.encode());
            System.out.println("*****************************************");*/

            MSH msh = adtMsg.getMSH();
            PID pid = adtMsg.getPID();
            PV1 pv1=adtMsg.getPV1();

            String current_date=getDateTime();

            if(msh.getMsh10_MessageControlID().getValue()!=null)
                 msg_code=msh.getMsh10_MessageControlID().getValue();
            else
                 msg_code=msh.getDateTimeOfMessage().getTs1_TimeOfAnEvent().getValue();



            String filestr="";
            FileInputStream fs = new FileInputStream(cpath+"\\templates\\general.xml");
            DataInputStream in = new DataInputStream(fs);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            while ((filestr = br.readLine()) != null)
                {
                    general_template=general_template+filestr+"\r\n";
                }
            in.close();

            filestr="";
            fs = new FileInputStream(cpath+"\\templates\\contents.xml");
            in = new DataInputStream(fs);
            br = new BufferedReader(new InputStreamReader(in));
            while ((filestr = br.readLine()) != null)
                {
                    contents_template=contents_template+filestr+"\r\n";
                }
            in.close();

            filestr="";
            fs = new FileInputStream(cpath+"\\templates\\labentry.xml");
            in = new DataInputStream(fs);
            br = new BufferedReader(new InputStreamReader(in));
            while ((filestr = br.readLine()) != null)
            {
                  labentry_template=labentry_template+filestr+"\r\n";
            }
            in.close();

            filestr="";
            fs = new FileInputStream(cpath+"\\templates\\probentry.xml");
            in = new DataInputStream(fs);
            br = new BufferedReader(new InputStreamReader(in));
            while ((filestr = br.readLine()) != null)
                {
                    problist_template=problist_template+filestr+"\r\n";
                }
            in.close();

            filestr="";
            fs = new FileInputStream(cpath+"\\templates\\procentry.xml");
            in = new DataInputStream(fs);
            br = new BufferedReader(new InputStreamReader(in));
            while ((filestr = br.readLine()) != null)
                {
                    proc_template=problist_template+filestr+"\r\n";
                }
            in.close();


            /*GENERAL*/
            general=general_template;
            general=general.replace("TMP_CDA_EXT", "c"+msg_code);
            general=general.replace("TMP_CDA_RELATEDDOC", "");
            general=general.replace("TMP_CREATION_DATE", current_date);
            general=general.replace("TMP_AUTHOR_TIME", current_date);
            general=general.replace("TMP_AUTHOR_GIVEN", "V1");
            general=general.replace("TMP_AUTHOR_FAMILY", "HL7_LISTENER");
            general=general.replace("TMP_LEGALAUTH_TIME", current_date);
            if(pid.getPatientName().getGivenName()!=null)
                general=general.replace("TMP_GIVEN_NAME", pid.getPatientName().getGivenName().toString());
            if(pid.getPatientName().getFamilyName()!=null)
                general=general.replace("TMP_FAMILY_NAME", pid.getPatientName().getFamilyName().toString());
            if(pid.getSex()!=null)
                general=general.replace("TMP_SEX", pid.getSex().toString());
            if(pid.getDateOfBirth()!=null)
                general=general.replace("TMP_BIRTHDATE", pid.getDateOfBirth().getTimeOfAnEvent().toString());
            //ask PIX
            String id="",namespace="ORBIS&www.salk.at&DNS";
            if(pid.getPatientIDInternalID(0).getCx1_ID()!=null)
                id=pid.getPatientIDInternalID(0).getCx1_ID().toString();
            /*if(pid.getPatientIDInternalID(0).getCx4_AssigningAuthority().getHd1_NamespaceID().getValue()!=null)
                namespace=pid.getPatientIDInternalID(0).getCx4_AssigningAuthority().getHd1_NamespaceID().getValue();
            if(pid.getPatientIDInternalID(0).getCx4_AssigningAuthority().getHd2_UniversalID().getValue()!=null)
                namespace+="&"+pid.getPatientIDInternalID(0).getCx4_AssigningAuthority().getHd2_UniversalID().getValue();
            if(pid.getPatientIDInternalID(0).getCx4_AssigningAuthority().getHd3_UniversalIDType().getValue()!=null)
                namespace+="&"+pid.getPatientIDInternalID(0).getCx4_AssigningAuthority().getHd3_UniversalIDType().getValue();*/
            /*if(pid.getPatientIDInternalID(0).getCx1_ID()!=null)
                general=general.replace("TMP_PATIENTID_ROOT", pid.getPatientIDInternalID(0).getCx1_ID().toString());
            if(pid.getPatientIDInternalID(0).getCx4_AssigningAuthority().getHd1_NamespaceID().getValue()!=null)
                general=general.replace("TMP_PATIENTID_EXT", pid.getPatientIDInternalID(0).getCx4_AssigningAuthority().getHd1_NamespaceID().getValue());*/
            String socket_msg="MSH|^~\\&|EHRListener|EHR|PIX|EHR|"+current_date+"||QBP^Q23^QBP_Q21|ListenerMsg|P|2.5\r"+
                                "QPD|IHE PIX Query|ListenerQry|"+id+"^^^"+namespace+"|\r"+
                                "RCP|I\r";

            /*String visit_no="";
            if (pv1.getVisitNumber()!=null && pv1.getVisitNumber().getID()!=null){
                    visit_no=pv1.getVisitNumber().getID().getValue();
                    StoreVisitNo(visit_no, id);
            }*/

            String resp=sendMessage(socket_msg);
            if(resp.equals(""))
                return "";

                    try{
                        int k=resp.indexOf("PID");
                        if(k>=0){
                            resp=resp.substring(k);
                            String segs[]=resp.replace("|", "000").split("000");
                            String ehr_id[];
                            if(segs.length>=4){
                                String tmpstr[]=segs[3].split("~");
                                ehr_id=tmpstr[0].replace("^", "000").split("000");
                                id=ehr_id[0];
                                String namespace_tmp[]=ehr_id[3].split("&");
                                namespace=namespace_tmp[1]+"&"+namespace_tmp[2];
                            }
                        }
                        else if(resp.indexOf("ERR")>=0){
                            System.err.println("PIX Query Error!!!");
                            return "";
                        }
                        else{
                            String address="",dob="19800124",sex="M",lname="Tester", fname="Tester";
                            String new_pid="p"+id;
                            String iid="i"+id;
                            socket_msg="MSH|^~\\&|EHRListener|EHR|PIX|EHR|"+current_date+"||ADT^A01^ADT_A01|ListenerMsg|P|2.3.1\r"+
					"EVN||"+current_date+"\r"+
					"PID|||"+new_pid+"^^^icardea.pix&1.2.826.0.1.3680043.2.44.248240.1&ISO~"+id+"^^^"+namespace+"~"+iid+"^^^CIED&bbe3a050-079a-11e0-81e0-0800200c9a66&UUID||"+lname+"^"+fname+"||"+dob+"|"+sex+"|||"+address+"||||||||\r"+
					"PV1||O\r";

                            resp=sendMessage(socket_msg);
                            if(resp.indexOf("ERR")>=0){
                                System.err.println("PIX Feed Error!!!");
                                return "";
                            }
                            namespace="1.2.826.0.1.3680043.2.44.248240.1&ISO";
                            id=new_pid;
                        }
                    }
                    catch(Exception ex){
                        System.err.println("Cannot retrieve EHR id:"+ex.getMessage());
                        return "";
                    }
                    finally{
                        general=general.replace("TMP_PATIENTID_ROOT", namespace);
                        general=general.replace("TMP_PATIENTID_EXT", id);
                        Audit.patientid=id;
                    }


            //Message m=;
            //ca.uhn.hl7v2.model.v25.message.RSP_K23 pix_msg=(ca.uhn.hl7v2.model.v25.message.RSP_K23)m;
            //err=pix_msg.getERR();

            /********/

            CTSClient cts =new CTSClient(Config.GetSetting("CTS_URL"));
            //String cts_res1=cts.translateCode("ICD10","F90.1", "UMLS");
            //System.out.println("CTS RESULT: "+cts_res1);

            /*DG1,AL1*/
            content_items="";
            problistentries="";

            int number_of_dg1=adtMsg.getDG1Reps();
            for(int i=0;i<number_of_dg1;i++)
            {
                        String entry=problist_template;
                        DG1 prob=adtMsg.getDG1(i);

                        entry=entry.replace("TMP_PROB_TYPECODE", "282291009");
                        entry=entry.replace("TMP_PROB_TYPEDESCR", "Diagnosis");

                        /*if(prob.getDiagnosisType()!=null){
                            entry=entry.replace("TMP_PROB_XSITYPE", prob.getDiagnosisType().getValue());
                        }
                        else
                        {
                            entry=entry.replace("TMP_PROB_XSITYPE", "");
                        }*/

                        entry=entry.replace("TMP_PROB_XSITYPE", "CD");

                        /*SOS-Codemapping needed*/
                        String probcode="",probtext="",probcs="",probcsname="";
                        Boolean b=false;


                        //CTS call
                        if(prob.getDg13_DiagnosisCode().getCe1_Identifier().getValue()!=null && prob.getDg13_DiagnosisCode().getCe3_NameOfCodingSystem().getValue()!=null){
                            System.out.println("********ASK CTS**********");
                            String cts_res=cts.translateCode(prob.getDg13_DiagnosisCode().getCe3_NameOfCodingSystem().getValue().replace("I10","ICD10"),prob.getDg13_DiagnosisCode().getCe1_Identifier().getValue(), "UMLS");
                            System.out.println("CTS RESULT: "+cts_res);
                            if(cts_res!=null && cts_res.trim().length()>0){
                                    probcode=cts_res;
                                    if(prob.getDg13_DiagnosisCode().getCe2_Text().getValue()!=null){
                                        probtext=prob.getDg13_DiagnosisCode().getCe2_Text().getValue();
                                    }
                                    else
                                    {
                                        probtext="";
                                    }
                                    probcs="UMLS";
                                    probcsname="UMLS";
                                    entry=entry.replace("TMP_PROB_VALUE_CODE",probcode);
                                    entry=entry.replace("TMP_PROB_VALUE_CODINGSYSTEMNAME",probcsname);
                                    entry=entry.replace("TMP_PROB_VALUE_CODINGSYSTEM", probcs);
                                    entry=entry.replace("TMP_PROB_VALUE_DISPLAYNAME", probtext);
                                    b=true;
                                }
                            }
                        /*if(prob.getDg13_DiagnosisCode().getCe1_Identifier().getValue()!=null){
                            filestr="";
                            fs = new FileInputStream(cpath+"\\codes\\cts.txt");
                            in = new DataInputStream(fs);
                            br = new BufferedReader(new InputStreamReader(in));
                            while ((filestr = br.readLine()) != null)
                            {
                                String tmp[]=filestr.split("\\|");
                                String tmp1[]=tmp[0].split("\\^");
                                String tmp2[]=tmp[1].split("\\^");
                                if(tmp1[0].equals(prob.getDg13_DiagnosisCode().getCe1_Identifier().getValue())){
                                    probcode=tmp2[0];
                                    probtext=tmp2[1];
                                    probcs=tmp2[2];
                                    probcsname=tmp2[2];
                                    b=true;
                                    break;
                                }
                            }
                            in.close();
                            if(b==true){
                                entry=entry.replace("TMP_PROB_VALUE_CODE", probcode);
                                entry=entry.replace("TMP_PROB_VALUE_CODINGSYSTEMNAME", probcsname);
                                entry=entry.replace("TMP_PROB_VALUE_CODINGSYSTEM", probcs);
                                entry=entry.replace("TMP_PROB_VALUE_DISPLAYNAME", probtext);
                                content_items+="<item>"+probtext+"</item>\r\n";
                            }
                        }*/

                        if(b==false){
                        if(prob.getDg13_DiagnosisCode().getCe1_Identifier().getValue()!=null){
                            entry=entry.replace("TMP_PROB_VALUE_CODE", prob.getDg13_DiagnosisCode().getCe1_Identifier().getValue());
                        }
                        else
                        {
                            entry=entry.replace("TMP_PROB_VALUE_CODE", "");
                        }


                        if(prob.getDg13_DiagnosisCode().getCe3_NameOfCodingSystem().getValue()!=null){
                            entry=entry.replace("TMP_PROB_VALUE_CODINGSYSTEMNAME", prob.getDg13_DiagnosisCode().getCe3_NameOfCodingSystem().getValue());
                        }
                        else
                        {
                            entry=entry.replace("TMP_PROB_VALUE_CODINGSYSTEMNAME", "");
                        }

                        /*SOS-Codemapping needed*/
                        if(prob.getDg13_DiagnosisCode().getCe3_NameOfCodingSystem().getValue()!=null){
                            entry=entry.replace("TMP_PROB_VALUE_CODINGSYSTEM", prob.getDg13_DiagnosisCode().getCe3_NameOfCodingSystem().getValue());
                        }
                        else
                        {
                            entry=entry.replace("TMP_PROB_VALUE_CODINGSYSTEM", "");
                        }



                        if(prob.getDg13_DiagnosisCode().getCe2_Text().getValue()!=null){
                            entry=entry.replace("TMP_PROB_VALUE_DISPLAYNAME", prob.getDg13_DiagnosisCode().getCe2_Text().getValue());
                            content_items+="<item>"+prob.getDg13_DiagnosisCode().getCe2_Text().getValue()+"</item>\r\n";
                        }
                        else
                        {
                            entry=entry.replace("TMP_PROB_VALUE_DISPLAYNAME", "");
                            content_items+="<item></item>\r\n";
                        }
                        }

                        if(prob.getDg15_DiagnosisDateTime().getTs1_TimeOfAnEvent().getValue()!=null){
                            entry=entry.replace("TMP_PROB_DATE_LOW", prob.getDg15_DiagnosisDateTime().getTs1_TimeOfAnEvent().toString());
                        }
                        else
                        {
                            entry=entry.replace("TMP_PROB_DATE_LOW", "");
                        }

                        if(prob.getDg15_DiagnosisDateTime().getTs1_TimeOfAnEvent().getValue()!=null){
                            entry=entry.replace("TMP_PROB_DATE_HIGH", prob.getDg15_DiagnosisDateTime().getTs1_TimeOfAnEvent().toString());
                        }
                        else
                        {
                            entry=entry.replace("TMP_PROB_DATE_HIGH", "");
                        }

                        //???
                        entry=entry.replace("TMP_PROB_STATUS", "completed");

                        /*if(prob.get!=null){
                            entry=entry.replace("TMP_PROB_STATUS", prob.getDg15_DiagnosisDateTime().getTs1_TimeOfAnEvent().toString());
                        }
                        else
                        {
                            entry=entry.replace("TMP_PROB_STATUS", "Completed");
                        }*/


                        problistentries+=entry;
            }




            if((number_of_dg1)>0){
                contents+=contents_template.replace("TMP_CONTENTS_TITLE","PROBLEM LIST");
                contents=contents.replace("TMP_CONTENTS_CODESYSTEMNAME","LOINC");
                contents=contents.replace("TMP_CONTENTS_CODESYSTEM","2.16.840.1.113883.6.1");
                contents=contents.replace("TMP_CONTENTS_ITEMS", content_items);
                contents=contents.replace("TMP_ENTRIES", problistentries);
            }


            /*PR1*/
            content_items="";
            proc_entries="";
            int number_of_proc=adtMsg.getPROCEDUREReps();
            for(int i=0;i<number_of_proc;i++)
            {
                        String entry=proc_template;
                        PR1 proc=adtMsg.getPROCEDURE(i).getPR1();

                        /*SOS-Codemapping needed*/
                        String probcode="",probtext="",probcs="",probcsname="";
                        Boolean b=false;

                         //CTS call
                        if(proc.getProcedureCode().getCe1_Identifier().getValue()!=null && proc.getProcedureCode().getCe3_NameOfCodingSystem().getValue()!=null){
                            System.out.println("********ASK CTS**********");
                            String cts_res=cts.translateCode(proc.getProcedureCode().getCe3_NameOfCodingSystem().getValue().replace("I10","ICD10"),proc.getProcedureCode().getCe1_Identifier().getValue(), "UMLS");
                            System.out.println("CTS RESULT: "+cts_res);
                            if(cts_res!=null && cts_res.trim().length()>0){
                                    probcode=cts_res;
                                    if(proc.getPr13_ProcedureCode().getCe2_Text().getValue()!=null){
                                        probtext=proc.getPr13_ProcedureCode().getCe2_Text().getValue();
                                    }
                                    else
                                    {
                                        probtext="";
                                    }
                                    probcs="UMLS";
                                    probcsname="UMLS";
                                    entry=entry.replace("TMP_PROC_CODE",probcode);
                                    entry=entry.replace("TMP_PROC_CODING_NAME",probcsname);
                                    entry=entry.replace("TMP_PROC_CODING_SYSTEM", probcs);
                                    entry=entry.replace("TMP_PROC_TEXT", probtext);
                                    b=true;
                                }
                            }

                        /*if(proc.getProcedureCode().getCe1_Identifier().getValue()!=null){
                            filestr="";
                            fs = new FileInputStream(cpath+"\\codes\\cts.txt");
                            in = new DataInputStream(fs);
                            br = new BufferedReader(new InputStreamReader(in));
                            while ((filestr = br.readLine()) != null)
                            {
                                String tmp[]=filestr.split("\\|");
                                String tmp1[]=tmp[0].split("\\^");
                                String tmp2[]=tmp[1].split("\\^");
                                if(tmp1[0].equals(proc.getProcedureCode().getCe1_Identifier().getValue())){
                                    probcode=tmp2[0];
                                    probtext=tmp2[1];
                                    probcs=tmp2[2];
                                    probcsname=tmp2[2];
                                    b=true;
                                    break;
                                }
                            }
                            in.close();
                            if(b==true){
                                entry=entry.replace("TMP_PROC_CODE", probcode);
                                entry=entry.replace("TMP_PROC_CODING_SYSTEM", probcs);
                                entry=entry.replace("TMP_PROC_CODING_NAME", probcsname);
                                entry=entry.replace("TMP_PROC_TEXT", probtext);
                                content_items+="<item>"+probtext+"</item>\r\n";
                            }
                        }*/

                        if(b==false){
                        if(proc.getProcedureCode().getCe1_Identifier().getValue()!=null){
                            entry=entry.replace("TMP_PROC_CODE", proc.getProcedureCode().getCe1_Identifier().getValue());
                        }
                        else
                        {
                            entry=entry.replace("TMP_PROC_CODE", "");
                        }


                        /*SOS-Codemapping needed*/
                        if(proc.getProcedureCode().getCe3_NameOfCodingSystem().getValue()!=null){
                            entry=entry.replace("TMP_PROC_CODING_SYSTEM", proc.getProcedureCode().getCe3_NameOfCodingSystem().getValue());
                        }
                        else
                        {
                            entry=entry.replace("TMP_PROC_CODING_SYSTEM", "");
                        }

                        if(proc.getProcedureCode().getCe3_NameOfCodingSystem().getValue()!=null){
                            entry=entry.replace("TMP_PROC_CODING_NAME", proc.getProcedureCode().getCe3_NameOfCodingSystem().getValue());
                        }
                        else
                        {
                            entry=entry.replace("TMP_PROC_CODING_NAME", "");
                        }

                        if(proc.getPr13_ProcedureCode().getCe2_Text().getValue()!=null){
                            entry=entry.replace("TMP_PROC_TEXT", proc.getPr13_ProcedureCode().getCe2_Text().getValue());
                            content_items+="<item>"+proc.getPr13_ProcedureCode().getCe2_Text().getValue()+"</item>\r\n";
                        }
                        else
                        {
                            entry=entry.replace("TMP_PROC_TEXT", "");
                            content_items+="<item></item>\r\n";
                        }
                        }

                        if(proc.getPr15_ProcedureDateTime().getTs1_TimeOfAnEvent()!=null){
                            entry=entry.replace("TMP_PROC_LOW", proc.getPr15_ProcedureDateTime().getTs1_TimeOfAnEvent().toString());
                        }
                        else
                        {
                            entry=entry.replace("TMP_PROC_LOW", "");
                        }

                        if(proc.getPr15_ProcedureDateTime().getTs1_TimeOfAnEvent()!=null){
                            entry=entry.replace("TMP_PROC_HIGH", proc.getPr15_ProcedureDateTime().getTs1_TimeOfAnEvent().toString());
                        }
                        else
                        {
                            entry=entry.replace("TMP_PROC_HIGH", "");
                        }


                        proc_entries+=entry;
            }


            if(number_of_proc>0){
                contents+=contents_template;
                contents=contents.replace("TMP_CONTENTS_TITLE","PROCEDURES");
                contents=contents.replace("TMP_CONTENTS_CODESYSTEMNAME","LOINC");
                contents=contents.replace("TMP_CONTENTS_CODESYSTEM","2.16.840.1.113883.6.1");
                contents=contents.replace("TMP_CONTENTS_ITEMS", content_items);
                contents=contents.replace("TMP_ENTRIES", proc_entries);
            }



            /*OBX*/
            /*content_items="";
            labentries="";
            int number_of_obx=adtMsg.getOBXReps();
            for(int i=0;i<number_of_obx;i++)
            {
                        String entry=labentry_template;
                        OBX obx=adtMsg.getOBX(i);


                        String probcode="",probtext="",probcs="",probcsname="";
                        Boolean b=false;
                        if(obx.getObservationIdentifier().getIdentifier()!=null){
                            filestr="";
                            fs = new FileInputStream(cpath+"\\codes\\cts.txt");
                            in = new DataInputStream(fs);
                            br = new BufferedReader(new InputStreamReader(in));
                            while ((filestr = br.readLine()) != null)
                            {
                                String tmp[]=filestr.split("\\|");
                                String tmp1[]=tmp[0].split("\\^");
                                String tmp2[]=tmp[1].split("\\^");
                                if(tmp1[0].equals(obx.getObservationIdentifier().getIdentifier().getValue())){
                                    probcode=tmp2[0];
                                    probtext=tmp2[1];
                                    probcs=tmp2[2];
                                    probcsname=tmp2[2];
                                    b=true;
                                    break;
                                }
                            }
                            in.close();
                            if(b==true){
                                entry=entry.replace("TMP_LAB_CODE", probcode);
                                entry=entry.replace("TMP_LAB_CODINGSYSTEM", probcs);
                                entry=entry.replace("TMP_LAB_CODING_NAME", probcsname);
                                entry=entry.replace("TMP_LAB_TEXT", probtext);
                                content_items+="<item>"+probtext+"</item>\r\n";
                            }
                        }

                        if(b==false){
                        if(obx.getObservationIdentifier().getIdentifier().getValue()!=null){
                            entry=entry.replace("TMP_LAB_CODE", obx.getObservationIdentifier().getIdentifier().getValue());
                        }
                        else
                        {
                            entry=entry.replace("TMP_LAB_CODE", "");
                        }


                        if(obx.getObservationIdentifier().getNameOfCodingSystem().getValue()!=null){
                            entry=entry.replace("TMP_LAB_CODINGSYSTEM", obx.getObservationIdentifier().getNameOfCodingSystem().getValue());
                        }
                        else
                        {
                            entry=entry.replace("TMP_LAB_CODINGSYSTEM", "");
                        }

                        if(obx.getObservationIdentifier().getNameOfCodingSystem().getValue()!=null){
                            entry=entry.replace("TMP_LAB_CODING_NAME", obx.getObservationIdentifier().getNameOfCodingSystem().getValue());
                        }
                        else
                        {
                            entry=entry.replace("TMP_LAB_CODING_NAME", "");
                        }

                        if(obx.getObservationIdentifier().getText().getValue()!=null){
                            entry=entry.replace("TMP_LAB_TEXT", obx.getObservationIdentifier().getText().getValue());
                            content_items+="<item>"+obx.getObservationIdentifier().getText().toString()+"</item>\r\n";
                        }
                        else
                        {
                            entry=entry.replace("TMP_LAB_TEXT", "");
                            content_items+="<item></item>\r\n";
                        }
                        }

                        if(obx.getDateTimeOfTheObservation().getTimeOfAnEvent()!=null){
                            entry=entry.replace("TMP_LAB_DATE", obx.getDateTimeOfTheObservation().getTimeOfAnEvent().toString());
                        }
                        else
                        {
                            entry=entry.replace("TMP_LAB_DATE", "");
                        }

                        if("NM".equals(obx.getObx2_ValueType().getValue())){
                            entry=entry.replace("TMP_XSITYPE", "PQ");
                            if(obx.getObservationValue(0).getData()!=null){
                                entry=entry.replace("TMP_LAB_VALUE", obx.getObservationValue(0).getData().toString());
                                entry=entry.replace("TMP_LAB_UNIT", obx.getObx6_Units().getComponent(0).toString());
                            }
                            else
                            {
                                entry=entry.replace("TMP_LAB_VALUE", "");
                                entry=entry.replace("TMP_LAB_UNIT", "");
                            }
                        }
                        else if("ST".equals(obx.getObx2_ValueType().getValue()))
                        {
                            entry=entry.replace("TMP_XSITYPE", "CE");
                            if(obx.getObservationValue(0).getData()!=null){
                                entry=entry.replace("TMP_LAB_VALUE", obx.getObservationValue(0).getData().toString());
                                entry=entry.replace("TMP_LAB_UNIT", "");
                            }
                            else{
                                entry=entry.replace("TMP_LAB_VALUE", "");
                                entry=entry.replace("TMP_LAB_UNIT", "");
                            }
                        }
                         else
                             ;

                        labentries+=entry;
            }

            if(number_of_obx>0){
                contents+=contents_template;
                contents=contents.replace("TMP_CONTENTS_TITLE","LAB RESULTS");
                contents=contents.replace("TMP_CONTENTS_CODESYSTEMNAME","LOINC");
                contents=contents.replace("TMP_CONTENTS_CODESYSTEM","2.16.840.1.113883.6.1");
                contents=contents.replace("TMP_CONTENTS_ITEMS", content_items);
                contents=contents.replace("TMP_ENTRIES", labentries);
            }*/






           res=general.replace("TMP_MEDICAL_DATA", contents);

           if(contents.trim().length()==0){
               System.out.println("HL7 message has no medical data!");
               return "";
            }

        } catch (HL7Exception ex) {
            Logger.getLogger(ListenerService.class.getName()).log(Level.SEVERE, null, ex);
            res="";
        } catch (IOException ex) {
            Logger.getLogger(ListenerService.class.getName()).log(Level.SEVERE, null, ex);
            res="";
        } catch (Exception ex) {
            Logger.getLogger(ListenerService.class.getName()).log(Level.SEVERE, null, ex);
            res="";
        }

        return msg_code+"CDACONTENTS:"+res.replaceAll("&", "&amp;");
    }

    public static String ParseOBX(ORU_R01 adtMsg){
            String res="",msg_code="";
            String content_items="",labentry_template="",labentries="", general_template="", general="", contents_template="", contents="";
            String replacedoc="<relatedDocument typeCode='RPLC'>\r\n"+
		 "<templateId root='1.3.6.1.4.1.19376.1.5.3.1.2.7'/>\r\n"+
		 "<parentDocument classCode='DOCCLIN' moodCode='EVN'>\r\n"+
		  "<id root='DOC_ROOT' extension='2.16.840.1.113883.19.4'/>\r\n"+
		 "</parentDocument>\r\n</relatedDocument>\r\n";

            try {
                    String cpath=Config.GetSetting("config");
                    MSH msh = adtMsg.getMSH();
                    PID pid = adtMsg.getRESPONSE().getPATIENT().getPID();
                    PV1 pv1=adtMsg.getRESPONSE().getPATIENT().getVISIT().getPV1();
                    ORC orc=adtMsg.getRESPONSE().getORDER_OBSERVATION().getORC();
                    OBR obr = adtMsg.getRESPONSE().getORDER_OBSERVATION().getOBR();

                    String current_date=getDateTime();

                    if(msh.getMsh10_MessageControlID().getValue()!=null)
                        msg_code=msh.getMsh10_MessageControlID().getValue();
                    else
                        msg_code=msh.getDateTimeOfMessage().getTs1_TimeOfAnEvent().getValue();

                    String filestr="";
                    FileInputStream fs = new FileInputStream(cpath+"\\templates\\general.xml");
                    DataInputStream in = new DataInputStream(fs);
                    BufferedReader br = new BufferedReader(new InputStreamReader(in));
                    while ((filestr = br.readLine()) != null)
                    {
                        general_template=general_template+filestr+"\r\n";
                    }
                    in.close();

                    filestr="";
                    fs = new FileInputStream(cpath+"\\templates\\labentry.xml");
                    in = new DataInputStream(fs);
                    br = new BufferedReader(new InputStreamReader(in));
                    while ((filestr = br.readLine()) != null)
                    {
                        labentry_template=labentry_template+filestr+"\r\n";
                    }
                    in.close();

                    filestr="";
                    fs = new FileInputStream(cpath+"\\templates\\contents.xml");
                    in = new DataInputStream(fs);
                    br = new BufferedReader(new InputStreamReader(in));
                    while ((filestr = br.readLine()) != null)
                    {
                        contents_template=contents_template+filestr+"\r\n";
                    }
                    in.close();


                    
                     /*GENERAL*/
                    general=general_template;
                    general=general.replace("TMP_CDA_EXT", "c"+msg_code);
                    general=general.replace("TMP_CDA_RELATEDDOC", "");
                     general=general.replace("TMP_CREATION_DATE",current_date);
                     general=general.replace("TMP_AUTHOR_TIME", current_date);
                     general=general.replace("TMP_AUTHOR_GIVEN", "V1");
                     general=general.replace("TMP_AUTHOR_FAMILY", "HL7_LISTENER");
                    general=general.replace("TMP_LEGALAUTH_TIME", current_date);
                    if(pid.getPatientName().getGivenName()!=null)
                        general=general.replace("TMP_GIVEN_NAME", pid.getPatientName().getGivenName().toString());
                    if(pid.getPatientName().getFamilyName()!=null)
                        general=general.replace("TMP_FAMILY_NAME", pid.getPatientName().getFamilyName().toString());
                    if(pid.getSex()!=null)
                        general=general.replace("TMP_SEX", pid.getSex().toString());
                    if(pid.getDateOfBirth()!=null)
                        general=general.replace("TMP_BIRTHDATE", pid.getDateOfBirth().getTimeOfAnEvent().toString());
                     general=general.replace("TMP_GIVEN_NAME", pid.getPatientName().getGivenName().toString());
                     general=general.replace("TMP_FAMILY_NAME", pid.getPatientName().getFamilyName().toString());
                     general=general.replace("TMP_SEX", pid.getSex().toString());
                     general=general.replace("TMP_BIRTHDATE", pid.getDateOfBirth().getTimeOfAnEvent().toString());
                     //ask PIX
                     String id="",namespace="ORBIS&www.salk.at&DNS";
                    if(pid.getPatientIDInternalID(0).getCx1_ID()!=null)
                        id=pid.getPatientIDInternalID(0).getCx1_ID().toString();
                    /*if(pid.getPatientIDInternalID(0).getCx4_AssigningAuthority().getHd1_NamespaceID().getValue()!=null)
                        namespace=pid.getPatientIDInternalID(0).getCx4_AssigningAuthority().getHd1_NamespaceID().getValue();
                    if(pid.getPatientIDInternalID(0).getCx4_AssigningAuthority().getHd2_UniversalID().getValue()!=null)
                        namespace+="&"+pid.getPatientIDInternalID(0).getCx4_AssigningAuthority().getHd2_UniversalID().getValue();
                    if(pid.getPatientIDInternalID(0).getCx4_AssigningAuthority().getHd3_UniversalIDType().getValue()!=null)
                        namespace+="&"+pid.getPatientIDInternalID(0).getCx4_AssigningAuthority().getHd3_UniversalIDType().getValue();*/
                     /*if(pid.getPatientIDInternalID(0).getCx1_ID()!=null)
                        general=general.replace("TMP_PATIENTID_ROOT", pid.getPatientIDInternalID(0).getCx1_ID().toString());
                    if(pid.getPatientIDInternalID(0).getCx4_AssigningAuthority().getHd1_NamespaceID().getValue()!=null)
                        general=general.replace("TMP_PATIENTID_EXT", pid.getPatientIDInternalID(0).getCx4_AssigningAuthority().getHd1_NamespaceID().getValue());*/
                    String socket_msg="MSH|^~\\&|EHRListener|EHR|PIX|EHR|"+current_date+"||QBP^Q23^QBP_Q21|ListenerMsg|P|2.5\r"+
                                        "QPD|IHE PIX Query|ListenerQry|"+id+"^^^"+namespace+"|\r"+
                                        "RCP|I\r";


                    /*String visit_no="";
                    if (pv1.getVisitNumber()!=null && pv1.getVisitNumber().getID()!=null){
                            visit_no=pv1.getVisitNumber().getID().getValue();
                            StoreVisitNo(visit_no, id);

                    }*/

                    String resp=sendMessage(socket_msg);
                    if(resp.equals(""))
                        return "";

                    try{
                        int k=resp.indexOf("PID");
                        if(k>=0){
                            resp=resp.substring(k);
                            String segs[]=resp.replace("|", "000").split("000");
                            String ehr_id[];
                            if(segs.length>=4){
                                String tmpstr[]=segs[3].split("~");
                                ehr_id=tmpstr[0].replace("^", "000").split("000");
                                id=ehr_id[0];
                                String namespace_tmp[]=ehr_id[3].split("&");
                                namespace=namespace_tmp[1]+"&"+namespace_tmp[2];
                            }
                        }
                        else if(resp.indexOf("ERR")>=0){
                            System.err.println("PIX Query Error!!!");
                            return "";
                        }
                        else{
                            String address="",dob="19800124",sex="M",lname="Tester", fname="Tester";
                            String new_pid="p"+id;
                            String iid="i"+id;
                            socket_msg="MSH|^~\\&|EHRListener|EHR|PIX|EHR|"+current_date+"||ADT^A01^ADT_A01|ListenerMsg|P|2.3.1\r"+
					"EVN||"+current_date+"\r"+
					"PID|||"+new_pid+"^^^icardea.pix&1.2.826.0.1.3680043.2.44.248240.1&ISO~"+id+"^^^"+namespace+"~"+iid+"^^^CIED&bbe3a050-079a-11e0-81e0-0800200c9a66&UUID||"+lname+"^"+fname+"||"+dob+"|"+sex+"|||"+address+"||||||||\r"+
					"PV1||O\r";

                            resp=sendMessage(socket_msg);
                            if(resp.indexOf("ERR")>=0){
                                System.err.println("PIX Feed Error!!!");
                                return "";
                            }
                            namespace="1.2.826.0.1.3680043.2.44.248240.1&ISO";
                            id=new_pid;
                        }
                    }
                    catch(Exception ex){
                        System.err.println("Cannot retrieve EHR id:"+ex.getMessage());
                        return "";
                    }
                    finally{
                        general=general.replace("TMP_PATIENTID_ROOT", namespace);
                        general=general.replace("TMP_PATIENTID_EXT", id);
                        Audit.patientid=id;
                    }
                     /********/

                     CTSClient cts =new CTSClient(Config.GetSetting("CTS_URL"));

                    
                    /*OBX*/
                    int number_of_obx=adtMsg.getRESPONSE().getORDER_OBSERVATION().getOBSERVATIONReps();
                    for(int i=0;i<number_of_obx;i++)
                    {
                        String entry=labentry_template;
                        OBX obx=adtMsg.getRESPONSE().getORDER_OBSERVATION().getOBSERVATION(i).getOBX();
                        String labcode="",labtext="",labcs="",labcsname="";
                        Boolean b=false;

                        //CTS call
                        if(obx.getObservationIdentifier().getIdentifier().toString()!=null && obx.getObservationIdentifier().getNameOfCodingSystem().getValue()!=null){
                            System.out.println("********ASK CTS**********");
                            String cts_res=cts.translateCode(obx.getObservationIdentifier().getNameOfCodingSystem().getValue(),obx.getObservationIdentifier().getIdentifier().toString(), "UMLS");
                            System.out.println("CTS RESULT: "+cts_res);
                            if(cts_res!=null && cts_res.trim().length()>0){
                                    labcode=cts_res;
                                    if(obx.getObservationIdentifier().getText().toString()!=null){
                                        labtext=obx.getObservationIdentifier().getText().toString();
                                    }
                                    else
                                    {
                                        labtext="";
                                    }
                                    labcs="UMLS";
                                    labcsname="UMLS";
                                    b=true;
                                }
                            }


                        /*if(obx.getObservationIdentifier().getIdentifier().toString()!=null){
                            filestr="";
                            fs = new FileInputStream(cpath+"\\codes\\cts.txt");
                            in = new DataInputStream(fs);
                            br = new BufferedReader(new InputStreamReader(in));
                            while ((filestr = br.readLine()) != null)
                            {
                                String tmp[]=filestr.split("\\|");
                                String tmp1[]=tmp[0].split("\\^");
                                String tmp2[]=tmp[1].split("\\^");
                                if(tmp1[0].equals(obx.getObservationIdentifier().getIdentifier().toString())){
                                    labcode=tmp2[0];
                                    labtext=tmp2[1];
                                    labcs=tmp2[2];
                                    labcsname=tmp2[2];
                                    b=true;
                                    break;
                                }
                            }
                            in.close();
                       }*/

                        if(b==false){
                        if(obx.getObservationIdentifier().getIdentifier().toString()!=null){
                            //entry=entry.replace("TMP_LAB_CODE", obx.getObservationIdentifier().getIdentifier().toString());
                            labcode=obx.getObservationIdentifier().getIdentifier().toString();
                        }
                        else
                        {
                            //entry=entry.replace("TMP_LAB_CODE", "");
                            labcode="";
                        }
                        labcode=obx.getObservationIdentifier().getIdentifier().toString();

                        if(obx.getObservationIdentifier().getNameOfCodingSystem().getValue()!=null){
                            //entry=entry.replace("TMP_LAB_CODINGSYSTEM", obx.getObservationIdentifier().getNameOfCodingSystem().getValue());
                            labcs=obx.getObservationIdentifier().getNameOfCodingSystem().getValue();
                        }
                        else
                        {
                            //entry=entry.replace("TMP_LAB_CODINGSYSTEM", "");
                            labcs="";
                        }

                        if(obx.getObservationIdentifier().getNameOfCodingSystem().getValue()!=null){
                            //entry=entry.replace("TMP_LAB_CODING_NAME", obx.getObservationIdentifier().getNameOfCodingSystem().getValue());
                            labcsname=obx.getObservationIdentifier().getNameOfCodingSystem().getValue();
                        }
                        else
                        {
                            //entry=entry.replace("TMP_LAB_CODING_NAME", "");
                            labcsname="";
                        }

                        if(obx.getObservationIdentifier().getText().toString()!=null){
                            /*entry=entry.replace("TMP_LAB_TEXT", obx.getObservationIdentifier().getText().toString());
                            content_items+="<item>"+obx.getObservationIdentifier().getText().toString()+"</item>\r\n";
                            */
                            labtext=obx.getObservationIdentifier().getText().toString();
                        }
                        else
                        {
                            /*entry=entry.replace("TMP_LAB_TEXT", "");
                            content_items+="<item></item>\r\n";*/
                            labtext="";
                        }
                        }

                        if(obx.getDateTimeOfTheObservation().getTimeOfAnEvent().toString()!=null){
                            entry=entry.replace("TMP_LAB_DATE", obx.getDateTimeOfTheObservation().getTimeOfAnEvent().toString());
                        }
                        else
                        {
                            entry=entry.replace("TMP_LAB_DATE", "");
                        }

                        if("NM".equals(obx.getObx2_ValueType().getValue())){
                            if(obx.getObservationValue(0).getData().toString()==null || obx.getObservationValue(0).getData().toString().length()==0 || "folgt".equals(obx.getObservationValue(0).getData().toString())==true){
                                int tmp=i+1;
                                System.out.println("Observation "+tmp+": value does not exist. Observation ignored!!!!");
                                continue;
                            }
                            entry=entry.replace("TMP_XSITYPE", "PQ");
                            entry=entry.replace("TMP_LAB_VALUE_SN", "");
                            if(obx.getObservationValue(0).getData().toString()!=null){
                                entry=entry.replace("TMP_LAB_VALUE", obx.getObservationValue(0).getData().toString());      
                            }
                            else
                            {
                                entry=entry.replace("TMP_LAB_VALUE", "");
                            }
                            if(obx.getObx6_Units().getComponent(0).toString() != null){
                                entry=entry.replace("TMP_LAB_UNIT", obx.getObx6_Units().getComponent(0).toString());   
                            }
                            else
                            {
                                entry=entry.replace("TMP_LAB_UNIT", "");
                            }

                        }
                        else if("SN".equals(obx.getObx2_ValueType().getValue()))
                        {
                            if(obx.getObservationValue(0).getData().encode()==null || obx.getObservationValue(0).getData().encode().length()==0 || "folgt".equals(obx.getObservationValue(0).getData().encode())==true){
                                int tmp=i+1;
                                System.out.println("Observation "+tmp+": value does not exist. Observation ignored!!!!");
                                continue;
                            }
                            entry=entry.replace("TMP_XSITYPE", "IVL_PQ");
                            if(obx.getObservationValue(0).getData().encode()!=null){
                                String tmp=obx.getObservationValue(0).getData().encode().trim();
                                String sn_val="", sn_num="";
                                //<low value="4.4" inclusive="false"/>
                                if(tmp.length()>1 && ">=".equals(tmp.substring(0, 2))==true){
                                    sn_num=tmp.substring(2, tmp.length());
                                    sn_val="<low value=\""+sn_num+"\" inclusive=\"true\"/>";
                                }
                                else if(tmp.length()>1 && "<=".equals(tmp.substring(0, 2))==true){
                                    sn_num=tmp.substring(2, tmp.length());
                                    sn_val="<high value=\""+sn_num+"\" inclusive=\"true\"/>";
                                }
                                else if(">".equals(tmp.substring(0, 1))==true){
                                    sn_num=tmp.substring(1, tmp.length());
                                    sn_val="<low value=\""+sn_num+"\" inclusive=\"false\"/>";
                                }
                                else if("<".equals(tmp.substring(0, 1))==true){
                                    sn_num=tmp.substring(1, tmp.length());
                                    sn_val="<high value=\""+sn_num+"\" inclusive=\"false\"/>";
                                }
                                else{
                                    System.out.println("WARNING: Cannot parse '"+obx.getObservationValue(0).getData().encode()+"' observation value. Observation ignored!!!!");
                                    continue;
                                }
                                entry=entry.replace("value=\"TMP_LAB_VALUE\"", "");
                                entry=entry.replace("TMP_LAB_VALUE_SN", sn_val);
                                
                            }
                            else
                            {
                                entry=entry.replace("TMP_LAB_VALUE", "");
                                entry=entry.replace("TMP_LAB_VALUE_SN", "");
                            }
                            if(obx.getObx6_Units().getComponent(0).toString() != null){
                                entry=entry.replace("TMP_LAB_UNIT", obx.getObx6_Units().getComponent(0).toString());
                            }
                            else
                            {
                                entry=entry.replace("TMP_LAB_UNIT", "");
                            }

                        }
                        else if("ST".equals(obx.getObx2_ValueType().getValue()))
                        {
                            System.out.println("Observation type ST ignored!!!!");
                            continue;
                            /*entry=entry.replace("TMP_XSITYPE", "CE");
                            if(obx.getObservationValue(0).getData().toString()!=null){
                                entry=entry.replace("TMP_LAB_VALUE", obx.getObservationValue(0).getData().toString());
                                entry=entry.replace("TMP_LAB_UNIT", "");
                            }
                            else{
                                entry=entry.replace("TMP_LAB_VALUE", "");
                                entry=entry.replace("TMP_LAB_UNIT", "");
                            }*/
                        }
                        else if("RP".equals(obx.getObx2_ValueType().getValue())){
                            System.out.println("Observation type RP ignored!!!!");
                            continue;
                        }
                         else
                             continue;

                        
                        entry=entry.replace("TMP_LAB_CODE", labcode);
                        entry=entry.replace("TMP_LAB_CODINGSYSTEM", labcs);
                        entry=entry.replace("TMP_LAB_CODING_NAME", labcsname);
                        entry=entry.replace("TMP_LAB_TEXT", labtext);
                        content_items+="<item>"+labtext+"</item>\r\n";
                       
                        labentries+=entry;
                   }
                    /********/



                     contents=contents_template;
                     contents=contents.replace("TMP_CONTENTS_TITLE","LAB RESULTS");
                     contents=contents.replace("TMP_CONTENTS_CODESYSTEMNAME","LOINC");
                     contents=contents.replace("TMP_CONTENTS_CODESYSTEM","2.16.840.1.113883.6.1");
                     contents=contents.replace("TMP_CONTENTS_ITEMS", content_items);
                     contents=contents.replace("TMP_ENTRIES", labentries);

                     res=general.replace("TMP_MEDICAL_DATA", contents);

                    if(contents.trim().length()==0){
                       System.out.println("HL7 message has no medical data!");
                       return "";
                    }

        } catch (HL7Exception ex) {
            Logger.getLogger(ListenerService.class.getName()).log(Level.SEVERE, null, ex);
            res="";
        } catch (IOException ex) {
            Logger.getLogger(ListenerService.class.getName()).log(Level.SEVERE, null, ex);
            res="";
        } catch (Exception ex) {
            Logger.getLogger(ListenerService.class.getName()).log(Level.SEVERE, null, ex);
            res="";
        }

         return msg_code+"CDACONTENTS:"+res.replaceAll("&", "&amp;");

    }

}

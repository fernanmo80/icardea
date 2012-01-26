/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package gr.forth.ics.icardea.listener;

import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author petrakis
 */
public class ATNAClient {

     static Socket requestSocket;
	static InputStreamReader ir;
 	static OutputStreamWriter or;
        static BufferedWriter out;
        static BufferedReader in;
 	static String message;
    static String sendMessage(String msg, String ip, int port, boolean is_tcp){
                //msg=(char)11+msg+(char)28+(char)13;

		try{
                     //1. creating a socket to connect to the server
			requestSocket = new Socket(ip,port, is_tcp);
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
			System.out.println("**********************ATNA MSG>" + msg);


                        
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

                         System.out.println("***************ATNA RESPONSE>" + message);
                         return message;
		}
		catch(Exception ioException){
			ioException.printStackTrace();
                        return "";
		}
	}

    public static void main(String[] args) {
        String xml_header="<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>";
        String audit_msg="";
        String tm,hostname,appname,procid,bom,bom8,utf8,params, msg;
        tm="2011-12-10T23:56:00Z";
        hostname="localhost";
        appname="SENDER_APP";
        procid="12345";
        char cbom;
        //bom="\u00EF\u00BB\u00BF";
        bom="\uFEFF";
        //bom=Character.toString((char)239)+Character.toString((char)187)+Character.toString((char)191);
        cbom=0xfeff;
        utf8="";
        bom8="";
        //audit_msg="<AuditMessage><EventIdentification EventActionCode=\"C\" EventDateTime=\"2010-03-02T15:03:11.115Z\" EventOutcomeIndicator=\"0\"><EventID code=\"110107\" codeSystemName=\"DCM\" displayName=\"Import\" /><EventTypeCode code=\"ITI-14\" codeSystemName=\"IHE Transactions\" displayName=\"Register Document Set\" /></EventIdentification><ActiveParticipant AlternativeUserID=\"CAREFX USER\" UserIsRequestor=\"true\"><RoleIDCode code=\"110153\" codeSystemName=\"DCM\" displayName=\"Source\" /></ActiveParticipant><ActiveParticipant UserID=\"http://localhost:8080/services/xdsregistryb\" UserName=\"CAREFX\" AlternativeUserID=\"altID\" IsRequestor=\"false\"><RoleIDCode code=\"110152\" codeSystemName=\"Desination\" displayName=\"DCM\" /></ActiveParticipant><AuditSourceIdentification AuditEnterpriseSiteID=\"Hospital\" AuditSourceID=\"ReadingRoom\"><AuditSourceTypeCode code=\"1\" /></AuditSourceIdentification><ParticipantObjectIdentification ParticipantObjectID=\"SELF-5^^^&amp;amp;1.3.6.1.4.1.21367.2005.3.7&amp;amp;ISO\" ParticipantObjectTypeCode=\"1\" ParticipantObjectTypeCodeRole=\"1\" ParticipantObjectDataLifeCycle=\"1\" ParticipantObjectName=\"CAREFX\"><ParticipantObjectIDTypeCode code=\"2\" codeSystemName=\"RFC-3381\" displayName=\"Patient Number\" /></ParticipantObjectIdentification><ParticipantObjectIdentification ParticipantObjectID=\"2.16.840.1.114107.1.1.17.1.135001013018002033.126756017\" ParticipantObjectTypeCode=\"2\" ParticipantObjectTypeCodeRole=\"20\"><ParticipantObjectIDTypeCode code=\"urn:uuid:a54d6aa5-d40d-43f9-88c5-b4633d873bdd\" codeSystemName=\"IHE XDS Metadata\" displayName=\"submission set classificationNode\" /></ParticipantObjectIdentification></AuditMessage>";
        //audit_msg="<AuditMessage><EventIdentification EventOutcomeIndicator=\"0\" EventDateTime=\"2010-02-25T15:40:08.965-06:00\" EventActionCode=\"C\">        <EventID codeSystemName=\"DCM\" displayName=\"Import\" code=\"110107\"/>        <EventTypeCode codeSystemName=\"IHE Transactions\" displayName=\"Provide & Register Document Set-b\" code=\"ITI-41\"/>    </EventIdentification>    <ActiveParticipant NetworkAccessPointTypeCode=\"2\" NetworkAccessPointID=\"129.162.101.164\" UserIsRequestor=\"true\" UserID=\"http://www.w3.org/2005/08/addressing/anonymous\">        <RoleIDCode codeSystemName=\"DCM\" displayName=\"Source\" code=\"110153\"/>    </ActiveParticipant>    <ActiveParticipant NetworkAccessPointTypeCode=\"2\" NetworkAccessPointID=\"129.162.101.116\" UserIsRequestor=\"false\" UserID=\"http://localhost:8020/axis2/services/xdsrepositoryb\">        <RoleIDCode codeSystemName=\"DCM\" displayName=\"Destination\" code=\"110152\"/>    </ActiveParticipant>    <AuditSourceIdentification AuditSourceID=\"MISYS\" AuditEnterpriseSiteID=\"MISYS\"/>    <ParticipantObjectIdentification ParticipantObjectTypeCodeRole=\"1\" ParticipantObjectTypeCode=\"1\" ParticipantObjectID=\"1856\">        <ParticipantObjectIDTypeCode code=\"2\"/>        <ParticipantObjectName>PatientIdentifier</ParticipantObjectName>    </ParticipantObjectIdentification>    <ParticipantObjectIdentification ParticipantObjectTypeCodeRole=\"20\" ParticipantObjectTypeCode=\"2\" ParticipantObjectID=\"1.3.6.1.4.1.21367.2009.1.2.108.1267134002438\">        <ParticipantObjectIDTypeCode code=\"urn:uuid:a54d6aa5-d40d-43f9-88c5-b4633d873bdd\"/>        <ParticipantObjectName>SubmissionSet</ParticipantObjectName>    </ParticipantObjectIdentification></AuditMessage>";
        audit_msg="<AuditMessage><EventIdentification EventOutcomeIndicator=\"0\" EventDateTime=\"2010-02-25T15:40:08.965-06:00\" EventActionCode=\"C\"><EventID codeSystemName=\"DCM\" displayName=\"Import\" code=\"110107\"/><EventTypeCode codeSystemName=\"IHE Transactions\" displayName=\"Provide & Register Document Set-b\" code=\"ITI-41\"/></EventIdentification><ActiveParticipant NetworkAccessPointTypeCode=\"2\" NetworkAccessPointID=\"129.162.101.164\" UserIsRequestor=\"true\" UserID=\"http://www.w3.org/2005/08/addressing/anonymous\"><RoleIDCode codeSystemName=\"DCM\" displayName=\"Source\" code=\"110153\"/></ActiveParticipant><ActiveParticipant NetworkAccessPointTypeCode=\"2\" NetworkAccessPointID=\"129.162.101.116\" UserIsRequestor=\"false\" UserID=\"http://localhost:8020/axis2/services/xdsrepositoryb\"><RoleIDCode codeSystemName=\"DCM\" displayName=\"Destination\" code=\"110152\"/></ActiveParticipant><AuditSourceIdentification AuditSourceID=\"MISYS\" AuditEnterpriseSiteID=\"MISYS\"/><ParticipantObjectIdentification ParticipantObjectTypeCodeRole=\"1\" ParticipantObjectTypeCode=\"1\" ParticipantObjectID=\"1856\"><ParticipantObjectIDTypeCode code=\"2\"/><ParticipantObjectName>PatientIdentifier</ParticipantObjectName></ParticipantObjectIdentification><ParticipantObjectIdentification ParticipantObjectTypeCodeRole=\"20\" ParticipantObjectTypeCode=\"2\" ParticipantObjectID=\"1.3.6.1.4.1.21367.2009.1.2.108.1267134002438\"><ParticipantObjectIDTypeCode code=\"urn:uuid:a54d6aa5-d40d-43f9-88c5-b4633d873bdd\"/><ParticipantObjectName>SubmissionSet</ParticipantObjectName></ParticipantObjectIdentification></AuditMessage>";
        msg=xml_header+audit_msg;
        try {
            utf8 = new String(msg.getBytes(), "UTF-8");
            //bom8=new String(bom.getBytes(),"UTF-8");
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(ATNAClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        params="<80>1 " + tm + " " + hostname + " " + appname + " " + procid + " " + "IHE+RFC-3881"+ " - ";
        String final_msg= params+utf8;
        System.out.println(sendMessage(final_msg,Config.GetSetting("ATNA_ip"), Integer.parseInt(Config.GetSetting("ATNA_port")),false));
    }
}
 
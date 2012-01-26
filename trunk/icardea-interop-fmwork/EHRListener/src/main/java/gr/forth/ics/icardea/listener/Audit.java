/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package gr.forth.ics.icardea.listener;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
public class Audit {

    public static String submissionsetid="";
    public static String patientid="";
    private static DateFormat ISO8601Local = new SimpleDateFormat ("yyyy-MM-dd'T'HH:mm:ss");

 public static String syslog_header(String appname) {
  String procID = java.lang.management.ManagementFactory.getRuntimeMXBean().getName();
  String hostname = "";
  try {
      InetAddress addr = InetAddress.getLocalHost();
      hostname = addr.getHostName();
  } catch (UnknownHostException e) {
  }
  String dateStr = ISO8601Local.format (new Date());
  return "<80>1 " + dateStr + " " + hostname + ' ' + appname + ' ' + procID + ' ' + "IHE+RFC-3881"+ " - ";
 }
 public static byte[] create_syslog_xml(String appname, String xml) {
  String header = syslog_header(appname);
  byte[] bheader = header.getBytes();
  
  byte[] bom = {(byte)0xEF, (byte)0xBB, (byte)0xBF};
  byte[] bxml;
  try {
   bxml = xml.getBytes("UTF-8");
  } catch (UnsupportedEncodingException e) {
   return null;
  }

  int len = bheader.length + bom.length + bxml.length;
  ByteArrayOutputStream buf = new ByteArrayOutputStream(len);
  buf.write(bheader, 0, bheader.length);
  buf.write(bom, 0, bom.length);
  buf.write(bxml, 0, bxml.length);

  return buf.toByteArray();
 }
 public static void send_udp(String host, int port, byte[] msg) {
  DatagramPacket packet;
  try {
   packet = new DatagramPacket(msg, msg.length,
     InetAddress.getByName(host), port);
   DatagramSocket socket = new DatagramSocket();
   socket.send(packet);
  } catch (UnknownHostException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  } catch (IOException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  }

 }


 public static String Send_ITI41_Audit(String app,String patient_id, String submissionsetid) throws UnknownHostException{
     String event_datetime=ISO8601Local.format (new Date());
     InetAddress addr = InetAddress.getLocalHost();
     String hostaddr=addr.getHostAddress();
     String requestornetaccesspointid=hostaddr;
     String receivernetaccesspointid=Config.GetSetting("ATNA_ip");
    String iti41="<AuditMessage><EventIdentification EventOutcomeIndicator=\"0\" EventDateTime=\""+event_datetime+"\" EventActionCode=\"C\"><EventID codeSystemName=\"DCM\" displayName=\"Import\" code=\"110107\"/><EventTypeCode codeSystemName=\"IHE Transactions\" displayName=\"Provide &amp; Register Document Set-b\" code=\"ITI-41\"/></EventIdentification><ActiveParticipant NetworkAccessPointTypeCode=\"2\" NetworkAccessPointID=\""+requestornetaccesspointid+"\" UserIsRequestor=\"true\" UserID=\"http://www.w3.org/2005/08/addressing/anonymous\"><RoleIDCode codeSystemName=\"DCM\" displayName=\"Source\" code=\"110153\"/></ActiveParticipant><ActiveParticipant NetworkAccessPointTypeCode=\"2\" NetworkAccessPointID=\""+receivernetaccesspointid+"\" UserIsRequestor=\"false\" UserID=\""+Config.GetSetting("xds")+"\"><RoleIDCode codeSystemName=\"DCM\" displayName=\"Destination\" code=\"110152\"/></ActiveParticipant><AuditSourceIdentification AuditSourceID=\"MISYS\" AuditEnterpriseSiteID=\"MISYS\"/><ParticipantObjectIdentification ParticipantObjectTypeCodeRole=\"1\" ParticipantObjectTypeCode=\"1\" ParticipantObjectID=\""+patient_id+"\"><ParticipantObjectIDTypeCode code=\"2\"/><ParticipantObjectName>PatientIdentifier</ParticipantObjectName></ParticipantObjectIdentification><ParticipantObjectIdentification ParticipantObjectTypeCodeRole=\"20\" ParticipantObjectTypeCode=\"2\" ParticipantObjectID=\""+submissionsetid+"\"><ParticipantObjectIDTypeCode code=\"urn:uuid:a54d6aa5-d40d-43f9-88c5-b4633d873bdd\"/><ParticipantObjectName>SubmissionSet</ParticipantObjectName></ParticipantObjectIdentification></AuditMessage>";
    //String test="<AuditMessage><EventIdentification EventOutcomeIndicator=\"0\" EventDateTime=\"2010-03-25T15:40:08.965-06:00\" EventActionCode=\"C\"><EventID codeSystemName=\"DCM\" displayName=\"Import\" code=\"110107\"/><EventTypeCode codeSystemName=\"IHE Transactions\" displayName=\"Provide &amp; Register Document Set-b\" code=\"ITI-41\"/></EventIdentification><ActiveParticipant NetworkAccessPointTypeCode=\"2\" NetworkAccessPointID=\"ACTOR\" UserIsRequestor=\"true\" UserID=\"http://www.w3.org/2005/08/addressing/anonymous\"><RoleIDCode codeSystemName=\"DCM\" displayName=\"Source\" code=\"110153\"/></ActiveParticipant><ActiveParticipant NetworkAccessPointTypeCode=\"2\" NetworkAccessPointID=\"139.91.190.45\" UserIsRequestor=\"false\" UserID=\"http://139.91.190.45:9080/xds/\"><RoleIDCode codeSystemName=\"DCM\" displayName=\"Destination\" code=\"110152\"/></ActiveParticipant><AuditSourceIdentification AuditSourceID=\"MISYS\" AuditEnterpriseSiteID=\"MISYS\"/><ParticipantObjectIdentification ParticipantObjectTypeCodeRole=\"1\" ParticipantObjectTypeCode=\"1\" ParticipantObjectID=\"ph1\"><ParticipantObjectIDTypeCode code=\"2\"/><ParticipantObjectName>PatientIdentifier</ParticipantObjectName></ParticipantObjectIdentification><ParticipantObjectIdentification ParticipantObjectTypeCodeRole=\"20\" ParticipantObjectTypeCode=\"2\" ParticipantObjectID=\"864e8919-6834-43ee-a7b6-52a5214028b7\"><ParticipantObjectIDTypeCode code=\"urn:uuid:a54d6aa5-d40d-43f9-88c5-b4633d873bdd\"/><ParticipantObjectName>SubmissionSet</ParticipantObjectName></ParticipantObjectIdentification></AuditMessage>";
    byte []b=create_syslog_xml(app, iti41);
    send_udp(Config.GetSetting("ATNA_ip"), Integer.parseInt(Config.GetSetting("ATNA_port")),b);
    return "";
 }
 public static void main(String args[]) throws UnknownHostException {
     /*String event_datetime="2010-03-25T15:40:08.965-06:00";
     InetAddress addr = InetAddress.getLocalHost();
     String hostaddr=addr.getHostName();
     String requestornetaccesspointid=hostaddr;
     String receivernetaccesspointid="139.91.190.45";
     String patient_id="123";
     String submissionsetid="1.3.6.1.4.1.21367.2009.1.2.108.1267134002438";
    String iti41="<AuditMessage><EventIdentification EventOutcomeIndicator=\"0\" EventDateTime=\""+event_datetime+"\" EventActionCode=\"C\"><EventID codeSystemName=\"DCM\" displayName=\"Import\" code=\"110107\"/><EventTypeCode codeSystemName=\"IHE Transactions\" displayName=\"Provide &amp; Register Document Set-b\" code=\"ITI-41\"/></EventIdentification><ActiveParticipant NetworkAccessPointTypeCode=\"2\" NetworkAccessPointID=\""+requestornetaccesspointid+"\" UserIsRequestor=\"true\" UserID=\"http://www.w3.org/2005/08/addressing/anonymous\"><RoleIDCode codeSystemName=\"DCM\" displayName=\"Source\" code=\"110153\"/></ActiveParticipant><ActiveParticipant NetworkAccessPointTypeCode=\"2\" NetworkAccessPointID=\""+receivernetaccesspointid+"\" UserIsRequestor=\"false\" UserID=\""+Config.GetSetting("xds")+"\"><RoleIDCode codeSystemName=\"DCM\" displayName=\"Destination\" code=\"110152\"/></ActiveParticipant><AuditSourceIdentification AuditSourceID=\"MISYS\" AuditEnterpriseSiteID=\"MISYS\"/><ParticipantObjectIdentification ParticipantObjectTypeCodeRole=\"1\" ParticipantObjectTypeCode=\"1\" ParticipantObjectID=\""+patient_id+"\"><ParticipantObjectIDTypeCode code=\"2\"/><ParticipantObjectName>PatientIdentifier</ParticipantObjectName></ParticipantObjectIdentification><ParticipantObjectIdentification ParticipantObjectTypeCodeRole=\"20\" ParticipantObjectTypeCode=\"2\" ParticipantObjectID=\""+submissionsetid+"\"><ParticipantObjectIDTypeCode code=\"urn:uuid:a54d6aa5-d40d-43f9-88c5-b4633d873bdd\"/><ParticipantObjectName>SubmissionSet</ParticipantObjectName></ParticipantObjectIdentification></AuditMessage>";
    
    byte []b=create_syslog_xml("test_app", iti41);
    send_udp(Config.GetSetting("ATNA_ip"), Integer.parseInt(Config.GetSetting("ATNA_port")),b);
    */
    Send_ITI41_Audit("test_app", Audit.patientid,Audit.submissionsetid);
 }
}

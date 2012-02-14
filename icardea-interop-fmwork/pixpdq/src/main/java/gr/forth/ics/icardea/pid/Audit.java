package gr.forth.ics.icardea.pid;

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
    
    // See http://tools.ietf.org/html/rfc3881#section-5.4
    public static final String AUDIT_ENTERPRISE_ID = "iCARDEA";
    public static final String AUDIT_SOURCE_ID = "iCARDEA.PIX";
    
    /*
    The DICOM Supplement 95 spec describes EventOutcomeIndicator as 
     "Indicates whether the event succeeded or failed." and describes its values as follows:
    0 - Nominal Success (use if status otherwise unknown or ambiguous)
    4 - Minor failure (per reporting application definition)
    8 - Serious failure (per reporting application definition)
    12 - Major failure, (reporting application now unavailable)
    */
    public static enum EventOutcomeIndicator { 
    	SUCCESS(0), 
    	MINOR_FAILURE(4), 
    	SERIOUS_FAILURE(8), 
    	MAJOR_FAILURE(12);
    	
    	private int code;

        private EventOutcomeIndicator(int code) {
             this.code = code;
        }

        public int getCode() { return code; }
        public String toString() { return ""+code; }
    };

    // See http://tools.ietf.org/html/rfc3881#section-5.3.1
    public static enum NetworkAccessPointTypeCode { 
    	MACHINE_NAME(1),
    	IP_ADDRESS(2),
    	TEL_NUMBER(3);
    	
    	private int code;

        private NetworkAccessPointTypeCode(int code) {
             this.code = code;
        }

        public int getCode() { return code; }
        public String toString() { return ""+code; }
    }

    // See http://tools.ietf.org/html/rfc3881#section-5.4.3
    public static enum AuditSourceTypeCode { 
    	END_USER_INTF(1),
    	DATA_ACQUIS_DEVC(2),
    	WEB_SRV_PROC(3),
    	APP_SRV_PROC(4),
    	DB_SRV_PROC(5),
    	SEC_SRV_PROC(6),
    	ISO_1_3_COMP(7),
    	ISO_4_6_COMP(8),
    	EXT_SRC_UNKNOWN(9);

    	private int code;

        private AuditSourceTypeCode(int code) {
             this.code = code;
        }

        public int getCode() { return code; }
        public String toString() { return ""+code; }
    }

    // See http://tools.ietf.org/html/rfc3881#section-5.5.1
    public static enum ParticipantObjectTypeCode {
    	PERSON(1),
    	SYS_OBJ(2),
    	ORG(3),
    	OTHER(4);

    	private int code;

        private ParticipantObjectTypeCode(int code) {
             this.code = code;
        }

        public int getCode() { return code; }
        public String toString() { return ""+code; }
    }
    // See http://tools.ietf.org/html/rfc3881#section-5.5.2
    public static enum ParticipantObjectTypeCodeRole {
    	PATIENT(1),
    	LOCATION(2),
    	REPORT(3),
    	RESOURCE(4),
    	// etc etc
    	QUERY(24);

    	private int code;

        private ParticipantObjectTypeCodeRole(int code) {
             this.code = code;
        }

        public int getCode() { return code; }
        public String toString() { return ""+code; }
    }
    // See http://tools.ietf.org/html/rfc3881#section-5.5.2
    public static enum ParticipantObjectIDTypeCode {
    	MED_RECORD(1),
    	PATIENT_NBR(2),
    	ENCOUNTER_NBR(3),
    	// etc etc
    	URI(12);

    	private int code;

        private ParticipantObjectIDTypeCode(int code) {
             this.code = code;
        }

        public int getCode() { return code; }
        public String toString() { return ""+code; }
    }
	public static String DEFAULT_AUDIT_HOST = "localhost";
    public static int DEFAULT_AUDIT_PORT = 2861;

    private static DateFormat ISO8601Local = new SimpleDateFormat ("yyyy-MM-dd'T'HH:mm:ss");
    private InetAddress host_;
    private int port_;
    
    public Audit() throws UnknownHostException {
    	this(DEFAULT_AUDIT_HOST, DEFAULT_AUDIT_PORT);
    }
    public Audit(String host, int port) throws UnknownHostException {
        this.host_ = InetAddress.getByName(host);
        this.port_ = port;
    }
    
	public String syslog_header(String appname) {
		String procID = java.lang.management.ManagementFactory.getRuntimeMXBean().getName();
		String hostname = "";
		try {
		    InetAddress addr = InetAddress.getLocalHost();
		    hostname = addr.getHostName();
		} catch (UnknownHostException e) {
		}
		String dateStr = ISO8601Local.format (new Date());
		return "<80>1 " + dateStr + " " + hostname + " " + appname + " " + procID + " " + "IHE+RFC-3881"+ " - ";
	}
	public byte[] create_syslog_xml(String appname, String xml) {
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
	public void send_udp(byte[] msg) {
		DatagramPacket packet;
		try {
			packet = new DatagramPacket(msg, msg.length, this.host_, this.port_);
			DatagramSocket socket = new DatagramSocket();
			socket.send(packet);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
    public static void main(String args[]) {
		String dateStr = ISO8601Local.format (new Date());
        String xml =
            "<AuditMessage>"+
            "    <EventIdentification EventOutcomeIndicator=\"0\" EventDateTime=\"" + dateStr + "\" EventActionCode=\"R\">"+
            "        <EventID codeSystemName=\"DCM\" displayName=\"Export\" code=\"110106\"/>"+
            "        <EventTypeCode codeSystemName=\"IHE Transactions\" displayName=\"Retrieve Document Set\" code=\"ITI-43\"/>"+
            "    </EventIdentification>"+
            "    <ActiveParticipant NetworkAccessPointTypeCode=\"2\" NetworkAccessPointID=\"129.162.101.164\" UserIsRequestor=\"false\" UserID=\"http://www.w3.org/2005/08/addressing/anonymous\">"+
            "        <RoleIDCode codeSystemName=\"DCM\" displayName=\"Source\" code=\"110153\"/>"+
            "    </ActiveParticipant>"+
            "    <ActiveParticipant NetworkAccessPointTypeCode=\"2\" NetworkAccessPointID=\"129.162.101.116\" UserIsRequestor=\"true\" UserID=\"http://localhost:8020/axis2/services/xdsrepositoryb\">"+
            "        <RoleIDCode codeSystemName=\"DCM\" displayName=\"Destination\" code=\"110152\"/>"+
            "    </ActiveParticipant>"+
            "    <AuditSourceIdentification AuditSourceID=\"MISYS\" AuditEnterpriseSiteID=\"MISYS\"/>"+
            "    <ParticipantObjectIdentification ParticipantObjectTypeCodeRole=\"3\" ParticipantObjectTypeCode=\"2\" ParticipantObjectID=\"2.16.840.1.113883.3.65.2.1266421824214\">"+
            "        <ParticipantObjectIDTypeCode code=\"9\"/>"+
            "        <ParticipantObjectDetail value=\"MS4zLjYuMS40LjEuMjEzNjcuMjAxMC4xLjIuMTEyNQ==\" type=\"RepositoryUniqueId\"/>"+
            "    </ParticipantObjectIdentification>"+
            "</AuditMessage>";

        try {
            Audit a = new Audit("139.91.190.43", 2861);
            a.send_udp( a.create_syslog_xml("testapp", xml) );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


package gr.forth.ics.icardea.listener;

import ca.uhn.hl7v2.*;
import ca.uhn.hl7v2.HL7Exception.*;
import ca.uhn.hl7v2.model.*;
import ca.uhn.hl7v2.model.v23.message.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
//import nu.xom.*;



class ListenerService implements ca.uhn.hl7v2.app.Application {
      public boolean canProcess(Message m) {
          return true;

      }
      /*Socket requestSocket;
	InputStreamReader ir;
 	OutputStreamWriter or;
        BufferedWriter out;
        BufferedReader in;
 	String message;

      void sendMessage(String msg)
	{
		try{
			out.write(msg);
			out.flush();
			System.out.println("client>" + msg);
		}
		catch(IOException ioException){
		}
	}
*/


public Message processMessage(Message m) throws HL7Exception {

         //Serializer serializer;
         String cda="", cda_path="", ack="",dft="";
         BufferedWriter writer = null;
                try
                {
                    writer = new BufferedWriter( new FileWriter("hl7log.txt", true));
                    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                    Date date = new Date();
                    writer.write("***RECEIVED MESSAGE AT (yyyy/MM/dd HH:mm:ss): "+dateFormat.format(date));
                    writer.newLine();
                    writer.append(m.encode());
                    writer.newLine();
                }
                catch ( IOException e)
                {
                    System.out.println("Cannot write log:"+e.getMessage());
                }
                finally
                {
                    try
                    {
                        if ( writer != null)
                            writer.close( );
                    }
                    catch ( IOException e)
                    {
                        System.out.println(e.getMessage());
                    }
                }
         System.out.println("RECEIVED HL7 MESSAGE");
         System.out.println("*********************");
	 System.out.println(m.encode());
	 System.out.println("*********************");
         System.out.println("*****START PROCESSING HL7 MESSAGE");
        try {
                if(m.getClass().getName().indexOf("ORU_R01")>=0){
                        ORU_R01 adtMsg = (ORU_R01)m;
                        cda=CDAConverter.ParseOBX(adtMsg);
                }
                else if(m.getClass().getName().indexOf("ADT_A01") >= 0)
                {
                        ADT_A01 adtMsg = (ADT_A01)m;
                        cda=CDAConverter.ParseADT(adtMsg);
                }
                else if(m.getClass().getName().indexOf("ADT_A03") >= 0)
                {
                        ADT_A03 adtMsg = (ADT_A03)m;
                        cda=CDAConverter.ParseADT(adtMsg);
                }
                else if(m.getClass().getName().indexOf("DFT_P03") >= 0)
                {
                        ca.uhn.hl7v2.model.v22.message.DFT_P03 dftMsg = (ca.uhn.hl7v2.model.v22.message.DFT_P03)m;
                        dft=CDAConverter.ParseDFT(dftMsg);
                        System.out.println("*****END PROCESSING HL7 MESSAGE");
                        System.out.println("*****READY TO FORWARD DFT");
                        return m.generateACK();
                }
                else{
                    System.out.println("***INVALID MESSAGE TYPE '"+m.getClass().getName()+"'****");
                    java.lang.Throwable cause=new java.lang.Throwable();
                    HL7Exception hle=new HL7Exception("INVALID MESSAGE TYPE",cause);
                    return m.generateACK("AE",hle);
                }
                System.out.println("*****END PROCESSING HL7 MESSAGE");
                if(cda.trim().length()==0){
                    java.lang.Throwable cause=new java.lang.Throwable();
                    HL7Exception hle=new HL7Exception("ERROR CREATING CDA DOCUMENT",cause);
                    return m.generateACK("AE",hle);
                }
                    
                //System.out.println(cda);
                String tmp[]=cda.trim().split("CDACONTENTS:");
                writer = null;
                try
                {
                    cda_path=Config.GetSetting("CDA_DIR")+"\\"+tmp[0]+".xml";
                    writer = new BufferedWriter( new FileWriter(cda_path));
                    writer.write(tmp[1]);
                }
                catch ( IOException e)
                {
                    System.out.println(e.getMessage());
                    java.lang.Throwable cause=new java.lang.Throwable();
                    HL7Exception hle=new HL7Exception(e.getMessage(),cause);
                    return m.generateACK("AE",hle);
                }
                finally
                {
                    try
                    {
                        if ( writer != null)
                            writer.close( );
                    }
                    catch ( IOException e)
                    {
                        System.out.println(e.getMessage());
                    }
                }


                try{
                    String res="";
                    String xds_url=Config.GetSetting("xds");
                    res=Listener.Provide_Register("Document01",cda_path,xds_url);
                    if (res.equals("")){
                        System.err.println("Registration Failed");
                        java.lang.Throwable cause=new java.lang.Throwable();
                        HL7Exception hle=new HL7Exception("Registration Failed",cause);
                        return m.generateACK("AE",hle);
                    }
                    else{
                        System.out.println("Registration succeeded\r\n"+res);
                    }
                    Audit.Send_ITI41_Audit("HL7_LISTENER",Audit.patientid,Audit.submissionsetid);
                }
                catch(Exception ex){
                    System.err.println("Error: " + ex.getMessage());
                    java.lang.Throwable cause=new java.lang.Throwable();
                    HL7Exception hle=new HL7Exception(ex.getMessage(),cause);
                    return m.generateACK("AE",hle);
                }

                

         }
         catch (Exception ex) {
            System.out.println("HL7 START**"+m.encode()+"**HL7 END");
            Logger.getLogger(ListenerService.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        try {
            return m.generateACK();
        } catch (IOException ex) {
            System.out.println("HL7 START**"+m.encode()+"**HL7 END");
            Logger.getLogger(ListenerService.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

}


      public static void main(String[] args) {

          HL7ValidationContext cnt=new HL7ValidationContext();
          gr.forth.ics.icardea.mllp.HL7MLLPServer sp= new gr.forth.ics.icardea.mllp.HL7MLLPServer();
          //gr.forth.ics.icardea.listener.HL7MLLPServer sp=new gr.forth.ics.icardea.listener.HL7MLLPServer();
          //HL7MLLPServer sp= new HL7MLLPServer();
          sp.registerApplication("*", "*", new ListenerService());
          sp.init(2576,cnt);
          //sp.init_with_tls(2576,cnt,null,null);
          //sp.init(2576);
          sp.run();


     }
  }
  

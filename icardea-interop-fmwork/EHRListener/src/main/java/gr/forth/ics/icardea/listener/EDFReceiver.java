/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package gr.forth.ics.icardea.listener;
import name.pachler.nio.file.*;
import java.io.*;
import java.util.List;
import java.net.*;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author petrakis
 */
public class EDFReceiver {
        static Socket requestSocket;
	static InputStreamReader ir;
 	static OutputStreamWriter or;
        static BufferedWriter out;
        static BufferedReader in;
 	static String message;

     static String sendMessage(String msg, String ip, int port){
                msg=(char)11+msg+(char)28+(char)13;

		try{
                     //1. creating a socket to connect to the server
			requestSocket = new Socket(ip,port);
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
			System.out.println("HL7 QUERY>" + msg);


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

                         System.out.println("HL7 RESPONSE>" + message);
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

     private static String ClearEdfMed(String s){
         String ret="";
         ret=s.replaceAll("'FTX+BFD++", "");
         ret=ret.replaceAll("\\?:", "000");
         ret=ret.replaceAll(":", "");
         ret=ret.replaceAll("000",":");
         ret=ret.replaceAll("\\?.", ".");
         ret=ret.replaceAll("\\?+", "+");
         return ret;
     }

     private static String ClearEdf(String s){
         String ret="";
         ret=s.replaceAll("\\?:", "000");
         ret=ret.replaceAll(":", "");
         ret=ret.replaceAll("000",":");
         ret=ret.replaceAll("\\?.", ".");
         ret=ret.replaceAll("\\?+", "+");
         //ret=ret.replaceAll("\\*", "");
         return ret;
     }

     private static String GetDose(String s, String key){
         String froh="";
         int fint=s.indexOf(key);
         if(fint>=0){
             int end=s.indexOf("|",fint);
             if(end>0)
                 froh=s.substring(s.indexOf(key)+key.length(), end).trim();
             else
                 froh=s.substring(s.indexOf(key)+key.length()).trim();

             try{
                 if(froh.equals("½")==true)
                     froh="0.5";
                 /*else if(Double.parseDouble(froh) >= 0.0)
                     ;
                 else
                     froh="";*/
             }
             catch(Exception e){
                 froh="";
             }
         }
         else
             froh="";
         
         return froh;
     }

     private static ArrayList ParseEdfMed(String s){
         try{
             ArrayList l=new ArrayList();
             String descr=s.substring(0,s.indexOf(":"));
             String froh=GetDose(s, "Fruh:");
             String mittag=GetDose(s, "Mittag:");
             String abend=GetDose(s, "Abend:");
             String nacht=GetDose(s, "Nacht:");
             l.add(descr);
             l.add(froh);
             l.add(mittag);
             l.add(abend);
             l.add(nacht);
             return l;
         }
         catch (Exception ex){
             return null;
         }
     }
     
     private static String GetSegment(String s, String key){
         String ret="";
         try{
            ret=s.substring(s.indexOf(key)+key.length(),s.indexOf("'",s.indexOf(key)+key.length())).trim();
         }
         catch (Exception ex){
             return "";
         }
         return ret;
     }

     private static String GetFTXBFD(String s){
        String ret="";
        int curr=0;
         try{
             while(s.indexOf("FTX+BFD++",curr)>=0){
                curr=s.indexOf("FTX+BFD++",curr)+9;
                int end=s.indexOf("'",curr);
                ret+=s.substring(curr,end);
                curr=end+1;
             }
         }
         catch (Exception ex){
             return "";
         }
         return ret.trim();
     }

     private static String ClearFTXBFD(String s){
         String ret="";
         ret=s.replaceAll("\\?:", "000");
         ret=ret.replaceAll(":", "");
         ret=ret.replaceAll("000",":");
         ret=ret.replaceAll("\\?.", ".");
         ret=ret.replaceAll("\\?+", "+");
         ret=ret.replaceAll("\\*", "");
         return ret;
     }

     private static ArrayList GetPatientInfo(String s){
         String pat="",bgm="";
         try{
             String root="",ext="", first="", last="", dob="", sex="";
             ArrayList l=new ArrayList();
            
             pat=GetSegment(s, "NAD+PAT++");
             String part1=pat.substring(0,pat.indexOf("+++"));
             String p1[]=part1.split(":");
             first=p1[1].trim();
             last=p1[0].trim();
             String part2=pat.substring(pat.indexOf("+++")+3,pat.indexOf("++",pat.indexOf("+++")+3));
             String part3=pat.substring(pat.indexOf("++",pat.indexOf("+++")+3)+2);
             
             bgm=GetSegment(s, "BGM+");
             dob=bgm.substring(bgm.lastIndexOf("+")+1).trim();
             l.add(root);
             l.add(ext);
             l.add(first);
             l.add(last);
             l.add(dob);
             l.add(sex);
             return l;
         }
         catch (Exception ex){
             return null;
         }
     }

     private static String NewCDAMedEntry(String med_template,String code, String descr, String cs, String csname, String dose, String unit, String datelow, String datehigh){
        String res=med_template;
        res=res.replace("TMP_MED_PRODUCTCODE_SYSNAME",csname);
        res=res.replace("TMP_MED_PRODUCTCODESYSTEM",cs);
        res=res.replace("TMP_MED_PRODUCTCODE",code);
        res=res.replaceAll("TMP_MED_PRODUCTNAME",descr);
        res=res.replace("TMP_MED_DOSE",csname);
        res=res.replace("TMP_MED_PRODUCTCODE_SYSNAME",dose);
        res=res.replace("TMP_MED_UNIT",unit);
        res=res.replace("TMP_MED_DATE_LOW",datelow);
        res=res.replace("TMP_MED_DATE_HIGH",datehigh);
        return res;
    }

     private static String MapVisit2ID(String visit_id, String current_date){
         String ret="";
         /*String filestr="";
         FileInputStream fs=null;
         DataInputStream in=null;
         BufferedReader br=null;*/
         try{
             /*fs = new FileInputStream(Config.GetSetting("config")+"\\visits.txt");
             in = new DataInputStream(fs);
             br = new BufferedReader(new InputStreamReader(in));
             while ((filestr = br.readLine()) != null)
             {
                   String tmp[]=filestr.split("\\|");
                   if(tmp[0].compareTo(visit_id)==0){
                         ret=tmp[1];
                         break;
                   }
              }*/

              String socket_msg="MSH|^~\\&|iCardea|Test|ORBIS|JAIF|"+current_date+"||QBP^Z04|999999|P|2.2||AL|NE\r"+
                    "QPD|Z04^Request Person and Visit^HL7nnnn|ST|"+visit_id.trim()+"\r"+
                    "RCP|I||R\r";
              String resp=sendMessage(socket_msg,Config.GetSetting("VISIT2ID_ip"), Integer.parseInt(Config.GetSetting("VISIT2ID_port")));
              if(resp.indexOf("ERR")>=0){
                  System.err.println("Request Person and Visit Query Error!!!");
                  return "";
              }
              else{

                  int k=resp.indexOf("PID");
                  if(k<0){
                      return "";
                  }
                  resp=resp.substring(k,resp.indexOf("\r",k));
                  String segs[]=resp.split("\\|");
                  ret=segs[3].trim();
                  System.out.println("Visit no:"+visit_id+" patient id:"+ret);
              }

         }
         catch(Exception ex){
             System.err.println("MapVisit2ID error: "+ex.getMessage());
         }
         finally{
             /*if(in!=null){
                try {
                    in.close();
                } catch (IOException ex) {
                    Logger.getLogger(EDFReceiver.class.getName()).log(Level.SEVERE, null, ex);
                }
             }*/
         }
         return ret;
     }

    private static String GetCDAGeneral(String edf_content,String ftx_bfd){
        String filestr="";
        String general_template="",general="";
        try{
            String cpath=Config.GetSetting("config");
            FileInputStream fs = new FileInputStream(cpath+"\\templates\\general.xml");
            DataInputStream in = new DataInputStream(fs);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            while ((filestr = br.readLine()) != null)
                {
                    general_template=general_template+filestr+"\r\n";
                }
            br.close();
            in.close();
            fs.close();

            String current_date=getDateTime();

            general=general_template;
            general=general.replace("TMP_CREATION_DATE", current_date);
            general=general.replace("TMP_AUTHOR_TIME", current_date);
            general=general.replace("TMP_AUTHOR_GIVEN", "V1");
            general=general.replace("TMP_AUTHOR_FAMILY", "EDF_LISTENER");
            general=general.replace("TMP_LEGALAUTH_TIME", current_date);

            /*VISIT NO-PATIENT ID*/
            String visit_no=ftx_bfd.substring(ftx_bfd.indexOf("AZ:")+3,ftx_bfd.indexOf("\n",ftx_bfd.indexOf("AZ:")+3)).trim();
            if(visit_no.trim().length()==0){
                System.err.println("Cannot retrieve visit number from EDF!!");
                return "";
            }

            general=general.replace("TMP_CDA_EXT", "c"+visit_no);
            general=general.replace("TMP_CDA_RELATEDDOC", "");

            String id="",namespace="ORBIS&www.salk.at&DNS";
            id=MapVisit2ID(visit_no,current_date);
            if(id.trim().length()==0){
                System.err.println("Cannot map visit number to patient id!!");
                return "";
            }
            /*********************/

            /******GET PROTOCOL ID****/
            String socket_msg="MSH|^~\\&|EHRListener|EHR|PIX|EHR|"+current_date+"||QBP^Q23^QBP_Q21|ListenerMsg|P|2.5\r"+
                                "QPD|IHE PIX Query|ListenerQry|"+id+"^^^"+namespace+"|\r"+
                                "RCP|I\r";


            String resp=sendMessage(socket_msg,Config.GetSetting("PIX_ip"), Integer.parseInt(Config.GetSetting("PIX_port")));

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
                            //String address=addr+"^^"+city+"^"+state+"^"+postal;
                            String address="",dob="19800124",sex="M",lname="Tester", fname="Tester";
                            String new_pid="p"+id;
                            String iid="i"+id;
                            socket_msg="MSH|^~\\&|EHRListener|EHR|PIX|EHR|"+current_date+"||ADT^A01^ADT_A01|ListenerMsg|P|2.3.1\r"+
					"EVN||"+current_date+"\r"+
					"PID|||"+new_pid+"^^^icardea.pix&1.2.826.0.1.3680043.2.44.248240.1&ISO~"+id+"^^^"+namespace+"~"+iid+"^^^CIED&bbe3a050-079a-11e0-81e0-0800200c9a66&UUID||"+lname+"^"+fname+"||"+dob+"|"+sex+"|||"+address+"||||||||\r"+
					"PV1||O\r";

                            resp=sendMessage(socket_msg,Config.GetSetting("PIX_ip"), Integer.parseInt(Config.GetSetting("PIX_port")));
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
                    }
            /*************************/
            
            /*PATIENT INFO*/
            ArrayList l= GetPatientInfo(edf_content);
            general=general.replace("TMP_GIVEN_NAME", l.get(2).toString());
            general=general.replace("TMP_FAMILY_NAME", l.get(3).toString());
            general=general.replace("TMP_BIRTHDATE", l.get(4).toString());
            general=general.replace("TMP_SEX", l.get(5).toString());
            /*general=general.replace("TMP_PATIENTID_ROOT", l.get(0).toString());
            general=general.replace("TMP_PATIENTID_EXT", l.get(1).toString());*/
        } catch (IOException ex) {
            Logger.getLogger(ListenerService.class.getName()).log(Level.SEVERE, null, ex);
            return "";
        } catch (Exception ex) {
            Logger.getLogger(ListenerService.class.getName()).log(Level.SEVERE, null, ex);
            return "";
        }
        return general;

    }
    
    private Boolean CreateCDA(String new_file){
        String filestr="", edf_content="";
        String general="",med_template="",med="", edf_med="",medstr="",contents_template="",contents="",content_items="";
        try{
            String cpath=Config.GetSetting("config");
            FileInputStream fs = new FileInputStream(cpath+"\\templates\\medentry.xml");
            DataInputStream in = new DataInputStream(fs);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            while ((filestr = br.readLine()) != null)
                {
                    med_template=med_template+filestr+"\r\n";
                }
            br.close();
            in.close();
            fs.close();

            fs = new FileInputStream(cpath+"\\templates\\contents.xml");
            in = new DataInputStream(fs);
            br = new BufferedReader(new InputStreamReader(in));
            while ((filestr = br.readLine()) != null)
                {
                    contents_template=contents_template+filestr+"\r\n";
                }
            br.close();
            in.close();
            fs.close();

            
            FileInputStream edf_fs = new FileInputStream(Config.GetSetting("EDF_DIR")+"\\"+new_file);
            DataInputStream edf_in = new DataInputStream(edf_fs);
            BufferedReader edf_br = new BufferedReader(new InputStreamReader(edf_in));
            while ((filestr = edf_br.readLine()) != null)
            {
                    edf_content+=filestr.trim()+"\r\n";
            }
            edf_br.close();
            edf_in.close();
            edf_fs.close();

           
            /*GET FTX+BFD++ segment*/
            String ftx_bfd=GetFTXBFD(edf_content);
            ftx_bfd=ClearFTXBFD(ftx_bfd);
            /**********************/

            /*GET GENERAL DATA*/
            general=GetCDAGeneral(edf_content,ftx_bfd);
            if(general.trim().length()==0)
                return false;
            /******************/


            /*GET MEDICATIONS SECTION*/
            if(ftx_bfd.indexOf("MEDIKAMENTE")>=0){
                medstr=ftx_bfd.substring(ftx_bfd.indexOf("MEDIKAMENTE")+11,ftx_bfd.indexOf("\r\n\r\n",ftx_bfd.indexOf("MEDIKAMENTE")+11)).trim();
                String records[]=medstr.split("\r\n");
                for(int i=0;i<records.length;i++){
                    String code="",descr="",codesys="",codesysname="",dose="",unit="",datelow="",datehigh="";
                    ArrayList l=ParseEdfMed(records[i]);
                    descr=l.get(0).toString();
                    med+=NewCDAMedEntry(med_template,code,descr,codesys,codesysname,dose,unit,datelow,datehigh)+"\r\n";
                    content_items+="<item>"+descr+"</item>\r\n";
                }
                contents=contents_template;
                contents=contents.replace("TMP_CONTENTS_TITLE","MEDICATIONS");
                contents=contents.replace("TMP_CONTENTS_CODESYSTEMNAME","LOINC");
                contents=contents.replace("TMP_CONTENTS_CODESYSTEM","2.16.840.1.113883.6.1");
                contents=contents.replace("TMP_CONTENTS_ITEMS", content_items);
                contents=contents.replace("TMP_ENTRIES", med);
            }
            /************************/


            general=general.replace("TMP_MEDICAL_DATA", contents);
            general=general.replaceAll("&", "&amp;");

            BufferedWriter writer = null;
                try
                {
                    String cda_path=Config.GetSetting("CDA_DIR")+"\\"+new_file+".xml";
                    writer = new BufferedWriter( new FileWriter(cda_path));
                    writer.write(general);
                }
                catch ( IOException e)
                {
                    System.out.println(e.getMessage());
                    return false;
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
           
        } catch (IOException ex) {
            Logger.getLogger(ListenerService.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } catch (Exception ex) {
            Logger.getLogger(ListenerService.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;

    }

    private WatchService AddWatcher(){
        WatchService watchService = FileSystems.getDefault().newWatchService();
            String EDF_shareddir=Config.GetSetting("EDF_DIR");
            Path watchedPath = Paths.get(EDF_shareddir);
            WatchKey key = null;
            try {
                key = watchedPath.register(watchService, StandardWatchEventKind.ENTRY_CREATE);
            } catch (UnsupportedOperationException uox){
                System.err.println("file watching not supported: "+ uox.getMessage());
                return null;
                // handle this error here
            }catch (IOException iox){
                System.err.println("I/O errors: "+ iox.getMessage());
                return null;
                // handle this error here
            }
            return watchService;
    }

    private void run(WatchService watchService) throws InterruptedException{
        for(;;){
            // take() will block until a file has been created/deleted
            WatchKey signalledKey;
            try {
                System.out.println("Waiting for EDF documents...");
                signalledKey = watchService.take();
            } catch (InterruptedException ix){
                // we'll ignore being interrupted
                continue;
            } catch (ClosedWatchServiceException cwse){
                // other thread closed watch service
                System.out.println("watch service closed, terminating.");
                break;
            }

            // get list of events from key
            List<WatchEvent<?>> list = signalledKey.pollEvents();

            // VERY IMPORTANT! call reset() AFTER pollEvents() to allow the
            // key to be reported again by the watch service
            signalledKey.reset();

            // we'll simply print what has happened; real applications
            // will do something more sensible here
            for(WatchEvent e : list){
                String message = "";
                if(e.kind() == StandardWatchEventKind.ENTRY_CREATE){
                    Path context = (Path)e.context();
                    message = context.toString() + " created";
                    System.out.println(message);
                    Thread.sleep(200);
                    if(this.CreateCDA(context.toString())==true)
                        System.out.println("CDA created successfully!");
                    else
                        System.out.println("Could not create CDA...");
                } /*else if(e.kind() == StandardWatchEventKind.ENTRY_DELETE){
                    Path context = (Path)e.context();
                    message = context.toString() + " deleted";
                } */else if(e.kind() == StandardWatchEventKind.OVERFLOW){
                    message = "OVERFLOW: more changes happened than we could retreive";
                }
            }
        }
    }
    
    public static void main(String[] args) {
        try{
            EDFReceiver srv=new EDFReceiver();
            WatchService watchService=srv.AddWatcher();
            if(watchService!=null){
                srv.run(watchService);
            }
             else{
                System.err.println("Failed to initiate shared directory watcher!");
             }
            System.out.println("Watch service stopped...");
        }
        catch(Exception ex){
            System.err.println("Error: " + ex.getMessage());
        }
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package gr.forth.ics.icardea.listener;

import java.io.*;
import java.net.*;
import org.w3c.dom.*;
import javax.xml.parsers.*;
import javax.xml.xpath.*;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.UUID;
/**
 *
 * @author petrakis
 */
public class Listener {
    static String template_path=Config.GetSetting("config")+"\\pnr.xml";

    /*public static void main(String[] args) {
        try{
            String res="",cda_path="C:\\PROJECTS\\ICARDEA\\XDS_Data\\CDA-Scenario-Step4-18112009-LabResults.xml";
            String xds_url="http://twister.ics.forth.gr/icardea/xds";
            res=Provide_Register("Document01",cda_path,xds_url);
            if (res.equals("")){
                System.err.println("Registration Failed");
            }
            else{
                System.out.println("Registration succeeded\r\n"+res);
            }
        }
        catch(Exception ex){
            System.err.println("Error: " + ex.getMessage());
        }
    }*/



    private static String GetUUID(){
        UUID uuid = UUID.randomUUID();
        String randomUUIDString = uuid.toString();
        return randomUUIDString;
    }


    private static String CreateSoapEnv(String template_path,String boundary_uuid,String cda_content){
        String SoapEnv="";
        try{
            SoapEnv = "--MIMEBoundaryurn_uuid_" + boundary_uuid +"\r\n"+ "Content-Type: application/xop+xml; charset=UTF-8; type=\"application/soap+xml\"\r\n\r\n";
            String tmp=GetPNRTemplate(template_path);
            tmp=tmp.replace("BASE64_DOCUMENT", Base64.encode(cda_content));
            tmp=tmp.replace("MESSAGE_UUID", GetUUID());

            String DOCUMENT_TYPE_CODE_CODING_SCHEME="", DOCUMENT_CLASS_CODE_CODING_SCHEME="", DOCUMENT_CREATION_TIME="", DOCUMENT_LANGUAGE_CODE="", DOCUMENT_SERVICE_START_TIME="", DOCUMENT_SERVICE_STOP_TIME="", PATIENT_ID="", AUTHOR_NAME="", AUTHOR_INSTITUTION="", DOCUMENT_CLASS_CODE="", DOCUMENT_TYPE_CODE="", DOCUMENT_UNIQUE_ID="";
            String SUBMISSION_SET_SUBMISSION_TIME="", SUBMISSION_SET_UNIQUE_ID="", SUBMISSION_SET_SOURCE_ID="";


            String tmp_cda=cda_content.replace("xmlns=\"urn:hl7-org:v3\"", "");
            InputStream is = new ByteArrayInputStream(tmp_cda.getBytes("UTF-8"));
            //String tmp_cda=cda.replace("xmlns=\"urn:hl7-org:v3\"", "");
            DocumentBuilderFactory domFactory = DocumentBuilderFactory.newInstance();
            domFactory.setNamespaceAware(true); // never forget this!
            DocumentBuilder builder = domFactory.newDocumentBuilder();
            //Document doc = builder.parse(cda);
            Document doc = builder.parse(is);

            XPathFactory factory = XPathFactory.newInstance();
            XPath xpath = factory.newXPath();
            XPathExpression expr=null;
            Object result=null;
            NodeList nodes=null;
            Node singleNode=null;

            expr = xpath.compile("/ClinicalDocument/effectiveTime/@value");
            result = expr.evaluate(doc, XPathConstants.NODE);
            singleNode = (Node) result;
            if (singleNode!=null){
                DOCUMENT_CREATION_TIME = singleNode.getNodeValue();
            }
            tmp = tmp.replace("DOCUMENT_CREATION_TIME", DOCUMENT_CREATION_TIME);


            expr = xpath.compile("/ClinicalDocument/documentationOf/serviceEvent/effectiveTime/low/@value");
            result = expr.evaluate(doc, XPathConstants.NODE);
            singleNode = (Node) result;
            if (singleNode!=null){
                DOCUMENT_SERVICE_START_TIME = singleNode.getNodeValue();
            }
            tmp = tmp.replace("DOCUMENT_SERVICE_START_TIME", DOCUMENT_SERVICE_START_TIME);

            expr = xpath.compile("/ClinicalDocument/documentationOf/serviceEvent/effectiveTime/high/@value");
            result = expr.evaluate(doc, XPathConstants.NODE);
            singleNode = (Node) result;
            if (singleNode!=null){
                DOCUMENT_SERVICE_STOP_TIME = singleNode.getNodeValue();
            }
            tmp = tmp.replace("DOCUMENT_SERVICE_STOP_TIME", DOCUMENT_SERVICE_STOP_TIME);

            expr = xpath.compile("/ClinicalDocument/languageCode/@code");
            result = expr.evaluate(doc, XPathConstants.NODE);
            singleNode = (Node) result;
            if (singleNode!=null){
                DOCUMENT_LANGUAGE_CODE = singleNode.getNodeValue();
            }
            tmp = tmp.replace("DOCUMENT_LANGUAGE_CODE", DOCUMENT_LANGUAGE_CODE);

            expr = xpath.compile("/ClinicalDocument/code/@codeSystem");
            result = expr.evaluate(doc, XPathConstants.NODE);
            singleNode = (Node) result;
            if (singleNode!=null){
                DOCUMENT_CLASS_CODE_CODING_SCHEME = singleNode.getNodeValue();
                DOCUMENT_TYPE_CODE_CODING_SCHEME = singleNode.getNodeValue();
            }
            tmp = tmp.replace("DOCUMENT_CLASS_CODE_CODING_SCHEME", DOCUMENT_CLASS_CODE_CODING_SCHEME);
            tmp = tmp.replace("DOCUMENT_TYPE_CODE_CODING_SCHEME", DOCUMENT_TYPE_CODE_CODING_SCHEME);

            expr = xpath.compile("/ClinicalDocument/code/@code");
            result = expr.evaluate(doc, XPathConstants.NODE);
            singleNode = (Node) result;
            if (singleNode!=null){
                DOCUMENT_CLASS_CODE = singleNode.getNodeValue();
                DOCUMENT_TYPE_CODE = singleNode.getNodeValue();
            }
            tmp = tmp.replace("DOCUMENT_CLASS_CODE", DOCUMENT_CLASS_CODE);
            tmp = tmp.replace("DOCUMENT_TYPE_CODE", DOCUMENT_TYPE_CODE);


            expr = xpath.compile("/ClinicalDocument/id/@root");
            result = expr.evaluate(doc, XPathConstants.NODE);
            singleNode = (Node) result;
            if (singleNode!=null){
                DOCUMENT_UNIQUE_ID = singleNode.getNodeValue();
            }
            expr = xpath.compile("/ClinicalDocument/id/@extension");
            result = expr.evaluate(doc, XPathConstants.NODE);
            singleNode = (Node) result;
            if (singleNode!=null){
                DOCUMENT_UNIQUE_ID=DOCUMENT_UNIQUE_ID+"^"+ singleNode.getNodeValue();
            }
            tmp = tmp.replace("DOCUMENT_UNIQUE_ID", DOCUMENT_UNIQUE_ID);

            expr = xpath.compile("/ClinicalDocument/recordTarget/patientRole/id/@extension");
            result = expr.evaluate(doc, XPathConstants.NODE);
            singleNode = (Node) result;
            if (singleNode!=null){
                PATIENT_ID = singleNode.getNodeValue();
            }
            expr = xpath.compile("/ClinicalDocument/recordTarget/patientRole/id/@root");
            result = expr.evaluate(doc, XPathConstants.NODE);
            singleNode = (Node) result;
            if (singleNode!=null){
                PATIENT_ID=PATIENT_ID+"^^^&"+ singleNode.getNodeValue();
            }
            tmp = tmp.replace("PATIENT_ID", PATIENT_ID);

            expr = xpath.compile("/ClinicalDocument/author/assignedAuthor/assignedPerson/name/family");
            result = expr.evaluate(doc, XPathConstants.NODE);
            singleNode = (Node) result;
            if (singleNode!=null){
                AUTHOR_NAME =  "^" + singleNode.getTextContent();
            }
            expr = xpath.compile("/ClinicalDocument/author/assignedAuthor/assignedPerson/name/given");
            result = expr.evaluate(doc, XPathConstants.NODE);
            singleNode = (Node) result;
            if (singleNode!=null){
                AUTHOR_NAME=AUTHOR_NAME+"^" + singleNode.getTextContent()+"^^^";
            }
            tmp = tmp.replace("AUTHOR_NAME", AUTHOR_NAME);

            expr = xpath.compile("/ClinicalDocument/author/assignedAuthor/representedOrganization/name");
            result = expr.evaluate(doc, XPathConstants.NODE);
            singleNode = (Node) result;
            if (singleNode!=null){
                AUTHOR_INSTITUTION = singleNode.getTextContent();
            }
            tmp = tmp.replace("AUTHOR_INSTITUTION", AUTHOR_INSTITUTION);


            DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
            Date date = new Date();
            String s=dateFormat.format(date);
            //String s = DateTime.Now.Year.ToString + Format(DateTime.Now, "MMddHHmmss");
            SUBMISSION_SET_SUBMISSION_TIME = s;
            tmp = tmp.replace("SUBMISSION_SET_SUBMISSION_TIME", SUBMISSION_SET_SUBMISSION_TIME);

            tmp = tmp.replace("SUBMISSION_SET_SOURCE_ID", "5.4.3.2.1");
            Audit.submissionsetid=GetUUID();
            tmp = tmp.replaceAll("SUBMISSION_SET_UNIQUE_ID", Audit.submissionsetid);

            SoapEnv =SoapEnv+ tmp;

            SoapEnv =SoapEnv + "\r\n--MIMEBoundaryurn_uuid_" + boundary_uuid + "--";
            /*for (int i = 0; i < nodes.getLength(); i++) {
                System.out.println(nodes.item(i).getNodeValue());
            }*/
        }
        catch(Exception ex){
            System.err.println("Error: " + ex.getMessage());
            return "";
        }
        return SoapEnv.replaceAll("&", "&amp;");
    }


    public static String Provide_Register(String doc_id,String cda_path,String xds_url){
       PrintStream outStream=null;
       String res="",cda_content="";
            try{
                cda_content=GetCDA(cda_path);
                String boundary_uuid=GetUUID();
                String SoapEnv=CreateSoapEnv(template_path,boundary_uuid,cda_content);

                String contenttype="multipart/related; boundary=MIMEBoundaryurn_uuid_" + boundary_uuid + "; type=\"application/xop+xml\";  start-info=\"application/soap+xml\"; action=\"urn:ihe:iti:2007:ProvideAndRegisterDocumentSet-b\"";
                URL iurl = new URL(xds_url);
                HttpURLConnection uc = (HttpURLConnection)iurl.openConnection();
                uc.setRequestMethod("POST");
                uc.setRequestProperty("Content-Type", contenttype);
                uc.setDoOutput(true);
                uc.connect();

                outStream = new PrintStream(uc.getOutputStream());
                outStream.print(SoapEnv);


                DataInputStream inStream = new DataInputStream(uc.getInputStream());
                String inputLine;
                while ((inputLine = inStream.readLine()) != null) {
                    res=res+inputLine+"\r\n";
                    //System.out.println(inputLine);
                }
                inStream.close();
            }catch (MalformedURLException e){
                System.err.println("Error: " + e.getMessage());
                return "";
            }
            catch (Exception e){//Catch exception if any
                System.err.println("Error: " + e.getMessage());
                return "";
            }
            finally{
                if(outStream!=null){
                    outStream.close();
                }
            }

            return res;
    }

    private static String GetPNRTemplate(String path){
        String content="";
        String filestr="";
        DataInputStream in=null;
        try{
        FileInputStream fstream = new FileInputStream(path);
            // Get the object of DataInputStream
        in= new DataInputStream(fstream);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String strLine;
        //Read File Line By Line
        while ((strLine = br.readLine()) != null){
             content=content+strLine+"\r\n";
        }

        in.close();
        }catch (Exception e){//Catch exception if any
            System.err.println("Error: " + e.getMessage());
            return "";
        }
        finally{
        }

        return content;
    }

    private static String GetCDA(String path){
        String content="";
        String filestr="";
        DataInputStream in=null;
        try{
        FileInputStream fstream = new FileInputStream(path);
            // Get the object of DataInputStream
        in= new DataInputStream(fstream);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String strLine;
        //Read File Line By Line
        while ((strLine = br.readLine()) != null){
             content=content+strLine+"\r\n";
        }

        in.close();
        }catch (Exception e){//Catch exception if any
            System.err.println("Error: " + e.getMessage());
            return "";
        }
        finally{
        }

        return content;
    }

   /* public static String CTS_Invoke(String cts_url, String namespace, String code, String cs1, String cs2){
       PrintStream outStream=null;
       String res="";
            try{
                String SoapEnv="<?xml version=\"1.0\"?>\r\n"+
                "<soap:Envelope xmlns:soap=\"http://www.w3.org/2001/12/soap-envelope\" soap:encodingStyle=\"http://www.w3.org/2001/12/soap-encoding\">\r\n"+
                "<soap:Body xmlns:m=\""+namespace+"\">"
                        + "<m:translateCode>"
                        + "<m:StockName>"+cs1+"</m:StockName>"
                        + "<m:StockName>"+code+"</m:StockName>"
                        + "<m:StockName>"+cs2+"</m:StockName>"
                        + "</m:translateCode>"
                        + "</soap:Body>"
                        + "</soap:Envelope>";

                String contenttype="application/soap+xml; charset=utf-8";
                URL iurl = new URL(cts_url);
                HttpURLConnection uc = (HttpURLConnection)iurl.openConnection();
                uc.setRequestMethod("POST");
                uc.setRequestProperty("Content-Type", contenttype);
                uc.setDoOutput(true);
                uc.connect();

                outStream = new PrintStream(uc.getOutputStream());
                outStream.print(SoapEnv);


                DataInputStream inStream = new DataInputStream(uc.getInputStream());
                String inputLine;
                while ((inputLine = inStream.readLine()) != null) {
                    res=res+inputLine+"\r\n";
                    //System.out.println(inputLine);
                }
                inStream.close();
            }catch (MalformedURLException e){
                System.err.println("Error: " + e.getMessage());
                return "";
            }
            catch (Exception e){//Catch exception if any
                System.err.println("Error: " + e.getMessage());
                return "";
            }
            finally{
                if(outStream!=null){
                    outStream.close();
                }
            }

            return res;
    }*/

}


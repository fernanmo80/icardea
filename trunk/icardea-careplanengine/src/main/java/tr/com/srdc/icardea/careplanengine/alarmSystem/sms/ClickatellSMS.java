package tr.com.srdc.icardea.careplanengine.alarmSystem.sms;

//~--- JDK imports ------------------------------------------------------------

import java.io.*;
import java.net.*;

/**
 * User: mehmet olduz
 * Date: May 30, 2008
 * Time: 3:11:33 PM
 */
public class ClickatellSMS {
    private static int    api_id_html      = 3097246;
    private static int    api_id_xml       = 3096682;
    private static String gatewayURLString = "http://api.clickatell.com/xml/xml";
    private static String host             = "https://api.clickatell.com/http/";
    private static String password         = "icardea2008";
    private static String username         = "olduz-m";

    public static String sendSMS(String contactNumber, String messageBody) {
        String returnresult = "";

        try {
            String sessionID = obtainSessionID();
            String apiMsgId  = sendSMS(contactNumber, messageBody, sessionID);

            try {
                int status = Integer.parseInt(apiMsgId);


                if (status == 301) {
                }

                return null;
            } catch (NumberFormatException e) {}

            returnresult = sessionID + " " + apiMsgId;
        } catch (IOException e) {
            System.err.println(e);
            e.printStackTrace();
        }

        return returnresult;
    }

    public static String obtainSessionID() throws IOException {
        String sessionID          = null;
        String sessionQuery       = "auth?api_id=" + api_id_html + "&user=" + username + "&password=" + password;
        String sessionQueryResult = sendHTMLRequest(sessionQuery);

        if (sessionQueryResult.startsWith("OK:")) {
            sessionID = sessionQueryResult.substring(3).trim();
        }

        return sessionID;
    }

    private static String sendSMS(String contactNumber, String messageBody, String sessionID) throws IOException {
        String apiMsgId = null;

        messageBody = URLEncoder.encode(messageBody, "UTF-8");

        String sendSMSQuery = "sendmsg?session_id=" + sessionID + "&to=" + contactNumber + "&text=" + messageBody;    // +"&from=905367358649";
        String queryResult = sendHTMLRequest(sendSMSQuery);

        if (queryResult.startsWith("ID:")) {
            apiMsgId = queryResult.substring(3).trim();
        }


        return apiMsgId;
    }

    public static boolean checkifSend(String IDs) throws IOException {
        try {
            Thread.sleep(60 * 3 * 1000);
        } catch (InterruptedException exc) {
            exc.printStackTrace();
        }

        String idPair[] = IDs.split(" ");


        String querySMSStatus = "querymsg?session_id=" + idPair[0] + "&apimsgid=" + idPair[1] + "";
        String queryResult    = sendHTMLRequest(querySMSStatus);

        if (queryResult.startsWith("ERR:")) {

            return false;
        }


        String res    = queryResult.substring(queryResult.lastIndexOf(':') + 1);
        int    status = Integer.parseInt(res.trim());

        if ((status == 3) || (status == 4) || (status == 8)) {
            return true;
        }

        return false;
    }

    private static String sendHTMLRequest(String query) throws IOException {
        URL            url;
        URLConnection  urlConn;
        BufferedReader bufferedReader;
        StringBuffer   result = new StringBuffer();

        url = new URL(host + query);

        // URL connection channel.
        urlConn = url.openConnection();
        urlConn.setDoInput(true);
        urlConn.setDoOutput(true);

        // No caching, we want the real thing.
        urlConn.setUseCaches(false);

        // Specify the content type.
        urlConn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        bufferedReader = new BufferedReader(new InputStreamReader(urlConn.getInputStream()));

        String line;

        while (null != ((line = bufferedReader.readLine()))) {
            result.append(line);
        }

        bufferedReader.close();

        return result.toString();
    }

/*

        public static String sendSMS_xml(String contactNumber, String messageBody) {

            String returnresult="";

            try {
                HttpURLConnection connection = getConnection_xml();

    //            String sessionID = obtainSessionID(connection);
    //            String apiMsgId = sendSMS_xml(connection, contactNumber, messageBody, sessionID);

    //            try {
    //                int status = Integer.parseInt(apiMsgId);

    //                Logger.getLogger(this.getClass()).log(Level.DEBUG, ("\n*********************************\n" +
    //                        "ERROR while sending SMS: " + status);
    //                if(status == 301){
    //                    Logger.getLogger(this.getClass()).log(Level.DEBUG, ("NO CREDIT LEFT, please load credit to Clickatell!!!");
    //                }
    //                return null;
    //            } catch (NumberFormatException e) {
    //
    //            }

    //            returnresult = sessionID + " " + apiMsgId;
                connection.disconnect();

            }
            catch (IOException e) {
                System.err.println(e);
                e.printStackTrace();
            }

            return returnresult;


        }

        public static String obtainSessionID_xml(HttpURLConnection connection) throws IOException {
            String xml="<clickAPI>" +
                    "<auth>" +
                    "<api_id>"+ api_id_xml +"</api_id>" +
                    "<user>"+username+"</user>" +
                    "<password>"+password+"</password>" +
                    "</auth>" +
                    "</clickAPI>";


            String sessionID = sendRequest_xml(connection, xml);
            Logger.getLogger(this.getClass()).log(Level.DEBUG, ("////////// SessionID:" + sessionID);

            return sessionID;
        }


        private static String sendSMS_xml(HttpURLConnection connection, String contactNumber,
                                          String messageBody, String sessionID)
                throws IOException {

            String xml="<clickAPI>\n" +
                    "<sendMsg>\n" +
                    "<session_id>"+ sessionID +"</session_id>"+
                    "<to>"+contactNumber+"</to>\n" +
                    "<text>"+messageBody+"</text>\n" +
                    "<from>905367358649</from>\n" +
                    "</sendMsg>\n" +
                    "</clickAPI>";

            String apiMsgId = sendRequest_xml(connection, xml);
            Logger.getLogger(this.getClass()).log(Level.DEBUG, ("////////// apiMsgId:" +apiMsgId);

            return apiMsgId;
        }

        private static String sendRequest_xml(HttpURLConnection connection, String xml) throws IOException {
            OutputStream out = connection.getOutputStream();
            OutputStreamWriter wout = new OutputStreamWriter(out, "UTF-8");

            Logger.getLogger(this.getClass()).log(Level.DEBUG, (xml);

            String data = URLEncoder.encode (xml, "UTF-8");
            xml = "data="+data+"";
            Logger.getLogger(this.getClass()).log(Level.DEBUG, (xml);
            wout.write(xml);
            wout.flush();
            out.close();

            InputStream in = connection.getInputStream();

            StringBuffer sb = new StringBuffer();
            byte[] b = new byte[4096];
            for (int n; (n = in.read(b)) != -1;) {
                sb.append(new String(b, 0, n));
            }

            String result = sb.toString();
            in.close();

            return result;
        }

        private static double checkBalance(HttpURLConnection connection, String sessionID) throws IOException {
            String xml="<clickAPI>\n" +
                    "<getBalance>\n" +
                    "<session_id>"+sessionID+"</session_id>\n" +
                    "</getBalance>\n" +
                    "</clickAPI>";

            String balance = sendRequest_xml(connection, xml);
            double b = Double.parseDouble(balance);
            Logger.getLogger(this.getClass()).log(Level.DEBUG, ("////////// balance:" + b);
            return b;
        }

        public static HttpURLConnection getConnection_xml() throws IOException {
            URL url = new URL(gatewayURLString);
            URLConnection uc = url.openConnection();
            HttpURLConnection connection = (HttpURLConnection) uc;
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Content-Type", "text/xml; charset=\"utf-8\"");
            connection.setDoOutput(true);
            connection.setDoInput(true);

            return connection;
        }



        public static boolean checkifSend_xml(String IDs)
        {
            try {
                Thread.sleep(60*5*1000);
            } catch (InterruptedException exc) {
                exc.printStackTrace();
            }

            String idPair[] = IDs.split(" ");

            Logger.getLogger(this.getClass()).log(Level.DEBUG, ("SMS with " + idPair[1] + " is being checked whether it is send...");

            try {

                String returnresult="";
                String xml = "<clickAPI>\n" +
                        "<queryMsg>\n" +
                        "<session_id>"+ idPair[0] +"</session_id>\n" +
                        "<apiMsgId>"+ idPair[1] +"</apiMsgId>\n" +
                        "</queryMsg>\n" +
                        "</clickAPI>";

                HttpURLConnection connection = getConnection_xml();

                returnresult = sendRequest_xml(connection, xml);

                String res[] = returnresult.split(" ");

                Logger.getLogger(this.getClass()).log(Level.DEBUG, ("///////// Message Status:" + returnresult);

                connection.disconnect();

                int status = Integer.parseInt(res[1].trim());

                if(status == 3 || status == 4 || status == 8)
                    return true;

            }
            catch (IOException e) {
                System.err.println(e);
                e.printStackTrace();
            }

            return false;

        }


        private void sendSampleXML() throws IOException {
            String xml="<clickAPI>" +
                    "<auth>" +
                    "<api_id>"+ api_id_xml +"</api_id>" +
                    "<user>"+username+"</user>" +
                    "<password>"+password+"</password>" +
                    "</auth>" +
                    "</clickAPI>";

            URL                 url;
            URLConnection   urlConn;
            DataOutputStream    printout;
            BufferedReader bufferedReader;
            // URL of CGI-Bin script.
            url = new URL (gatewayURLString);
            // URL connection channel.
            urlConn = url.openConnection();
            // Let the run-time system (RTS) know that we want bufferedReader.
            urlConn.setDoInput (true);
            // Let the RTS know that we want to do output.
            urlConn.setDoOutput (true);
            // No caching, we want the real thing.
            urlConn.setUseCaches (false);
            // Specify the content type.
            urlConn.setRequestProperty
                    ("Content-Type", "application/x-www-form-urlencoded");
            // Send POST output.
            printout = new DataOutputStream (urlConn.getOutputStream ());
            String content = "data=" + URLEncoder.encode (xml, "UTF-8");
            printout.writeBytes (content);
            printout.flush ();
            printout.close ();
            // Get response data.
            bufferedReader = new BufferedReader ( new InputStreamReader(urlConn.getInputStream ()));
            String str;
            while (null != ((str = bufferedReader.readLine())))
            {
                Logger.getLogger(this.getClass()).log(Level.DEBUG,  (str);

            }
            bufferedReader.close ();

        }
*/
    public static void main(String[] args) throws IOException {
        String number   = "NUMBER_HERE";
        String msg      = "Test SMS for ICARDEA...";
        String sessions = sendSMS(number, msg);

        while (!checkifSend(sessions)) {
        }

    }
}


//~ Formatted by Jindent --- http://www.jindent.com

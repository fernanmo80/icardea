package tr.com.srdc.icardea.careplanengine.alarmSystem.sms;

//~--- JDK imports ------------------------------------------------------------

import java.io.*;
import java.net.*;

/**
 * User: mehmet olduz
 * Date: May 28, 2008
 * Time: 4:43:11 PM
 */
public class ASPSMS {
    private static int    id         = 0;
    private static String originator = "ICARDEA";
    private static String password   = "icardea";

    // insert required userkey,password and originator
    private static String   userkey = "DIPSCEKRU2WG";
    private static String[] xmlURLs = new String[] { "http://xml1.aspsms.com:5061/xmlsvr.asp",
            "http://xml1.aspsms.com:5098/xmlsvr.asp", "http://xml2.aspsms.com:5061/xmlsvr.asp",
            "http://xml2.aspsms.com:5098/xmlsvr.asp" };

    public static String sendSMS(String number, String message) {
        String content = "<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?>\r\n" + "<aspsms>\r\n" + "<Userkey>" + userkey
                         + "</Userkey>\r\n" + "<Password>" + password + "</Password>\r\n" + "<Originator>" + originator
                         + "</Originator>\r\n" + "<UsedCredits>1</UsedCredits>\r\n" + "<Recipient>\r\n"
                         + "<PhoneNumber>" + number + "</PhoneNumber>\r\n" + "<TransRefNumber>" + id
                         + "</TransRefNumber>\r\n" + "</Recipient>\r\n" + "<MessageData>" + message
                         + "</MessageData>\r\n" + "<Action>SendTextSMS</Action>\r\n" + "</aspsms>\r\n";
        InetAddress inetAddr  = null;
        String      xmlResult = "";

        try {
            URLConnection aspsmsCon = getConnection(0);

            aspsmsCon.setRequestProperty("Content-Type", "text/xml");
            aspsmsCon.setDoOutput(true);
            aspsmsCon.setDoInput(true);

            PrintWriter out    = new PrintWriter(aspsmsCon.getOutputStream());
            char[]      buffer = new char[1024 * 10];

            buffer = content.toCharArray();
            out.write(buffer, 0, content.length());
            out.close();

            BufferedReader in        = new BufferedReader(new InputStreamReader(aspsmsCon.getInputStream()));
            String         inputLine = null;

            while ((inputLine = in.readLine()) != null) {
                xmlResult = xmlResult + inputLine;
            }

            in.close();
        } catch (Exception ex) {
        }

        xmlResult = id + "";
        id++;

        return xmlResult;
    }

    public static URLConnection getConnection(int index) {
        if (index < xmlURLs.length) {
            URL    aspsmsURL = null;
            String url       = xmlURLs[index];

            try {
                aspsmsURL = new URL(url);

                return aspsmsURL.openConnection();
            } catch (MalformedURLException e) {
                e.printStackTrace();

                return getConnection(index + 1);
            } catch (IOException e) {

                return getConnection(index + 1);
            }
        }

        return null;
    }

    public static int checkifSend(String id) {
        try {
            Thread.sleep(60 * 5 * 1000);
        } catch (InterruptedException exc) {
            exc.printStackTrace();
        }


        String content = "<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?>\n" + "<aspsms>\n" + "<Userkey>" + userkey
                         + "</Userkey>\r\n" + "<Password>" + password + "</Password>\r\n" + "<TransRefNumber>" + id
                         + "</TransRefNumber>\n" + "<Action>InquireDeliveryNotifications</Action>\n" + "</aspsms>\r\n";
        InetAddress inetAddr  = null;
        String      xmlResult = "";

        try {
            URLConnection aspsmsCon = getConnection(0);

            aspsmsCon.setRequestProperty("Content-Type", "text/xml");
            aspsmsCon.setDoOutput(true);
            aspsmsCon.setDoInput(true);

            PrintWriter out    = new PrintWriter(aspsmsCon.getOutputStream());
            char[]      buffer = new char[1024 * 10];

            buffer = content.toCharArray();
            out.write(buffer, 0, content.length());
            out.close();

            BufferedReader in        = new BufferedReader(new InputStreamReader(aspsmsCon.getInputStream()));
            String         inputLine = null;

            while ((inputLine = in.readLine()) != null) {
                xmlResult = xmlResult + inputLine;
            }

            in.close();
        } catch (Exception ex) {
        }

        return -1;

        /*
         *   -1  Not yet submitted or rejected
         *   0   Delivered
         *   1   Buffered
         *   2   Not Delivered
         */
    }

    public static void main(String[] args) {
        ASPSMS testSMS = new ASPSMS();

//      String xmlResult = testSMS.send(number, message);
    }
}


//~ Formatted by Jindent --- http://www.jindent.com

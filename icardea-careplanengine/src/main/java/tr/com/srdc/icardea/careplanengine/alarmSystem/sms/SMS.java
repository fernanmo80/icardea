package tr.com.srdc.icardea.careplanengine.alarmSystem.sms;

//~--- JDK imports ------------------------------------------------------------

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

//[itasyurt 01.10.06]
// 
public class SMS {

//  SMS Parameters
    private static String gatewayURLString = "http://gateway.smsexplorer.net/com.mobilus";
    private static String password         = "icardea";
    private static String username         = "itasyurt-mb1027";

    public static String sendSMS(String contactNumber, String messageBody) {
        String returnresult = "";

        try {
            URL               url        = new URL(gatewayURLString);
            URLConnection     uc         = url.openConnection();
            HttpURLConnection connection = (HttpURLConnection) uc;

            connection.setDoOutput(true);
            connection.setDoInput(true);
            connection.setRequestMethod("POST");

            OutputStream       out  = connection.getOutputStream();
            OutputStreamWriter wout = new OutputStreamWriter(out, "UTF-8");
            String             xml  = "<MainmsgBody><UserName>" + username + "</UserName><PassWord>" + password
                                      + "</PassWord><Action>0</Action><Mesgbody>" + messageBody
                                      + "</Mesgbody><Numbers>" + contactNumber
                                      + "</Numbers> <Originator>ICARDEA</Originator> <SDate> </SDate></MainmsgBody> ";

            wout.write(xml);
            wout.flush();
            out.close();

            InputStream  in = connection.getInputStream();
            StringBuffer sb = new StringBuffer();
            byte[]       b  = new byte[4096];

            for (int n; (n = in.read(b)) != -1; ) {
                sb.append(new String(b, 0, n));
            }

            returnresult = sb.toString();
            in.close();
            out.close();
            connection.disconnect();

            String res[] = returnresult.split(":");

            return res[1].trim();
        } catch (IOException e) {
            System.err.println(e);
            e.printStackTrace();
        }

        return returnresult;
    }

    public static int checkifSend(String id) {
        try {
            Thread.sleep(60 * 5 * 1000);
        } catch (InterruptedException exc) {
            exc.printStackTrace();
        }

        try {
            String            returnresult = "";
            URL               u            = new URL(gatewayURLString);
            URLConnection     uc           = u.openConnection();
            HttpURLConnection connection   = (HttpURLConnection) uc;

            connection.setDoOutput(true);
            connection.setDoInput(true);
            connection.setRequestMethod("POST");

            OutputStream       out  = connection.getOutputStream();
            OutputStreamWriter wout = new OutputStreamWriter(out, "UTF-8");

            wout.write("<MainReportRoot><UserName>" + username + "</UserName><PassWord>" + password
                       + "</PassWord><Action>3</Action><MsgID>" + id + "</MsgID></MainReportRoot>");
            wout.flush();
            out.close();

            InputStream  in = connection.getInputStream();

            // DataInputStream dis = new DataInputStream(in);
            StringBuffer sb = new StringBuffer();
            byte[]       b  = new byte[4096];

            for (int n; (n = in.read(b)) != -1; ) {
                sb.append(new String(b, 0, n));
            }

            returnresult = sb.toString();

            String res[] = returnresult.split(" ");

            in.close();
            out.close();
            connection.disconnect();

            return Integer.parseInt(res[2].trim());
        } catch (IOException e) {
            System.err.println(e);
            e.printStackTrace();
        }

        return -1;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com

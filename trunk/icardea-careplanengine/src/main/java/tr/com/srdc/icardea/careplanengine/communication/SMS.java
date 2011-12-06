
/*
* Created on Jan 27, 2006
*
* TODO To change the template for this generated file go to
* Window - Preferences - Java - Code Style - Code Templates
 */
package tr.com.srdc.icardea.careplanengine.communication;

//~--- JDK imports ------------------------------------------------------------

/**
 * @author Bugrahan
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
import java.io.*;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import java.net.*;

public class SMS {
    private String password = "1202662";
    private URL    u        = null;
    private String username = "bugrahan-mb1027";

    public SMS() {
        try {
            u = new URL("http://gateway.smsexplorer.net/com.mobilus");
        } catch (MalformedURLException e) {

            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SMS sms = new SMS();

        sms.checkStatus();

        // sms.sendSMS("Bu sefer ben koptum ama geliyorum hemen,ben bu MSNin :-)","05336338459");
        // Logger.getLogger(this.getClass().getName()).log(Level.DEBUG, (sms.sendSMS("Konturler bugraya giriyor halaaaaaaaa ve pazartesi...","+905326020646"));
        // Logger.getLogger(this.getClass().getName()).log(Level.DEBUG, (sms.checkifSend("8920310"));
    }

    public int checkifSend(String id) {
        Logger.getLogger(this.getClass()).log(Level.DEBUG, ("SMS with " + id + " is being checked whether it is send..."));

        try {
            String            returnresult = "";
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

            Logger.getLogger(this.getClass()).log(Level.DEBUG, (returnresult));
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

    public void checkStatus() {
        Logger.getLogger(this.getClass()).log(Level.DEBUG, ("SMS status is being checked..."));

        try {
            URLConnection     uc         = u.openConnection();
            HttpURLConnection connection = (HttpURLConnection) uc;

            connection.setDoOutput(true);
            connection.setDoInput(true);
            connection.setRequestMethod("POST");

            OutputStream       out  = connection.getOutputStream();
            OutputStreamWriter wout = new OutputStreamWriter(out, "UTF-8");

            wout.write("<MainmsgBody><UserName>" + username + "</UserName><PassWord>" + password
                       + "</PassWord><Action>4</Action></MainmsgBody>");
            wout.flush();
            out.close();

            InputStream in = connection.getInputStream();
            int         c;

            while ((c = in.read()) != -1) {
                System.out.write(c);
            }

            in.close();
            out.close();
            connection.disconnect();
        } catch (IOException e) {
            System.err.println(e);
            e.printStackTrace();
        }
    }

    public String sendSMS(String msg, String number) {
        Logger.getLogger(this.getClass()).log(Level.DEBUG, ("SMS is being send..."));

        String returnresult = "";

        try {
            URLConnection     uc         = u.openConnection();
            HttpURLConnection connection = (HttpURLConnection) uc;

            connection.setDoOutput(true);
            connection.setDoInput(true);
            connection.setRequestMethod("POST");

            OutputStream       out  = connection.getOutputStream();
            OutputStreamWriter wout = new OutputStreamWriter(out, "UTF-8");
            String             xml  = "<MainmsgBody><UserName>" + username + "</UserName><PassWord>" + password
                                      + "</PassWord><Action>0</Action><Mesgbody>" + msg + "</Mesgbody><Numbers>"
                                      + number + "</Numbers><Originator>ICARDEA</Originator></MainmsgBody>";

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

            String res[] = returnresult.split(" ");

            return "return";    // res[1].trim();
        } catch (IOException e) {
            System.err.println(e);
            e.printStackTrace();
        }

        return returnresult;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com

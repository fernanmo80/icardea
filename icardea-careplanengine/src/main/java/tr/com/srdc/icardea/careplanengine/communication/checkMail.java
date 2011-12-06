
/*
* Created on Jan 22, 2006
*
* TODO To change the template for this generated file go to
* Window - Preferences - Java - Code Style - Code Templates
 */
package tr.com.srdc.icardea.careplanengine.communication;

//~--- JDK imports ------------------------------------------------------------

import java.io.*;
/**
 * @author Bugrahan
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
import java.net.*;

public class checkMail {
    private static String password = "sapals";
    private static String server   = "beykoz.srdc.metu.edu.tr";
    private static String user     = "sapals";

    public static void main(String arg[]) {

        //
        // displayMail [mailServer] [user] [password]
        // (will not delete mail on the server)
        try {
            Socket         s   = new Socket(server, 110);
            BufferedReader in  = new BufferedReader(new InputStreamReader(s.getInputStream()));
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
            checkMail      t   = new checkMail();
            String         msg;

            t.loginMail(in, out, user, password);

            int i = t.checkMyMail(in, out);

            if (i == 0) {
            } else {
                for (int j = 1; j <= i; j++) {
                    msg = t.getMail(in, out, j);
                }

                //
                // If the mail was removed from the server
                // (see getMail()) then we must COMMIT with
                // the "QUIT" command :
                // send(out, "QUIT");
                //
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean checkTheSpecificMail(String id) {
        try {
            Socket         s   = new Socket(server, 110);
            BufferedReader in  = new BufferedReader(new InputStreamReader(s.getInputStream()));
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
            checkMail      t   = new checkMail();
            String         msg;

            t.loginMail(in, out, user, password);

            int i = t.checkMyMail(in, out);

            if (i == 0) {
            } else {
                for (int j = 1; j <= i; j++) {
                    msg = t.getMail(in, out, j);

                    // Logger.getLogger(this.getClass()).log(Level.DEBUG, (msg);
                    boolean res = lookForTheID(msg, id);

                    if (res) {
                        return true;
                    }

                }

                //
                // If the mail was removed from the server
                // (see getMail()) then we must COMMIT with
                // the "QUIT" command :
                // send(out, "QUIT");
                //
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    public boolean lookForTheID(String msg, String id) {
        String subject = findSubject(msg);
        int    j       = 0;
        int    idSize  = id.length();

        for (int i = 0; i < subject.length(); i++) {
            while (subject.charAt(i) == id.charAt(j)) {
                i++;
                j++;

                if (j == idSize) {
                    return true;
                }
            }

            j = 0;
        }

        return false;
    }

    public String findSubject(String msg) {
        String id = "";

        for (int i = 0; i < msg.length(); i++) {
            if (msg.charAt(i) == 'S') {
                i++;

                if (msg.charAt(i) == 'u') {
                    i++;

                    if (msg.charAt(i) == 'b') {
                        i++;

                        if (msg.charAt(i) == 'j') {
                            i++;

                            if (msg.charAt(i) == 'e') {
                                i++;

                                if (msg.charAt(i) == 'c') {
                                    i++;

                                    if (msg.charAt(i) == 't') {
                                        i = i + 2;

                                        while (msg.charAt(i) != '\n') {
                                            id = id + msg.charAt(i);
                                            i++;
                                        }

                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        return id.trim();
    }

    public String getMail(BufferedReader in, BufferedWriter out, int i) throws IOException {
        String s = "";
        String t = "";

        send(out, "RETR " + i);

        while (((s = in.readLine()) != null) && (!(s.equals(".")))) {
            t += s + "\n";
        }

        //
        // To remove the mail on the server :
        // send(out, "DELE "+i);
        // receive(in);
        //
        return t;
    }

    private void send(BufferedWriter out, String s) throws IOException {
        out.write(s + "\n");
        out.flush();
    }

    private String receive(BufferedReader in) throws IOException {
        return in.readLine();
    }

    private void loginMail(BufferedReader in, BufferedWriter out, String user, String pass) throws IOException {
        receive(in);
        send(out, "USER " + user);
        receive(in);
        send(out, "PASS " + pass);
        receive(in);
    }

    private int checkMyMail(BufferedReader in, BufferedWriter out) throws IOException {
        return GetNumberOfMessages(in, out);
    }

    public int GetNumberOfMessages(BufferedReader in, BufferedWriter out) throws IOException {
        int    i = 0;
        String s;

        send(out, "LIST");
        receive(in);

        while ((s = receive(in)) != null) {
            if (!(s.equals("."))) {
                i++;
            } else {
                return i;
            }
        }

        return 0;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com

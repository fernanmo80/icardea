package tr.com.srdc.icardea.careplanengine.agents.gui.util;

//~--- non-JDK imports --------------------------------------------------------

import tr.com.srdc.icardea.careplanengine.agents.gui.PatientPanel;

//~--- JDK imports ------------------------------------------------------------

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import java.net.ServerSocket;
import java.net.Socket;

import java.util.Date;

/**
 * Guideline Trigger Handler for receiving the Chest pain and ST Depression events and starting guideline.
 * @author  olduz
 */
public class GuidelineTriggerConnectionHandler extends Thread {
    private int          remainingTrials = 0;
    private boolean      shouldExit      = false;
    private PatientPanel patientPanel_CGM2;
    private PatientPanel patientPanel_CGM4;
    private int          portNo;

    /**
     *  Fields of the connection handler
     */
    private ServerSocket socket;

    public GuidelineTriggerConnectionHandler(int sensorSetID, PatientPanel patientPanelCGM2,
            PatientPanel patientPanelCGM4) {
        portNo                 = 4000 + sensorSetID * 200;
        this.patientPanel_CGM2 = patientPanelCGM2;
        this.patientPanel_CGM4 = patientPanelCGM4;
        socket                 = openSocket();
    }

    public int getPortNo() {
        return portNo;
    }

    private ServerSocket openSocket() {
        if (remainingTrials == 0) {
            return null;
        }

        try {
            return new ServerSocket(portNo);
        } catch (IOException e) {
            remainingTrials--;
            portNo++;

            return openSocket();
        }
    }

    public synchronized void stopSocket() {
        try {
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void acceptConnections() {
        try {
            while (true) {
                Socket connectionSocket = socket.accept();

                Logger.getLogger(this.getClass()).log(Level.DEBUG, ("Connection at " + new Date()));
                Logger.getLogger(this.getClass()).log(Level.DEBUG, (System.currentTimeMillis()));

                GuidelineTriggerConnectionHandlingThread thread =
                    new GuidelineTriggerConnectionHandlingThread(connectionSocket);

                thread.run();
            }
        } catch (IOException e) {

            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        Logger.getLogger(this.getClass()).log(Level.DEBUG, ("QUITTING Guideline Trigger.........."));
    }

    public static void main(String[] args) {

//      GuidelineTriggerConnectionHandler handler= new GuidelineTriggerConnectionHandlingThread();
//      handler.acceptConnections();
    }

    public void run() {
        acceptConnections();
    }

    private class GuidelineTriggerConnectionHandlingThread extends Thread {
        private Socket socket;

        public GuidelineTriggerConnectionHandlingThread(Socket socket) {
            this.socket = socket;
        }

        public void run() {
            try {
                BufferedReader incoming = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String         obj;

                obj = incoming.readLine();
                Logger.getLogger(this.getClass()).log(Level.DEBUG, ("\n\n********* Received a trigger: " + obj + "\n\n"));

//              if (obj instanceof String) {
                if (obj.equals("CP")) {
                    if (!patientPanel_CGM2.isExecuting()) {
                        patientPanel_CGM2.triggerReceived_StartCGM();
                    } else {
                        patientPanel_CGM2.showTriggerEvent(
                            "---Ignoring \"Chest Pain Event\" since the guideline is already running---");
                    }
                } else if (obj.equals("ST")) {
                    if (!patientPanel_CGM4.isExecuting()) {
                        patientPanel_CGM4.triggerReceived_StartCGM();
                    } else {
                        patientPanel_CGM4.showTriggerEvent(
                            "---Ignoring \"ST Depression Event\" since the guideline is already running---");
                    }
                }

//              }
//              else {
//                  Logger.getLogger(this.getClass()).log(Level.DEBUG, ("Inappropriate message type");
//              }
            } catch (Exception e) {

                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com

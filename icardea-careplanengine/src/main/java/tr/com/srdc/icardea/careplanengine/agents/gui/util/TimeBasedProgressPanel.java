package tr.com.srdc.icardea.careplanengine.agents.gui.util;

//~--- JDK imports ------------------------------------------------------------
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import java.util.Timer;
import java.util.TimerTask;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class TimeBasedProgressPanel extends JPanel {
    private final int               ONE_SECOND          = 1000;
    private final int               ONE_MINUTE          = ONE_SECOND * 60;
    private final int               THREE_MINUTES       = ONE_MINUTE * 3;    // the maximum time to wait for lookup
    private final int               FIVE_MINUTES        = ONE_MINUTE * 5;    // the maximum time to wait for invocation
    private final JLabel            lab                 = new JLabel();
    private final JButton           btnStop             = new JButton();
    private String                  labelText           = "";
    private String                  panelId             = "";
    private ProgressBarListener     progressBarListener = null;
    private int                     current_timeout;
    private TimeBasedProgressDialog parent;
    private JProgressBar            progressBar;
    private Timer                   timer;

    public static Logger logger = Logger.getLogger(TimeBasedProgressPanel.class);

    public TimeBasedProgressPanel(final JDialog progressDialog, final String labText,
                                  ProgressBarListener progressBarListener) {
        super();
        this.parent              = (TimeBasedProgressDialog) progressDialog;
        this.progressBarListener = progressBarListener;
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setMinimumSize(new Dimension(330, 35));

//      setMaximumSize(new Dimension(330,35));
        setOpaque(true);
        setBackground(Color.LIGHT_GRAY);
        labelText = labText;
        init();
    }

    public void setPanelId(final String id) {
        this.panelId = id;
    }

    public String getPanelId() {
        return this.panelId;
    }

    public void setLabelText(final String labText) {
        this.labelText = labText;
    }

    public String getLabelText() {
        return labelText;
    }

    public void start() {
        if (this.timer == null) {
            if (this.progressBar.getValue() == this.progressBar.getMaximum()) {
                this.progressBar.setValue(0);
            }

            this.timer = new Timer(true);
            this.timer.schedule(createTimerTask(), 0, ONE_SECOND);
        }
    }

    private TimerTask createTimerTask() {
        return new TimerTask() {
            public void run() {
                if (progressBar.getValue() < progressBar.getMaximum()) {
                    updateProgress();
                } else {
                    stop(true);    //
                }
            }
        };
    }

    private void updateProgress() {
        int progresValue = this.progressBar.getValue() + ONE_SECOND;

        this.progressBar.setValue(progresValue);

        int    current = current_timeout - progresValue;
        int    minutes = current / ONE_MINUTE;
        int    secs    = (current - (minutes * ONE_MINUTE)) / ONE_SECOND;
        String s       = (secs < 10)
                         ? "0" + String.valueOf(secs)
                         : String.valueOf(secs);

        lab.setText(labelText + " [0" + minutes + ":" + s + "]");
    }

    public void stop(final boolean sendToInvoker) {
        if (this.timer != null) {
            this.timer.cancel();
            this.timer = null;

            if (sendToInvoker) {
                logger.info("=== SEND STOP SIGNAL TO INVOKER ===");

                if (progressBarListener != null) {
                    progressBarListener.progressTerminatedExternally();
                }

                progressBar.setForeground(Color.RED);
            }

            progressBar.setValue(progressBar.getMaximum());

            // parent.getMonitoringGUI.stopWaiting(panelId);
            parent.dispose();
        }
    }

    private void init() {
        current_timeout = THREE_MINUTES;
        lab.setText(labelText);
        lab.setMinimumSize(new Dimension(80, 10));
        lab.setMaximumSize(new Dimension(80, 10));

        Font f = new Font("SansSerif", Font.BOLD, 9);

        lab.setFont(f);
        lab.setForeground(Color.BLUE);
        lab.setOpaque(true);
        lab.setBackground(Color.WHITE);
        btnStop.setMinimumSize(new Dimension(15, 15));
        btnStop.setMaximumSize(new Dimension(15, 15));
        btnStop.setMargin(new Insets(0, 0, 0, 0));
        File file = new File("images/stop.gif");
        logger.info(file.exists());
        logger.info("ABSOLUTE PATH:" + file.getAbsolutePath());
        logger.info(this.getClass().getClassLoader().getResource("images/stop.gif"));
        //btnStop.setIcon(new ImageIcon("/images/stop.gif"));
        btnStop.setToolTipText("Stop the action");
        btnStop.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                stop(true);
            }
        });
        progressBar = new JProgressBar(0, current_timeout);
        progressBar.setValue(0);
        progressBar.setBackground(Color.WHITE);
        progressBar.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        progressBar.setPreferredSize(new Dimension(300, 10));
        progressBar.setMaximumSize(new Dimension(700, 10));
        progressBar.setForeground(new Color(38, 162, 17));

        JPanel outerPanel = new JPanel();

        outerPanel.setLayout(new BorderLayout());
        outerPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        JPanel progressPanel = new JPanel();

        progressPanel.setLayout(new BoxLayout(progressPanel, BoxLayout.X_AXIS));
        progressPanel.setBackground(Color.WHITE);
        progressPanel.add(progressBar);
        progressPanel.add(Box.createHorizontalStrut(5));
        progressPanel.add(btnStop);
        outerPanel.add(lab, BorderLayout.NORTH);
        outerPanel.add(progressPanel);
        add(outerPanel);
        add(Box.createVerticalStrut(5));
    }
}


//~ Formatted by Jindent --- http://www.jindent.com

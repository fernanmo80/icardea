package tr.com.srdc.icardea.careplanengine.agents.gui.util;

//~--- JDK imports ------------------------------------------------------------

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class StepBasedProgressPanel extends JPanel {
    private final JLabel        lab                 = new JLabel();
    private final JButton       btnStop             = new JButton();
    private String              labelText           = "";
    private String              panelId             = "";
    private ProgressBarListener progressBarListener = null;
    private JDialog             parent;
    private JProgressBar        progressBar;
    private int                 stepCount, currentStep;

    public StepBasedProgressPanel(final JDialog progressDialog, final String labText,
                                  ProgressBarListener progressBarListener) {
        super();
        this.parent              = progressDialog;
        this.progressBarListener = progressBarListener;
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setPreferredSize(new Dimension(410, 33));

//      setMaximumSize(new Dimension(330,35));
        setOpaque(true);
        setBackground(Color.LIGHT_GRAY);
        labelText = labText;
        init();
    }

    public void setStepCount(int stepCount) {
        this.stepCount = stepCount;
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
        this.progressBar.setValue(3);
        currentStep = 1;
    }

    public void updateProgress() {
        if (currentStep < stepCount) {
            currentStep++;

            int progressValue = (int) ((100d * currentStep) / stepCount);

            this.progressBar.setValue(progressValue);
            lab.setText(labelText + " [" + currentStep + " of " + stepCount + "]");
        } else {
            stop(true);    //
        }
    }

    public void stop(final boolean sendToInvoker) {
        if (sendToInvoker) {
            Logger.getLogger(this.getClass()).log(Level.DEBUG, ("=== SEND STOP SIGNAL TO INVOKER ==="));

            if (progressBarListener != null) {
                progressBarListener.progressTerminatedExternally();
            }

            progressBar.setForeground(Color.RED);
        }

        progressBar.setValue(progressBar.getMaximum());
        currentStep = stepCount;
        parent.dispose();
    }

    public void setIndeterminate(boolean indeterminate) {
        progressBar.setIndeterminate(true);
    }

    private void init() {
        lab.setText(labelText);

//      lab.setMinimumSize(new Dimension(80,10));
//      lab.setMaximumSize(new Dimension(80,10));
        Font f = new Font("SansSerif", Font.BOLD, 9);

        lab.setFont(f);
        lab.setForeground(Color.BLUE);
        lab.setOpaque(true);
        lab.setBackground(Color.WHITE);
        btnStop.setMinimumSize(new Dimension(15, 15));
        btnStop.setMaximumSize(new Dimension(15, 15));
        btnStop.setMargin(new Insets(0, 0, 0, 0));
        btnStop.setIcon(new ImageIcon(this.getClass().getClassLoader().getResource("images/stop.gif")));
        btnStop.setToolTipText("Stop the action");
        btnStop.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                stop(true);
            }
        });
        progressBar = new JProgressBar();
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

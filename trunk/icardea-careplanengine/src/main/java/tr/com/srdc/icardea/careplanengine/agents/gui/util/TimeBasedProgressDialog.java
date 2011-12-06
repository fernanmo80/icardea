package tr.com.srdc.icardea.careplanengine.agents.gui.util;

//~--- JDK imports ------------------------------------------------------------

import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TimeBasedProgressDialog extends JDialog {
    private TimeBasedProgressPanel timeBasedProgressPanel = null;
    private JPanel                 cp;
    private JFrame                 parent;

    public TimeBasedProgressDialog(JFrame parent, String title) {
        this(parent, title, null);
    }

    public TimeBasedProgressDialog(JFrame parent, String title, ProgressBarListener progressBarListener) {
        super(parent);
        this.parent = parent;
        setModal(false);
        setTitle("Please wait...");
        cp = (JPanel) getContentPane();
        cp.setLayout(new BoxLayout(cp, BoxLayout.Y_AXIS));
        cp.setOpaque(true);
        cp.setBackground(Color.LIGHT_GRAY);
        timeBasedProgressPanel = new TimeBasedProgressPanel(this, title, progressBarListener);
        cp.add(timeBasedProgressPanel);
        pack();
        timeBasedProgressPanel.start();
        setLocationRelativeTo(this.parent);
        setVisible(true);
    }

    public void createNewPanel(final String invokerId, final String invokerTitle) {}

    public void setDisplayText(String displayText) {
        if (timeBasedProgressPanel != null) {
            timeBasedProgressPanel.setLabelText(displayText);
        }
    }

    public void stopProgressBar() {
        if (timeBasedProgressPanel != null) {
            timeBasedProgressPanel.stop(false);
        }

        setVisible(false);
        dispose();
    }
}


//~ Formatted by Jindent --- http://www.jindent.com

package tr.com.srdc.icardea.careplanengine.agents.gui.util;

//~--- JDK imports ------------------------------------------------------------

import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class StepBasedProgressDialog extends JDialog {
    private StepBasedProgressPanel stepBasedProgressPanel = null;
    private JPanel                 cp;
    private JFrame                 parent;

    public StepBasedProgressDialog(JFrame parent, String title, ProgressBarListener progressBarListener) {
        super(parent);
        this.parent = parent;
        setModal(false);
        setTitle("Please wait...");
        cp = (JPanel) getContentPane();
        cp.setLayout(new BoxLayout(cp, BoxLayout.Y_AXIS));
        cp.setOpaque(true);
        cp.setBackground(Color.LIGHT_GRAY);
        stepBasedProgressPanel = new StepBasedProgressPanel(this, title, progressBarListener);
        cp.add(stepBasedProgressPanel);
        pack();
        stepBasedProgressPanel.start();
        setLocationRelativeTo(this.parent);
        setVisible(true);
    }

    public void setStepCount(int stepCount) {
        stepBasedProgressPanel.setStepCount(stepCount);
    }

    public void advanceToNextStep(String displayText) {
        if (stepBasedProgressPanel != null) {
            stepBasedProgressPanel.setLabelText(displayText);
            stepBasedProgressPanel.updateProgress();
        }
    }

    public void stopProgressBar() {
        if (stepBasedProgressPanel != null) {
            stepBasedProgressPanel.stop(false);
        }

        setVisible(false);
        dispose();
    }
}


//~ Formatted by Jindent --- http://www.jindent.com

package tr.com.srdc.icardea.careplanengine.agents.gui.consultingGUI;

//~--- JDK imports ------------------------------------------------------------

import javax.swing.JDialog;

public class DurationIntervalDialog extends JDialog {
    public DurationIntervalDialog(Object obj) {
        try {
            this.setBounds(30, 30, 300, 300);
            this.setModal(true);
            this.setTitle("Duration Interval Window");

            DurationIntervalPanel panel = new DurationIntervalPanel(this, obj);

            this.setContentPane(panel);
        } catch (Exception exc) {
            exc.printStackTrace();
        }

        // this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}


//~ Formatted by Jindent --- http://www.jindent.com

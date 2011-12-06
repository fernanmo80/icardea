package tr.com.srdc.icardea.careplanengine.agents.gui.consultingGUI;

//~--- JDK imports ------------------------------------------------------------

import javax.swing.JDialog;

public class TimeIntervalDialog extends JDialog {
    TimeIntervalDialog(Object obj) {
        try {
            this.setBounds(30, 30, 300, 300);
            this.setModal(true);
            this.setTitle("Time Interval Window");

            TimeIntervalPanel panel = new TimeIntervalPanel(this, obj);

            this.setContentPane(panel);
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com

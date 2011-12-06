package tr.com.srdc.icardea.careplanengine.agents.gui.consultingGUI;

//~--- JDK imports ------------------------------------------------------------

import javax.swing.JDialog;

public class RangeDialog extends JDialog {
    RangeDialog(Object obj) {
        try {
            this.setBounds(30, 30, 300, 300);
            this.setModal(true);
            this.setTitle("Range Window");

            RangePanel panel = new RangePanel(this, obj);

            this.setContentPane(panel);
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com

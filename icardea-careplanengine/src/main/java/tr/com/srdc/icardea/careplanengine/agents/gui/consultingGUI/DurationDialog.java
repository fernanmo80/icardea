package tr.com.srdc.icardea.careplanengine.agents.gui.consultingGUI;

//~--- JDK imports ------------------------------------------------------------

import javax.swing.JDialog;

public class DurationDialog extends JDialog {
    DurationDialog(Object obj) {
        this.setBounds(30, 30, 300, 300);
        this.setModal(true);
        this.setTitle("Duration Window");
        this.setContentPane(new DurationPanel(this, obj));

        // this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}


//~ Formatted by Jindent --- http://www.jindent.com

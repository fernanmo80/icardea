package tr.com.srdc.icardea.careplanengine.agents.gui.consultingGUI;

//~--- JDK imports ------------------------------------------------------------

import javax.swing.JDialog;

public class TimeLiteralDialog extends JDialog {
    public TimeLiteralDialog(Object obj) {
        this.setBounds(30, 30, 500, 400);
        this.setModal(true);
        this.setTitle("Time Literal Window");
        this.setContentPane(new TimeLiteralPanel(this, obj));

        // this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}


//~ Formatted by Jindent --- http://www.jindent.com

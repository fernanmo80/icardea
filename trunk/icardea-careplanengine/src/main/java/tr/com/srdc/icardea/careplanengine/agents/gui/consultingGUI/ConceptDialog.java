package tr.com.srdc.icardea.careplanengine.agents.gui.consultingGUI;

//~--- JDK imports ------------------------------------------------------------

import javax.swing.JDialog;
import javax.swing.JFrame;

public class ConceptDialog extends JDialog {
    public ConceptDialog(Object obj) {
        try {
            this.setBounds(30, 30, 300, 300);
            this.setModal(true);
            this.setTitle("Concept Window");
            this.setContentPane(new ConceptPanel(this, obj));

            // this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com

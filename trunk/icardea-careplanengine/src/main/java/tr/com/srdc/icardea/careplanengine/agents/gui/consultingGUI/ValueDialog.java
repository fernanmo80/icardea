package tr.com.srdc.icardea.careplanengine.agents.gui.consultingGUI;

//~--- non-JDK imports --------------------------------------------------------

import tr.com.srdc.icardea.careplanengine.entities.patientDataEntities.ObservationEntity;

//~--- JDK imports ------------------------------------------------------------

import javax.swing.JDialog;

public class ValueDialog extends JDialog {
    ValueDialog(ObservationEntity observation) {
        this.setBounds(0, 0, 400, 400);
        this.setContentPane(new ValuePanel(this, observation));
        this.setModal(true);
        this.setTitle("Value Window");
    }
}


//~ Formatted by Jindent --- http://www.jindent.com

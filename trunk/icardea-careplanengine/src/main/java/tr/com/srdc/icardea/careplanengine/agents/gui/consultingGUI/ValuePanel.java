package tr.com.srdc.icardea.careplanengine.agents.gui.consultingGUI;

//~--- non-JDK imports --------------------------------------------------------

import tr.com.srdc.icardea.careplanengine.entities.patientDataEntities.IndexEntity;
import tr.com.srdc.icardea.careplanengine.entities.patientDataEntities.ObservationEntity;
import tr.com.srdc.icardea.careplanengine.entities.patientDataEntities.PhysicalQuantityEntity;
import tr.com.srdc.icardea.careplanengine.entities.patientDataEntities.RangeEntity;
import tr.com.srdc.icardea.careplanengine.entities.patientDataEntities.TextValueEntity;

//~--- JDK imports ------------------------------------------------------------

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JPanel;

public class ValuePanel extends JPanel {
    private static final int INDEX_VALUE = 0;
    private static final int PQ_VALUE    = 2;
    private static final int RANGE_VALUE = 3;
    private static final int TEXT_VALUE  = 1;
    private JDialog          dialog;
    private JPanel           dynamicValuePanel;
    private Object           result;
    private JComboBox        selectionCombo;

    public ValuePanel(ValueDialog dialog, ObservationEntity observation) {
        this.dialog = dialog;
        result      = observation;
        initializeComponents();
        this.setLayout(null);
    }

    private void initializeComponents() {
        selectionCombo = new JComboBox();
        selectionCombo.addItem("Index Value");
        selectionCombo.addItem("Text Value");
        selectionCombo.addItem("Physical Value");
        selectionCombo.addItem("Range Value");
        selectionCombo.setBounds(100, 30, 150, 25);
        selectionCombo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                fillPanel();
            }
        });
        add(selectionCombo);
    }

    protected void fillPanel() {
        if (dynamicValuePanel != null) {
            dynamicValuePanel.setVisible(false);
            dynamicValuePanel = null;
        }

        ObservationEntity observation = (ObservationEntity) result;
        int               index       = selectionCombo.getSelectedIndex();

        switch (index) {
        case INDEX_VALUE :
            IndexEntity indexV = new IndexEntity();

            dynamicValuePanel = new IndexPanel(dialog, indexV);
            add(dynamicValuePanel);
            dynamicValuePanel.setBounds(60, 100, 300, 300);
            dynamicValuePanel.setVisible(true);
            observation.setValue(indexV);

            break;

        case TEXT_VALUE :
            TextValueEntity tv = new TextValueEntity();

            dynamicValuePanel = new TextPanel(dialog, tv);
            add(dynamicValuePanel);
            dynamicValuePanel.setBounds(60, 100, 300, 300);
            dynamicValuePanel.setVisible(true);
            observation.setValue(tv);

            break;

        case PQ_VALUE :
            PhysicalQuantityEntity pqe = new PhysicalQuantityEntity();

            dynamicValuePanel = new PQPanel(dialog, pqe);
            add(dynamicValuePanel);
            dynamicValuePanel.setBounds(60, 100, 300, 300);
            dynamicValuePanel.setVisible(true);
            observation.setValue(pqe);

            break;

        case RANGE_VALUE :
            RangeEntity re = new RangeEntity();

            dynamicValuePanel = new RangePanel(dialog, re);
            add(dynamicValuePanel);
            dynamicValuePanel.setBounds(60, 100, 300, 300);
            dynamicValuePanel.setVisible(true);
            observation.setValue(re);

            break;

        default :
            return;
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com

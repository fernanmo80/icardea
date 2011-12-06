package tr.com.srdc.icardea.careplanengine.agents.gui.consultingGUI;

//~--- non-JDK imports --------------------------------------------------------

import tr.com.srdc.icardea.careplanengine.entities.patientDataEntities.PhysicalQuantityEntity;

//~--- JDK imports ------------------------------------------------------------

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PQPanel extends JPanel {
    private JDialog    dialog;
    private JLabel     displayNameLabel;
    private JTextField displayNameText;
    private JLabel     errorMessage;
    private JButton    okButton;
    private JLabel     pqValueLabel;
    private JTextField pqValueText;
    private JLabel     precisionLabel;
    private JTextField precisionText;
    private Object     result;
    private JLabel     unitLabel;
    private JTextField unitText;

    public PQPanel(JDialog dialog, Object obj) {
        this.dialog = dialog;
        result      = obj;
        initializeComponents();
        this.setLayout(null);
    }

    private void initializeComponents() {

//      displayName
        displayNameLabel = new JLabel();
        displayNameLabel.setBounds(30, 30, 80, 25);
        displayNameLabel.setText("Display Name");
        add(displayNameLabel);
        displayNameText = new JTextField();
        displayNameText.setBounds(120, 30, 80, 25);
        add(displayNameText);

//      pqValue
        pqValueLabel = new JLabel();
        pqValueLabel.setBounds(30, 70, 80, 25);
        pqValueLabel.setText("Value");
        add(pqValueLabel);
        pqValueText = new JTextField();
        pqValueText.setBounds(120, 70, 80, 25);
        add(pqValueText);

//      precision
        precisionLabel = new JLabel();
        precisionLabel.setBounds(30, 110, 80, 25);
        precisionLabel.setText("Precision");
        add(precisionLabel);
        precisionText = new JTextField();
        precisionText.setBounds(120, 110, 80, 25);
        add(precisionText);

//      unit
        unitLabel = new JLabel();
        unitLabel.setBounds(30, 150, 80, 25);
        unitLabel.setText("Unit");
        add(unitLabel);
        unitText = new JTextField();
        unitText.setBounds(120, 150, 80, 25);
        add(unitText);
        okButton = new JButton();
        okButton.setText("OK");
        okButton.setBounds(30, 190, 80, 25);
        okButton.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent arg0) {
                try {
                    PhysicalQuantityEntity pq = (PhysicalQuantityEntity) result;

                    pq.setDisplayName(displayNameText.getText());
                    pq.setPqValue(Float.parseFloat(pqValueText.getText()));
                    pq.setPrecision(Integer.parseInt(precisionText.getText()));
                    pq.setUnit(unitText.getText());
                    dialog.setVisible(false);
                } catch (NumberFormatException nfe) {
                    errorMessage.setVisible(true);
                }
            }
            public void mousePressed(MouseEvent arg0) {

                // TODO Auto-generated method stub
            }
            public void mouseReleased(MouseEvent arg0) {

                // TODO Auto-generated method stub
            }
            public void mouseEntered(MouseEvent arg0) {

                // TODO Auto-generated method stub
            }
            public void mouseExited(MouseEvent arg0) {

                // TODO Auto-generated method stub
            }
        });
        add(okButton);
        errorMessage = new JLabel();
        errorMessage.setBounds(5, 0, 300, 25);
        errorMessage.setText("Value and Precision  need to be number!!");
        errorMessage.setForeground(Color.RED);
        errorMessage.setVisible(false);
        add(errorMessage);
    }
}


//~ Formatted by Jindent --- http://www.jindent.com

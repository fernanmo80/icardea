package tr.com.srdc.icardea.careplanengine.agents.gui.consultingGUI;

//~--- non-JDK imports --------------------------------------------------------

import tr.com.srdc.icardea.careplanengine.entities.patientDataEntities.IndexEntity;
import tr.com.srdc.icardea.careplanengine.entities.patientDataEntities.TextValueEntity;

//~--- JDK imports ------------------------------------------------------------

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class IndexPanel extends JPanel {
    private JDialog    dialog;
    protected JLabel   errorMessage;
    private JButton    okButton;
    private JLabel     precisionLabel;
    private JTextField precisionText;
    private Object     result;
    private JLabel     valueLabel;
    private JTextField valueText;

    public IndexPanel(JDialog dialog, Object obj) {
        this.dialog = dialog;
        result      = obj;
        initializeComponents();
        this.setLayout(null);
    }

    private void initializeComponents() {

        // value
        valueLabel = new JLabel();
        valueLabel.setText("Value");
        valueLabel.setBounds(30, 30, 80, 25);
        add(valueLabel);
        valueText = new JTextField();
        valueText.setBounds(120, 30, 80, 25);
        add(valueText);

        // precision
        precisionLabel = new JLabel();
        precisionLabel.setText("Precision");
        precisionLabel.setBounds(30, 70, 80, 25);
        add(precisionLabel);
        precisionText = new JTextField();
        precisionText.setBounds(120, 70, 80, 25);
        add(precisionText);

        JLabel errorMessage = new JLabel();

        errorMessage.setText("Index value and Precision need to be numbers!!");
        errorMessage.setBounds(10, 10, 200, 25);
        errorMessage.setForeground(Color.RED);
        errorMessage.setVisible(false);
        okButton = new JButton();
        okButton.setBounds(30, 110, 80, 25);
        okButton.setText("OK");
        okButton.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent arg0) {
                fillIndex();
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
    }

    protected void fillIndex() {
        try {
            IndexEntity iv = (IndexEntity) result;

            iv.setIndex(Float.parseFloat(valueText.getText()));
            iv.setPrecision(Integer.parseInt(precisionText.getText()));
            dialog.setVisible(false);
        } catch (NumberFormatException nfe) {
            errorMessage.setVisible(true);
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com

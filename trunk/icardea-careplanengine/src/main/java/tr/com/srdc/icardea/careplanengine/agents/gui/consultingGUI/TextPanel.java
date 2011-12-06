package tr.com.srdc.icardea.careplanengine.agents.gui.consultingGUI;

//~--- non-JDK imports --------------------------------------------------------

import tr.com.srdc.icardea.careplanengine.entities.patientDataEntities.TextValueEntity;

//~--- JDK imports ------------------------------------------------------------

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class TextPanel extends JPanel {
    JDialog    dialog;
    JButton    okButton;
    Object     result;
    JLabel     valueLabel;
    JTextField valueText;

    public TextPanel(JDialog dialog, Object obj) {
        this.dialog = dialog;
        result      = obj;
        initializeComponents();
        this.setLayout(null);
    }

    private void initializeComponents() {
        valueLabel = new JLabel();
        valueLabel.setText("Text Value");
        valueLabel.setBounds(30, 30, 80, 25);
        add(valueLabel);
        valueText = new JTextField();
        valueText.setBounds(120, 30, 80, 25);
        add(valueText);
        okButton = new JButton();
        okButton.setBounds(30, 70, 80, 25);
        okButton.setText("OK");
        okButton.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent arg0) {
                try {
                    TextValueEntity tv = (TextValueEntity) result;

                    tv.setText(valueText.getText());
                    dialog.setVisible(false);
                } catch (Exception exc) {
                    exc.printStackTrace();
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
    }
}


//~ Formatted by Jindent --- http://www.jindent.com

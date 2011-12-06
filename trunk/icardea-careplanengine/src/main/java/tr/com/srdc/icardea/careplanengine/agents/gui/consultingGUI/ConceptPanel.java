package tr.com.srdc.icardea.careplanengine.agents.gui.consultingGUI;

//~--- non-JDK imports --------------------------------------------------------

import tr.com.srdc.icardea.careplanengine.entities.patientDataEntities.ConceptEntity;

//~--- JDK imports ------------------------------------------------------------

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class ConceptPanel extends JPanel {

    /**
     * @param args
     */
    JLabel             conceptIdLabel;
    private JTextField conceptIdText;
    JLabel             conceptNameLabel;
    private JTextField conceptNameText;
    JLabel             conceptSourceLabel;
    private JTextField conceptSourceText;
    private JDialog    dialog;
    private JButton    okButton;
    private Object     result;

    ConceptPanel(JDialog dialog, Object incoming) {
        this.dialog = dialog;
        result      = incoming;
        initializeComponents();
        this.setLayout(null);
    }

    private void initializeComponents() {
        try {

            // conceptId
            conceptIdLabel = new JLabel();
            conceptIdLabel.setText("Concept Id");
            conceptIdLabel.setBounds(30, 30, 80, 25);
            add(conceptIdLabel);
            conceptIdText = new JTextField();
            conceptIdText.setText("");
            conceptIdText.setBounds(170, 30, 80, 25);
            add(conceptIdText);

            // conceptName
            conceptNameLabel = new JLabel();
            conceptNameLabel.setText("Concept Name");
            conceptNameLabel.setBounds(30, 70, 100, 25);
            add(conceptNameLabel);
            conceptNameText = new JTextField();
            conceptNameText.setText("");
            conceptNameText.setBounds(170, 70, 80, 25);
            add(conceptNameText);

            // conceptSource
            conceptSourceLabel = new JLabel();
            conceptSourceLabel.setText("Concept Source");
            conceptSourceLabel.setBounds(30, 110, 100, 25);
            add(conceptSourceLabel);
            conceptSourceText = new JTextField();
            conceptSourceText.setText("");
            conceptSourceText.setBounds(170, 110, 80, 25);
            add(conceptSourceText);

            // OK Button and its evetn
            okButton = new JButton();
            okButton.setText("OK");
            okButton.setBounds(30, 150, 100, 25);
            add(okButton);
            okButton.addMouseListener(new MouseListener() {
                public void mouseClicked(MouseEvent arg0) {
                    try {

                        // Logger.getLogger(this.getClass()).log(Level.DEBUG, (((.setVisible(false));
                        dialog.setVisible(false);

                        ConceptEntity concept = ((ConceptEntity) result);

                        concept.setConceptID(conceptIdText.getText());
                        concept.setConceptName(conceptNameText.getText());
                        concept.setConceptSource(conceptSourceText.getText());
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
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com

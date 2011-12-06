package tr.com.srdc.icardea.careplanengine.agents.gui.consultingGUI;

//~--- non-JDK imports --------------------------------------------------------

import tr.com.srdc.icardea.careplanengine.entities.patientDataEntities.TimeLiteralEntity;

//~--- JDK imports ------------------------------------------------------------

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TimeLiteralPanel extends JPanel {
    private JLabel            dayLabel;
    private JTextField        dayText;
    private TimeLiteralDialog dialog;
    private JLabel            displayNameLabel;
    private JTextField        displayNameText;
    private JLabel            hourLabel;
    private JTextField        hourText;
    private JLabel            milliSecondLabel;
    private JTextField        milliSecondText;
    private JLabel            minuteLabel;
    private JTextField        minuteText;
    private JLabel            monthLabel;
    private JTextField        monthText;
    private JButton           okButton;
    private JLabel            plusHourLabel;
    private JTextField        plusHourText;
    private Object            result;
    private JLabel            secondLabel;
    private JTextField        secondText;

    // GUI Components
    private JLabel     yearLabel;
    private JTextField yearText;

    public TimeLiteralPanel(TimeLiteralDialog dialog, Object obj) {
        this.dialog = dialog;
        this.result = obj;
        initializeComponents();
        this.setLayout(null);
    }

    private void initializeComponents() {

        // year
        yearLabel = new JLabel();
        yearLabel.setBounds(30, 30, 60, 25);
        yearLabel.setText("Year");
        add(yearLabel);
        yearText = new JTextField();
        yearText.setBounds(120, 30, 60, 25);
        add(yearText);

        // month
        monthLabel = new JLabel();
        monthLabel.setBounds(30, 70, 60, 25);
        monthLabel.setText("Month");
        add(monthLabel);
        monthText = new JTextField();
        monthText.setBounds(120, 70, 60, 25);
        add(monthText);

        // day
        dayLabel = new JLabel();
        dayLabel.setBounds(30, 110, 60, 25);
        dayLabel.setText("Day");
        add(dayLabel);
        dayText = new JTextField();
        dayText.setBounds(120, 110, 60, 25);
        add(dayText);

        // hour
        hourLabel = new JLabel();
        hourLabel.setBounds(30, 150, 60, 25);
        hourLabel.setText("Hour");
        add(hourLabel);
        hourText = new JTextField();
        hourText.setBounds(120, 150, 60, 25);
        add(hourText);

        // minute
        minuteLabel = new JLabel();
        minuteLabel.setBounds(30, 190, 60, 25);
        minuteLabel.setText("Minute");
        add(minuteLabel);
        minuteText = new JTextField();
        minuteText.setBounds(120, 190, 60, 25);
        add(minuteText);

//      second 
        secondLabel = new JLabel();
        secondLabel.setBounds(30, 230, 60, 25);
        secondLabel.setText("Second");
        add(secondLabel);
        secondText = new JTextField();
        secondText.setBounds(120, 230, 60, 25);
        add(secondText);

//      milliSecond 
        milliSecondLabel = new JLabel();
        milliSecondLabel.setBounds(30, 270, 60, 25);
        milliSecondLabel.setText("Millisec.");
        add(milliSecondLabel);
        milliSecondText = new JTextField();
        milliSecondText.setBounds(120, 270, 60, 25);
        add(milliSecondText);

//      displayName
        displayNameLabel = new JLabel();
        displayNameLabel.setBounds(210, 30, 80, 25);
        displayNameLabel.setText("Display Name");
        add(displayNameLabel);
        displayNameText = new JTextField();
        displayNameText.setBounds(300, 30, 60, 25);
        add(displayNameText);

//      plusHour
        plusHourLabel = new JLabel();
        plusHourLabel.setBounds(210, 70, 80, 25);
        plusHourLabel.setText("Plus Hour");
        add(plusHourLabel);
        plusHourText = new JTextField();
        plusHourText.setBounds(300, 70, 60, 25);
        add(plusHourText);

//      okButton
        okButton = new JButton();
        okButton.setBounds(30, 310, 80, 25);
        okButton.setText("OK");
        okButton.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent arg0) {
                try {
                    TimeLiteralEntity tl = (TimeLiteralEntity) result;

                    tl.setYear(yearText.getText());
                    tl.setMonth(monthText.getText());
                    tl.setDay(dayText.getText());
                    tl.setHour(hourText.getText());
                    tl.setMinute(minuteText.getText());
                    tl.setSecond(secondText.getText());
                    tl.setMillisecond(milliSecondText.getText());
                    tl.setDisplayName(displayNameText.getText());
                    tl.setPlusHour(plusHourText.getText());
                    dialog.setVisible(false);
                } catch (Exception exc) {
                    exc.printStackTrace();
                }
            }
            public void mousePressed(MouseEvent arg0) {}
            public void mouseReleased(MouseEvent arg0) {}
            public void mouseEntered(MouseEvent arg0) {}
            public void mouseExited(MouseEvent arg0) {}
        });
        add(okButton);
    }
}


//~ Formatted by Jindent --- http://www.jindent.com

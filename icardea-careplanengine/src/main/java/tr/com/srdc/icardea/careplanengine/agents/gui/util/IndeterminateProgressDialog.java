package tr.com.srdc.icardea.careplanengine.agents.gui.util;

//~--- JDK imports ------------------------------------------------------------

import java.awt.*;

import javax.swing.BoxLayout;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class IndeterminateProgressDialog extends JDialog {
    private IndeterminateProgressPanel indeterminateBasedProgressPanel = null;
    private JPanel                     cp;
    private JFrame                     parent;

    public IndeterminateProgressDialog(JFrame parent, String title) {
        super(parent);
        this.parent = parent;
        setModal(false);
        setTitle(title);
        setPreferredSize(new Dimension(330, 75));
        cp = (JPanel) getContentPane();
        cp.setLayout(new GridLayout(1, 0));
        cp.setOpaque(true);
        cp.setBackground(Color.LIGHT_GRAY);
        indeterminateBasedProgressPanel = new IndeterminateProgressPanel(this, title);
        cp.add(indeterminateBasedProgressPanel);
        repaint();
        pack();
        setLocationRelativeTo(this.parent);
        setVisible(true);
    }

    public void stopProgressBar() {
        if (indeterminateBasedProgressPanel != null) {
            indeterminateBasedProgressPanel.stop(false);
        }

        setVisible(false);
        dispose();
    }

    public static void main(String[] args) {
        new IndeterminateProgressDialog(null, "Waiting for the next execution...");
    }
}


//~ Formatted by Jindent --- http://www.jindent.com

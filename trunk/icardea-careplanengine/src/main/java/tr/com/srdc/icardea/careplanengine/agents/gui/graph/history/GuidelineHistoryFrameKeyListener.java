package tr.com.srdc.icardea.careplanengine.agents.gui.graph.history;

//~--- JDK imports ------------------------------------------------------------

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.Vector;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.BadLocationException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyledDocument;

public class GuidelineHistoryFrameKeyListener implements KeyListener {
    private JTable                _associatedTable;
    private GuidelineHistoryFrame _gHistoryFrame;

    GuidelineHistoryFrameKeyListener(GuidelineHistoryFrame gHistoryFrame, JTable associatedTable) {
        this._gHistoryFrame   = gHistoryFrame;
        this._associatedTable = associatedTable;
    }

    public void keyPressed(KeyEvent arg0) {

        // TODO Auto-generated method stub
    }

    public void keyReleased(KeyEvent arg0) {
        if (arg0.getComponent() instanceof JTable) {
            int selectedRow = _associatedTable.getSelectedRow();

            Logger.getLogger(this.getClass()).log(Level.DEBUG, ("selected row = " + selectedRow));
            _gHistoryFrame.signalRowSelection(selectedRow);
        }
    }

    public void keyTyped(KeyEvent arg0) {

        // TODO Auto-generated method stub
    }
}


//~ Formatted by Jindent --- http://www.jindent.com

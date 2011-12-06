package tr.com.srdc.icardea.careplanengine.agents.gui.dataaccess;

//~--- JDK imports ------------------------------------------------------------

import javax.swing.table.DefaultTableModel;

/**
 * User: mehmet
 * Date: Jul 4, 2006
 * Time: 4:00:16 PM
 */
public class UnEditableTableModel extends DefaultTableModel {
    public UnEditableTableModel(Object[][] objects, Object[] objects1) {
        super(objects, objects1);
    }

    public boolean isEditable(int rowIndex, int columnIndex) {
        return false;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com

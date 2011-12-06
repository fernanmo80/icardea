
/*
* TableTransferHandler.java
*
* Created on April 7, 2006, 5:32 PM
*
* To change this template, choose Tools | Template Manager
* and open the template in the editor.
 */
package tr.com.srdc.icardea.careplanengine.agents.gui.dataaccess;

//~--- JDK imports ------------------------------------------------------------

import java.awt.datatransfer.Transferable;

import javax.swing.JComponent;
import javax.swing.TransferHandler;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author mehmet olduz
 */
public class TreeTransferHandler extends TransferHandler {
    public TreeTransferHandler() {
        super();
    }

    protected Transferable createTransferable(JComponent c) {
        DragTree               tree         = (DragTree) c;
        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) tree.getLastSelectedPathComponent();
        DnDObject              object       = new DnDObject(selectedNode.getUserObject(), tree.getTreeType());

        return new TransferableObject(object);
    }

    /**
     *
     * @param c : the JTree component
     * @return : the action is COPY
     */
    public int getSourceActions(JComponent c) {
        return COPY;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com

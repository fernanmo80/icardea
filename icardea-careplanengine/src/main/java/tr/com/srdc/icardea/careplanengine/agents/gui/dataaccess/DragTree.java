
/*
* Created on April 7, 2006, 2:34 PM
*
 */
package tr.com.srdc.icardea.careplanengine.agents.gui.dataaccess;

//~--- JDK imports ------------------------------------------------------------

import java.awt.*;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DragGestureEvent;
import java.awt.dnd.DragGestureListener;
import java.awt.dnd.DragSource;

import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * The subclass of JTree which
 * and holding treeType which specifies whether the stored data is source or target.
 *
 */
public class DragTree extends JTree implements DragGestureListener {
    private int treeType = 0;

    public DragTree(DefaultTreeModel model, int type) {
        super(model);
        treeType = type;

        DragSource dragSource = DragSource.getDefaultDragSource();

        dragSource.createDefaultDragGestureRecognizer(this,    // component where drag originates
                DnDConstants.ACTION_COPY,                      // actions
                this);                                         // drag gesture recognizer
        this.setCellRenderer(new DragTreeCellRenderer());
    }

    public int getTreeType() {
        return treeType;
    }

    public void dragGestureRecognized(DragGestureEvent e) {

        // whenever a drag gesture is recognized, start new drag action with a new
        // MapperTransferable including the DNDTransferableObject returned from getObject()
        DragTreeNode selectedNode = (DragTreeNode) getLastSelectedPathComponent();

        if (!selectedNode.isTransferable()) {
            return;
        }

        DnDObject object = new DnDObject(selectedNode.getUserObject(), selectedNode.getType());
        Cursor    cursor = selectCursor(e.getDragAction());

        e.startDrag(DragSource.DefaultCopyDrop, new TransferableObject(object));
    }

    private Cursor selectCursor(int action) {
        return (action == DnDConstants.ACTION_MOVE)
               ? DragSource.DefaultMoveDrop
               : DragSource.DefaultCopyDrop;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com

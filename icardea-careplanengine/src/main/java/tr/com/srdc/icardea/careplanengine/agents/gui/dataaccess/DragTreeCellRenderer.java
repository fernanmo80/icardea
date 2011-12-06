/*
 * Created on April 7, 2006, 2:34 PM
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package tr.com.srdc.icardea.careplanengine.agents.gui.dataaccess;

//~--- JDK imports ------------------------------------------------------------

import java.awt.Component;

import javax.swing.ImageIcon;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeCellRenderer;

/**
 * @author mehmet olduz
 * 
 * 
 */
public class DragTreeCellRenderer extends DefaultTreeCellRenderer {
	ImageIcon guidelineIcons[] = { new ImageIcon("images/dataaccess/info.gif"),
			new ImageIcon("images/dataaccess/ehrGA.gif"),
			new ImageIcon("images/dataaccess/medicallyGA.gif"),
			new ImageIcon("images/dataaccess/sensorGA.gif"),
			new ImageIcon("images/dataaccess/info.gif") /*
														 * , new ImageIcon(
														 * "resource/images/dataaccess/guideline.jpg"
														 * ), new ImageIcon(
														 * "resource/images/dataaccess/guideline.jpg"
														 * ), new ImageIcon(
														 * "resource/images/dataaccess/guideline.jpg"
														 * ), new ImageIcon(
														 * "resource/images/dataaccess/guideline.jpg"
														 * ), new ImageIcon(
														 * "resource/images/dataaccess/guideline.jpg"
														 * ), new ImageIcon(
														 * "resource/images/dataaccess/guideline.jpg"
														 * )
														 */
	};
	ImageIcon rightSideIcons[] = { new ImageIcon("images/dataaccess/info.gif"),
			new ImageIcon("images/dataaccess/ehrsource.gif"),
			new ImageIcon("images/dataaccess/medicalsource.gif"),
			new ImageIcon("images/dataaccess/sensor.gif"),
			new ImageIcon("images/dataaccess/datasource.jpg"),
			new ImageIcon("images/dataaccess/datasource.jpg"),
			new ImageIcon("images/dataaccess/datasource.jpg"),
			new ImageIcon("images/dataaccess/datasource.jpg"),
			new ImageIcon("images/dataaccess/guideline.jpg") };

	public DragTreeCellRenderer() {
		super();
	}

	public Component getTreeCellRendererComponent(JTree tree, Object value,
			boolean sel, boolean expanded, boolean leaf, int row,
			boolean hasFocus) {
		super.getTreeCellRendererComponent(tree, value, sel, expanded, leaf,
				row, hasFocus);

		// based on the type of the node, set the icon for node.
		DragTreeNode node = (DragTreeNode) value;

		if (node.getType() >= 0) {
			if (node.getType() < guidelineIcons.length) {
				setIcon(guidelineIcons[node.getType()]);
			} else {
				int index = node.getType() - DnDObject.LEFT_SIDE_DIFFERENCE;

				if ((index >= 0) && (index < rightSideIcons.length)) {
					setIcon(rightSideIcons[index]);
				}
			}
		}

		return this;
	}
}

// ~ Formatted by Jindent --- http://www.jindent.com

package tr.com.srdc.icardea.careplanengine.agents.gui.graph;

//~--- non-JDK imports --------------------------------------------------------

import prefuse.controls.Control;
import prefuse.controls.DragControl;

import prefuse.visual.VisualItem;

//~--- JDK imports ------------------------------------------------------------

import java.awt.event.MouseEvent;

/**
 * User: mehmet
 * Date: Mar 31, 2006
 * Time: 11:46:24 AM
 */
public class GuidelineDragControl extends DragControl {
    GuidelineGraph guidelineGraph = null;

    public GuidelineDragControl(GuidelineGraph guidelineGraph) {
        this.guidelineGraph = guidelineGraph;
    }

    public void itemReleased(VisualItem visualItem, MouseEvent mouseEvent) {
        super.itemReleased(visualItem, mouseEvent);

//      guidelineGraph.updateScroller();
    }
}


//~ Formatted by Jindent --- http://www.jindent.com

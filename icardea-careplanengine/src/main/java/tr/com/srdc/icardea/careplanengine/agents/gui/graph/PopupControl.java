package tr.com.srdc.icardea.careplanengine.agents.gui.graph;

//~--- non-JDK imports --------------------------------------------------------

import prefuse.controls.ControlAdapter;

import prefuse.visual.VisualItem;
import prefuse.visual.tuple.TableAggregateItem;
import prefuse.visual.tuple.TableNodeItem;

import tr.com.srdc.icardea.careplanengine.agents.gui.MonitoringGUI;
import tr.com.srdc.icardea.careplanengine.agents.gui.graph.history.GuidelineHistoryFrame;
import tr.com.srdc.icardea.careplanengine.agents.gui.graph.history.StyledText;
import tr.com.srdc.icardea.careplanengine.agents.guidelineAgent.FactoryRetriever;
import tr.com.srdc.icardea.careplanengine.glmodel.impl.DefaultGuideline;

//~--- JDK imports ------------------------------------------------------------

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

import java.util.Vector;

import javax.swing.*;

/**
 * User: mehmet olduz [mehmet@srdc.metu.edu.tr]
 * Date: Jul 27, 2006
 * Time: 2:00:50 PM
 */
public class PopupControl extends ControlAdapter {
    private static PopupControl           instance;
    GuidelineGraph                        owner         = null;
    private JPopupMenu                    popupMenu     = new JPopupMenu();
    private JPopupMenu                    popupMenu2    = new JPopupMenu();
    private boolean                       isFullHistory = false;
    private boolean                       isDragged     = false;
    private TableNodeItem                 lastNodeItem;
    private ShowSubguidelineEventListener subguidelineEventListener;

    public PopupControl(GuidelineGraph display, ShowSubguidelineEventListener listener) {
        subguidelineEventListener = listener;
        owner                     = display;
        configurePopupMenu();
    }

    public static PopupControl getInstance(GuidelineGraph display, ShowSubguidelineEventListener listener) {
        if (instance == null) {
            instance = new PopupControl(display, listener);
        }

        return instance;
    }

    public static PopupControl getInstance() {
        return instance;
    }

    private void configurePopupMenu() {
        JMenuItem menuItem;

        menuItem = new JMenuItem("See History of This Node");
        menuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                showHistoryOfNode();
            }
        });
        popupMenu.add(menuItem);
        menuItem = new JMenuItem("See the Full History");
        menuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                showFullHistory();
            }
        });
        popupMenu.add(menuItem);
        menuItem = new JMenuItem("See the Full History");
        menuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                showFullHistory();
            }
        });
        popupMenu2.add(menuItem);
    }

    public void refreshHistory() {
        if (isFullHistory) {
            showFullHistory(true);
        } else {
            showHistoryOfNode(true);
        }
    }

    private void showFullHistory() {
        showFullHistory(false);
    }

    private void showHistoryOfNode() {
        showHistoryOfNode(false);
    }

    private void showFullHistory(boolean isRefresh) {
        isFullHistory = true;

        Vector<StyledText> histories = owner.getFullHistory();

        if ((histories == null) &&!isRefresh) {
            int result = JOptionPane.showConfirmDialog(owner,
                             "There is not yet any history recorded for your selection.\n"
                             + "Do you still want to open the History Frame?");

            if (result != JOptionPane.OK_OPTION) {
                return;
            }
        }

        // GuidelineHistoryFrame.getInstance().displayHistory(owner, histories, GuidelineGraph.FULL_GUIDELINE_HISTORY);
        this.owner.getGuidelineHistoryFrame().displayHistory(owner, histories, GuidelineGraph.FULL_GUIDELINE_HISTORY);
    }

    private void showHistoryOfNode(boolean isRefresh) {
        isFullHistory = false;

        String             guidelineStep = lastNodeItem.getString(GuidelineGraph.ID);
        Vector<StyledText> histories     = owner.getHistoryOf(guidelineStep);

        if ((histories == null) &&!isRefresh) {
            int result = JOptionPane.showConfirmDialog(owner,
                             "There is not yet any history associated with this node.\n"
                             + "Do you still want to open the History Frame?");

            if (result != JOptionPane.OK_OPTION) {
                return;
            }
        }

        // GuidelineHistoryFrame.getInstance().displayHistory(owner, histories, guidelineStep);
        this.owner.getGuidelineHistoryFrame().displayHistory(owner, histories, guidelineStep);
    }

    public void itemPressed(VisualItem visualItem, MouseEvent mouseEvent) {
        maybeShowPopup(visualItem, mouseEvent);

        // TODO [olduz]: The below part will be removed before the release. It is just for test purposes.
        if (mouseEvent.getButton() == MouseEvent.BUTTON2) {
            String itemName       = visualItem.getString(GuidelineGraph.ID);
            int    previousStatus = owner.getStatusOfStep(itemName);

            previousStatus = (previousStatus > 1)
                             ? 0
                             : previousStatus + 1;
            owner.changeStatusOfStep(itemName, previousStatus);
        }
    }

    public void itemDragged(VisualItem visualItem, MouseEvent mouseEvent) {
        super.itemDragged(visualItem, mouseEvent);
        isDragged = true;
    }

    public void itemReleased(VisualItem visualItem, MouseEvent mouseEvent) {
        maybeShowPopup(visualItem, mouseEvent);

        if ((mouseEvent.getButton() == MouseEvent.BUTTON1) &&!isDragged && visualItem.canGetInt(GuidelineGraph.TYPE)
                && (visualItem.getInt(GuidelineGraph.TYPE) == ShapeConstants.SUBGUIDELINE)) {
            DefaultGuideline         subguideline             =
                (DefaultGuideline) visualItem.get(GuidelineGraph.SUBGUIDELINE);
            String                   subguidelineUrl          = visualItem.getString(GuidelineGraph.SUBGUIDELINE_URI);
            GuidelineMonitoringPanel guidelineMonitoringPanel = owner.getGuidelineMonitoringPanel();

//          String patientName = guidelineMonitoringPanel.getPatientName();
//          String guidelineURI = guidelineMonitoringPanel.getURI();

//          if(subguideline==null){
//              subguideline = FactoryRetriever.getGuideline(subguidelineUrl,
//                      visualItem.getString(GuidelineGraph.LABEL));
//              guidelineURI = subguidelineUrl;
//          }
            if (subguidelineEventListener != null) {
                String key = MonitoringGUI.generateSubguidelineKey(
                                 guidelineMonitoringPanel.getPatientPanel().getAssignmentEntity(), subguideline);

                subguidelineEventListener.showSubguideline(key);
            } else {

                /* Just for testing purposes */
                JFrame frame = new JFrame("Subguideline Flow");

                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                GuidelineMonitoringPanel subguidelinePanel = new GuidelineMonitoringPanel(true, true);

                subguidelinePanel.drawGuideline(subguideline, subguidelineUrl);
                frame.setContentPane(subguidelinePanel);

                // Display the window.
                frame.pack();
                frame.setLocationRelativeTo(null);    // center it
                frame.setVisible(true);
            }
        }

        isDragged = false;
    }

    private void maybeShowPopup(VisualItem visualItem, MouseEvent e) {
        if (e.isPopupTrigger() &&!isDragged) {
            TableNodeItem nodeItem = null;

            if (visualItem instanceof TableNodeItem) {
                nodeItem = (TableNodeItem) visualItem;
            } else if (visualItem instanceof TableAggregateItem) {
                nodeItem = (TableNodeItem) ((TableAggregateItem) visualItem).items().next();
            } else {
                return;
            }

            displayAppropriatePopupMenu(nodeItem, e);
        }
    }

    private void displayAppropriatePopupMenu(TableNodeItem nodeItem, MouseEvent e) {
        popupMenu.show(e.getComponent(), e.getX(), e.getY());
        lastNodeItem = nodeItem;
    }

    public void mouseReleased(MouseEvent mouseEvent) {
        if (mouseEvent.isPopupTrigger() &&!isDragged) {
            popupMenu2.show(mouseEvent.getComponent(), mouseEvent.getX(), mouseEvent.getY());
        }

        isDragged = false;
    }

    public void mousePressed(MouseEvent mouseEvent) {
        if (mouseEvent.isPopupTrigger() &&!isDragged) {
            popupMenu2.show(mouseEvent.getComponent(), mouseEvent.getX(), mouseEvent.getY());
        }
    }

    public void mouseDragged(MouseEvent mouseEvent) {
        super.mouseDragged(mouseEvent);
        isDragged = true;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com

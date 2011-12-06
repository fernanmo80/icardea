package tr.com.srdc.icardea.careplanengine.agents.gui.graph;

import prefuse.data.Node;
import prefuse.data.Graph;
import prefuse.data.expression.Predicate;
import prefuse.data.expression.parser.ExpressionParser;
import prefuse.visual.VisualItem;
import prefuse.visual.VisualGraph;
import prefuse.Visualization;
import prefuse.Constants;
import prefuse.Display;
import prefuse.activity.Activity;
import prefuse.util.ColorLib;
import prefuse.util.display.ItemBoundsListener;
import prefuse.action.ActionList;
import prefuse.action.RepaintAction;
import prefuse.action.assignment.ColorAction;
import prefuse.action.layout.graph.NodeLinkTreeLayout;
import prefuse.action.layout.SpecifiedLayout;
import prefuse.render.DefaultRendererFactory;
import prefuse.render.LabelRenderer;
import prefuse.render.EdgeRenderer;
import prefuse.controls.ZoomControl;
import prefuse.controls.PanControl;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import java.util.Hashtable;
import java.util.Vector;
import java.awt.*;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

import tr.com.srdc.icardea.careplanengine.glmodel.InstanceFactory;
import tr.com.srdc.icardea.careplanengine.glmodel.Criterion;
import tr.com.srdc.icardea.careplanengine.glmodel.Decision_Option;
import tr.com.srdc.icardea.careplanengine.glmodel.Guideline_Step;
import tr.com.srdc.icardea.careplanengine.glmodel.Guideline;
import tr.com.srdc.icardea.careplanengine.glmodel.Guideline_Expression;
import tr.com.srdc.icardea.careplanengine.glmodel.Algorithm;
import tr.com.srdc.icardea.careplanengine.glmodel.Action_Step;
import tr.com.srdc.icardea.careplanengine.glmodel.Macro_Action_Step;
import tr.com.srdc.icardea.careplanengine.glmodel.Patient_State_Step;
import tr.com.srdc.icardea.careplanengine.glmodel.Synchronization_Step;
import tr.com.srdc.icardea.careplanengine.glmodel.Case_Step;
import tr.com.srdc.icardea.careplanengine.glmodel.Utility_Choice_Step;
import tr.com.srdc.icardea.careplanengine.glmodel.Choice_Step;
import tr.com.srdc.icardea.careplanengine.glmodel.Macro_Decision_Step;
import tr.com.srdc.icardea.careplanengine.glmodel.Branch_Step;
import tr.com.srdc.icardea.careplanengine.glmodel.Decision_Condition;

/**
 * This class is responsible for drawing the steps of a guideline as a Flow Chart.
 * User: mehmet
 * Date: Apr 4, 2006
 * Time: 3:51:15 PM
 */
@SuppressWarnings("serial")
public class GuidelineFlowChart extends Display implements ItemBoundsListener {

    protected int mNumberOfEligibilityCriteria = 0;

    protected Hashtable<String, Node> mAllCells = new Hashtable<String, Node>();
    protected Vector<Node> mEligibilities = new Vector<Node>();

    protected InstanceFactory mInstanceFactory = null;
//    protected Object[] mGuidelineSteps = null;
    protected GuidelineMonitoringPanel guidelineMonitoringPanel = null;
    private boolean firstTime;

    protected ActionList colorAction;
    protected VisualGraph visualGuidelineGraph;


    protected Graph guidelineGraph;
    protected Graph staticGraph;
    /** Label data field included in generated Graphs */
    public static final String LABEL = "label";
    public static final String IMAGE = "image";
//    public static final String STATUS = "status";
    public static final String ID = "id";
    public static final String RAISED = "raised";
    public static final String TYPE = "type";
//    public static final String GUIDELINE_OBJECT = "GuidelineObject";
    public static final String X_POS = "x_position";
    public static final String Y_POS = "y_position";
    public static final String WIDTH = "width";
    public static final String TOOLTIP = "tooltip";

    public static final String GUIDELINE_GRAPH = "g_graph";
    public static final String STATIC_GRAPH = "s_graph";

    private int idForDefaultStep = 0;

    public GuidelineFlowChart(GuidelineMonitoringPanel monitoringPanel, InstanceFactory instanceFactory) {
        super(new Visualization());

        firstTime = true;

        configure();
        guidelineMonitoringPanel = monitoringPanel;
        mInstanceFactory = instanceFactory;
        createGraphFromGuideline(monitoringPanel.getDefaultGuideline());
        createLandscape(monitoringPanel.getWidth());

        visualizeData();
    }


    public void configure(){
        guidelineGraph = new Graph(true);
        guidelineGraph.addColumn(LABEL, String.class);
//        guidelineGraph.addColumn(STATUS, int.class);
        guidelineGraph.addColumn(ID, String.class);
        guidelineGraph.addColumn(RAISED, boolean.class);
        guidelineGraph.addColumn(TYPE, int.class);
        guidelineGraph.addColumn(WIDTH, double.class);
        guidelineGraph.addColumn(TOOLTIP, String.class);


        staticGraph = new Graph(false);
        staticGraph.addColumn(LABEL, String.class);
        staticGraph.addColumn(IMAGE, String.class);
        staticGraph.addColumn(ID, String.class);
        staticGraph.addColumn(RAISED, boolean.class);
        staticGraph.addColumn(X_POS, double.class);
        staticGraph.addColumn(Y_POS, double.class);

        this.addControlListener(new PanControl());  // pan with background left-drag
        this.addControlListener(new ZoomControl()); // zoom with vertical right-drag

        this.addItemBoundsListener(this);
    }



    private void createLandscape(double aW) {
//        insertImageNode(staticGraph, "resource/image/guidelineGraph/landscape.jpg", aW-45, 90);
    }


    private Node insertCell(Node previousNode, String displayText, String anUniqueName, int type) {
        //lStatus: -1(done), 0(ongoing), 1(tobe)
        int lStatus = -1;

        Node node = insertNodeIntoGuidelineGraph(displayText, anUniqueName, lStatus, type, false);

        if(previousNode != null){
            guidelineGraph.addEdge(previousNode, node);
        }

        return node;
    }


    private void insertEligibility(Criterion aGuidelineExpression, int aStartX){
        String lUniqueName = aGuidelineExpression.getName();

        //TODO: set background according to satisfaction of criteria (red:fail, green:ok, gray:dontknow)
        // Set fill color
        /*      GraphConstants.setGradientColor(lCell.getAttributes(), Color.WHITE);
                GraphConstants.setOpaque(lCell.getAttributes(), true);
                GraphConstants.setBackground(lCell.getAttributes(), Color.GREEN);
        */
        if(!isCellDrawnBefore(lUniqueName)) {
            Node node = insertNodeIntoStaticGraph(aGuidelineExpression.getName2(), lUniqueName, false, aStartX, 40);
            mEligibilities.add(node);
        }
    }

    private void insertChoices(Decision_Option aDecisionOption, Node parentNode){
        String lUniqueName = aDecisionOption.getName();

        if(!isCellDrawnBefore(lUniqueName)) {
            Decision_Condition condition = aDecisionOption.getCondition_value();

            Node caseNode = insertCell(parentNode, condition.getName2(),
                                lUniqueName, ShapeConstants.CHOICE_STEP);

            Guideline_Step lGuidelineStep = aDecisionOption.getDestination();

            if(lGuidelineStep != null) {
                insertStep(lGuidelineStep, caseNode);
            }
        }
    }

    private void createGraphFromGuideline(Guideline aGuideline){
        String lUniqueName = "Guideline Name";//aGuideline.getName();

        setFont(new Font("", Font.PLAIN, 25));
        insertNodeIntoStaticGraph("   "+ aGuideline.getName2() + "   ", lUniqueName, true, 20, 10);
        //Guideline_Expression[] lEligibilityCriteria;
        Vector lCriteriaVector = mInstanceFactory.getEligibilityCriteria(aGuideline);
        Object[] lEligibilityCriteria = lCriteriaVector.toArray();

        mNumberOfEligibilityCriteria = lEligibilityCriteria.length;
        /*variables are used later also*/
        int lCurrentX=40;
        /*******************************/

        for(int i = 0;i < mNumberOfEligibilityCriteria;i++){
            int lFontWidth = this.getFontMetrics(this.getFont()).stringWidth("    " + ((Criterion)lEligibilityCriteria[i]).getName2() + "    ");
            insertEligibility(((Criterion)lEligibilityCriteria[i]), lCurrentX);
            lCurrentX+= lFontWidth + 20;
            Logger.getLogger(this.getClass()).log(Level.DEBUG, ("eligibility " + i + " " + ((Criterion)lEligibilityCriteria[i]).getName2() + "\n\t" + ((Guideline_Expression)lEligibilityCriteria[i]).getSpecification()));
        }

        Algorithm lAlgorithm = aGuideline.getAlgorithm();

//        mGuidelineSteps = mInstanceFactory.getAlgoSteps(aGuideline).toArray();
        Guideline_Step lGuidelineStep = lAlgorithm.getFirst_step();

        insertStep(lGuidelineStep, null);
    }


    private void visualizeData(){

        DefaultRendererFactory defaultRendererFactory = new DefaultRendererFactory();
        LabelRenderer tr = new LabelRenderer(LABEL, IMAGE);
        tr.setRoundedCorner(8, 8);

        defaultRendererFactory.setDefaultRenderer(tr);

        addStepRenderers(defaultRendererFactory);
        defaultRendererFactory.setDefaultEdgeRenderer(new EdgeRenderer(Constants.EDGE_TYPE_LINE, Constants.EDGE_ARROW_FORWARD));

        m_vis.setRendererFactory(defaultRendererFactory);

        // add visual data groups
        visualGuidelineGraph = m_vis.addGraph(GUIDELINE_GRAPH, guidelineGraph);

        m_vis.addGraph(STATIC_GRAPH, staticGraph);

        setStepShapes(m_vis);

        colorAction = getColorActions();   //get Color actions with status visualization


        ActionList layout = new ActionList(1);
//        layout.add(colors);
        NodeLinkTreeLayout nodeLinkTreeLayout = new NodeLinkTreeLayout(GUIDELINE_GRAPH, Constants.ORIENT_TOP_BOTTOM, 50, 150, 150);
        nodeLinkTreeLayout.setLayoutAnchor(new Point2D.Double(250, 70));
        layout.add(nodeLinkTreeLayout);
        layout.add(new SpecifiedLayout(STATIC_GRAPH, X_POS, Y_POS));

        layout.add(new RepaintAction());

        // add the action to the visualization
        m_vis.putAction("layout", layout);
        m_vis.putAction("color", colorAction);

        m_vis.run("layout"); //apply the layouts
        m_vis.run("color");

    }

    public static void addStepRenderers(DefaultRendererFactory rendererFactory){
        rendererFactory.add("ingroup('"+ GUIDELINE_GRAPH+".nodes') AND (["+TYPE+"] <" + ShapeConstants.SIZE  +")" ,
                new GuidelineShapeRenderer(40));
    }

    public static void setStepShapes(Visualization visualization){
        for (int i = 0; i < ShapeConstants.SIZE+1; i++) {
            Predicate predicate = (Predicate) ExpressionParser.parse("[type]==" + i);
            visualization.setValue(GUIDELINE_GRAPH+".nodes", predicate, VisualItem.SHAPE, ShapeConstants.SHAPE_TYPES[i]);
            visualization.setValue(GUIDELINE_GRAPH + ".nodes", predicate, VisualItem.FILLCOLOR, ShapeConstants.PREFUSE_STEP_COLORS[i]);
        }
    }

    public static ActionList getColorActions(){
        ActionList colorAction;

        ColorAction text = new ColorAction(GUIDELINE_GRAPH + ".nodes",
                VisualItem.TEXTCOLOR, ColorLib.gray(0));

        ColorAction edges = new ColorAction(GUIDELINE_GRAPH + ".edges",
                VisualItem.STROKECOLOR, ColorLib.gray(0));
        ColorAction edgesArrows = new ColorAction(GUIDELINE_GRAPH + ".edges",
                VisualItem.FILLCOLOR, ColorLib.gray(0));



        // create an action list containing all color assignments
        colorAction = new ActionList(Activity.INFINITY);

        colorAction.add(text);
        colorAction.add(edges);
        colorAction.add(edgesArrows);

        ColorAction fill2 = new ColorAction(STATIC_GRAPH + ".nodes",
                VisualItem.FILLCOLOR, ColorLib.rgb(200,200,255));
        ColorAction text2 = new ColorAction(STATIC_GRAPH + ".nodes",
                VisualItem.TEXTCOLOR, ColorLib.gray(0));

        colorAction.add(fill2);
        colorAction.add(text2);

        return colorAction;
    }


    private void insertStep(Guideline_Step aGuidelineStep, Node parentNode) {

        String lStepType = aGuidelineStep.getDirectType().getName();
        int index;

        if(lStepType.equals("Action_Step")) {
            Action_Step dummy = (Action_Step)mInstanceFactory.getStep(aGuidelineStep);
//            index = indexFinderInGuidelineStepArray(mGuidelineSteps,aGuidelineStep.getName());
//            Action_Step dummy = (Action_Step) mGuidelineSteps[index];
            insertActionStep(dummy, parentNode);

        }
        else if(lStepType.equals("Macro_Action_Step")) {

//            index = indexFinderInGuidelineStepArray(mGuidelineSteps,aGuidelineStep.getName());
//            Macro_Action_Step dummy = (Macro_Action_Step) mGuidelineSteps[index];
            Macro_Action_Step dummy = (Macro_Action_Step) mInstanceFactory.getStep(aGuidelineStep);

            insertMacroActionStep(dummy, parentNode);

        }
        else if(lStepType.equals("Patient_State_Step")) {

//            index = indexFinderInGuidelineStepArray(mGuidelineSteps,aGuidelineStep.getName());
//            Patient_State_Step dummy = (Patient_State_Step) mGuidelineSteps[index];
            Patient_State_Step dummy = (Patient_State_Step) mInstanceFactory.getStep(aGuidelineStep);

            insertPatientStateStep(dummy, parentNode);

        }
        else if(lStepType.equals("Synchronization_Step")) {

//            index = indexFinderInGuidelineStepArray(mGuidelineSteps,aGuidelineStep.getName());
//            Synchronization_Step dummy = (Synchronization_Step) mGuidelineSteps[index];
            Synchronization_Step dummy = (Synchronization_Step) mInstanceFactory.getStep(aGuidelineStep);

            insertSynchronizationStep(dummy, parentNode);

        }
        else if(lStepType.equals("Case_Step")) {

//            index = indexFinderInGuidelineStepArray(mGuidelineSteps,aGuidelineStep.getName());
//            Case_Step dummy = (Case_Step) mGuidelineSteps[index];
            Case_Step dummy = (Case_Step) mInstanceFactory.getStep(aGuidelineStep);

            insertCaseStep(dummy, parentNode);

        }
        else if(lStepType.equals("Utility_Choice_Step")) {

//            index = indexFinderInGuidelineStepArray(mGuidelineSteps,aGuidelineStep.getName());
//            Utility_Choice_Step dummy = (Utility_Choice_Step) mGuidelineSteps[index];
            Utility_Choice_Step dummy = (Utility_Choice_Step) mInstanceFactory.getStep(aGuidelineStep);

            insertUtilityChoiceStep(dummy, parentNode);

        }
        else if(lStepType.equals("Choice_Step")) {

//            index = indexFinderInGuidelineStepArray(mGuidelineSteps,aGuidelineStep.getName());
//            Choice_Step dummy = (Choice_Step) mGuidelineSteps[index];
            Choice_Step dummy = (Choice_Step) mInstanceFactory.getStep(aGuidelineStep);

            insertChoiceStep(dummy, parentNode);

        }
        else if(lStepType.equals("Macro_Decision_Step")) {

//            index = indexFinderInGuidelineStepArray(mGuidelineSteps,aGuidelineStep.getName());
//            Macro_Decision_Step dummy = (Macro_Decision_Step) mGuidelineSteps[index];
            Macro_Decision_Step dummy = (Macro_Decision_Step) mInstanceFactory.getStep(aGuidelineStep);

            insertMacroDecisionStep(dummy, parentNode);

        }
        else if(lStepType.equals("Branch_Step")) {

//            index = indexFinderInGuidelineStepArray(mGuidelineSteps,aGuidelineStep.getName());
//            Branch_Step dummy = (Branch_Step) mGuidelineSteps[index];
            Branch_Step dummy = (Branch_Step) mInstanceFactory.getStep(aGuidelineStep);

            insertBranchStep(dummy, parentNode);

        }

    }

    private void insertActionStep(Action_Step anActionStep, Node parentNode) {

        String lUniqueName = anActionStep.getName();

        if(!isCellDrawnBefore(lUniqueName)) {

            Node actionNode = insertCell(parentNode, anActionStep.getName2(),
                    lUniqueName, ShapeConstants.ACTION_STEP);

            Guideline_Step lGuidelineStep = anActionStep.getNext_step();
            if(lGuidelineStep != null) {
                insertStep(lGuidelineStep, actionNode);
            }
        }
        else {
            connectNodes(parentNode, lUniqueName);
        }
    }

    private void insertMacroActionStep(Macro_Action_Step aMacroActionStep, Node parentNode) {

        String lUniqueName = aMacroActionStep.getName();

        if(!isCellDrawnBefore(lUniqueName)) {

            Node macroActionNode = insertCell(parentNode, aMacroActionStep.getName2(),
                    lUniqueName, ShapeConstants.MACRO_ACTION_STEP);

            Guideline_Step lGuidelineStep = aMacroActionStep.getNext_step();
            if(lGuidelineStep != null) {
                insertStep(lGuidelineStep, macroActionNode);
            }
        }
        else {
            connectNodes(parentNode, lUniqueName);
        }
    }

    private void insertPatientStateStep(Patient_State_Step aPatientStateStep, Node parentNode) {

        String lUniqueName = aPatientStateStep.getName();

        if(!isCellDrawnBefore(lUniqueName)) {

            Node patientStateNode = insertCell(parentNode, aPatientStateStep.getDisplay_name(),
                    lUniqueName, ShapeConstants.PATIENT_STATE_STEP);

            Guideline_Step lGuidelineStep = aPatientStateStep.getNext_step();
            if(lGuidelineStep != null) {
                insertStep(lGuidelineStep, patientStateNode);
            }
        }
        else {
            connectNodes(parentNode, lUniqueName);
        }
    }

    private void insertSynchronizationStep(Synchronization_Step aSynchronizationStep, Node parentNode) {

        String lUniqueName = aSynchronizationStep.getName();

        if(!isCellDrawnBefore(lUniqueName)) {

            Node synchronicationNode = insertCell(parentNode, aSynchronizationStep.getName2(),
                    lUniqueName, ShapeConstants.SYNCHRONIZATION_STEP);

            Guideline_Step lGuidelineStep = aSynchronizationStep.getNext_step();
            if(lGuidelineStep != null) {
                insertStep(lGuidelineStep, synchronicationNode);
            }
        }
        else {
            connectNodes(parentNode, lUniqueName);
        }
    }

    private void insertCaseStep(Case_Step aCaseStep, Node parentNode) {

        String lUniqueName = aCaseStep.getName();

        if(!isCellDrawnBefore(lUniqueName)) {

            Node caseNode = insertCell(parentNode, aCaseStep.getName2(),
                    lUniqueName, ShapeConstants.CASE_STEP);

            Object[] lDecisionOptions = mInstanceFactory.getDecisionOptions(aCaseStep).toArray();

            for (Object lDecisionOption1 : lDecisionOptions) {
                insertChoices(((Decision_Option) lDecisionOption1), caseNode);
            }

            if(aCaseStep.getDefault_next_step() != null){
                Node defaultStep = insertDefaultStepCell(caseNode);
                insertStep(aCaseStep.getDefault_next_step(), defaultStep);
//                Logger.getLogger(this.getClass()).log(Level.DEBUG, ("-------- " + aCaseStep + ":::::::::::------- " + );
            }
        }
        else {
            connectNodes(parentNode, lUniqueName);
        }
    }

    private Node insertDefaultStepCell(Node parentNode){
        return insertCell(parentNode, "Default Step",
                            String.valueOf(idForDefaultStep++), ShapeConstants.DEFAULT_STEP);
    }

    private void insertChoiceStep(Choice_Step aChoiceStep, Node parentNode) {

        String lUniqueName = aChoiceStep.getName();

        if(!isCellDrawnBefore(lUniqueName)) {
            Node choiceStep = insertCell(parentNode, aChoiceStep.getName2(),
                    lUniqueName, ShapeConstants.CHOICE_STEP);

            Object[] lDecisionOptions = mInstanceFactory.getDecisionOptions(aChoiceStep).toArray();

            for (Object lDecisionOption1 : lDecisionOptions) {
                insertChoices(((Decision_Option) lDecisionOption1), choiceStep);
            }
        }
        else {
            connectNodes(parentNode, lUniqueName);
        }
    }

    // yet, this method is exactly same as insertChoiceStep method.
    private void insertUtilityChoiceStep(Utility_Choice_Step aUtilityChoiceStep, Node parentNode) {

        String lUniqueName = aUtilityChoiceStep.getName();

        if(!isCellDrawnBefore(lUniqueName)) {

            Node utilityChoiceNode = insertCell(parentNode, aUtilityChoiceStep.getName2(),
                    lUniqueName, ShapeConstants.UTILITY_CHOICE_STEP);

            Object[] lDecisionOptions = mInstanceFactory.getDecisionOptions(aUtilityChoiceStep).toArray();

            for (Object lDecisionOption1 : lDecisionOptions) {
                // no need to define another insertUtilityChoices Function yet
                // if a need arises, it will be defined.
                insertChoices(((Decision_Option) lDecisionOption1), utilityChoiceNode);
            }
        }
        else {
            connectNodes(parentNode, lUniqueName);
        }
    }

    // yet, this method is exactly same as insertChoiceStep method
    private void insertMacroDecisionStep(Macro_Decision_Step aMacroDecisionStep, Node parentNode) {
        String lUniqueName = aMacroDecisionStep.getName();

        if(!isCellDrawnBefore(lUniqueName)) {

            Node macroDecisionNode = insertCell(parentNode, aMacroDecisionStep.getName2(),
                    lUniqueName, ShapeConstants.MACRO_DECISION_STEP);

            Object[] lDecisionOptions = mInstanceFactory.getDecisionOptions(aMacroDecisionStep).toArray();

            for (Object lDecisionOption1 : lDecisionOptions) {
                insertChoices(((Decision_Option) lDecisionOption1), macroDecisionNode);
            }
        }
        else {
            connectNodes(parentNode, lUniqueName);
        }
    }

    private void insertBranchStep(Branch_Step aBranchStep, Node parentNode) {

        String lUniqueName = aBranchStep.getName();

        if(!isCellDrawnBefore(lUniqueName)) {

            Node branchNode = insertCell(parentNode, aBranchStep.getName2(),
                    lUniqueName, ShapeConstants.BRANCH_STEP);


            Object[] lBranches = mInstanceFactory.getBranches(aBranchStep).toArray();

            for (Object lBranche1 : lBranches) {
                insertStep(((Guideline_Step) lBranche1), branchNode);
            }
        }
        else {
            connectNodes(parentNode, lUniqueName);
        }
    }



    private int indexFinderInGuidelineStepArray(Object[] anArray, String aName) {

        int index;
        for(index=0; index < anArray.length; index++) {
            String lStepName = ((Guideline_Step)anArray[index]).getName();
            if(lStepName != null && lStepName.equals(aName)) {

                break;
            }
        }

        if(index != anArray.length)
            return index;
        else
            return -1;
    }

    protected boolean isCellDrawnBefore(String aUniqueName) {
        return mAllCells.containsKey(aUniqueName);
    }

    protected Node getNodeByName(String aUniqueName) {
        return mAllCells.get(aUniqueName);
    }

    private Node insertNodeIntoGuidelineGraph(String displayText, String anUniqueName, int status, int type, boolean raised){
        Node node = guidelineGraph.addNode();
        node.setString(LABEL, displayText);
        node.setString(ID, anUniqueName);
        node.setString(TOOLTIP, "Not activated yet");
//        node.setInt(STATUS, status);
        node.setInt(TYPE, type);
        node.setBoolean(RAISED, raised);

        mAllCells.put(anUniqueName, node);
        return node;
    }

    private Node insertNodeIntoStaticGraph(String displayText, String anUniqueName, boolean raised, int x, int y){
        Node node = staticGraph.addNode();
        node.setString(LABEL, displayText);
        node.setString(ID, anUniqueName);
        node.setBoolean(RAISED, raised);
        node.setInt(X_POS, x);
        node.setInt(Y_POS, y);
        return node;
    }

    private Node insertImageNode(Graph graph, String path, double x, double y){
        Node node = graph.addNode();
        node.setString(IMAGE, path);
        if(graph!=guidelineGraph){      //if it is guidelineGraph, it will be ordered by layout, no need for x and y position
            node.setDouble(X_POS, x);
            node.setDouble(Y_POS, y);
        }
        return node;
    }

    private void connectNodes(Node parentNode, String lUniqueName){
        if(parentNode != null){
            Node node = this.getNodeByName(lUniqueName);
            guidelineGraph.addEdge(parentNode, node);
        }
    }

    public void itemBoundsChanged(Display display) {
        Rectangle2D totalBounds = display.getItemBounds();
        Dimension dimension = display.getSize();

        display.panToAbs(new Point2D.Double(
                totalBounds.getX()+dimension.getWidth()/2-20,
                totalBounds.getY()+dimension.getHeight()/2-20));
        if(firstTime){
//            updateScroller();
            firstTime = false;
        }
    }
           /*
    public void updateScroller() {
        Rectangle2D totalBounds = this.getItemBounds();
        Dimension size = new Dimension((int)totalBounds.getWidth()+30, (int)totalBounds.getHeight()+50);
        guidelineMonitoringPanel.setTotalSize(size);
    }                     */
}

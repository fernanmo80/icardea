package tr.com.srdc.icardea.careplanengine.agents.gui.graph;

import tr.com.srdc.icardea.careplanengine.glmodel.Action_Step;
import tr.com.srdc.icardea.careplanengine.glmodel.Algorithm;
import tr.com.srdc.icardea.careplanengine.glmodel.Branch_Step;
import tr.com.srdc.icardea.careplanengine.glmodel.Case_Step;
import tr.com.srdc.icardea.careplanengine.glmodel.Choice_Step;
import tr.com.srdc.icardea.careplanengine.glmodel.Criterion;
import tr.com.srdc.icardea.careplanengine.glmodel.Decision_Option;
import tr.com.srdc.icardea.careplanengine.glmodel.Guideline;
import tr.com.srdc.icardea.careplanengine.glmodel.Guideline_Expression;
import tr.com.srdc.icardea.careplanengine.glmodel.Guideline_Step;
import tr.com.srdc.icardea.careplanengine.glmodel.InstanceFactory;
import tr.com.srdc.icardea.careplanengine.glmodel.Macro_Action_Step;
import tr.com.srdc.icardea.careplanengine.glmodel.Macro_Decision_Step;
import tr.com.srdc.icardea.careplanengine.glmodel.Patient_State_Step;
import tr.com.srdc.icardea.careplanengine.glmodel.Synchronization_Step;
import tr.com.srdc.icardea.careplanengine.glmodel.Utility_Choice_Step;
import tr.com.srdc.icardea.careplanengine.glmodel.Decision_Condition;
import tr.com.srdc.icardea.careplanengine.glmodel.Action_Specification;
import tr.com.srdc.icardea.careplanengine.glmodel.Subguideline_Action;
import tr.com.srdc.icardea.careplanengine.glmodel.Nestable;
import tr.com.srdc.icardea.careplanengine.glmodel.impl.DefaultGuideline;
import tr.com.srdc.icardea.careplanengine.agents.gui.graph.history.MonitoringReport;
import tr.com.srdc.icardea.careplanengine.agents.gui.graph.history.StyledText;
import tr.com.srdc.icardea.careplanengine.agents.gui.graph.history.GuidelineHistoryFrame;
import tr.com.srdc.icardea.careplanengine.agents.gui.MonitoringGUI;
import tr.com.srdc.icardea.careplanengine.agents.gui.PatientPanel;
import tr.com.srdc.icardea.careplanengine.agents.guidelineAgent.FactoryRetriever;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import java.awt.*;
import java.awt.geom.Point2D;
import java.util.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;

import prefuse.Display;
import prefuse.Visualization;
import prefuse.Constants;
import prefuse.activity.Activity;
import prefuse.util.ColorLib;
import prefuse.action.assignment.ColorAction;
import prefuse.action.ActionList;
import prefuse.action.RepaintAction;
import prefuse.action.layout.graph.NodeLinkTreeLayout;
import prefuse.action.layout.SpecifiedLayout;
import prefuse.render.LabelRenderer;
import prefuse.render.DefaultRendererFactory;
import prefuse.render.EdgeRenderer;
import prefuse.render.Renderer;
import prefuse.render.PolygonRenderer;
import prefuse.visual.VisualItem;
import prefuse.visual.AggregateTable;
import prefuse.visual.AggregateItem;
import prefuse.visual.VisualGraph;
import prefuse.data.Graph;
import prefuse.data.Node;
import prefuse.data.expression.Predicate;
import prefuse.data.expression.parser.ExpressionParser;
import prefuse.controls.ZoomControl;
import prefuse.controls.PanControl;

import javax.swing.*;


@SuppressWarnings("serial")
public class GuidelineGraph extends Display /*implements ItemBoundsListener */{

    private int mNumberOfEligibilityCriteria = 0;

    public static final String FULL_GUIDELINE_HISTORY = "FULL_GUIDELINE_HISTORY";

    // type of mAllCells was changed from Vector to Hashtable (mehmet olduz)
    private Hashtable<String, Node> mAllCells = new Hashtable<String, Node>();
    private Hashtable<String, AggregateItem> idToAggregate = new Hashtable<String, AggregateItem>();
    private Hashtable<String, Vector<StyledText>> idToHistory = new Hashtable<String, Vector<StyledText>>();

    private Vector<Node> mEligibilities = new Vector<Node>();

    private InstanceFactory mInstanceFactory = null;
    private GuidelineMonitoringPanel guidelineMonitoringPanel = null;
    private boolean firstTime;

    private VisualGraph visualGuidelineGraph=null;

    private Graph guidelineGraph;
    private Graph staticGraph;
    private AggregateTable aggregateTable;
    /** Label data field included in generated Graphs */
    public static final String LABEL = "label";
    public static final String IMAGE = "image";
    public static final String STATUS = "status";
    public static final String ID = "id";
    public static final String RAISED = "raised";
    public static final String TYPE = "type";
//    public static final String GUIDELINE_OBJECT = "GuidelineObject";
    public static final String X_POS = "x_position";
    public static final String Y_POS = "y_position";
    public static final String WIDTH = "width";
    public static final String TOOLTIP = "tooltip";

    public static final String SUBGUIDELINE = "subguideline";
    public static final String SUBGUIDELINE_URI = "subguideline_uri";

    public static final String GUIDELINE_GRAPH = "g_graph";
    public static final String STATIC_GRAPH = "s_graph";
    public static final String AGGREGATE = "aggregate"; //the group for displaying status of a step

    private boolean isExecutingGraph;

    public static final String DEFAULT_STEP_POSTFIX = " Default Step";
    
    /* Gunes ALUC, SRDC, 14 June 2007 *******************/
	/*  extension to enable every Guideline Graph *******/
	/*  to have its own GuidelineHistoryFrame. **********/
    /*  Before, it was a singleton. *********************/
    private GuidelineHistoryFrame guidelineHistoryFrame;    
    /* END-OF-EXTENSION *********************************/
    
    /* Gunes ALUC, SRDC, 20 July 2007
     */        
    private MonitoringReport monitoringReport; 
    /*
     * END-OF-EXTENSION
     */


    public GuidelineGraph(GuidelineMonitoringPanel monitoringPanel, boolean isExecutingGraph) {
        super(new Visualization());

        this.isExecutingGraph = isExecutingGraph;
        firstTime = true;

        String guidelineUri = monitoringPanel.getURI();

        configureGraph();
        guidelineMonitoringPanel = monitoringPanel;
        mInstanceFactory = InstanceFactory.getInstance(guidelineUri);
        Logger.getLogger(this.getClass()).log(Level.DEBUG, ("::::" + guidelineUri));
        createGraphFromGuideline(monitoringPanel.getDefaultGuideline());

        visualizeData();
        
        /* Gunes ALUC, SRDC, 14 June 2007 *******************/
    	/*  extension to enable every Guideline Graph *******/
    	/*  to have its own GuidelineHistoryFrame. **********/
        /*  Before, it was a singleton. *********************/
        guidelineHistoryFrame = new GuidelineHistoryFrame();
        guidelineHistoryFrame.setGuidelineGraph(this);
        if(guidelineMonitoringPanel.getPatientPanel() != null){
            PatientPanel patientPanel = guidelineMonitoringPanel.getPatientPanel();
            guidelineHistoryFrame.setGuidelineName(
        		patientPanel.getGuideline().getName2());

            String guidelineName = patientPanel.getGuideline().getName2();
            String patientId = "" + patientPanel.getAssignmentEntity().getPatientEntity().getPcode();
            String patientName = "" + patientPanel.getAssignmentEntity().getPatientEntity().getName();
            monitoringReport = new MonitoringReport( guidelineName, patientId, patientName );
        }
        /*
        * END-OF-EXTENSION
        */

    }

    public void configureGraph(){
        guidelineGraph = new Graph(true);
        guidelineGraph.addColumn(LABEL, String.class);
        guidelineGraph.addColumn(STATUS, int.class);
        guidelineGraph.addColumn(ID, String.class);
        guidelineGraph.addColumn(RAISED, boolean.class);
        guidelineGraph.addColumn(TYPE, int.class);
        guidelineGraph.addColumn(WIDTH, double.class);
        guidelineGraph.addColumn(TOOLTIP, String.class);
        guidelineGraph.addColumn(SUBGUIDELINE, DefaultGuideline.class);
        guidelineGraph.addColumn(SUBGUIDELINE_URI, String.class);
        guidelineGraph.addColumn(X_POS, double.class);
        guidelineGraph.addColumn(Y_POS, double.class);

        staticGraph = new Graph(false);
        staticGraph.addColumn(LABEL, String.class);
        staticGraph.addColumn(IMAGE, String.class);
        staticGraph.addColumn(ID, String.class);
        staticGraph.addColumn(RAISED, boolean.class);
        staticGraph.addColumn(X_POS, double.class);
        staticGraph.addColumn(Y_POS, double.class);

        aggregateTable = m_vis.addAggregates(AGGREGATE);
        aggregateTable.addColumn(VisualItem.POLYGON, float[].class);
        aggregateTable.addColumn(STATUS, int.class);
        aggregateTable.addColumn(ID, String.class);
        aggregateTable.addColumn(TOOLTIP, String.class);
        aggregateTable.addColumn(TYPE, int.class);
        aggregateTable.addColumn(SUBGUIDELINE, DefaultGuideline.class);
        aggregateTable.addColumn(SUBGUIDELINE_URI, String.class);


        this.createToolTip();

        this.addControlListener(new PanControl());  // pan with background left-drag
        this.addControlListener(new AggregateDragControl(this));
        this.addControlListener(new ZoomControl()); // zoom with vertical right-drag

        MonitoringGUI monitoringGUI = MonitoringGUI.getInstance();
        this.addControlListener(new PopupControl(this, monitoringGUI)); // popup control

    }


    private Node insertCell(Node previousNode, String displayText, String anUniqueName, int type) {
        int lStatus = 0;

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
        if(aGuideline == null){
        	System.out.println("AGuideline is NULL");
        }else{
        	System.out.println(aGuideline.getName2());
        }
        insertNodeIntoStaticGraph("   "+ aGuideline.getName2() + "   ", lUniqueName, true, 20, 10);
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
        Guideline_Step lGuidelineStep = lAlgorithm.getFirst_step();

        insertStep(lGuidelineStep, null);
    }


    private void visualizeData(){

        DefaultRendererFactory defaultRendererFactory = new DefaultRendererFactory();
        LabelRenderer tr = new LabelRenderer(LABEL, IMAGE);
        tr.setRoundedCorner(8, 8);

        defaultRendererFactory.setDefaultRenderer(tr);

        Renderer polyR = new PolygonRenderer(Constants.POLY_TYPE_CURVE);
        ((PolygonRenderer)polyR).setCurveSlack(0.15f);
        defaultRendererFactory.add("ingroup('" + AGGREGATE + "')", polyR);

        addStepRenderers(defaultRendererFactory);
        defaultRendererFactory.setDefaultEdgeRenderer(new EdgeRenderer(Constants.EDGE_TYPE_LINE, Constants.EDGE_ARROW_FORWARD));

        m_vis.setRendererFactory(defaultRendererFactory);

        // add visual data groups
        visualGuidelineGraph = m_vis.addGraph(GUIDELINE_GRAPH, guidelineGraph);
        addStatusVisualization(visualGuidelineGraph);
        m_vis.addGraph(STATIC_GRAPH, staticGraph);

        setStepShapes(m_vis);

        ActionList colors = getColorActions(true);   //get Color actions with status visualization
        colors.add(new AggregateLayout(AGGREGATE));

        ActionList layout = new ActionList(1);

        if(hasGraphLayoutFile()){
            layout.add(new SpecifiedLayout(GUIDELINE_GRAPH, X_POS, Y_POS));
        }else{
            NodeLinkTreeLayout nodeLinkTreeLayout = new NodeLinkTreeLayout(GUIDELINE_GRAPH, Constants.ORIENT_TOP_BOTTOM, 50, 155, 150);
            nodeLinkTreeLayout.setLayoutAnchor(new Point2D.Double(250, 70));
            layout.add(nodeLinkTreeLayout);
        }
        layout.add(new SpecifiedLayout(STATIC_GRAPH, X_POS, Y_POS));
        layout.add(new RepaintAction());

        // add the action to the visualization
        m_vis.putAction("layout", layout);
        m_vis.putAction("color", colors);

        m_vis.run("layout"); //apply the layouts
        m_vis.run("color");

    }

    private void addStatusVisualization(VisualGraph visualGraph) {
        Iterator nodes = visualGraph.nodes();
        AggregateItem aitem ;
        VisualItem node;
        String id;
        while (nodes.hasNext()) {
            aitem = (AggregateItem)aggregateTable.addItem();
            node = (VisualItem) nodes.next();
            aitem.addItem(node);
            aitem.setInt(STATUS, node.getInt(STATUS));
            aitem.setInt(TYPE, node.getInt(TYPE));
            aitem.set(SUBGUIDELINE, node.get(SUBGUIDELINE));
            aitem.set(SUBGUIDELINE_URI, node.get(SUBGUIDELINE_URI));
            id = node.getString(ID);
            aitem.setString(TOOLTIP, "<html><b>"+id + "</b></html>");
            node.setString(TOOLTIP, "<html><b>"+id + "</b></html>");
            aitem.setString(ID, id);
            idToAggregate.put(id, aitem);       // store the aggregate item so that we can reach to it and change its status field
        }
    }

    public static void addStepRenderers(DefaultRendererFactory rendererFactory){

        rendererFactory.add("ingroup('"+ GUIDELINE_GRAPH+".nodes') AND (["+TYPE+"] =="
                                                            + ShapeConstants.SUBGUIDELINE  +")" ,
                new GuidelineShapeRenderer(60));

        rendererFactory.add("ingroup('"+ GUIDELINE_GRAPH+".nodes') AND " +
                "(["+TYPE+"] <" + ShapeConstants.SIZE  + ") ",
                new GuidelineShapeRenderer(40));
    }

    public static void setStepShapes(Visualization visualization){
        for (int i = 0; i < ShapeConstants.SIZE+1; i++) {
            Predicate predicate = (Predicate)ExpressionParser.parse("[" + TYPE + "]==" + i);
            visualization.setValue(GUIDELINE_GRAPH+".nodes", predicate, VisualItem.SHAPE, ShapeConstants.SHAPE_TYPES[i]);
            visualization.setValue(GUIDELINE_GRAPH + ".nodes", predicate, VisualItem.FILLCOLOR, ShapeConstants.PREFUSE_STEP_COLORS[i]);
        }
    }

    public static ActionList getColorActions(){
        return getColorActions(false);
    }

    public static ActionList getColorActions(boolean isWithAggregate) {

        ColorAction text = new ColorAction(GUIDELINE_GRAPH + ".nodes",
                VisualItem.TEXTCOLOR, ColorLib.gray(0));

        ColorAction edges = new ColorAction(GUIDELINE_GRAPH + ".edges",
                VisualItem.STROKECOLOR, ColorLib.gray(0));
        ColorAction edgesArrows = new ColorAction(GUIDELINE_GRAPH + ".edges",
                VisualItem.FILLCOLOR, ColorLib.gray(0));



        // create an action list containing all color assignments
        ActionList color;
        if(isWithAggregate){
            color = new ActionList(Activity.INFINITY);
            color.add(new RepaintAction());
        }else{
            color = new ActionList();
        }
        color.add(text);
        color.add(edges);
        color.add(edgesArrows);

        ColorAction fill2 = new ColorAction(STATIC_GRAPH + ".nodes",
                VisualItem.FILLCOLOR, ColorLib.rgb(200,200,255));
        ColorAction text2 = new ColorAction(STATIC_GRAPH + ".nodes",
                VisualItem.TEXTCOLOR, ColorLib.gray(0));

        color.add(fill2);
        color.add(text2);

        if( isWithAggregate ){
            ColorAction aStroke = new ColorAction(AGGREGATE, VisualItem.STROKECOLOR);
            aStroke.setDefaultColor(ColorLib.gray(200));
            aStroke.add("_hover", ColorLib.rgb(255,100,100));

            int[] palette = new int[] {
                    ColorLib.gray(220, 200),
                    ColorLib.rgba(255, 150, 155, 200),
                    ColorLib.rgba(150, 150, 255, 200),
                    ColorLib.rgba(200, 200, 255, 150)
            };

            for (int i = 0; i < palette.length; i++) {
                Predicate predicate = (Predicate)ExpressionParser.parse("[" + STATUS + "]==" + i);
                ColorAction fillAggregate = new ColorAction(AGGREGATE, predicate, VisualItem.FILLCOLOR, palette[i]);
                color.add(fillAggregate);
            }


            color.add(aStroke);
        }

        return color;
    }

    private void insertStep(Guideline_Step aGuidelineStep, Node parentNode) {

        String lStepType = aGuidelineStep.getDirectType().getName();

        if(lStepType.equals("Action_Step")) {

            Action_Step dummy = (Action_Step)mInstanceFactory.getStep(aGuidelineStep);
            insertActionStep(dummy, parentNode);

        }
        else if(lStepType.equals("Macro_Action_Step")) {

            Macro_Action_Step dummy = (Macro_Action_Step) mInstanceFactory.getStep(aGuidelineStep);
            insertMacroActionStep(dummy, parentNode);

        }
        else if(lStepType.equals("Patient_State_Step")) {

            Patient_State_Step dummy = (Patient_State_Step) mInstanceFactory.getStep(aGuidelineStep);
            insertPatientStateStep(dummy, parentNode);

        }
        else if(lStepType.equals("Synchronization_Step")) {

            Synchronization_Step dummy = (Synchronization_Step) mInstanceFactory.getStep(aGuidelineStep);
            insertSynchronizationStep(dummy, parentNode);

        }
        else if(lStepType.equals("Case_Step")) {

            Case_Step dummy = (Case_Step) mInstanceFactory.getStep(aGuidelineStep);
            insertCaseStep(dummy, parentNode);

        }
        else if(lStepType.equals("Utility_Choice_Step")) {

            Utility_Choice_Step dummy = (Utility_Choice_Step) mInstanceFactory.getStep(aGuidelineStep);
            insertUtilityChoiceStep(dummy, parentNode);

        }
        else if(lStepType.equals("Choice_Step")) {

            Choice_Step dummy = (Choice_Step) mInstanceFactory.getStep(aGuidelineStep);
            insertChoiceStep(dummy, parentNode);

        }
        else if(lStepType.equals("Macro_Decision_Step")) {

            Macro_Decision_Step dummy = (Macro_Decision_Step) mInstanceFactory.getStep(aGuidelineStep);
            insertMacroDecisionStep(dummy, parentNode);

        }
        else if(lStepType.equals("Branch_Step")) {

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
            else{ //Action Specification might include a subguideline
                Vector tasksList=  FactoryRetriever.retrieveTasks( guidelineMonitoringPanel.getURI(), anActionStep);
                int listSize = tasksList.size();
                for(int i=0;i<listSize;++i) {
                    Action_Specification currentActSpec = (Action_Specification) tasksList.get(i);
                    if(currentActSpec instanceof Subguideline_Action) {
                        insertSubGuidelineRepresentation((Subguideline_Action)currentActSpec, actionNode);
                    }
                }
            }
        }
        else {
            connectNodes(parentNode, lUniqueName);
        }
    }

    private void insertSubGuidelineRepresentation(Subguideline_Action subguideline_action, Node parentNode) {
        Nestable nestable = subguideline_action.getAction_detail();
        String subguidelineUrl = null;
        if(nestable != null){
            subguidelineUrl = guidelineMonitoringPanel.getURI();
            nestable = FactoryRetriever.retrieveNestable(guidelineMonitoringPanel.getURI(), nestable);
        }else{
            subguidelineUrl = subguideline_action.getDescription();
            nestable = FactoryRetriever.getGuideline(subguidelineUrl, subguideline_action.getName2());
        }

        String uniqueName = nestable.getName();
//        Logger.getLogger(this.getClass()).log(Level.DEBUG, (":::::::: nestable.getName()=" + nestable.getName() + " subguideline_action.getName2()="+subguideline_action.getName2() );

        if(!isCellDrawnBefore(uniqueName)) {
            Node subguidelineNode = insertCell(parentNode, subguideline_action.getName2(),
                    uniqueName, ShapeConstants.SUBGUIDELINE);
            subguidelineNode.set(SUBGUIDELINE, nestable);
            subguidelineNode.setString(SUBGUIDELINE_URI, subguideline_action.getDescription());
        }
        else {
            connectNodes(parentNode, uniqueName);
        }

        
		/* Gunes ALUC, SRDC, 19 June 2007 *******************/
		/*  extension to enable this panel to see other *****/
		/*  panels generated through sub-guideline **********/
	    /*  initiation **************************************/
        if(guidelineMonitoringPanel.getPatientPanel()!= null){
            boolean history=guidelineMonitoringPanel.getPatientPanel().isHistory();
            String sessionID=guidelineMonitoringPanel.getPatientPanel().getSessionID();
            ShowSubguidelineEvent event = new ShowSubguidelineEvent(
                    guidelineMonitoringPanel.getPatientPanel().getAssignmentEntity(),
                    guidelineMonitoringPanel.getDefaultGuideline(),
                    (DefaultGuideline)nestable, subguidelineUrl,
                    guidelineMonitoringPanel.getPatientPanel());
            MonitoringGUI monitoringGUI = MonitoringGUI.getInstance();
            monitoringGUI.prepareSubguideline(event,sessionID,history);
        }
        /* END-OF-EXTENSION *********************************/


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
                Node defaultStep = insertDefaultStepCell(caseNode, lUniqueName);
                insertStep(aCaseStep.getDefault_next_step(), defaultStep);
//                Logger.getLogger(this.getClass()).log(Level.DEBUG, ("-------- " + aCaseStep + ":::::::::::------- " + );
            }
        }
        else {
            connectNodes(parentNode, lUniqueName);
        }
    }

    private Node insertDefaultStepCell(Node parentNode, String parentID){
        return insertCell(parentNode, "Default Step",
                            parentID + DEFAULT_STEP_POSTFIX, ShapeConstants.DEFAULT_STEP);
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

    protected boolean isCellDrawnBefore(String aUniqueName) {
        return mAllCells.containsKey(aUniqueName);
    }

    protected Node getNodeByName(String aUniqueName) {
        return mAllCells.get(aUniqueName);
    }

    public GuidelineMonitoringPanel getGuidelineMonitoringPanel() {
        return guidelineMonitoringPanel;
    }

    private Node insertNodeIntoGuidelineGraph(String displayText, String anUniqueName, int status, int type, boolean raised){
        Node node = guidelineGraph.addNode();
        node.setString(LABEL, displayText);
        node.setString(ID, anUniqueName);
        node.setInt(STATUS, status);
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

    public void changeStatusOfStep(String uniqueStepName, int newStatus){
        if(uniqueStepName==null){
            Logger.getLogger(this.getClass()).log(Level.DEBUG, ("NULL received as unique step name"));
            return;
        }
        AggregateItem aggregateItem = idToAggregate.get(uniqueStepName);
        if(aggregateItem!=null){
            Logger.getLogger(this.getClass()).log(Level.DEBUG, (":::::::::::::::"+ uniqueStepName + "=" +aggregateItem.getInt(STATUS)+ "->" +newStatus));
            aggregateItem.setInt(STATUS, newStatus);
        }
    }

    public int getStatusOfStep(String uniqueStepName){
        if(uniqueStepName==null){
            Logger.getLogger(this.getClass()).log(Level.DEBUG, ("NULL received as unique step name"));
            return -1;
        }
        AggregateItem aggregateItem = idToAggregate.get(uniqueStepName);
        if(aggregateItem!=null){
            return aggregateItem.getInt(STATUS);
        }
        return -1;
    }

    public String getDisplayNameOfStep(String guidelineStep) {
    	System.out.println("GUIDELINESTEP:" + guidelineStep);
        Node node = mAllCells.get(guidelineStep);
        return node.getString(LABEL);
    }

    public void guidelineActionCompleted(String guidelineStep, String actionName) {
        if(guidelineStep==null){
            Logger.getLogger(this.getClass()).log(Level.DEBUG, ("NULL received as unique step name"));
            return;
        }
        String newToolTip = "";

        AggregateItem aggregateItem = idToAggregate.get(guidelineStep);
        Node node = mAllCells.get(guidelineStep);
        if(aggregateItem!=null){
            String oldToolTip = aggregateItem.getString(TOOLTIP);
            newToolTip = addStringToNewLine(oldToolTip, actionName+" Action completed.");
            aggregateItem.setString(TOOLTIP,  newToolTip);
            node.setString(TOOLTIP, newToolTip);
        }
    }

    private String addStringToNewLine(String oldToolTip, String currentDisplayName) {
        int index = oldToolTip.indexOf("</html>");
        if(index==-1){
            Logger.getLogger(this.getClass()).log(Level.DEBUG, ("tool tip is not enclosed with <html> tag!!!!"));
            return oldToolTip;
        }
        return oldToolTip.substring(0, index) + "<br>" + currentDisplayName + "</html>";
    }

    public void putHistory(String guidelineStep, Hashtable<String, String> historyData, int historyType, long time){
    	StyledText styledText = new StyledText(historyData, historyType, time);
        putHistory(guidelineStep, styledText);
        putHistory(FULL_GUIDELINE_HISTORY, styledText);
        // GuidelineHistoryFrame.getInstance().appendLiveHistory(guidelineStep, styledText);
        this.guidelineHistoryFrame.appendLiveHistory(guidelineStep, styledText);

        try {
            Node associatedNode = this.getAssociatedNode(guidelineStep);
            monitoringReport.insertHistoryEvent(associatedNode, styledText);
        } catch (Exception e) {
            //e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }


    private void putHistory(String guidelineStep, StyledText styledText) {
        Vector<StyledText> previousHistory = idToHistory.get(guidelineStep);
        if(previousHistory == null)
            previousHistory = new Vector<StyledText>();
        previousHistory.add(styledText);
        idToHistory.put(guidelineStep, previousHistory);
    }
    
    // recursively traverses all (sub) guidelines
    // to find the Node associated with the 'guidelineStep'
    public Node getAssociatedNode (String guidelineStep)
    {
        Node associatedNode = (Node) mAllCells.get(guidelineStep);

        // it is probable that this message was received from
        // the sub-guideline, therefore try finding the node
        // there
        if (associatedNode == null)
        {
            PatientPanel owner = guidelineMonitoringPanel.getPatientPanel();
            PatientPanel incubatedPatientPanel
        		= owner.getIncubatedPatientPanel();
        	if (incubatedPatientPanel != null && incubatedPatientPanel != owner)
        	{
        		associatedNode = 
        			incubatedPatientPanel.getGuidelineMonitoringPanel().getGuidelineGraph().getAssociatedNode(guidelineStep);        		
        	}
        }
        
        return associatedNode;    	
    }


    public Vector<StyledText> getFullHistory() {
        return getHistoryOf( FULL_GUIDELINE_HISTORY );
    }


    public Vector<StyledText> getHistoryOf(String guidelineStepName) {
        return idToHistory.get(guidelineStepName);
    }

    public void saveGraphLayout(){
        Iterator nodes = visualGuidelineGraph.nodes();
        VisualItem node;
        Properties properties = new Properties();
        while (nodes.hasNext()) {
            node = (VisualItem) nodes.next();
            properties.setProperty(node.getString(ID), node.getX() + ":" + node.getY());
        }

        JFileChooser jfc = new JFileChooser();
        jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        final int result = jfc.showSaveDialog(this);
        if (JFileChooser.APPROVE_OPTION != result) {
            return;
        }
        final File directory = jfc.getSelectedFile();
        Logger.getLogger(this.getClass()).log(Level.DEBUG, (directory.getAbsolutePath()));
        try {
            String uri = guidelineMonitoringPanel.getURI();
            String guidelineFileName = uri.substring(uri.lastIndexOf("/")+1, uri.lastIndexOf("."));
            String propertyFile = directory.getAbsolutePath()+
                    File.separatorChar + guidelineFileName + ".lyt";
            FileOutputStream fos = new FileOutputStream(propertyFile);
            properties.store(fos, "saved guideline layout");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void clearPreviousVisualData() {
        Enumeration<AggregateItem> aggregates = idToAggregate.elements();
        while (aggregates.hasMoreElements()) {
            AggregateItem aggregateItem = aggregates.nextElement();
            aggregateItem.setInt(STATUS, 0);
            aggregateItem.setString(TOOLTIP, "<html></html>");
            Node node = mAllCells.get(aggregateItem.getString(ID));
            node.setString(TOOLTIP, "<html></html>");
        }
        monitoringReport = new MonitoringReport(
                monitoringReport.getGuidelineName(),
                monitoringReport.getPatientID(),
                monitoringReport.getPatientName());
    }


    private boolean hasGraphLayoutFile() {
        try {
            String guidelineUri = guidelineMonitoringPanel.getURI();
            String possibleLayout = guidelineUri.substring(0, guidelineUri.lastIndexOf('.')) + ".lyt";
            URL url = new URL(possibleLayout);

            Properties properties = new Properties();
            properties.load(url.openStream());

            Iterator nodes = visualGuidelineGraph.nodes();
            VisualItem node;
            while (nodes.hasNext()) {
                node = (VisualItem) nodes.next();
                String coorPair = properties.getProperty(node.getString(ID));
                if(coorPair != null){
                    String coordinate[] = coorPair.split(":");
                    double x = Double.parseDouble(coordinate[0]);
                    double y = Double.parseDouble(coordinate[1]);
                    node.setDouble(X_POS, x);
                    node.setDouble(Y_POS, y);
                }
            }

            return true;
        } catch (IOException e) {
            //nothing to be done if layout does not exists
        }

        return false;

    }

    /* Gunes ALUC, SRDC, 14 June 2007 *******************/
	/*  extension to enable every Guideline Graph *******/
	/*  to have its own GuidelineHistoryFrame. **********/
    /*  Before, it was a singleton. *********************/
    public GuidelineHistoryFrame getGuidelineHistoryFrame()
    {
    	return this.guidelineHistoryFrame;
    }
    /* END-OF-EXTENSION *********************************/
    
    /* Gunes ALUC, SRDC, 20 July 2007
     */        
    public MonitoringReport getMonitoringReport()
    {
    	return this.monitoringReport;
    }
    /*
     * END-OF-EXTENSION
     */

    public void generateSummaryReport() {
        monitoringReport.saveReportSilently();
    }
}

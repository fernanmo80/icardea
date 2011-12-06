/*
 * GuidelineActionTracer.java
 *
 * Created on April 7, 2006, 2:34 PM
 */

package tr.com.srdc.icardea.careplanengine.agents.gui.dataaccess;

import tr.com.srdc.icardea.careplanengine.glmodel.impl.DefaultGuideline;
import tr.com.srdc.icardea.careplanengine.glmodel.impl.DefaultCriterion;
import tr.com.srdc.icardea.careplanengine.glmodel.impl.DefaultAlgorithm;
import tr.com.srdc.icardea.careplanengine.glmodel.Get_Data_Action;
import tr.com.srdc.icardea.careplanengine.glmodel.Data_Entity;
import tr.com.srdc.icardea.careplanengine.glmodel.EHR_Entity;
import tr.com.srdc.icardea.careplanengine.glmodel.Sensor_Entity;
import tr.com.srdc.icardea.careplanengine.glmodel.Guideline_Step;
import tr.com.srdc.icardea.careplanengine.glmodel.Action_Step;
import tr.com.srdc.icardea.careplanengine.glmodel.Branch_Step;
import tr.com.srdc.icardea.careplanengine.glmodel.Patient_State_Step;
import tr.com.srdc.icardea.careplanengine.glmodel.Synchronization_Step;
import tr.com.srdc.icardea.careplanengine.glmodel.Choice_Step;
import tr.com.srdc.icardea.careplanengine.glmodel.Case_Step;
import tr.com.srdc.icardea.careplanengine.glmodel.Action_Specification;
import tr.com.srdc.icardea.careplanengine.glmodel.Assignment_Action;
import tr.com.srdc.icardea.careplanengine.glmodel.Medically_Oriented_Action_Specification;
import tr.com.srdc.icardea.careplanengine.glmodel.Subguideline_Action;
import tr.com.srdc.icardea.careplanengine.glmodel.Message_Action;
import tr.com.srdc.icardea.careplanengine.glmodel.Medical_Action_Entity;
import tr.com.srdc.icardea.careplanengine.glmodel.Nestable;
import tr.com.srdc.icardea.careplanengine.glmodel.Macro;
import tr.com.srdc.icardea.careplanengine.glmodel.Decision_Option;
import tr.com.srdc.icardea.careplanengine.glmodel.Case_Condition;
import tr.com.srdc.icardea.careplanengine.glmodel.Concept;
import tr.com.srdc.icardea.careplanengine.glmodel.Guideline;
import tr.com.srdc.icardea.careplanengine.agents.guidelineAgent.FactoryRetriever;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import java.awt.event.MouseEvent;
import java.util.Vector;
import java.util.Collection;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Hashtable;
import javax.swing.*;
import javax.swing.tree.DefaultTreeModel;

import edu.stanford.smi.protegex.owl.model.RDFResource;
import prefuse.data.Node;

/**
 *
 * @author  mehmet olduz
 */
public class GuidelineActionTracer {

//    private Hashtable<String, Integer> synchTable= new Hashtable<String, Integer>();
    private Hashtable<String, DragTreeNode> addedNodes=new Hashtable<String, DragTreeNode>();
    private Hashtable<Guideline_Step, Boolean> isTraced=new Hashtable<Guideline_Step, Boolean>();
    private String url=null;

    private DragTreeNode root=null;

    private Vector<DragTreeNode> subguidelines = new Vector<DragTreeNode>();
    private String subguidelineUrls = "";



    /** Creates new form GuidelineActionTracer */
    public GuidelineActionTracer() {

//        updateGuidelineTree(guideline);


//        dataSourceScroll.setViewportView(dataSourceTree);

    }

    public DefaultTreeModel convertGuidelineActions2Tree(String url, DefaultGuideline guideline) {
        if(guideline == null)
            return null;
        this.url = url;
//        synchTable.clear();
        addedNodes.clear();
        isTraced.clear();

        subguidelines.clear();
        subguidelineUrls = url;

        root = new DragTreeNode("Guidelines", DnDObject.ROOT_NODE);

        convertGuideline2Tree(guideline);

        return new DefaultTreeModel(root);
    }


    private void convertGuideline2Tree(DefaultGuideline guideline, Object treeObject, boolean isSubguideline, boolean isSeperateSubguideline){
//        String displayName = guideline.getName2();
//        if(isSubguideline)
//            displayName += " [ SUB-GUIDELINE ]";
        DragTreeNode guidelineRoot;
        if(isSeperateSubguideline){
            guidelineRoot = new DragTreeNode(treeObject, DnDObject.SUB_GUIDELINE_ROOT);
        }else{
            guidelineRoot = new DragTreeNode(treeObject, DnDObject.ROOT_NODE);
        }

        Logger.getLogger(this.getClass()).log(Level.DEBUG, (":::" + url));
        // handles eligibility criteria
        Vector eligibilityList = FactoryRetriever.retrieveEligibilityCriteria(url, guideline);

        int listSize = eligibilityList.size();
        for(int i=0; i<listSize; ++i){
            DefaultCriterion criterion = (DefaultCriterion) eligibilityList.get(i);
            inspectEligibility(guidelineRoot, criterion);
        }

        DefaultAlgorithm guidelineAlgorithm = (DefaultAlgorithm)guideline.getAlgorithm();
        inspectGuidelineStep(guidelineRoot, guidelineAlgorithm.getFirst_step());

        if(isSubguideline){
            subguidelines.addElement(guidelineRoot);
            subguidelineUrls += " " + url;
        }else{
            root.add(guidelineRoot);
            for (int i = 0; i < subguidelines.size(); i++) {
                DragTreeNode subguidelineTreeNode = subguidelines.elementAt(i);
                root.add(subguidelineTreeNode);
            }
        }
    }

    private void convertGuideline2Tree(DefaultGuideline guideline){
        convertGuideline2Tree(guideline, guideline.getName2(), false, false);
    }

    private void inspectGuidelineStep(DragTreeNode node, Guideline_Step guidelineStep) {
        Guideline_Step nextGuidelineStep = FactoryRetriever.retrieveStep(url, guidelineStep);

        if(nextGuidelineStep==null) {
            return ;
        }

        if(isTraced.containsKey(nextGuidelineStep))
                return;

//        if(!(nextGuidelineStep instanceof Synchronization_Step))
            isTraced.put(nextGuidelineStep, true);

//        Logger.getLogger(this.getClass()).log(Level.DEBUG, ("[type:"+nextGuidelineStep.getClass().getName()+"]");
//        Logger.getLogger(this.getClass()).log(Level.DEBUG, ("[name:"+nextGuidelineStep.getName2()+"]");

        if (nextGuidelineStep instanceof Action_Step) {
            inspectActionStep(node, (Action_Step) nextGuidelineStep);
        }
        else if (nextGuidelineStep instanceof Branch_Step) {
            inspectBranchStep(node, (Branch_Step) nextGuidelineStep);
        }
        else if (nextGuidelineStep instanceof Patient_State_Step) {
            inspectPatientStateStep(node,(Patient_State_Step) nextGuidelineStep);
        }
        else if (nextGuidelineStep instanceof Synchronization_Step) {
            inspectSynchronizationStep(node, (Synchronization_Step) nextGuidelineStep);
        }
        else if (nextGuidelineStep instanceof Choice_Step) {
            inspectChoiceStep(node, (Choice_Step) nextGuidelineStep);
        }
        else if (nextGuidelineStep instanceof Case_Step) {
            inspectCaseStep(node, (Case_Step) nextGuidelineStep);
        }
    }

    private void inspectCaseStep(DragTreeNode node, Case_Step caseStep) {
        if(caseStep.getDecision_detail() != null){

            Nestable nestable = FactoryRetriever.retrieveNestable(url, caseStep.getDecision_detail());

            if(nestable instanceof  Guideline){
                //todo:
                //fixme: [olduz] handle new guideline
                //new GuidelineHandler().handle(guidelineAgent, (Guideline)nestable);
            }
            else if (nestable instanceof Macro){
                //TODO: if necessary, it will be implemented.
            }
        }

        ArrayList optionsList =(ArrayList) caseStep.getOptions();

        for (int i = 0; i < optionsList.size(); i++) {
            Decision_Option option = (Decision_Option) optionsList.get(i);
            inspectConditionValue(node, option);
        }

        if(caseStep.getDefault_next_step() != null){
            inspectGuidelineStep(node, caseStep.getDefault_next_step());
        }

    }

    private void inspectConditionValue(DragTreeNode node, Decision_Option option) {
        //FIXME [olduz]: Burda choice geldigi durumlar da olabilir, oyleyse implement edilecek.
        Case_Condition case_Condition = FactoryRetriever.retrieveCase_condition(url, option);
        DragTreeNode actionStepNode = new DragTreeNode(case_Condition, DnDObject.CASE_STEP);
        Collection getDataActions = case_Condition.getCase_value().getGet_Data_Items();
        for (Iterator iterator = getDataActions.iterator(); iterator.hasNext();) {
            Get_Data_Action data_action = (Get_Data_Action) iterator.next();
            inspectGetDataAction(actionStepNode, data_action);
        }
        inspectGuidelineStep(actionStepNode, option.getDestination());
        addIntermediateNode(node, actionStepNode);
    }

    private void inspectChoiceStep(DragTreeNode node, Choice_Step choiceStep) {
        if(choiceStep.getDecision_detail() != null){

            Nestable nestable = FactoryRetriever.retrieveNestable(url, choiceStep.getDecision_detail());

            if(nestable instanceof  Guideline){
                //todo:
                //fixme: [olduz] handle new guideline
                //new GuidelineHandler().handle(guidelineAgent, (Guideline)nestable);
            }
            else if (nestable instanceof Macro){
                //TODO: if necessary, it will be implemented.
            }
        }

        ArrayList optionsList =(ArrayList) choiceStep.getOptions();
        int listSize = optionsList.size();

        for(int i=0;i<listSize;++i) {
            Decision_Option  currentOption = (Decision_Option) optionsList.get(i);
            inspectConditionValue(node, currentOption);
//            inspectGuidelineStep(node, currentOption.getDestination());
        }

    }

    private void inspectSynchronizationStep(DragTreeNode node, Synchronization_Step synchronizationStep) {
//        if (synchTable.containsKey(synchronizationStep.getName())) {
//            Integer branchesWaiting = synchTable.get(synchronizationStep.getName());
//            if(branchesWaiting ==1) {
//                synchTable.remove(synchronizationStep.getName());
                Guideline_Step nextStep= synchronizationStep.getNext_step();
                isTraced.put(synchronizationStep, true);
                inspectGuidelineStep(node, nextStep);
//            }
//            else {
//                synchTable.put(synchronizationStep.getName(), branchesWaiting-1);
//            }
//        }
//        else {
//            synchTable.put(synchronizationStep.getName(), getBranchCount(synchronizationStep)-1);
//        }

    }

    /////   a temporary method to parse how many branches needed to pass this synch. step
    private Integer getBranchCount(Synchronization_Step step) {


        String logicalExpr = step.getContinuation().getLogical_expression_of_guideline_step();
        //  '>' and '=' charcters are removed and string is trimmed to obtain Integer
        Integer branchCount= Integer.parseInt(logicalExpr.replace('>',' ').replace('=',' ').trim());

        return  branchCount;

    }

    private void addIntermediateNode(DragTreeNode parent, DragTreeNode nodeToBeAdded){
        String uniqueName = ((RDFResource)nodeToBeAdded.getUserObject()).getName();
        if(nodeToBeAdded.getChildCount()>0 && !addedNodes.containsKey(uniqueName)){
            parent.add(nodeToBeAdded);
            addedNodes.put(uniqueName, nodeToBeAdded);
        }
    }

    private void addLeafNode(DragTreeNode parent, DragTreeNode nodeToBeAdded){
        String uniqueName = ((RDFResource)nodeToBeAdded.getUserObject()).getName();
        if(!addedNodes.containsKey(uniqueName)){
            parent.add(nodeToBeAdded);
            addedNodes.put(uniqueName, nodeToBeAdded);
        }
    }

    private void inspectPatientStateStep(DragTreeNode node, Patient_State_Step patientStateStep) {
        try {
            // calls  handler for the next step
            if(patientStateStep.hasNext_step()) {
                inspectGuidelineStep(node, patientStateStep.getNext_step());
            }
        }
        catch(Exception exc) {
            exc.printStackTrace();

        }
    }

    private void inspectBranchStep(DragTreeNode node, Branch_Step branchStep) {

        ArrayList branches = (ArrayList)branchStep.getBranches();
        int listSize = branches.size();

        DragTreeNode branchNode = new DragTreeNode(branchStep, DnDObject.BRANCH_NODE);
        for(int i=0;i<listSize;++i) {
            Guideline_Step nextStep = (Guideline_Step) branches.get(i);
            inspectGuidelineStep(branchNode, nextStep);
        }
        addIntermediateNode(node, branchNode);
    }

    private void inspectActionStep(DragTreeNode root, Action_Step actionStep) {
        Vector tasksList=  FactoryRetriever.retrieveTasks(url, actionStep);

        int listSize = tasksList.size();
        DragTreeNode actionStepNode = new DragTreeNode(actionStep, DnDObject.ACTION_STEP_NODE);
        for(int i=0;i<listSize;++i) {
            Action_Specification currentActSpec = (Action_Specification) tasksList.get(i);
            inspectActionSpecification(actionStepNode, actionStep, currentActSpec);
        }

        addIntermediateNode(root, actionStepNode);

        if(actionStep.hasNext_step()) {
//            Logger.getLogger(this.getClass()).log(Level.DEBUG, ("action stepten ilerledik");
            inspectGuidelineStep(root, actionStep.getNext_step());
        }
    }

    private void inspectActionSpecification(DragTreeNode node, Action_Step actionStep, Action_Specification actionSpecification) {
//        Logger.getLogger(this.getClass()).log(Level.DEBUG, ("[TaskType: "+actionSpecification.getClass().getName()+"]");

        if(actionSpecification instanceof Assignment_Action) {
            //nothing to do
        }
        else if(actionSpecification instanceof Get_Data_Action) {
            inspectGetDataAction(node, (Get_Data_Action) actionSpecification);
        }
        else if(actionSpecification instanceof Medically_Oriented_Action_Specification) {
            inspectMedicallyOrientedAction(node, (Medically_Oriented_Action_Specification) actionSpecification);
        }
        else if(actionSpecification instanceof Message_Action) {
            //nothing to do
        }
        else if(actionSpecification instanceof Subguideline_Action) {
            inspectSubguidelineAction((Subguideline_Action) actionSpecification);
        }
    }

    private void inspectSubguidelineAction(Subguideline_Action subguideline_action) {
        Nestable nestable = subguideline_action.getAction_detail();
        if(nestable != null){
            nestable = FactoryRetriever.retrieveNestable(url, nestable);
            convertGuideline2Tree((DefaultGuideline)nestable, subguideline_action, true, false);
        }else{
            String subguidelineURI = subguideline_action.getDescription();
            DefaultGuideline subguideline = FactoryRetriever.getGuideline(subguidelineURI,
                    subguideline_action.getName2());
            String tempUrl = url;
            url = subguidelineURI;
            convertGuideline2Tree(subguideline, subguideline_action, true, true);
            url = tempUrl;
        }
    }

    private void inspectMedicallyOrientedAction(DragTreeNode node, Medically_Oriented_Action_Specification medicallyOrientedAction) {
        try {
            Medical_Action_Entity  maEntity= medicallyOrientedAction.getMedical_task();

            if (maEntity == null) {
                return;
            }

            Concept concept = maEntity.getFunctionality();
            if(concept == null)
                return;
            String functionality = concept.getConcept_name();
            if(functionality.equalsIgnoreCase("Consult") || functionality.equalsIgnoreCase("Wait"))
                return;

            Logger.getLogger(this.getClass()).log(Level.DEBUG, ("MEDICALLY ORIENTED ACTION::: " + medicallyOrientedAction));
           /* if(maEntity.getIs_synchronous()) {
//                Logger.getLogger(this.getClass()).log(Level.DEBUG, ("TODO:It is Synchronous. Invoke The Web Service,fill the message");
                addLeafNode(node, new DragTreeNode(medicallyOrientedAction, DnDObject.MOA_ACTION_NODE));
            }
            else if(maEntity.getIs_critical()) {
//                Logger.getLogger(this.getClass()).log(Level.DEBUG, ("TODO:It is Asynchronous. Wait for Web Service Result, fill the message");
                addLeafNode(node, new DragTreeNode(medicallyOrientedAction, DnDObject.MOA_ACTION_NODE));
            }
            else {*/
//                Logger.getLogger(this.getClass()).log(Level.DEBUG, ("TODO:It is Asynchronous but not critical. Do not wait for Web Service Result");
                addLeafNode(node, new DragTreeNode(medicallyOrientedAction, DnDObject.MOA_ACTION_NODE));
//            }
        }
        catch(Exception exc) {
            exc.printStackTrace();
        }
    }

    private void inspectEligibility(DragTreeNode root, DefaultCriterion eligibilityCriteria) {
//        Logger.getLogger(this.getClass()).log(Level.DEBUG, ("Eligibility Criteria:"+ eligibilityCriteria.getName2());
        DragTreeNode eligibilityNode = new DragTreeNode(eligibilityCriteria, DnDObject.ELIGIBILITY_NODE);

        // First get the needed getDataAction array from the Criterion.
        Collection getDataActions = eligibilityCriteria.getGet_Data_Items();
        Iterator iterator = getDataActions.iterator();
        while (iterator.hasNext()) {
            inspectGetDataAction(eligibilityNode, (Get_Data_Action)iterator.next());
        }

        addIntermediateNode(root, eligibilityNode);
    }

    private void inspectGetDataAction(DragTreeNode node, Get_Data_Action data_action) {
        try {
//            Logger.getLogger(this.getClass()).log(Level.DEBUG, ("GetDataAction:"+ data_action.getName2());
//            Logger.getLogger(this.getClass()).log(Level.DEBUG, ("Variable Name:"+data_action.getVariable_name());

            Data_Entity dataEntity =FactoryRetriever.retrieveEntity(url, data_action.getData_source_type());
            if(dataEntity instanceof EHR_Entity) {
                DragTreeNode emrDataActionNode = new DragTreeNode(data_action, DnDObject.EHR_DATA_ACTION_NODE);
                addLeafNode(node, emrDataActionNode);
            }
            else if(dataEntity instanceof Sensor_Entity) {
                Logger.getLogger(this.getClass()).log(Level.DEBUG, ("Sensor :: " + data_action));
                DragTreeNode sensorDataActionNode = new DragTreeNode(data_action, DnDObject.SENSOR_DATA_ACTION_NODE);
                addLeafNode(node, sensorDataActionNode);
            }
        }
        catch(Exception exc ) {
            exc.printStackTrace();
        }
    }



    public void mousePressed(MouseEvent e) {
        JComponent c = (JComponent)e.getSource();
        TransferHandler handler = c.getTransferHandler();
        handler.exportAsDrag(c, e, TransferHandler.COPY);
    }


    public String[] getUrlsOfGuidelines() {
        return subguidelineUrls.split(" ");
    }
}

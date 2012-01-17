package tr.com.srdc.icardea.careplanengine.glmodel;

//~--- non-JDK imports --------------------------------------------------------

import edu.stanford.smi.protegex.owl.model.*;

//~--- JDK imports ------------------------------------------------------------

import java.util.*;

/**
 * Generated by Protege-OWL  (http://protege.stanford.edu/plugins/owl).
 * Source OWL Class: http://www.owl-ontologies.com/unnamed.owl#Guideline
 *
 * @version generated on Thu Jun 08 17:30:02 EEST 2006
 */
public interface Guideline extends Nestable {

    // Property http://www.owl-ontologies.com/unnamed.owl#algorithm
    Algorithm getAlgorithm();

    RDFProperty getAlgorithmProperty();

    boolean hasAlgorithm();

    void setAlgorithm(Algorithm newAlgorithm);

    // Property http://www.owl-ontologies.com/unnamed.owl#data_items
    Data_Item_List getData_items();

    RDFProperty getData_itemsProperty();

    boolean hasData_items();

    void setData_items(Data_Item_List newData_items);

    // Property http://www.owl-ontologies.com/unnamed.owl#default_viewer
    View_Specification getDefault_viewer();

    RDFProperty getDefault_viewerProperty();

    boolean hasDefault_viewer();

    void setDefault_viewer(View_Specification newDefault_viewer);

    // Property http://www.owl-ontologies.com/unnamed.owl#didactics
    Collection getDidactics();

    RDFProperty getDidacticsProperty();

    boolean hasDidactics();

    Iterator listDidactics();

    void addDidactics(Supplemental_Material_List newDidactics);

    void removeDidactics(Supplemental_Material_List oldDidactics);

    void setDidactics(Collection newDidactics);

    // Property http://www.owl-ontologies.com/unnamed.owl#eligibility_criteria
    Collection getEligibility_criteria();

    RDFProperty getEligibility_criteriaProperty();

    boolean hasEligibility_criteria();

    Iterator listEligibility_criteria();

    void addEligibility_criteria(Criterion newEligibility_criteria);

    void removeEligibility_criteria(Criterion oldEligibility_criteria);

    void setEligibility_criteria(Collection newEligibility_criteria);

    // Property http://www.owl-ontologies.com/unnamed.owl#exceptions
    Collection getExceptions();

    RDFProperty getExceptionsProperty();

    boolean hasExceptions();

    Iterator listExceptions();

    void addExceptions(Guideline_Exception newExceptions);

    void removeExceptions(Guideline_Exception oldExceptions);

    void setExceptions(Collection newExceptions);

    // Property http://www.owl-ontologies.com/unnamed.owl#intention
    String getIntention();

    RDFProperty getIntentionProperty();

    boolean hasIntention();

    void setIntention(String newIntention);

    // Property http://www.owl-ontologies.com/unnamed.owl#let_expressions
    Collection getLet_expressions();

    RDFProperty getLet_expressionsProperty();

    boolean hasLet_expressions();

    Iterator listLet_expressions();

    void addLet_expressions(Let_Expression newLet_expressions);

    void removeLet_expressions(Let_Expression oldLet_expressions);

    void setLet_expressions(Collection newLet_expressions);

    // Property http://www.owl-ontologies.com/unnamed.owl#maintenance_info
    Maintenance_Info getMaintenance_info();

    RDFProperty getMaintenance_infoProperty();

    boolean hasMaintenance_info();

    void setMaintenance_info(Maintenance_Info newMaintenance_info);

    // Property http://www.owl-ontologies.com/unnamed.owl#parameters_passed
    Collection getParameters_passed();

    RDFProperty getParameters_passedProperty();

    boolean hasParameters_passed();

    Iterator listParameters_passed();

    void addParameters_passed(Parameter_Passed newParameters_passed);

    void removeParameters_passed(Parameter_Passed oldParameters_passed);

    void setParameters_passed(Collection newParameters_passed);
}


//~ Formatted by Jindent --- http://www.jindent.com
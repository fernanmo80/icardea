package tr.com.srdc.icardea.careplanengine.glmodel.impl;

//~--- non-JDK imports --------------------------------------------------------

import edu.stanford.smi.protege.model.FrameID;
import edu.stanford.smi.protegex.owl.model.*;
import edu.stanford.smi.protegex.owl.model.impl.*;

import tr.com.srdc.icardea.careplanengine.glmodel.*;

/**
 * Generated by Protege-OWL  (http://protege.stanford.edu/plugins/owl).
 * Source OWL Class: http://www.owl-ontologies.com/unnamed.owl#Case_Condition
 *
 * @version generated on Thu Jun 08 17:29:57 EEST 2006
 */
public class DefaultCase_Condition extends DefaultDecision_Condition implements Case_Condition {
    public DefaultCase_Condition() {}

    public DefaultCase_Condition(OWLModel owlModel, FrameID id) {
        super(owlModel, id);
    }

    // Property http://www.owl-ontologies.com/unnamed.owl#case_value
    public Guideline_Expression getCase_value() {
        return (Guideline_Expression) getPropertyValueAs(getCase_valueProperty(), Guideline_Expression.class);
    }

    public RDFProperty getCase_valueProperty() {
        final String uri  = "http://www.owl-ontologies.com/unnamed.owl#case_value";
        final String name = getOWLModel().getResourceNameForURI(uri);

        return getOWLModel().getRDFProperty(name);
    }

    public boolean hasCase_value() {
        return getPropertyValueCount(getCase_valueProperty()) > 0;
    }

    public void setCase_value(Guideline_Expression newCase_value) {
        setPropertyValue(getCase_valueProperty(), newCase_value);
    }
}


//~ Formatted by Jindent --- http://www.jindent.com

package tr.com.srdc.icardea.careplanengine.glmodel.impl;

//~--- non-JDK imports --------------------------------------------------------

import edu.stanford.smi.protege.model.FrameID;
import edu.stanford.smi.protegex.owl.model.*;
import edu.stanford.smi.protegex.owl.model.impl.*;

import tr.com.srdc.icardea.careplanengine.glmodel.*;

/**
 * Generated by Protege-OWL  (http://protege.stanford.edu/plugins/owl).
 * Source OWL Class: http://www.owl-ontologies.com/unnamed.owl#Supplemental_Material
 *
 * @version generated on Thu Jun 08 17:29:57 EEST 2006
 */
public class DefaultSupplemental_Material extends DefaultGuideline_Model_Entity implements Supplemental_Material {
    public DefaultSupplemental_Material() {}

    public DefaultSupplemental_Material(OWLModel owlModel, FrameID id) {
        super(owlModel, id);
    }

    // Property http://www.owl-ontologies.com/unnamed.owl#MIME_type_format
    public String getMIME_type_format() {
        return (String) getPropertyValue(getMIME_type_formatProperty());
    }

    public RDFProperty getMIME_type_formatProperty() {
        final String uri  = "http://www.owl-ontologies.com/unnamed.owl#MIME_type_format";
        final String name = getOWLModel().getResourceNameForURI(uri);

        return getOWLModel().getRDFProperty(name);
    }

    public boolean hasMIME_type_format() {
        return getPropertyValueCount(getMIME_type_formatProperty()) > 0;
    }

    public void setMIME_type_format(String newMIME_type_format) {
        setPropertyValue(getMIME_type_formatProperty(), newMIME_type_format);
    }
}


//~ Formatted by Jindent --- http://www.jindent.com

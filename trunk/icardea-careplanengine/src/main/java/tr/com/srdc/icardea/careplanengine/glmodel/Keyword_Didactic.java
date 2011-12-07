package tr.com.srdc.icardea.careplanengine.glmodel;

//~--- non-JDK imports --------------------------------------------------------

import edu.stanford.smi.protegex.owl.model.*;

//~--- JDK imports ------------------------------------------------------------

import java.util.*;

/**
 * Generated by Protege-OWL  (http://protege.stanford.edu/plugins/owl).
 * Source OWL Class: http://www.owl-ontologies.com/unnamed.owl#Keyword_Didactic
 *
 * @version generated on Thu Jun 08 17:29:57 EEST 2006
 */
public interface Keyword_Didactic extends Supplemental_Material {

    // Property http://www.owl-ontologies.com/unnamed.owl#keywords
    Collection getKeywords();

    RDFProperty getKeywordsProperty();

    boolean hasKeywords();

    Iterator listKeywords();

    void addKeywords(Concept newKeywords);

    void removeKeywords(Concept oldKeywords);

    void setKeywords(Collection newKeywords);
}


//~ Formatted by Jindent --- http://www.jindent.com
package tr.com.srdc.icardea.careplanengine.agents.gui.graph;

//~--- non-JDK imports --------------------------------------------------------

import tr.com.srdc.icardea.careplanengine.agents.gui.PatientPanel;
import tr.com.srdc.icardea.careplanengine.entities.AssignmentEntity;
import tr.com.srdc.icardea.careplanengine.glmodel.impl.DefaultGuideline;

/**
 * User: mehmet olduz [mehmet@srdc.metu.edu.tr]
 * Date: Oct 16, 2006
 * Time: 12:34:40 PM
 */
public class ShowSubguidelineEvent {
    private AssignmentEntity assignmentEntity;
    private String           guidelineURI;
    private DefaultGuideline parentGuideline;

    /* Gunes ALUC, SRDC, 19 June 2007 ****************** */
    /* extension to enable this panel to see other **** */
    /* panels generated through sub-guideline ********* */
    /* initiation ************************************* */
    private PatientPanel parentPatientPanel;

    /* END-OF-EXTENSION ******************************** */

//  private String patientName;
    private DefaultGuideline subguideline;

    /* Gunes ALUC, SRDC, 19 June 2007 ****************** */
    /* extension to enable this panel to see other **** */
    /* panels generated through sub-guideline ********* */
    /* initiation ************************************* */
    public ShowSubguidelineEvent(AssignmentEntity assignmentEntity, DefaultGuideline parentGuideline,
                                 DefaultGuideline subguideline, String guidelineURI, PatientPanel panel) {
        this.assignmentEntity = assignmentEntity;

//      this.patientName = patientName;
        this.subguideline       = subguideline;
        this.parentGuideline    = parentGuideline;
        this.guidelineURI       = guidelineURI;
        this.parentPatientPanel = panel;
    }

    /*
     *   public String getPatientName() {
     *     return patientName;
     * }
     */
    public DefaultGuideline getSubguideline() {
        return subguideline;
    }

    public String getGuidelineURI() {
        return guidelineURI;
    }

    public AssignmentEntity getAssignmentEntity() {
        return assignmentEntity;
    }

    /* END-OF-EXTENSION ******************************** */
    public DefaultGuideline getParentGuideline() {
        return parentGuideline;
    }

    /* Gunes ALUC, SRDC, 19 June 2007 ****************** */
    /* extension to enable this panel to see other **** */
    /* panels generated through sub-guideline ********* */
    /* initiation ************************************* */
    public PatientPanel getParentPatientPanel() {
        return this.parentPatientPanel;
    }

    /* END-OF-EXTENSION ******************************** */
}


//~ Formatted by Jindent --- http://www.jindent.com

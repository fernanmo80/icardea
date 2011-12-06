package tr.com.srdc.icardea.careplanengine.entities;

//~--- non-JDK imports --------------------------------------------------------

/**
 * <p></p>
 *
 * @poseidon-object-id [Im1d061edbm109b190a453mm6f3d]
 */
public class EMREntity {
    private String  EMRAgentID;
    private String  data;
    private String  documentReferenceID;
    private String  entrySemanticCategory;
    private String  entryType;
    private boolean isInternal;
    private String  patientID;
    private String  semanticCategory;

    /**
     *
     */
    public EMREntity() {

        // TODO Auto-generated constructor stub
    }

    /**
     * @param semanticCategory
     * @param entrySemanticCategory
     * @param entryType
     * @param output
     * @param agentID
     * @param documentReferenceID
     * @param isInternal
     */
    public EMREntity(String semanticCategory, String entrySemanticCategory, String entryType, String data,
                     String agentID, String documentReferenceID, boolean isInternal, String patientID) {

        // TODO Auto-generated constructor stub
        this.semanticCategory      = semanticCategory;
        this.entrySemanticCategory = entrySemanticCategory;
        this.entryType             = entryType;
        this.data                  = data;
        EMRAgentID                 = agentID;
        this.documentReferenceID   = documentReferenceID;
        this.isInternal            = isInternal;
        this.patientID             = patientID;
    }

    /**
     * @return Returns the documentReferenceID.
     */
    public String getDocumentReferenceID() {
        return documentReferenceID;
    }

    /**
     * @param documentReferenceID The documentReferenceID to set.
     */
    public void setDocumentReferenceID(String documentReferenceID) {
        this.documentReferenceID = documentReferenceID;
    }

    /**
     * @return Returns the eMRAgentID.
     */
    public String getEMRAgentID() {
        return EMRAgentID;
    }

    /**
     * @param patientID The PatientID to set.
     */
    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    /**
     * @return Returns the patientID.
     */
    public String getPatientID() {
        return patientID;
    }

    /**
     * @param agentID The eMRAgentID to set.
     */
    public void setEMRAgentID(String agentID) {
        EMRAgentID = agentID;
    }

    /**
     * @return Returns the isInternal.
     */
    public boolean isInternal() {
        return isInternal;
    }

    /**
     * @param isInternal The isInternal to set.
     */
    public void setInternal(boolean isInternal) {
        this.isInternal = isInternal;
    }

    /**
     * @return Returns the semanticCategory.
     */
    public String getSemanticCategory() {
        return semanticCategory;
    }

    /**
     * @param semanticCategory The semanticCategory to set.
     */
    public void setSemanticCategory(String semanticCategory) {
        this.semanticCategory = semanticCategory;
    }

    /**
     * @return Returns the entrySemanticCategory.
     */
    public String getEntrySemanticCategory() {
        return entrySemanticCategory;
    }

    /**
     * @param entrySemanticCategory The entrySemanticCategory to set.
     */
    public void setEntrySemanticCategory(String entrySemanticCategory) {
        this.entrySemanticCategory = entrySemanticCategory;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getEntryType() {
        return entryType;
    }

    public void setEntryType(String entryType) {
        this.entryType = entryType;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com

package tr.com.srdc.icardea.careplanengine.entities;

/**
 * There is an one-to-many unidirectional
 * relation between DiagnosisCode and PatientEntity.
 * DiagnosisCodes is based on ICD-10 codes.
 *
 * @author      METU-SRDC
 * @see         <a href="mailto:icardea-technical@srdc.metu.edu.tr">Help</a>
 * @see         <a href="http://www.saglik.gov.tr">The Ministry of Health of Turkey</a>
 */
public class DiagnosisCode {
    private String code;
    private String description;

    public DiagnosisCode() {}

    public DiagnosisCode(String code) {
        this.code = code;
    }

    /**
     * @param code
     * @param description
     */
    public DiagnosisCode(String code, String description) {

        // TODO Auto-generated constructor stub
        this.code        = code;
        this.description = description;
    }

    /**
     * code is the identifier attribute for the DiagnosisCode.
     * It has to be assigned before storing this entity to
     * ICARDEA Repository.
     *
     * @param       code    String
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return      code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @param       description     String
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return      description
     */
    public String getDescription() {
        return this.description;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com

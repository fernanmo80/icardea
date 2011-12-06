package tr.com.srdc.icardea.careplanengine.entities;

//~--- non-JDK imports --------------------------------------------------------

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

import tr.com.srdc.icardea.careplanengine.glmodel.Guideline;
import tr.com.srdc.icardea.careplanengine.glmodel.InstanceFactory;

/**
 *
 * GuidelineEntity instances can be stored in ICARDEA Repository.
 *
 * Title attribute of the GuidelineEntity has the same value
 * with the name of the Guideline which is referenced by guidelineID.
 *
 * @author      METU-SRDC
 * @see         <a href="mailto:icardea-technical@srdc.metu.edu.tr">Help</a>
 *
 */
public class GuidelineEntity {
    private Set    diagnosisCodeList = new HashSet();
    private String developpingInstitute;
    private int    guidelineID;
    private String guidelineURL;
    private String internalGuideline;
    private String title;
    private String version;

    public GuidelineEntity() {}

    /**
     * @param id
     */
    public GuidelineEntity(int id) {
        this.guidelineID = id;
    }

    /**
     * @param rTitle
     * @param rVersion
     * @param rDeveloppingInstitute
     * @param rGuidelineID
     * @param rGuidelineURL
     * @param rInternalGuideline
     * @param rDiagnosisCodeList
     */
    public GuidelineEntity(String rTitle, String rVersion, String rDeveloppingInstitute, int rGuidelineID,
                           String rGuidelineURL, String rInternalGuideline, Set rDiagnosisCodeList) {
        this.title                = rTitle;
        this.version              = rVersion;
        this.developpingInstitute = rDeveloppingInstitute;
        this.guidelineID          = rGuidelineID;
        this.guidelineURL         = rGuidelineURL;
        this.internalGuideline    = rInternalGuideline;
        this.diagnosisCodeList    = rDiagnosisCodeList;
    }

    public String toString() {
        return title + " [" + internalGuideline + "]";
    }

    /**
     *
     * @param   guidelineID     int
     */
    public void setGuidelineID(int guidelineID) {
        this.guidelineID = guidelineID;
    }

    /**
     * @return  guidelineID
     */
    public int getGuidelineID() {
        return this.guidelineID;
    }

    /**
     * @param   guidelineURL    String
     */
    public void setGuidelineURL(String guidelineURL) {
        this.guidelineURL = guidelineURL;
    }

    /**
     * @return  guidelineURL
     */
    public String getGuidelineURL() {
        return this.guidelineURL;
    }

    /**
     *
     * @param   developpingInstitute    String
     */
    public void setDeveloppingInstitute(String di) {
        this.developpingInstitute = di;
    }

    /**
     * @return  developpingInstitute
     */
    public String getDeveloppingInstitute() {
        return this.developpingInstitute;
    }

    /**
     *
     * Guideline has a Name2 attribute which is same as the
     * Guideline Entitt title.
     * In the retrieval of eligibility criteria, this property
     * is used.
     * @param   title   String
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return  title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     *
     * @param   version String
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * @return  version
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * @return Returns the internalGuideline.
     */
    public String getInternalGuideline() {
        return internalGuideline;
    }

    /**
     * @param internalGuideline The internalGuideline to set.
     */
    public void setInternalGuideline(String internalGuideline) {
        this.internalGuideline = internalGuideline;
    }

    /**
     * One purpose of the GuidelineEntity is displaying
     * guideline's eligibilityCriteria to the Doctor.
     * Besides storing eligibilityCriteria as an attribute,
     * they can be retrieved by using InstanceFactory since we
     * know guidelineURL.
     *
     * @return eligibilityCriteria of the guideline
     */
    public Vector getEligibilityCriteria() {

        // TODO: loading Protege plugins takes too much time, so at the startup time
        // of the ICARDEA System, these plugins should be loaded.
        InstanceFactory   instanceFactory = InstanceFactory.getInstance(this.guidelineURL);
        Vector<Guideline> guidelineVector = instanceFactory.createGuidelines();
        Iterator          it              = guidelineVector.iterator();
        Guideline         guideline       = null;

        while (it.hasNext()) {
            guideline = (Guideline) it.next();

            if (guideline.getName2().equals(this.title)) {
                Vector criteriaVector = instanceFactory.getEligibilityCriteria(guideline);

                return criteriaVector;
            }
        }

        return null;
    }

    /**
     * @return Returns the diagnosisCodeList.
     */
    public Set getDiagnosisCodeList() {
        return diagnosisCodeList;
    }

    /**
     * @param diagnosisCodeList The diagnosisCodeList to set.
     */
    public void setDiagnosisCodeList(Set diagnosisCodeList) {
        this.diagnosisCodeList = diagnosisCodeList;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com

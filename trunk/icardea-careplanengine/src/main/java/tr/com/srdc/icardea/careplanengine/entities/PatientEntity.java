package tr.com.srdc.icardea.careplanengine.entities;

//~--- JDK imports ------------------------------------------------------------

import java.util.Date;

/**
 * PatientEntity includes demographics data of the patient.
 *
 * @author      METU-SRDC
 * @see         <a href="mailto:icardea-technical@srdc.metu.edu.tr">Help</a>
 */
public class PatientEntity {
    private String  address;
    private Date    birthDate;
    private String  gender;
    private Double  height;
    private Integer hospFileNo;
    private String  marital;
    private String  name;
    private Long    pcode;
    private String  pid;
    private Double  weight;

    public PatientEntity() {}

    public PatientEntity(String pid) {
        this.pid = pid;
    }

    /**
     * @param pid
     * @param pcode
     * @param name
     * @param birthDate
     * @param gender
     * @param height
     * @param weight
     * @param marital
     * @param address
     * @param hospFileNo
     */
    public PatientEntity(String pid, Long pcode, String name, Date birthDate, String gender, Double height,
                         Double weight, String marital, String address, Integer hospFileNo) {

        // TODO Auto-generated constructor stub
        this.pid        = pid;
        this.pcode      = pcode;
        this.name       = name;
        this.birthDate  = birthDate;
        this.gender     = gender;
        this.height     = height;
        this.weight     = weight;
        this.marital    = marital;
        this.address    = address;
        this.hospFileNo = hospFileNo;
    }

    /**
     * @return Returns the address.
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address The address to set.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return Returns the birthDate.
     */
    public Date getBirthDate() {
        return birthDate;
    }

    /**
     * @param birthDate The birthDate to set.
     */
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * @return Returns the gender.
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender The gender to set.
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return Returns the hospFileNo.
     */
    public Integer getHospFileNo() {
        return hospFileNo;
    }

    /**
     * @param hospFileNo The hospFileNo to set.
     */
    public void setHospFileNo(Integer hospFileNo) {
        this.hospFileNo = hospFileNo;
    }

    /**
     * @return Returns the marital.
     */
    public String getMarital() {
        return marital;
    }

    /**
     * @param marital The marital to set.
     */
    public void setMarital(String marital) {
        this.marital = marital;
    }

    /**
     * @return Returns the name.
     */
    public String getName() {
        return name;
    }

    /**
     * @param name The name to set.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return Returns the pid.
     */
    public String getPid() {
        return pid;
    }

    /**
     * @param pid The pid to set.
     */
    public void setPid(String pid) {
        this.pid = pid;
    }

    /**
     * @return Returns the height.
     */
    public Double getHeight() {
        return height;
    }

    /**
     * @param height The height to set.
     */
    public void setHeight(Double height) {
        this.height = height;
    }

    /**
     * @return Returns the pcode.
     */
    public Long getPcode() {
        return pcode;
    }

    /**
     * @param pcode The pcode to set.
     */
    public void setPcode(Long pcode) {
        this.pcode = pcode;
    }

    /**
     * @return Returns the weight.
     */
    public Double getWeight() {
        return weight;
    }

    /**
     * @param weight The weight to set.
     */
    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String toString() {
        return name;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com

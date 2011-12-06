package tr.com.srdc.icardea.careplanengine.alarmSystem.alarmOntology;

//~--- non-JDK imports --------------------------------------------------------

public class PatientInfo {
    private String assignmentID;
    private String guidelineID;
    private String patientID;
    private String patientName;

    public PatientInfo() {}

    public String getGuidelineID() {
        return guidelineID;
    }

    public void setGuidelineID(String guidelineID) {
        this.guidelineID = guidelineID;
    }

    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getAssignmentID() {
        return assignmentID;
    }

    public void setAssignmentID(String assignmentID) {
        this.assignmentID = assignmentID;
    }

    public String toString() {
        String str = "";

        str += "PatientID:" + patientID + "\n";
        str += "GuidelineID:" + guidelineID + "\n";
        str += "Patient Name:" + patientName + "\n";

        return str;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com

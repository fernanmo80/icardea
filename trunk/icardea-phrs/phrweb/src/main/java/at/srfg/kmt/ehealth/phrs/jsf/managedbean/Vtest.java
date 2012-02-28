package at.srfg.kmt.ehealth.phrs.jsf.managedbean;

import at.srfg.kmt.ehealth.phrs.support.test.CoreTestData;
import at.srfg.kmt.ehealth.phrs.presentation.services.ConfigurationService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ManagedBean(name = "vtestBean")
@RequestScoped
public class Vtest {

    private final static Logger LOGGER = LoggerFactory.getLogger(Vtest.class);
    private String ownerUri;

    public Vtest() {
        ownerUri =
                ConfigurationService.getInstance().getProperty("test.user.1.login.id", "phrtest");

    }

    public String getOwnerUri() {
        return ownerUri;
    }

    /**
     * UI button
     */
    public void loadTestData() {
        LOGGER.error("VT web form got: loadTestData ");
        try {
            CoreTestData.addTestBasicHealthVitalsData(getOwnerUri());
        } catch (Exception e) {
            LOGGER.error("VT loadTestData failed", e);
        }
    }
    /*
     * UI button
     */

    public void loadInterop() {
        LOGGER.error("VT web form got: loadInterop ");
        try {
            CoreTestData test = new CoreTestData();
            test.addTestMedications_2_forPortalTestForOwnerUri(getOwnerUri());
        } catch (Exception e) {
            LOGGER.error("VT loadInterop failed", e);
        }
    }

    public void commandTest() {
        System.out.println("commandImportMessage commandTest()");
        LOGGER.debug("VT comVT mandTest()");
        //WebUtil.addFacesMessageSeverityInfo("commandImportMessage","commandTest(ActionEvent)");

    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package at.srfg.kmt.ehealth.phrs.security.services;

import at.srfg.kmt.ehealth.phrs.Constants;
import at.srfg.kmt.ehealth.phrs.model.baseform.MedicationTreatment;
import at.srfg.kmt.ehealth.phrs.model.baseform.MedicationTreatmentMatrix;
import at.srfg.kmt.ehealth.phrs.persistence.api.GenericTriplestore;
import at.srfg.kmt.ehealth.phrs.persistence.client.PhrsStoreClient;
import at.srfg.kmt.ehealth.phrs.persistence.impl.TriplestoreConnectionFactory;
import at.srfg.kmt.ehealth.phrs.presentation.services.InteropAccessService;
import java.util.Date;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;
import at.srfg.kmt.ehealth.phrs.persistence.api.TripleException;
import at.srfg.kmt.ehealth.phrs.persistence.api.GenericRepositoryException;
import at.srfg.kmt.ehealth.phrs.persistence.api.GenericTriplestoreLifecycle;
import com.google.code.morphia.query.Query;

public class PhrsClientUnitTest {

    public static final String NOTE = "to import";
    public static final String USER = "unittest123";//MedicationClientUnitTest.class.getName();
    public static final String DOSE_INTERVAL = "http://www.icardea.at/phrs/instances/EveryHour";
    public static final String DOSE_TIME_OF_DAY = "http://www.icardea.at/phrs/instances/InTheMorning";
    public static final String DOSE_UNITS = "http://www.icardea.at/phrs/instances/pills";
    public static final String MED_REASON = "http://www.icardea.at/phrs/instances/Cholesterol";
    private PhrsStoreClient phrsClient = null;
    private GenericTriplestore triplestore;

    public PhrsClientUnitTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        //phrsClient)
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
        phrsClient = PhrsStoreClient.getInstance();
        Query query = phrsClient.getPhrsDatastore().createQuery(MedicationTreatment.class).filter("ownerUri =", USER);
        phrsClient.getPhrsDatastore().delete(query);
        triplestore = phrsClient.getGenericTriplestore();

    }

    @After
    public void tearDown() throws GenericRepositoryException, TripleException, IllegalAccessException, InstantiationException, Exception {
        try {
            PhrsStoreClient phrsClient = PhrsStoreClient.getInstance();
            if (phrsClient != null) {
                Query query = phrsClient.getPhrsDatastore().createQuery(MedicationTreatment.class).filter("ownerUri =", USER);
                phrsClient.getPhrsDatastore().delete(query);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            //clean up 
            if (triplestore != null) {
                ((GenericTriplestoreLifecycle) triplestore).shutdown();
                ((GenericTriplestoreLifecycle) triplestore).cleanEnvironment();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            if (phrsClient != null) {
                Query query = phrsClient.getPhrsDatastore().createQuery(MedicationTreatment.class).filter("ownerUri =", USER);
                phrsClient.getPhrsDatastore().delete(query);
            }
        } catch (Exception e) {
            // e.printStackTrace();shows a distracting error
        }

        try {
            if (triplestore != null) {
                ((GenericTriplestoreLifecycle) triplestore).shutdown();
                ((GenericTriplestoreLifecycle) triplestore).cleanEnvironment();

            }
            if (phrsClient != null) {
                phrsClient.setTripleStore(null);
            }

        } catch (Exception e) {
            //e.printStackTrace(); shows a distracting error
        }
        triplestore = null;
        phrsClient = null;
    }

    @Test
    public void testInstanceDefault() {
        System.out.println("testInstanceDefault");
        PhrsStoreClient sc = PhrsStoreClient.getInstance();
        assertNotNull(sc);
    }

    /*
     * To test: phrsStoreClient.updateTriple(messageResourceUri,
     * Constants.SKOS_NOTE,REFERENCE_NOTE_PREFIX+messageResourceUri, false)
     */
    @Test
    public void testInstanceInteropAccess() {
        System.out.println("testInstanceInteropAccess");
        phrsClient = PhrsStoreClient.getInstance();
        assertNotNull(phrsClient);
        at.srfg.kmt.ehealth.phrs.presentation.services.InteropAccessService ias = phrsClient.getInteropService();

        assertNotNull(ias);
    }

    public GenericTriplestore getTripleStore() {
        final TriplestoreConnectionFactory connectionFactory =
                TriplestoreConnectionFactory.getInstance();
        GenericTriplestore triplestore = connectionFactory.getTriplestore();

        return triplestore;
    }

    public at.srfg.kmt.ehealth.phrs.presentation.services.InteropAccessService getInteropAccessService() {

        phrsClient = PhrsStoreClient.getInstance();
        assertNotNull(phrsClient);
        at.srfg.kmt.ehealth.phrs.presentation.services.InteropAccessService ias = phrsClient.getInteropService();
        return ias;
    }
}

package tr.com.srdc.icardea.careplanengine.util;

//~--- non-JDK imports --------------------------------------------------------

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import tr.com.srdc.icardea.careplanengine.entities.*;
import tr.com.srdc.icardea.careplanengine.icardeaRepository.*;

//~--- JDK imports ------------------------------------------------------------


import java.util.ArrayList;
import java.util.Vector;

/**
 * HibernateUtil class is reponsible for building a global
 * SessionFactory object and store it somewhere for easy access
 * in application code. A SessionFactory can open up new Session's.
 * A Session represents a single-threaded unit of work, the SessionFactory
 * is a thread-safe global object, instantiated once.
 *
 * @author      METU-SRDC
 * @see         <a href="mailto:icardea-technical@srdc.metu.edu.tr">Help</a>
 *
 */
public class HibernateUtil {
    private static final SessionFactory sessionFactory;
    private static final SessionFactory sessionFactory2;

    static {
        try {

            // Create sessionFactory from hibernate.cfg.xml, this file is located in hibernate_config package
            sessionFactory =
                new Configuration().configure("conf/hibernate_config/hibernate.cfg.xml").buildSessionFactory();
            sessionFactory2 =
                new Configuration().configure("conf/hibernate_config/hibernate.cfg2.xml").buildSessionFactory();
        } catch (Throwable ex) {

            // TODO: Debug comments have to be included by using srdc.utilities library
            throw new ExceptionInInitializerError(ex);
        }
    }

    /**
     * @return      SessionFactory
     */
    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    /**
     * @return      SessionFactory2
     */
    public SessionFactory getSessionFactory2() {
        return sessionFactory2;
    }

    // Test Driver
    public static void main(String[] args) {

/*
                Vector<SensorsSetInfo> res = SensorsSetRepository.retrieveAllSensorsSetInfos();
        for (SensorsSetInfo r : res) {
            Logger.getLogger(this.getClass()).log(Level.DEBUG,  (r);
        }

        Logger.getLogger(this.getClass()).log(Level.DEBUG, ("\n\n");

        Vector<AssignmentEntity> aeRes = AssignmentRepository.retrieveAllAssignmentEntities();
        for (AssignmentEntity ae : aeRes){
                Logger.getLogger(this.getClass()).log(Level.DEBUG, (ae.getPatientEntity().getName()+" - "+
                                ae.getGuidelineEntity().getTitle()+" , "+
                                ae.getGuidelineEntity().getGuidelineURL());
        }
*/

        Vector<PatientEntity> peRes = PatientRepository.retrieveAllPatientEntities();

        for (PatientEntity pe : peRes) {
        }


        ArrayList<String> roleName;
        ArrayList<String> roleInfo;
        Vector<UserInfo>  uiRes = UserRepository.retrieveAllUserInfos();

        for (UserInfo ui : uiRes) {
            System.out.print(ui.getUserID() + " " + ui.getUserName() + " " + ui.getPassword() + " " + ui.getFullName()
                             + " # ");
            roleName = ui.getRoleName();
            roleInfo = ui.getRoleInfo();

            for (int i = 0; i < roleName.size(); i++) {
                System.out.print(roleName.get(i) + " - " + roleInfo.get(i) + ", ");
            }

        }


        UserInfo newUser = UserRepository.retrieveUserInfo("olduz");

        if (newUser != null) {
        }

        newUser = UserRepository.checkUserInfo("olduz", "ol");

        if (newUser != null) {
        } else {
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com

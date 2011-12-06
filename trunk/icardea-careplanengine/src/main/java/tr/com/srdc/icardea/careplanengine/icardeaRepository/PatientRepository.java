
/*
* Created on Apr 3, 2006
 */
package tr.com.srdc.icardea.careplanengine.icardeaRepository;

//~--- non-JDK imports --------------------------------------------------------

import org.hibernate.*;

import tr.com.srdc.icardea.careplanengine.entities.PatientEntity;
import tr.com.srdc.icardea.careplanengine.util.HibernateUtil;

//~--- JDK imports ------------------------------------------------------------

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/**
 * PatientRepository class is the interface for retrieving and storing
 * Patient Entities.
 *
 * @author METU-SRDC
 * @see         <a href="mailto:icardea-technical@srdc.metu.edu.tr">Help</a>
 */
public class PatientRepository {

    /**
     * @return Vector<PatientEntity>
     */
    public synchronized static Vector<PatientEntity> retrieveAllPatientEntities() {
        List result = null;

        try {
            Session     session = new HibernateUtil().getSessionFactory2().getCurrentSession();
            Transaction tx      = session.beginTransaction();

            result =
                session.createQuery("FROM tr.com.srdc.icardea.careplanengine.entities.PatientEntity order by pid asc").list();
            session.flush();
            tx.commit();
        } catch (HibernateException e) {

            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        Iterator              it  = result.iterator();
        Vector<PatientEntity> vec = new Vector<PatientEntity>();

        while (it.hasNext()) {
            vec.add(((PatientEntity) it.next()));
        }

        return vec;
    }

    /**
     * @return PatientEntity
     */
    public synchronized static PatientEntity retrievePatientEntity(Long patientCode) {
        List result = null;

        try {
            Session     session = new HibernateUtil().getSessionFactory2().getCurrentSession();
            Transaction tx      = session.beginTransaction();

            result = session.createQuery("FROM tr.com.srdc.icardea.careplanengine.entities.PatientEntity pe where pe.pcode = "
                                         + patientCode + "").list();
            session.flush();
            tx.commit();
        } catch (HibernateException e) {

            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        Iterator it = result.iterator();

        if (it.hasNext()) {
            return (PatientEntity) it.next();
        } else {
            return null;
        }
    }

    /**
     * @param pEntity
     */
    public synchronized static void storePatientEntity(PatientEntity pEntity) {
        try {
            Session     session = new HibernateUtil().getSessionFactory2().getCurrentSession();
            Transaction tx      = session.beginTransaction();

            session.save(pEntity);
            session.flush();
            tx.commit();
        } catch (HibernateException e) {

            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * @param pEntity
     */
    public synchronized static void updatePatientEntity(PatientEntity pEntity) {
        try {
            Session     session = new HibernateUtil().getSessionFactory2().getCurrentSession();
            Transaction tx      = session.beginTransaction();

            session.update(pEntity);
            session.flush();
            tx.commit();
        } catch (HibernateException e) {

            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * @param pEntity
     */
    public synchronized static void removePatientEntity(PatientEntity pEntity) {
        try {
            Session     session = new HibernateUtil().getSessionFactory2().getCurrentSession();
            Transaction tx      = session.beginTransaction();

            session.delete(pEntity);
            session.flush();
            tx.commit();
        } catch (HibernateException e) {

            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * @param pcode
     */
    public synchronized static void removePatientEntity2(Long pcode) {
        try {
            Session     session         = new HibernateUtil().getSessionFactory2().getCurrentSession();
            Transaction tx              = session.beginTransaction();
            String      hqlDelete       = "delete from tr.com.srdc.icardea.careplanengine.entities.PatientEntity where pcode="
                                          + pcode + "";
            int         updatedEntities = session.createQuery(hqlDelete).executeUpdate();

            session.flush();
            tx.commit();
        } catch (HibernateException e) {

            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * @param args
     */
    public static void main(String[] args) {

        // TODO Auto-generated method stub
    }
}


//~ Formatted by Jindent --- http://www.jindent.com

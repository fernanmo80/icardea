
/*
* Created on Mar 31, 2006
 */
package tr.com.srdc.icardea.careplanengine.icardeaRepository;

//~--- non-JDK imports --------------------------------------------------------

import org.hibernate.*;

import tr.com.srdc.icardea.careplanengine.entities.DiagnosisCode;
import tr.com.srdc.icardea.careplanengine.util.HibernateUtil;

//~--- JDK imports ------------------------------------------------------------

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/**
 * DiagnosisRepository class is the interface for retrieving and storing
 * Diagnosis Code Entities, which are parts of Patient Entity.
 *
 * @author METU-SRDC
 * @see         <a href="mailto:icardea-technical@srdc.metu.edu.tr">Help</a>
 */
public class DiagnosisCodeRepository {

    /**
     * @return Vector<DiagnosisCode>
     */
    public synchronized static Vector<DiagnosisCode> retrieveAllDiagnosisCodes() {
        List result = null;

        try {
            Session     session = new HibernateUtil().getSessionFactory().getCurrentSession();
            Transaction tx      = session.beginTransaction();

            result = session.createQuery(
                "FROM tr.com.srdc.icardea.careplanengine.entities.DiagnosisCode dCode order by dCode.code asc").list();
            session.flush();
            tx.commit();
        } catch (HibernateException e) {

            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        Iterator              it  = result.iterator();
        Vector<DiagnosisCode> vec = new Vector<DiagnosisCode>();

        while (it.hasNext()) {
            vec.add(((DiagnosisCode) it.next()));
        }

        return vec;
    }

    /**
     * @param dCode
     */
    public synchronized static void storeDiagnosisCode(DiagnosisCode dCode) {
        try {
            Session     session = new HibernateUtil().getSessionFactory().getCurrentSession();
            Transaction tx      = session.beginTransaction();

            session.save(dCode);
            session.flush();
            tx.commit();
        } catch (HibernateException e) {

            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * @param dCode
     */
    public synchronized static void updateDiagnosisCode(DiagnosisCode dCode) {
        try {
            Session     session = new HibernateUtil().getSessionFactory().getCurrentSession();
            Transaction tx      = session.beginTransaction();

            session.update(dCode);
            session.flush();
            tx.commit();
        } catch (HibernateException e) {

            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * @param dCode
     */
    public synchronized static void removeDiagnosisCode(DiagnosisCode dCode) {
        try {
            Session     session = new HibernateUtil().getSessionFactory().getCurrentSession();
            Transaction tx      = session.beginTransaction();

            session.delete(dCode);
            session.flush();
            tx.commit();
        } catch (HibernateException e) {

            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * @param code
     */
    public synchronized static void removeDiagnosisCode(String code) {
        try {
            Session     session         = new HibernateUtil().getSessionFactory().getCurrentSession();
            Transaction tx              = session.beginTransaction();
            String      hqlDelete       = "delete from tr.com.srdc.icardea.careplanengine.entities.DiagnosisCode where code='"
                                          + code + "'";
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

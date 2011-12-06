
/*
* Created on Jul 7, 2006
 */
package tr.com.srdc.icardea.careplanengine.icardeaRepository;

//~--- non-JDK imports --------------------------------------------------------

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import tr.com.srdc.icardea.careplanengine.entities.CustomizationInfo;
import tr.com.srdc.icardea.careplanengine.util.HibernateUtil;

//~--- JDK imports ------------------------------------------------------------

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/**
 * @author mustafa
 * Wrapper class for the CustomizationInfo
 */
public class CustomizationRepository {

    /**
     * @return Vector<CustomizationInfo>
     */
    public synchronized static Vector<CustomizationInfo> retrieveAllCustomizationInfos() {
        List result = null;

        try {
            Session     session = new HibernateUtil().getSessionFactory().getCurrentSession();
            Transaction tx      = session.beginTransaction();

            result =
                session.createQuery("FROM tr.com.srdc.icardea.careplanengine.entities.CustomizationInfo order by cid asc").list();
            session.flush();
            tx.commit();
        } catch (HibernateException e) {

            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        Iterator                  it  = result.iterator();
        Vector<CustomizationInfo> vec = new Vector<CustomizationInfo>();

        while (it.hasNext()) {
            vec.add(((CustomizationInfo) it.next()));
        }

        return vec;
    }

    /**
     * @return CustomizationInfo
     */
    public synchronized static CustomizationInfo retrieveCustomizationInfo(String cid) {
        List result = null;

        try {
            Session     session = new HibernateUtil().getSessionFactory().getCurrentSession();
            Transaction tx      = session.beginTransaction();

            result = session.createQuery("FROM tr.com.srdc.icardea.careplanengine.entities.CustomizationInfo ci where ci.cid = '"
                                         + cid + "'").list();
            session.flush();
            tx.commit();
        } catch (HibernateException e) {

            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        Iterator it = result.iterator();

        if (it.hasNext()) {
            return (CustomizationInfo) it.next();
        } else {
            return null;
        }
    }

    /**
     * @param cInfo
     */
    public synchronized static void storeCustomizationInfo(CustomizationInfo cInfo) {
        try {
            Session     session = new HibernateUtil().getSessionFactory().getCurrentSession();
            Transaction tx      = session.beginTransaction();

            session.save(cInfo);
            session.flush();
            tx.commit();
        } catch (HibernateException e) {

            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * @param cInfo
     */
    public synchronized static void updateCustomizationInfo(CustomizationInfo cInfo) {
        try {
            Session     session = new HibernateUtil().getSessionFactory().getCurrentSession();
            Transaction tx      = session.beginTransaction();

            session.update(cInfo);
            session.flush();
            tx.commit();
        } catch (HibernateException e) {

            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * @param cInfo
     */
    public synchronized static void removeCustomizationInfo(CustomizationInfo cInfo) {
        try {
            Session     session = new HibernateUtil().getSessionFactory().getCurrentSession();
            Transaction tx      = session.beginTransaction();

            session.delete(cInfo);
            session.flush();
            tx.commit();
        } catch (HibernateException e) {

            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * @param cid
     */
    public synchronized static void removeCustomizationInfo(String cid) {
        try {
            Session     session         = new HibernateUtil().getSessionFactory().getCurrentSession();
            Transaction tx              = session.beginTransaction();
            String      hqlDelete       = "delete from tr.com.srdc.icardea.careplanengine.entities.CustomizationInfo where cid="
                                          + cid + "";
            int         updatedEntities = session.createQuery(hqlDelete).executeUpdate();

            session.flush();
            tx.commit();
        } catch (HibernateException e) {

            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public synchronized static List<CustomizationInfo> retrieveCustomizationInfos(String pid, int gid) {
        List<CustomizationInfo> result1 = null;
        List<CustomizationInfo> result2 = null;

        try {
            Session     session1 = new HibernateUtil().getSessionFactory().getCurrentSession();
            Transaction tx1      = session1.beginTransaction();

            result1 = session1.createQuery(
                "SELECT ae.assignmentID FROM tr.com.srdc.icardea.careplanengine.entities.AssignmentEntity ae WHERE ae.patientCode = "
                + pid + " AND ae.guidelineEntity.guidelineID = " + gid + " ORDER BY ae.approvalDate DESC").list();
            session1.flush();
            tx1.commit();

            Session     session2 = new HibernateUtil().getSessionFactory().getCurrentSession();
            Transaction tx2      = session2.beginTransaction();

            result2 = session2.createQuery(
                "SELECT ae.customizationInfos FROM tr.com.srdc.icardea.careplanengine.entities.AssignmentEntity ae WHERE ae.assignmentID = "
                + result1.get(0)).list();
            session2.flush();
            tx2.commit();
        } catch (HibernateException e) {

            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return result2;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {}
}


//~ Formatted by Jindent --- http://www.jindent.com

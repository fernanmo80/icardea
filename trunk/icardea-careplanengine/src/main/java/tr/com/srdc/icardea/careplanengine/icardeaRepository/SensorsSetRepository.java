
/*
* Created on Jul 7, 2006
 */
package tr.com.srdc.icardea.careplanengine.icardeaRepository;

//~--- non-JDK imports --------------------------------------------------------

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import tr.com.srdc.icardea.careplanengine.entities.SensorsSetInfo;
import tr.com.srdc.icardea.careplanengine.util.HibernateUtil;

//~--- JDK imports ------------------------------------------------------------

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/**
 * @author mustafa
 * Wrapper class for the SensorsSetInfo
 */
public class SensorsSetRepository {

    /**
     * @return Vector<SensorsSetInfo>
     */
    public synchronized static Vector<SensorsSetInfo> retrieveAllSensorsSetInfos() {
        List result = null;

        try {
            Session     session = new HibernateUtil().getSessionFactory().getCurrentSession();
            Transaction tx      = session.beginTransaction();

            result =
                session.createQuery("FROM tr.com.srdc.icardea.careplanengine.entities.SensorsSetInfo order by sid asc").list();
            session.flush();
            tx.commit();
        } catch (HibernateException e) {

            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        Iterator               it  = result.iterator();
        Vector<SensorsSetInfo> vec = new Vector<SensorsSetInfo>();

        while (it.hasNext()) {
            vec.add(((SensorsSetInfo) it.next()));
        }

        return vec;
    }

    /**
     * @return SensorsSetInfo
     */
    public synchronized static SensorsSetInfo retrieveSensorsSetInfo(String sid) {
        List result = null;

        try {
            Session     session = new HibernateUtil().getSessionFactory().getCurrentSession();
            Transaction tx      = session.beginTransaction();

            result = session.createQuery("FROM tr.com.srdc.icardea.careplanengine.entities.SensorsSetInfo ssi where ssi.sid = '"
                                         + sid + "'").list();
            session.flush();
            tx.commit();
        } catch (HibernateException e) {

            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        Iterator it = result.iterator();

        if (it.hasNext()) {
            return (SensorsSetInfo) it.next();
        } else {
            return null;
        }
    }

    /**
     * @param ssInfo
     */
    public synchronized static void storeSensorsSetInfo(SensorsSetInfo ssInfo) {
        try {
            Session     session = new HibernateUtil().getSessionFactory().getCurrentSession();
            Transaction tx      = session.beginTransaction();

            session.save(ssInfo);
            session.flush();
            tx.commit();
        } catch (HibernateException e) {

            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * @param ssInfo
     */
    public synchronized static void updateSensorsSetInfo(SensorsSetInfo ssInfo) {
        try {
            Session     session = new HibernateUtil().getSessionFactory().getCurrentSession();
            Transaction tx      = session.beginTransaction();

            session.update(ssInfo);
            session.flush();
            tx.commit();
        } catch (HibernateException e) {

            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * @param ssInfo
     */
    public synchronized static void removeSensorsSetInfo(SensorsSetInfo ssInfo) {
        try {
            Session     session = new HibernateUtil().getSessionFactory().getCurrentSession();
            Transaction tx      = session.beginTransaction();

            session.delete(ssInfo);
            session.flush();
            tx.commit();
        } catch (HibernateException e) {

            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * @param sid
     */
    public synchronized static void removeSensorsSetInfo(String sid) {
        try {
            Session     session         = new HibernateUtil().getSessionFactory().getCurrentSession();
            Transaction tx              = session.beginTransaction();
            String      hqlDelete       = "delete from tr.com.srdc.icardea.careplanengine.entities.SensorsSetInfo where sid="
                                          + sid + "";
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

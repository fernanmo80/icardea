
/*
* Created on Apr 3, 2006
 */
package tr.com.srdc.icardea.careplanengine.icardeaRepository;

//~--- non-JDK imports --------------------------------------------------------

import org.hibernate.*;

import tr.com.srdc.icardea.careplanengine.entities.GuidelineEntity;
import tr.com.srdc.icardea.careplanengine.util.HibernateUtil;

//~--- JDK imports ------------------------------------------------------------

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/**
 * GuidelineRepository class is the interface for retrieving and storing
 * Guideline Entities.
 *
 * @author METU-SRDC
 * @see         <a href="mailto:icardea-technical@srdc.metu.edu.tr">Help</a>
 */
public class GuidelineRepository {

    /**
     * @return Vector<GuidelineEntity>
     */
    public synchronized static Vector<GuidelineEntity> retrieveAllGuidelineEntities() {
        List result = null;

        try {
            Session     session = new HibernateUtil().getSessionFactory().getCurrentSession();
            Transaction tx      = session.beginTransaction();

            result =
                session.createQuery(
                    "FROM tr.com.srdc.icardea.careplanengine.entities.GuidelineEntity ge where ge.guidelineID < 3 order by title asc")
                        .list();
            session.flush();
            tx.commit();
        } catch (HibernateException e) {

            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        Iterator                it  = result.iterator();
        Vector<GuidelineEntity> vec = new Vector<GuidelineEntity>();

        while (it.hasNext()) {
            vec.add(((GuidelineEntity) it.next()));
        }

        return vec;
    }

    /**
     *     @return GuidelineEntity
     */
    public synchronized static GuidelineEntity retrieveGuidelineEntity(int guidelineID) {
        List result = null;

        try {
            Session     session = new HibernateUtil().getSessionFactory().getCurrentSession();
            Transaction tx      = session.beginTransaction();

            result =
                session.createQuery("FROM tr.com.srdc.icardea.careplanengine.entities.GuidelineEntity ge where ge.guidelineID="
                                    + guidelineID + "").list();
            session.flush();
            tx.commit();
        } catch (HibernateException e) {

            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        Iterator it = result.iterator();

        if (it.hasNext()) {
            return (GuidelineEntity) it.next();
        } else {
            return null;
        }
    }

    /**
     * @param gEntity
     */
    public synchronized static void storeGuidelineEntity(GuidelineEntity gEntity) {
        try {
            Session     session = new HibernateUtil().getSessionFactory().getCurrentSession();
            Transaction tx      = session.beginTransaction();

            session.save(gEntity);
            session.flush();
            tx.commit();
        } catch (HibernateException e) {

            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * @param gEntity
     */
    public synchronized static void updateGuidelineEntity(GuidelineEntity gEntity) {
        try {
            Session     session = new HibernateUtil().getSessionFactory().getCurrentSession();
            Transaction tx      = session.beginTransaction();

            session.update(gEntity);
            session.flush();
            tx.commit();
        } catch (HibernateException e) {

            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * @param gEntity
     */
    public synchronized static void removeGuidelineEntity(GuidelineEntity gEntity) {
        try {
            Session     session = new HibernateUtil().getSessionFactory().getCurrentSession();
            Transaction tx      = session.beginTransaction();

            session.delete(gEntity);
            session.flush();
            tx.commit();
        } catch (HibernateException e) {

            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * @param guidelineID
     */
    public synchronized static void removeGuidelineEntity(int guidelineID) {
        try {
            Session     session   = new HibernateUtil().getSessionFactory().getCurrentSession();
            Transaction tx        = session.beginTransaction();
            String      hqlDelete = "delete from tr.com.srdc.icardea.careplanengine.entities.GuidelineEntity where guidelineID="
                                    + guidelineID + "";
            int updatedEntities = session.createQuery(hqlDelete).executeUpdate();

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

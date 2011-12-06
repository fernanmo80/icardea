
/*
* Created on May 4, 2006
 */
package tr.com.srdc.icardea.careplanengine.icardeaRepository;

//~--- non-JDK imports --------------------------------------------------------

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import tr.com.srdc.icardea.careplanengine.entities.MonitoringMessageEntity;
import tr.com.srdc.icardea.careplanengine.util.HibernateUtil;

//~--- JDK imports ------------------------------------------------------------

import java.sql.Timestamp;

import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/**
 * @author mustafa
 *
 */
public class MonitoringMessageRepository {

    /**
     * @return Vector<MonitoringMessageEntity>
     */
    public synchronized static Vector<MonitoringMessageEntity> retrieveAllMonitoringMessageEntities() {
        List result = null;

        try {
            Session     session = new HibernateUtil().getSessionFactory().getCurrentSession();
            Transaction tx      = session.beginTransaction();

            result =
                session.createQuery(
                    "FROM tr.com.srdc.icardea.careplanengine.entities.MonitoringMessageEntity order by executionStartTime asc")
                        .list();
            session.flush();
            tx.commit();
        } catch (HibernateException e) {

            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        Iterator                        it  = result.iterator();
        Vector<MonitoringMessageEntity> vec = new Vector<MonitoringMessageEntity>();

        while (it.hasNext()) {
            vec.add(((MonitoringMessageEntity) it.next()));
        }

        return vec;
    }

    /**
     * @return MonitoringMessageEntity
     */
    public synchronized static MonitoringMessageEntity retrieveMonitoringMessageEntity(Long mMID) {
        List result = null;

        try {
            Session     session = new HibernateUtil().getSessionFactory().getCurrentSession();
            Transaction tx      = session.beginTransaction();

            result =
                session.createQuery("FROM tr.com.srdc.icardea.careplanengine.entities.MonitoringMessageEntity mme where mme.id="
                                    + mMID + "").list();
            session.flush();
            tx.commit();
        } catch (HibernateException e) {

            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        Iterator it = result.iterator();

        if (it.hasNext()) {
            return (MonitoringMessageEntity) it.next();
        } else {
            return null;
        }
    }

    /**
     * @param MonitoringMessageEntity
     */
    public synchronized static void storeMonitoringMessageEntity(MonitoringMessageEntity mMEntity) {
        try {
            Session     session = new HibernateUtil().getSessionFactory().getCurrentSession();
            Transaction tx      = session.beginTransaction();

            session.save(mMEntity);
            session.flush();
            tx.commit();
        } catch (HibernateException e) {

            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * @param mMEntity
     */
    public synchronized static void updateMonitoringMessageEntity(MonitoringMessageEntity mMEntity) {
        try {
            Session     session = new HibernateUtil().getSessionFactory().getCurrentSession();
            Transaction tx      = session.beginTransaction();

            session.update(mMEntity);
            session.flush();
            tx.commit();
        } catch (HibernateException e) {

            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * @param mMEntity
     */
    public synchronized static void removeMonitoringMessageEntity(MonitoringMessageEntity mMEntity) {
        try {
            Session     session = new HibernateUtil().getSessionFactory().getCurrentSession();
            Transaction tx      = session.beginTransaction();

            session.delete(mMEntity);
            session.flush();
            tx.commit();
        } catch (HibernateException e) {

            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * @param mMID
     */
    public synchronized static void removeMonitoringMessageEntity(Long mMID) {
        try {
            Session     session   = new HibernateUtil().getSessionFactory().getCurrentSession();
            Transaction tx        = session.beginTransaction();
            String      hqlDelete = "delete from tr.com.srdc.icardea.careplanengine.entities.MonitoringMessageEntity where id="
                                    + mMID + "";
            int updatedEntities = session.createQuery(hqlDelete).executeUpdate();

            session.flush();
            tx.commit();
        } catch (HibernateException e) {

            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * @param   pid     Long
     * @param   gid     int
     * @param   assignmentDate  Date
     * @param   stepName        String
     *
     * @return  Vector<MonitoringMessageEntity>
     */
    public synchronized static Vector<MonitoringMessageEntity> getMonitoringMessages(Long pid, int gid,
            Date assignmentDate, String stepName) {
        Vector<MonitoringMessageEntity> messageVector  = new Vector<MonitoringMessageEntity>();
        Timestamp                       date2Timestamp = new Timestamp(assignmentDate.getTime());
        List                            result         = null;

        try {
            Session     session = new HibernateUtil().getSessionFactory().getCurrentSession();
            Transaction tx      = session.beginTransaction();

            result = session.createQuery("FROM tr.com.srdc.icardea.careplanengine.entities.MonitoringMessageEntity MME where "
                                         + "MME.assignmentEntity.pid=" + pid + " AND MME.assignmentEntity.gid=" + gid
                                         + " AND " + "MME.assignmentEntity.assignmentDate='" + date2Timestamp
                                         + "' AND MME.stepName='" + stepName
                                         + "' order by MME.messageSentDate asc").list();
            tx.commit();
        } catch (HibernateException e) {

            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        Iterator iterator = result.iterator();

        while (iterator.hasNext()) {
            MonitoringMessageEntity mme = (MonitoringMessageEntity) iterator.next();

            messageVector.add(mme);
        }

        return messageVector;
    }

    /**
     *
     * @param   pid     Long
     * @param   gid     int
     * @param   assignmentDate  Date
     *
     * @return  Vector<MonitoringMessageEntity>
     */
    public synchronized static Vector<MonitoringMessageEntity> getMonitoringMessages(Long pid, int gid,
            Date assignmentDate) {
        Vector<MonitoringMessageEntity> messageVector  = new Vector<MonitoringMessageEntity>();
        Timestamp                       date2Timestamp = new Timestamp(assignmentDate.getTime());
        List                            result         = null;

        try {
            Session     session = new HibernateUtil().getSessionFactory().getCurrentSession();
            Transaction tx      = session.beginTransaction();

            result = session.createQuery("FROM tr.com.srdc.icardea.careplanengine.entities.MonitoringMessageEntity MME where "
                                         + "MME.assignmentEntity.pid=" + pid + " AND MME.assignmentEntity.gid=" + gid
                                         + " AND " + "MME.assignmentEntity.assignmentDate='" + date2Timestamp
                                         + "' order by MME.messageSentDate asc").list();
            tx.commit();
        } catch (HibernateException e) {

            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        Iterator iterator = result.iterator();

        while (iterator.hasNext()) {
            MonitoringMessageEntity mme = (MonitoringMessageEntity) iterator.next();

            messageVector.add(mme);
        }

        return messageVector;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {

        // TODO Auto-generated method stub
    }
}


//~ Formatted by Jindent --- http://www.jindent.com

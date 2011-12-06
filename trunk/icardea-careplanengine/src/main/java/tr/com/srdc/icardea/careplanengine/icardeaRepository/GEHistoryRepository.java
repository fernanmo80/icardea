package tr.com.srdc.icardea.careplanengine.icardeaRepository;

//~--- non-JDK imports --------------------------------------------------------

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import tr.com.srdc.icardea.careplanengine.entities.AssignmentEntity;
import tr.com.srdc.icardea.careplanengine.entities.GEHistory;
import tr.com.srdc.icardea.careplanengine.entities.GEHistoryHeader;
import tr.com.srdc.icardea.careplanengine.entities.HistoryAssignmentEntity;
import tr.com.srdc.icardea.careplanengine.util.HibernateUtil;

//~--- JDK imports ------------------------------------------------------------

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class GEHistoryRepository {
    public synchronized static Long storeGEHistoryHeader(GEHistoryHeader gehHeader) {
        List result = null;

        try {
            Session     session = new HibernateUtil().getSessionFactory().getCurrentSession();
            Transaction tx      = session.beginTransaction();

            session.save(gehHeader);
            session.flush();
            tx.commit();
            session = new HibernateUtil().getSessionFactory().getCurrentSession();

            Transaction ty    = session.beginTransaction();
            String      query =
                (new StringBuffer()
                    .append(
                        "FROM tr.com.srdc.icardea.careplanengine.entities.GEHistoryHeader as GEHistoryHeader where GEHistoryHeader.assignmentID='")
                            .append(gehHeader.getAssignmentID()).append("'")).toString();

            result = session.createQuery(query).list();
            session.flush();
            ty.commit();
        } catch (HibernateException e) {

            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        Iterator it        = result.iterator();
        Long     sessionID = 0L;

        while (it.hasNext()) {
            sessionID = ((GEHistoryHeader) it.next()).getSessionID();
        }

        return sessionID;
    }

    public synchronized static void storeGEHistory(GEHistory geHistory) {
        try {
            Session     session = new HibernateUtil().getSessionFactory().getCurrentSession();
            Transaction tx      = session.beginTransaction();

            session.save(geHistory);
            session.flush();
            tx.commit();
        } catch (HibernateException e) {

            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public synchronized static Vector<GEHistoryHeader> retrieveAllGEHistoryHeaders() {
        List result = null;

        try {
            Session     session = new HibernateUtil().getSessionFactory().getCurrentSession();
            Transaction tx      = session.beginTransaction();
            Query       query   =
                session.createQuery(
                    "FROM tr.com.srdc.icardea.careplanengine.entities.GEHistoryHeader order by executionStartTime desc");

            // [olduz]
            // Since the size of the history table might be huge as time passes, a limit of 100 has been put here
            // This limit can be changed or removed completely according to the need.
            query.setMaxResults(50);
            result = query.list();
            session.flush();
            tx.commit();
        } catch (HibernateException e) {

            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        Vector<GEHistoryHeader> vec = new Vector<GEHistoryHeader>();

        if (result != null) {
            Iterator it = result.iterator();

            while (it.hasNext()) {
                vec.add(((GEHistoryHeader) it.next()));
            }
        }

        return vec;
    }

    public synchronized static AssignmentEntity retrieveSubguidelineAssignment(String assignmentID) {
        List        result  = null;
        Session     session = new HibernateUtil().getSessionFactory().getCurrentSession();
        Transaction tx      = session.beginTransaction();
        String      query   =
            (new StringBuffer()
                .append(
                    "FROM tr.com.srdc.icardea.careplanengine.entities.AssignmentEntity as ExecutedAssignments where ExecutedAssignments.assignmentID='")
                        .append(assignmentID).append("'")).toString();

        result = session.createQuery(query).list();
        session.flush();
        tx.commit();

        Iterator         it         = result.iterator();
        AssignmentEntity assignment = null;

        while (it.hasNext()) {
            assignment = (AssignmentEntity) it.next();
        }

        return assignment;
    }

    public synchronized static Vector<HistoryAssignmentEntity> retrieveAssignmentEntitiesByID(
            Vector<GEHistoryHeader> historyHeaders) {
        List                            result              = null;
        Vector<HistoryAssignmentEntity> executedAssignments = new Vector<HistoryAssignmentEntity>();

        try {
            Iterator headerIterator = historyHeaders.iterator();

            while (headerIterator.hasNext()) {
                Session         session       = new HibernateUtil().getSessionFactory().getCurrentSession();
                GEHistoryHeader currentHeader = (GEHistoryHeader) headerIterator.next();
                Transaction     tx            = session.beginTransaction();

                /**
                 *  Retrive AssignmentEntity from ICARDEA Repository by History Header assignmentID
                 */
                String query =
                    (new StringBuffer()
                        .append(
                            "FROM tr.com.srdc.icardea.careplanengine.entities.AssignmentEntity as ExecutedAssignments where ExecutedAssignments.assignmentID='")
                                .append(currentHeader.getAssignmentID())
                                .append("' order by ExecutedAssignments.assignmentID asc")).toString();

                result = session.createQuery(query).list();
                session.flush();
                tx.commit();

                Iterator it = result.iterator();

                while (it.hasNext()) {
                    AssignmentEntity assignment = (AssignmentEntity) it.next();

                    assignment.setStartToExecutionDate(currentHeader.getExecutionStartTime());
                    executedAssignments.add(new HistoryAssignmentEntity(assignment, currentHeader.getSessionID()));
                }
            }
        } catch (HibernateException e) {

            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return executedAssignments;
    }

    public synchronized static Vector<GEHistory> retrieveGEHistoryBySessionID(Long sessionID) {
        List result = null;

        try {
            Session     session = new HibernateUtil().getSessionFactory().getCurrentSession();
            Transaction tx      = session.beginTransaction();

            result = session.createQuery(
                "FROM tr.com.srdc.icardea.careplanengine.entities.GEHistory as GEHistory where GEHistory.sessionID=" + sessionID
                + " order by messageReceivedTime asc").list();
            session.flush();
            tx.commit();
        } catch (HibernateException e) {

            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        Iterator          it  = result.iterator();
        Vector<GEHistory> vec = new Vector<GEHistory>();

        while (it.hasNext()) {
            GEHistory currentHistoryEntity = (GEHistory) it.next();

            /*
             *       Logger.getLogger(this.getClass()).log(Level.DEBUG, ("**********--------------**********\n");
             * Logger.getLogger(this.getClass()).log(Level.DEBUG, (currentHistoryEntity.getSessionID());
             * Logger.getLogger(this.getClass()).log(Level.DEBUG, (currentHistoryEntity.getCol1());
             * Logger.getLogger(this.getClass()).log(Level.DEBUG, (currentHistoryEntity.getCol2());
             * Logger.getLogger(this.getClass()).log(Level.DEBUG, (currentHistoryEntity.getCol3());
             * Logger.getLogger(this.getClass()).log(Level.DEBUG, (currentHistoryEntity.getCol4());
             * Logger.getLogger(this.getClass()).log(Level.DEBUG, (currentHistoryEntity.getMessageReceivedTime());
             */
            vec.add(currentHistoryEntity);
        }

        return vec;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com

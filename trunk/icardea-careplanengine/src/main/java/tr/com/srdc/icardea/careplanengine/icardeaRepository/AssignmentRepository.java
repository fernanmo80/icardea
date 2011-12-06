package tr.com.srdc.icardea.careplanengine.icardeaRepository;

//~--- non-JDK imports --------------------------------------------------------

import org.hibernate.*;

import tr.com.srdc.icardea.careplanengine.entities.*;
import tr.com.srdc.icardea.careplanengine.util.HibernateUtil;

//~--- JDK imports ------------------------------------------------------------

import java.sql.Timestamp;

import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/**
 *
 * AssignmentRepository is the wrapper class of the ICARDEA System
 * for storing persistent java objects into the low level part of the repository, Relational
 * DB. ICARDEARepository uses the functionalities of Hibernate to map classes with DB Tables.
 * The top view is like that;<br></br>
 * <b>
 * Persistent Objects <-> ICARDEARepository <-> Hibernate <-> Relational DB
 * </b>
 *
 * @author      METU-SRDC
 * @see         #package com.srdc.icardea.careplanengine.util.HibernateUtil
 * @see         <a href="mailto:icardea-technical@srdc.metu.edu.tr">Help</a>
 */
public class AssignmentRepository {

    /**
     * @return Vector<AssignmentEntity>
     */
    public synchronized static Vector<AssignmentEntity> retrieveAllAssignmentEntities() {
        List result = null;

        try {
            Session     session = new HibernateUtil().getSessionFactory().getCurrentSession();
            Transaction tx      = session.beginTransaction();

            result =
                session.createQuery(
                    "FROM tr.com.srdc.icardea.careplanengine.entities.AssignmentEntity ae where ae.guidelineEntity.guidelineID<>0 AND ae.active='true' order by ae.assignmentID asc")
                        .list();
            session.flush();
            tx.commit();
        } catch (HibernateException e) {

            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        Iterator                 it  = result.iterator();
        Vector<AssignmentEntity> vec = new Vector<AssignmentEntity>();

        while (it.hasNext()) {
            vec.add(((AssignmentEntity) it.next()));
        }

        return vec;
    }

    /**
     * @return Vector<AssignmentEntity>
     */
    public synchronized static Vector<AssignmentEntity> retrieveApprovedAssignmentEntities() {
        List result = null;

        try {
            Session     session = new HibernateUtil().getSessionFactory().getCurrentSession();
            Transaction tx      = session.beginTransaction();

            result =
                session.createQuery(
                    "FROM tr.com.srdc.icardea.careplanengine.entities.AssignmentEntity ae where ae.status=2 AND ae.guidelineEntity.guidelineID<>0 AND ae.active='true' order by assignmentID asc")
                        .list();
            session.flush();
            tx.commit();
        } catch (HibernateException e) {

            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        Iterator                 it  = result.iterator();
        Vector<AssignmentEntity> vec = new Vector<AssignmentEntity>();

        while (it.hasNext()) {
            vec.add(((AssignmentEntity) it.next()));
        }

        return vec;
    }

    /**
     *
     *
     * @param patientID String
     * @return Vector of Assignment Entities
     */
    public synchronized static Vector getAssociateAssignmentsOfAPatient(long patientCode) {
        Session session = new HibernateUtil().getSessionFactory().getCurrentSession();

        session.beginTransaction();

        List result =
            session.createQuery(
                "FROM tr.com.srdc.icardea.careplanengine.entities.AssignmentEntity ae where ae.active='true' AND ae.guidelineEntity.guidelineID>2 AND ae.patientCode = "
                + patientCode + "").list();

        session.getTransaction().commit();

        Iterator it  = result.iterator();
        Vector   vec = new Vector();

        while (it.hasNext()) {
            vec.add(((AssignmentEntity) it.next()));
        }

        return vec;
    }

    /**
     *     @param aEntity
     */
    public synchronized static void storeAssignment(AssignmentEntity aEntity) {
        try {
            Session     session = new HibernateUtil().getSessionFactory().getCurrentSession();
            Transaction tx      = session.beginTransaction();

            session.save(aEntity);
            session.flush();
            tx.commit();
        } catch (HibernateException e) {

            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /*
     *    public synchronized static void storeAssignment(PatientEntity pEntity, GuidelineEntity gEntity, UserInfo assignedBy, UserInfo approvedBy,
     *                  Date assignmentDate, Date approvalDate, Date executionDate) {
     *
     *      Session session = new HibernateUtil().getSessionFactory().getCurrentSession();
     *
     *      session.beginTransaction();
     *
     *      AssignmentEntity assignmentEntity = new AssignmentEntity(pEntity.getPcode(), gEntity, assignmentDate);
     *
     *      assignmentEntity.setStatus(0);
     *
     *      assignmentEntity.setApprovedBy(approvedBy);
     *
     *      assignmentEntity.setAssignedBy(assignedBy);
     *
     *      assignmentEntity.setAssignmentDate(assignmentDate);
     *
     *      assignmentEntity.setApprovalDate(approvalDate);
     *
     *      assignmentEntity.setStartToExecutionDate(executionDate);
     *
     *      session.save(assignmentEntity);
     *
     *      session.getTransaction().commit();
     *  }
     */

    /**
     * returns blank assignments of a patient
     * which is identified by her pid in filterPatientData
     *
     * @param filterPatientData     PatientEntity
     * @return Vector of Assignment entities
     */

    /*
     *   public synchronized static Vector getBlankAssignments(PatientEntity filterPatientData) {
     *
     *     Session session = new HibernateUtil().getSessionFactory().getCurrentSession();
     *
     *     session.beginTransaction();
     *
     *     Vector vec = new Vector();
     *
     *     List result = session.createQuery("from com.srdc.icardea.careplanengine.entities.AssignmentEntity ae where ae.guidelineEntity.guidelineID<>0 AND ae.patientCode= " +
     *                     filterPatientData.getPcode().longValue() + " AND ae.status=0").list();
     *
     *     session.getTransaction().commit();
     *
     *     Iterator it = result.iterator();
     *
     *     while(it.hasNext()) {
     *
     *             vec.add(((AssignmentEntity) it.next()));
     *     }
     *
     *     return vec;
     * }
     */

    /**
     * @param aEntity
     */
    public synchronized static void updateAssignmentEntity(AssignmentEntity aEntity) {
        try {
            Session     session = new HibernateUtil().getSessionFactory().getCurrentSession();
            Transaction tx      = session.beginTransaction();

            session.update(aEntity);
            session.flush();
            tx.commit();
        } catch (HibernateException e) {

            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * returns filled assignments of a patient
     * which is identified by her pid in filterPatientData
     *
     * @param filterPatientData PatientEntity
     * @return Vector of Assignment Entities
     */

    /*
     *    public synchronized static Vector getFilledAssignments(PatientEntity filterPatientData) {
     *
     *      Session session = new HibernateUtil().getSessionFactory().getCurrentSession();
     *
     *      session.beginTransaction();
     *
     *      Vector vec = new Vector();
     *
     *      List result = session.createQuery("from com.srdc.icardea.careplanengine.entities.AssignmentEntity ae where ae.guidelineEntity.guidelineID<>0 AND ae.patientCode= " +
     *                      filterPatientData.getPcode().longValue() + " AND ae.status=1").list();
     *
     *      session.getTransaction().commit();
     *
     *      Iterator it = result.iterator();
     *
     *      while(it.hasNext()) {
     *
     *              vec.add(((AssignmentEntity) it.next()));
     *      }
     *
     *      return vec;
     *  }
     */
}


//~ Formatted by Jindent --- http://www.jindent.com

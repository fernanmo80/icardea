
/*
* Created on Jul 7, 2006
 */
package tr.com.srdc.icardea.careplanengine.icardeaRepository;

//~--- non-JDK imports --------------------------------------------------------

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import tr.com.srdc.icardea.careplanengine.entities.UserInfo;
import tr.com.srdc.icardea.careplanengine.entities.UserRole;
import tr.com.srdc.icardea.careplanengine.util.HibernateUtil;

//~--- JDK imports ------------------------------------------------------------

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/**
 * @author mustafa
 * Wrapper class for the UserInfo
 *
 */
public class UserRepository {

    /**
     * @return Vector<UserInfo>
     */
    public synchronized static Vector<UserInfo> retrieveAllUserInfos() {
        List result = null;

        try {
            Session     session = new HibernateUtil().getSessionFactory2().getCurrentSession();
            Transaction tx      = session.beginTransaction();

            result = session.createQuery(
                "SELECT ui, ur FROM tr.com.srdc.icardea.careplanengine.entities.UserInfo ui, "
                + "tr.com.srdc.icardea.careplanengine.entities.UserRole ur,  tr.com.srdc.icardea.careplanengine.entities.UserAuthorityRole uar "
                + "WHERE ui.userID = uar.authorityID AND uar.roleID = ur.roleID").list();
            session.flush();
            tx.commit();
        } catch (HibernateException e) {

            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        Iterator         it  = result.iterator();
        Vector<UserInfo> vec = new Vector<UserInfo>();

        while (it.hasNext()) {
            Object[] oa = (Object[]) it.next();
            UserInfo ui = (UserInfo) oa[0];    // first element is the UserInfo

            for (int i = 1; i < oa.length; i++) {
                UserRole ur = (UserRole) oa[i];

                ui.addRoleName(ur.getRoleName());

                if (ur.getInformation() != null) {
                    ui.addRoleInfo(ur.getInformation());
                } else {
                    ui.addRoleInfo("");
                }
            }

            vec.add(ui);
        }

        return vec;
    }

    /**
     * @return UserInfo
     */
    public synchronized static UserInfo retrieveUserInfo(String userName) {
        List result = null;

        try {
            Session     session = new HibernateUtil().getSessionFactory2().getCurrentSession();
            Transaction tx      = session.beginTransaction();

            result = session.createQuery(
                "SELECT ui, ur FROM tr.com.srdc.icardea.careplanengine.entities.UserInfo ui, "
                + "tr.com.srdc.icardea.careplanengine.entities.UserRole ur,  tr.com.srdc.icardea.careplanengine.entities.UserAuthorityRole uar "
                + "WHERE ui.userName = '" + userName
                + "' AND ui.userID = uar.authorityID AND uar.roleID = ur.roleID").list();
            session.flush();
            tx.commit();
        } catch (HibernateException e) {

            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        Iterator it = result.iterator();

        if (it.hasNext()) {
            Object[] oa = (Object[]) it.next();
            UserInfo ui = (UserInfo) oa[0];    // first element is the UserInfo

            for (int i = 1; i < oa.length; i++) {
                UserRole ur = (UserRole) oa[i];

                ui.addRoleName(ur.getRoleName());

                if (ur.getInformation() != null) {
                    ui.addRoleInfo(ur.getInformation());
                } else {
                    ui.addRoleInfo("");
                }
            }

            return ui;
        } else {
            return null;
        }
    }

    /**
     * @return UserInfo
     */
    public synchronized static UserInfo checkUserInfo(String userName, String password) {
        List result = null;

        try {
            Session     session = new HibernateUtil().getSessionFactory2().getCurrentSession();
            Transaction tx      = session.beginTransaction();

            result = session.createQuery(
                "SELECT ui, ur FROM tr.com.srdc.icardea.careplanengine.entities.UserInfo ui, "
                + "tr.com.srdc.icardea.careplanengine.entities.UserRole ur,  tr.com.srdc.icardea.careplanengine.entities.UserAuthorityRole uar "
                + "WHERE ui.userName = '" + userName + "' AND ui.password = '" + password
                + "' AND ui.userID = uar.authorityID AND uar.roleID = ur.roleID").list();
            session.flush();
            tx.commit();
        } catch (HibernateException e) {

            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        Iterator it = result.iterator();

        if (it.hasNext()) {
            Object[] oa = (Object[]) it.next();
            UserInfo ui = (UserInfo) oa[0];    // first element is the UserInfo

            for (int i = 1; i < oa.length; i++) {
                UserRole ur = (UserRole) oa[i];

                ui.addRoleName(ur.getRoleName());

                if (ur.getInformation() != null) {
                    ui.addRoleInfo(ur.getInformation());
                } else {
                    ui.addRoleInfo("");
                }
            }

            return ui;
        } else {
            return null;
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com

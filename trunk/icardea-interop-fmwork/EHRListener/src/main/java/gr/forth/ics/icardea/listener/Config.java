/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package gr.forth.ics.icardea.listener;
import java.io.File;
import java.util.concurrent.atomic.AtomicInteger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author petrakis
 */
public class Config {
    public static AtomicInteger pixquery_time=new AtomicInteger();
    public static AtomicInteger xds_time=new AtomicInteger();
    public static AtomicInteger all_time=new AtomicInteger();
    public static AtomicInteger iterations= new AtomicInteger();
    public static String GetSetting(String key){
        try {
          File file = new File("app.config.xml");
          DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
          DocumentBuilder db = dbf.newDocumentBuilder();
          Document doc = db.parse(file);
          doc.getDocumentElement().normalize();
          NodeList nodeLst = doc.getElementsByTagName(key);
          Node fstNode = nodeLst.item(0);
          return fstNode.getTextContent().trim();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}




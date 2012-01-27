package tr.com.srdc.icardea.platform.service.careplan;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.security.Security;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.net.*;
import java.io.*;

import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import com.hp.hpl.jena.sparql.util.Base64.InputStream;

import tr.com.srdc.icardea.careplanengine.glif.generator.GlifGenerator;
import tr.com.srdc.icardea.hibernate.ICardeaPersistentManager;
import tr.com.srdc.icardea.hibernate.MedicalCareplanTemplate;
import tr.com.srdc.icardea.hibernate.MedicalCareplanTemplateCriteria;
import tr.com.srdc.icardea.platform.model.careplan.MedicalCareplan;
import tr.com.srdc.icardea.platform.service.careplan.CareplanRepositoryService;

/**
 * Dummy implementation of {@link CareplanRepositoryService}.
 * 
 * @author cihancimen
 * 
 */
public class CareplanRepositoryServiceImpl implements
	CareplanRepositoryService {
	
	private static String readFile(String path) throws IOException {
	FileInputStream stream = new FileInputStream(new File(path));
	  try {
	    FileChannel fc = stream.getChannel();
	    MappedByteBuffer bb = fc.map(FileChannel.MapMode.READ_ONLY, 0, fc.size());
	    /* Instead of using default, pass in a decoder. */
	    return Charset.defaultCharset().decode(bb).toString();
	  }
	  finally {
	    stream.close();
	  }
	}
	
	private void sslSetup() {
		boolean atnatls = new Boolean(ResourceBundle.getBundle("icardea")
				.getString("atna.tls")).booleanValue();
		if (atnatls) {
			// Properties for SSL Security Provider
			System.out.println(" $$$$ SECURE COMMUNICATION .....");
			String protocolProp = "java.protocol.handler.pkgs";
			String sunSSLProtocol = "com.sun.net.ssl.internal.www.protocol";
			String sslStoreProp = "javax.net.ssl.trustStore";
			String certPath = ResourceBundle.getBundle("icardea").getString("icardea.home") + "/icardea-caremanager-ws/src/test/resources/jssecacerts";

			// Enable SSL communication
			System.setProperty(protocolProp, sunSSLProtocol);
			Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
			System.setProperty(sslStoreProp, certPath);
			System.setProperty("javax.net.ssl.trustStorePassword", "srdcpass");
		}
	}
	@Override
	public synchronized List<MedicalCareplan> listCareplans() {
		sslSetup();
		MedicalCareplanTemplate[] careplans = null;
		ResourceBundle properties = ResourceBundle.getBundle("icardea");
		String homeDirectory = properties.getString("icardea.home");
		String salkServer = properties.getString("salk.server");
		String securePort = properties.getString("secure.port");
		
		try {
			careplans = MedicalCareplanTemplate.listMedicalCareplanTemplateByQuery(null, null);

			System.out.println("careplans.length initial: " + careplans.length);
			// TODO: Delete in the future
			if (careplans.length == 0) {
				careplans = new MedicalCareplanTemplate[2];
				PersistentTransaction transaction = ICardeaPersistentManager.instance().getSession().beginTransaction();
				MedicalCareplanTemplate mct = new MedicalCareplanTemplate();
				System.out.println("Storing AF Careplan...");
				mct.setIdentifier("1");
				mct.setName("Management of AF");
				mct.setContent(salkServer+":"+securePort+"/icardea/guidelines/icardea/ManagementofAF-1.owl");
				try {
					mct.setDiagram(readFile(homeDirectory+"\\icardea-careplanengine\\src\\main\\resources\\guideline\\ManagementofAF-1.dgr"));
					//System.out.println("##diagram : "+mct2.getDiagram());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					mct.setCareplan(readFile(homeDirectory+"\\icardea-careplanengine\\src\\main\\resources\\guideline\\ManagementofAF-1.cp"));
					//System.out.println("##careplan : "+mct2.getCareplan());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				mct.save();
				careplans[0] = mct;

				System.out.println("Storing VT Careplan...");

				MedicalCareplanTemplate mct2 = new MedicalCareplanTemplate();
				mct2.setIdentifier("2");
				mct2.setName("Management of VT");
				mct2.setContent(salkServer+":"+securePort+"/icardea/guidelines/icardea/ManagementofVT-2.owl");
				//TODO
				try {
					mct2.setDiagram(readFile(homeDirectory+"\\icardea-careplanengine\\src\\main\\resources\\guideline\\ManagementofVT-2.dgr"));
					//System.out.println("##diagram : "+mct2.getDiagram());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					mct2.setCareplan(readFile(homeDirectory+"\\icardea-careplanengine\\src\\main\\resources\\guideline\\ManagementofVT-2.cp"));
					//System.out.println("##careplan : "+mct2.getCareplan());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//TODO
				mct2.save();
				careplans[1] = mct2;
				transaction.commit();
				System.out.println("Done");
			}
			//

		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<MedicalCareplan> result = new ArrayList();
		String[] st;
		System.out.println("careplans.length new: " + careplans.length);
		for (int i = 0; i < careplans.length; i++) {
			MedicalCareplanTemplate careplan = careplans[i];
			MedicalCareplan toBeFilledCareplan = new MedicalCareplan();
			toBeFilledCareplan.setId(careplan.getIdentifier());
			toBeFilledCareplan.setName(careplan.getName());
			toBeFilledCareplan.setUrl(careplan.getContent());
			String content = careplan.getContent();
			if(content != null){
				st = content.split("owl");	
				String cname = st[0]+"cp";
				String dname = st[0]+"dgr";
				//System.out.println("cname: " + cname);
				//System.out.println("dname: " + dname);
				
				cname = cname.replace("https", "http");
				cname = cname.replace("8443", "8080");
				dname = dname.replace("https", "http");
				dname = dname.replace("8443", "8080");
				URL url;
				try {
					url = new URL(cname);
					BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
					String inputLine = "";
					String cp = "";
					  while ((inputLine = in.readLine()) != null)
					  {
						  cp = cp +inputLine;	
						  
					  }
					  careplan.setCareplan(cp);
					  toBeFilledCareplan.setCareplan(cp);
					  in.close();
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}				
				try {
					url = new URL(dname);
					BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
					String inputLine = "";
					String cp = "";
					  while ((inputLine = in.readLine()) != null)
					  {
						  cp = cp + inputLine;							  
					  }
					  careplan.setDiagram(cp);
					  toBeFilledCareplan.setDiagram(cp);
					  in.close();
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			result.add(toBeFilledCareplan);
		}
		return result;
	}

	@Override
	public synchronized List<MedicalCareplan> createCareplan(
		MedicalCareplan careplan) {
		
		try {
			System.out.println(" $$$ Creating careplan in DB:"
				+ careplan.getName());
			PersistentTransaction transaction = ICardeaPersistentManager.instance().getSession().beginTransaction();
			MedicalCareplanTemplate toBeSaved = new MedicalCareplanTemplate();


			System.out.println(" $$$ Creating glif definition:" + careplan.getName());
//			String xmlContent = careplan.getCareplan();
//			String diagramContent = careplan.getDiagram();
//			GlifGenerator gg = new GlifGenerator();
//			String careplanOwlUrl =
//				gg.generateGlifFromXMLContent(xmlContent, careplan.getName(),
//				careplan.getId(), diagramContent);
//			toBeSaved.setContent(careplanOwlUrl);

			toBeSaved.setIdentifier(careplan.getId());
			toBeSaved.setName(careplan.getName());

			// TODO: Delete in the future
			ResourceBundle properties = ResourceBundle.getBundle("icardea");
			String username = properties.getString("mysql.username");
			String password = properties.getString("mysql.password");
			String url = properties.getString("mysql.host");
			String jdbcDriver = properties.getString("jdbc.driverClassName");
			String jdbcURL = "jdbc:mysql://" + url
				+ "/final_icardea_repository";
			try {
				Class.forName(jdbcDriver).newInstance();
				Connection conn = DriverManager.getConnection(jdbcURL,
					username, password);
				Statement s = conn.createStatement();
				ResultSet resultSet = s.executeQuery("select guideline_id from guideline_entity where guideline_id = (select max(guideline_id) from  guideline_entity)");
				int id = 1;
				if (resultSet.next()) {
					id = resultSet.getInt("guideline_id");
					id++;
				}
				s.close();
				s = conn.createStatement();

				s.executeUpdate("INSERT INTO guideline_entity VALUES (" + id
					+ ",'" + careplan.getName() + "','0.1','SRDC','"
					+ careplan.getUrl() + "','ICARDEA_GUIDELINE_Instance_1')");
				s.close();
				conn.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// TODO

			toBeSaved.save();
			transaction.commit();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listCareplans();
	}

	@Override
	public synchronized List<MedicalCareplan> updateCareplan(
		MedicalCareplan careplan) {
		
		try {
			System.out.println(" $$$ Updating careplan in DB:"
				+ careplan.getName());
			
			System.out.println(" $$$ careplan content:"
					+ careplan.getCareplan());
			PersistentTransaction transaction = ICardeaPersistentManager.instance().getSession().beginTransaction();
			MedicalCareplanTemplateCriteria medicalCareplanTemplateCriteria = new MedicalCareplanTemplateCriteria();
			medicalCareplanTemplateCriteria.identifier.eq(careplan.getId());
			MedicalCareplanTemplate toBeSaved = MedicalCareplanTemplate.listMedicalCareplanTemplateByCriteria(medicalCareplanTemplateCriteria)[0];

			String xmlContent = careplan.getCareplan();
			String diagramContent = careplan.getDiagram();
			GlifGenerator gg = new GlifGenerator();
			String careplanOwlUrl = gg.generateGlifFromXMLContent(xmlContent,
				careplan.getName(), careplan.getId(), diagramContent);

			toBeSaved.setContent(careplanOwlUrl);
			toBeSaved.setIdentifier(careplan.getId());
			toBeSaved.setName(careplan.getName());
			toBeSaved.save();
			transaction.commit();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listCareplans();
	}

	@Override
	public synchronized List<MedicalCareplan> deleteCareplan(
		MedicalCareplan careplan) {
		
		try {
			System.out.println(" $$$ Deleting careplan in DB:"
				+ careplan.getName());
			PersistentTransaction transaction = ICardeaPersistentManager.instance().getSession().beginTransaction();
			MedicalCareplanTemplateCriteria medicalCareplanTemplateCriteria = new MedicalCareplanTemplateCriteria();
			medicalCareplanTemplateCriteria.identifier.eq(careplan.getId());
			MedicalCareplanTemplate toBeSaved = MedicalCareplanTemplate.listMedicalCareplanTemplateByCriteria(medicalCareplanTemplateCriteria)[0];

			toBeSaved.delete();
			transaction.commit();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return listCareplans();

	}
}

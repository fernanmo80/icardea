package tr.com.srdc.icardea.platform.service.dummy;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import tr.com.srdc.icardea.careplanengine.glif.generator.GlifGenerator;
import tr.com.srdc.icardea.hibernate.ICardeaPersistentManager;
import tr.com.srdc.icardea.hibernate.MedicalCareplanTemplate;
import tr.com.srdc.icardea.hibernate.MedicalCareplanTemplateCriteria;
import tr.com.srdc.icardea.platform.model.careplan.MedicalCareplan;
import tr.com.srdc.icardea.platform.service.CareplanRepositoryService;

/**
 * Dummy implementation of {@link CareplanRepositoryService}.
 * 
 * @author cihancimen
 * 
 */
public class DummyCareplanRepositoryServiceImpl implements
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
	@Override
	public synchronized List<MedicalCareplan> listCareplans() {
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
				mct.save();
				careplans[0] = mct;

				System.out.println("Storing VT Careplan...");

				MedicalCareplanTemplate mct2 = new MedicalCareplanTemplate();
				mct2.setIdentifier("2");
				mct2.setName("Management of VT");
				mct2.setContent(salkServer+":"+securePort+"/icardea/guidelines/icardea/ManagementofVT-2.owl");
				//TODO
				try {
					mct2.setDiagram(readFile(homeDirectory+"\\icardea-careplanengine\\src\\main\\resources\\guideline\\diagram"));
					//System.out.println("##diagram : "+mct2.getDiagram());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					mct2.setCareplan(readFile(homeDirectory+"\\icardea-careplanengine\\src\\main\\resources\\guideline\\careplan"));
					//System.out.println("##careplan : "+mct2.getCareplan());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//TODO
				mct2.save();
				careplans[1] = mct2;

				/*System.out.println("Storing VT Short Careplan...");
				
				MedicalCareplanTemplate mct3 = new MedicalCareplanTemplate();
				mct3.setIdentifier("3");
				mct3.setName("Management of VT Short");
				mct3.setContent("http://localhost:8080/icardea/guidelines/icardea/VTShortCareplan.owl");
				mct3.save();
				careplans[2] = mct3;*/

				transaction.commit();

				System.out.println("Done");
			}
			//

		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<MedicalCareplan> result = new ArrayList();
		System.out.println("careplans.length new: " + careplans.length);
		for (int i = 0; i < careplans.length; i++) {
			MedicalCareplanTemplate careplan = careplans[i];
			MedicalCareplan toBeFilledCareplan = new MedicalCareplan();
			toBeFilledCareplan.setId(careplan.getIdentifier());
			toBeFilledCareplan.setName(careplan.getName());
			toBeFilledCareplan.setUrl(careplan.getContent());
			toBeFilledCareplan.setCareplan(careplan.getCareplan());
			//System.out.println("set careplan: "+careplan.getCareplan());
			toBeFilledCareplan.setDiagram(careplan.getDiagram());
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
			String xmlContent = careplan.getCareplan();
			String diagramContent = careplan.getDiagram();
			GlifGenerator gg = new GlifGenerator();
			String careplanOwlUrl =
				gg.generateGlifFromXMLContent(xmlContent, careplan.getName(),
				careplan.getId(), diagramContent);

			toBeSaved.setContent(careplanOwlUrl);

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

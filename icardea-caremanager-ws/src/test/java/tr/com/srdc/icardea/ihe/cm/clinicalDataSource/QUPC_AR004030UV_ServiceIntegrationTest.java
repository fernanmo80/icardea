/**
 * QUPC_AR004030UV_ServiceIntegrationTest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.1  Built on : Oct 19, 2009 (10:59:00 EDT)
 */
package tr.com.srdc.icardea.ihe.cm.clinicalDataSource;

import java.io.InputStream;
import java.util.List;
import java.util.ResourceBundle;

import javax.xml.bind.*;
import org.hl7.v3.IVLTS;
import org.hl7.v3.IVXBTS;
import org.hl7.v3.ObjectFactory;
import org.hl7.v3.POCDMT000040SubstanceAdministration;
import org.hl7.v3.REPCMT004000UV01PertinentInformation5;
import org.hl7.v3.SXCMTS;
import org.junit.BeforeClass;
import org.junit.Test;
import java.security.Security;

/*
 *  QUPC_AR004030UV_ServiceIntegrationTest Junit test case
 */

public class QUPC_AR004030UV_ServiceIntegrationTest {

	// ************** FOR AF

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

	//@Test
	public void testqUPC_AR004030UV_QUPC_IN043200UV_PHR_Problems()
			throws java.lang.Exception {

		sslSetup();
		tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub stub = new tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub();

		org.hl7.v3.QUPCIN043200UV01 query = (org.hl7.v3.QUPCIN043200UV01) getTestObject(org.hl7.v3.QUPCIN043200UV01.class);
		InputStream is = this
				.getClass()
				.getClassLoader()
				.getResourceAsStream(
						"messageTemplatesFromEHR-PHR/PHR/PCC-10-Input-Scenario-Problems.xml");

		JAXBContext context = JAXBContext.newInstance("org.hl7.v3");
		Unmarshaller unmarshaller = context.createUnmarshaller();
		query = (org.hl7.v3.QUPCIN043200UV01) unmarshaller.unmarshal(is);

		stub.qUPC_AR004030UV_QUPC_IN043200UV(query);
	}

	// @Test
	public void testqUPC_AR004030UV_QUPC_IN043200UV_PHR_Problems2()
			throws java.lang.Exception {
		sslSetup();
		tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub stub = new tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub();//

		org.hl7.v3.QUPCIN043200UV01 query = (org.hl7.v3.QUPCIN043200UV01) getTestObject(org.hl7.v3.QUPCIN043200UV01.class);
		InputStream is = this
				.getClass()
				.getClassLoader()
				.getResourceAsStream(
						"messageTemplatesFromEHR-PHR/PHR/PCC-10-Input-Scenario-Problems2.xml");

		JAXBContext context = JAXBContext.newInstance("org.hl7.v3");
		Unmarshaller unmarshaller = context.createUnmarshaller();
		query = (org.hl7.v3.QUPCIN043200UV01) unmarshaller.unmarshal(is);

		stub.qUPC_AR004030UV_QUPC_IN043200UV(query);
	}

	// @Test
	public void testqUPC_AR004030UV_QUPC_IN043200UV_PHR_DailyLiving()
			throws java.lang.Exception {
		sslSetup();
		tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub stub = new tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub();//

		org.hl7.v3.QUPCIN043200UV01 query = (org.hl7.v3.QUPCIN043200UV01) getTestObject(org.hl7.v3.QUPCIN043200UV01.class);
		InputStream is = this
				.getClass()
				.getClassLoader()
				.getResourceAsStream(
						"messageTemplatesFromEHR-PHR/PHR/PCC-10-Input-Scenario-DailyLiving.xml");

		JAXBContext context = JAXBContext.newInstance("org.hl7.v3");
		Unmarshaller unmarshaller = context.createUnmarshaller();
		query = (org.hl7.v3.QUPCIN043200UV01) unmarshaller.unmarshal(is);

		stub.qUPC_AR004030UV_QUPC_IN043200UV(query);
	}

	// @Test
	public void testqUPC_AR004030UV_QUPC_IN043200UV_PHR_Medications()
			throws java.lang.Exception {
		sslSetup();
		tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub stub = new tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub();//

		org.hl7.v3.QUPCIN043200UV01 query = (org.hl7.v3.QUPCIN043200UV01) getTestObject(org.hl7.v3.QUPCIN043200UV01.class);
		InputStream is = this
				.getClass()
				.getClassLoader()
				.getResourceAsStream(
						"messageTemplatesFromEHR-PHR/PHR/PCC-10-Input-Scenario-Medications.xml");

		JAXBContext context = JAXBContext.newInstance("org.hl7.v3");
		Unmarshaller unmarshaller = context.createUnmarshaller();
		query = (org.hl7.v3.QUPCIN043200UV01) unmarshaller.unmarshal(is);
		List<REPCMT004000UV01PertinentInformation5> pertinentInformation3 = query
				.getControlActProcess().getSubject().get(0)
				.getRegistrationEvent().getSubject2().getCareProvisionEvent()
				.getPertinentInformation3();

		for (int i = 0; i < pertinentInformation3.size(); i++) {
			REPCMT004000UV01PertinentInformation5 pi = pertinentInformation3
					.get(i);
			POCDMT000040SubstanceAdministration sa = pi
					.getSubstanceAdministration().getValue();
			List<SXCMTS> effectiveTime = sa.getEffectiveTime();

			ObjectFactory of = new ObjectFactory();
			IVLTS ivlts = of.createIVLTS();
			IVXBTS low = of.createIVXBTS();
			low.setValue("199910101010");
			IVXBTS high = of.createIVXBTS();
			high.setValue("201010101010");
			ivlts.getRest().add(of.createIVLTSLow(low));
			ivlts.getRest().add(of.createIVLTSHigh(high));

			effectiveTime.add(0, ivlts);
		}

		stub.qUPC_AR004030UV_QUPC_IN043200UV(query);
	}

	// @Test
	public void testqUPC_AR004030UV_QUPC_IN043200UV_PHR_VitalSigns()
			throws java.lang.Exception {
		sslSetup();
		tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub stub = new tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub();//

		org.hl7.v3.QUPCIN043200UV01 query = (org.hl7.v3.QUPCIN043200UV01) getTestObject(org.hl7.v3.QUPCIN043200UV01.class);
		InputStream is = this
				.getClass()
				.getClassLoader()
				.getResourceAsStream(
						"messageTemplatesFromEHR-PHR/PHR/PCC-10-Input-Scenario-VitalSign.xml");

		JAXBContext context = JAXBContext.newInstance("org.hl7.v3");
		Unmarshaller unmarshaller = context.createUnmarshaller();
		query = (org.hl7.v3.QUPCIN043200UV01) unmarshaller.unmarshal(is);

		stub.qUPC_AR004030UV_QUPC_IN043200UV(query);
	}

	// @Test
	public void testqUPC_AR004030UV_QUPC_IN043200UV_EHR_Problems()
			throws java.lang.Exception {
		sslSetup();
		tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub stub = new tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub();//

		org.hl7.v3.QUPCIN043200UV01 query = (org.hl7.v3.QUPCIN043200UV01) getTestObject(org.hl7.v3.QUPCIN043200UV01.class);
		InputStream is = this
				.getClass()
				.getClassLoader()
				.getResourceAsStream(
						"messageTemplatesFromEHR-PHR/EHR/PCC-10-Input-Scenario-Problems.xml");

		JAXBContext context = JAXBContext.newInstance("org.hl7.v3");
		Unmarshaller unmarshaller = context.createUnmarshaller();
		query = (org.hl7.v3.QUPCIN043200UV01) unmarshaller.unmarshal(is);

		stub.qUPC_AR004030UV_QUPC_IN043200UV(query);
	}

	@Test
	public void testqUPC_AR004030UV_QUPC_IN043200UV_EHR_Problems1()
			throws java.lang.Exception {
		sslSetup();
		tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub stub = new tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub();//

		org.hl7.v3.QUPCIN043200UV01 query = (org.hl7.v3.QUPCIN043200UV01) getTestObject(org.hl7.v3.QUPCIN043200UV01.class);
		InputStream is = this
				.getClass()
				.getClassLoader()
				.getResourceAsStream(
						"messageTemplatesFromEHR-PHR/EHR/PCC-10-Input-Scenario-Problems-Step1.xml");

		JAXBContext context = JAXBContext.newInstance("org.hl7.v3");
		Unmarshaller unmarshaller = context.createUnmarshaller();
		query = (org.hl7.v3.QUPCIN043200UV01) unmarshaller.unmarshal(is);

		stub.qUPC_AR004030UV_QUPC_IN043200UV(query);
	}

	// @Test
	public void testqUPC_AR004030UV_QUPC_IN043200UV_EHR_Problems2()
			throws java.lang.Exception {
		sslSetup();
		tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub stub = new tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub();//

		org.hl7.v3.QUPCIN043200UV01 query = (org.hl7.v3.QUPCIN043200UV01) getTestObject(org.hl7.v3.QUPCIN043200UV01.class);
		InputStream is = this
				.getClass()
				.getClassLoader()
				.getResourceAsStream(
						"messageTemplatesFromEHR-PHR/EHR/PCC-10-Input-Scenario-Problems-Step2.xml");

		JAXBContext context = JAXBContext.newInstance("org.hl7.v3");
		Unmarshaller unmarshaller = context.createUnmarshaller();
		query = (org.hl7.v3.QUPCIN043200UV01) unmarshaller.unmarshal(is);

		stub.qUPC_AR004030UV_QUPC_IN043200UV(query);
	}

	// @Test
	public void testqUPC_AR004030UV_QUPC_IN043200UV_EHR_Problems3()
			throws java.lang.Exception {
		sslSetup();
		tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub stub = new tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub();//

		org.hl7.v3.QUPCIN043200UV01 query = (org.hl7.v3.QUPCIN043200UV01) getTestObject(org.hl7.v3.QUPCIN043200UV01.class);
		InputStream is = this
				.getClass()
				.getClassLoader()
				.getResourceAsStream(
						"messageTemplatesFromEHR-PHR/EHR/PCC-10-Input-Scenario-Problems-Step3.xml");

		JAXBContext context = JAXBContext.newInstance("org.hl7.v3");
		Unmarshaller unmarshaller = context.createUnmarshaller();
		query = (org.hl7.v3.QUPCIN043200UV01) unmarshaller.unmarshal(is);

		stub.qUPC_AR004030UV_QUPC_IN043200UV(query);
	}

	// @Test
	public void testqUPC_AR004030UV_QUPC_IN043200UV_EHR_Procedures()
			throws java.lang.Exception {
		sslSetup();
		tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub stub = new tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub();//

		org.hl7.v3.QUPCIN043200UV01 query = (org.hl7.v3.QUPCIN043200UV01) getTestObject(org.hl7.v3.QUPCIN043200UV01.class);
		InputStream is = this
				.getClass()
				.getClassLoader()
				.getResourceAsStream(
						"messageTemplatesFromEHR-PHR/EHR/PCC-10-Input-Scenario-Procedures.xml");

		JAXBContext context = JAXBContext.newInstance("org.hl7.v3");
		Unmarshaller unmarshaller = context.createUnmarshaller();
		query = (org.hl7.v3.QUPCIN043200UV01) unmarshaller.unmarshal(is);

		stub.qUPC_AR004030UV_QUPC_IN043200UV(query);
	}

	// @Test
	public void testqUPC_AR004030UV_QUPC_IN043200UV_EHR_Procedures1()
			throws java.lang.Exception {
		sslSetup();
		tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub stub = new tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub();//

		org.hl7.v3.QUPCIN043200UV01 query = (org.hl7.v3.QUPCIN043200UV01) getTestObject(org.hl7.v3.QUPCIN043200UV01.class);
		InputStream is = this
				.getClass()
				.getClassLoader()
				.getResourceAsStream(
						"messageTemplatesFromEHR-PHR/EHR/PCC-10-Input-Scenario-Procedures-Step1.xml");

		JAXBContext context = JAXBContext.newInstance("org.hl7.v3");
		Unmarshaller unmarshaller = context.createUnmarshaller();
		query = (org.hl7.v3.QUPCIN043200UV01) unmarshaller.unmarshal(is);

		stub.qUPC_AR004030UV_QUPC_IN043200UV(query);
	}

	// @Test
	public void testqUPC_AR004030UV_QUPC_IN043200UV_EHR_Procedures2()
			throws java.lang.Exception {
		sslSetup();
		tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub stub = new tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub();//

		org.hl7.v3.QUPCIN043200UV01 query = (org.hl7.v3.QUPCIN043200UV01) getTestObject(org.hl7.v3.QUPCIN043200UV01.class);
		InputStream is = this
				.getClass()
				.getClassLoader()
				.getResourceAsStream(
						"messageTemplatesFromEHR-PHR/EHR/PCC-10-Input-Scenario-Procedures-Step3.xml");

		JAXBContext context = JAXBContext.newInstance("org.hl7.v3");
		Unmarshaller unmarshaller = context.createUnmarshaller();
		query = (org.hl7.v3.QUPCIN043200UV01) unmarshaller.unmarshal(is);

		stub.qUPC_AR004030UV_QUPC_IN043200UV(query);
	}

	// @Test
	public void testqUPC_AR004030UV_QUPC_IN043200UV_EHR_Procedures3()
			throws java.lang.Exception {
		sslSetup();
		tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub stub = new tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub();//

		org.hl7.v3.QUPCIN043200UV01 query = (org.hl7.v3.QUPCIN043200UV01) getTestObject(org.hl7.v3.QUPCIN043200UV01.class);
		InputStream is = this
				.getClass()
				.getClassLoader()
				.getResourceAsStream(
						"messageTemplatesFromEHR-PHR/EHR/PCC-10-Input-Scenario-Procedures-Step5.xml");

		JAXBContext context = JAXBContext.newInstance("org.hl7.v3");
		Unmarshaller unmarshaller = context.createUnmarshaller();
		query = (org.hl7.v3.QUPCIN043200UV01) unmarshaller.unmarshal(is);

		stub.qUPC_AR004030UV_QUPC_IN043200UV(query);
	}

	// @Test
	public void testqUPC_AR004030UV_QUPC_IN043200UV_EHR_Medications()
			throws java.lang.Exception {
		sslSetup();
		tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub stub = new tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub();//

		org.hl7.v3.QUPCIN043200UV01 query = (org.hl7.v3.QUPCIN043200UV01) getTestObject(org.hl7.v3.QUPCIN043200UV01.class);
		InputStream is = this
				.getClass()
				.getClassLoader()
				.getResourceAsStream(
						"messageTemplatesFromEHR-PHR/EHR/PCC-10-Input-Scenario-Medications-Step6.xml");

		JAXBContext context = JAXBContext.newInstance("org.hl7.v3");
		Unmarshaller unmarshaller = context.createUnmarshaller();
		query = (org.hl7.v3.QUPCIN043200UV01) unmarshaller.unmarshal(is);

		List<REPCMT004000UV01PertinentInformation5> pertinentInformation3 = query
				.getControlActProcess().getSubject().get(0)
				.getRegistrationEvent().getSubject2().getCareProvisionEvent()
				.getPertinentInformation3();

		for (int i = 0; i < pertinentInformation3.size(); i++) {
			REPCMT004000UV01PertinentInformation5 pi = pertinentInformation3
					.get(i);
			POCDMT000040SubstanceAdministration sa = pi
					.getSubstanceAdministration().getValue();
			List<SXCMTS> effectiveTime = sa.getEffectiveTime();

			ObjectFactory of = new ObjectFactory();
			IVLTS ivlts = of.createIVLTS();
			IVXBTS low = of.createIVXBTS();
			low.setValue("199910101010");
			IVXBTS high = of.createIVXBTS();
			high.setValue("201010101010");
			ivlts.getRest().add(of.createIVLTSLow(low));
			ivlts.getRest().add(of.createIVLTSHigh(high));

			effectiveTime.add(0, ivlts);
		}
		stub.qUPC_AR004030UV_QUPC_IN043200UV(query);
	}

	// @Test
	public void testqUPC_AR004030UV_QUPC_IN043200UV_EHR_VitalSigns()
			throws java.lang.Exception {
		sslSetup();
		tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub stub = new tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub();//

		org.hl7.v3.QUPCIN043200UV01 query = (org.hl7.v3.QUPCIN043200UV01) getTestObject(org.hl7.v3.QUPCIN043200UV01.class);
		InputStream is = this
				.getClass()
				.getClassLoader()
				.getResourceAsStream(
						"messageTemplatesFromEHR-PHR/EHR/PCC-10-Input-Scenario-VitalSign.xml");

		JAXBContext context = JAXBContext.newInstance("org.hl7.v3");
		Unmarshaller unmarshaller = context.createUnmarshaller();
		query = (org.hl7.v3.QUPCIN043200UV01) unmarshaller.unmarshal(is);

		stub.qUPC_AR004030UV_QUPC_IN043200UV(query);
	}

	// @Test
	public void testqUPC_AR004030UV_QUPC_IN043200UV_EHR_LabResults()
			throws java.lang.Exception {
		sslSetup();
		tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub stub = new tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub();//

		org.hl7.v3.QUPCIN043200UV01 query = (org.hl7.v3.QUPCIN043200UV01) getTestObject(org.hl7.v3.QUPCIN043200UV01.class);
		InputStream is = this
				.getClass()
				.getClassLoader()
				.getResourceAsStream(
						"messageTemplatesFromEHR-PHR/EHR/PCC-10-Input-Scenario-LabResultsStep4.xml");

		JAXBContext context = JAXBContext.newInstance("org.hl7.v3");
		Unmarshaller unmarshaller = context.createUnmarshaller();
		query = (org.hl7.v3.QUPCIN043200UV01) unmarshaller.unmarshal(is);

		stub.qUPC_AR004030UV_QUPC_IN043200UV(query);
	}

	// @Test
	public void testEHRMessage1() throws java.lang.Exception {
		sslSetup();
		tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub stub = new tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub();//

		org.hl7.v3.QUPCIN043200UV01 query = (org.hl7.v3.QUPCIN043200UV01) getTestObject(org.hl7.v3.QUPCIN043200UV01.class);
		InputStream is = this
				.getClass()
				.getClassLoader()
				.getResourceAsStream(
						"messageTemplatesFromEHR-PHR/VTCareplan/EHR/PCC-10-Input-Scenario-LabResultsStep1.xml");

		JAXBContext context = JAXBContext.newInstance("org.hl7.v3");
		Unmarshaller unmarshaller = context.createUnmarshaller();
		query = (org.hl7.v3.QUPCIN043200UV01) unmarshaller.unmarshal(is);

		stub.qUPC_AR004030UV_QUPC_IN043200UV(query);
	}

	// @Test
	public void testEHRMessage2() throws java.lang.Exception {
		sslSetup();
		tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub stub = new tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub();//

		org.hl7.v3.QUPCIN043200UV01 query = (org.hl7.v3.QUPCIN043200UV01) getTestObject(org.hl7.v3.QUPCIN043200UV01.class);
		InputStream is = this
				.getClass()
				.getClassLoader()
				.getResourceAsStream(
						"messageTemplatesFromEHR-PHR/VTCareplan/EHR/PCC-10-Input-Scenario-LabResultsStep18.xml");

		JAXBContext context = JAXBContext.newInstance("org.hl7.v3");
		Unmarshaller unmarshaller = context.createUnmarshaller();
		query = (org.hl7.v3.QUPCIN043200UV01) unmarshaller.unmarshal(is);

		stub.qUPC_AR004030UV_QUPC_IN043200UV(query);
	}

	// @Test
	public void testEHRMessage3() throws java.lang.Exception {
		sslSetup();
		tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub stub = new tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub();//

		org.hl7.v3.QUPCIN043200UV01 query = (org.hl7.v3.QUPCIN043200UV01) getTestObject(org.hl7.v3.QUPCIN043200UV01.class);
		InputStream is = this
				.getClass()
				.getClassLoader()
				.getResourceAsStream(
						"messageTemplatesFromEHR-PHR/VTCareplan/EHR/PCC-10-Input-Scenario-Medications-Step1.xml");

		JAXBContext context = JAXBContext.newInstance("org.hl7.v3");
		Unmarshaller unmarshaller = context.createUnmarshaller();
		query = (org.hl7.v3.QUPCIN043200UV01) unmarshaller.unmarshal(is);
		List<REPCMT004000UV01PertinentInformation5> pertinentInformation3 = query
				.getControlActProcess().getSubject().get(0)
				.getRegistrationEvent().getSubject2().getCareProvisionEvent()
				.getPertinentInformation3();

		for (int i = 0; i < pertinentInformation3.size(); i++) {
			REPCMT004000UV01PertinentInformation5 pi = pertinentInformation3
					.get(i);
			POCDMT000040SubstanceAdministration sa = pi
					.getSubstanceAdministration().getValue();
			List<SXCMTS> effectiveTime = sa.getEffectiveTime();

			String drugCode = sa.getConsumable().getManufacturedProduct()
					.getManufacturedLabeledDrug().getCode().getCode();
			String effectiveTimeHigh = "", effectiveTimeLow = "";
			if (drugCode.equals("C0032952")) {
				effectiveTimeLow = "200812010000";
				effectiveTimeHigh = "201106101010";
			} else if (drugCode.equals("C0081876")) {
				effectiveTimeLow = "200812010000";
				effectiveTimeHigh = "201106101010";
			} else if (drugCode.equals("C0110591")) {
				effectiveTimeLow = "199910101010";
				effectiveTimeHigh = "201106101010";
			} else if (drugCode.equals("C0012010")) {
				effectiveTimeLow = "199910101010";
				effectiveTimeHigh = "201010101010";
			} else if (drugCode.equals("C0591288")) {
				effectiveTimeLow = "198010101010";
				effectiveTimeHigh = "20110601010";
			} else if (drugCode.equals("C0025677")) {
				effectiveTimeLow = "20090101010";
				effectiveTimeHigh = "201106101010";
			} else if (drugCode.equals("C0016410")) {
				effectiveTimeLow = "20090101010";
				effectiveTimeHigh = "201106101010";
			} else if (drugCode.equals("C0024467")) {
				effectiveTimeLow = "199910101010";
				effectiveTimeHigh = "201010101010";
			}
			ObjectFactory of = new ObjectFactory();
			IVLTS ivlts = of.createIVLTS();
			IVXBTS low = of.createIVXBTS();
			low.setValue(effectiveTimeLow);
			IVXBTS high = of.createIVXBTS();
			high.setValue(effectiveTimeHigh);
			ivlts.getRest().add(of.createIVLTSLow(low));
			ivlts.getRest().add(of.createIVLTSHigh(high));

			effectiveTime.add(0, ivlts);
		}

		stub.qUPC_AR004030UV_QUPC_IN043200UV(query);
	}

	// @Test
	public void testEHRMessage4() throws java.lang.Exception {
		sslSetup();
		tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub stub = new tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub();//

		org.hl7.v3.QUPCIN043200UV01 query = (org.hl7.v3.QUPCIN043200UV01) getTestObject(org.hl7.v3.QUPCIN043200UV01.class);
		InputStream is = this
				.getClass()
				.getClassLoader()
				.getResourceAsStream(
						"messageTemplatesFromEHR-PHR/VTCareplan/EHR/PCC-10-Input-Scenario-Medications-Step9.xml");

		JAXBContext context = JAXBContext.newInstance("org.hl7.v3");
		Unmarshaller unmarshaller = context.createUnmarshaller();
		query = (org.hl7.v3.QUPCIN043200UV01) unmarshaller.unmarshal(is);
		List<REPCMT004000UV01PertinentInformation5> pertinentInformation3 = query
				.getControlActProcess().getSubject().get(0)
				.getRegistrationEvent().getSubject2().getCareProvisionEvent()
				.getPertinentInformation3();

		for (int i = 0; i < pertinentInformation3.size(); i++) {
			REPCMT004000UV01PertinentInformation5 pi = pertinentInformation3
					.get(i);
			POCDMT000040SubstanceAdministration sa = pi
					.getSubstanceAdministration().getValue();
			List<SXCMTS> effectiveTime = sa.getEffectiveTime();

			String drugCode = sa.getConsumable().getManufacturedProduct()
					.getManufacturedLabeledDrug().getCode().getCode();
			String effectiveTimeHigh = "", effectiveTimeLow = "";
			if (drugCode.equals("C0032952")) {
				effectiveTimeLow = "200812010000";
				effectiveTimeHigh = "201106101010";
			} else if (drugCode.equals("C0110591")) {
				effectiveTimeLow = "199910101010";
				effectiveTimeHigh = "201106101010";
			} else if (drugCode.equals("C0012010")) {
				effectiveTimeLow = "199910101010";
				effectiveTimeHigh = "2010072500";
			} else if (drugCode.equals("C0591288")) {
				effectiveTimeLow = "198010101010";
				effectiveTimeHigh = "20110601010";
			} else if (drugCode.equals("C0025677")) {
				effectiveTimeLow = "20090101010";
				effectiveTimeHigh = "201106101010";
			} else if (drugCode.equals("C0016410")) {
				effectiveTimeLow = "20090101010";
				effectiveTimeHigh = "201007251010";
			} else if (drugCode.equals("C0024467")) {
				effectiveTimeLow = "199910101010";
				effectiveTimeHigh = "201007251010";
			}
			ObjectFactory of = new ObjectFactory();
			IVLTS ivlts = of.createIVLTS();
			IVXBTS low = of.createIVXBTS();
			low.setValue(effectiveTimeLow);
			IVXBTS high = of.createIVXBTS();
			high.setValue(effectiveTimeHigh);
			ivlts.getRest().add(of.createIVLTSLow(low));
			ivlts.getRest().add(of.createIVLTSHigh(high));

			effectiveTime.add(0, ivlts);
		}

		stub.qUPC_AR004030UV_QUPC_IN043200UV(query);
	}

	// @Test
	public void testEHRMessage5() throws java.lang.Exception {
		sslSetup();
		tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub stub = new tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub();//

		org.hl7.v3.QUPCIN043200UV01 query = (org.hl7.v3.QUPCIN043200UV01) getTestObject(org.hl7.v3.QUPCIN043200UV01.class);
		InputStream is = this
				.getClass()
				.getClassLoader()
				.getResourceAsStream(
						"messageTemplatesFromEHR-PHR/VTCareplan/EHR/PCC-10-Input-Scenario-Medications-Step13.xml");

		JAXBContext context = JAXBContext.newInstance("org.hl7.v3");
		Unmarshaller unmarshaller = context.createUnmarshaller();
		query = (org.hl7.v3.QUPCIN043200UV01) unmarshaller.unmarshal(is);
		List<REPCMT004000UV01PertinentInformation5> pertinentInformation3 = query
				.getControlActProcess().getSubject().get(0)
				.getRegistrationEvent().getSubject2().getCareProvisionEvent()
				.getPertinentInformation3();

		for (int i = 0; i < pertinentInformation3.size(); i++) {
			REPCMT004000UV01PertinentInformation5 pi = pertinentInformation3
					.get(i);
			POCDMT000040SubstanceAdministration sa = pi
					.getSubstanceAdministration().getValue();
			List<SXCMTS> effectiveTime = sa.getEffectiveTime();

			String drugCode = sa.getConsumable().getManufacturedProduct()
					.getManufacturedLabeledDrug().getCode().getCode();
			String effectiveTimeHigh = "", effectiveTimeLow = "";
			if (drugCode.equals("C0032952")) {
				effectiveTimeLow = "200812010000";
				effectiveTimeHigh = "201106101010";
			}
			ObjectFactory of = new ObjectFactory();
			IVLTS ivlts = of.createIVLTS();
			IVXBTS low = of.createIVXBTS();
			low.setValue(effectiveTimeLow);
			IVXBTS high = of.createIVXBTS();
			high.setValue(effectiveTimeHigh);
			ivlts.getRest().add(of.createIVLTSLow(low));
			ivlts.getRest().add(of.createIVLTSHigh(high));

			effectiveTime.add(0, ivlts);
		}

		stub.qUPC_AR004030UV_QUPC_IN043200UV(query);
	}

	// @Test
	public void testEHRMessage6() throws java.lang.Exception {
		sslSetup();
		tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub stub = new tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub();//

		org.hl7.v3.QUPCIN043200UV01 query = (org.hl7.v3.QUPCIN043200UV01) getTestObject(org.hl7.v3.QUPCIN043200UV01.class);
		InputStream is = this
				.getClass()
				.getClassLoader()
				.getResourceAsStream(
						"messageTemplatesFromEHR-PHR/VTCareplan/EHR/PCC-10-Input-Scenario-Medications-Step18.xml");

		JAXBContext context = JAXBContext.newInstance("org.hl7.v3");
		Unmarshaller unmarshaller = context.createUnmarshaller();
		query = (org.hl7.v3.QUPCIN043200UV01) unmarshaller.unmarshal(is);
		List<REPCMT004000UV01PertinentInformation5> pertinentInformation3 = query
				.getControlActProcess().getSubject().get(0)
				.getRegistrationEvent().getSubject2().getCareProvisionEvent()
				.getPertinentInformation3();

		for (int i = 0; i < pertinentInformation3.size(); i++) {
			REPCMT004000UV01PertinentInformation5 pi = pertinentInformation3
					.get(i);
			POCDMT000040SubstanceAdministration sa = pi
					.getSubstanceAdministration().getValue();
			List<SXCMTS> effectiveTime = sa.getEffectiveTime();

			String drugCode = sa.getConsumable().getManufacturedProduct()
					.getManufacturedLabeledDrug().getCode().getCode();
			String effectiveTimeHigh = "", effectiveTimeLow = "";
			if (drugCode.equals("C0110591")) {
				effectiveTimeLow = "199910101010";
				effectiveTimeHigh = "201106101010";
			}
			ObjectFactory of = new ObjectFactory();
			IVLTS ivlts = of.createIVLTS();
			IVXBTS low = of.createIVXBTS();
			low.setValue(effectiveTimeLow);
			IVXBTS high = of.createIVXBTS();
			high.setValue(effectiveTimeHigh);
			ivlts.getRest().add(of.createIVLTSLow(low));
			ivlts.getRest().add(of.createIVLTSHigh(high));

			effectiveTime.add(0, ivlts);
		}

		stub.qUPC_AR004030UV_QUPC_IN043200UV(query);
	}

	// @Test
	public void testEHRMessage7() throws java.lang.Exception {
		sslSetup();
		tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub stub = new tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub();//

		org.hl7.v3.QUPCIN043200UV01 query = (org.hl7.v3.QUPCIN043200UV01) getTestObject(org.hl7.v3.QUPCIN043200UV01.class);
		InputStream is = this
				.getClass()
				.getClassLoader()
				.getResourceAsStream(
						"messageTemplatesFromEHR-PHR/VTCareplan/EHR/PCC-10-Input-Scenario-Medications-Step19.xml");

		JAXBContext context = JAXBContext.newInstance("org.hl7.v3");
		Unmarshaller unmarshaller = context.createUnmarshaller();
		query = (org.hl7.v3.QUPCIN043200UV01) unmarshaller.unmarshal(is);
		List<REPCMT004000UV01PertinentInformation5> pertinentInformation3 = query
				.getControlActProcess().getSubject().get(0)
				.getRegistrationEvent().getSubject2().getCareProvisionEvent()
				.getPertinentInformation3();

		for (int i = 0; i < pertinentInformation3.size(); i++) {
			REPCMT004000UV01PertinentInformation5 pi = pertinentInformation3
					.get(i);
			POCDMT000040SubstanceAdministration sa = pi
					.getSubstanceAdministration().getValue();
			List<SXCMTS> effectiveTime = sa.getEffectiveTime();

			String drugCode = sa.getConsumable().getManufacturedProduct()
					.getManufacturedLabeledDrug().getCode().getCode();
			String effectiveTimeHigh = "", effectiveTimeLow = "";
			if (drugCode.equals("C0939400")) {
				effectiveTimeLow = "201101241010";
				effectiveTimeHigh = "201106101010";
			} else if (drugCode.equals("C0081876")) {
				effectiveTimeLow = "200812010000";
				effectiveTimeHigh = "201101241010";
			}
			ObjectFactory of = new ObjectFactory();
			IVLTS ivlts = of.createIVLTS();
			IVXBTS low = of.createIVXBTS();
			low.setValue(effectiveTimeLow);
			IVXBTS high = of.createIVXBTS();
			high.setValue(effectiveTimeHigh);
			ivlts.getRest().add(of.createIVLTSLow(low));
			ivlts.getRest().add(of.createIVLTSHigh(high));

			effectiveTime.add(0, ivlts);
		}

		stub.qUPC_AR004030UV_QUPC_IN043200UV(query);
	}

	// @Test
	public void testEHRMessage8() throws java.lang.Exception {
		sslSetup();
		tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub stub = new tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub();//

		org.hl7.v3.QUPCIN043200UV01 query = (org.hl7.v3.QUPCIN043200UV01) getTestObject(org.hl7.v3.QUPCIN043200UV01.class);
		InputStream is = this
				.getClass()
				.getClassLoader()
				.getResourceAsStream(
						"messageTemplatesFromEHR-PHR/VTCareplan/EHR/PCC-10-Input-Scenario-ProblemsStep1.xml");

		JAXBContext context = JAXBContext.newInstance("org.hl7.v3");
		Unmarshaller unmarshaller = context.createUnmarshaller();
		query = (org.hl7.v3.QUPCIN043200UV01) unmarshaller.unmarshal(is);

		stub.qUPC_AR004030UV_QUPC_IN043200UV(query);
	}

	// @Test
	public void testEHRMessage9() throws java.lang.Exception {
		sslSetup();
		tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub stub = new tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub();//

		org.hl7.v3.QUPCIN043200UV01 query = (org.hl7.v3.QUPCIN043200UV01) getTestObject(org.hl7.v3.QUPCIN043200UV01.class);
		InputStream is = this
				.getClass()
				.getClassLoader()
				.getResourceAsStream(
						"messageTemplatesFromEHR-PHR/VTCareplan/EHR/PCC-10-Input-Scenario-ProblemsStep13.xml");

		JAXBContext context = JAXBContext.newInstance("org.hl7.v3");
		Unmarshaller unmarshaller = context.createUnmarshaller();
		query = (org.hl7.v3.QUPCIN043200UV01) unmarshaller.unmarshal(is);

		stub.qUPC_AR004030UV_QUPC_IN043200UV(query);
	}

	// @Test
	public void testEHRMessage10() throws java.lang.Exception {
		sslSetup();
		tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub stub = new tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub();//

		org.hl7.v3.QUPCIN043200UV01 query = (org.hl7.v3.QUPCIN043200UV01) getTestObject(org.hl7.v3.QUPCIN043200UV01.class);
		InputStream is = this
				.getClass()
				.getClassLoader()
				.getResourceAsStream(
						"messageTemplatesFromEHR-PHR/VTCareplan/EHR/PCC-10-Input-Scenario-ProceduresStep1.xml");

		JAXBContext context = JAXBContext.newInstance("org.hl7.v3");
		Unmarshaller unmarshaller = context.createUnmarshaller();
		query = (org.hl7.v3.QUPCIN043200UV01) unmarshaller.unmarshal(is);

		stub.qUPC_AR004030UV_QUPC_IN043200UV(query);
	}

	// @Test
	public void testEHRMessage11() throws java.lang.Exception {
		sslSetup();
		tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub stub = new tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub();//

		org.hl7.v3.QUPCIN043200UV01 query = (org.hl7.v3.QUPCIN043200UV01) getTestObject(org.hl7.v3.QUPCIN043200UV01.class);
		InputStream is = this
				.getClass()
				.getClassLoader()
				.getResourceAsStream(
						"messageTemplatesFromEHR-PHR/VTCareplan/EHR/PCC-10-Input-Scenario-VitalSignStep1.xml");

		JAXBContext context = JAXBContext.newInstance("org.hl7.v3");
		Unmarshaller unmarshaller = context.createUnmarshaller();
		query = (org.hl7.v3.QUPCIN043200UV01) unmarshaller.unmarshal(is);

		stub.qUPC_AR004030UV_QUPC_IN043200UV(query);
	}

	// @Test
	public void testPHRMessage1() throws java.lang.Exception {
		sslSetup();
		tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub stub = new tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub();//

		org.hl7.v3.QUPCIN043200UV01 query = (org.hl7.v3.QUPCIN043200UV01) getTestObject(org.hl7.v3.QUPCIN043200UV01.class);
		InputStream is = this
				.getClass()
				.getClassLoader()
				.getResourceAsStream(
						"messageTemplatesFromEHR-PHR/VTCareplan/PHR/PCC-10-Input-Scenario-DailyLivingStep8.xml");

		JAXBContext context = JAXBContext.newInstance("org.hl7.v3");
		Unmarshaller unmarshaller = context.createUnmarshaller();
		query = (org.hl7.v3.QUPCIN043200UV01) unmarshaller.unmarshal(is);

		stub.qUPC_AR004030UV_QUPC_IN043200UV(query);
	}

	// @Test
	public void testPHRMessage2() throws java.lang.Exception {
		sslSetup();
		tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub stub = new tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub();//

		org.hl7.v3.QUPCIN043200UV01 query = (org.hl7.v3.QUPCIN043200UV01) getTestObject(org.hl7.v3.QUPCIN043200UV01.class);
		InputStream is = this
				.getClass()
				.getClassLoader()
				.getResourceAsStream(
						"messageTemplatesFromEHR-PHR/VTCareplan/PHR/PCC-10-Input-Scenario-DailyLivingStep10.xml");

		JAXBContext context = JAXBContext.newInstance("org.hl7.v3");
		Unmarshaller unmarshaller = context.createUnmarshaller();
		query = (org.hl7.v3.QUPCIN043200UV01) unmarshaller.unmarshal(is);

		stub.qUPC_AR004030UV_QUPC_IN043200UV(query);
	}

	// @Test
	public void testPHRMessage3() throws java.lang.Exception {
		sslSetup();
		tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub stub = new tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub();//

		org.hl7.v3.QUPCIN043200UV01 query = (org.hl7.v3.QUPCIN043200UV01) getTestObject(org.hl7.v3.QUPCIN043200UV01.class);
		InputStream is = this
				.getClass()
				.getClassLoader()
				.getResourceAsStream(
						"messageTemplatesFromEHR-PHR/VTCareplan/PHR/PCC-10-Input-Scenario-MedicationsStep8.xml");

		JAXBContext context = JAXBContext.newInstance("org.hl7.v3");
		Unmarshaller unmarshaller = context.createUnmarshaller();
		query = (org.hl7.v3.QUPCIN043200UV01) unmarshaller.unmarshal(is);

		List<REPCMT004000UV01PertinentInformation5> pertinentInformation3 = query
				.getControlActProcess().getSubject().get(0)
				.getRegistrationEvent().getSubject2().getCareProvisionEvent()
				.getPertinentInformation3();

		for (int i = 0; i < pertinentInformation3.size(); i++) {
			REPCMT004000UV01PertinentInformation5 pi = pertinentInformation3
					.get(i);
			POCDMT000040SubstanceAdministration sa = pi
					.getSubstanceAdministration().getValue();
			List<SXCMTS> effectiveTime = sa.getEffectiveTime();

			String drugCode = sa.getConsumable().getManufacturedProduct()
					.getManufacturedLabeledDrug().getCode().getCode();
			String effectiveTimeHigh = "", effectiveTimeLow = "";
			if (drugCode.equals("C0032952")) {
				effectiveTimeLow = "200812010000";
				effectiveTimeHigh = "201106101010";
			} else if (drugCode.equals("C0081876")) {
				effectiveTimeLow = "200812010000";
				effectiveTimeHigh = "201106101010";
			} else if (drugCode.equals("C0110591")) {
				effectiveTimeLow = "199910101010";
				effectiveTimeHigh = "201106101010";
			} else if (drugCode.equals("C0012010")) {
				effectiveTimeLow = "199910101010";
				effectiveTimeHigh = "201010101010";
			} else if (drugCode.equals("C0591288")) {
				effectiveTimeLow = "198010101010";
				effectiveTimeHigh = "20110601010";
			} else if (drugCode.equals("C0025677")) {
				effectiveTimeLow = "20090101010";
				effectiveTimeHigh = "201106101010";
			} else if (drugCode.equals("C0016410")) {
				effectiveTimeLow = "20090101010";
				effectiveTimeHigh = "201106101010";
			} else if (drugCode.equals("C0024467")) {
				effectiveTimeLow = "199910101010";
				effectiveTimeHigh = "201010101010";
			}
			ObjectFactory of = new ObjectFactory();
			IVLTS ivlts = of.createIVLTS();
			IVXBTS low = of.createIVXBTS();
			low.setValue(effectiveTimeLow);
			IVXBTS high = of.createIVXBTS();
			high.setValue(effectiveTimeHigh);
			ivlts.getRest().add(of.createIVLTSLow(low));
			ivlts.getRest().add(of.createIVLTSHigh(high));

			effectiveTime.add(0, ivlts);
		}
		stub.qUPC_AR004030UV_QUPC_IN043200UV(query);
	}

	// @Test
	public void testPHRMessage4() throws java.lang.Exception {
		sslSetup();
		tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub stub = new tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub();//

		org.hl7.v3.QUPCIN043200UV01 query = (org.hl7.v3.QUPCIN043200UV01) getTestObject(org.hl7.v3.QUPCIN043200UV01.class);
		InputStream is = this
				.getClass()
				.getClassLoader()
				.getResourceAsStream(
						"messageTemplatesFromEHR-PHR/VTCareplan/PHR/PCC-10-Input-Scenario-MedicationsStep8.xml");

		JAXBContext context = JAXBContext.newInstance("org.hl7.v3");
		Unmarshaller unmarshaller = context.createUnmarshaller();
		query = (org.hl7.v3.QUPCIN043200UV01) unmarshaller.unmarshal(is);
		List<REPCMT004000UV01PertinentInformation5> pertinentInformation3 = query
				.getControlActProcess().getSubject().get(0)
				.getRegistrationEvent().getSubject2().getCareProvisionEvent()
				.getPertinentInformation3();

		for (int i = 0; i < pertinentInformation3.size(); i++) {
			REPCMT004000UV01PertinentInformation5 pi = pertinentInformation3
					.get(i);
			POCDMT000040SubstanceAdministration sa = pi
					.getSubstanceAdministration().getValue();
			List<SXCMTS> effectiveTime = sa.getEffectiveTime();

			String drugCode = sa.getConsumable().getManufacturedProduct()
					.getManufacturedLabeledDrug().getCode().getCode();
			String effectiveTimeHigh = "", effectiveTimeLow = "";
			if (drugCode.equals("C0032952")) {
				effectiveTimeLow = "200812010000";
				effectiveTimeHigh = "201106101010";
			} else if (drugCode.equals("C0081876")) {
				effectiveTimeLow = "200812010000";
				effectiveTimeHigh = "201106101010";
			} else if (drugCode.equals("C0110591")) {
				effectiveTimeLow = "199910101010";
				effectiveTimeHigh = "201106101010";
			} else if (drugCode.equals("C0012010")) {
				effectiveTimeLow = "199910101010";
				effectiveTimeHigh = "201010101010";
			} else if (drugCode.equals("C0591288")) {
				effectiveTimeLow = "198010101010";
				effectiveTimeHigh = "20110601010";
			} else if (drugCode.equals("C0025677")) {
				effectiveTimeLow = "20090101010";
				effectiveTimeHigh = "201106101010";
			} else if (drugCode.equals("C0016410")) {
				effectiveTimeLow = "20090101010";
				effectiveTimeHigh = "201106101010";
			} else if (drugCode.equals("C0024467")) {
				effectiveTimeLow = "199910101010";
				effectiveTimeHigh = "201010101010";
			}
			ObjectFactory of = new ObjectFactory();
			IVLTS ivlts = of.createIVLTS();
			IVXBTS low = of.createIVXBTS();
			low.setValue(effectiveTimeLow);
			IVXBTS high = of.createIVXBTS();
			high.setValue(effectiveTimeHigh);
			ivlts.getRest().add(of.createIVLTSLow(low));
			ivlts.getRest().add(of.createIVLTSHigh(high));

			effectiveTime.add(0, ivlts);
		}

		stub.qUPC_AR004030UV_QUPC_IN043200UV(query);
	}

	// @Test
	public void testPHRMessage5() throws java.lang.Exception {
		sslSetup();
		tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub stub = new tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub();//

		org.hl7.v3.QUPCIN043200UV01 query = (org.hl7.v3.QUPCIN043200UV01) getTestObject(org.hl7.v3.QUPCIN043200UV01.class);
		InputStream is = this
				.getClass()
				.getClassLoader()
				.getResourceAsStream(
						"messageTemplatesFromEHR-PHR/VTCareplan/PHR/PCC-10-Input-Scenario-ProblemsStep6.xml");

		JAXBContext context = JAXBContext.newInstance("org.hl7.v3");
		Unmarshaller unmarshaller = context.createUnmarshaller();
		query = (org.hl7.v3.QUPCIN043200UV01) unmarshaller.unmarshal(is);

		stub.qUPC_AR004030UV_QUPC_IN043200UV(query);
	}

	// @Test
	public void testPHRMessage6() throws java.lang.Exception {
		sslSetup();
		tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub stub = new tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub();//

		org.hl7.v3.QUPCIN043200UV01 query = (org.hl7.v3.QUPCIN043200UV01) getTestObject(org.hl7.v3.QUPCIN043200UV01.class);
		InputStream is = this
				.getClass()
				.getClassLoader()
				.getResourceAsStream(
						"messageTemplatesFromEHR-PHR/VTCareplan/PHR/PCC-10-Input-Scenario-ProblemsStep8.xml");

		JAXBContext context = JAXBContext.newInstance("org.hl7.v3");
		Unmarshaller unmarshaller = context.createUnmarshaller();
		query = (org.hl7.v3.QUPCIN043200UV01) unmarshaller.unmarshal(is);

		stub.qUPC_AR004030UV_QUPC_IN043200UV(query);
	}

	// @Test
	public void testPHRMessage7() throws java.lang.Exception {
		sslSetup();
		tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub stub = new tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub();//

		org.hl7.v3.QUPCIN043200UV01 query = (org.hl7.v3.QUPCIN043200UV01) getTestObject(org.hl7.v3.QUPCIN043200UV01.class);
		InputStream is = this
				.getClass()
				.getClassLoader()
				.getResourceAsStream(
						"messageTemplatesFromEHR-PHR/VTCareplan/PHR/PCC-10-Input-Scenario-ProblemsStep10.xml");

		JAXBContext context = JAXBContext.newInstance("org.hl7.v3");
		Unmarshaller unmarshaller = context.createUnmarshaller();
		query = (org.hl7.v3.QUPCIN043200UV01) unmarshaller.unmarshal(is);

		stub.qUPC_AR004030UV_QUPC_IN043200UV(query);
	}

	// @Test
	public void testPHRMessage8() throws java.lang.Exception {
		sslSetup();
		tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub stub = new tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub();//

		org.hl7.v3.QUPCIN043200UV01 query = (org.hl7.v3.QUPCIN043200UV01) getTestObject(org.hl7.v3.QUPCIN043200UV01.class);
		InputStream is = this
				.getClass()
				.getClassLoader()
				.getResourceAsStream(
						"messageTemplatesFromEHR-PHR/VTCareplan/PHR/PCC-10-Input-Scenario-ProblemsStep11.xml");

		JAXBContext context = JAXBContext.newInstance("org.hl7.v3");
		Unmarshaller unmarshaller = context.createUnmarshaller();
		query = (org.hl7.v3.QUPCIN043200UV01) unmarshaller.unmarshal(is);

		stub.qUPC_AR004030UV_QUPC_IN043200UV(query);
	}

	// @Test
	public void testPHRMessage9() throws java.lang.Exception {
		sslSetup();
		tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub stub = new tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub();//

		org.hl7.v3.QUPCIN043200UV01 query = (org.hl7.v3.QUPCIN043200UV01) getTestObject(org.hl7.v3.QUPCIN043200UV01.class);
		InputStream is = this
				.getClass()
				.getClassLoader()
				.getResourceAsStream(
						"messageTemplatesFromEHR-PHR/VTCareplan/PHR/PCC-10-Input-Scenario-ProblemsStep14.xml");

		JAXBContext context = JAXBContext.newInstance("org.hl7.v3");
		Unmarshaller unmarshaller = context.createUnmarshaller();
		query = (org.hl7.v3.QUPCIN043200UV01) unmarshaller.unmarshal(is);

		stub.qUPC_AR004030UV_QUPC_IN043200UV(query);
	}

	// @Test
	public void testPHRMessage10() throws java.lang.Exception {
		sslSetup();
		tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub stub = new tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub();//

		org.hl7.v3.QUPCIN043200UV01 query = (org.hl7.v3.QUPCIN043200UV01) getTestObject(org.hl7.v3.QUPCIN043200UV01.class);
		InputStream is = this
				.getClass()
				.getClassLoader()
				.getResourceAsStream(
						"messageTemplatesFromEHR-PHR/VTCareplan/PHR/PCC-10-Input-Scenario-VitalSignStep11.xml");

		JAXBContext context = JAXBContext.newInstance("org.hl7.v3");
		Unmarshaller unmarshaller = context.createUnmarshaller();
		query = (org.hl7.v3.QUPCIN043200UV01) unmarshaller.unmarshal(is);

		stub.qUPC_AR004030UV_QUPC_IN043200UV(query);
	}

	// @Test
	public void testGroup1() throws java.lang.Exception {
		sslSetup();
		/*
		tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub stub = new tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub();//

		org.hl7.v3.QUPCIN043200UV01 query = (org.hl7.v3.QUPCIN043200UV01) getTestObject(org.hl7.v3.QUPCIN043200UV01.class);
		InputStream is = this
				.getClass()
				.getClassLoader()
				.getResourceAsStream(
						"messageTemplatesFromEHR-PHR/VTCareplan/EHR/PCC-10-Input-Scenario-LabResultsStep1.xml");

		JAXBContext context = JAXBContext.newInstance("org.hl7.v3");
		Unmarshaller unmarshaller = context.createUnmarshaller();
		query = (org.hl7.v3.QUPCIN043200UV01) unmarshaller.unmarshal(is);

		stub.qUPC_AR004030UV_QUPC_IN043200UV(query);

		stub = new tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub();//

		query = (org.hl7.v3.QUPCIN043200UV01) getTestObject(org.hl7.v3.QUPCIN043200UV01.class);
		is = this
				.getClass()
				.getClassLoader()
				.getResourceAsStream(
						"messageTemplatesFromEHR-PHR/VTCareplan/EHR/PCC-10-Input-Scenario-Medications-Step1.xml");

		context = JAXBContext.newInstance("org.hl7.v3");
		unmarshaller = context.createUnmarshaller();
		query = (org.hl7.v3.QUPCIN043200UV01) unmarshaller.unmarshal(is);
		List<REPCMT004000UV01PertinentInformation5> pertinentInformation3 = query
				.getControlActProcess().getSubject().get(0)
				.getRegistrationEvent().getSubject2().getCareProvisionEvent()
				.getPertinentInformation3();

		for (int i = 0; i < pertinentInformation3.size(); i++) {
			REPCMT004000UV01PertinentInformation5 pi = pertinentInformation3
					.get(i);
			POCDMT000040SubstanceAdministration sa = pi
					.getSubstanceAdministration().getValue();
			List<SXCMTS> effectiveTime = sa.getEffectiveTime();

			String drugCode = sa.getConsumable().getManufacturedProduct()
					.getManufacturedLabeledDrug().getCode().getCode();
			String effectiveTimeHigh = "", effectiveTimeLow = "";
			if (drugCode.equals("C0032952")) {
				effectiveTimeLow = "200812010000";
				effectiveTimeHigh = "201106101010";
			} else if (drugCode.equals("C0081876")) {
				effectiveTimeLow = "200812010000";
				effectiveTimeHigh = "201106101010";
			} else if (drugCode.equals("C0110591")) {
				effectiveTimeLow = "199910101010";
				effectiveTimeHigh = "201106101010";
			} else if (drugCode.equals("C0012010")) {
				effectiveTimeLow = "199910101010";
				effectiveTimeHigh = "201010101010";
			} else if (drugCode.equals("C0591288")) {
				effectiveTimeLow = "198010101010";
				effectiveTimeHigh = "201106101010";
			} else if (drugCode.equals("C0025677")) {
				effectiveTimeLow = "20090101010";
				effectiveTimeHigh = "201106101010";
			} else if (drugCode.equals("C0016410")) {
				effectiveTimeLow = "20090101010";
				effectiveTimeHigh = "201106101010";
			} else if (drugCode.equals("C0024467")) {
				effectiveTimeLow = "199910101010";
				effectiveTimeHigh = "201010101010";
			}
			ObjectFactory of = new ObjectFactory();
			IVLTS ivlts = of.createIVLTS();
			IVXBTS low = of.createIVXBTS();
			low.setValue(effectiveTimeLow);
			IVXBTS high = of.createIVXBTS();
			high.setValue(effectiveTimeHigh);
			ivlts.getRest().add(of.createIVLTSLow(low));
			ivlts.getRest().add(of.createIVLTSHigh(high));

			effectiveTime.add(0, ivlts);
		}

		stub.qUPC_AR004030UV_QUPC_IN043200UV(query);

		stub = new tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub();//

		query = (org.hl7.v3.QUPCIN043200UV01) getTestObject(org.hl7.v3.QUPCIN043200UV01.class);
		is = this
				.getClass()
				.getClassLoader()
				.getResourceAsStream(
						"messageTemplatesFromEHR-PHR/VTCareplan/EHR/PCC-10-Input-Scenario-ProblemsStep1.xml");

		context = JAXBContext.newInstance("org.hl7.v3");
		unmarshaller = context.createUnmarshaller();
		query = (org.hl7.v3.QUPCIN043200UV01) unmarshaller.unmarshal(is);

		stub.qUPC_AR004030UV_QUPC_IN043200UV(query);

		stub = new tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub();//

		query = (org.hl7.v3.QUPCIN043200UV01) getTestObject(org.hl7.v3.QUPCIN043200UV01.class);
		is = this
				.getClass()
				.getClassLoader()
				.getResourceAsStream(
						"messageTemplatesFromEHR-PHR/VTCareplan/EHR/PCC-10-Input-Scenario-VitalSignStep1.xml");

		context = JAXBContext.newInstance("org.hl7.v3");
		unmarshaller = context.createUnmarshaller();
		query = (org.hl7.v3.QUPCIN043200UV01) unmarshaller.unmarshal(is);

		stub.qUPC_AR004030UV_QUPC_IN043200UV(query);

		stub = new tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub();//

		query = (org.hl7.v3.QUPCIN043200UV01) getTestObject(org.hl7.v3.QUPCIN043200UV01.class);
		is = this
				.getClass()
				.getClassLoader()
				.getResourceAsStream(
						"messageTemplatesFromEHR-PHR/VTCareplan/EHR/PCC-10-Input-Scenario-ProceduresStep1.xml");

		context = JAXBContext.newInstance("org.hl7.v3");
		unmarshaller = context.createUnmarshaller();
		query = (org.hl7.v3.QUPCIN043200UV01) unmarshaller.unmarshal(is);

		stub.qUPC_AR004030UV_QUPC_IN043200UV(query);
		*/

		stub = new tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub();//

		query = (org.hl7.v3.QUPCIN043200UV01) getTestObject(org.hl7.v3.QUPCIN043200UV01.class);
		is = this
				.getClass()
				.getClassLoader()
				.getResourceAsStream(
						"messageTemplatesFromEHR-PHR/VTCareplan/PHR/PCC-10-Input-Scenario-ProblemsStep6.xml");

		context = JAXBContext.newInstance("org.hl7.v3");
		unmarshaller = context.createUnmarshaller();
		query = (org.hl7.v3.QUPCIN043200UV01) unmarshaller.unmarshal(is);

		stub.qUPC_AR004030UV_QUPC_IN043200UV(query);

		stub = new tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub();//

		query = (org.hl7.v3.QUPCIN043200UV01) getTestObject(org.hl7.v3.QUPCIN043200UV01.class);
		is = this
				.getClass()
				.getClassLoader()
				.getResourceAsStream(
						"messageTemplatesFromEHR-PHR/VTCareplan/PHR/PCC-10-Input-Scenario-ProblemsStep8.xml");

		context = JAXBContext.newInstance("org.hl7.v3");
		unmarshaller = context.createUnmarshaller();
		query = (org.hl7.v3.QUPCIN043200UV01) unmarshaller.unmarshal(is);

		stub.qUPC_AR004030UV_QUPC_IN043200UV(query);

		stub = new tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub();//

		query = (org.hl7.v3.QUPCIN043200UV01) getTestObject(org.hl7.v3.QUPCIN043200UV01.class);
		is = this
				.getClass()
				.getClassLoader()
				.getResourceAsStream(
						"messageTemplatesFromEHR-PHR/VTCareplan/PHR/PCC-10-Input-Scenario-DailyLivingStep8.xml");

		context = JAXBContext.newInstance("org.hl7.v3");
		unmarshaller = context.createUnmarshaller();
		query = (org.hl7.v3.QUPCIN043200UV01) unmarshaller.unmarshal(is);

		stub.qUPC_AR004030UV_QUPC_IN043200UV(query);

		stub = new tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub();//

		query = (org.hl7.v3.QUPCIN043200UV01) getTestObject(org.hl7.v3.QUPCIN043200UV01.class);
		is = this
				.getClass()
				.getClassLoader()
				.getResourceAsStream(
						"messageTemplatesFromEHR-PHR/VTCareplan/PHR/PCC-10-Input-Scenario-MedicationsStep8.xml");

		context = JAXBContext.newInstance("org.hl7.v3");
		unmarshaller = context.createUnmarshaller();
		query = (org.hl7.v3.QUPCIN043200UV01) unmarshaller.unmarshal(is);
		pertinentInformation3 = query.getControlActProcess().getSubject()
				.get(0).getRegistrationEvent().getSubject2()
				.getCareProvisionEvent().getPertinentInformation3();

		for (int i = 0; i < pertinentInformation3.size(); i++) {
			REPCMT004000UV01PertinentInformation5 pi = pertinentInformation3
					.get(i);
			POCDMT000040SubstanceAdministration sa = pi
					.getSubstanceAdministration().getValue();
			List<SXCMTS> effectiveTime = sa.getEffectiveTime();

			String drugCode = sa.getConsumable().getManufacturedProduct()
					.getManufacturedLabeledDrug().getCode().getCode();
			String effectiveTimeHigh = "", effectiveTimeLow = "";
			if (drugCode.equals("C0032952")) {
				effectiveTimeLow = "200812010000";
				effectiveTimeHigh = "201106101010";
			} else if (drugCode.equals("C0081876")) {
				effectiveTimeLow = "200812010000";
				effectiveTimeHigh = "201106101010";
			} else if (drugCode.equals("C0110591")) {
				effectiveTimeLow = "199910101010";
				effectiveTimeHigh = "201106101010";
			} else if (drugCode.equals("C0012010")) {
				effectiveTimeLow = "199910101010";
				effectiveTimeHigh = "201010101010";
			} else if (drugCode.equals("C0591288")) {
				effectiveTimeLow = "198010101010";
				effectiveTimeHigh = "201106101010";
			} else if (drugCode.equals("C0025677")) {
				effectiveTimeLow = "20090101010";
				effectiveTimeHigh = "201106101010";
			} else if (drugCode.equals("C0016410")) {
				effectiveTimeLow = "20090101010";
				effectiveTimeHigh = "201106101010";
			} else if (drugCode.equals("C0024467")) {
				effectiveTimeLow = "199910101010";
				effectiveTimeHigh = "201010101010";
			}
			ObjectFactory of = new ObjectFactory();
			IVLTS ivlts = of.createIVLTS();
			IVXBTS low = of.createIVXBTS();
			low.setValue(effectiveTimeLow);
			IVXBTS high = of.createIVXBTS();
			high.setValue(effectiveTimeHigh);
			ivlts.getRest().add(of.createIVLTSLow(low));
			ivlts.getRest().add(of.createIVLTSHigh(high));

			effectiveTime.add(0, ivlts);
		}

		stub.qUPC_AR004030UV_QUPC_IN043200UV(query);

	}

	// @Test
	public void testGroup2() throws java.lang.Exception {
		sslSetup();
		/*
		tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub stub = new tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub();//

		org.hl7.v3.QUPCIN043200UV01 query = (org.hl7.v3.QUPCIN043200UV01) getTestObject(org.hl7.v3.QUPCIN043200UV01.class);
		InputStream is = this
				.getClass()
				.getClassLoader()
				.getResourceAsStream(
						"messageTemplatesFromEHR-PHR/VTCareplan/EHR/PCC-10-Input-Scenario-ProblemsStep13.xml");

		JAXBContext context = JAXBContext.newInstance("org.hl7.v3");
		Unmarshaller unmarshaller = context.createUnmarshaller();
		query = (org.hl7.v3.QUPCIN043200UV01) unmarshaller.unmarshal(is);

		stub.qUPC_AR004030UV_QUPC_IN043200UV(query);
		*/

		stub = new tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub();//

		query = (org.hl7.v3.QUPCIN043200UV01) getTestObject(org.hl7.v3.QUPCIN043200UV01.class);
		is = this
				.getClass()
				.getClassLoader()
				.getResourceAsStream(
						"messageTemplatesFromEHR-PHR/VTCareplan/PHR/PCC-10-Input-Scenario-DailyLivingStep10.xml");

		context = JAXBContext.newInstance("org.hl7.v3");
		unmarshaller = context.createUnmarshaller();
		query = (org.hl7.v3.QUPCIN043200UV01) unmarshaller.unmarshal(is);

		stub.qUPC_AR004030UV_QUPC_IN043200UV(query);

		stub = new tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub();//

		query = (org.hl7.v3.QUPCIN043200UV01) getTestObject(org.hl7.v3.QUPCIN043200UV01.class);
		is = this
				.getClass()
				.getClassLoader()
				.getResourceAsStream(
						"messageTemplatesFromEHR-PHR/VTCareplan/PHR/PCC-10-Input-Scenario-ProblemsStep10.xml");

		context = JAXBContext.newInstance("org.hl7.v3");
		unmarshaller = context.createUnmarshaller();
		query = (org.hl7.v3.QUPCIN043200UV01) unmarshaller.unmarshal(is);

		stub.qUPC_AR004030UV_QUPC_IN043200UV(query);

		stub = new tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub();//

		query = (org.hl7.v3.QUPCIN043200UV01) getTestObject(org.hl7.v3.QUPCIN043200UV01.class);
		is = this
				.getClass()
				.getClassLoader()
				.getResourceAsStream(
						"messageTemplatesFromEHR-PHR/VTCareplan/PHR/PCC-10-Input-Scenario-ProblemsStep11.xml");

		context = JAXBContext.newInstance("org.hl7.v3");
		unmarshaller = context.createUnmarshaller();
		query = (org.hl7.v3.QUPCIN043200UV01) unmarshaller.unmarshal(is);

		stub.qUPC_AR004030UV_QUPC_IN043200UV(query);

		stub = new tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub();//

		query = (org.hl7.v3.QUPCIN043200UV01) getTestObject(org.hl7.v3.QUPCIN043200UV01.class);
		is = this
				.getClass()
				.getClassLoader()
				.getResourceAsStream(
						"messageTemplatesFromEHR-PHR/VTCareplan/PHR/PCC-10-Input-Scenario-ProblemsStep14.xml");

		context = JAXBContext.newInstance("org.hl7.v3");
		unmarshaller = context.createUnmarshaller();
		query = (org.hl7.v3.QUPCIN043200UV01) unmarshaller.unmarshal(is);

		stub.qUPC_AR004030UV_QUPC_IN043200UV(query);

		stub = new tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub();//

		query = (org.hl7.v3.QUPCIN043200UV01) getTestObject(org.hl7.v3.QUPCIN043200UV01.class);
		is = this
				.getClass()
				.getClassLoader()
				.getResourceAsStream(
						"messageTemplatesFromEHR-PHR/VTCareplan/PHR/PCC-10-Input-Scenario-VitalSignStep11.xml");

		context = JAXBContext.newInstance("org.hl7.v3");
		unmarshaller = context.createUnmarshaller();
		query = (org.hl7.v3.QUPCIN043200UV01) unmarshaller.unmarshal(is);

		stub.qUPC_AR004030UV_QUPC_IN043200UV(query);

		/*
		stub = new tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub();//

		query = (org.hl7.v3.QUPCIN043200UV01) getTestObject(org.hl7.v3.QUPCIN043200UV01.class);
		is = this
				.getClass()
				.getClassLoader()
				.getResourceAsStream(
						"messageTemplatesFromEHR-PHR/VTCareplan/EHR/PCC-10-Input-Scenario-Medications-Step13.xml");

		context = JAXBContext.newInstance("org.hl7.v3");
		unmarshaller = context.createUnmarshaller();
		query = (org.hl7.v3.QUPCIN043200UV01) unmarshaller.unmarshal(is);
		List<REPCMT004000UV01PertinentInformation5> pertinentInformation3 = query
				.getControlActProcess().getSubject().get(0)
				.getRegistrationEvent().getSubject2().getCareProvisionEvent()
				.getPertinentInformation3();

		for (int i = 0; i < pertinentInformation3.size(); i++) {
			REPCMT004000UV01PertinentInformation5 pi = pertinentInformation3
					.get(i);
			POCDMT000040SubstanceAdministration sa = pi
					.getSubstanceAdministration().getValue();
			List<SXCMTS> effectiveTime = sa.getEffectiveTime();

			String drugCode = sa.getConsumable().getManufacturedProduct()
					.getManufacturedLabeledDrug().getCode().getCode();
			String effectiveTimeHigh = "", effectiveTimeLow = "";
			if (drugCode.equals("C0032952")) {
				effectiveTimeLow = "200812010000";
				effectiveTimeHigh = "201106101010";
			}
			ObjectFactory of = new ObjectFactory();
			IVLTS ivlts = of.createIVLTS();
			IVXBTS low = of.createIVXBTS();
			low.setValue(effectiveTimeLow);
			IVXBTS high = of.createIVXBTS();
			high.setValue(effectiveTimeHigh);
			ivlts.getRest().add(of.createIVLTSLow(low));
			ivlts.getRest().add(of.createIVLTSHigh(high));

			effectiveTime.add(0, ivlts);
		}

		stub.qUPC_AR004030UV_QUPC_IN043200UV(query);
		*/

		/*
		 * // ALT TARAF KALKTI CUNKU AYNI MESAJ EHR icinde gidiyormus. Gokce
		 * oyle dedi. stub = new
		 * tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub
		 * ();//
		 * 
		 * query = (org.hl7.v3.QUPCIN043200UV01)
		 * getTestObject(org.hl7.v3.QUPCIN043200UV01.class); is =
		 * this.getClass().getClassLoader().getResourceAsStream(
		 * "messageTemplatesFromEHR-PHR/VTCareplan/PHR/PCC-10-Input-Scenario-Medications-Step13.xml"
		 * );
		 * 
		 * context = JAXBContext.newInstance("org.hl7.v3"); unmarshaller =
		 * context.createUnmarshaller(); query = (org.hl7.v3.QUPCIN043200UV01)
		 * unmarshaller.unmarshal(is); pertinentInformation3 =
		 * query.getControlActProcess
		 * ().getSubject().get(0).getRegistrationEvent(
		 * ).getSubject2().getCareProvisionEvent().getPertinentInformation3();
		 * 
		 * for (int i = 0; i < pertinentInformation3.size(); i++) {
		 * REPCMT004000UV01PertinentInformation5 pi =
		 * pertinentInformation3.get(i); POCDMT000040SubstanceAdministration sa
		 * = pi.getSubstanceAdministration().getValue(); List<SXCMTS>
		 * effectiveTime = sa.getEffectiveTime();
		 * 
		 * String drugCode =
		 * sa.getConsumable().getManufacturedProduct().getManufacturedLabeledDrug
		 * ().getCode().getCode(); String effectiveTimeHigh = "",
		 * effectiveTimeLow = ""; if (drugCode.equals("C0032952")) {
		 * effectiveTimeLow = "200812010000"; effectiveTimeHigh =
		 * "201106101010"; } ObjectFactory of = new ObjectFactory(); IVLTS ivlts
		 * = of.createIVLTS(); IVXBTS low = of.createIVXBTS();
		 * low.setValue(effectiveTimeLow); IVXBTS high = of.createIVXBTS();
		 * high.setValue(effectiveTimeHigh);
		 * ivlts.getRest().add(of.createIVLTSLow(low));
		 * ivlts.getRest().add(of.createIVLTSHigh(high));
		 * 
		 * effectiveTime.add(0, ivlts); }
		 * 
		 * stub.qUPC_AR004030UV_QUPC_IN043200UV(query);
		 */
	}

	// @Test
	public void testGroup3() throws java.lang.Exception {
		sslSetup();
		tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub stub = new tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub();//

		org.hl7.v3.QUPCIN043200UV01 query = (org.hl7.v3.QUPCIN043200UV01) getTestObject(org.hl7.v3.QUPCIN043200UV01.class);
		InputStream is = this
				.getClass()
				.getClassLoader()
				.getResourceAsStream(
						"messageTemplatesFromEHR-PHR/VTCareplan/EHR/PCC-10-Input-Scenario-LabResultsStep18.xml");

		JAXBContext context = JAXBContext.newInstance("org.hl7.v3");
		Unmarshaller unmarshaller = context.createUnmarshaller();
		query = (org.hl7.v3.QUPCIN043200UV01) unmarshaller.unmarshal(is);

		stub.qUPC_AR004030UV_QUPC_IN043200UV(query);

		stub = new tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub();//

		query = (org.hl7.v3.QUPCIN043200UV01) getTestObject(org.hl7.v3.QUPCIN043200UV01.class);
		is = this
				.getClass()
				.getClassLoader()
				.getResourceAsStream(
						"messageTemplatesFromEHR-PHR/VTCareplan/EHR/PCC-10-Input-Scenario-Medications-Step18.xml");

		context = JAXBContext.newInstance("org.hl7.v3");
		unmarshaller = context.createUnmarshaller();
		query = (org.hl7.v3.QUPCIN043200UV01) unmarshaller.unmarshal(is);
		List<REPCMT004000UV01PertinentInformation5> pertinentInformation3 = query
				.getControlActProcess().getSubject().get(0)
				.getRegistrationEvent().getSubject2().getCareProvisionEvent()
				.getPertinentInformation3();

		for (int i = 0; i < pertinentInformation3.size(); i++) {
			REPCMT004000UV01PertinentInformation5 pi = pertinentInformation3
					.get(i);
			POCDMT000040SubstanceAdministration sa = pi
					.getSubstanceAdministration().getValue();
			List<SXCMTS> effectiveTime = sa.getEffectiveTime();

			String drugCode = sa.getConsumable().getManufacturedProduct()
					.getManufacturedLabeledDrug().getCode().getCode();
			String effectiveTimeHigh = "", effectiveTimeLow = "";
			if (drugCode.equals("C0110591")) {
				effectiveTimeLow = "199910101010";
				effectiveTimeHigh = "201106101010";
			}
			ObjectFactory of = new ObjectFactory();
			IVLTS ivlts = of.createIVLTS();
			IVXBTS low = of.createIVXBTS();
			low.setValue(effectiveTimeLow);
			IVXBTS high = of.createIVXBTS();
			high.setValue(effectiveTimeHigh);
			ivlts.getRest().add(of.createIVLTSLow(low));
			ivlts.getRest().add(of.createIVLTSHigh(high));

			effectiveTime.add(0, ivlts);
		}

		stub.qUPC_AR004030UV_QUPC_IN043200UV(query);

		stub = new tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub();//

		query = (org.hl7.v3.QUPCIN043200UV01) getTestObject(org.hl7.v3.QUPCIN043200UV01.class);
		is = this
				.getClass()
				.getClassLoader()
				.getResourceAsStream(
						"messageTemplatesFromEHR-PHR/VTCareplan/EHR/PCC-10-Input-Scenario-Medications-Step19.xml");

		context = JAXBContext.newInstance("org.hl7.v3");
		unmarshaller = context.createUnmarshaller();
		query = (org.hl7.v3.QUPCIN043200UV01) unmarshaller.unmarshal(is);
		pertinentInformation3 = query.getControlActProcess().getSubject()
				.get(0).getRegistrationEvent().getSubject2()
				.getCareProvisionEvent().getPertinentInformation3();

		for (int i = 0; i < pertinentInformation3.size(); i++) {
			REPCMT004000UV01PertinentInformation5 pi = pertinentInformation3
					.get(i);
			POCDMT000040SubstanceAdministration sa = pi
					.getSubstanceAdministration().getValue();
			List<SXCMTS> effectiveTime = sa.getEffectiveTime();

			String drugCode = sa.getConsumable().getManufacturedProduct()
					.getManufacturedLabeledDrug().getCode().getCode();
			String effectiveTimeHigh = "", effectiveTimeLow = "";
			if (drugCode.equals("C0939400")) {
				effectiveTimeLow = "201101241010";
				effectiveTimeHigh = "201106101010";
			} else if (drugCode.equals("C0081876")) {
				effectiveTimeLow = "200812010000";
				effectiveTimeHigh = "201101241010";
			}
			ObjectFactory of = new ObjectFactory();
			IVLTS ivlts = of.createIVLTS();
			IVXBTS low = of.createIVXBTS();
			low.setValue(effectiveTimeLow);
			IVXBTS high = of.createIVXBTS();
			high.setValue(effectiveTimeHigh);
			ivlts.getRest().add(of.createIVLTSLow(low));
			ivlts.getRest().add(of.createIVLTSHigh(high));

			effectiveTime.add(0, ivlts);
		}

		stub.qUPC_AR004030UV_QUPC_IN043200UV(query);
	}

	// ************* SAMPLE
	//

	// @Test
	public void testqUPC_AR004030UV_QUPC_IN043200UV_Problems_Sample()
			throws java.lang.Exception {
		sslSetup();
		tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub stub = new tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub();//

		org.hl7.v3.QUPCIN043200UV01 query = (org.hl7.v3.QUPCIN043200UV01) getTestObject(org.hl7.v3.QUPCIN043200UV01.class);
		InputStream is = this
				.getClass()
				.getClassLoader()
				.getResourceAsStream(
						"messageTemplatesFromEHR-PHR/Sample/PCC-10-Input-Scenario-Problems-Sample.xml");

		JAXBContext context = JAXBContext.newInstance("org.hl7.v3");
		Unmarshaller unmarshaller = context.createUnmarshaller();
		query = (org.hl7.v3.QUPCIN043200UV01) unmarshaller.unmarshal(is);

		stub.qUPC_AR004030UV_QUPC_IN043200UV(query);
	}

	// @Test
	public void testqUPC_AR004030UV_QUPC_IN043200UV_Medications_Sample()
			throws java.lang.Exception {
		sslSetup();
		tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub stub = new tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub(
				"http://localhost:8443/icardea-caremanager-ws/services/QUPC_AR004030UV_Service.QUPC_AR004030UV_ServiceHttpSoap12Endpoint/");//

		org.hl7.v3.QUPCIN043200UV01 query = (org.hl7.v3.QUPCIN043200UV01) getTestObject(org.hl7.v3.QUPCIN043200UV01.class);
		InputStream is = this
				.getClass()
				.getClassLoader()
				.getResourceAsStream(
						"messageTemplatesFromEHR-PHR/Sample/PCC-10-Input-Scenario-Medications.xml");

		JAXBContext context = JAXBContext.newInstance("org.hl7.v3");
		Unmarshaller unmarshaller = context.createUnmarshaller();
		query = (org.hl7.v3.QUPCIN043200UV01) unmarshaller.unmarshal(is);

		List<REPCMT004000UV01PertinentInformation5> pertinentInformation3 = query
				.getControlActProcess().getSubject().get(0)
				.getRegistrationEvent().getSubject2().getCareProvisionEvent()
				.getPertinentInformation3();

		for (int i = 0; i < pertinentInformation3.size(); i++) {
			REPCMT004000UV01PertinentInformation5 pi = pertinentInformation3
					.get(i);
			POCDMT000040SubstanceAdministration sa = pi
					.getSubstanceAdministration().getValue();
			List<SXCMTS> effectiveTime = sa.getEffectiveTime();

			ObjectFactory of = new ObjectFactory();
			IVLTS ivlts = of.createIVLTS();
			IVXBTS low = of.createIVXBTS();
			low.setValue("199910101010");
			IVXBTS high = of.createIVXBTS();
			high.setValue("201010101010");
			ivlts.getRest().add(of.createIVLTSLow(low));
			ivlts.getRest().add(of.createIVLTSHigh(high));

			effectiveTime.add(0, ivlts);
		}

		stub.qUPC_AR004030UV_QUPC_IN043200UV(query);
	}

	// @Test
	public void testqUPC_AR004030UV_QUPC_IN043200UV_PHR_Medications_RXNORM()
			throws java.lang.Exception {
		sslSetup();
		tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub stub = new tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub();//

		org.hl7.v3.QUPCIN043200UV01 query = (org.hl7.v3.QUPCIN043200UV01) getTestObject(org.hl7.v3.QUPCIN043200UV01.class);
		InputStream is = this
				.getClass()
				.getClassLoader()
				.getResourceAsStream(
						"messageTemplatesFromEHR-PHR/PHR/PCC-10-Input-Scenario-Medications-RXNORM.xml");

		JAXBContext context = JAXBContext.newInstance("org.hl7.v3");
		Unmarshaller unmarshaller = context.createUnmarshaller();
		query = (org.hl7.v3.QUPCIN043200UV01) unmarshaller.unmarshal(is);
		List<REPCMT004000UV01PertinentInformation5> pertinentInformation3 = query
				.getControlActProcess().getSubject().get(0)
				.getRegistrationEvent().getSubject2().getCareProvisionEvent()
				.getPertinentInformation3();

		for (int i = 0; i < pertinentInformation3.size(); i++) {
			REPCMT004000UV01PertinentInformation5 pi = pertinentInformation3
					.get(i);
			POCDMT000040SubstanceAdministration sa = pi
					.getSubstanceAdministration().getValue();
			List<SXCMTS> effectiveTime = sa.getEffectiveTime();

			ObjectFactory of = new ObjectFactory();
			IVLTS ivlts = of.createIVLTS();
			IVXBTS low = of.createIVXBTS();
			low.setValue("199910101010");
			IVXBTS high = of.createIVXBTS();
			high.setValue("201010101010");
			ivlts.getRest().add(of.createIVLTSLow(low));
			ivlts.getRest().add(of.createIVLTSHigh(high));

			effectiveTime.add(0, ivlts);
		}

		stub.qUPC_AR004030UV_QUPC_IN043200UV(query);
	}

	// @Test
	public void testqUPC_AR004030UV_QUPC_IN043200UV_EHR_LabResults_Loinc()
			throws java.lang.Exception {
		sslSetup();
		tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub stub = new tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub();//

		org.hl7.v3.QUPCIN043200UV01 query = (org.hl7.v3.QUPCIN043200UV01) getTestObject(org.hl7.v3.QUPCIN043200UV01.class);
		InputStream is = this
				.getClass()
				.getClassLoader()
				.getResourceAsStream(
						"messageTemplatesFromEHR-PHR/EHR/PCC-10-Input-Scenario-LabResultsStep4(Loinc).xml");

		JAXBContext context = JAXBContext.newInstance("org.hl7.v3");
		Unmarshaller unmarshaller = context.createUnmarshaller();
		query = (org.hl7.v3.QUPCIN043200UV01) unmarshaller.unmarshal(is);

		stub.qUPC_AR004030UV_QUPC_IN043200UV(query);
	}

	// @Test
	public void testqUPC_AR004030UV_QUPC_IN043200UV_EHR_Medications_RxNorm()
			throws java.lang.Exception {
		sslSetup();
		tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub stub = new tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub();//

		org.hl7.v3.QUPCIN043200UV01 query = (org.hl7.v3.QUPCIN043200UV01) getTestObject(org.hl7.v3.QUPCIN043200UV01.class);
		InputStream is = this
				.getClass()
				.getClassLoader()
				.getResourceAsStream(
						"messageTemplatesFromEHR-PHR/EHR/PCC-10-Input-Scenario-Medications-Step6(RxNorm).xml");

		JAXBContext context = JAXBContext.newInstance("org.hl7.v3");
		Unmarshaller unmarshaller = context.createUnmarshaller();
		query = (org.hl7.v3.QUPCIN043200UV01) unmarshaller.unmarshal(is);
		List<REPCMT004000UV01PertinentInformation5> pertinentInformation3 = query
				.getControlActProcess().getSubject().get(0)
				.getRegistrationEvent().getSubject2().getCareProvisionEvent()
				.getPertinentInformation3();

		for (int i = 0; i < pertinentInformation3.size(); i++) {
			REPCMT004000UV01PertinentInformation5 pi = pertinentInformation3
					.get(i);
			POCDMT000040SubstanceAdministration sa = pi
					.getSubstanceAdministration().getValue();
			List<SXCMTS> effectiveTime = sa.getEffectiveTime();

			ObjectFactory of = new ObjectFactory();
			IVLTS ivlts = of.createIVLTS();
			IVXBTS low = of.createIVXBTS();
			low.setValue("199910101010");
			IVXBTS high = of.createIVXBTS();
			high.setValue("201010101010");
			ivlts.getRest().add(of.createIVLTSLow(low));
			ivlts.getRest().add(of.createIVLTSHigh(high));

			effectiveTime.add(0, ivlts);
		}

		stub.qUPC_AR004030UV_QUPC_IN043200UV(query);
	}

	// @Test
	public void testqUPC_AR004030UV_QUPC_IN043200UV_EHR_Problems_SnomedCT()
			throws java.lang.Exception {
		sslSetup();
		tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub stub = new tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub();//

		org.hl7.v3.QUPCIN043200UV01 query = (org.hl7.v3.QUPCIN043200UV01) getTestObject(org.hl7.v3.QUPCIN043200UV01.class);
		InputStream is = this
				.getClass()
				.getClassLoader()
				.getResourceAsStream(
						"messageTemplatesFromEHR-PHR/EHR/PCC-10-Input-Scenario-Problems(Snomedct).xml");

		JAXBContext context = JAXBContext.newInstance("org.hl7.v3");
		Unmarshaller unmarshaller = context.createUnmarshaller();
		query = (org.hl7.v3.QUPCIN043200UV01) unmarshaller.unmarshal(is);

		stub.qUPC_AR004030UV_QUPC_IN043200UV(query);
	}

	// @Test
	public void testqUPC_AR004030UV_QUPC_IN043200UV_EHR_SnomedCT()
			throws java.lang.Exception {
		sslSetup();
		tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub stub = new tr.com.srdc.icardea.ihe.cm.clinicalDataSource.QUPC_AR004030UV_ServiceStub();//

		org.hl7.v3.QUPCIN043200UV01 query = (org.hl7.v3.QUPCIN043200UV01) getTestObject(org.hl7.v3.QUPCIN043200UV01.class);
		InputStream is = this
				.getClass()
				.getClassLoader()
				.getResourceAsStream(
						"messageTemplatesFromEHR-PHR/EHR/PCC-10-Input-Scenario-Procedures(Snomedct).xml");

		JAXBContext context = JAXBContext.newInstance("org.hl7.v3");
		Unmarshaller unmarshaller = context.createUnmarshaller();
		query = (org.hl7.v3.QUPCIN043200UV01) unmarshaller.unmarshal(is);

		stub.qUPC_AR004030UV_QUPC_IN043200UV(query);
	}

	// Create an object and provide it as the test object
	public Object getTestObject(java.lang.Class type)
			throws java.lang.Exception {
		return type.newInstance();
	}

	/*
	 * @BeforeClass public static void setup() {
	 * System.out.println("Starting tomcat..."); String line, command =
	 * "..\\tools\\apache-tomcat-6.0.20\\bin\\startup.bat"; try { Process p =
	 * Runtime.getRuntime().exec(command); //BufferedReader input = // new
	 * BufferedReader(new InputStreamReader(p.getInputStream())); //while ((line
	 * = input.readLine()) != null) { // System.out.println(line); //}
	 * //input.close();
	 * System.out.println("Tomcat started... Waiting for 20 seconds...");
	 * Thread.sleep(20000); } catch (Exception ex) { ex.printStackTrace(); } }
	 */

	/*
	 * @AfterClass public static void teardown() {
	 * System.out.println("Stopping tomcat..."); String line, command =
	 * "..\\tools\\apache-tomcat-6.0.20\\bin\\shutdown.bat"; try { Process p =
	 * Runtime.getRuntime().exec(command); BufferedReader input = new
	 * BufferedReader(new InputStreamReader(p.getInputStream())); while ((line =
	 * input.readLine()) != null) { System.out.println(line); } input.close();
	 * System.out.println("Tomcat stopped..."); } catch (IOException ex) {
	 * ex.printStackTrace(); } }
	 */
	public static void main(String args[]) {
		org.junit.runner.JUnitCore
				.main("tr.com.srdc.icardea.ihe.cm.clinicalDataSource.IHEIDCOIntegrationTest.QUPC_AR004030UV_ServiceIntegrationTest");
	}
}

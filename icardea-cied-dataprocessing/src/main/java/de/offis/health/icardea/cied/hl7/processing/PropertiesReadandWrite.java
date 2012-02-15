package de.offis.health.icardea.cied.hl7.processing;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesReadandWrite {

	Properties p = new Properties();
	
	public Properties getProperties(String filename) throws IOException {
		
		ClassLoader cl = this.getClass().getClassLoader();
		FileInputStream input;
		// if(cl!=null)
		//input=cl.getResourceAsStream(filename);
		input = new FileInputStream(filename);
		//else
		//input=ClassLoader.getSystemResourceAsStream(filename);
		
		p.load(input);
		return p;
	}
	
	
	
	public void setProperties(int first, int second, int next) {
		
		p.setProperty("",String.valueOf(first));
		p.setProperty("secondnum",String.valueOf(second));
		p.setProperty("nextnum",String.valueOf(next));
		
		File file = new File ("C:/Users/mYang/Documents/NetBeansProjects/HAPI_1.0.1/src/ca/uhn/hl7v25/examples/ParseZUrlNum.properties.properties");
		try {
			OutputStream fos = new FileOutputStream(file);
			p.store(fos, "ParseZUrlNum.properties");
			fos.close();
		} catch (FileNotFoundException ex) {
			System.out.println("file is NULL !!!");
			ex.printStackTrace();
		} catch (IOException ex) {
			System.out.println("IO is Error !!!");
			ex.printStackTrace();
		}
	}
}

package de.offis.health.icardea.cied.hl7.oru;

import java.io.File;

public class ORU_EGM {
	public File originalFile=null;
	public int egmPageNumber=0;
	public String egmName="";
	public byte[] egmContent = null;
	/**
	 * @return the egmPageNumber
	 */
	public int getEgmPageNumber() {
		return egmPageNumber;
	}
	/**
	 * @param egmPageNumber the egmPageNumber to set
	 */
	public void setEgmPageNumber(int egmPageNumber) {
		this.egmPageNumber = egmPageNumber;
	}
	/**
	 * @return the egmName
	 */
	public String getEgmName() {
		return egmName;
	}
	/**
	 * @param egmName the egmName to set
	 */
	public void setEgmName(String egmName) {
		this.egmName = egmName;
	}
	/**
	 * @return the originalFile
	 */
	public File getOriginalFile() {
		return originalFile;
	}
	/**
	 * @param originalFile the originalFile to set
	 */
	public void setOriginalFile(File originalFile) {
		this.originalFile = originalFile;
	}
	/**
	 * @return the egmPageContent
	 */
	public byte[] getEgmContent() {
		return egmContent;
	}
	/**
	 * @param egmPageContent the egmPageContent to set
	 */
	public void setEgmContent(byte[] egmPageContent) {
		this.egmContent = egmPageContent;
	}

}

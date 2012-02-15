package de.offis.health.icardea.cied.pdf.interfaces;

import de.offis.health.icardea.common.exception.PropertyNotFoundException;

public interface OBXParserInterface_TransmissionNotes {
	public String getMDC_IDC_PG_TYPE() throws PropertyNotFoundException;
	public String getMDC_IDC_PG_MODEL() throws PropertyNotFoundException;
	public String getMDC_IDC_PG_SERIAL() throws PropertyNotFoundException;
	public String getMDC_IDC_PG_MFG() throws PropertyNotFoundException;
	public String getMDC_IDC_SESS_DTM() throws PropertyNotFoundException;
	public String getMDC_IDC_SESS_TYPE() throws PropertyNotFoundException;
}

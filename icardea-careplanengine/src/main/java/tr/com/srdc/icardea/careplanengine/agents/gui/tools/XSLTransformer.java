package tr.com.srdc.icardea.careplanengine.agents.gui.tools;

//~--- JDK imports ------------------------------------------------------------

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;

//Imported java classes
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;

//Imported JAXP Transformer (TraX) classes
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

//Import the BrowserLauncher class
//import com.fleet.utilities.repgen.BrowserLauncher;
public class XSLTransformer implements Serializable {
    public XSLTransformer() {}

    // Make sure the buildReport method is thread-safe.
    synchronized public String buildReport(String sXMLData, String xsltContent)
            throws TransformerException, TransformerConfigurationException, FileNotFoundException, IOException {
        StringWriter       outputXMLWriter = new StringWriter();
        TransformerFactory tFactory        = TransformerFactory.newInstance();
        Transformer        transformer     = tFactory.newTransformer(new StreamSource(new StringReader(xsltContent)));

        transformer.transform(new StreamSource(new StringReader(sXMLData)), new StreamResult(outputXMLWriter));

        return outputXMLWriter.toString();
    }

    // Make sure the buildReport method is thread-safe.

    // Include a static main function for testing.
    public String transform(String inputXMLContent, URL _xsltFile) throws Exception {
        BufferedReader xsltBufferedReader = new BufferedReader(new InputStreamReader(_xsltFile.openStream()));
        String         readerLine;
        StringBuffer   xsltBuffer = new StringBuffer();

        while ((readerLine = xsltBufferedReader.readLine()) != null) {
            xsltBuffer.append(readerLine + "\n");
        }

        String xsltContent = xsltBuffer.toString();

//      return xsltContent;
        return buildReport(inputXMLContent, xsltContent);
    }
}


//~ Formatted by Jindent --- http://www.jindent.com

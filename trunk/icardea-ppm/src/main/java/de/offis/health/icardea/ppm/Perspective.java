package de.offis.health.icardea.ppm;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.eclipse.rwt.RWT;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
import org.openid4java.discovery.DiscoveryInformation;

import de.offis.health.icardea.ppm.login.RegistrationService;

/**
 * Configures the perspective layout. This class is contributed through the
 * plugin.xml.
 */
public class Perspective implements IPerspectiveFactory {
	private static Logger logger = Logger.getLogger(Perspective.class);
	public void createInitialLayout(IPageLayout layout) {
		String editorArea = layout.getEditorArea();
		layout.setEditorAreaVisible(false);
		//		layout.setFixed(true);
		//		{
		//			IFolderLayout folderLayout = layout.createFolder("folder", IPageLayout.LEFT, 1.0f, editorArea);
		//			folderLayout.addView("de.offis.health.icardea.ppm.PPMMain");
		//		}
		PPMDataset ppmDataset = PPMDataset.getInstance();
		HttpServletRequest request = RWT.getRequest();
		logger.debug("Show in Perpektive");

		if (request!=null)
		{	
				if (request.getParameter("patientid")!=null){
				logger.debug("Switch ID");
				ppmDataset.setiCardeaID(request.getParameter("patientid").toString());
				logger.debug("Set ICARDEA ID "+ppmDataset.getiCardeaID()+" ID="+ppmDataset.getCurrentPatID());
			}
// scaled=true parameter indicates call from caremanagement
			if (request.getParameter("scaled")!=null){
				logger.debug("Scaled View Request");

				if (request.getParameter("scaled").toString().equals("true")){

					if (request.getParameter("openid")!=null){
//						ppmDataset.setOpenID(request.getParameter("openid").toString());
						//FIXME CL check the openid access situation 
						// If it is called with scaled and openID, the user should already be logged in
						// it has only to be approved, that ppm has an approval. 
						// set OpenID 
						ppmDataset.setUserOpenID(request.getParameter("openid").toString());
						// now: Call the login screen.  
						DiscoveryInformation discovery = RegistrationService
								.performDiscoveryOnUserSuppliedIdentifier(ppmDataset.getUserOpenID());
						if(discovery==null){
							logger.warn("No discovery for User. Mayve wrong or manupulated openID");
						}
						else{// There was a discovery
							
							
						}

					}

					layout.addPlaceholder("de.offis.health.icardea.ppm.GeneralView", IPageLayout.TOP, 0.3f, editorArea);
					layout.addView("de.offis.health.icardea.ppm.PPMMain", IPageLayout.BOTTOM, 0.7f, editorArea);
					
				}else{
					layout.addView("de.offis.health.icardea.ppm.GeneralView", IPageLayout.TOP, 0.3f, editorArea);
					layout.addPlaceholder("de.offis.health.icardea.ppm.PPMMain", IPageLayout.BOTTOM, 0.7f, editorArea);

				}
			}else{
				layout.addView("de.offis.health.icardea.ppm.GeneralView", IPageLayout.TOP, 0.3f, editorArea);
				layout.addPlaceholder("de.offis.health.icardea.ppm.PPMMain", IPageLayout.BOTTOM, 0.7f, editorArea);

			}
		}else{
			logger.debug("Choose plain view");
			layout.addView("de.offis.health.icardea.ppm.GeneralView", IPageLayout.TOP, 0.3f, editorArea);
			layout.addPlaceholder("de.offis.health.icardea.ppm.PPMMain", IPageLayout.BOTTOM, 0.7f, editorArea);

		}

		//		currentPPM.setCurrentPatID("2");
		//		layout.addView("de.offis.health.icardea.ppm.PPMMain", IPageLayout.BOTTOM, 0.8f, editorArea);

	}
}

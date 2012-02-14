package de.offis.health.icardea.ppm;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.eclipse.rwt.RWT;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

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

			if (request.getParameter("scaled")!=null){
				logger.debug("Scaled View Rewuest");

				if (request.getParameter("scaled").toString().equals("true")){

					if (request.getParameter("openid")!=null){
//						ppmDataset.setOpenID(request.getParameter("openid").toString());
						
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

package de.offis.health.icardea.ppm;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.eclipse.rwt.RWT;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
import org.openid4java.association.AssociationException;
import org.openid4java.discovery.DiscoveryException;
import org.openid4java.discovery.DiscoveryInformation;
import org.openid4java.message.MessageException;
import org.openid4java.message.Parameter;
import org.openid4java.message.ParameterList;

import de.offis.health.icardea.ppm.login.RegistrationModel;
import de.offis.health.icardea.ppm.login.RegistrationService;

/**
 * Configures the perspective layout. This class is contributed through the
 * plugin.xml.
 */
public class Perspective implements IPerspectiveFactory {
	private static Logger logger = Logger.getLogger(Perspective.class);
	private ParameterList paralist;
	PPMDataset ppmDataset = null;

	public void createInitialLayout(IPageLayout layout) {
		String editorArea = layout.getEditorArea();
		layout.setEditorAreaVisible(false);
		//		layout.setFixed(true);
		//		{
		//			IFolderLayout folderLayout = layout.createFolder("folder", IPageLayout.LEFT, 1.0f, editorArea);
		//			folderLayout.addView("de.offis.health.icardea.ppm.PPMMain");
		//		}
		ppmDataset = PPMDataset.getInstance();
		HttpServletRequest request = RWT.getRequest();

		logger.debug("Show in Perpektive");

		if (request!=null)
		{	
			ppmDataset.setCallerUrl(getUrlUsedPara(request));
			updatePPmDataset(request);

			if (request.getParameter("patientid")!=null){
				logger.debug("Switch ID");
				ppmDataset.setiCardeaID(request.getParameter("patientid").toString());
				logger.debug("Set ICARDEA ID "+ppmDataset.getiCardeaID()+" ID="+ppmDataset.getCurrentPatID());
			}
			// if there is an openid at the parameters, just start the login process without further questions,
			if (request.getParameter("openid")!=null){
				// If it is called with scaled and openID, the user should already be logged in
				// it has only to be approved, that ppm has an approval. 
				// set OpenID 
				//TODO: If this is called inside salk, maybe the short versioned openDI is transmitted
				ppmDataset.setUserOpenID(request.getParameter("openid").toString());
				if (!ppmDataset.isUserOpenIdVerified()) {
					ppmDataset.setAutoLogin(true);
				}
				System.out.println(" Perspective: Autologin true for user " +request.getParameter("openid").toString() );
			}

			// scaled=true parameter indicates call from caremanagement
			if (request.getParameter("scaled")!=null){
				logger.debug("Scaled View Request");
 
				if (request.getParameter("scaled").toString().equals("true")&&ppmDataset.isUserOpenIdVerified()){


					//scaled is true: directly show the data --> if the user is logged in
					layout.addPlaceholder("de.offis.health.icardea.ppm.GeneralView", IPageLayout.TOP, 0.3f, editorArea);
					layout.addView("de.offis.health.icardea.ppm.PPMMain", IPageLayout.BOTTOM, 0.7f, editorArea);

				}else{//scaled is false or user not logged in
					layout.addView("de.offis.health.icardea.ppm.GeneralView", IPageLayout.TOP, 0.3f, editorArea);
					layout.addPlaceholder("de.offis.health.icardea.ppm.PPMMain", IPageLayout.BOTTOM, 0.7f, editorArea);

				}
			}else{// scaled is null
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
	/*
	 Improved to get the parameters and the URL wich are used
	 */

	public String getUrlUsedParaWihtoutCache(HttpServletRequest req) {
		List<Parameter> paramList = new ParameterList(req.getParameterMap()).getParameters();
		String reqUrl = req.getRequestURL().toString();
		//String queryString = req.getQueryString();   // d=789
		//if (queryString != null && queryString.length()>0) {
		//	reqUrl += "?"+queryString;
		//}

		boolean paramExist = false;
		String paramUrl = "";

		for (Parameter p:paramList) {

			if(p.getKey().equalsIgnoreCase("patientid")|| 
					p.getKey().equalsIgnoreCase("openid")||
					p.getKey().equalsIgnoreCase("startup")||
					p.getKey().equalsIgnoreCase("scaled")
					){
				paramExist = true;
				paramUrl+="&"+p.getKey()+"="+p.getValue();}
			else{// Not used parameters 
				//logger.debug("Following URL Parameter was ignored: "+p.getKey()+"="+p.getValue());
			}

		}
		// remove first "&" and make it "?" if parameterlist exists
		if(paramExist){ 
			paramUrl= paramUrl.substring(1);
			paramUrl = "?"+paramUrl;
			reqUrl = reqUrl + paramUrl;
		}

		return reqUrl;
	}

	//OpenID Verification needs the cache 
	public String getUrlUsedPara(HttpServletRequest req) {
		List<Parameter> paramList = new ParameterList(req.getParameterMap()).getParameters();
		String reqUrl = req.getRequestURL().toString();
		String queryString = req.getQueryString();   // d=789
		if (queryString != null && queryString.length()>0) {
			reqUrl += "?"+queryString;
		}

		boolean paramExist = false;
		String paramUrl = "";

		for (Parameter p:paramList) {

			if(p.getKey().equalsIgnoreCase("patientid")|| 
					p.getKey().equalsIgnoreCase("startup")||
					p.getKey().equalsIgnoreCase("openid")||
					p.getKey().equalsIgnoreCase("startup")||
					p.getKey().equalsIgnoreCase("scaled")
					){
				paramExist = true;
				paramUrl+="&"+p.getKey()+"="+p.getValue();}
			else{// Not used parameters 
				//logger.debug("Following URL Parameter was ignored: "+p.getKey()+"="+p.getValue());
			}

		}
		// remove first "&" and make it "?" if parameterlist exists
		if(paramExist){ 
			reqUrl = reqUrl + paramUrl;
		}

		return reqUrl;
	}


	/*
	 * This Method gets the parameters from the openID request and updates them in Ppmdataset
	 */
	private void updatePPmDataset(HttpServletRequest request) {
		paralist = new ParameterList(request.getParameterMap());
		
		//If availabe: Accessing data returned from the OpenID authentication and integrate  them into PPMdataset
		{
			if (paralist.getParameterValue("openid.ax.count.label") != null){
				if(Integer.parseInt(paralist.getParameterValue("openid.ax.count.label"))>0){
					if(Integer.parseInt(paralist.getParameterValue("openid.ax.count.label"))>1){
						logger.warn("OpenID returnes multiples roles for the current user. Selecting first");
					}
					String roleOpenID = paralist.getParameterValue("openid.ax.value.label.1");

					logger.debug("Roletype available. Selecting first: " + roleOpenID);
					ppmDataset.setRole(roleOpenID);

				}
			}
			//If availabe: Accessing data returned from the OpenID authentication and integrate  them into PPMdataset
			if (paralist.getParameterValue("openid.sreg.fullname") != null){
				String fullnameOpenID = paralist.getParameterValue("openid.sreg.fullname");
				logger.debug("Fullname available: " + fullnameOpenID);
				String userOpenID = paralist.getParameterValue("openid.identity");
				if(fullnameOpenID.trim().isEmpty()){
					fullnameOpenID =  userOpenID;
					logger.debug("Fullname was empty. Taking Identity: " + fullnameOpenID);
				}
				//ppmDataset.setUserOpenID(userOpenID);
				ppmDataset.setUserFullName(fullnameOpenID);

			}
			//If availabe: Accessing data returned from the OpenID authentication and integrate  them into PPMdataset
			if (paralist.getParameterValue("openid.mode") != null){
				RegistrationModel regModelTest;
				try {
					regModelTest = RegistrationService.processReturn(request);
					if(regModelTest != null){
					logger.debug("Registrationmodel:"+ regModelTest.getIs_verified());
					ppmDataset.setUserOpenIdVerified(regModelTest.getIs_verified());
					logger.debug("registrationmodel "+ regModelTest.getFullName() + " " +regModelTest.getRole() ) ;
					
					}
				} catch (MessageException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (DiscoveryException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (AssociationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
//				logger.debug("openid.mode found");
//				if (paralist.getParameterValue("openid.mode").equalsIgnoreCase("id_res"))
//				{
//					ppmDataset.setUserOpenIdVerified(true);
//					ppmDataset.setAutoLogin(false);
//				}
//				else{
//					ppmDataset.setUserOpenIdVerified(false);
//				}
			}
			logger.debug("Initial URL was set to "+getUrlUsedPara(request));
			//ppmDataset.setCallerUrl(getUrlUsedPara(request));

		}// End of filling ppmdataset 
	}

}

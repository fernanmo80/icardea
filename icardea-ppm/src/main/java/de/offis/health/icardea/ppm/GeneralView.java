/**
 * 
 */
package de.offis.health.icardea.ppm;

import java.net.UnknownHostException;
import java.text.MessageFormat;
import java.util.ResourceBundle;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.eclipse.rwt.RWT;
import org.eclipse.rwt.internal.widgets.JSExecutor;
import org.eclipse.rwt.lifecycle.WidgetUtil;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;
import org.openid4java.association.AssociationException;
import org.openid4java.discovery.DiscoveryException;
import org.openid4java.discovery.DiscoveryInformation;
import org.openid4java.message.AuthRequest;
import org.openid4java.message.MessageException;
import org.openid4java.message.ParameterList;

import de.offis.health.icardea.ppm.login.RegistrationModel;
import de.offis.health.icardea.ppm.login.RegistrationService;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Group;

/**
 * @author thiel
 *
 */
public class GeneralView extends ViewPart {
	public Composite patientInfos;
	public Composite userComposit;
	public Label lblPatient;
	public Label lblDiagnosis;
	public Label lblImplantation;
	public Label lblIcd;
	public Label lblWelcome;
	public Button btnLogout;
	public Label lblChooseView;
	public Button btnDact;
	public Combo chooseViews;
	public Combo chooseDate;
	private static Logger logger = Logger.getLogger(GeneralView.class);

	/**
	 * 
	 */
	public GeneralView() {
		//setTitleImage(ResourceManager.getPluginImage("de.offis.health.icardea.ppm", "iCARDEA-logo.png"));
		// TODO Auto-generated constructor stub
		ppmDataset=PPMDataset.getInstance();
	}
	PPMDataset	ppmDataset;
	private Composite patientTop;
	private StackLayout patientTopLayout;
	private Composite patientChooser;
	private Combo comboPatientlist;
	private Button btnPatientOKButton;
	private Label lblUsername;
	private Text uname;
	private Label lblpwd;
	private Label pwd;
	private Button btnOK;
	private Button btnAbort;
	private Composite login;

	private int choosenTab=0;
	private boolean startScaled=false;
	// Role can be RZ-iCARDEA-Admin , RZ-iCARDEA-Doctor-Cardiologist, RZ-iCARDEA-Doctor-Electrophysiologist, RZ-iCARDEA-Doctor-Physician, RZ-iCARDEA-Nurse
	// That are the roles from OpenID
	// TODO Ask yildiray for roles fo consenteditor: ROLECODE:DOCTOR , ROLECODE:NURSE ... PHRS has a lot definied like family member 
	// Somewhere the roles must be mapped from LDAP to consenteditor
	private String role="doctor";
	private Composite logoComp;
	private Composite headerComposite;
	private Composite dataComposite;
	private GridData gd_headerComposite ;
	private Audit audit;
	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.WorkbenchPart#createPartControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createPartControl(Composite parent) {
		{		
			{
				HttpServletRequest request = RWT.getRequest();
				parent.setLayout(new GridLayout(1, true));
				try {
					audit=new Audit(ResourceBundle.getBundle("icardea").getString(
							"atna.log.server"), 2861);
				} catch (UnknownHostException e2) {
					logger.error("Audit Server Unkown Host");
					try {
						audit=new Audit("127.0.0.1", 2861);
					} catch (UnknownHostException e) {
						logger.fatal("Even local Audit Server Unkown Host");
						return;
					}
				}

				{
					headerComposite = new Composite(parent, SWT.NONE);
					gd_headerComposite = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
					gd_headerComposite.heightHint = 171;
					gd_headerComposite.minimumHeight = 170;
					gd_headerComposite.minimumWidth = 570;
					gd_headerComposite.widthHint = 570;
					headerComposite.setLayoutData(gd_headerComposite);
					headerComposite.setLocation(10, 10);
					//headerComposite.setSize(100, 100);
					headerComposite.setData( WidgetUtil.CUSTOM_VARIANT, "bannerLogo" );
					headerComposite.setLayout(null);

					headerComposite.layout();
				}
				{
					dataComposite = new Composite(parent, SWT.NONE);
					dataComposite.setLayout(new GridLayout(2, false));
					GridData gd_dataComposite = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
					gd_dataComposite.heightHint = 314;
					dataComposite.setLayoutData(gd_dataComposite);
					//	dataComposite.setLayoutData(new RowData(573, 325));
				}

				{
					{
						patientTop = new Composite(dataComposite, SWT.NONE);
						patientTop.setBounds(3, 3, 284, 77);
						patientTopLayout=new StackLayout();
						patientTop.setLayout(patientTopLayout);
						{
							patientInfos = new Composite(patientTop, SWT.NONE);
							patientInfos.setLayout(new GridLayout(1, false));
							{
								lblPatient = new Label(patientInfos, SWT.NONE);
								//								lblPatient.setText("Patient: " + ppmDataset.getPatiennameBirthdateString());
							}
							{
								lblDiagnosis = new Label(patientInfos, SWT.NONE);
								//								lblDiagnosis.setText("Diagnosis: "+ ppmDataset.getDiagnosesString());
							}
							{
								lblImplantation = new Label(patientInfos, SWT.NONE);
								//								lblImplantation.setText("Implantation: "+ ppmDataset.getImplantationString());
							}
							{
								lblIcd = new Label(patientInfos, SWT.NONE);
								//								lblIcd.setText("ICD: "+ ppmDataset.getIcdString());
							}
							//							updatePatient();
						}
						{
							patientChooser = new Composite(patientTop, SWT.NONE);
							patientChooser.setLayout(new GridLayout(2, false));
							comboPatientlist = new Combo(patientChooser, SWT.NONE);

							{
								
								ppmDataset.fillPatientList();

								for (int i=0;i<ppmDataset.patientList.size();i++){
									comboPatientlist.add(ppmDataset.patientList.get(i).getPatientNameBirthdateString());
								}
							}
							comboPatientlist.select(0);

							{
								btnPatientOKButton = new Button(patientChooser, SWT.NONE);
								btnPatientOKButton.addSelectionListener(new SelectionAdapter() {
									@Override
									public void widgetSelected(SelectionEvent e) {

										//FIXME: ArrayOutOfBoundsException 
										ppmDataset.setCurrentPatID(ppmDataset.patientList.get(comboPatientlist.getSelectionIndex()).getId());
										audit.send_udp( audit.create_syslog_xml("PPM", Audit.createMessage("ppmaccess", ppmDataset.getCurrentPatID(), "0", uname.getText())) );

										updatePatientLabels();

										//FIXME Audit logging here
										// hiding image

										logger.info("Switch Topcontrol to Patient");
										//										gd_headerComposite = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
										gd_headerComposite.heightHint = 1;
										gd_headerComposite.minimumHeight = 1;
										gd_headerComposite.minimumWidth = 570;
										gd_headerComposite.widthHint = 570;
										headerComposite.setLayoutData(gd_headerComposite);
										//										headerComposite.setLocation(10, 10);
										//headerComposite.setSize(100, 100);
										//										headerComposite.setData( WidgetUtil.CUSTOM_VARIANT, "bannerLogo" );
										//										headerComposite.setLayout(null);

										headerComposite.layout();
										headerComposite.pack();

										patientTopLayout.topControl=patientInfos;
										patientTop.layout();
										patientTop.pack(true);
										IWorkbenchPage activePage = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
										if (startScaled){
											IViewPart ivPart=activePage.findView("de.offis.health.icardea.ppm.GeneralView");
											activePage.hideView(ivPart);
										}
										try {
											activePage.showView("de.offis.health.icardea.ppm.PPMMain");
											userComposit.setVisible(true);

										} catch (PartInitException e1) {
											// TODO Auto-generated catch block
											e1.printStackTrace();
										}
										//										PPMMain.setTabbedFocus(choosenTab);

									}
								});
								btnPatientOKButton.setText("Choose Patient");
							}
						}
						{
							login = new Composite(patientTop, SWT.NONE);
							login.setLayout(new GridLayout(2, false));
						}
						{
							lblUsername = new Label(login, SWT.NONE);
							lblUsername.setText("OID_Username:");
						}
						{
							uname = new Text(login, SWT.BORDER);
							uname.setText("abcde");
							GridData gd_uname = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
							gd_uname.widthHint = 180;
							uname.setLayoutData(gd_uname);
						}
						{
							lblpwd = new Label(login, SWT.NONE);
							lblpwd.setText("Info");
						}

						{
							pwd = new Label(login, SWT.NONE);
							GridData gd_pwd = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
							gd_pwd.widthHint = 180;
							pwd.setLayoutData(gd_pwd);
						}
						{
							btnOK = new Button(login, SWT.NONE);
							btnOK.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
							btnOK.addSelectionListener(new SelectionAdapter() {
								@Override
								public void widgetSelected(SelectionEvent e) {
									//FIXME login control
									//################## HACK
									logger.debug("Start Login Instance ");
									String username;
									ResourceBundle properties = ResourceBundle.getBundle("icardea");
									boolean isSalkUsage = Boolean.parseBoolean(properties.getString("salk.usage"));

									
									//username="https://www.google.com/accounts/o8/id";
									username=uname.getText();

									logger.debug("Salkuser OpenId Server Secure :" + isSalkUsage);
									properties.toString();
									if(isSalkUsage){
										String salkServer = properties.getString("salk.server");
										username=salkServer+"/idp/u="+username; //only valid for SALK server
									}
									else{//(isSalkUsage) NoSalkUsage Local Testing assumed
										//username has to be real OpenID Name like 	abcde.myopenid.com									
									}
									
									logger.debug("Discovery for: "+username);
									//FIXME Audit logging here
									DiscoveryInformation discovery = RegistrationService
											.performDiscoveryOnUserSuppliedIdentifier(username);

									if(discovery==null){//Discovery Null true
										//FIXME Audit logging here

										pwd.setText("Unkown User Try Again");
										patientTopLayout.topControl=login;
										patientTop.layout();
										audit.send_udp( audit.create_syslog_xml("PPM", Audit.createMessage("login", "", "8", username)) );

									}
									else{//Discovery Null false
										//FIXME Audit logging here

										logger.debug("GOT Discovery for:" + discovery.getDelegateIdentifier());
										logger.debug("GOT Discovery for:" + discovery.getClaimedIdentifier());
										logger.debug("GOT Discovery for:" + discovery.getOPEndpoint());



										//									AuthRequest authRequest = RegistrationService.createOpenIdAuthRequest(discovery, url);
										//									logger.debug("GeneralView ##############AT authrequested");
										//									String redirectUrl = authRequest.getDestinationUrl(true);
										//									logger.debug("GeneralView ##############AT authrequested redirect url:"+redirectUrl);
										//																																

										String url = RegistrationService.getReturnToUrl();
										//										logger.debug("GeneralView ##############AT return url:"+url);

										AuthRequest authRequest = RegistrationService.createOpenIdAuthRequest(discovery, url);
										//										logger.debug("GeneralView ##############AT authrequested");
										String redirectUrl = authRequest.getDestinationUrl(true);
										//										logger.debug("GeneralView ##############AT authrequested redirect url:"+redirectUrl);
										
										final String browserText =
												MessageFormat.format("parent.window.location.href = \"{0}\";",redirectUrl);

										JSExecutor.executeJS(browserText);


										if (true) return;


										//################## HACK								


										patientTopLayout.topControl=patientChooser;
										patientTop.layout();
									}//End IF Disocvery Null
									//################## HACK
								}
							});
							btnOK.setText("OK");
						}
						{
							btnAbort = new Button(login, SWT.NONE);
							btnAbort.addSelectionListener(new SelectionAdapter() {
								@Override
								public void widgetSelected(SelectionEvent e) {
									IWorkbenchPage activePage = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
									IViewPart ivPart=activePage.findView("de.offis.health.icardea.ppm.PPMMain");
									activePage.hideView(ivPart);
									ivPart=activePage.findView("de.offis.health.icardea.ppm.GeneralView");
									activePage.hideView(ivPart);	

								}
							});
							btnAbort.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
							btnAbort.setText("Abort");
						}

					}


					userComposit = new Composite(dataComposite, SWT.NONE);
					userComposit.setBounds(290, 3, 177, 87);
					userComposit.setLayout(new GridLayout(2, false));
					userComposit.setVisible(false);
					{
						lblWelcome = new Label(userComposit, SWT.NONE);
						if (ppmDataset.isDemoMode) //FIXME demohack
							lblWelcome.setText("Welcome "+ ppmDataset.getUserFullName());
						else
							lblWelcome.setText("Welcome ");
					}
					chooseDate = new Combo(userComposit, SWT.READ_ONLY);
					chooseDate.addSelectionListener(new SelectionAdapter() {
						@Override
						public void widgetSelected(SelectionEvent e) {
							int index=chooseDate.getSelectionIndex();
							ppmDataset.setCurrentDate(PPMDataset.convPointToTime(ppmDataset.getDateStrings()[index]));

							//							PPMMain.mainTabFolder.redraw();
							//PPMMain.mainTabFolder.setSelection(0);//TODO: better repaint
							//							TabItem tbarray[] = PPMMain.mainTabFolder.getItems();
							//							for (int i=5; i< tbarray.length;i++){
							//								 tbarray[i].notifyListeners(eventType, event)
							//						}
						}
					}
							);

					//logger.debug("Startdate: "+request.getParameter("startdate"));
					ParameterList paralist = new ParameterList(request.getParameterMap());
					String retval=paralist.getParameterValue("openid.mode");
					logger.debug("OpenID mode at parameterlist: "+retval);
					logger.debug("OpenID Labeltype: " + paralist.getParameterValue("openid.ax.type.label"));
	
					
					//Accessing data returned from the OpenID authentication and integrate  them into PPMdataset
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
					if (paralist.getParameterValue("openid.sreg.fullname") != null){
							String fullnameOpenID = paralist.getParameterValue("openid.sreg.fullname");
							logger.debug("Fullname available: " + fullnameOpenID);
							if(fullnameOpenID.trim().isEmpty()){
								fullnameOpenID =  paralist.getParameterValue("openid.identity");
								logger.debug("Fullname was empty. Taking Identity: " + fullnameOpenID);
							}
							
							ppmDataset.setUserFullName(fullnameOpenID);

						}
					
					
					
					logger.debug("RETURN STATE "+retval);
					patientTopLayout.topControl=login;

					if (retval!=null){
						if (retval.equalsIgnoreCase("id_res")){
							//						logger.debug("User:"+rm.getOpenId()+"\n is verified "+rm.getIs_verified());
							patientTopLayout.topControl=patientChooser;
							audit.send_udp( audit.create_syslog_xml("PPM", Audit.createMessage("login", "", "0", uname.getText())) );


						}
					}
					patientTop.layout();	

					int startdate=0;
					if (request==null){
						startdate=0;
					}
					else{
						if (request.getParameter("startdate")!=null){
							startdate=Integer.parseInt(request.getParameter("startdate").toString());
						}
						//						if (request.getParameter("role")!=null){
						//							role=(request.getParameter("role").toString());
						//							ppmDataset.setRole(role);
						//						}
						//						if (request.getParameter("scaled")!=null){
						//							//FIXME
						//							if (request.getParameter("scaled").toString().equals("true")){
						//
						//								startScaled=true;
						//								logger.debug("Choose scaled view!");
						//							}
						//						}
						//						if (request.getParameter("tab")!=null){
						//							choosenTab=Integer.parseInt(request.getParameter("tab").toString());
						//							logger.debug("Choose Tab#"+choosenTab);
						//						}

						//TODO Snippet
						if (request.getParameter("startview")!=null){
							logger.debug("Startview="+request.getParameter("startview")+" is "+request.getParameter("startview").toString().compareToIgnoreCase("zhjgdewer"));

							//empty
							if (request.getParameter("startview").toString().compareToIgnoreCase("zhjgdewer")==0){
								{
									patientTopLayout.topControl=patientChooser;
								}
								patientTop.layout();   
							} 
						}
						//						if (request.getParameter("patientid")!=null){
						//
						//							ppmDataset.setiCardeaID(request.getParameter("patientid").toString());
						//							logger.debug("!!!Choose Patient from Careplaner "+ppmDataset.getiCardeaID());
						////							patientTopLayout.topControl=patientTop;
						//							patientTop.layout();   
						//						}


					}

					chooseDate.setItems(ppmDataset.getDateStrings());
					chooseDate.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
					chooseDate.select(startdate);
					{
						lblChooseView = new Label(userComposit, SWT.NONE);
						lblChooseView.setText("Choose View:");
					}
					{
						btnLogout = new Button(userComposit, SWT.NONE);
						btnLogout.addSelectionListener(new SelectionAdapter() {
							@Override
							public void widgetSelected(SelectionEvent e) {
								patientTopLayout.topControl=login;
								patientTop.layout();
								IWorkbenchPage activePage = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
								IViewPart ivPart=activePage.findView("de.offis.health.icardea.ppm.PPMMain");
								activePage.hideView(ivPart);
								userComposit.setVisible(false);
								audit.send_udp( audit.create_syslog_xml("PPM", Audit.createMessage("logout", "", "0", uname.getText())) );


							}
						});
						btnLogout.setText("Logout");


					}

					{
						chooseViews = new Combo(userComposit, SWT.READ_ONLY);
						chooseViews.addSelectionListener(new SelectionAdapter() {
							@Override
							public void widgetSelected(SelectionEvent e) {
								int index=chooseViews.getSelectionIndex();
								PPMMain.setTabbedFocus(index);


							}
						});
						chooseViews.setItems(ppmDataset.getSheetStrings());
						chooseViews.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
						chooseViews.select(choosenTab);
					}
					btnDact = new Button(userComposit, SWT.CENTER);
					btnDact.setGrayed(true);
					btnDact.setText("DACT");

					btnDact.addSelectionListener(new PPMButtonSelectionAdaptor("DACT",PPMMain.mainTabFolder) );
				}
			}
		}

	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.WorkbenchPart#setFocus()
	 */
	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}
	public void updatePatientLabels(){

		lblPatient.setText("Patient: " + ppmDataset.getPatiennameBirthdateString());
		lblDiagnosis.setText("Diagnosis: "+ ppmDataset.getDiagnosesString());
		lblImplantation.setText("Implantation: "+ ppmDataset.getImplantationString());
		lblIcd.setText("ICD: "+ ppmDataset.getIcdString());
	}
}

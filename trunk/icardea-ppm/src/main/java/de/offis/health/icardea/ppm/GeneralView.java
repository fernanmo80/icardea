/**
 * 
 */
package de.offis.health.icardea.ppm;

import java.text.MessageFormat;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.eclipse.rwt.RWT;
import org.eclipse.rwt.internal.widgets.JSExecutor;
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

/**
 * @author thiel
 *
 */
public class GeneralView extends ViewPart {
	public Composite patient;
	public Composite user;
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
		//		setTitleImage(ResourceManager.getPluginImage("de.offis.health.icardea.ppm", "iCARDEA-logo.png"));
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


	private String role="doctor";
	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.WorkbenchPart#createPartControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createPartControl(Composite parent) {
		{
			{
				{
					{
						patientTop = new Composite(parent, SWT.NONE);
						patientTopLayout=new StackLayout();
						patientTop.setLayout(patientTopLayout);
						{
							patient = new Composite(patientTop, SWT.NONE);
							patient.setLayout(new GridLayout(1, false));
							{
								lblPatient = new Label(patient, SWT.NONE);
								//								lblPatient.setText("Patient: " + ppmDataset.getPatiennameBirthdateString());
							}
							{
								lblDiagnosis = new Label(patient, SWT.NONE);
								//								lblDiagnosis.setText("Diagnosis: "+ ppmDataset.getDiagnosesString());
							}
							{
								lblImplantation = new Label(patient, SWT.NONE);
								//								lblImplantation.setText("Implantation: "+ ppmDataset.getImplantationString());
							}
							{
								lblIcd = new Label(patient, SWT.NONE);
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


										ppmDataset.setCurrentPatID(ppmDataset.patientList.get(comboPatientlist.getSelectionIndex()).getId());

										updatePatientLabels();
										
										//FIXME Audit logging here

										patientTopLayout.topControl=patient;
										logger.info("Switch Topcontrol to Patient");
										patientTop.layout();
										patientTop.pack(true);
										IWorkbenchPage activePage = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
										try {
											activePage.showView("de.offis.health.icardea.ppm.PPMMain");
											user.setVisible(true);

										} catch (PartInitException e1) {
											// TODO Auto-generated catch block
											e1.printStackTrace();
										}
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
									//FIXME correct id provider from config
									username = "http://134.106.52.9:4545/idp/u="+ uname.getText();
									//username="https://www.google.com/accounts/o8/id";
									uname.setText(username);
									username=uname.getText();
									//									 username="http://openid-provider.appspot.com/thiel.offis@googlemail.com";
									logger.debug("Discovery for: "+username);
									//FIXME Audit logging here
									DiscoveryInformation discovery = RegistrationService
											.performDiscoveryOnUserSuppliedIdentifier(username);

									if(discovery==null){//Discovery Null true
										//FIXME Audit logging here

										pwd.setText("Unkown User Try Again");
										patientTopLayout.topControl=login;
										patientTop.layout();
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
										HttpServletResponse resp = RWT.getResponse();
										HttpServletRequest req = RWT.getRequest();
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

					patientTopLayout.topControl=patientChooser;
					patientTopLayout.topControl=login;

					patientTop.layout();

					user = new Composite(parent, SWT.NONE);
					user.setLayout(new GridLayout(2, false));
					user.setVisible(false);
					{
						lblWelcome = new Label(user, SWT.NONE);
						if (ppmDataset.isDemoMode) //FIXME demohack
							lblWelcome.setText("Welcome "+ ppmDataset.getUserString());
						else
							lblWelcome.setText("Welcome ");
					}
					chooseDate = new Combo(user, SWT.READ_ONLY);
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
					});
					HttpServletRequest request = RWT.getRequest();
					//logger.debug("Startdate: "+request.getParameter("startdate"));
					int startdate=0;
					if (request==null)
						startdate=0;
					else{
						if (request.getParameter("startdate")!=null){
							startdate=Integer.parseInt(request.getParameter("startdate").toString());
						}
						if (request.getParameter("role")!=null){
							role=(request.getParameter("role").toString());
							ppmDataset.setRole(role);
						}
						if (request.getParameter("startview")!=null){
							Integer startview=Integer.parseInt(request.getParameter("startview").toString());
							logger.debug("Manuell set Startview to "+startview);
							RegistrationModel rm=null;
							if (startview==1){
								//FIXME Audit logging here

//								try {
									ParameterList paralist = new ParameterList(request.getParameterMap());
									String retval=paralist.getParameterValue("openid.mode");
											logger.debug("RETURN STATE "+retval);

//									rm=RegistrationService.processReturn(request);
									if (retval.equalsIgnoreCase("id_res")){
//										logger.debug("User:"+rm.getOpenId()+"\n is verified "+rm.getIs_verified());
										patientTopLayout.topControl=patientChooser;
										patientTop.layout();	
									}

//								} catch (MessageException e2) {
//									// TODO Auto-generated catch block
//									e2.printStackTrace();
//								} catch (DiscoveryException e2) {
//									// TODO Auto-generated catch block
//									e2.printStackTrace();
//								} catch (AssociationException e2) {
//									// TODO Auto-generated catch block
//									e2.printStackTrace();
//								}

							}
						}


					}

					chooseDate.setItems(ppmDataset.getDateStrings());
					chooseDate.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
					chooseDate.select(startdate);
					{
						lblChooseView = new Label(user, SWT.NONE);
						lblChooseView.setText("Choose View:");
					}
					{
						btnLogout = new Button(user, SWT.NONE);
						btnLogout.addSelectionListener(new SelectionAdapter() {
							@Override
							public void widgetSelected(SelectionEvent e) {
								patientTopLayout.topControl=login;
								patientTop.layout();
								IWorkbenchPage activePage = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
								IViewPart ivPart=activePage.findView("de.offis.health.icardea.ppm.PPMMain");
								activePage.hideView(ivPart);
								user.setVisible(false);

							}
						});
						btnLogout.setText("Logout");


					}

					{
						chooseViews = new Combo(user, SWT.READ_ONLY);
						chooseViews.addSelectionListener(new SelectionAdapter() {
							@Override
							public void widgetSelected(SelectionEvent e) {
								int index=chooseViews.getSelectionIndex();
								PPMMain.setTabbedFocus(index);

							}
						});
						chooseViews.setItems(ppmDataset.getSheetStrings());
						chooseViews.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
						chooseViews.select(0);
					}
					btnDact = new Button(user, SWT.CENTER);
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

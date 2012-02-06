<MedicalCareplan name="AF Careplan" ID="AFCareplan" version="2.0" xsi:noNamespaceSchemaLocation="Careplan.xsd" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
  <Header>
    <MedicalDomainExpert personID="P1">
      <ID schemeID="TCKN">14920263490</ID>
      <Name>Yildiray</Name>
      <Surname>Kabak</Surname>
      <Title>Doctor</Title>
      <Organization>
	<Name>SRDC Ltd.</Name>
	<Contact>
	  <AddressLine>ODTU Technopolis, Silicon Block, No:14, 06531, Cankaya, Ankara</AddressLine>
	  <PhoneNumber>+90 312 2101763</PhoneNumber>
	  <FaxNumber>+90 312 2101763</FaxNumber>
	</Contact>
      </Organization>
    </MedicalDomainExpert>
    <CareplanReviewer personID="P2">
      <ID schemeID="TCKN">14920263555</ID>
      <Name>Gokce</Name>
      <Surname>Laleci</Surname>
      <Title>Doctor</Title>
      <Organization>
	<Name>SRDC Ltd.</Name>
	<Contact>
	  <AddressLine>ODTU Technopolis, Silicon Block, No:14, 06531, Cankaya, Ankara</AddressLine>
	  <PhoneNumber>+90 312 2101763</PhoneNumber>
	  <FaxNumber>+90 312 2101763</FaxNumber>
	</Contact>
      </Organization>
    </CareplanReviewer>
    <HealthcareActor personID="P3">
      <ID schemeID="TCKN">14920263556</ID>
      <Name>Tuncay</Name>
      <Surname>Namli</Surname>
      <Title>Doctor</Title>
      <Contact>
	<PhoneNumber>+90 312 2101763</PhoneNumber>
	<MobilePhoneNumber>+90 532 2101763</MobilePhoneNumber>
	<Email>tuncay@srdc.com.tr</Email>
	<FaxNumber>+90 312 2101763</FaxNumber>
	<GTalk>tuncay.namli@gmail.com</GTalk>
      </Contact>
      <Organization>
	<Name>SRDC Ltd.</Name>
	<Contact>
	  <AddressLine>ODTU Technopolis, Silicon Block, No:14, 06531, Cankaya, Ankara</AddressLine>
	  <PhoneNumber>+90 312 2101763</PhoneNumber>
	  <FaxNumber>+90 312 2101763</FaxNumber>
	</Contact>
      </Organization>
    </HealthcareActor>
    <!--The patient information will be inserted here at the personalization step-->
    <Patient personID="P4">
      <ID schemeID="TCKN">149202063490</ID>
      <ID schemeID="CIED">2215-30/serial:223344</ID>
      <Name>Andreas</Name>
      <Surname>Schmidt</Surname>
      <Organization>
	<Name>SRDC Ltd.</Name>
	<Contact>
	  <AddressLine>ODTU Technopolis, Silicon Block, No:14, 06531, Cankaya, Ankara</AddressLine>
	  <PhoneNumber>+90 312 2101763</PhoneNumber>
	  <FaxNumber>+90 312 2101763</FaxNumber>
	</Contact>
      </Organization>
    </Patient>
    <History ID="H1">
      <Version>1.0</Version>
      <DateTime>2001-10-26T21:32:52</DateTime>
      <Description>The following changes are performed because....</Description>
      <ChangedBy ref="P1"/>
    </History>
    <History ID="H2">
      <Version>2.0</Version>
      <DateTime>2001-10-26T21:32:52</DateTime>
      <ChangedBy ref="P2"/>
    </History>
    <CreatedBy ref="P1"/>
    <ApprovedBy ref="P2"/>
    <PersonalizedBy ref="P3"/>
    <PersonalizedForPatient ref="P4"/>
  </Header>
<Body>
    <EligibilityCriteria>
      <Variable name="AFStatus" type="boolean">
	<Concept code="739568" name="MDC_IDC_EPISODE_TYPE" schemeID="MDC_IDC"/>
	<DataSource code="C0581396" name="Cardiac implant device" schemeID="UMLS"/>
	<RefinementScript>function refine(list) { var x; var y=false; var names=list.toArray(); for(x in names) { println(names[x]); if(names[x] == "Epis_AT_AF") y=true; } return y; }</RefinementScript>
      </Variable>
      <!--Scriptler degisecek. Ayrica burada input girilen AFStatus objesini incele. Nasil olusturuluyor.-->
      <EvaluationScript>function EligibleToGuidelineCriterion(AFStatus) { if ( AFStatus.getValue().getText() == "true") return true; else return false; }</EvaluationScript>
    </EligibilityCriteria>
    <Algorithm>
      <StartStep ID="S6D65A091-CB09-6B23-CCB2-519CAD72E0B4">
	<NextStep ref="S0A289CEB-9E48-1559-DFB7-51A333B1D3FB"/>
      </StartStep>
      <FinalStep ID="S8590B661-27DB-989C-7C2C-51A555B00624" name="Guideline Finalized"/>
      <ConsultStep ID="S0A289CEB-9E48-1559-DFB7-51A333B1D3FB" name="Present the CIED Data and EGM to the Medical Professional">
	<Variable name="VTStatus" type="boolean">
	  <Concept code="739568" name="MDC_IDC_EPISODE_TYPE" schemeID="MDC_IDC"/>
	  <DataSource code="C0581396" name="Cardiac implant device" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var x; var y=false; var names=list.toArray(); for(var i=0; i &lt; names.length;i++) { if(names[i] == "Epis_VT") y=true; } return y; }</RefinementScript>
	</Variable>
	<Variable name="SVTStatus" type="boolean">
	  <Concept code="739568" name="MDC_IDC_EPISODE_TYPE" schemeID="MDC_IDC"/>
	  <DataSource code="C0581396" name="Cardiac implant device" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var x; var y=false; var names=list.toArray(); for(var i=0; i &lt; names.length;i++) { if(names[i] == "Epis_SVT") y=true; } return y; }</RefinementScript>
	</Variable>
	<Variable name="RenalInsufficiency" type="boolean">
	  <Concept code="C2709206" schemeID="UMLS"/>
	  <DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	  <DataSource code="C0033213" name="Problem" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var x; var y=false; var names=list.toArray(); for(var i=0; i &lt; names.length;i++) { y=true; } return y; }</RefinementScript>
	</Variable>
	<Variable name="HeartFailure" type="boolean">
	  <Concept code="C0018801" schemeID="UMLS"/>
	  <DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	  <DataSource code="C0033213" name="Problem" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var x; var y=false; var names=list.toArray(); for(var i=0; i &lt; names.length;i++) { y=true; } return y; }</RefinementScript>
	</Variable>
	<Variable name="Diabetes" type="boolean">
	  <Concept code="C0011847" schemeID="UMLS"/>
	  <DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	  <DataSource code="C0033213" name="Problem" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var x; var y=false; var names=list.toArray(); for(var i=0; i &lt; names.length;i++) { y=true; } return y; }</RefinementScript>
	</Variable>
	<Variable name="AtrialArrhythmia" type="boolean">
	  <Concept code="C0085611" schemeID="UMLS"/>
	  <DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	  <DataSource code="C0033213" name="Problem" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var x; var y=false; var names=list.toArray(); for(var i=0; i &lt; names.length;i++) { y=true; } return y; }</RefinementScript>
	</Variable>
	<Display>
	  <HTML>
	    <head>						
	    </head>
	    <body>
	      <table  cellspacing="10" style="background-color:#e1e1e1">
		<tbody>
		  <tr name="PatientBlock" id="PatientBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated automatically in the execution phase-->

		      <p align="center"><b>Brief Information about the patient </b></p>

		      <p>Patient Name: 
			<data src="caremanagementdb://Patient/@givenName"/>
			<data src="caremanagementdb://Patient/@secondName"/>
			<data src="caremanagementdb://Patient/@familyName"/>
			<br />
			Patient ID: 
			<data src="caremanagementdb://Patient/@patientIdentifier"/>
			<br />
			Initial Diagnosis: 
			<data src="caremanagementdb://Problem[@code=95281009]/@problemValueOriginalText"/>
			<a
			  href="http://patient.parameter.monitor.link/a.php?patientID">Access to
			  EHR</a> <br />
			Implanted Device:
			<data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
			<data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
			<br />
			Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a href="http://link.to.care.management.db">Access
			  to previous Remote follow-up results</a> </p>

		      <p><br />
		      </p>
		    </td>
		  </tr>
		  <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      Alarms Detected: Atrial Fibrillation episode at a rate of 180 <br />
		      <a href="http://patient.parameter.monitor.link">Access to Report
			Exported</a> </td>
		  </tr>
		  <tr name="EGMBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		      <p align="center"><b>Brief Information about the EGM and detected
			  problems </b> </p>

		      <table  cellspacing="10" width="100%">
			<tbody>
			  <tr>
			    <td><!--The following HTML will be populated in the execution step-->
			      <p align="center"> EGM: <a href="http://patient.parameter.monitor.link">Access to
				  Report Exported</a> <br /> </p>


			      <p><img width="312" height="190" id="Picture1"
				  src="caremanagementdb://Patient/Observation/@base64String"
				  alt="x.bmp" /></p>
			    </td>
			    <td><!--The following HTML will be populated in the execution step-->

			      <p align="center">  Assesment by CIED <a href="http://patient.parameter.monitor.link">Access
				  to Report Exported</a> <br />
				<br/>

				<p align="left"><font color="#880015">VT Status: $VTStatus <br />
						SVT Status: $SVTStatus </font><br />


				</p>
			      </p>
			    </td>
			  </tr>
			</tbody>
		      </table>
		    </td>
		  </tr>
		  <tr name="EHRBlock">
			<td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

			  <p align="center"><b>Brief Information about the Comorbid diseases
			  </b> </p>
			  <table  width="100%">
			<tbody>

			  <tr>
				<td>Renal insufficiency or renal failure:</td>
				<td>
				  $RenalInsufficiency
				  <a href="http://link.to.patient.parameter.monitor?section=Problemcode=C0019080">Link to EHR</a>
				</td>
			  </tr>
			  <tr>
				<td>Heart failure:</td>
				<td>
				  $HeartFailure
				  <a href="http://link.to.patient.parameter.monitor?section=Problemcode=C0019080">Link to EHR</a>
				</td>
			  </tr>
			  <tr>
				<td>Diabetes:</td>
				<td>
				  $Diabetes
				  <a href="http://link.to.patient.parameter.monitor?section=Problemcode=C0019080">Link to EHR</a>
				</td>
			  </tr>
			  <tr>
				<td>Atrial arrhythmia:</td>
				<td>
				  $AtrialArrhythmia
				  <a href="http://link.to.patient.parameter.monitor?section=Problemcode=C0019080">Link to EHR</a>
				</td>
			  </tr>			  
			</tbody>
			  </table>

			</td>
			</tr>
		  <tr name="ChoiceBlock">
		    <td style="background-color:#eeeeee">
			    <p align="center"><b><font color="#880015">Recommendation and Next Step to follow </font> </b></p>
		      <p>Please choose the suitable option</p>

		      <form onsubmit="return ValidateData();" action="null" method="post">

			<input type="submit" name="S5Choice" value="The case is VT!" onclick="btnWhichButton=this"/>
			<input type="submit" name="S5Choice" value="There is Noise!" onclick="btnWhichButton=this"/>
			<input type="submit" name="S5Choice" value="The case is SVT!" onclick="btnWhichButton=this"/>
			<input type="submit" name="S5Choice" value="Finalize careplan!" onclick="btnWhichButton=this"/>

		      </form>
		    </td>
		  </tr>
		</tbody>
	      </table>
	    </body>
	  </HTML>
	</Display>
	<NextStep ref="SFF9124D1-ED2A-9D30-7B58-51A51EDA6428" name="The case is VT!">
	  <EvaluationScript>function check(S0A289CEB9E481559DFB751A333B1D3FBChoice) { if(S0A289CEB9E481559DFB751A333B1D3FBChoice.getValue().getText() == "The case is VT!") return true; else return false; }</EvaluationScript>
	</NextStep>
	<NextStep ref="S94894681-CF6F-3EC9-9BD6-51A52D006FB4" name="The case is Noise!">
	  <EvaluationScript>function check(S0A289CEB9E481559DFB751A333B1D3FBChoice) { if(S0A289CEB9E481559DFB751A333B1D3FBChoice.getValue().getText() == "There is Noise!") return true; else return false; }</EvaluationScript>
	</NextStep>
	<NextStep ref="SE6205213-2E6D-581A-FE94-51A539E1FB90" name="The case is SVT!">
	  <EvaluationScript>function check(S0A289CEB9E481559DFB751A333B1D3FBChoice) { if(S0A289CEB9E481559DFB751A333B1D3FBChoice.getValue().getText() == "The case is SVT!") return true; else return false; }</EvaluationScript>
	</NextStep>
	<NextStep ref="S8590B661-27DB-989C-7C2C-51A555B00624" name="Finalize careplan">
	  <EvaluationScript>function check(S0A289CEB9E481559DFB751A333B1D3FBChoice) { if(S0A289CEB9E481559DFB751A333B1D3FBChoice.getValue().getText() == "Finalize careplan!") return true; else return false; }</EvaluationScript>
	</NextStep>
      </ConsultStep>
      <ConsultStep ID="SFF9124D1-ED2A-9D30-7B58-51A51EDA6428" name="Check Appropriate Discharge">
	<Variable name="AppropriateDischarge" type="integer">
	  <Concept code="737824" name="MDC_IDC_STAT_TACHYTHERAPY_SHOCKS_DELIVERED_RECENT" schemeID="MDC_IDC"/>
	  <DataSource code="C0581396" name="Cardiac implant device" schemeID="UMLS"/>
	</Variable>
	
	
	<Display>
	  <HTML>
	    <head>						
	    </head>
	    <body>

	      <table  cellspacing="10" style="background-color:#e1e1e1">
		<tbody>
		  <tr name="PatientBlock" id="PatientBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated automatically in the execution phase-->

		      <p align="center"><b>Brief Information about the patient </b></p>

		      <p>Patient Name: 
			<data src="caremanagementdb://Patient/@givenName"/>
			<data src="caremanagementdb://Patient/@secondName"/>
			<data src="caremanagementdb://Patient/@familyName"/>
			<br />
			Patient ID: 
			<data src="caremanagementdb://Patient/@patientIdentifier"/>
			<br />
			Initial Diagnosis: 
			<data src="caremanagementdb://Problem[@code=95281009]/@problemValueOriginalText"/>
			<a
			  href="http://patient.parameter.monitor.link/a.php?patientID">Access to
			  EHR</a> <br />
			Implanted Device:
			<data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
			<data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
			<br />
			Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a href="http://link.to.care.management.db">Access
			  to previous Remote follow-up results</a> </p>

		      <p><br />
		      </p>
		    </td>
		  </tr>
		  <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      Alarms Detected: Atrial Fibrillation episode at a rate of 180 <br />
		      <a href="http://patient.parameter.monitor.link">Access to Report
			Exported</a> </td>
		  </tr>
		  <tr name="EGMBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		      <p align="center"><b>Brief Information about the EGM and detected
			  problems </b> </p>

		      <table  cellspacing="10" width="100%">
			<tbody>
			  <tr>
			    <td><!--The following HTML will be populated in the execution step-->
			      <p align="center"> EGM: <a href="http://patient.parameter.monitor.link">Access to
				  Report Exported</a> <br /> </p>


			      <p><img width="312" height="190" id="Picture1"
				  src="caremanagementdb://Patient/Observation/@base64String"
				  alt="x.bmp" /></p>
			    </td>
			    <td><!--The following HTML will be populated in the execution step-->

			      <p align="center">  Assesment by CIED <a href="http://patient.parameter.monitor.link">Access
				  to Report Exported</a> <br />
				<br/>

				<p align="left"># of AppropriateDischarges: $AppropriateDischarge <br />

				</p>
			      </p>
			    </td>
			  </tr>
			</tbody>
		      </table>
		    </td>
		  </tr>
		  <tr name="EHRBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		      <p align="center"><b>Brief Information about the Comorbid diseases
		      </b> </p>
		      <table  width="100%">
			<tbody>

			  <tr>
			    <td>Renal insufficiency or renal failure:</td>
			    <td>
			      $RenalInsufficiency
			      <a href="http://link.to.patient.parameter.monitor?section=Problemcode=C0019080">Link to EHR</a>
			    </td>
			  </tr>
			  <tr>
			    <td>Heart failure:</td>
			    <td>
			      $HeartFailure
			      <a href="http://link.to.patient.parameter.monitor?section=Problemcode=C0019080">Link to EHR</a>
			    </td>
			  </tr>
			  <tr>
			    <td>Diabetes:</td>
			    <td>
			      $Diabetes
			      <a href="http://link.to.patient.parameter.monitor?section=Problemcode=C0019080">Link to EHR</a>
			    </td>
			  </tr>
			  <tr>
			    <td>Atrial arrhythmia:</td>
			    <td>
			      $AtrialArrhythmia
			      <a href="http://link.to.patient.parameter.monitor?section=Problemcode=C0019080">Link to EHR</a>
			    </td>
			  </tr>			  
			</tbody>
		      </table>

		    </td>
		  </tr>
		  <tr name="ChoiceBlock">
		    <td style="background-color:#eeeeee">
			    <p align="center"><b><font color="#880015">Recommendation and Next Step to follow </font> </b></p>
		      <p>Please choose the suitable option</p>

		      <form onsubmit="return ValidateData();" action="null" method="post">

			<input type="submit" name="D5Choice" value="Appropriate Discharge > 0" onclick="btnWhichButton=this"/>
			<input type="submit" name="D5Choice" value="Appropriate Discharge = 0" onclick="btnWhichButton=this"/>

		      </form>
		    </td>
		  </tr>
		</tbody>
	      </table>
	    </body>
	  </HTML>
	</Display>
	<NextStep ref="SAA0B5D52-1B75-CCB4-F0EA-51AC57C28BAA" name="Appropriate Discharge > 0">
	  <EvaluationScript>function check(SFF9124D1ED2A9D307B5851A51EDA6428Choice) { if(SFF9124D1ED2A9D307B5851A51EDA6428Choice.getValue().getText() == "Appropriate Discharge > 0") return true; else return false; }</EvaluationScript>		
	</NextStep>
	<NextStep ref="S9B5D56AF-5C9F-477C-D3F9-51AC6482EB5E" name="Appropriate Discharge = 0">
	  <EvaluationScript>function check(SFF9124D1ED2A9D307B5851A51EDA6428Choice) { if(SFF9124D1ED2A9D307B5851A51EDA6428Choice.getValue().getText() == "Appropriate Discharge = 0") return true; else return false; }</EvaluationScript>
	</NextStep>
      </ConsultStep>
      <RecommendationStep ID="SAA0B5D52-1B75-CCB4-F0EA-51AC57C28BAA" name="Arrange an immediate referral to the clinic">
	<Receiver ref="P3"/>
	<Urgency>2</Urgency>
	<Display>
	  <HTML>
	    <head/>
	    <body>

	      <table  cellspacing="10" style="background-color:#e1e1e1">
		<tbody>
		  <tr name="PatientBlock" id="PatientBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated automatically in the execution phase-->

		      <p align="center"><b>Brief Information about the patient </b></p>

		      <p>Patient Name: 
			<data src="caremanagementdb://Patient/@givenName"/>
			<data src="caremanagementdb://Patient/@secondName"/>
			<data src="caremanagementdb://Patient/@familyName"/>
			<br />
			Patient ID: 
			<data src="caremanagementdb://Patient/@patientIdentifier"/>
			<br />
			Initial Diagnosis: 
			<data src="caremanagementdb://Problem[@code=95281009]/@problemValueOriginalText"/>
			<a
			  href="http://patient.parameter.monitor.link/a.php?patientID">Access to
			  EHR</a> <br />
			Implanted Device:
			<data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
			<data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
			<br />
			Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a href="http://link.to.care.management.db">Access
			  to previous Remote follow-up results</a> </p>

		      <p><br />
		      </p>
		    </td>
		  </tr>
		  <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      Alarms Detected: Atrial Fibrillation episode at a rate of 180 <br />
		      <a href="http://patient.parameter.monitor.link">Access to Report
			Exported</a> </td>
		  </tr>
		  <tr name="RecommendationBlock">
		    <td style="background-color:#eeeeee">
			    <p align="center"><b><font color="#880015">Recommendation and Next Step to follow </font> </b></p>
		      <p>Arrange an immediate referral to the clinic.</p>

		      <form onsubmit="return ValidateData();" action="null" method="post">
			<input type="submit" name="D5Choice" value="Continue" onclick="btnWhichButton=this"/>
		      </form>
		    </td>
		  </tr>
		</tbody>
	      </table>
	    </body>
	  </HTML>
	</Display>
	<NextStep ref="S8590B661-27DB-989C-7C2C-51A555B00624"/>
      </RecommendationStep>
      <RecommendationStep ID="S9B5D56AF-5C9F-477C-D3F9-51AC6482EB5E" name="There is a VT case and there is no appropriate discharge in the patient. Call the patient and ask how s/he is.">
	<Receiver ref="P3"/>
	<Urgency>2</Urgency>
	<Display>
	  <HTML>
	    <head/>
	    <body>

	      <table  cellspacing="10" style="background-color:#e1e1e1">
		<tbody>
		  <tr name="PatientBlock" id="PatientBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated automatically in the execution phase-->

		      <p align="center"><b>Brief Information about the patient </b></p>

		      <p>Patient Name: 
			<data src="caremanagementdb://Patient/@givenName"/>
			<data src="caremanagementdb://Patient/@secondName"/>
			<data src="caremanagementdb://Patient/@familyName"/>
			<br />
			Patient ID: 
			<data src="caremanagementdb://Patient/@patientIdentifier"/>
			<br />
			Initial Diagnosis: 
			<data src="caremanagementdb://Problem[@code=95281009]/@problemValueOriginalText"/>
			<a
			  href="http://patient.parameter.monitor.link/a.php?patientID">Access to
			  EHR</a> <br />
			Implanted Device:
			<data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
			<data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
			<br />
			Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a href="http://link.to.care.management.db">Access
			  to previous Remote follow-up results</a> </p>

		      <p><br />
		      </p>
		    </td>
		  </tr>
		  <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      Alarms Detected: Atrial Fibrillation episode at a rate of 180 <br />
		      <a href="http://patient.parameter.monitor.link">Access to Report
			Exported</a> </td>
		  </tr>
		  <tr name="RecommendationBlock">
		    <td style="background-color:#eeeeee">
			    <p align="center"><b><font color="#880015">Recommendation and Next Step to follow </font> </b></p>
		      <p>There is a VT case and there is no appropriate discharge in the patient. Call the patient and ask how s/he is</p>

		      <form onsubmit="return ValidateData();" action="null" method="post">
			<input type="submit" name="D5Choice" value="Continue" onclick="btnWhichButton=this"/>
		      </form>
		    </td>
		  </tr>
		</tbody>
	      </table>
	    </body>
	  </HTML>
	</Display>
	<NextStep ref="S8590B661-27DB-989C-7C2C-51A555B00624"/>
      </RecommendationStep>
      <ConsultStep ID="S94894681-CF6F-3EC9-9BD6-51A52D006FB4" name="Check Inappropriate Discharge">
	<Variable name="InappropriateDischarge" type="integer">
	  <Concept code="737856" name="MDC_IDC_STAT_TACHYTHERAPY_SHOCKS_ABORTED_RECENT" schemeID="MDC_IDC"/>
	  <DataSource code="C0581396" name="Cardiac implant device" schemeID="UMLS"/>
	</Variable>
	<Display>
	  <HTML>
	    <head>						
	    </head>
	    <body>

	      <table  cellspacing="10" style="background-color:#e1e1e1">
		<tbody>
		  <tr name="PatientBlock" id="PatientBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated automatically in the execution phase-->

		      <p align="center"><b>Brief Information about the patient </b></p>

		      <p>Patient Name: 
			<data src="caremanagementdb://Patient/@givenName"/>
			<data src="caremanagementdb://Patient/@secondName"/>
			<data src="caremanagementdb://Patient/@familyName"/>
			<br />
			Patient ID: 
			<data src="caremanagementdb://Patient/@patientIdentifier"/>
			<br />
			Initial Diagnosis: 
			<data src="caremanagementdb://Problem[@code=95281009]/@problemValueOriginalText"/>
			<a
			  href="http://patient.parameter.monitor.link/a.php?patientID">Access to
			  EHR</a> <br />
			Implanted Device:
			<data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
			<data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
			<br />
			Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a href="http://link.to.care.management.db">Access
			  to previous Remote follow-up results</a> </p>

		      <p><br />
		      </p>
		    </td>
		  </tr>
		  <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      Alarms Detected: Atrial Fibrillation episode at a rate of 180 <br />
		      <a href="http://patient.parameter.monitor.link">Access to Report
			Exported</a> </td>
		  </tr>
		  <tr name="EGMBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		      <p align="center"><b>Brief Information about the EGM and detected
			  problems </b> </p>

		      <table  cellspacing="10" width="100%">
			<tbody>
			  <tr>
			    <td><!--The following HTML will be populated in the execution step-->
			      <p align="center"> EGM: <a href="http://patient.parameter.monitor.link">Access to
				  Report Exported</a> <br /> </p>


			      <p><img width="312" height="190" id="Picture1"
				  src="caremanagementdb://Patient/Observation/@base64String"
				  alt="x.bmp" /></p>
			    </td>
			    <td><!--The following HTML will be populated in the execution step-->

			      <p align="center">  Assesment by CIED <a href="http://patient.parameter.monitor.link">Access
				  to Report Exported</a> <br />
				<br/>

				<p align="left">Tachy Therapy Statistic Recent Shocks Aborted : $InappropriateDischarge 
				  <br/>

				</p>
			      </p>
			    </td>
			  </tr>
			</tbody>
		      </table>
		    </td>
		  </tr>
		  <tr name="ChoiceBlock">
		    <td style="background-color:#eeeeee">
			    <p align="center"><b><font color="#880015">Recommendation and Next Step to follow </font> </b></p>
		      <p>By also considering the EGM of the patient please determine whether there is inappropriate discharge?</p>

		      <form onsubmit="return ValidateData();" action="null" method="post">
			<input type="submit" name="D6Choice" value="Inappropriate Discharge > 1" onclick="btnWhichButton=this"/>
			<input type="submit" name="D6Choice" value="Inappropriate Discharge = 1" onclick="btnWhichButton=this"/>
			<input type="submit" name="D6Choice" value="Inappropriate Discharge = 0" onclick="btnWhichButton=this"/>
		      </form>
		    </td>
		  </tr>
		</tbody>
	      </table>
	    </body>
	  </HTML>
	</Display>
	<NextStep ref="SAA0B5D52-1B75-CCB4-F0EA-51AC57C28BAA" name="InappropriateDischarge > 1">
	  <EvaluationScript>function check(S94894681CF6F3EC99BD651A52D006FB4EChoice) { if(S94894681CF6F3EC99BD651A52D006FB4EChoice.getValue().getText() == "Inappropriate Discharge > 1") return true; else return false; }</EvaluationScript>
	</NextStep>
	<NextStep ref="S6DC97AD7-98DC-A207-4FFB-51B1F7B4A43D" name="InappropriateDischarge = 1">
	  <EvaluationScript>function check(S94894681CF6F3EC99BD651A52D006FB4EChoice) { if(S94894681CF6F3EC99BD651A52D006FB4EChoice.getValue().getText() == "Inappropriate Discharge = 1") return true; else return false; }</EvaluationScript>
	</NextStep>
	<NextStep ref="S765DA858-E979-A7DE-AEF1-51B20B4DEDD4" name="InappropriateDischarge = 0">
	  <EvaluationScript>function check(S94894681CF6F3EC99BD651A52D006FB4EChoice) { if(S94894681CF6F3EC99BD651A52D006FB4EChoice.getValue().getText() == "Inappropriate Discharge = 0") return true; else return false; }</EvaluationScript>
	</NextStep>
      </ConsultStep>
      <RecommendationStep ID="S6DC97AD7-98DC-A207-4FFB-51B1F7B4A43D" name="Arrange a follow-up in the clinic">
	<Receiver ref="P3"/>
	<Urgency>2</Urgency>
	<Display>
	  <HTML>
	    <head/>
	    <body>

	      <table  cellspacing="10" style="background-color:#e1e1e1">
		<tbody>
		  <tr name="PatientBlock" id="PatientBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated automatically in the execution phase-->

		      <p align="center"><b>Brief Information about the patient </b></p>

		      <p>Patient Name: 
			<data src="caremanagementdb://Patient/@givenName"/>
			<data src="caremanagementdb://Patient/@secondName"/>
			<data src="caremanagementdb://Patient/@familyName"/>
			<br />
			Patient ID: 
			<data src="caremanagementdb://Patient/@patientIdentifier"/>
			<br />
			Initial Diagnosis: 
			<data src="caremanagementdb://Problem[@code=95281009]/@problemValueOriginalText"/>
			<a
			  href="http://patient.parameter.monitor.link/a.php?patientID">Access to
			  EHR</a> <br />
			Implanted Device:
			<data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
			<data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
			<br />
			Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a href="http://link.to.care.management.db">Access
			  to previous Remote follow-up results</a> </p>

		      <p><br />
		      </p>
		    </td>
		  </tr>
		  <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      Alarms Detected: Atrial Fibrillation episode at a rate of 180 <br />
		      <a href="http://patient.parameter.monitor.link">Access to Report
			Exported</a> </td>
		  </tr>
		  <tr name="RecommendationBlock">
		    <td style="background-color:#eeeeee">
			    <p align="center"><b><font color="#880015">Recommendation and Next Step to follow </font></b> </p>
			    <p>There has been a number inappropriate discharges. Arange a follow-up in the clinic</p>

		      <form onsubmit="return ValidateData();" action="null" method="post">
			<input type="submit" name="D5Choice" value="Continue" onclick="btnWhichButton=this"/>
		      </form>
		    </td>
		  </tr>
		</tbody>
	      </table>
	    </body>
	  </HTML>
	</Display>
	<NextStep ref="S8590B661-27DB-989C-7C2C-51A555B00624"/>
      </RecommendationStep>
      <ConsultStep ID="S765DA858-E979-A7DE-AEF1-51B20B4DEDD4" name="Check # of such noise in the past week">
	<Variable name="NumberOfNoiseCase" type="integer">
	  <Concept code="C0028263" name="Noise" schemeID="UMLS"/>
	  <DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	  <DataSource code="C0033213" name="Problem" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) {var names=list.toArray(); var x; var y = 0; for(x in names) { if(names[x]) y = y + 1;} return y;}</RefinementScript>
	</Variable>
	<Display>
	  <HTML>
	    <head>						
	    </head>
	    <body>

	      <table  cellspacing="10" style="background-color:#e1e1e1">
		<tbody>
		  <tr name="PatientBlock" id="PatientBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated automatically in the execution phase-->

		      <p align="center"><b>Brief Information about the patient </b></p>

		      <p>Patient Name: 
			<data src="caremanagementdb://Patient/@givenName"/>
			<data src="caremanagementdb://Patient/@secondName"/>
			<data src="caremanagementdb://Patient/@familyName"/>
			<br />
			Patient ID: 
			<data src="caremanagementdb://Patient/@patientIdentifier"/>
			<br />
			Initial Diagnosis: 
			<data src="caremanagementdb://Problem[@code=95281009]/@problemValueOriginalText"/>
			<a
			  href="http://patient.parameter.monitor.link/a.php?patientID">Access to
			  EHR</a> <br />
			Implanted Device:
			<data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
			<data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
			<br />
			Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a href="http://link.to.care.management.db">Access
			  to previous Remote follow-up results</a> </p>

		      <p><br />
		      </p>
		    </td>
		  </tr>
		  <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      Alarms Detected: Atrial Fibrillation episode at a rate of 180 <br />
		      <a href="http://patient.parameter.monitor.link">Access to Report
			Exported</a> </td>
		  </tr>
		  <tr name="EGMBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		      <p align="center"><b>Brief Information about the EGM and detected
			  problems </b> </p>

		      <table  cellspacing="10" width="100%">
			<tbody>
			  <tr>
			    <td><!--The following HTML will be populated in the execution step-->
			      <p align="center"> EGM: <a href="http://patient.parameter.monitor.link">Access to
				  Report Exported</a> <br /> </p>


			      <p><img width="312" height="190" id="Picture1"
				  src="caremanagementdb://Patient/Observation/@base64String"
				  alt="x.bmp" /></p>
			    </td>
			    <td><!--The following HTML will be populated in the execution step-->

			      <p align="center">  Assesment by CIED <a href="http://patient.parameter.monitor.link">Access
				  to Report Exported</a> <br />
				<br/>

				<p align="left"># of Noise Cases: $NumberOfNoiseCase <br />

				</p>
			      </p>
			    </td>
			  </tr>
			</tbody>
		      </table>
		    </td>
		  </tr>
		  <tr name="ChoiceBlock">
		    <td style="background-color:#eeeeee">
			    <p align="center"><b><font color="#880015">Recommendation and Next Step to follow </font></b> </p>
		      <p>Please choose the suitable option</p>

		      <form onsubmit="return ValidateData();" action="null" method="post">
			<input type="submit" name="D7Choice" value="Number Of Noise Case >= 1" onclick="btnWhichButton=this"/>
			<input type="submit" name="D7Choice" value="Number Of Noise Case = 0" onclick="btnWhichButton=this"/>
		      </form>
		    </td>
		  </tr>
		</tbody>
	      </table>
	    </body>
	  </HTML>
	</Display>
	<NextStep ref="S20BC718F-1FE1-3106-A914-51B67DF1F1B3" name="NumberOfNoiseCase >= 1">
	  <EvaluationScript>function check(S765DA858E979A7DEAEF151B20B4DEDD4Choice) { if(S765DA858E979A7DEAEF151B20B4DEDD4Choice.getValue().getText() == "Number Of Noise Case >= 1") return true; else return false; }</EvaluationScript>
	</NextStep>
	<NextStep ref="S8590B661-27DB-989C-7C2C-51A555B00624" name="NumberOfNoiseCase = 0">
	  <EvaluationScript>function check(S765DA858E979A7DEAEF151B20B4DEDD4Choice) { if(S765DA858E979A7DEAEF151B20B4DEDD4Choice.getValue().getText() == "Number Of Noise Case = 0") return true; else return false; }</EvaluationScript>
	</NextStep>
      </ConsultStep>
      <ConsultStep ID="S20BC718F-1FE1-3106-A914-51B67DF1F1B3" name="Present the Lead Impedance Alerts, Lead Impedance Trend, Amplitude of the signal to the Medical Professional">
	<Variable name="LeadImpedanceAlerts" type="integer">
	  <Concept code="722624" name="MDC_IDC_MSMT_LEADHVCHNL_IMPEDANCE" schemeID="MDC_IDC"/>
	  <DataSource code="C0581396" name="Cardiac implant device" schemeID="UMLS"/>
	</Variable>
	<Variable name="LeadImpedanceTrend" type="string">
	  <Concept code="722752" name="MDC_IDC_MSMT_LEADHVCHNL_STATUS" schemeID="MDC_IDC"/>
	  <DataSource code="C0581396" name="Cardiac implant device" schemeID="UMLS"/>
	</Variable>
	<Variable name="AmplitudeOfTheSignal" type="integer">
	  <Concept code="729984" name="MDC_IDC_SET_LEADCHNL_RA_PACING_AMPLITUDE" schemeID="MDC_IDC"/>
	  <Concept code="729985" name="MDC_IDC_SET_LEADCHNL_RV_PACING_AMPLITUDE" schemeID="MDC_IDC"/>
	  <Concept code="729986" name="MDC_IDC_SET_LEADCHNL_LA_PACING_AMPLITUDE" schemeID="MDC_IDC"/>
	  <Concept code="729987" name="MDC_IDC_SET_LEADCHNL_LV_PACING_AMPLITUDE" schemeID="MDC_IDC"/>
	  <DataSource code="C0581396" name="Cardiac implant device" schemeID="UMLS"/>
	</Variable>
	<Display>
	  <HTML>
	    <head/>
	    <body>

	      <table  cellspacing="10" style="background-color:#e1e1e1">
		<tbody>
		  <tr name="PatientBlock" id="PatientBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated automatically in the execution phase-->

		      <p align="center"><b>Brief Information about the patient </b></p>

		      <p>Patient Name: 
			<data src="caremanagementdb://Patient/@givenName"/>
			<data src="caremanagementdb://Patient/@secondName"/>
			<data src="caremanagementdb://Patient/@familyName"/>
			<br />
			Patient ID: 
			<data src="caremanagementdb://Patient/@patientIdentifier"/>
			<br />
			Initial Diagnosis: 
			<data src="caremanagementdb://Problem[@code=95281009]/@problemValueOriginalText"/>
			<a
			  href="http://patient.parameter.monitor.link/a.php?patientID">Access to
			  EHR</a> <br />
			Implanted Device:
			<data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
			<data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
			<br />
			Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a href="http://link.to.care.management.db">Access
			  to previous Remote follow-up results</a> </p>

		      <p><br />
		      </p>
		    </td>
		  </tr>
		  <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      Alarms Detected: Atrial Fibrillation episode at a rate of 180 <br />
		      <a href="http://patient.parameter.monitor.link">Access to Report
			Exported</a> </td>
		  </tr>
		  <tr name="EGMBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		      <p align="center"><b>Brief Information about the EGM and detected
			  problems </b> </p>

		      <table  cellspacing="10" width="100%">
			<tbody>
			  <tr>
			    <td><!--The following HTML will be populated in the execution step-->
			      <p align="center"> EGM: <a href="http://patient.parameter.monitor.link">Access to
				  Report Exported</a> <br /> </p>


			      <p><img width="312" height="190" id="Picture1"
				  src="caremanagementdb://Patient/Observation/@base64String"
				  alt="x.bmp" /></p>
			    </td>
			    <td><!--The following HTML will be populated in the execution step-->

			      <p align="center">  Assesment by CIED <a href="http://patient.parameter.monitor.link">Access
				  to Report Exported</a> <br />
				<br/>

				<p align="left">Lead Impedance Alerts: $LeadImpedanceAlerts <br />
				  Lead Impedance Trend: $LeadImpedanceTrend <br />
				  Amplitude of the signal = $AmplitudeOfTheSignal <br />

				</p>
			      </p>
			    </td>
			  </tr>
			</tbody>
		      </table>
		    </td>
		  </tr>
		  <tr name="ChoiceBlock">
		    <td style="background-color:#eeeeee">
			    <p align="center"><b><font color="#880015">Recommendation and Next Step to follow </font></b> </p>
		      <p>Please check the Lead Impedance Alerts and Lead Impedance Trends. Is there any abnormality?</p>

		      <form onsubmit="return ValidateData();" action="null" method="post">
			<input type="submit" name="S9Choice" value="Yes, there are!" onclick="btnWhichButton=this"/>
			<input type="submit" name="S9Choice" value="No, there are not!" onclick="btnWhichButton=this"/>
		      </form>
		    </td>
		  </tr>
		</tbody>
	      </table>
	    </body>
	  </HTML>
	</Display>
	<NextStep ref="SAA0B5D52-1B75-CCB4-F0EA-51AC57C28BAA" name="Yes, there are!">
	  <EvaluationScript>function check(S20BC718F1FE13106A91451B67DF1F1B3Choice) { if(S20BC718F1FE13106A91451B67DF1F1B3Choice.getValue().getText() == "Yes, there are!") return true; else return false; }</EvaluationScript>
	</NextStep>
	<NextStep ref="S3017B561-DC1E-3BF3-6EC8-51BBDBD81320" name="No, there are not!">
	  <EvaluationScript>function check(S20BC718F1FE13106A91451B67DF1F1B3Choice) { if(S20BC718F1FE13106A91451B67DF1F1B3Choice.getValue().getText() == "No, there are not!") return true; else return false; }</EvaluationScript>
	</NextStep>
      </ConsultStep>
      <RecommendationStep ID="S3017B561-DC1E-3BF3-6EC8-51BBDBD81320" name="There is no appropriate discharge in the patient. Call the patient and ask how s/he is.">
	<Receiver ref="P3"/>
	<Urgency>2</Urgency>
	<Display>
	  <HTML>
	    <head/>
	    <body>

	      <table  cellspacing="10" style="background-color:#e1e1e1">
		<tbody>
		  <tr name="PatientBlock" id="PatientBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated automatically in the execution phase-->

		      <p align="center"><b>Brief Information about the patient </b></p>

		      <p>Patient Name: 
			<data src="caremanagementdb://Patient/@givenName"/>
			<data src="caremanagementdb://Patient/@secondName"/>
			<data src="caremanagementdb://Patient/@familyName"/>
			<br />
			Patient ID: 
			<data src="caremanagementdb://Patient/@patientIdentifier"/>
			<br />
			Initial Diagnosis: 
			<data src="caremanagementdb://Problem[@code=95281009]/@problemValueOriginalText"/>
			<a
			  href="http://patient.parameter.monitor.link/a.php?patientID">Access to
			  EHR</a> <br />
			Implanted Device:
			<data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
			<data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
			<br />
			Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a href="http://link.to.care.management.db">Access
			  to previous Remote follow-up results</a> </p>

		      <p><br />
		      </p>
		    </td>
		  </tr>
		  <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      Alarms Detected: Atrial Fibrillation episode at a rate of 180 <br />
		      <a href="http://patient.parameter.monitor.link">Access to Report
			Exported</a> </td>
		  </tr>
		  <tr name="RecommendationBlock">
		    <td style="background-color:#eeeeee">
			    <p align="center"><b><font color="#880015">Recommendation and Next Step to follow</font> </b> </p>
		      <p>There is no appropriate discharge in the patient. Call the patient and ask how s/he is</p>

		      <form onsubmit="return ValidateData();" action="null" method="post">
			<input type="submit" name="D5Choice" value="Continue" onclick="btnWhichButton=this"/>
		      </form>
		    </td>
		  </tr>
		</tbody>
	      </table>
	    </body>
	  </HTML>
	</Display>
	<NextStep ref="S8590B661-27DB-989C-7C2C-51A555B00624"/>
      </RecommendationStep>
      <ConsultStep ID="SE6205213-2E6D-581A-FE94-51A539E1FB90" name="Evaluate SVT Case">
	<Variable name="RealSVT" type="boolean">
	  <Concept code="739568" name="MDC_IDC_EPISODE_TYPE" schemeID="MDC_IDC"/>
	  <DataSource code="C0581396" name="Cardiac implant device" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var x; var y=false; var names=list.toArray(); for(var i=0; i &lt; names.length;i++) { if(names[i] == "Epis_SVT") y=true; } return y; }</RefinementScript>
	</Variable>
	<Variable name="AF" type="boolean">
	  <Concept code="739568" name="MDC_IDC_EPISODE_TYPE" schemeID="MDC_IDC"/>
	  <DataSource code="C0581396" name="Cardiac implant device" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var x; var y=false; var names=list.toArray(); for(var i=0; i &lt; names.length;i++) { if(names[i] == "Epis_AT_AF") y=true; } return y; }</RefinementScript>
	</Variable>
	<Variable name="RenalInsufficiency" type="boolean">
	  <Concept code="C2709206" schemeID="UMLS"/>
	  <DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	  <DataSource code="C0033213" name="Problem" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var x; var y=false; var names=list.toArray(); for(var i=0; i &lt; names.length;i++) { y=true; } return y; }</RefinementScript>
	</Variable>
	<Variable name="HeartFailure" type="boolean">
	  <Concept code="C0018801" schemeID="UMLS"/>
	  <DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	  <DataSource code="C0033213" name="Problem" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var x; var y=false; var names=list.toArray(); for(var i=0; i &lt; names.length;i++) { y=true; } return y; }</RefinementScript>
	</Variable>
	<Variable name="Diabetes" type="boolean">
	  <Concept code="C0011847" schemeID="UMLS"/>
	  <DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	  <DataSource code="C0033213" name="Problem" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var x; var y=false; var names=list.toArray(); for(var i=0; i &lt; names.length;i++) { y=true; } return y; }</RefinementScript>
	</Variable>
	<Variable name="AtrialArrhythmia" type="boolean">
	  <Concept code="C0085611" schemeID="UMLS"/>
	  <DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	  <DataSource code="C0033213" name="Problem" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var x; var y=false; var names=list.toArray(); for(var i=0; i &lt; names.length;i++) { y=true; } return y; }</RefinementScript>
	</Variable>
	<Display>
	  <HTML>
	    <head/>
	    <body>

	      <table  cellspacing="10" style="background-color:#e1e1e1">
		<tbody>
		  <tr name="PatientBlock" id="PatientBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated automatically in the execution phase-->

		      <p align="center"><b>Brief Information about the patient </b></p>

		      <p>Patient Name: 
			<data src="caremanagementdb://Patient/@givenName"/>
			<data src="caremanagementdb://Patient/@secondName"/>
			<data src="caremanagementdb://Patient/@familyName"/>
			<br />
			Patient ID: 
			<data src="caremanagementdb://Patient/@patientIdentifier"/>
			<br />
			Initial Diagnosis: 
			<data src="caremanagementdb://Problem[@code=95281009]/@problemValueOriginalText"/>
			<a
			  href="http://patient.parameter.monitor.link/a.php?patientID">Access to
			  EHR</a> <br />
			Implanted Device:
			<data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
			<data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
			<br />
			Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a href="http://link.to.care.management.db">Access
			  to previous Remote follow-up results</a> </p>

		      <p><br />
		      </p>
		    </td>
		  </tr>
		  <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      Alarms Detected: Atrial Fibrillation episode at a rate of 180 <br />
		      <a href="http://patient.parameter.monitor.link">Access to Report
			Exported</a> </td>
		  </tr>
		  <tr name="EGMBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		      <p align="center"><b>Brief Information about the EGM and detected
			  problems </b> </p>

		      <table  cellspacing="10" width="100%">
			<tbody>
			  <tr>
			    <td><!--The following HTML will be populated in the execution step-->
			      <p align="center"> EGM: <a href="http://patient.parameter.monitor.link">Access to
				  Report Exported</a> <br /> </p>


			      <p><img width="312" height="190" id="Picture1"
				  src="caremanagementdb://Patient/Observation/@base64String"
				  alt="x.bmp" /></p>
			    </td>
			    <td><!--The following HTML will be populated in the execution step-->

			      <p align="center">  Assesment by CIED <a href="http://patient.parameter.monitor.link">Access
				  to Report Exported</a> <br />
				<br/>

				<p align="left"><font color="#880015">Real SVT Status: $RealSVT <br />
						AF Status: $AF </font><br />


				</p>
			      </p>
			    </td>
			  </tr>
			</tbody>
		      </table>
		    </td>
		  </tr>
		  <tr name="EHRBlock">
			<td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

			  <p align="center"><b>Brief Information about the Comorbid diseases
			  </b> </p>
			  <table  width="100%">
			<tbody>

			  <tr>
				<td>Renal insufficiency or renal failure:</td>
				<td>
				  $RenalInsufficiency
				  <a href="http://link.to.patient.parameter.monitor?section=Problemcode=C0019080">Link to EHR</a>
				</td>
			  </tr>
			  <tr>
				<td>Heart failure:</td>
				<td>
				  $HeartFailure
				  <a href="http://link.to.patient.parameter.monitor?section=Problemcode=C0019080">Link to EHR</a>
				</td>
			  </tr>
			  <tr>
				<td>Diabetes:</td>
				<td>
				  $Diabetes
				  <a href="http://link.to.patient.parameter.monitor?section=Problemcode=C0019080">Link to EHR</a>
				</td>
			  </tr>
			  <tr>
				<td>Atrial arrhythmia:</td>
				<td>
				  $AtrialArrhythmia
				  <a href="http://link.to.patient.parameter.monitor?section=Problemcode=C0019080">Link to EHR</a>
				</td>
			  </tr>			  
			</tbody>
			  </table>

			</td>
			</tr>
		  <tr name="ChoiceBlock">
		    <td style="background-color:#eeeeee">
			    <p align="center"><b><font color="#880015">Recommendation and Next Step to follow </font></b> </p>
		      <p>Please choose the suitable option</p>

		      <form onsubmit="return ValidateData();" action="null" method="post">
			<input type="submit" name="S8Choice" value="There is Sinus Tachycardia!" onclick="btnWhichButton=this"/>
			<input type="submit" name="S8Choice" value="There is Real SVT!" onclick="btnWhichButton=this"/>
			<input type="submit" name="S8Choice" value="There is AF!" onclick="btnWhichButton=this"/>
			<input type="submit" name="S5Choice" value="Finalize careplan!" onclick="btnWhichButton=this"/>
		      </form>
		    </td>
		  </tr>
		</tbody>
	      </table>
	    </body>
	  </HTML>
	</Display>
	<NextStep ref="SA6CADEC7-F665-87A2-8CE8-51C4F0D9CCAD" name="There is Sinus Tachycardia!">
	  <EvaluationScript>function check(SE62052132E6D581AFE9451A539E1FB90Choice) { if(SE62052132E6D581AFE9451A539E1FB90Choice.getValue().getText() == "There is Sinus Tachycardia!") return true; else return false; }</EvaluationScript>
	</NextStep>
	<NextStep ref="S6036EB2F-46B2-CE53-D945-51C4FDA47D4F" name="There is Real SVT!">
	  <EvaluationScript>function check(SE62052132E6D581AFE9451A539E1FB90Choice) { if(SE62052132E6D581AFE9451A539E1FB90Choice.getValue().getText() == "There is Real SVT!") return true; else return false; }</EvaluationScript>
	</NextStep>
	<NextStep ref="SA72C56FF-6E3B-9DB7-7725-51C55BD4DA6E" name="There is AF!">
	  <EvaluationScript>function check(SE62052132E6D581AFE9451A539E1FB90Choice) { if(SE62052132E6D581AFE9451A539E1FB90Choice.getValue().getText() == "There is AF!") return true; else return false; }</EvaluationScript>
	</NextStep>
	<NextStep ref="S8590B661-27DB-989C-7C2C-51A555B00624" name="Finalize careplan!">
	  <EvaluationScript>function check(SE62052132E6D581AFE9451A539E1FB90Choice) { if(SE62052132E6D581AFE9451A539E1FB90Choice.getValue().getText() == "Finalize careplan!") return true; else return false; }</EvaluationScript>
	</NextStep>
      </ConsultStep>
      <ConsultStep ID="SA6CADEC7-F665-87A2-8CE8-51C4F0D9CCAD" name="Check Inappropriate Discharge">
	<Variable name="InappropriateDischarge" type="integer">
	  <Concept code="737856" name="MDC_IDC_STAT_TACHYTHERAPY_SHOCKS_ABORTED_RECENT" schemeID="MDC_IDC"/>
	  <DataSource code="C0581396" name="Cardiac implant device" schemeID="UMLS"/>
	</Variable>
	<Display>
	  <HTML>
	    <head>						
	    </head>
	    <body>

	      <table  cellspacing="10" style="background-color:#e1e1e1">
		<tbody>
		  <tr name="PatientBlock" id="PatientBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated automatically in the execution phase-->

		      <p align="center"><b>Brief Information about the patient </b></p>

		      <p>Patient Name: 
			<data src="caremanagementdb://Patient/@givenName"/>
			<data src="caremanagementdb://Patient/@secondName"/>
			<data src="caremanagementdb://Patient/@familyName"/>
			<br />
			Patient ID: 
			<data src="caremanagementdb://Patient/@patientIdentifier"/>
			<br />
			Initial Diagnosis: 
			<data src="caremanagementdb://Problem[@code=95281009]/@problemValueOriginalText"/>
			<a
			  href="http://patient.parameter.monitor.link/a.php?patientID">Access to
			  EHR</a> <br />
			Implanted Device:
			<data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
			<data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
			<br />
			Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a href="http://link.to.care.management.db">Access
			  to previous Remote follow-up results</a> </p>

		      <p><br />
		      </p>
		    </td>
		  </tr>
		  <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      Alarms Detected: Atrial Fibrillation episode at a rate of 180 <br />
		      <a href="http://patient.parameter.monitor.link">Access to Report
			Exported</a> </td>
		  </tr>
		  <tr name="EGMBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		      <p align="center"><b>Brief Information about the EGM and detected
			  problems </b> </p>

		      <table  cellspacing="10" width="100%">
			<tbody>
			  <tr>
			    <td><!--The following HTML will be populated in the execution step-->
			      <p align="center"> EGM: <a href="http://patient.parameter.monitor.link">Access to
				  Report Exported</a> <br /> </p>


			      <p><img width="312" height="190" id="Picture1"
				  src="caremanagementdb://Patient/Observation/@base64String"
				  alt="x.bmp" /></p>
			    </td>
			    <td><!--The following HTML will be populated in the execution step-->

			      <p align="center">  Assesment by CIED <a href="http://patient.parameter.monitor.link">Access
				  to Report Exported</a> <br />
				<br/>

				<p align="left">Tachy Therapy Statistic Recent Shocks Aborted : $InappropriateDischarge 
				  <br/>

				</p>
			      </p>
			    </td>
			  </tr>
			</tbody>
		      </table>
		    </td>
		  </tr>
		  <tr name="ChoiceBlock">
		    <td style="background-color:#eeeeee">
			    <p align="center"><b><font color="#880015">Recommendation and Next Step to follow</font> </b> </p>
		      <p>By also considering the EGM of the patient please determine whether there is inappropriate discharge?</p>

		     <form onsubmit="return ValidateData();" action="null" method="post">
			<input type="submit" name="D12Choice" value="Inappropriate Discharge > 0" onclick="btnWhichButton=this"/>
			<input type="submit" name="D12Choice" value="Inappropriate Discharge = 0" onclick="btnWhichButton=this"/>
		      </form>
		    </td>
		  </tr>
		</tbody>
	      </table>
	    </body>
	  </HTML>
	</Display>
	<NextStep ref="S6DC97AD7-98DC-A207-4FFB-51B1F7B4A43D" name="InappropriateDischarge > 0">
	  <EvaluationScript>function check(SA6CADEC7F66587A28CE851C4F0D9CCADChoice) { if(SA6CADEC7F66587A28CE851C4F0D9CCADChoice.getValue().getText() == "Inappropriate Discharge > 0") return true; else return false; }</EvaluationScript>
	</NextStep>
	<NextStep ref="S9B0F77A4-E5F2-07CB-4C2C-51CE95A20DC7" name="InappropriateDischarge = 0">
	  <EvaluationScript>function check(SA6CADEC7F66587A28CE851C4F0D9CCADChoice) { if(SA6CADEC7F66587A28CE851C4F0D9CCADChoice.getValue().getText() == "Inappropriate Discharge = 0") return true; else return false; }</EvaluationScript>
	</NextStep>
      </ConsultStep>
      <RecommendationStep ID="S9B0F77A4-E5F2-07CB-4C2C-51CE95A20DC7" name="Arrange a urgent (remote/routine) follow-up in the clinic">
	<Receiver ref="P3"/>
	<Urgency>2</Urgency>
	<Display>
	  <HTML>
	    <head/>
	    <body>

	      <table  cellspacing="10" style="background-color:#e1e1e1">
		<tbody>
		  <tr name="PatientBlock" id="PatientBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated automatically in the execution phase-->

		      <p align="center"><b>Brief Information about the patient </b></p>

		      <p>Patient Name: 
			<data src="caremanagementdb://Patient/@givenName"/>
			<data src="caremanagementdb://Patient/@secondName"/>
			<data src="caremanagementdb://Patient/@familyName"/>
			<br />
			Patient ID: 
			<data src="caremanagementdb://Patient/@patientIdentifier"/>
			<br />
			Initial Diagnosis: 
			<data src="caremanagementdb://Problem[@code=95281009]/@problemValueOriginalText"/>
			<a
			  href="http://patient.parameter.monitor.link/a.php?patientID">Access to
			  EHR</a> <br />
			Implanted Device:
			<data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
			<data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
			<br />
			Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a href="http://link.to.care.management.db">Access
			  to previous Remote follow-up results</a> </p>

		      <p><br />
		      </p>
		    </td>
		  </tr>
		  <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      Alarms Detected: Atrial Fibrillation episode at a rate of 180 <br />
		      <a href="http://patient.parameter.monitor.link">Access to Report
			Exported</a> </td>
		  </tr>
		  <tr name="RecommendationBlock">
		    <td style="background-color:#eeeeee">
			    <p align="center"><b><font color="#880015">Recommendation and Next Step to follow</font> </b> </p>
			    <p>There has been inpaaropriate discharges. Arange an urgent (remote/routine) follow-up in the clinic.</p>

		      <form onsubmit="return ValidateData();" action="null" method="post">
			<input type="submit" name="D5Choice" value="Continue" onclick="btnWhichButton=this"/>
		      </form>
		    </td>
		  </tr>
		</tbody>
	      </table>
	    </body>
	  </HTML>
	</Display>
	<NextStep ref="S8590B661-27DB-989C-7C2C-51A555B00624"/>
      </RecommendationStep>
      <ConsultStep ID="S6036EB2F-46B2-CE53-D945-51C4FDA47D4F" name="Check Inappropriate Discharge">
	<Variable name="InappropriateDischarge" type="integer">
	  <Concept code="737856" name="MDC_IDC_STAT_TACHYTHERAPY_SHOCKS_ABORTED_RECENT" schemeID="MDC_IDC"/>
	  <DataSource code="C0581396" name="Cardiac implant device" schemeID="UMLS"/>
	</Variable>
	<Display>
	  <HTML>
	    <head>						
	    </head>
	    <body>					
	      <table>
		<tr name="PatientBlock" id="PatientBlock">
		  <td>
		    <!--The following HTML will be populated automatically in the execution phase-->
		    Patient Name:
		    <data src="caremanagementdb://Patient/@givenName"/>
		    <data src="caremanagementdb://Patient/@secondName"/>
		    <data src="caremanagementdb://Patient/@familyName"/>
		    <br/>
		    Patient ID:
		    <data src="caremanagementdb://Patient/@patientIdentifier"/>
		    <br/>
		    Initial Diagnosis:
		    <data src="caremanagementdb://Problem[@code=95281009]/@problemValueOriginalText"/>
		    <a href="http://patient.parameter.monitor.link/a.php?patientID">Access to EHR</a>
		    <br/>
		    Implanted Device:
		    <data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
		    <data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
		    <br/>
		    Last Follow-up Date:<data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/>
		    <a href="http://link.to.care.management.db">Access to previous Remote follow-up results</a>
		    <br/>
		  </td>
		</tr>
		<tr name="CIEDBlock">
		  <td>
		    <!--The following HTML will be populated in the execution step-->
		    Received Date:<data src="caremanagementdb://Patient/CIEDData/@receivedTime"/>
		    <br/>
		    Alarms Detected: Atrial Fibrillation episode at a rate of 180
		    <br/>
		    <a href="http://patient.parameter.monitor.link">Access to Report Exported</a>
		  </td>
		</tr>
		<tr name="EGMBlock">
		  <img src="caremanagementdb://Patient/Observation/@base64String"/>
		</tr>
		<tr name="SummaryBlock">
		  <data src="summary"/>
		</tr>
		<tr name="ChoiceBlock">
		  <td>
		    Retrieved information:<br/>
		    <font color="#880015">Tachy Therapy Statistic Recent Shocks Aborted  = $InappropriateDischarge </font><br/>
		    By also considering the EGM of the patient please determine whether there is inappropriate discharge?
		    <form onsubmit="return ValidateData();" action="null" method="post">
		      <input type="submit" name="D13Choice" value="Inappropriate Discharge > 1" onclick="btnWhichButton=this"/>
		      <input type="submit" name="D13Choice" value="Inappropriate Discharge = 1" onclick="btnWhichButton=this"/>
		      <input type="submit" name="D13Choice" value="Inappropriate Discharge = 0" onclick="btnWhichButton=this"/>
		    </form>
		  </td>
		</tr>
	      </table>
	    </body>
	  </HTML>
	</Display>
	<NextStep ref="SAA0B5D52-1B75-CCB4-F0EA-51AC57C28BAA" name="InappropriateDischarge > 1">
	  <EvaluationScript>function check(S6036EB2F46B2CE53D94551C4FDA47D4FChoice) { if(S6036EB2F46B2CE53D94551C4FDA47D4FChoice.getValue().getText() == "Inappropriate Discharge > 1") return true; else return false; }</EvaluationScript>
	</NextStep>
	<NextStep ref="S6DC97AD7-98DC-A207-4FFB-51B1F7B4A43D" name="InappropriateDischarge = 1">
	  <EvaluationScript>function check(S6036EB2F46B2CE53D94551C4FDA47D4FChoice) { if(S6036EB2F46B2CE53D94551C4FDA47D4FChoice.getValue().getText() == "Inappropriate Discharge = 1") return true; else return false; }</EvaluationScript>
	</NextStep>
	<NextStep ref="S9B0F77A4-E5F2-07CB-4C2C-51CE95A20DC7" name="InappropriateDischarge = 0">
	  <EvaluationScript>function check(S6036EB2F46B2CE53D94551C4FDA47D4FChoice) { if(S6036EB2F46B2CE53D94551C4FDA47D4FChoice.getValue().getText() == "Inappropriate Discharge = 0") return true; else return false; }</EvaluationScript>
	</NextStep>
      </ConsultStep>
      <ConsultStep ID="SA72C56FF-6E3B-9DB7-7725-51C55BD4DA6E" name="Check Inappropriate Discharge">
	<Variable name="InappropriateDischarge" type="integer">
	  <Concept code="737856" name="MDC_IDC_STAT_TACHYTHERAPY_SHOCKS_ABORTED_RECENT" schemeID="MDC_IDC"/>
	  <DataSource code="C0581396" name="Cardiac implant device" schemeID="UMLS"/>
  </Variable>
  <Variable name="AppropriateDischarge" type="integer">
	  <Concept code="737824" name="MDC_IDC_STAT_TACHYTHERAPY_SHOCKS_DELIVERED_RECENT" schemeID="MDC_IDC"/>
	  <DataSource code="C0581396" name="Cardiac implant device" schemeID="UMLS"/>
	</Variable>
	<Variable name="RenalInsufficiency" type="boolean">
	  <Concept code="C2709206" schemeID="UMLS"/>
	  <DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	  <DataSource code="C0033213" name="Problem" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var x; var y=false; var names=list.toArray(); for(var i=0; i &lt; names.length;i++) { y=true; } return y; }</RefinementScript>
	</Variable>
	<Variable name="HeartFailure" type="boolean">
	  <Concept code="C0018801" schemeID="UMLS"/>
	  <DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	  <DataSource code="C0033213" name="Problem" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var x; var y=false; var names=list.toArray(); for(var i=0; i &lt; names.length;i++) { y=true; } return y; }</RefinementScript>
	</Variable>
	<Variable name="Diabetes" type="boolean">
	  <Concept code="C0011847" schemeID="UMLS"/>
	  <DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	  <DataSource code="C0033213" name="Problem" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var x; var y=false; var names=list.toArray(); for(var i=0; i &lt; names.length;i++) { y=true; } return y; }</RefinementScript>
	</Variable>
	<Variable name="AtrialArrhythmia" type="boolean">
	  <Concept code="C0085611" schemeID="UMLS"/>
	  <DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	  <DataSource code="C0033213" name="Problem" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var x; var y=false; var names=list.toArray(); for(var i=0; i &lt; names.length;i++) { y=true; } return y; }</RefinementScript>
	</Variable>
	<Display>
	   <HTML>
	    <head>						
	    </head>
	    <body>					
	      <table cellspacing="10" style="background-color:#e1e1e1">
		 <tbody> 
		<tr name="PatientBlock" id="PatientBlock">
		  <td style="background-color:#eeeeee">
		    <!--The following HTML will be populated automatically in the execution phase-->
		    Patient Name:
		    <data src="caremanagementdb://Patient/@givenName"/>
		    <data src="caremanagementdb://Patient/@secondName"/>
		    <data src="caremanagementdb://Patient/@familyName"/>
		    <br/>
		    Patient ID:
		    <data src="caremanagementdb://Patient/@patientIdentifier"/>
		    <br/>
		    Initial Diagnosis:
		    <data src="caremanagementdb://Problem[@code=95281009]/@problemValueOriginalText"/>
		    <a href="http://patient.parameter.monitor.link/a.php?patientID">Access to EHR</a>
		    <br/>
		    Implanted Device:
		    <data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
		    <data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
		    <br/>
		    Last Follow-up Date:<data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/>
		    <a href="http://link.to.care.management.db">Access to previous Remote follow-up results</a>
		    <br/>
		  </td>
		</tr>
		<tr name="CIEDBlock">
		  <td style="background-color:#eeeeee">
		    <!--The following HTML will be populated in the execution step-->
		    Received Date:<data src="caremanagementdb://Patient/CIEDData/@receivedTime"/>
		    <br/>
		    Alarms Detected: Atrial Fibrillation episode at a rate of 180
		    <br/>
		    <a href="http://patient.parameter.monitor.link">Access to Report Exported</a>
		  </td>
		</tr>
		<tr name="EGMBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		      <p align="center"><b>Brief Information about the EGM and detected
			  problems </b> </p>

		      <table  cellspacing="10" width="100%">
			<tbody>
			  <tr>
			    <td><!--The following HTML will be populated in the execution step-->
			      <p align="center"> EGM: <a href="http://patient.parameter.monitor.link">Access to
				  Report Exported</a> <br /> </p>


			      <p><img width="312" height="190" id="Picture1"
				  src="caremanagementdb://Patient/Observation/@base64String"
				  alt="x.bmp" /></p>
			    </td>
			    <td><!--The following HTML will be populated in the execution step-->

			      <p align="center">  Assesment by CIED <a href="http://patient.parameter.monitor.link">Access
				  to Report Exported</a> <br />
				<br/>

				<p align="left"><font color="#880015">Real SVT Status: $RealSVT <br />
						AF Status: $AF </font><br />


				</p>
			      </p>
			    </td>
			  </tr>
			</tbody>
		      </table>
		    </td>
		  </tr>
		<tr name="SummaryBlock">
		  <data src="summary"/>
		</tr>
		<tr name="EHRBlock">
			<td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

			  <p align="center"><b>Brief Information about the Comorbid diseases
			  </b> </p>
			  <table  width="100%">
			<tbody>

			  <tr>
				<td>Renal insufficiency or renal failure:</td>
				<td>
				  $RenalInsufficiency
				  <a href="http://link.to.patient.parameter.monitor?section=Problemcode=C0019080">Link to EHR</a>
				</td>
			  </tr>
			  <tr>
				<td>Heart failure:</td>
				<td>
				  $HeartFailure
				  <a href="http://link.to.patient.parameter.monitor?section=Problemcode=C0019080">Link to EHR</a>
				</td>
			  </tr>
			  <tr>
				<td>Diabetes:</td>
				<td>
				  $Diabetes
				  <a href="http://link.to.patient.parameter.monitor?section=Problemcode=C0019080">Link to EHR</a>
				</td>
			  </tr>
			  <tr>
				<td>Atrial arrhythmia:</td>
				<td>
				  $AtrialArrhythmia
				  <a href="http://link.to.patient.parameter.monitor?section=Problemcode=C0019080">Link to EHR</a>
				</td>
			  </tr>			  
			</tbody>
			  </table>

			</td>
		</tr>
		<tr name="ChoiceBlock">
		  <td style="background-color:#eeeeee">
		    Retrieved information:<br/>
		    <font color="#880015">Tachy Therapy Statistic Recent Shocks Delivered = $AppropriateDischarge </font><br/>
		    <font color="#880015">Tachy Therapy Statistic Recent Shocks Aborted = $InappropriateDischarge </font><br/>
		    By also considering the EGM of the patient please determine whether there is inappropriate discharge?
		    <form onsubmit="return ValidateData();" action="null" method="post">
		      <input type="submit" name="D14Choice" value="Inappropriate discharge exists" onclick="btnWhichButton=this"/>
		      <input type="submit" name="D14Choice" value="Inappropriate discharge does not exist" onclick="btnWhichButton=this"/>
		    </form>
		  </td>
		</tr>
		</tbody>
	      </table>
	    </body>
	  </HTML>
	</Display>
	<NextStep ref="SAA0B5D52-1B75-CCB4-F0EA-51AC57C28BAA" name="Inappropriate discharge exists">
	  <EvaluationScript>function check(SA72C56FF6E3B9DB7772551C55BD4DA6EChoice) { if(SA72C56FF6E3B9DB7772551C55BD4DA6EChoice.getValue().getText() == "Inappropriate discharge exists") return true; else return false; }</EvaluationScript>
	</NextStep>
	<NextStep ref="S74261832-A29D-2E19-6E96-51D783A54E2F" name="Inappropriate discharge does not exist">
	  <EvaluationScript>function check(SA72C56FF6E3B9DB7772551C55BD4DA6EChoice) { if(SA72C56FF6E3B9DB7772551C55BD4DA6EChoice.getValue().getText() == "Inappropriate discharge does not exist") return true; else return false; }</EvaluationScript>
	</NextStep>
      </ConsultStep>
      <ConsultStep ID="S74261832-A29D-2E19-6E96-51D783A54E2F" name="Check CHADS2 Score">
	<Variable name="HistoryOfStroke" type="integer">
	  <Concept code="C0007787" name="Stroke-TIA"  schemeID="UMLS"/>
	  <DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	  <DataSource code="C0033213" name="Problem" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var x; var y=0; var names=list.toArray(); for(var i=0; i &lt; names.length;i++) { y=y+1; } if(y>0) { y=2; } return y; }</RefinementScript>
	</Variable>
	<Variable name="HistoryOfCongestiveHeartFailure" type="integer">
	  <Concept code="C0018802" name="Congestive heart failure" schemeID="UMLS"/>
	  <DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	  <DataSource code="C0033213" name="Problem" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var x; var y=0; var names=list.toArray(); for(var i=0; i &lt; names.length;i++) { y=y+1; } if(y>0) { y=1; } return y; }</RefinementScript>
	</Variable>
	<Variable name="HistoryOfDiabetisMellitus" type="integer">
	  <Concept code="C0011849" name="Diabetis Mellitus" schemeID="UMLS"/>
	  <DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	  <DataSource code="C0033213" name="Problem" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var x; var y=0; var names=list.toArray(); for(var i=0; i &lt; names.length;i++) { y=y+1; } if(y>0) { y=1; } return y; }</RefinementScript>
	</Variable>
	<Variable name="HistoryOfHypertension" type="integer">
	  <Concept code="C0020538" name="Hypertensive disease" schemeID="UMLS"/>
	  <DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	  <DataSource code="C0033213" name="Problem" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var x; var y=0; var names=list.toArray(); for(var i=0; i &lt; names.length;i++) { y=y+1; } if(y>0) { y=1; } return y; }</RefinementScript>
	</Variable>
	<Variable name="AgeOfThePatient" type="integer">
	  <Concept code="C0421451" name="Patient date of birth" schemeID="UMLS"/>
	  <DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	  <DataSource code="C0030705" name="Patient" attribute="dateTimeOfBirth" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var names=list.toArray();var x=new Date();var z = refineDate(names[0]); var y=0; if((x.getTime() - z.getTime()) / (1000 * 60 * 60 * 24 * 365) > 65) { y=1; } return y; }</RefinementScript>
	</Variable>
	<Variable name="CHADS2Score" type="integer">
	  <Concept code="" name="CHADS2 Score" schemeID=""/>
	  <DataSource code="C0178916" name="Care plan" schemeID="UMLS"/>
	  <RefinementScript>function refine() { var y=$HistoryOfStroke+$HistoryOfCongestiveHeartFailure+$HistoryOfDiabetisMellitus+$HistoryOfHypertension+$AgeOfThePatient; return y; }</RefinementScript>
	</Variable>
	<Display>
	  <HTML>
	    <head>						
	    </head>
	    <body>

	      <table  cellspacing="10" style="background-color:#e1e1e1">
		<tbody>
		  <tr name="PatientBlock" id="PatientBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated automatically in the execution phase-->

		      <p align="center"><b>Brief Information about the patient </b></p>

		      <p>Patient Name: 
			<data src="caremanagementdb://Patient/@givenName"/>
			<data src="caremanagementdb://Patient/@secondName"/>
			<data src="caremanagementdb://Patient/@familyName"/>
			<br />
			Patient ID: 
			<data src="caremanagementdb://Patient/@patientIdentifier"/>
			<br />
			Initial Diagnosis: 
			<data src="caremanagementdb://Problem[@code=95281009]/@problemValueOriginalText"/>
			<a
			  href="http://patient.parameter.monitor.link/a.php?patientID">Access to
			  EHR</a> <br />
			Implanted Device:
			<data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
			<data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
			<br />
			Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a href="http://link.to.care.management.db">Access
			  to previous Remote follow-up results</a> </p>

		      <p><br />
		      </p>
		    </td>
		  </tr>
		  <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      Alarms Detected: Atrial Fibrillation episode at a rate of 180 <br />
		      <a href="http://patient.parameter.monitor.link">Access to Report
			Exported</a> </td>
		  </tr>
		  <tr name="EHRBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		      <p align="center"><b>Brief Information about the Patient History retrieved from EHR
		      </b> </p>
		      <table  width="100%">
			<tbody>

			  <tr>
			    <td>History Of Congestive Heart Failure:</td>
			    <td>
			      $HistoryOfCongestiveHeartFailure
			      <a href="http://link.to.patient.parameter.monitor?section=Problemcode=C0019080">Link to EHR</a>
			    </td>
			  </tr>
			  <tr>
			    <td>History Of Hypertension:</td>
			    <td>
			      $HistoryOfHypertension
			      <a href="http://link.to.patient.parameter.monitor?section=Problemcode=C0019080">Link to EHR</a>
			    </td>
			  </tr>
			  <tr>
			    <td>	Age Of The Patient:</td>
			    <td>
			      $AgeOfThePatient
			      <a href="http://link.to.patient.parameter.monitor?section=Problemcode=C0019080">Link to EHR</a>
			    </td>
			  </tr>
			  <tr>
			    <td>History Of Diabetis Mellitus:</td>
			    <td>
			      $HistoryOfDiabetisMellitus
			      <a href="http://link.to.patient.parameter.monitor?section=Problemcode=C0019080">Link to EHR</a>
			    </td>
			  </tr>
			  <tr>
			    <td>History Of Stroke:</td>
			    <td>
			      $HistoryOfStroke
			      <a href="http://link.to.patient.parameter.monitor?section=Problemcode=C0019080">Link to EHR</a>
			    </td>
			  </tr>
			</tbody>
		      </table>

		    </td>
		  </tr>

		  <tr name="ChoiceBlock">
		    <td style="background-color:#eeeeee">
			    <p align="center"><b><font color="#880015">Recommendation and Next Step to follow</font> </b> </p>
			    <p>Obtained <font color="#880015">CHADS2 Score is $CHADS2Score </font>. Please choose the suitable option.</p>

		     <form onsubmit="return ValidateData();" action="null" method="post">
			<input type="submit" name="D15Choice" value="CHADS2 Score > 1" onclick="btnWhichButton=this"/>
			<input type="submit" name="D15Choice" value="CHADS2 Score = 1" onclick="btnWhichButton=this"/>
			<input type="submit" name="D15Choice" value="CHADS2 Score = 0" onclick="btnWhichButton=this"/>
		      </form>
		    </td>
		  </tr>
		</tbody>
	      </table>
	    </body>
	  </HTML>
	</Display>
	<NextStep ref="S495D603B-F90F-BA9C-9DFF-51D9403B2B2A" name="CHADS2Score > 1">
	  <EvaluationScript>function check(S74261832A29D2E196E9651D783A54E2FChoice) { if(S74261832A29D2E196E9651D783A54E2FChoice.getValue().getText() == "CHADS2 Score > 1") return true; else return false; }</EvaluationScript>
	</NextStep>
	<NextStep ref="SBC3556B3-9A94-8DEF-F393-51D9559734D2" name="CHADS2Score = 1">
	  <EvaluationScript>function check(S74261832A29D2E196E9651D783A54E2FChoice) { if(S74261832A29D2E196E9651D783A54E2FChoice.getValue().getText() == "CHADS2 Score = 1") return true; else return false; }</EvaluationScript>
	</NextStep>
	<NextStep ref="SC63436E5-6265-C942-E2B0-51D961C5D6DD" name="CHADS2Score = 0">
	  <EvaluationScript>function check(S74261832A29D2E196E9651D783A54E2FChoice) { if(S74261832A29D2E196E9651D783A54E2FChoice.getValue().getText() == "CHADS2 Score = 0") return true; else return false; }</EvaluationScript>
	</NextStep>
      </ConsultStep>
      <ConsultStep ID="S495D603B-F90F-BA9C-9DFF-51D9403B2B2A" name="Present Absolute Contraindications with previous and active conditions">
	<!--list objesi olarak Problem[] ver-->
	<Variable name="Majorbleedingintheprevioussixmonths" type="boolean">
	  <Concept code="C0019080" schemeID="UMLS"/>
	  <DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	  <DataSource code="C0033213" name="Problem" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) {var y=false;var names=list.toArray();	for(var i=0; i &lt; names.length;i++) { if(new Date() - names[i].getEffectiveTimeHigh() > 6) { y=true; } } return y; }</RefinementScript>
	</Variable>
	<Variable name="Intracranialhemorrhage" type="boolean">
	  <Concept code="C0151699" schemeID="UMLS"/>
	  <DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	  <DataSource code="C0033213" name="Problem" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var x; var y=false; var names=list.toArray(); for(var i=0; i &lt; names.length;i++) { y=true; } return y; }</RefinementScript>
	</Variable>
	<Variable name="Intracranialaneurism" type="boolean">
	  <Concept code="C0007766" schemeID="UMLS"/>
	  <DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	  <DataSource code="C0033213" name="Problem" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var x; var y=false; var names=list.toArray(); for(var i=0; i &lt; names.length;i++) { y=true; } return y; }</RefinementScript>
	</Variable>
	<Variable name="Recentmajortrauma" type="boolean">
	  <Concept code="C0332677" schemeID="UMLS"/>
	  <DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	  <DataSource code="C0033213" name="Problem" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var x; var y=false; var names=list.toArray(); for(var i=0; i &lt; names.length;i++) { y=true; } return y; }</RefinementScript>
	</Variable>
	<Variable name="Gastrointestinalbleeding" type="boolean">
	  <Concept code="C0017181" schemeID="UMLS"/>
	  <DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	  <DataSource code="C0033213" name="Problem" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var x; var y=false; var names=list.toArray(); for(var i=0; i &lt; names.length;i++) { y=true; } return y; }</RefinementScript>
	</Variable>
	<Variable name="Surgeryperformedorplannedwithinonemonth" type="boolean">
	  <Concept code="" schemeID="UMLS"/>
	  <DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	  <DataSource code="C1948041" name="Procedure" schemeID="UMLS"/>
	  <!--input olarak tum procedure listesini ver ve icinde effectiveTimeLow ve effectiveTimeHigh'a gore
	  boolean don-->
	  <RefinementScript>function refine(list) { var x; var y=false; var names=list.toArray(); for(var i=0; i &lt; names.length;i++) { y=true; } return y; }</RefinementScript>
	</Variable>
	<Variable name="Severehepaticimpairment" type="boolean">
	  <Concept code="C0948807" schemeID="UMLS"/>
	  <DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	  <DataSource code="C0033213" name="Problem" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var x; var y=false; var names=list.toArray(); for(var i=0; i &lt; names.length;i++) { if(names[i].getSeverity() == 'H') y=true; } return y; }</RefinementScript>
	</Variable>
	<Variable name="Blooddyscrasia" type="boolean">
	  <Concept code="C0018939" schemeID="UMLS"/>
	  <DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	  <DataSource code="C0033213" name="Problem" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var x; var y=false; var names=list.toArray(); for(var i=0; i &lt; names.length;i++) { y=true; } return y; }</RefinementScript>
	</Variable>
	<Variable name="Severeuncontrolledhypertension" type="boolean">
	  <Concept code="C1868885" schemeID="UMLS"/>
	  <DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	  <DataSource code="C0033213" name="Problem" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var x; var y=false; var names=list.toArray(); for(var i=0; i &lt; names.length;i++) { if(names[i].getSeverity() == 'H') y=true;  } return y; }</RefinementScript>
	</Variable>
	<Variable name="Pregnancyorlactation" type="boolean">
	  <Concept code="C0022925" schemeID="UMLS"/>
	  <DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	  <DataSource code="C0033213" name="Problem" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var x; var y=false; var names=list.toArray(); for(var i=0; i &lt; names.length;i++) { y=true; } return y; }</RefinementScript>
	</Variable>
	<Variable name="Severecognitiveimpairmentseveredementiaorpsychiatricdisease" type="boolean">
	  <Concept code="C0338656" schemeID="UMLS"/>
	  <Concept code="C0497327" schemeID="UMLS"/>
	  <Concept code="C0004936" schemeID="UMLS"/>
	  <DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	  <DataSource code="C0033213" name="Problem" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var x; var y=false; var names=list.toArray(); for(var i=0; i &lt; names.length;i++) { if(names[i].getSeverity() == 'H') y=true;  } return y; }</RefinementScript>
	</Variable>
	<Variable name="Severechronicalcoholism" type="boolean">
	  <Concept code="C0001973" schemeID="UMLS"/>
	  <DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	  <DataSource code="C0033213" name="Problem" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var x; var y=false; var names=list.toArray(); for(var i=0; i &lt; names.length;i++) { if(names[i].getSeverity() == 'H') y=true;  } return y; }</RefinementScript>
	</Variable>
	<Variable name="AbsoluteContraindication" type="boolean">
	  <Concept code="C0522473" name="Contraindication" schemeID="UMLS"/>
	  <DataSource code="C0178916" name="Care plan" schemeID="UMLS"/>
	  <RefinementScript>function refine() { var y = $Majorbleedingintheprevioussixmonths || $Intracranialhemorrhage || $Intracranialaneurism || $Recentmajortrauma || $Gastrointestinalbleeding || $Surgeryperformedorplannedwithinonemonth || $Severehepaticimpairment || $Blooddyscrasia || $Severeuncontrolledhypertension || $Pregnancyorlactation || $Severecognitiveimpairmentseveredementiaorpsychiatricdisease || $Severechronicalcoholism; return y; }</RefinementScript>
	</Variable>
	<Display>
	  <HTML>
	    <head/>
	    <body>

	      <table  cellspacing="10" style="background-color:#e1e1e1">
		<tbody>
		  <tr name="PatientBlock" id="PatientBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated automatically in the execution phase-->

		      <p align="center"><b>Brief Information about the patient </b></p>

		      <p>Patient Name: <br />
			Patient ID: <br />
			Initial Diagnosis: <a
			  href="http://patient.parameter.monitor.link/a.php?patientID">Access to
			  EHR</a> <br />
			Implanted Device: <br />
			Last Follow-up Date: <a
			  href="http://link.to.care.management.db/">Access to previous Remote
			  follow-up results</a> </p>

		      <p><br />
		      </p>
		    </td>
		  </tr>
		  <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <br />
		      Alarms Detected: Atrial Fibrillation episode at a rate of 180 <br />
		      <a href="http://patient.parameter.monitor.link/">Access to Report
			Exported</a> </td>
		  </tr>
		  <tr name="EHRBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->
		      <p align="center"><b>Brief Information about the Patient History retrieved from EHR
		      </b> </p>

		      <table  width="100%">
			<tbody>

			  <tr>
			    <td><b>Parameters that may result in <br /> Absolute Contraindication</b></td>
			    <td><b>EHR values</b></td>
			  </tr>

			  <tr>
			    <td>Major bleeding in the previous six months</td>
			    <td>
			      $Majorbleedingintheprevioussixmonths
			      <a href="http://link.to.patient.parameter.monitor?section=Problemcode=C0019080">Link to EHR</a>
			    </td>
			  </tr>
			  <tr>
			    <td>Intracranial hemorrhage</td>
			    <td>
			      $Intracranialhemorrhage
			      <a href="http://link.to.patient.parameter.monitor?section=Problemcode=C0151699">Link to EHR</a>
			    </td>
			  </tr>
			  <tr>
			    <td>Intracranial aneurism</td>
			    <td>
			      $Intracranialaneurism
			      <a href="http://link.to.patient.parameter.monitor?section=Problemcode=C0007766">Link to EHR</a>
			    </td>
			  </tr>
			  <tr>
			    <td>Recent major trauma</td>
			    <td>
			      $Recentmajortrauma
			      <a href="http://link.to.patient.parameter.monitor?section=Problemcode=C0332677">Link to EHR</a>
			    </td>
			  </tr>
			  <tr>
			    <td>Gastrointestinal bleeding</td>
			    <td>
			      $Gastrointestinalbleeding
			      <a href="http://link.to.patient.parameter.monitor?section=Problemcode=C0017181">Link to EHR</a>
			    </td>
			  </tr>
			  <tr>
			    <td>Surgery performed or planned within one month</td>
			    <td>
			      $Surgeryperformedorplannedwithinonemonth
			      <a href="http://link.to.patient.parameter.monitor?section=Procedure">Link to EHR</a>
			    </td>
			  </tr>
			  <tr>
			    <td>Severe hepatic impairment</td>
			    <td>
			      $Severehepaticimpairment
			      <a href="http://link.to.patient.parameter.monitor?section=Problemcode=C0948807">Link to EHR</a>
			    </td>
			  </tr>
			  <tr>
			    <td>Blood dyscrasia</td>
			    <td>
			      $Blooddyscrasia
			      <a href="http://link.to.patient.parameter.monitor?section=Problemcode=C0018939">Link to EHR</a>
			    </td>
			  </tr>
			  <tr>
			    <td>Severe uncontrolled hypertension</td>
			    <td>
			      $Severeuncontrolledhypertension
			      <a href="http://link.to.patient.parameter.monitor?section=Problemcode=C1868885">Link to EHR</a>
			    </td>
			  </tr>
			  <tr>
			    <td>Pregnancy (1st and 3rd trimester) or lactation</td>
			    <td>
			      $Pregnancyorlactation
			      <a href="http://link.to.patient.parameter.monitor?section=Problemcode=C0022925">Link to EHR</a>
			    </td>
			  </tr>
			  <tr>
			    <td>Severe cognitive impairment (severe dementia or psychiatric disease)</td>
			    <td>
			      $Severecognitiveimpairmentseveredementiaorpsychiatricdisease
			      <a href="http://link.to.patient.parameter.monitor?section=Problemcode=C0338656,C0497327,C0004936">Link to EHR</a>
			    </td>
			  </tr>
			  <tr>
			    <td>Severe chronic alcoholism</td>
			    <td>
			      $Severechronicalcoholism
			      <a href="http://link.to.patient.parameter.monitor?section=Problemcode=C0001973">Link to EHR</a>
			    </td>
			  </tr>
			</tbody>
		      </table>
		    </td>
		  </tr>
		  <tr name="ChoiceBlock">
		    <td style="background-color:#eeeeee"><p align="center"><b><font color="#880015">Recommendation
					    and Next Step to follow </font></b> </p>
		    <p ID="DecisionParagraph">Obtained status of <font color="#880015">Absolute Contraindication is $AbsoluteContraindication </font>.</p>
		      <p>Considering the 'Failure to Comply', 'Hypersensibility' and 'Patient Rejection' properties, do you think there is Absolute Contraindication?</p>

		      <form onsubmit="return ValidateData();" action="null" method="post">
			<input type="submit" name="S16Choice" value="Yes, there is!" onclick="btnWhichButton=this"/>
			<input type="submit" name="S16Choice" value="No, continue with checking relative contraindications!" onclick="btnWhichButton=this"/>
		      </form>
		    </td>
		  </tr>
		</tbody>
	      </table>
	    </body>
	  </HTML>
	</Display>
	<NextStep ref="S7717E623-A53C-8D9A-EB13-51DF393DCA19" name="Yes, there is!">
	  <EvaluationScript>function check(S495D603BF90FBA9C9DFF51D9403B2B2AChoice) { if(S495D603BF90FBA9C9DFF51D9403B2B2AChoice.getValue().getText() == "Yes, there is!") return true; else return false; }</EvaluationScript>
	</NextStep>
	<NextStep ref="S2323666F-BB5F-6249-880C-51E1054B58A0" name="No, continue with checking relative contraindications!">
	  <EvaluationScript>function check(S495D603BF90FBA9C9DFF51D9403B2B2AChoice) { if(S495D603BF90FBA9C9DFF51D9403B2B2AChoice.getValue().getText() == "No, continue with checking relative contraindications!") return true; else return false; }</EvaluationScript>
	</NextStep>
      </ConsultStep>
      <ConsultStep ID="S2323666F-BB5F-6249-880C-51E1054B58A0" name="Present Relative Contraindications with previous and active conditions">
	<!--list objesi olarak Problem[] ver-->
	<Variable name="Hemorrhagicretinopathy" type="boolean">
	  <Concept code="C0948059" schemeID="UMLS"/>
	  <DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	  <DataSource code="C0033213" name="Problem" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var x; var y=false; var names=list.toArray(); for(var i=0; i &lt; names.length;i++) { y=true; } return y; }</RefinementScript>
	</Variable>
	<Variable name="Activegastroduodenalulcus" type="boolean">
	  <Concept code="C0041582" schemeID="UMLS"/>
	  <DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	  <DataSource code="C0033213" name="Problem" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var x; var y=false; var names=list.toArray(); for(var i=0; i &lt; names.length;i++) { y=true; } return y; }</RefinementScript>
	</Variable>
	<Variable name="Chronichepaticdisease" type="boolean">
	  <Concept code="C0023895" schemeID="UMLS"/>
	  <DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	  <DataSource code="C0033213" name="Problem" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var x; var y=false; var names=list.toArray(); for(var i=0; i &lt; names.length;i++) { y=true; } return y; }</RefinementScript>
	</Variable>
	<Variable name="Moderatecognitiveimpairment" type="boolean">
	  <Concept code="C0338656" schemeID="UMLS"/>
	  <Concept code="C0497327" schemeID="UMLS"/>
	  <Concept code="C0004936" schemeID="UMLS"/>
	  <DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	  <DataSource code="C0033213" name="Problem" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var x; var y=false; var names=list.toArray(); for(var i=0; i &lt; names.length;i++) { if(names[i].getSeverity() == 'M') y=true;  } return y; }</RefinementScript>
	</Variable>
	<Variable name="Activechronicalcoholism" type="boolean">
	  <Concept code="C0001973" schemeID="UMLS"/>
	  <DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	  <DataSource code="C0033213" name="Problem" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var x; var y=false; var names=list.toArray(); for(var i=0; i &lt; names.length;i++) { y=true; } return y; }</RefinementScript>
	</Variable>
	<Variable name="Epilepsy" type="boolean">
	  <Concept code="C0014544" schemeID="UMLS"/>
	  <DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	  <DataSource code="C0033213" name="Problem" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var x; var y=false; var names=list.toArray(); for(var i=0; i &lt; names.length;i++) { y=true; } return y; }</RefinementScript>
	</Variable>
	<Variable name="Pericardialeffusion" type="boolean">
	  <Concept code="C0031039" schemeID="UMLS"/>
	  <DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	  <DataSource code="C0033213" name="Problem" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var x; var y=false; var names=list.toArray(); for(var i=0; i &lt; names.length;i++) { y=true; } return y; }</RefinementScript>
	</Variable>
	<Variable name="RelativeContraindication" type="boolean">
	  <Concept code="C0522473" name="Contraindication" schemeID="UMLS"/>
	  <DataSource code="C0178916" name="Care plan" schemeID="UMLS"/>
	  <RefinementScript>function refine() { var y=$Hemorrhagicretinopathy || $Activegastroduodenalulcus || $Chronichepaticdisease || $Moderatecognitiveimpairment || $Activechronicalcoholism || $Epilepsy || $Pericardialeffusion; return y; }</RefinementScript>
	</Variable>
	<Display>
	  <HTML>
	    <head/>
	    <body>

	      <table  cellspacing="10" style="background-color:#e1e1e1">
		<tbody>
		  <tr name="PatientBlock" id="PatientBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated automatically in the execution phase-->

		      <p align="center"><b>Brief Information about the patient </b></p>

		      <p>Patient Name: <br />
			Patient ID: <br />
			Initial Diagnosis: <a
			  href="http://patient.parameter.monitor.link/a.php?patientID">Access to
			  EHR</a> <br />
			Implanted Device: <br />
			Last Follow-up Date: <a
			  href="http://link.to.care.management.db/">Access to previous Remote
			  follow-up results</a> </p>

		      <p><br />
		      </p>
		    </td>
		  </tr>
		  <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <br />
		      Alarms Detected: Atrial Fibrillation episode at a rate of 180 <br />
		      <a href="http://patient.parameter.monitor.link/">Access to Report
			Exported</a> </td>
		  </tr>
		  <tr name="EHRBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->
		      <p align="center"><b>Brief Information about the Patient History retrieved from EHR
		      </b> </p>

		      <table  width="100%">
			<tbody>
			  <tr>
			    <td><b>Parameters that may result in <br /> Relative Contraindication</b></td>
			    <td><b>EHR values</b></td>
			  </tr>

			  <tr>
			    <td>Active gastroduodenal ulcus</td>
			    <td>
			      $Activegastroduodenalulcus
			      <a href="http://link.to.patient.parameter.monitor?section=Problemcode=C0041582">Link to EHR</a>
			    </td>
			  </tr>
			  <tr>
			    <td>Hemorrhagic retinopathy</td>
			    <td>
			      $Hemorrhagicretinopathy
			      <a href="http://link.to.patient.parameter.monitor?section=Problemcode=C0948059">Link to EHR</a>
			    </td>
			  </tr>
			  <tr>
			    <td>Chronic hepatic disease</td>
			    <td>
			      $Chronichepaticdisease
			      <a href="http://link.to.patient.parameter.monitor?section=Problemcode=C0023895">Link to EHR</a>
			    </td>
			  </tr>
			  <tr>
			    <td>Active chronic alcoholism</td>
			    <td>
			      $Activechronicalcoholism
			      <a href="http://link.to.patient.parameter.monitor?section=Problemcode=C0001973">Link to EHR</a>
			    </td>
			  </tr>
			  <tr>
			    <td>Epilepsy</td>
			    <td>
			      $Epilepsy
			      <a href="http://link.to.patient.parameter.monitor?section=Problemcode=C0017181">Link to EHR</a>
			    </td>
			  </tr>
			  <tr>
			    <td>Pericardial Effusion</td>
			    <td>
			      $Pericardialeffusion
			      <a href="http://link.to.patient.parameter.monitor?section=Problemcode=C0031039">Link to EHR</a>
			    </td>
			  </tr>
			  <tr>
			    <td>Moderate cognitive impairment</td>
			    <td>
			      $Moderatecognitiveimpairment
			      <a href="http://link.to.patient.parameter.monitor?section=Problemcode=C0948807">Link to EHR</a>
			    </td>
			  </tr>	
			</tbody>
		      </table>
		    </td>
		  </tr>
		  <tr name="ChoiceBlock">
		    <td style="background-color:#eeeeee"><p align="center"><b><font color="#880015">Recommendation
					    and Next Step to follow </font> </b></p>
		    <p ID="DecisionParagraph">Obtained status of <font color="#880015">Relative Contraindication is $RelativeContraindication </font>.</p>
		      <p>Considering the 'Short life expectancy' parameter, do you think there is Relative Contraindication?</p>

		      <form onsubmit="return ValidateData();" action="null" method="post">
			<input type="submit" name="S17Choice" value="Yes, there is!" onclick="btnWhichButton=this"/>
			<input type="submit" name="S17Choice" value="No, continue with checking lab records!" onclick="btnWhichButton=this"/>
		      </form> 
		    </td>
		  </tr>
		</tbody>
	      </table>
	    </body>
	  </HTML>
	</Display>
	<NextStep ref="S7717E623-A53C-8D9A-EB13-51DF393DCA19" name="Yes, there is!">
	  <EvaluationScript>function check(S2323666FBB5F6249880C51E1054B58A0Choice) { if(S2323666FBB5F6249880C51E1054B58A0Choice.getValue().getText() == "Yes, there is!") return true; else return false; }</EvaluationScript>
	</NextStep>
	<NextStep ref="S84C97547-9DD8-F054-83A7-527A340ED9CB" name="No, continue with checking lab records!">
	  <EvaluationScript>function check(S2323666FBB5F6249880C51E1054B58A0Choice) { if(S2323666FBB5F6249880C51E1054B58A0Choice.getValue().getText() == "No, continue with checking lab records!") return true; else return false; }</EvaluationScript>
	</NextStep>
      </ConsultStep>
      <ConsultStep ID="S84C97547-9DD8-F054-83A7-527A340ED9CB" name="Present Contraindications with recent Lab records">
	<Variable name="GOT" type="float">
	  <Concept code="C0004002" schemeID="UMLS"/>
	  <DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	  <DataSource code="C1254595" name="ImagingResult" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var y=0; var names=list.toArray();	for(var i=0; i &lt; names.length;i++) { y=names[i].getLabResultValue(); } return y; }</RefinementScript>
	</Variable>
	<Variable name="GPT" type="float">
	  <Concept code="C0201836" schemeID="UMLS"/>
	  <DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	  <DataSource code="C1254595" name="ImagingResult" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var y=0; var names=list.toArray();	for(var i=0; i &lt; names.length;i++) { y=names[i].getLabResultValue(); } return y; }</RefinementScript>
	</Variable>
	<Variable name="LDH" type="float">
	  <Concept code="C0202113" schemeID="UMLS"/>
	  <DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	  <DataSource code="C1254595" name="ImagingResult" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var y=0; var names=list.toArray();	for(var i=0; i &lt; names.length;i++) { y=names[i].getLabResultValue(); } return y; }</RefinementScript>
	</Variable>
	<Variable name="Phosphatase" type="float">
	  <Concept code="C0201850" schemeID="UMLS"/>
	  <DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	  <DataSource code="C1254595" name="ImagingResult" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var y=0; var names=list.toArray();	for(var i=0; i &lt; names.length;i++) { y=names[i].getLabResultValue(); } return y; }</RefinementScript>
	</Variable>
	<Variable name="GammaGT" type="float">
	  <Concept code="C0202035" schemeID="UMLS"/>
	  <DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	  <DataSource code="C1254595" name="ImagingResult" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var y=0; var names=list.toArray();	for(var i=0; i &lt; names.length;i++) { y=names[i].getLabResultValue(); } return y; }</RefinementScript>
	</Variable>
	<!--Variable name="Erythrocytecount" type="float">
	  <Concept code="C0014772" schemeID="UMLS"/>
	  <DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	  <DataSource code="C1254595" name="ImagingResult" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var y=0; var names=list.toArray();	for(var i=0; i &lt; names.length;i++) { y=names[i].getLabResultValue(); } return y; }</RefinementScript>
	</Variable-->
	<Variable name="Hemoglobin" type="float">
	  <Concept code="C0518015" schemeID="UMLS"/>
	  <DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	  <DataSource code="C1254595" name="ImagingResult" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var y=0; var names=list.toArray();	for(var i=0; i &lt; names.length;i++) { y=names[i].getLabResultValue(); } return y; }</RefinementScript>
	</Variable>
	<Variable name="Platelets" type="float">
	  <Concept code="C0032181" schemeID="UMLS"/>
	  <DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	  <DataSource code="C1254595" name="ImagingResult" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var y=0; var names=list.toArray();	for(var i=0; i &lt; names.length;i++) { y=names[i].getLabResultValue(); } return y; }</RefinementScript>
	</Variable>
	<Variable name="Leucocytes" type="float">
	  <Concept code="C0023508" schemeID="UMLS"/>
	  <DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	  <DataSource code="C1254595" name="ImagingResult" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var y=0; var names=list.toArray();	for(var i=0; i &lt; names.length;i++) { y=names[i].getLabResultValue(); } return y; }</RefinementScript>
	</Variable>
	<Variable name="INR" type="float">
	  <Concept code="C0525032" schemeID="UMLS"/>
	  <DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	  <DataSource code="C1254595" name="ImagingResult" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var y=0; var names=list.toArray();	for(var i=0; i &lt; names.length;i++) { y=names[i].getLabResultValue(); } return y; }</RefinementScript>
	</Variable>
	<!--Variable name="Fibrinogen" type="float">
	  <Concept code="C0016006" schemeID="UMLS"/>
	  <DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	  <DataSource code="C1254595" name="ImagingResult" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var y=0; var names=list.toArray();	for(var i=0; i &lt; names.length;i++) { y=names[i].getLabResultValue(); } return y; }</RefinementScript>
	</Variable-->
	<Variable name="LabContraindication" type="boolean">
	  <Concept code="C0522473" name="Contraindication" schemeID="UMLS"/>
	  <DataSource code="C0178916" name="Care plan" schemeID="UMLS"/>
	  <RefinementScript>function refine()	{ var y = $GOT &lt; 10 || $GOT > 35 || $GPT &lt; 10 || $GPT > 35 || $LDH &lt; 135 || $LDH > 225 || $Phosphatase &lt; 35 || $Phosphatase > 104 || $GammaGT &lt; 5 || $GammaGT > 39 || $Hemoglobin &lt; 11.7 || $Hemoglobin > 15.7 || $Platelets &lt; 140 || $Platelets > 400 || $Leucocytes &lt; 4 || $Leucocytes > 10 || $INR &lt; 0.8 || $INR > 1.2; return y;}</RefinementScript>
	</Variable>
	<Display>
	  <HTML>
	    <head/>
	    <body>

	      <table  cellspacing="10" style="background-color:#e1e1e1">
		<tbody>
		  <tr name="PatientBlock" id="PatientBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated automatically in the execution phase-->

		      <p align="center"><b>Brief Information about the patient </b></p>

		      <p>Patient Name: <br />
			Patient ID: <br />
			Initial Diagnosis: <a
			  href="http://patient.parameter.monitor.link/a.php?patientID">Access to
			  EHR</a> <br />
			Implanted Device: <br />
			Last Follow-up Date: <a
			  href="http://link.to.care.management.db/">Access to previous Remote
			  follow-up results</a> </p>

		      <p><br />
		      </p>
		    </td>
		  </tr>
		  <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <br />
		      Alarms Detected: Atrial Fibrillation episode at a rate of 180 <br />
		      <a href="http://patient.parameter.monitor.link/">Access to Report
			Exported</a> </td>
		  </tr>
		  <tr name="EHRBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->
		      <p align="center"><b>Brief Information about the Patient History retrieved from EHR
		      </b> </p>

		      <table  width="100%">
			<tbody>

			  <tr>
			    <td>Lab Results</td>
			    <td>Value</td>
			    <td>Normal Values</td>
			  </tr>
			  <tr>
			    <td>GOT</td>
			    <td>
			      $GOT
			      <a href="http://link.to.patient.parameter.monitor?section=ImagingResultcode=C0004002">Link to EHR</a>
			    </td>
			    <td>10-35 U/l</td>
			  </tr>
			  <tr>
			    <td>GPT</td>
			    <td>
			      $GPT
			      <a href="http://link.to.patient.parameter.monitor?section=ImagingResultcode=C0201836">Link to EHR</a>
			    </td>
			    <td>10-35 U/l</td>
			  </tr>
			  <tr>
			    <td>LDH</td>
			    <td>
			      $LDH
			      <a href="http://link.to.patient.parameter.monitor?section=ImagingResultcode=C0202113">Link to EHR</a>
			    </td>
			    <td>135-225 U/l</td>
			  </tr>
			  <tr>
			    <td>Alk.Phosphatase</td>
			    <td>
			      $Phosphatase
			      <a href="http://link.to.patient.parameter.monitor?section=ImagingResultcode=C0201850]">Link to EHR</a>
			    </td>
			    <td>35-104 U/l</td>
			  </tr>
			  <tr>
			    <td>Gamma-GT</td>
			    <td>
			      $GammaGT
			      <a href="http://link.to.patient.parameter.monitor?section=ImagingResultcode=C0202035">Link to EHR</a>
			    </td>
			    <td>5-39 U/l</td>
			  </tr>
			  <tr>
			    <td>INR</td>
			    <td>
			      $INR
			      <a href="http://link.to.patient.parameter.monitor?section=ImagingResultcode=C052032">Link to EHR</a>
			    </td>
			    <td>0.8 - 1.2</td>
			  </tr>
			  <!--tr>
			    <td>Fibrinogen</td>
			    <td>
			      $Fibrinogen
			      <a href="http://link.to.patient.parameter.monitor?section=ImagingResultcode=C0016006">Link to EHR</a>
			    </td>
			    <td>150-450 mg/dl</td>
			  </tr>
			  <tr>
			    <td>Erythrocyte count</td>
			    <td>
			      $Erythrocytecount
			      <a href="http://link.to.patient.parameter.monitor?section=ImagingResultcode=C0014772">Link to EHR</a>
			    </td>
			    <td>3.8-5.2 T/L</td>
			  </tr-->
			  <tr>
			    <td>Hemoglobin</td>
			    <td>
			      $Hemoglobin
			      <a href="http://link.to.patient.parameter.monitor?section=ImagingResultcode=C0518015">Link to EHR</a>
			    </td>
			    <td>11.7-15.6 g/dl</td>
			  </tr>
			  <tr>
			    <td>Platelets</td>
			    <td>
			      $Platelets
			      <a href="http://link.to.patient.parameter.monitor?section=ImagingResultcode=C0032181">Link to EHR</a>
			    </td>
			    <td>140-400 G/L</td>
			  </tr>
			  <tr>
			    <td>Leucocytes</td>
			    <td>
			      $Leucocytes
			      <a href="http://link.to.patient.parameter.monitor?section=ImagingResultcode=C0023508">Link to EHR</a>
			    </td>
			    <td>4-10 G/L</td>
			  </tr>
	
			</tbody>
		      </table>
		    </td>
		  </tr>
		  <tr name="ChoiceBlock">
		    <td style="background-color:#eeeeee"><p align="center"><b><font color="#880015">Recommendation
					    and Next Step to follow </font></b> </p>
		    <p ID="DecisionParagraph">The <font color="#880015">Lab Results Contraindication status is $LabContraindication </font>. Do you confirm?</p>

		      <form onsubmit="return ValidateData();" action="null" method="post">
			<input type="submit" name="S18Choice" value="Yes, there is!" onclick="btnWhichButton=this"/>
			<input type="submit" name="S18Choice" value="No, continue with checking medications!" onclick="btnWhichButton=this"/>
		      </form>
		    </td>
		  </tr>
		</tbody>
	      </table>
	    </body> 
	  </HTML>
	</Display>
	<NextStep ref="S7717E623-A53C-8D9A-EB13-51DF393DCA19" name="Yes, there is!">
	  <EvaluationScript>function check(S84C975479DD8F05483A7527A340ED9CBChoice) { if(S84C975479DD8F05483A7527A340ED9CBChoice.getValue().getText() == "Yes, there is!") return true; else return false; }</EvaluationScript>
	</NextStep>
	<NextStep ref="S5276EFF2-BDD0-31A9-AF8C-527C28408DF6" name="No, continue with checking medications!">
	  <EvaluationScript>function check(S84C975479DD8F05483A7527A340ED9CBChoice) { if(S84C975479DD8F05483A7527A340ED9CBChoice.getValue().getText() == "No, continue with checking medications!") return true; else return false; }</EvaluationScript>
	</NextStep>
      </ConsultStep>
      <ConsultStep ID="S5276EFF2-BDD0-31A9-AF8C-527C28408DF6" name="Present Contraindications with current Medications">
	<Variable name="MedicationsEHR" type="String[]">
	  <DataSource code="C2362543" name="Electronic Health Records" schemeID="UMLS"/>
	  <DataSource code="C2598133" name="Medication" schemeID="UMLS"/>
	</Variable>
	<Variable name="MedicationsPHR" type="String[]">
	  <DataSource code="C0018739" name="Health Records, Personal" schemeID="UMLS"/>
	  <DataSource code="C2598133" name="Medication" schemeID="UMLS"/>
	</Variable>
	<Variable name="MedicationContraindication" type="boolean">
	  <Concept code="C0522473" name="Contraindication" schemeID="UMLS"/>
	  <DataSource code="C0178916" name="Care plan" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var x; var y=true; var names=list.toArray(); for(var i=0; i &lt; names.length;i++) { y=true; } return y; }</RefinementScript>
	</Variable>
	<Display>
	  <HTML>
	    <head/>
	    <body>

	      <table  cellspacing="10" style="background-color:#e1e1e1">
		<tbody>
		  <tr name="PatientBlock" id="PatientBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated automatically in the execution phase-->

		      <p align="center"><b>Brief Information about the patient </b></p>

		      <p>Patient Name: <br />
			Patient ID: <br />
			Initial Diagnosis: <a
			  href="http://patient.parameter.monitor.link/a.php?patientID">Access to
			  EHR</a> <br />
			Implanted Device: <br />
			Last Follow-up Date: <a
			  href="http://link.to.care.management.db/">Access to previous Remote
			  follow-up results</a> </p>

		      <p><br />
		      </p>
		    </td>
		  </tr>
		  <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <br />
		      Alarms Detected: Atrial Fibrillation episode at a rate of 180 <br />
		      <a href="http://patient.parameter.monitor.link/">Access to Report
			Exported</a> </td>
		  </tr>
		  <tr name="EHRBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->
		      <p align="center"><b>Brief Information about the Patient History retrieved from EHR
		      </b> </p>

		      <table  width="100%">
			<tbody>
			  <tr>
			    <th>Active Medications</th>
			    <th>Does the patient regularly takes the medications?</th>
			    <th>Is this medication contraindicates with anticoagulants?</th>
		    </tr>
		    <script>
			    <arguments>$MedicationsEHR, $MedicationsPHR</arguments>
			    <content>var contraList = ['103','161','376','455','519','677','719','1191','1202','1256','1598','2002','2178','2180','2184','2187','2189','2193','2344','2348','2356','2404','2409','2447','2541','2551','2594','2626','2878','3002','3102','3292','3327','3355','3356','3393','3554','3640','4053','4109','4118','4331','4450','4492','4493','4508','4719','4832','4903','5021','5093','5095','5224','5640','5657','5781','5806','6142','6371','6472','6693','6760','6835','6876','6901','6922','6932','7233','7240','7258','7299','7517','7623','7646','7779','7813','7833','7909','8013','8134','8160','8183','8339','8356','8640','8691','8703','8754','8785','8787','8794','9068','9071','9143','9384','9624','9997','10032','10106','10156','10179','10180','10205','10207','10237','10324','10395','10591','10594','10635','10689','10737','10831','11055','11256','11258','11289','15202','17128','18631','19860','21212','28031','29787','32385','32613','32937','35255','35827','36437','36567','40144','40254','40575','40790','41127','42355','42463','42635','60819','72143','82122','83367','114970','114979','140587','142448','194000','203114','207391','221126','232158','237057','278567','283742','328134','341248','5067008','8216003','9203006','9268004','14304000','27867009','30492008','36236003','41000005','47546008','49157004','49634009','51779009','60169008','63094006','65695006','67828004','71181003','80229008','87708000','96302009','103835000','105925009','108616001','108972005','111151007','112113009','178960009','255631004','255632006','255635008','255638005','255656005','260872001','264049007','286586005','324116004','349854005','372525000','372585002','372806008','372862008','373265006','373281001','373443008','387406002','387459000','413358002','428787002','C0000618','C0000970','C0001655','C0001975','C0002144','C0002555','C0002556','C0002640','C0002744','C0002771','C0003138','C0003232','C0003280','C0003286','C0003289','C0003360','C0003374','C0003392','C0004057','C0004147','C0004482','C0004745','C0005640','C0006464','C0006949','C0007541','C0007546','C0007552','C0007555','C0007557','C0007561','C0007732','C0008161','C0008168','C0008188','C0008287','C0008294','C0008402','C0008783','C0008809','C0009002','C0009079','C0010137','C0010583','C0010961','C0011824','C0012022','C0012091','C0012093','C0012228','C0012772','C0012798','C0013090','C0014806','C0014963','C0014987','C0015837','C0016277','C0016360','C0016365','C0016384','C0017120','C0017245','C0017687','C0017845','C0018242','C0018546','C0018549','C0019134','C0020591','C0020740','C0020823','C0021246','C0021403','C0022635','C0023556','C0024027','C0025152','C0025386','C0025644','C0025741','C0025810','C0025872','C0025942','C0026457','C0027324','C0027353','C0027396','C0027415','C0027603','C0028365','C0028902','C0028978','C0029995','C0030072','C0030125','C0030438','C0030899','C0031412','C0031463','C0031507','C0031955','C0031990','C0032952','C0033148','C0033228','C0033429','C0033493','C0033497','C0033511','C0034414','C0034417','C0034428','C0034665','C0035608','C0036077','C0036516','C0037982','C0038149','C0038317','C0038418','C0038633','C0038687','C0038689','C0038742','C0038745','C0038760','C0038792','C0039286','C0039644','C0039651','C0040125','C0040128','C0040193','C0040207','C0040374','C0040610','C0040616','C0040805','C0041044','C0041983','C0042071','C0042210','C0042874','C0042878','C0042890','C0043031','C0048470','C0050940','C0052796','C0054234','C0055856','C0064113','C0066282','C0069454','C0069739','C0070122','C0072916','C0073631','C0074393','C0074554','C0079691','C0080356','C0081408','C0081876','C0082608','C0085228','C0085542','C0085826','C0086140','C0086440','C0168273','C0205395','C0242903','C0243077','C0244404','C0282386','C0282563','C0286651','C0304403','C0304562','C0304945','C0358591','C0360105','C0360714','C0378466','C0378482','C0380028','C0442122','C0450442','C0521362','C0522860','C0528023','C0538927','C0546882','C0564420','C0573797 ','C0595726','C0671970','C0690770','C0700442','C0724636','C0745136','C0762662','C0772394','C0846670','C0913246','C0937846','C1122962','C1142985','C1289971','C1321567','C1548819','C1579362','C1579437','C2045867','C2064853','C2114759','C2248143','C2266924','C2267085','C2916905','C2917323','C2936462']; function generate(ehrMeds, phrMeds) { var e; var p; var c; var output = ''; for(e=0; e&lt;ehrMeds.length;e++) { output = output + '&lt;tr&gt;'; var ehrMed = ehrMeds[e]; var useIt = 'No'; for(p=0; p&lt;phrMeds.length;p++) { var phrMed = phrMeds[p];	if(ehrMed.getDrugCode().equals(phrMed.getDrugCode())) { useIt = '&lt;font color="#880015"&gt;&lt;b&gt;Yes!!!&lt;/b&gt;&lt;/font&gt;'; } } var contraindicates = 'No'; for(c=0; c&lt;contraList.length;c++) { var contaCode = contraList[c];	if(ehrMed.getDrugCode() == contaCode) { contraindicates = '&lt;font color="#880015"&gt;&lt;b&gt;Yes!!!&lt;/b&gt;&lt;/font&gt;'; } } var line = '&lt;td&gt;' + ehrMed.getText() + '&lt;/td&gt;' + '&lt;td&gt;' + useIt + '&lt;/td&gt;' + '&lt;td&gt;' + contraindicates + '&lt;/td&gt;'; output = output + line; output = output + '&lt;/tr&gt;';}  return output; }</content>
		    </script>
			  <!--tr>
			    <td>Nexium 20 mg</td>
			    <td>Yes</td>
			    <td>No</td>								
			  </tr>
			  <tr>
			    <td>Thrombo ass 100 mg Aspirin</td>
			    <td>Yes</td>
			    <td>YES, Attention!!!</td>								
			  </tr>
			  <tr>
			    <td>Plavix 75 mg</td>
			    <td>Yes</td>
			    <td>No</td>								
			  </tr>
			  <tr>
			    <td>Nebivolol</td>
			    <td>Yes</td>
			    <td>No</td>								
			  </tr>
			  <tr>
			    <td>Simvastatin 20 mg</td>
			    <td>Yes</td>
			    <td>YES, Attention!!!</td>								
			  </tr>
			  <tr>
			    <td>Drug eluting stent</td>
			    <td>-</td>
			    <td>YES, Attention!!!</td>								
			  </tr-->
			</tbody>
		      </table>
		    </td>
		  </tr>
		  <tr name="ChoiceBlock">
		    <td style="background-color:#eeeeee"><p align="center"><b><font color="#880015">Recommendation
					    and Next Step to follow </font></b> </p>
		    <p ID="DecisionParagraph">The <font color="#880015">Medication Contraindication status is $MedicationContraindication </font>. Do you confirm?</p>
		      <form onsubmit="return ValidateData();" action="null" method="post">
			<input type="submit" name="S19Choice" value="Yes, there is!" onclick="btnWhichButton=this"/>
			<input type="submit" name="S19Choice" value="No!" onclick="btnWhichButton=this"/>
		      </form>
		    </td>
		  </tr>
		</tbody>
	      </table>
	    </body>
	  </HTML>
	</Display>
	<NextStep ref="S7717E623-A53C-8D9A-EB13-51DF393DCA19" name="Yes, there is!">
	  <EvaluationScript>function check(S5276EFF2BDD031A9AF8C527C28408DF6Choice) { if(S5276EFF2BDD031A9AF8C527C28408DF6Choice.getValue().getText() == "Yes, there is!") return true; else return false; }</EvaluationScript>
	</NextStep>
	<NextStep ref="SFBA02369-0409-3767-BB76-527EC1C76590" name="No!">
	  <EvaluationScript>function check(S5276EFF2BDD031A9AF8C527C28408DF6Choice) { if(S5276EFF2BDD031A9AF8C527C28408DF6Choice.getValue().getText() == "No!") return true; else return false; }</EvaluationScript>
	</NextStep>
      </ConsultStep>
      <RecommendationStep ID="SC63436E5-6265-C942-E2B0-51D961C5D6DD" name="Prescription of Aspirin 81 to 325 mg daily">
	<Receiver ref="P3"/>
	<Urgency>2</Urgency>
	<Display>
	  <HTML>
	    <head/>
	    <body>

	      <table  cellspacing="10" style="background-color:#e1e1e1">
		<tbody>
		  <tr name="PatientBlock" id="PatientBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated automatically in the execution phase-->

		      <p align="center"><b>Brief Information about the patient </b></p>

		      <p>Patient Name: 
			<data src="caremanagementdb://Patient/@givenName"/>
			<data src="caremanagementdb://Patient/@secondName"/>
			<data src="caremanagementdb://Patient/@familyName"/>
			<br />
			Patient ID: 
			<data src="caremanagementdb://Patient/@patientIdentifier"/>
			<br />
			Initial Diagnosis: 
			<data src="caremanagementdb://Problem[@code=95281009]/@problemValueOriginalText"/>
			<a
			  href="http://patient.parameter.monitor.link/a.php?patientID">Access to
			  EHR</a> <br />
			Implanted Device:
			<data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
			<data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
			<br />
			Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a href="http://link.to.care.management.db">Access
			  to previous Remote follow-up results</a> </p>

		      <p><br />
		      </p>
		    </td>
		  </tr>
		  <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      Alarms Detected: Atrial Fibrillation episode at a rate of 180 <br />
		      <a href="http://patient.parameter.monitor.link">Access to Report
			Exported</a> </td>
		  </tr>
		  <tr name="RecommendationBlock">
		    <td style="background-color:#eeeeee">
			    <p align="center"><b><font color="#880015">Recommendation and Next Step to follow </font></b> </p>
		      <p>Prescribe Aspirin 81 to 325 mg daily.</p>

		      <form onsubmit="return ValidateData();" action="null" method="post">
			<input type="submit" name="D5Choice" value="Continue" onclick="btnWhichButton=this"/>
		      </form>
		    </td>
		  </tr>
		</tbody>
	      </table>
	    </body>
	  </HTML>
	</Display>
	<NextStep ref="S7717E623-A53C-8D9A-EB13-51DF393DCA19"/>
      </RecommendationStep>
      <RecommendationStep ID="SBC3556B3-9A94-8DEF-F393-51D9559734D2" name="Prescription of Aspirin 81 to 325 mg daily or Anticoagulation (INR 2.0 to 3.0, target 2.5)">
	<Receiver ref="P3"/>
	<Urgency>2</Urgency>
	<Display>
	  <HTML>
	    <head/>
	    <body>

	      <table  cellspacing="10" style="background-color:#e1e1e1">
		<tbody>
		  <tr name="PatientBlock" id="PatientBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated automatically in the execution phase-->

		      <p align="center"><b>Brief Information about the patient </b></p>

		      <p>Patient Name: 
			<data src="caremanagementdb://Patient/@givenName"/>
			<data src="caremanagementdb://Patient/@secondName"/>
			<data src="caremanagementdb://Patient/@familyName"/>
			<br />
			Patient ID: 
			<data src="caremanagementdb://Patient/@patientIdentifier"/>
			<br />
			Initial Diagnosis: 
			<data src="caremanagementdb://Problem[@code=95281009]/@problemValueOriginalText"/>
			<a
			  href="http://patient.parameter.monitor.link/a.php?patientID">Access to
			  EHR</a> <br />
			Implanted Device:
			<data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
			<data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
			<br />
			Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a href="http://link.to.care.management.db">Access
			  to previous Remote follow-up results</a> </p>

		      <p><br />
		      </p>
		    </td>
		  </tr>
		  <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      Alarms Detected: Atrial Fibrillation episode at a rate of 180 <br />
		      <a href="http://patient.parameter.monitor.link">Access to Report
			Exported</a> </td>
		  </tr>
		  <tr name="RecommendationBlock">
		    <td style="background-color:#eeeeee">
			    <p align="center"><b><font color="#880015">Recommendation and Next Step to follow </font></b> </p>
		      <p>Prescribe Aspirin 81 to 325 mg daily or Anticoagulation (INR 2.0 to 3.0, target 2.5)..</p>

		      <form onsubmit="return ValidateData();" action="null" method="post">
			<input type="submit" name="D5Choice" value="Continue" onclick="btnWhichButton=this"/>
		      </form>
		    </td>
		  </tr>
		</tbody>
	      </table>
	    </body>
	  </HTML>
	</Display>
	<NextStep ref="S495D603B-F90F-BA9C-9DFF-51D9403B2B2A"/>
      </RecommendationStep>
      <RecommendationStep ID="SFBA02369-0409-3767-BB76-527EC1C76590" name="Prescription Oral Anticoagulation">
	<Receiver ref="P3"/>
	<Urgency>2</Urgency>
	<Display>
	  <HTML>
	    <head/>
	    <body>

	      <table  cellspacing="10" style="background-color:#e1e1e1">
		<tbody>
		  <tr name="PatientBlock" id="PatientBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated automatically in the execution phase-->

		      <p align="center"><b>Brief Information about the patient </b></p>

		      <p>Patient Name: 
			<data src="caremanagementdb://Patient/@givenName"/>
			<data src="caremanagementdb://Patient/@secondName"/>
			<data src="caremanagementdb://Patient/@familyName"/>
			<br />
			Patient ID: 
			<data src="caremanagementdb://Patient/@patientIdentifier"/>
			<br />
			Initial Diagnosis: 
			<data src="caremanagementdb://Problem[@code=95281009]/@problemValueOriginalText"/>
			<a
			  href="http://patient.parameter.monitor.link/a.php?patientID">Access to
			  EHR</a> <br />
			Implanted Device:
			<data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
			<data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
			<br />
			Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a href="http://link.to.care.management.db">Access
			  to previous Remote follow-up results</a> </p>

		      <p><br />
		      </p>
		    </td>
		  </tr>
		  <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      Alarms Detected: Atrial Fibrillation episode at a rate of 180 <br />
		      <a href="http://patient.parameter.monitor.link">Access to Report
			Exported</a> </td>
		  </tr>
		  <tr name="RecommendationBlock">
		    <td style="background-color:#eeeeee">
			    <p align="center"><b><font color="#880015">Recommendation and Next Step to follow </font></b> </p>
		      <p>Prescribe Oral Anticoagulation.</p>

		      <form onsubmit="return ValidateData();" action="null" method="post">
			<input type="submit" name="D5Choice" value="Continue" onclick="btnWhichButton=this"/>
		      </form>
		    </td>

		  </tr>
		</tbody>
	      </table>
	    </body>
	  </HTML>
	</Display>
	<NextStep ref="S7717E623-A53C-8D9A-EB13-51DF393DCA19"/>
      </RecommendationStep>
      <ConsultStep ID="S7717E623-A53C-8D9A-EB13-51DF393DCA19" name="Rate Control">
	<Display>
	  <HTML>
	    <head/>
	    <body>

	      <table  cellspacing="10" style="background-color:#e1e1e1">
		<tbody>
		  <tr name="PatientBlock" id="PatientBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated automatically in the execution phase-->

		      <p align="center"><b>Brief Information about the patient </b></p>

		      <p>Patient Name: 
			<data src="caremanagementdb://Patient/@givenName"/>
			<data src="caremanagementdb://Patient/@secondName"/>
			<data src="caremanagementdb://Patient/@familyName"/>
			<br />
			Patient ID: 
			<data src="caremanagementdb://Patient/@patientIdentifier"/>
			<br />
			Initial Diagnosis: 
			<data src="caremanagementdb://Problem[@code=95281009]/@problemValueOriginalText"/>
			<a
			  href="http://patient.parameter.monitor.link/a.php?patientID">Access to
			  EHR</a> <br />
			Implanted Device:
			<data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
			<data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
			<br />
			Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a href="http://link.to.care.management.db">Access
			  to previous Remote follow-up results</a> </p>

		      <p><br />
		      </p>
		    </td>
		  </tr>
		  <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      Alarms Detected: Atrial Fibrillation episode at a rate of 180 <br />
		      <a href="http://patient.parameter.monitor.link">Access to Report
			Exported</a> </td>
		  </tr>
		  <tr name="EGMBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		      <p align="center"><b>Brief Information about the EGM and detected
			  problems </b> </p>


		      <p align="center"> EGM: <a href="http://patient.parameter.monitor.link">Access to
			  Report Exported</a> <br /> </p>


		      <p><img width="312" height="190" id="Picture1"
			  src="caremanagementdb://Patient/Observation/@base64String"
			  alt="x.bmp" /></p>

		    </td>
		  </tr>
		  <tr name="ChoiceBlock">
		    <td style="background-color:#eeeeee">
			    <p align="center"><b><font color="#880015">Recommendation and Next Step to follow </font> </b></p>
		      <p>Please check AF normofrequent, AF bradycard and AF tachycardia conditions in the EGM and choose the suitable option</p>

		      <form onsubmit="return ValidateData();" action="null" method="post">
			<input type="submit" name="S15Choice" value="There is AF normofrequent!" onclick="btnWhichButton=this"/>
			<input type="submit" name="S15Choice" value="There is AF bradycard!" onclick="btnWhichButton=this"/>
			<input type="submit" name="S15Choice" value="There is AF tachycardia!" onclick="btnWhichButton=this"/>
			<input type="submit" name="S15Choice" value="There is neither of them!" onclick="btnWhichButton=this"/>
		      </form>
		    </td>
		  </tr>
		</tbody>
	      </table>
	    </body>
	  </HTML>
	</Display>
	<NextStep ref="S535B92E0-C873-2540-F3B2-51E5AEFF92B1" name="There is AF normfrequent!">
	  <EvaluationScript>function check(S7717E623A53C8D9AEB1351DF393DCA19Choice) { if(S7717E623A53C8D9AEB1351DF393DCA19Choice.getValue().getText() == "There is AF normofrequent!") return true; else return false; }</EvaluationScript>
	</NextStep>
	<NextStep ref="S18551BC2-2D1D-8D96-9D65-51E5B8BA1E2C" name="There is AF bradycard!">
	  <EvaluationScript>function check(S7717E623A53C8D9AEB1351DF393DCA19Choice) { if(S7717E623A53C8D9AEB1351DF393DCA19Choice.getValue().getText() == "There is AF bradycard!") return true; else return false; }</EvaluationScript>
	</NextStep>
	<NextStep ref="SFA5A26DD-3363-E7C9-DC36-51E5C7172FEA" name="There is AF tachycardia!">
	  <EvaluationScript>function check(S7717E623A53C8D9AEB1351DF393DCA19Choice) { if(S7717E623A53C8D9AEB1351DF393DCA19Choice.getValue().getText() == "There is AF tachycardia!") return true; else return false; }</EvaluationScript>
	</NextStep>
	<NextStep ref="S25D420B5-7720-0CD6-BB01-51E5D53917D9" name="There is neither of them!">
	  <EvaluationScript>function check(S7717E623A53C8D9AEB1351DF393DCA19Choice) { if(S7717E623A53C8D9AEB1351DF393DCA19Choice.getValue().getText() == "There is neither of them!") return true; else return false; }</EvaluationScript>
	</NextStep>
      </ConsultStep>
      <RecommendationStep ID="S535B92E0-C873-2540-F3B2-51E5AEFF92B1" name="Arrange Urgent follow-up/ Urgent remote follow-up/ Routine Follow-up">
	<Receiver ref="P3"/>
	<Urgency>2</Urgency>
	<Display>
	  <HTML>
	    <head/>
	    <body>

	      <table  cellspacing="10" style="background-color:#e1e1e1">
		<tbody>
		  <tr name="PatientBlock" id="PatientBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated automatically in the execution phase-->

		      <p align="center"><b>Brief Information about the patient </b></p>

		      <p>Patient Name: 
			<data src="caremanagementdb://Patient/@givenName"/>
			<data src="caremanagementdb://Patient/@secondName"/>
			<data src="caremanagementdb://Patient/@familyName"/>
			<br />
			Patient ID: 
			<data src="caremanagementdb://Patient/@patientIdentifier"/>
			<br />
			Initial Diagnosis: 
			<data src="caremanagementdb://Problem[@code=95281009]/@problemValueOriginalText"/>
			<a
			  href="http://patient.parameter.monitor.link/a.php?patientID">Access to
			  EHR</a> <br />
			Implanted Device:
			<data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
			<data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
			<br />
			Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a href="http://link.to.care.management.db">Access
			  to previous Remote follow-up results</a> </p>

		      <p><br />
		      </p>
		    </td>
		  </tr>
		  <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      Alarms Detected: Atrial Fibrillation episode at a rate of 180 <br />
		      <a href="http://patient.parameter.monitor.link">Access to Report
			Exported</a> </td>
		  </tr>
		  <tr name="RecommendationBlock">
		    <td style="background-color:#eeeeee">
			    <p align="center"><b><font color="#880015">Recommendation and Next Step to follow </font></b> </p>
		      <p>Arrange Urgent follow-up/ Urgent remote follow-up/ Routine Follow-up.</p>

		      <form onsubmit="return ValidateData();" action="null" method="post">
			<input type="submit" name="D5Choice" value="Continue" onclick="btnWhichButton=this"/>
		      </form>
		    </td>
		  </tr>
		</tbody>
	      </table>
	    </body>
	  </HTML>
	</Display>
	<NextStep ref="S25D420B5-7720-0CD6-BB01-51E5D53917D9"/>
      </RecommendationStep>
      <RecommendationStep ID="S18551BC2-2D1D-8D96-9D65-51E5B8BA1E2C" name="Consider immediate referral to clinic">
	<Receiver ref="P3"/>
	<Urgency>2</Urgency>
	<Display>
	  <HTML>
	    <head/>
	    <body>

	      <table  cellspacing="10" style="background-color:#e1e1e1">
		<tbody>
		  <tr name="PatientBlock" id="PatientBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated automatically in the execution phase-->

		      <p align="center"><b>Brief Information about the patient </b></p>

		      <p>Patient Name: 
			<data src="caremanagementdb://Patient/@givenName"/>
			<data src="caremanagementdb://Patient/@secondName"/>
			<data src="caremanagementdb://Patient/@familyName"/>
			<br />
			Patient ID: 
			<data src="caremanagementdb://Patient/@patientIdentifier"/>
			<br />
			Initial Diagnosis: 
			<data src="caremanagementdb://Problem[@code=95281009]/@problemValueOriginalText"/>
			<a
			  href="http://patient.parameter.monitor.link/a.php?patientID">Access to
			  EHR</a> <br />
			Implanted Device:
			<data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
			<data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
			<br />
			Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a href="http://link.to.care.management.db">Access
			  to previous Remote follow-up results</a> </p>

		      <p><br />
		      </p>
		    </td>
		  </tr>
		  <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      Alarms Detected: Atrial Fibrillation episode at a rate of 180 <br />
		      <a href="http://patient.parameter.monitor.link">Access to Report
			Exported</a> </td>
		  </tr>
		  <tr name="RecommendationBlock">
		    <td style="background-color:#eeeeee">
			    <p align="center"><b><font color="#880015">Recommendation and Next Step to follow </font></b> </p>
		      <p>Consider immediate referral to clinic.</p>

		      <form onsubmit="return ValidateData();" action="null" method="post">
			<input type="submit" name="D5Choice" value="Continue" onclick="btnWhichButton=this"/>
		      </form>
		    </td>
		  </tr>
		</tbody>
	      </table>
	    </body>
	  </HTML>
	</Display>
	<NextStep ref="S25D420B5-7720-0CD6-BB01-51E5D53917D9"/>
      </RecommendationStep>
      <RecommendationStep ID="SFA5A26DD-3363-E7C9-DC36-51E5C7172FEA" name="Consider immediate referral to clinic">
	<Receiver ref="P3"/>
	<Urgency>2</Urgency>
	<Display>
	  <HTML>
	    <head/>
	    <body>

	      <table  cellspacing="10" style="background-color:#e1e1e1">
		<tbody>
		  <tr name="PatientBlock" id="PatientBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated automatically in the execution phase-->

		      <p align="center"><b>Brief Information about the patient </b></p>

		      <p>Patient Name: 
			<data src="caremanagementdb://Patient/@givenName"/>
			<data src="caremanagementdb://Patient/@secondName"/>
			<data src="caremanagementdb://Patient/@familyName"/>
			<br />
			Patient ID: 
			<data src="caremanagementdb://Patient/@patientIdentifier"/>
			<br />
			Initial Diagnosis: 
			<data src="caremanagementdb://Problem[@code=95281009]/@problemValueOriginalText"/>
			<a
			  href="http://patient.parameter.monitor.link/a.php?patientID">Access to
			  EHR</a> <br />
			Implanted Device:
			<data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
			<data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
			<br />
			Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a href="http://link.to.care.management.db">Access
			  to previous Remote follow-up results</a> </p>

		      <p><br />
		      </p>
		    </td>
		  </tr>
		  <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      Alarms Detected: Atrial Fibrillation episode at a rate of 180 <br />
		      <a href="http://patient.parameter.monitor.link">Access to Report
			Exported</a> </td>
		  </tr>
		  <tr name="RecommendationBlock">
		    <td style="background-color:#eeeeee">
			    <p align="center"><b><font color="#880015">Recommendation and Next Step to follow </font></b> </p>
		      <p>Consider immediate referral to clinic.</p>

		      <form onsubmit="return ValidateData();" action="null" method="post">
			<input type="submit" name="D5Choice" value="Continue" onclick="btnWhichButton=this"/>
		      </form>
		    </td>
		  </tr>
		</tbody>
	      </table>
	    </body>	
	  </HTML>
	</Display>
	<NextStep ref="SAF512E7C-AAD9-D38C-97DE-51EAB122A932"/>
      </RecommendationStep>
      <ConsultStep ID="S25D420B5-7720-0CD6-BB01-51E5D53917D9" name="Evaluate Rhythm Control">
	<Display>
	  <HTML>
	    <head/>
	    <body>

	      <table  cellspacing="10" style="background-color:#e1e1e1">
		<tbody>
		  <tr name="PatientBlock" id="PatientBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated automatically in the execution phase-->

		      <p align="center"><b>Brief Information about the patient </b></p>

		      <p>Patient Name: 
			<data src="caremanagementdb://Patient/@givenName"/>
			<data src="caremanagementdb://Patient/@secondName"/>
			<data src="caremanagementdb://Patient/@familyName"/>
			<br />
			Patient ID: 
			<data src="caremanagementdb://Patient/@patientIdentifier"/>
			<br />
			Initial Diagnosis: 
			<data src="caremanagementdb://Problem[@code=95281009]/@problemValueOriginalText"/>
			<a
			  href="http://patient.parameter.monitor.link/a.php?patientID">Access to
			  EHR</a> <br />
			Implanted Device:
			<data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
			<data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
			<br />
			Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a href="http://link.to.care.management.db">Access
			  to previous Remote follow-up results</a> </p>

		      <p><br />
		      </p>
		    </td>
		  </tr>
		  <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      Alarms Detected: Atrial Fibrillation episode at a rate of 180 <br />
		      <a href="http://patient.parameter.monitor.link">Access to Report
			Exported</a> </td>
		  </tr>
		  <tr name="EGMBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		      <p align="center"><b>Brief Information about the EGM and detected
			  problems </b> </p>


		      <p align="center"> EGM: <a href="http://patient.parameter.monitor.link">Access to
			  Report Exported</a> <br /> </p>


		      <p><img width="312" height="190" id="Picture1"
			  src="caremanagementdb://Patient/Observation/@base64String"
			  alt="x.bmp" /></p>

		    </td>
		  </tr>
		  <tr name="ChoiceBlock">
		    <td style="background-color:#eeeeee">
			    <p align="center"><b><font color="#880015">Recommendation and Next Step to follow </font></b> </p>
		      <p>Please check whether there is a need for rhythm control.</p>

		      <form onsubmit="return ValidateData();" action="null" method="post">
			<input type="submit" name="S21Choice" value="Control rhythm!" onclick="btnWhichButton=this"/>
			<input type="submit" name="S21Choice" value="Do not control rhythm!" onclick="btnWhichButton=this"/>
		      </form>
		    </td>
		  </tr>
		</tbody>
	      </table>
	    </body>
	  </HTML>
	</Display>
	<NextStep ref="S0AC6B110-149E-C4D9-7EBA-51ED8CAD0A0D" name="Control rhythm!">
	  <EvaluationScript>function check(S25D420B577200CD6BB0151E5D53917D9Choice) { if(S25D420B577200CD6BB0151E5D53917D9Choice.getValue().getText() == "Control rhythm!") return true; else return false; }</EvaluationScript>
	</NextStep>
	<NextStep ref="S8590B661-27DB-989C-7C2C-51A555B00624" name="Do not control rhythm!">
	  <EvaluationScript>function check(S25D420B577200CD6BB0151E5D53917D9Choice) { if(S25D420B577200CD6BB0151E5D53917D9Choice.getValue().getText() == "Do not control rhythm!") return true; else return false; }</EvaluationScript>
	</NextStep>
      </ConsultStep>
      <ConsultStep ID="SAF512E7C-AAD9-D38C-97DE-51EAB122A932" name="Ask whether the patient has active lifestyle">
	<Variable name="Bathing" type="string">
	  <Concept code="C0562758" schemeID="UMLS"/>
	  <DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	  <DataSource code="C0033213" name="Problem" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var x="no"; var y=0; var names=list.toArray(); for(var i=0; i &lt; names.length;i++) { y=y+1; } if(y>0) { x="yes"; } return x; }</RefinementScript>
	</Variable>
	<Variable name="Shopping" type="string">
	  <Concept code="C0562758" schemeID="UMLS"/>
	  <DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	  <DataSource code="C0033213" name="Problem" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var x="no"; var y=0; var names=list.toArray(); for(var i=0; i &lt; names.length;i++) { y=y+1; } if(y>0) { x="yes"; } return x; }</RefinementScript>
	</Variable>
	<Variable name="ShoppingAssited" type="string">
	  <Concept code="C1290968" schemeID="UMLS"/>
	  <DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	  <DataSource code="C0033213" name="Problem" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var x="no"; var y=0; var names=list.toArray(); for(var i=0; i &lt; names.length;i++) { y=y+1; } if(y>0) { x="yes"; } return x; }</RefinementScript>
	</Variable>
	<Variable name="ClimbingStairs" type="string">
	  <Concept code="C1290942" schemeID="UMLS"/>
	  <DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	  <DataSource code="C0033213" name="Problem" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var x="no"; var y=0; var names=list.toArray(); for(var i=0; i &lt; names.length;i++) { y=y+1; } if(y>0) { x="yes"; } return x; }</RefinementScript>
	</Variable>
	<Variable name="DriveCar" type="string">
	  <Concept code="C0577356" schemeID="UMLS"/>
	  <DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	  <DataSource code="C0033213" name="Problem" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var x="no"; var y=0; var names=list.toArray(); for(var i=0; i &lt; names.length;i++) { y=y+1; } if(y>0) { x="yes"; } return x; }</RefinementScript>
	</Variable>
	<Variable name="GardeningDifficulty" type="string">
	  <Concept code="C0577468" schemeID="UMLS"/>
	  <DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	  <DataSource code="C0033213" name="Problem" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var x="no"; var y=0; var names=list.toArray(); for(var i=0; i &lt; names.length;i++) { y=y+1; } if(y>0) { x="yes"; } return x; }</RefinementScript>
	</Variable>
	<Variable name="Housework" type="string">
	  <Concept code="C1571726" schemeID="UMLS"/>
	  <DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	  <DataSource code="C0033213" name="Problem" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var x="no"; var y=0; var names=list.toArray(); for(var i=0; i &lt; names.length;i++) { y=y+1; } if(y>0) { x="yes"; } return x; }</RefinementScript>
	</Variable>
	<Display>
	  <HTML>
	    <head/>
	    <body>

	      <table  cellspacing="10" style="background-color:#e1e1e1">
		<tbody>
		  <tr name="PatientBlock" id="PatientBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated automatically in the execution phase-->

		      <p align="center"><b>Brief Information about the patient </b></p>

		      <p>Patient Name: <br />
			Patient ID: <br />
			Initial Diagnosis: <a
			  href="http://patient.parameter.monitor.link/a.php?patientID">Access to
			  EHR</a> <br />
			Implanted Device: <br />
			Last Follow-up Date: <a
			  href="http://link.to.care.management.db/">Access to previous Remote
			  follow-up results</a> </p>

		      <p><br />
		      </p>
		    </td>
		  </tr>
		  <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <br />
		      Alarms Detected: Atrial Fibrillation episode at a rate of 180 <br />
		      <a href="http://patient.parameter.monitor.link/">Access to Report
			Exported</a> </td>
		  </tr>
		  <tr name="PHRBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->
		      <p align="center"><b>Brief Information about the Daily Life Observations retrieved from PHR
		      </b> </p>

		      <table  width="100%">
			<tbody>

			  <tr>
			    <td>Daily Life Observations </td>
			    <td>Value</td>
			  </tr>
			  <tr>
			    <td>Ability to perform bathing activity?</td>
			    <td>
			      $Bathing
			      <a href="http://link.to.patient.parameter.monitor?section=ImagingResultcode=C0004002">Link to PHR</a>
			    </td>
			  </tr>
			  <tr>
			    <td>Does perform shopping activities?</td>
			    <td>
			      $Shopping
			      <a href="http://link.to.patient.parameter.monitor?section=ImagingResultcode=C0004002">Link to PHR</a>
			    </td>
			  </tr>
			  <tr>
			    <td>Shopping assisted?</td>
			    <td>
			      $ShoppingAssited
			      <a href="http://link.to.patient.parameter.monitor?section=ImagingResultcode=C0004002">Link to PHR</a>
			    </td>
			  </tr>
			  <tr>
			    <td>Climbing stairs?</td>
			    <td>
			      $ClimbingStairs
			      <a href="http://link.to.patient.parameter.monitor?section=ImagingResultcode=C0004002">Link to PHR</a>
			    </td>
			  </tr>
			  <tr>
			    <td>Does drive a car?</td>
			    <td>
			      $DriveCar
			      <a href="http://link.to.patient.parameter.monitor?section=ImagingResultcode=C0004002">Link to PHR</a>
			    </td>
			  </tr>
			  <tr>
			    <td>Difficulty performing gardening activities?</td>
			    <td>
			      $GardeningDifficulty
			      <a href="http://link.to.patient.parameter.monitor?section=ImagingResultcode=C0004002">Link to PHR</a>
			    </td>
			  </tr>
			  <tr>
			    <td>Doing housework?</td>
			    <td>
			      $Housework
			      <a href="http://link.to.patient.parameter.monitor?section=ImagingResultcode=C0004002">Link to PHR</a>
			    </td>
			  </tr>

			</tbody>
		      </table>
		    </td>
		  </tr>
		  <tr name="ChoiceBlock">
		    <td style="background-color:#eeeeee"><p align="center"><b><font color="#880015">Recommendation
					    and Next Step to follow </font></b> </p>
		      <p ID="DecisionParagraph">Please check whether patient has an active lifestyle.</p>

		     <form onsubmit="return ValidateData();" action="null" method="post">
			<input type="submit" name="S24Choice" value="Yes, patient has an active lifestyle!" onclick="btnWhichButton=this"/>
			<input type="submit" name="S24Choice" value="No, patient has not an active lifestyle!" onclick="btnWhichButton=this"/>
		      </form>
		    </td>
		  </tr>
		</tbody>
	      </table>
	    </body>
	  </HTML>
	</Display>
	<NextStep ref="S0E7C33B2-E297-4B4B-2260-5287AD9993C6" name="Yes, patient has an active lifestyle!">
	  <EvaluationScript>function check(SAF512E7CAAD9D38C97DE51EAB122A932Choice) { if(SAF512E7CAAD9D38C97DE51EAB122A932Choice.getValue().getText() == "Yes, patient has an active lifestyle!") return true; else return false; }</EvaluationScript>
	</NextStep>
	<NextStep ref="S8E157567-87E7-DE59-B4AE-5287B7077461" name="No, patient has not an active lifestyle!">
	  <EvaluationScript>function check(SAF512E7CAAD9D38C97DE51EAB122A932Choice) { if(SAF512E7CAAD9D38C97DE51EAB122A932Choice.getValue().getText() == "No, patient has not an active lifestyle!") return true; else return false; }</EvaluationScript>
	</NextStep>
      </ConsultStep>
      <ConsultStep ID="S0E7C33B2-E297-4B4B-2260-5287AD9993C6" name="Control associated diseases">
	<Variable name="Hypertension" type="boolean">
	  <Concept code="C0020538" name="Hypertensive Disease" schemeID="UMLS"/>
	  <DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	  <DataSource code="C0033213" name="Problem" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var x; var y=false; var names=list.toArray(); for(var i=0; i &lt; names.length;i++) { y=true; } return y; }</RefinementScript>
	</Variable>
	<Variable name="HeartFailure" type="boolean">
	  <Concept code="C0018802" name="Congestive heart failure" schemeID="UMLS"/>
	  <DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	  <DataSource code="C0033213" name="Problem" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var x; var y=false; var names=list.toArray(); for(var i=0; i &lt; names.length;i++) { y=true; } return y; }</RefinementScript>
	</Variable>
	<Variable name="COPD" type="boolean">
	  <Concept code="C0024117" name="Congestive heart failure" schemeID="UMLS"/>
	  <DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	  <DataSource code="C0033213" name="Problem" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var x; var y=false; var names=list.toArray(); for(var i=0; i &lt; names.length;i++) { y=true; } return y; }</RefinementScript>
	</Variable>
	<Display>
	  <HTML>
	    <head/>
	    <body>

	      <table  cellspacing="10" style="background-color:#e1e1e1">
		<tbody>
		  <tr name="PatientBlock" id="PatientBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated automatically in the execution phase-->

		      <p align="center"><b>Brief Information about the patient </b></p>

		      <p>Patient Name: <br />
			Patient ID: <br />
			Initial Diagnosis: <a
			  href="http://patient.parameter.monitor.link/a.php?patientID">Access to
			  EHR</a> <br />
			Implanted Device: <br />
			Last Follow-up Date: <a
			  href="http://link.to.care.management.db/">Access to previous Remote
			  follow-up results</a> </p>

		      <p><br />
		      </p>
		    </td>
		  </tr>
		  <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <br />
		      Alarms Detected: Atrial Fibrillation episode at a rate of 180 <br />
		      <a href="http://patient.parameter.monitor.link/">Access to Report
			Exported</a> </td>
		  </tr>
		  <tr name="EHRBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->
		      <p align="center"><b>Brief Information about the Patient History retrieved from EHR
		      </b> </p>

		      <table  width="100%">
			<tbody>
			  <tr>
			    <td><b>Status of associated Diseases</b></td>
			    <td><b>EHR values</b></td>
			  </tr>

			  <tr>
			    <td>Hypertension</td>
			    <td>
			      $Hypertension
			      <a href="http://link.to.patient.parameter.monitor?section=Problemcode=C0041582">Link to EHR</a>
			    </td>
			  </tr>
			  <tr>
			    <td>History of heart failure</td>
			    <td>
			      $HeartFailure
			      <a href="http://link.to.patient.parameter.monitor?section=Problemcode=C0948059">Link to EHR</a>
			    </td>
			  </tr>
			  <tr>
			    <td>Chronic Obstructive Pulmonary Disease</td>
			    <td>
			      $COPD
			      <a href="http://link.to.patient.parameter.monitor?section=Problemcode=C0023895">Link to EHR</a>
			    </td>
			  </tr>
			</tbody>
		      </table>
		    </td>
		  </tr>
		  <tr name="ChoiceBlock">
		    <td style="background-color:#eeeeee"><p align="center"><b><font color="#880015">Recommendation
					    and Next Step to follow </font> </b></p>
		      <p ID="DecisionParagraph">If patient has Hypertension prescribe Beta-blocker Diltiazem Verapamil Digitalis. <br/>
			If patient has heart failure prescribe Beta-blocker Digitialis. <br/>
			If patient has Chronic Obstructive Pulmonary Disease prescribe Diltiazem Verapamil Digitalis Beta1-selective blockers </p>

		      <form onsubmit="return ValidateData();" action="null" method="post">
			<input type="submit" name="S23Choice" value="Continue with rhythm control evaluation." onclick="btnWhichButton=this"/>
		      </form>
		    </td>
		  </tr>
		</tbody>
	      </table>
	    </body>
	  </HTML>
	</Display>
	<NextStep ref="S25D420B5-7720-0CD6-BB01-51E5D53917D9" name="Continue with rhythm control evaluation.">
	  <EvaluationScript>function check(S0E7C33B2E2974B4B22605287AD9993C6Choice) { if(S0E7C33B2E2974B4B22605287AD9993C6Choice.getValue().getText() == "Continue with rhythm control evaluation.") return true; else return false; }</EvaluationScript>
	</NextStep>
      </ConsultStep>		 
      <RecommendationStep ID="S8E157567-87E7-DE59-B4AE-5287B7077461" name="Prescribe Digitialis">
	<Receiver ref="P3"/>
	<Urgency>2</Urgency>
	<Display>
	  <HTML>
	    <head/>
	    <body>

	      <table  cellspacing="10" style="background-color:#e1e1e1">
		<tbody>
		  <tr name="PatientBlock" id="PatientBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated automatically in the execution phase-->

		      <p align="center"><b>Brief Information about the patient </b></p>

		      <p>Patient Name: 
			<data src="caremanagementdb://Patient/@givenName"/>
			<data src="caremanagementdb://Patient/@secondName"/>
			<data src="caremanagementdb://Patient/@familyName"/>
			<br />
			Patient ID: 
			<data src="caremanagementdb://Patient/@patientIdentifier"/>
			<br />
			Initial Diagnosis: 
			<data src="caremanagementdb://Problem[@code=95281009]/@problemValueOriginalText"/>
			<a
			  href="http://patient.parameter.monitor.link/a.php?patientID">Access to
			  EHR</a> <br />
			Implanted Device:
			<data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
			<data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
			<br />
			Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a href="http://link.to.care.management.db">Access
			  to previous Remote follow-up results</a> </p>

		      <p><br />
		      </p>
		    </td>
		  </tr>
		  <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      Alarms Detected: Atrial Fibrillation episode at a rate of 180 <br />
		      <a href="http://patient.parameter.monitor.link">Access to Report
			Exported</a> </td>
		  </tr>
		  <tr name="RecommendationBlock">
		    <td style="background-color:#eeeeee">
			    <p align="center"><b><font color="#880015">Recommendation and Next Step to follow </font> </b></p>
		      <p>Prescribe Digitialis.</p>

		      <form onsubmit="return ValidateData();" action="null" method="post">
			<input type="submit" name="D5Choice" value="Continue" onclick="btnWhichButton=this"/>
		      </form>
		    </td>
		  </tr>
		</tbody>
	      </table>
	    </body>
	  </HTML>
	</Display>
	<NextStep ref="S25D420B5-7720-0CD6-BB01-51E5D53917D9"/>
      </RecommendationStep>
      <ConsultStep ID="S0AC6B110-149E-C4D9-7EBA-51ED8CAD0A0D" name="Check AF Persistent">
	<Variable name="AFStatus" type="boolean">
	  <Concept code="739568" name="MDC_IDC_EPISODE_TYPE" schemeID="MDC_IDC"/>
	  <DataSource code="C0581396" name="Cardiac implant device" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var x; var y=false; var names=list.toArray(); for(x in names) { if(names[x] == "Epis_AT_AF") y=true; } return y; }</RefinementScript>
	</Variable>
	<Variable name="EpisodeDuration" type="integer">
	  <Concept code="739712" name="MDC_IDC_EPISODE_DURATION" schemeID="MDC_IDC"/>
	  <DataSource code="C0581396" name="Cardiac implant device" schemeID="UMLS"/>
	  <!--boyle ikinci bir source verince objeleri don ve onun uzerinden refine et-->
	  <DataSource code="MDC_IDC_STAT_EPISODE" name="Episode" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var y=0; var names = list.toArray(); for(var i = 0; i &lt; names.length;i++) {if(names[i].getType() == "Epis_AT_AF") y=names[i].getDuration(); } return y; }</RefinementScript>
	</Variable>
	<Display>
	  <HTML>
	    <head>						
	    </head>
	    <body>

	      <table  cellspacing="10" style="background-color:#e1e1e1">
		<tbody>
		  <tr name="PatientBlock" id="PatientBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated automatically in the execution phase-->

		      <p align="center"><b>Brief Information about the patient </b></p>

		      <p>Patient Name: 
			<data src="caremanagementdb://Patient/@givenName"/>
			<data src="caremanagementdb://Patient/@secondName"/>
			<data src="caremanagementdb://Patient/@familyName"/>
			<br />
			Patient ID: 
			<data src="caremanagementdb://Patient/@patientIdentifier"/>
			<br />
			Initial Diagnosis: 
			<data src="caremanagementdb://Problem[@code=95281009]/@problemValueOriginalText"/>
			<a
			  href="http://patient.parameter.monitor.link/a.php?patientID">Access to
			  EHR</a> <br />
			Implanted Device:
			<data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
			<data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
			<br />
			Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a href="http://link.to.care.management.db">Access
			  to previous Remote follow-up results</a> </p>

		      <p><br />
		      </p>
		    </td>
		  </tr>
		  <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      Alarms Detected: Atrial Fibrillation episode at a rate of 180 <br />
		      <a href="http://patient.parameter.monitor.link">Access to Report
			Exported</a> </td>
		  </tr>
		  <tr name="EGMBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		      <p align="center"><b>Brief Information about the EGM and detected
			  problems </b> </p>

		      <table  cellspacing="10" width="100%">
			<tbody>
			  <tr>
			    <td><!--The following HTML will be populated in the execution step-->
			      <p align="center"> EGM: <a href="http://patient.parameter.monitor.link">Access to
				  Report Exported</a> <br /> </p>


			      <p><img width="312" height="190" id="Picture1"
				  src="caremanagementdb://Patient/Observation/@base64String"
				  alt="x.bmp" /></p>
			    </td>
			    <td><!--The following HTML will be populated in the execution step-->

			      <p align="center">  Assesment by CIED <a href="http://patient.parameter.monitor.link">Access
				  to Report Exported</a> <br />
				<br/>

				<p align="left"><font color="#880015">Episode Duration = $EpisodeDuration seconds </font><br/>
				</p>
			      </p>
			    </td>
			  </tr>
			</tbody>
		      </table>
		    </td>
		  </tr>
		  <tr name="ChoiceBlock">
		    <td style="background-color:#eeeeee">
			    <p align="center"><b><font color="#880015">Recommendation and Next Step to follow </font> </b></p>
		      <p>Please choose the suitable option</p>

		      <form onsubmit="return ValidateData();" action="null" method="post">
			<input type="submit" name="D24Choice" value="AF Persistent" onclick="btnWhichButton=this"/>
			<input type="submit" name="D24Choice" value="Not AF Persistent" onclick="btnWhichButton=this"/>
		      </form>
		    </td>
		  </tr>
		</tbody>
	      </table>
	    </body>
	  </HTML>
	</Display>
	<NextStep ref="S7527C20B-672D-6EE4-D097-51EF813A89BE" name="AF Persistent">
	  <EvaluationScript>function check(S0AC6B110149EC4D97EBA51ED8CAD0A0DChoice) { if(S0AC6B110149EC4D97EBA51ED8CAD0A0DChoice.getValue().getText() == "AF Persistent") return true; else return false; }</EvaluationScript>
	</NextStep>
	<NextStep ref="SF2339BC0-86A9-6BB0-8708-51EF8B217841" name="Not AF Persistent">
	  <EvaluationScript>function check(S0AC6B110149EC4D97EBA51ED8CAD0A0DChoice) { if(S0AC6B110149EC4D97EBA51ED8CAD0A0DChoice.getValue().getText() == "Not AF Persistent") return true; else return false; }</EvaluationScript>
	</NextStep>
      </ConsultStep>
      <RecommendationStep ID="S7527C20B-672D-6EE4-D097-51EF813A89BE" name="Urgent in person follow-up">
	<Receiver ref="P3"/>
	<Urgency>2</Urgency>
	<Display>
	  <HTML>
	    <head/>
	    <body>

	      <table  cellspacing="10" style="background-color:#e1e1e1">
		<tbody>
		  <tr name="PatientBlock" id="PatientBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated automatically in the execution phase-->

		      <p align="center"><b>Brief Information about the patient </b></p>

		      <p>Patient Name: 
			<data src="caremanagementdb://Patient/@givenName"/>
			<data src="caremanagementdb://Patient/@secondName"/>
			<data src="caremanagementdb://Patient/@familyName"/>
			<br />
			Patient ID: 
			<data src="caremanagementdb://Patient/@patientIdentifier"/>
			<br />
			Initial Diagnosis: 
			<data src="caremanagementdb://Problem[@code=95281009]/@problemValueOriginalText"/>
			<a
			  href="http://patient.parameter.monitor.link/a.php?patientID">Access to
			  EHR</a> <br />
			Implanted Device:
			<data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
			<data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
			<br />
			Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a href="http://link.to.care.management.db">Access
			  to previous Remote follow-up results</a> </p>

		      <p><br />
		      </p>
		    </td>
		  </tr>
		  <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      Alarms Detected: Atrial Fibrillation episode at a rate of 180 <br />
		      <a href="http://patient.parameter.monitor.link">Access to Report
			Exported</a> </td>
		  </tr>
		  <tr name="RecommendationBlock">
		    <td style="background-color:#eeeeee">
			    <p align="center"><b><font color="#880015">Recommendation and Next Step to follow </font> </b></p>
		      <p>Call the patient and inform an follow up visit is arranged for the next day at 10 o'clock <br /> Before prescribing any anti arrhythmic drug, make sure that the patient is adequately anticoagulated before starting the drug.</p>

		      <form onsubmit="return ValidateData();" action="null" method="post">
			<input type="submit" name="D5Choice" value="Continue" onclick="btnWhichButton=this"/>
		    </form></td>
		  </tr>
		</tbody>
	      </table>
	    </body>
	  </HTML>
	</Display>
	<NextStep ref="SA0495556-7E20-2307-C36E-51F2B7EEFB0B"/>
      </RecommendationStep>
      <ConsultStep ID="SA0495556-7E20-2307-C36E-51F2B7EEFB0B" name="Check Episode Duration">
	<Variable name="AFStatus" type="boolean">
	  <Concept code="739568" name="MDC_IDC_EPISODE_TYPE" schemeID="MDC_IDC"/>
	  <DataSource code="C0581396" name="Cardiac implant device" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var x; var y=false; var names=list.toArray(); for(x in names) { if(names[x] == "Epis_AT_AF") y=true; } return y; }</RefinementScript>
	</Variable>
	<Variable name="EpisodeDuration" type="integer">
	  <Concept code="739712" name="MDC_IDC_EPISODE_DURATION" schemeID="MDC_IDC"/>
	  <DataSource code="C0581396" name="Cardiac implant device" schemeID="UMLS"/>
	  <!--boyle ikinci bir source verince objeleri don ve onun uzerinden refine et-->
	  <DataSource code="MDC_IDC_STAT_EPISODE" name="Episode" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var y=0; var names = list.toArray(); for(var i = 0; i &lt; names.length;i++) {if(names[i].getType() == "Epis_AT_AF") y=names[i].getDuration(); } return second2hour(y); }</RefinementScript>
	</Variable>
	<Display>
	  <HTML>
	    <head>						
	    </head>
	    <body>

	      <table  cellspacing="10" style="background-color:#e1e1e1">
		<tbody>
		  <tr name="PatientBlock" id="PatientBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated automatically in the execution phase-->

		      <p align="center"><b>Brief Information about the patient </b></p>

		      <p>Patient Name: 
			<data src="caremanagementdb://Patient/@givenName"/>
			<data src="caremanagementdb://Patient/@secondName"/>
			<data src="caremanagementdb://Patient/@familyName"/>
			<br />
			Patient ID: 
			<data src="caremanagementdb://Patient/@patientIdentifier"/>
			<br />
			Initial Diagnosis: 
			<data src="caremanagementdb://Problem[@code=95281009]/@problemValueOriginalText"/>
			<a
			  href="http://patient.parameter.monitor.link/a.php?patientID">Access to
			  EHR</a> <br />
			Implanted Device:
			<data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
			<data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
			<br />
			Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a href="http://link.to.care.management.db">Access
			  to previous Remote follow-up results</a> </p>

		      <p><br />
		      </p>
		    </td>
		  </tr>
		  <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      Alarms Detected: Atrial Fibrillation episode at a rate of 180 <br />
		      <a href="http://patient.parameter.monitor.link">Access to Report
			Exported</a> </td>
		  </tr>
		  <tr name="EGMBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		      <p align="center"><b>Brief Information about the EGM and detected
			  problems </b> </p>

		      <table  cellspacing="10" width="100%">
			<tbody>
			  <tr>
			    <td><!--The following HTML will be populated in the execution step-->
			      <p align="center"> EGM: <a href="http://patient.parameter.monitor.link">Access to
				  Report Exported</a> <br /> </p>


			      <p><img width="312" height="190" id="Picture1"
				  src="caremanagementdb://Patient/Observation/@base64String"
				  alt="x.bmp" /></p>
			    </td>
			    <td><!--The following HTML will be populated in the execution step-->

			      <p align="center">  Assesment by CIED <a href="http://patient.parameter.monitor.link">Access
				  to Report Exported</a> <br />
				<br/>

				<p align="left"><font color="#880015">Episode Duration = $EpisodeDuration hours</font><br/>
				</p>
			      </p>
			    </td>
			  </tr>
			</tbody>
		      </table>
		    </td>
		  </tr>
		  <tr name="ChoiceBlock">
		    <td style="background-color:#eeeeee">
			    <p align="center"><b><font color="#880015">Recommendation and Next Step to follow </font></b> </p>
		      <p>Please choose the suitable option</p>

		      <form onsubmit="return ValidateData();" action="null" method="post">
			<input type="submit" name="D23Choice" value="EpisodeDuration greater than 24 hours" onclick="btnWhichButton=this"/>
			<input type="submit" name="D23Choice" value="EpisodeDuration less than 24 hours" onclick="btnWhichButton=this"/>
		      </form>
		    </td>
		  </tr>
		</tbody>
	      </table>
	    </body>
	  </HTML>
	</Display>
	<NextStep ref="S5013EF2A-1573-578B-4604-51F43A64E97B" name="EpisodeDuration greater than 24 hours">
	  <EvaluationScript>function check(SA04955567E202307C36E51F2B7EEFB0BChoice) { if(SA04955567E202307C36E51F2B7EEFB0BChoice.getValue().getText() == "EpisodeDuration greater than 24 hours") return true; else return false; }</EvaluationScript>
	</NextStep>
	<NextStep ref="SAEC83CDC-9213-7A45-FB14-51F443747125" name="EpisodeDuration less than 24 hours">
	  <EvaluationScript>function check(SA04955567E202307C36E51F2B7EEFB0BChoice) { if(SA04955567E202307C36E51F2B7EEFB0BChoice.getValue().getText() == "EpisodeDuration less than 24 hours") return true; else return false; }</EvaluationScript>
	</NextStep>
      </ConsultStep>
      <ConsultStep ID="SAEC83CDC-9213-7A45-FB14-51F443747125" name="Check INR Determination Exist">
	<Variable name="PT" type="float">
	  <Concept code="C0033707" schemeID="UMLS"/>
	  <DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	  <DataSource code="C1254595" name="ImagingResult" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var y=0; var names=list.toArray();	for(var i=0; i &lt; names.length;i++) { y=names[i].getLabResultValue(); } return y; }</RefinementScript>
	</Variable>
	<Display>
	  <HTML>
	    <head>						
	    </head>
	    <body>

	      <table  cellspacing="10" style="background-color:#e1e1e1">
		<tbody>
		  <tr name="PatientBlock" id="PatientBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated automatically in the execution phase-->

		      <p align="center"><b>Brief Information about the patient </b></p>

		      <p>Patient Name: 
			<data src="caremanagementdb://Patient/@givenName"/>
			<data src="caremanagementdb://Patient/@secondName"/>
			<data src="caremanagementdb://Patient/@familyName"/>
			<br />
			Patient ID: 
			<data src="caremanagementdb://Patient/@patientIdentifier"/>
			<br />
			Initial Diagnosis: 
			<data src="caremanagementdb://Problem[@code=95281009]/@problemValueOriginalText"/>
			<a
			  href="http://patient.parameter.monitor.link/a.php?patientID">Access to
			  EHR</a> <br />
			Implanted Device:
			<data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
			<data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
			<br />
			Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a href="http://link.to.care.management.db">Access
			  to previous Remote follow-up results</a> </p>

		      <p><br />
		      </p>
		    </td>
		  </tr>
		  <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      Alarms Detected: Atrial Fibrillation episode at a rate of 180 <br />
		      <a href="http://patient.parameter.monitor.link">Access to Report
			Exported</a> </td>
		  </tr>
		  <tr name="RecommendationBlock">
		    <td style="background-color:#eeeeee">
			    <p align="center"><b><font color="#880015">Recommendation and Next Step to follow </font></b> </p>
		      <p>PT = $PT <br/> Please confirm if a recent INR test exists:</p>

		      <form onsubmit="return ValidateData();" action="null" method="post">
			<input type="submit" name="D25Choice" value="INR Determination exists" onclick="btnWhichButton=this"/>
			<input type="submit" name="D25Choice" value="INR Determination does not exist" onclick="btnWhichButton=this"/>
		    </form></td>
		  </tr>
		</tbody>
	      </table>
	    </body>
	  </HTML>
	</Display>				
	<NextStep ref="S8451B84D-8310-1F73-E378-51FB2586A84B" name="INR Determination exists">
	  <EvaluationScript>function check(SAEC83CDC92137A45FB1451F443747125Choice) { if(SAEC83CDC92137A45FB1451F443747125Choice.getValue().getText() == "INR Determination exists") return true; else return false; }</EvaluationScript>
	</NextStep>
	<NextStep ref="S34EA89AF-DE23-AD09-F1B6-51FB310499BA" name="INR Determination does not exist">
	  <EvaluationScript>function check(SAEC83CDC92137A45FB1451F443747125Choice) { if(SAEC83CDC92137A45FB1451F443747125Choice.getValue().getText() == "INR Determination does not exist") return true; else return false; }</EvaluationScript>
	</NextStep>
      </ConsultStep>		
      <RecommendationStep ID="S34EA89AF-DE23-AD09-F1B6-51FB310499BA" name="Determine new urgent INR determination.">
	<Receiver ref="P3"/>
	<Urgency>2</Urgency>
	<Display>
	  <HTML>
	    <head/>
	    <body>

	      <table  cellspacing="10" style="background-color:#e1e1e1">
		<tbody>
		  <tr name="PatientBlock" id="PatientBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated automatically in the execution phase-->

		      <p align="center"><b>Brief Information about the patient </b></p>

		      <p>Patient Name: 
			<data src="caremanagementdb://Patient/@givenName"/>
			<data src="caremanagementdb://Patient/@secondName"/>
			<data src="caremanagementdb://Patient/@familyName"/>
			<br />
			Patient ID: 
			<data src="caremanagementdb://Patient/@patientIdentifier"/>
			<br />
			Initial Diagnosis: 
			<data src="caremanagementdb://Problem[@code=95281009]/@problemValueOriginalText"/>
			<a
			  href="http://patient.parameter.monitor.link/a.php?patientID">Access to
			  EHR</a> <br />
			Implanted Device:
			<data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
			<data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
			<br />
			Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a href="http://link.to.care.management.db">Access
			  to previous Remote follow-up results</a> </p>

		      <p><br />
		      </p>
		    </td>
		  </tr>
		  <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      Alarms Detected: Atrial Fibrillation episode at a rate of 180 <br />
		      <a href="http://patient.parameter.monitor.link">Access to Report
			Exported</a> </td>
		  </tr>
		  <tr name="RecommendationBlock">
		    <td style="background-color:#eeeeee">
			    <p align="center"><b><font color="#880015">Recommendation and Next Step to follow </font> </b></p>
		      <p>Urgent follow-up/ Urgent remote follow-up/ Routine Follow-up.</p>

		      <form onsubmit="return ValidateData();" action="null" method="post">
			<input type="submit" name="D5Choice" value="Continue" onclick="btnWhichButton=this"/>
		    </form></td>
		  </tr>
		</tbody>
	      </table>
	    </body>
	  </HTML>
	</Display>
	<NextStep ref="SC6BE01A7-3CEE-1659-FF9C-52040C6FA071"/>
      </RecommendationStep>
	  <WaitStep ID="SC6BE01A7-3CEE-1659-FF9C-52040C6FA071" name="Wait INR determination">
		<Event>
		   <DataSource code="C1254595" name="ImagingResult" schemeID="UMLS"/>
		   <DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
		</Event>
		<NextStep ref="S8451B84D-8310-1F73-E378-51FB2586A84B"/>
	  </WaitStep>
      <ConsultStep ID="S8451B84D-8310-1F73-E378-51FB2586A84B" name="Check INR Level">
	<Variable name="INR" type="float">
	  <Concept code="C0525032" schemeID="UMLS"/>
	  <DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	  <DataSource code="C1254595" name="ImagingResult" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var y=0; var names=list.toArray();	for(var i=0; i &lt; names.length;i++) { y=names[i].getLabResultValue(); } return y; }</RefinementScript>
	</Variable>
	<Display>
	  <HTML>
	    <head>						
	    </head>
	    <body>

	      <table  cellspacing="10" style="background-color:#e1e1e1">
		<tbody>
		  <tr name="PatientBlock" id="PatientBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated automatically in the execution phase-->

		      <p align="center"><b>Brief Information about the patient </b></p>

		      <p>Patient Name: 
			<data src="caremanagementdb://Patient/@givenName"/>
			<data src="caremanagementdb://Patient/@secondName"/>
			<data src="caremanagementdb://Patient/@familyName"/>
			<br />
			Patient ID: 
			<data src="caremanagementdb://Patient/@patientIdentifier"/>
			<br />
			Initial Diagnosis: 
			<data src="caremanagementdb://Problem[@code=95281009]/@problemValueOriginalText"/>
			<a
			  href="http://patient.parameter.monitor.link/a.php?patientID">Access to
			  EHR</a> <br />
			Implanted Device:
			<data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
			<data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
			<br />
			Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a href="http://link.to.care.management.db">Access
			  to previous Remote follow-up results</a> </p>

		      <p><br />
		      </p>
		    </td>
		  </tr>
		  <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      Alarms Detected: Atrial Fibrillation episode at a rate of 180 <br />
		      <a href="http://patient.parameter.monitor.link">Access to Report
			Exported</a> </td>
		  </tr>
		  <tr name="RecommendationBlock">
		    <td style="background-color:#eeeeee">
			    <p align="center"><b><font color="#880015">Recommendation and Next Step to follow </font> </b></p>
			    <p>According to recent lab results: <font color="#880015"> INR = $INR </font>, please select the suitable option:</p>

		      <form onsubmit="return ValidateData();" action="null" method="post">
			<input type="submit" name="D27Choice" value="INR equal or greater than 2" onclick="btnWhichButton=this"/>
			<input type="submit" name="D27Choice" value="INR less than 2" onclick="btnWhichButton=this"/>
		    </form></td>
		  </tr>
		</tbody>
	      </table>
	    </body>	
	  </HTML>
	</Display>
	<NextStep ref="SEC77F5A9-62DD-B63C-79F3-51FEBEB74166" name="INR equal or greater than 2">
	  <EvaluationScript>function check(S8451B84D83101F73E37851FB2586A84BChoice) { if(S8451B84D83101F73E37851FB2586A84BChoice.getValue().getText() == "INR equal or greater than 2") return true; else return false; }</EvaluationScript>
	</NextStep>
	<NextStep ref="S8590B661-27DB-989C-7C2C-51A555B00624" name="INR less than 2">
	  <EvaluationScript>function check(S8451B84D83101F73E37851FB2586A84BChoice) { if(S8451B84D83101F73E37851FB2586A84BChoice.getValue().getText() == "INR less than 2") return true; else return false; }</EvaluationScript>
	</NextStep>
      </ConsultStep>
      <RecommendationStep ID="SEC77F5A9-62DD-B63C-79F3-51FEBEB74166" name="Evaluate Cardioversion">
	<Receiver ref="P3"/>
	<Urgency>2</Urgency>
	<Display>
	  <HTML>
	    <head/>
	    <body>

	      <table  cellspacing="10" style="background-color:#e1e1e1">
		<tbody>
		  <tr name="PatientBlock" id="PatientBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated automatically in the execution phase-->

		      <p align="center"><b>Brief Information about the patient </b></p>

		      <p>Patient Name: 
			<data src="caremanagementdb://Patient/@givenName"/>
			<data src="caremanagementdb://Patient/@secondName"/>
			<data src="caremanagementdb://Patient/@familyName"/>
			<br />
			Patient ID: 
			<data src="caremanagementdb://Patient/@patientIdentifier"/>
			<br />
			Initial Diagnosis: 
			<data src="caremanagementdb://Problem[@code=95281009]/@problemValueOriginalText"/>
			<a
			  href="http://patient.parameter.monitor.link/a.php?patientID">Access to
			  EHR</a> <br />
			Implanted Device:
			<data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
			<data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
			<br />
			Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a href="http://link.to.care.management.db">Access
			  to previous Remote follow-up results</a> </p>

		      <p><br />
		      </p>
		    </td>
		  </tr>
		  <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      Alarms Detected: Atrial Fibrillation episode at a rate of 180 <br />
		      <a href="http://patient.parameter.monitor.link">Access to Report
			Exported</a> </td>
		  </tr>
		  <tr name="RecommendationBlock">
		    <td style="background-color:#eeeeee">
			    <p align="center"><b><font color="#880015">Recommendation and Next Step to follow </font></b> </p>
		      <p>Evaluate Cardioversion</p>

		      <form onsubmit="return ValidateData();" action="null" method="post">
			<input type="submit" name="D5Choice" value="Continue" onclick="btnWhichButton=this"/>
		    </form></td>
		  </tr>
		</tbody>
	      </table>
	    </body>
	  </HTML>
	</Display>
	<NextStep ref="S5013EF2A-1573-578B-4604-51F43A64E97B"/>
      </RecommendationStep>
      <ConsultStep ID="SF2339BC0-86A9-6BB0-8708-51EF8B217841" name="Check SR">
	<Display>
	  <HTML>
	    <head/>
	    <body>

	      <table  cellspacing="10" style="background-color:#e1e1e1">
		<tbody>
		  <tr name="PatientBlock" id="PatientBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated automatically in the execution phase-->

		      <p align="center"><b>Brief Information about the patient </b></p>

		      <p>Patient Name: 
			<data src="caremanagementdb://Patient/@givenName"/>
			<data src="caremanagementdb://Patient/@secondName"/>
			<data src="caremanagementdb://Patient/@familyName"/>
			<br />
			Patient ID: 
			<data src="caremanagementdb://Patient/@patientIdentifier"/>
			<br />
			Initial Diagnosis: 
			<data src="caremanagementdb://Problem[@code=95281009]/@problemValueOriginalText"/>
			<a
			  href="http://patient.parameter.monitor.link/a.php?patientID">Access to
			  EHR</a> <br />
			Implanted Device:
			<data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
			<data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
			<br />
			Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a href="http://link.to.care.management.db">Access
			  to previous Remote follow-up results</a> </p>

		      <p><br />
		      </p>
		    </td>
		  </tr>
		  <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      Alarms Detected: Atrial Fibrillation episode at a rate of 180 <br />
		      <a href="http://patient.parameter.monitor.link">Access to Report
			Exported</a> </td>
		  </tr>
		  <tr name="EGMBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		      <p align="center"><b>Brief Information about the EGM and detected
			  problems </b> </p>


		      <p align="center"> EGM: <a href="http://patient.parameter.monitor.link">Access to
			  Report Exported</a> <br /> </p>


		      <p><img width="312" height="190" id="Picture1"
			  src="caremanagementdb://Patient/Observation/@base64String"
			  alt="x.bmp" /></p>

		    </td>
		  </tr>
		  <tr name="ChoiceBlock">
		    <td style="background-color:#eeeeee">
			    <p align="center"><b><font color="#880015">Recommendation and Next Step to follow </font></b> </p>
		      <p>Please check the EGM to decide whether there is SR situation.</p>

		      <form onsubmit="return ValidateData();" action="null" method="post">
			<input type="submit" name="S26Choice" value="Yes, there is!" onclick="btnWhichButton=this"/>
			<input type="submit" name="S26Choice" value="No, there is not!" onclick="btnWhichButton=this"/>
		      </form>
		    </td>
		  </tr>
		</tbody>
	      </table>
	    </body>
	  </HTML>
	</Display>
	<NextStep ref="S4D4FCF87-E29C-5393-EF67-5207A6FDA8B7" name="Yes, there is!">
	  <EvaluationScript>function check(SF2339BC086A96BB0870851EF8B217841Choice) { if(SF2339BC086A96BB0870851EF8B217841Choice.getValue().getText() == "Yes, there is!") return true; else return false; }</EvaluationScript>
	</NextStep>
	<NextStep ref="S8590B661-27DB-989C-7C2C-51A555B00624" name="No, there is not!">
	  <EvaluationScript>function check(SF2339BC086A96BB0870851EF8B217841Choice) { if(SF2339BC086A96BB0870851EF8B217841Choice.getValue().getText() == "No, there is not!") return true; else return false; }</EvaluationScript>
	</NextStep>
      </ConsultStep>
      <RecommendationStep ID="S4D4FCF87-E29C-5393-EF67-5207A6FDA8B7" name="Urgent follow-up/ Urgent remote follow-up/ Routine Follow-up">
	<Receiver ref="P3"/>
	<Urgency>2</Urgency>
	<Display>
	  <HTML>
	    <head/>
	    <body>

	      <table  cellspacing="10" style="background-color:#e1e1e1">
		<tbody>
		  <tr name="PatientBlock" id="PatientBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated automatically in the execution phase-->

		      <p align="center"><b>Brief Information about the patient </b></p>

		      <p>Patient Name: 
			<data src="caremanagementdb://Patient/@givenName"/>
			<data src="caremanagementdb://Patient/@secondName"/>
			<data src="caremanagementdb://Patient/@familyName"/>
			<br />
			Patient ID: 
			<data src="caremanagementdb://Patient/@patientIdentifier"/>
			<br />
			Initial Diagnosis: 
			<data src="caremanagementdb://Problem[@code=95281009]/@problemValueOriginalText"/>
			<a
			  href="http://patient.parameter.monitor.link/a.php?patientID">Access to
			  EHR</a> <br />
			Implanted Device:
			<data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
			<data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
			<br />
			Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a href="http://link.to.care.management.db">Access
			  to previous Remote follow-up results</a> </p>

		      <p><br />
		      </p>
		    </td>
		  </tr>
		  <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      Alarms Detected: Atrial Fibrillation episode at a rate of 180 <br />
		      <a href="http://patient.parameter.monitor.link">Access to Report
			Exported</a> </td>
		  </tr>
		  <tr name="RecommendationBlock">
		    <td style="background-color:#eeeeee">
			    <p align="center"><b><font color="#880015">Recommendation and Next Step to follow </font></b> </p>
		      <p>Urgent follow-up/ Urgent remote follow-up/ Routine Follow-up.</p>

		      <form onsubmit="return ValidateData();" action="null" method="post">
			<input type="submit" name="D5Choice" value="Continue" onclick="btnWhichButton=this"/>
		    </form></td>
		  </tr>
		</tbody>
	      </table>
	    </body>
	  </HTML>
	</Display>
	<NextStep ref="S9BC5CE3B-471A-ED25-179F-520A734600A1"/>
      </RecommendationStep>
      <ConsultStep ID="S9BC5CE3B-471A-ED25-179F-520A734600A1" name="Check if there is at least one more episode in that week">
	<Variable name="AFStatus" type="boolean">
	  <Concept code="739568" name="MDC_IDC_EPISODE_TYPE" schemeID="MDC_IDC"/>
	  <DataSource code="C0581396" name="Cardiac implant device" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var x; var y=false; var names=list.toArray(); for(var i=0; i &lt; names.length;i++) { if(names[i] == "Epis_AT_AF") y=true; } return y; }</RefinementScript>
	</Variable>
	<Variable name="EpisodeStart" type="date">
	  <Concept code="738017" name="MDC_IDC_STAT_EPISODE_RECENT_COUNT_DTM_START" schemeID="MDC_IDC"/>
	  <DataSource code="C0581396" name="Cardiac implant device" schemeID="UMLS"/>
	  <!--boyle ikinci bir source verince objeleri don ve onun uzerinden refine et-->
	  <DataSource code="MDC_IDC_STAT_EPISODE" name="Episode" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var y=0; var names = list.toArray(); for(var i = 0; i &lt; names.length;i++) {if(names[i].getType() == "Epis_AT_AF") y=names[i].getRecent_count_dtm_start(); } return refineDate(y); }</RefinementScript>
	</Variable>
	<Variable name="EpisodeEnd" type="date">
	  <Concept code="738018" name="MDC_IDC_STAT_EPISODE_RECENT_COUNT_DTM_END" schemeID="MDC_IDC"/>
	  <DataSource code="C0581396" name="Cardiac implant device" schemeID="UMLS"/>
	  <!--boyle ikinci bir source verince objeleri don ve onun uzerinden refine et-->
	  <DataSource code="MDC_IDC_STAT_EPISODE" name="Episode" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var y=0; var names = list.toArray(); for(var i = 0; i &lt; names.length;i++) {if(names[i].getType() == "Epis_AT_AF") y=names[i].getRecent_count_dtm_end(); } return refineDate(y); }</RefinementScript>
	</Variable>
	<Display>
	  <HTML>
	    <head>						
	    </head>
	    <body>

	      <table  cellspacing="10" style="background-color:#e1e1e1">
		<tbody>
		  <tr name="PatientBlock" id="PatientBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated automatically in the execution phase-->

		      <p align="center"><b>Brief Information about the patient </b></p>

		      <p>Patient Name: 
			<data src="caremanagementdb://Patient/@givenName"/>
			<data src="caremanagementdb://Patient/@secondName"/>
			<data src="caremanagementdb://Patient/@familyName"/>
			<br />
			Patient ID: 
			<data src="caremanagementdb://Patient/@patientIdentifier"/>
			<br />
			Initial Diagnosis: 
			<data src="caremanagementdb://Problem[@code=95281009]/@problemValueOriginalText"/>
			<a
			  href="http://patient.parameter.monitor.link/a.php?patientID">Access to
			  EHR</a> <br />
			Implanted Device:
			<data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
			<data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
			<br />
			Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a href="http://link.to.care.management.db">Access
			  to previous Remote follow-up results</a> </p>

		      <p><br />
		      </p>
		    </td>
		  </tr>
		  <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      Alarms Detected: Atrial Fibrillation episode at a rate of 180 <br />
		      <a href="http://patient.parameter.monitor.link">Access to Report
			Exported</a> </td>
		  </tr>
		  <tr name="EGMBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		      <p align="center"><b>Brief Information about the EGM and detected
			  problems </b> </p>

		      <table  cellspacing="10" width="100%">
			<tbody>
			  <tr>
			    <td><!--The following HTML will be populated in the execution step-->
			      <p align="center"> EGM: <a href="http://patient.parameter.monitor.link">Access to
				  Report Exported</a> <br /> </p>


			      <p><img width="312" height="190" id="Picture1"
				  src="caremanagementdb://Patient/Observation/@base64String"
				  alt="x.bmp" /></p>
			    </td>
			    <td><!--The following HTML will be populated in the execution step-->

			      <p align="center">  Assesment by CIED <a href="http://patient.parameter.monitor.link">Access
				  to Report Exported</a> <br />
				<br/>

				<p align="left">Episode Start = $EpisodeStart<br/>
				  Episode End = $EpisodeEnd<br/>
				</p>
			      </p>
			    </td>
			  </tr>
			</tbody>
		      </table>
		    </td>
		  </tr>
		  <tr name="ChoiceBlock">
		    <td style="background-color:#eeeeee">
			    <p align="center"><b><font color="#880015">Recommendation and Next Step to follow </font></b> </p>
		      <p>Please choose the suitable option</p>

		      <form onsubmit="return ValidateData();" action="null" method="post">
			<input type="submit" name="D26Choice" value="There is another episode" onclick="btnWhichButton=this"/>
			<input type="submit" name="D26Choice" value="There is no other episodes" onclick="btnWhichButton=this"/>
		      </form>
		    </td>
		  </tr>
		</tbody>
	      </table>
	    </body>
	  </HTML>
	</Display>
	<NextStep ref="S3CA05936-B606-0352-E9F6-520BD2F87B4A" name="There is another episode">
	  <EvaluationScript>function check(S9BC5CE3B471AED25179F520A734600A1Choice) { if(S9BC5CE3B471AED25179F520A734600A1Choice.getValue().getText() == "There is another episode") return true; else return false; }</EvaluationScript>
	</NextStep>
	<NextStep ref="S8590B661-27DB-989C-7C2C-51A555B00624" name="There is not any other episodes">
	  <EvaluationScript>function check(S9BC5CE3B471AED25179F520A734600A1Choice) { if(S9BC5CE3B471AED25179F520A734600A1Choice.getValue().getText() == "There is not any other episodes") return true; else return false; }</EvaluationScript>
	</NextStep>
      </ConsultStep>
      <ConsultStep ID="S5013EF2A-1573-578B-4604-51F43A64E97B" name="Check the EHR for history of Heart Failure, Hypertension, Substantial LVH, Coronary artery disease, and heart failure">
	<Variable name="AFStatus" type="boolean">
	  <Concept code="739568" name="MDC_IDC_EPISODE_TYPE" schemeID="MDC_IDC"/>
	  <DataSource code="C0581396" name="Cardiac implant device" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var x; var y=false; var names = list.toArray(); for(x in names) { if(names[x] == "Epis_AT_AF") y=true; } return y; }</RefinementScript>
	</Variable>
	<Variable name="EpisodeDuration" type="integer">
	  <Concept code="739712" name="MDC_IDC_EPISODE_DURATION" schemeID="MDC_IDC"/>
	  <DataSource code="C0581396" name="Cardiac implant device" schemeID="UMLS"/>
	  <!--boyle ikinci bir source verince objeleri don ve onun uzerinden refine et-->
	  <DataSource code="MDC_IDC_STAT_EPISODE" name="Episode" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var y=0; var names = list.toArray(); for(var i = 0; i &lt; names.length;i++) {if(names[i].getType() == "Epis_AT_AF") y=names[i].getDuration(); } return second2day(y); }</RefinementScript>
	</Variable>
	<Display>
	  <HTML>
	    <head>						
	    </head>
	    <body>

	      <table  cellspacing="10" style="background-color:#e1e1e1">
		<tbody>
		  <tr name="PatientBlock" id="PatientBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated automatically in the execution phase-->

		      <p align="center"><b>Brief Information about the patient </b></p>

		      <p>Patient Name: 
			<data src="caremanagementdb://Patient/@givenName"/>
			<data src="caremanagementdb://Patient/@secondName"/>
			<data src="caremanagementdb://Patient/@familyName"/>
			<br />
			Patient ID: 
			<data src="caremanagementdb://Patient/@patientIdentifier"/>
			<br />
			Initial Diagnosis: 
			<data src="caremanagementdb://Problem[@code=95281009]/@problemValueOriginalText"/>
			<a
			  href="http://patient.parameter.monitor.link/a.php?patientID">Access to
			  EHR</a> <br />
			Implanted Device:
			<data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
			<data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
			<br />
			Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a href="http://link.to.care.management.db">Access
			  to previous Remote follow-up results</a> </p>

		      <p><br />
		      </p>
		    </td>
		  </tr>
		  <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      Alarms Detected: Atrial Fibrillation episode at a rate of 180 <br />
		      <a href="http://patient.parameter.monitor.link">Access to Report
			Exported</a> </td>
		  </tr>
		  <tr name="EGMBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		      <p align="center"><b>Brief Information about the EGM and detected
			  problems </b> </p>

		      <table  cellspacing="10" width="100%">
			<tbody>
			  <tr>
			    <td><!--The following HTML will be populated in the execution step-->
			      <p align="center"> EGM: <a href="http://patient.parameter.monitor.link">Access to
				  Report Exported</a> <br /> </p>


			      <p><img width="312" height="190" id="Picture1"
				  src="caremanagementdb://Patient/Observation/@base64String"
				  alt="x.bmp" /></p>
			    </td>
			    <td><!--The following HTML will be populated in the execution step-->

			      <p align="center">  Assesment by CIED <a href="http://patient.parameter.monitor.link">Access
				  to Report Exported</a> <br />
				<br/>

				<p align="left"><font color="#880015">Episode Duration = $EpisodeDuration days</font><br/>
				</p>
			      </p>
			    </td>
			  </tr>
			</tbody>
		      </table>
		    </td>
		  </tr>
		  <tr name="ChoiceBlock">
		    <td style="background-color:#eeeeee">
			    <p align="center"><b><font color="#880015">Recommendation and Next Step to follow </font></b> </p>
		      <p>Please choose the suitable option</p>

		      <form onsubmit="return ValidateData();" action="null" method="post">
			<input type="submit" name="D32Choice" value="EpisodeDuration more than 7 days" onclick="btnWhichButton=this"/>
			<input type="submit" name="D32Choice" value="EpisodeDuration less than 7 days" onclick="btnWhichButton=this"/>
		      </form>
		    </td>
		  </tr>
		</tbody>
	      </table>
	    </body>
	  </HTML>
	</Display>
	<NextStep ref="S14905FDB-3842-869D-B646-51F6146D7990" name="EpisodeDuration more than 7 days">
	  <EvaluationScript>function check(S5013EF2A1573578B460451F43A64E97BChoice) { if(S5013EF2A1573578B460451F43A64E97BChoice.getValue().getText() == "EpisodeDuration more than 7 days") return true; else return false; }</EvaluationScript>
	</NextStep>
	<NextStep ref="S34C36486-02DB-6A2D-257D-51F6387E9098" name="EpisodeDuration less than 7 days">
	  <EvaluationScript>function check(S5013EF2A1573578B460451F43A64E97BChoice) { if(S5013EF2A1573578B460451F43A64E97BChoice.getValue().getText() == "EpisodeDuration less than 7 days") return true; else return false; }</EvaluationScript>
	</NextStep>
      </ConsultStep>
      <RecommendationStep ID="S14905FDB-3842-869D-B646-51F6146D7990" name="Prescribe suitable drugs to manage Atrial fibrillation">
	<Receiver ref="P3"/>
	<Urgency>2</Urgency>
	<Display>
	  <HTML>
	    <head/>
	    <body>

	      <table  cellspacing="10" style="background-color:#e1e1e1">
		<tbody>
		  <tr name="PatientBlock" id="PatientBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated automatically in the execution phase-->

		      <p align="center"><b>Brief Information about the patient </b></p>

		      <p>Patient Name: 
			<data src="caremanagementdb://Patient/@givenName"/>
			<data src="caremanagementdb://Patient/@secondName"/>
			<data src="caremanagementdb://Patient/@familyName"/>
			<br />
			Patient ID: 
			<data src="caremanagementdb://Patient/@patientIdentifier"/>
			<br />
			Initial Diagnosis: 
			<data src="caremanagementdb://Problem[@code=95281009]/@problemValueOriginalText"/>
			<a
			  href="http://patient.parameter.monitor.link/a.php?patientID">Access to
			  EHR</a> <br />
			Implanted Device:
			<data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
			<data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
			<br />
			Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a href="http://link.to.care.management.db">Access
			  to previous Remote follow-up results</a> </p>

		      <p><br />
		      </p>
		    </td>
		  </tr>
		  <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      Alarms Detected: Atrial Fibrillation episode at a rate of 180 <br />
		      <a href="http://patient.parameter.monitor.link">Access to Report
			Exported</a> </td>
		  </tr>
		  <tr name="RecommendationBlock">
		    <td style="background-color:#eeeeee">
			    <p align="center"><b><font color="#880015">Recommendation and Next Step to follow </font></b> </p>
		      <p>Prescribe suitable drugs to manage Atrial fibrillation.</p>

		      <form onsubmit="return ValidateData();" action="null" method="post">
			<input type="submit" name="D5Choice" value="Continue" onclick="btnWhichButton=this"/>
		    </form></td>
		  </tr>
		</tbody>
	      </table>
	    </body>
	  </HTML>
	</Display>
	<NextStep ref="S8590B661-27DB-989C-7C2C-51A555B00624"/>
      </RecommendationStep>
      <RecommendationStep ID="S34C36486-02DB-6A2D-257D-51F6387E9098" name="Prescribe suitable drugs to manage Atrial fibrillation">
	<Receiver ref="P3"/>
	<Urgency>2</Urgency>
	<Display>
	  <HTML>
	    <head/>
	    <body>

	      <table  cellspacing="10" style="background-color:#e1e1e1">
		<tbody>
		  <tr name="PatientBlock" id="PatientBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated automatically in the execution phase-->

		      <p align="center"><b>Brief Information about the patient </b></p>

		      <p>Patient Name: 
			<data src="caremanagementdb://Patient/@givenName"/>
			<data src="caremanagementdb://Patient/@secondName"/>
			<data src="caremanagementdb://Patient/@familyName"/>
			<br />
			Patient ID: 
			<data src="caremanagementdb://Patient/@patientIdentifier"/>
			<br />
			Initial Diagnosis: 
			<data src="caremanagementdb://Problem[@code=95281009]/@problemValueOriginalText"/>
			<a
			  href="http://patient.parameter.monitor.link/a.php?patientID">Access to
			  EHR</a> <br />
			Implanted Device:
			<data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
			<data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
			<br />
			Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a href="http://link.to.care.management.db">Access
			  to previous Remote follow-up results</a> </p>

		      <p><br />
		      </p>
		    </td>
		  </tr>
		  <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      Alarms Detected: Atrial Fibrillation episode at a rate of 180 <br />
		      <a href="http://patient.parameter.monitor.link">Access to Report
			Exported</a> </td>
		  </tr>
		  <tr name="RecommendationBlock">
		    <td style="background-color:#eeeeee">
			    <p align="center"><b><font color="#880015">Recommendation and Next Step to follow </font></b> </p>
		      <p>Prescribe suitable drugs to manage Atrial fibrillation </p>

		      <form onsubmit="return ValidateData();" action="null" method="post">
			<input type="submit" name="D5Choice" value="Continue" onclick="btnWhichButton=this"/>
		    </form></td>
		  </tr>
		</tbody>
	      </table>
	    </body>
	  </HTML>
	</Display>
	<NextStep ref="S8590B661-27DB-989C-7C2C-51A555B00624"/>
      </RecommendationStep>
      <ConsultStep ID="S3CA05936-B606-0352-E9F6-520BD2F87B4A" name="Check Heart Disease">
	<Variable name="HeartDiseases" type="boolean">
	  <Concept code="C0018799" schemeID="UMLS"/>
	  <DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	  <DataSource code="C0033213" name="Problem" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var x; var y=false; var names=list.toArray(); for(var i=0; i &lt; names.length;i++) {	y=true; } return y; }</RefinementScript>
	</Variable>
	<Display>
	  <HTML>
	    <head>						
	    </head>
	    <body>

	      <table  cellspacing="10" style="background-color:#e1e1e1">
		<tbody>
		  <tr name="PatientBlock" id="PatientBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated automatically in the execution phase-->

		      <p align="center"><b>Brief Information about the patient </b></p>

		      <p>Patient Name: 
			<data src="caremanagementdb://Patient/@givenName"/>
			<data src="caremanagementdb://Patient/@secondName"/>
			<data src="caremanagementdb://Patient/@familyName"/>
			<br />
			Patient ID: 
			<data src="caremanagementdb://Patient/@patientIdentifier"/>
			<br />
			Initial Diagnosis: 
			<data src="caremanagementdb://Problem[@code=95281009]/@problemValueOriginalText"/>
			<a
			  href="http://patient.parameter.monitor.link/a.php?patientID">Access to
			  EHR</a> <br />
			Implanted Device:
			<data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
			<data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
			<br />
			Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a href="http://link.to.care.management.db">Access
			  to previous Remote follow-up results</a> </p>

		      <p><br />
		      </p>
		    </td>
		  </tr>
		  <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      Alarms Detected: Atrial Fibrillation episode at a rate of 180 <br />
		      <a href="http://patient.parameter.monitor.link">Access to Report
			Exported</a> </td>
		  </tr>
		  <tr name="RecommendationBlock">
		    <td style="background-color:#eeeeee">
			    <p align="center"><b><font color="#880015">Recommendation and Next Step to follow </font></b> </p>
		      <p>According to EHR: Heart Disease statis is $HeartDiseases <br/>, please select the suitable option:</p>

		      <form onsubmit="return ValidateData();" action="null" method="post">
			<input type="submit" name="D28Choice" value="Relevant underlying heart disease" onclick="btnWhichButton=this"/>
			<input type="submit" name="D28Choice" value="No or minimal" onclick="btnWhichButton=this"/>
		    </form></td>
		  </tr>
		</tbody>
	      </table>
	    </body>
	  </HTML>
	</Display>
	<NextStep ref="S65694FA6-CA8A-84B1-AA1E-520D9C4DD694" name="Relevant underlying heart disease">
	  <EvaluationScript>function check(S3CA05936B6060352E9F6520BD2F87B4AChoice) { if(S3CA05936B6060352E9F6520BD2F87B4AChoice.getValue().getText() == "Relevant underlying heart disease") return true; else return false; }</EvaluationScript>
	</NextStep>
	<NextStep ref="S757552D1-B5CE-9B44-C04C-520DA5CC4C66" name="No or minimal">
	  <EvaluationScript>function check(S3CA05936B6060352E9F6520BD2F87B4AChoice) { if(S3CA05936B6060352E9F6520BD2F87B4AChoice.getValue().getText() == "No or minimal") return true; else return false; }</EvaluationScript>
	</NextStep>
      </ConsultStep>
      <ConsultStep ID="S65694FA6-CA8A-84B1-AA1E-520D9C4DD694" name="Check relevant underlying heart disease">
	<Variable name="CHF" type="boolean">
	  <Concept code="C0018802" schemeID="UMLS"/>
	  <DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	  <DataSource code="C0033213" name="Problem" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var x; var y=false; var names=list.toArray(); for(var i=0; i &lt; names.length;i++) {	y=true; } return y; }</RefinementScript>
	</Variable>
	<Variable name="CAD" type="boolean">
	  <Concept code="C1956346" schemeID="UMLS"/>
	  <DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	  <DataSource code="C0033213" name="Problem" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var x; var y=false; var names=list.toArray(); for(var i=0; i &lt; names.length;i++) {	y=true; } return y; }</RefinementScript>
	</Variable>
	<Variable name="Hypertension" type="boolean">
	  <Concept code="C0020538" schemeID="UMLS"/>
	  <DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	  <DataSource code="C0033213" name="Problem" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var x; var y=false; var names=list.toArray(); for(var i=0; i &lt; names.length;i++) {	y=true; } return y; }</RefinementScript>
	</Variable>
	<Variable name="LVH" type="boolean">
	  <Concept code="C0149721" schemeID="UMLS"/>
	  <DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	  <DataSource code="C0033213" name="Problem" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var x; var y=false; var names=list.toArray(); for(var i=0; i &lt; names.length;i++) {	y=true; } return y; }</RefinementScript>
	</Variable>
	<Display>
	  <HTML>
	    <head/>
	    <body>

	      <table  cellspacing="10" style="background-color:#e1e1e1">
		<tbody>
		  <tr name="PatientBlock" id="PatientBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated automatically in the execution phase-->

		      <p align="center"><b>Brief Information about the patient </b></p>

		      <p>Patient Name: <br />
			Patient ID: <br />
			Initial Diagnosis: <a
			  href="http://patient.parameter.monitor.link/a.php?patientID">Access to
			  EHR</a> <br />
			Implanted Device: <br />
			Last Follow-up Date: <a
			  href="http://link.to.care.management.db/">Access to previous Remote
			  follow-up results</a> </p>

		      <p><br />
		      </p>
		    </td>
		  </tr>
		  <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <br />
		      Alarms Detected: Atrial Fibrillation episode at a rate of 180 <br />
		      <a href="http://patient.parameter.monitor.link/">Access to Report
			Exported</a> </td>
		  </tr>
		  <tr name="EHRBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->
		      <p align="center"><b>Brief Information about the Patient History retrieved from EHR
		      </b> </p>

		      <table  width="100%">
			<tbody>

			  <tr>
			    <td><b>Relevant Underlying Heart Diseases</b></td>
			    <td><b>EHR values</b></td>
			  </tr>

			  <tr>
			    <td>The Congestive Heart Failure status</td>
			    <td>
			      $CHF
			      <a href="http://link.to.patient.parameter.monitor?section=Problemcode=C0019080">Link to EHR</a>
			    </td>
			  </tr>
			  <tr>
			    <td>Coronary Artery Disease status</td>
			    <td>
			      $CAD
			      <a href="http://link.to.patient.parameter.monitor?section=Problemcode=C0151699">Link to EHR</a>
			    </td>
			  </tr>
			  <tr>
			    <td>Hypertension status</td>
			    <td>
			      $Hypertension
			      <a href="http://link.to.patient.parameter.monitor?section=Problemcode=C0007766">Link to EHR</a>
			    </td>
			  </tr>
			  <tr>
			    <td>Left Ventricular Hypertrophy</td>
			    <td>
			      $LVH
			      <a href="http://link.to.patient.parameter.monitor?section=Problemcode=C0332677">Link to EHR</a>
			    </td>
			  </tr>

			</tbody>
		      </table>
		    </td>
		  </tr>
		  <tr name="ChoiceBlock">
		    <td style="background-color:#eeeeee"><p align="center"><b><font color="#880015">Recommendation
					    and Next Step to follow </font> </b></p>
		      <p>Please confirm:</p>

		      <form onsubmit="return ValidateData();" action="null" method="post">
			<input type="submit" name="S27Choice" value="Congestive Heart Failure" onclick="btnWhichButton=this"/>
			<input type="submit" name="S27Choice" value="Coronary Artery Disease" onclick="btnWhichButton=this"/>
			<input type="submit" name="S27Choice" value="Hypertension with Left Ventricular Hypertrophy" onclick="btnWhichButton=this"/>
		      </form>
		    </td>
		  </tr>
		</tbody>
	      </table>
	    </body>
	  </HTML>
	</Display>
	<NextStep ref="SEBA1DBD0-6F74-9827-A234-525639AE1D93" name="Congestive Heart Failure">
	  <EvaluationScript>function check(S65694FA6CA8A84B1AA1E520D9C4DD694Choice) { if(S65694FA6CA8A84B1AA1E520D9C4DD694Choice.getValue().getText() == "Congestive Heart Failure") return true; else return false; }</EvaluationScript>
	</NextStep>
	<NextStep ref="SD8C0037F-E3AD-BF2A-F758-525666A01F1F" name="Coronary Artery Disease">
	  <EvaluationScript>function check(S65694FA6CA8A84B1AA1E520D9C4DD694Choice) { if(S65694FA6CA8A84B1AA1E520D9C4DD694Choice.getValue().getText() == "Coronary Artery Disease") return true; else return false; }</EvaluationScript>
	</NextStep>
	<NextStep ref="SABCA5044-B887-E8D6-14CA-52567C0A1852" name="Hypertension with Left Ventricular Hypertrophy">
	  <EvaluationScript>function check(S65694FA6CA8A84B1AA1E520D9C4DD694Choice) { if(S65694FA6CA8A84B1AA1E520D9C4DD694Choice.getValue().getText() == "Hypertension with Left Ventricular Hypertrophy") return true; else return false; }</EvaluationScript>
	</NextStep>
      </ConsultStep>
      <ConsultStep ID="SEBA1DBD0-6F74-9827-A234-525639AE1D93" name="Check NYHA">
	<Variable name="NYHA" type="boolean">
	  <Concept code="C0018799" schemeID="UMLS"/>
	  <DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	  <DataSource code="C0033213" name="Problem" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var x; var y=false; var names=list.toArray(); for(var i=0; i &lt; names.length;i++) {	y=false; } return y; }</RefinementScript>
	</Variable>
	<Display>
	  <HTML>
	    <head>						
	    </head>
	    <body>

	      <table  cellspacing="10" style="background-color:#e1e1e1">
		<tbody>
		  <tr name="PatientBlock" id="PatientBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated automatically in the execution phase-->

		      <p align="center"><b>Brief Information about the patient </b></p>

		      <p>Patient Name: 
			<data src="caremanagementdb://Patient/@givenName"/>
			<data src="caremanagementdb://Patient/@secondName"/>
			<data src="caremanagementdb://Patient/@familyName"/>
			<br />
			Patient ID: 
			<data src="caremanagementdb://Patient/@patientIdentifier"/>
			<br />
			Initial Diagnosis: 
			<data src="caremanagementdb://Problem[@code=95281009]/@problemValueOriginalText"/>
			<a
			  href="http://patient.parameter.monitor.link/a.php?patientID">Access to
			  EHR</a> <br />
			Implanted Device:
			<data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
			<data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
			<br />
			Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a href="http://link.to.care.management.db">Access
			  to previous Remote follow-up results</a> </p>

		      <p><br />
		      </p>
		    </td>
		  </tr>
		  <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      Alarms Detected: Atrial Fibrillation episode at a rate of 180 <br />
		      <a href="http://patient.parameter.monitor.link">Access to Report
			Exported</a> </td>
		  </tr>
		  <tr name="RecommendationBlock">
		    <td style="background-color:#eeeeee">
			    <p align="center"><b><font color="#880015">Recommendation and Next Step to follow </font></b> </p>
		      <p>Which path do you want to guideline follow?</p>

		      <form onsubmit="return ValidateData();" action="null" method="post">
			<input type="submit" name="D33Choice" value="Stable NYHA I/II" onclick="btnWhichButton=this"/>
			<input type="submit" name="D33Choice" value="NYHA III/IV or unstable" onclick="btnWhichButton=this"/>
		    </form></td>
		  </tr>
		</tbody>
	      </table>
	    </body>
	  </HTML>
	</Display>
	<NextStep ref="SABCA5044-B887-E8D6-14CA-52567C0A1852" name="Stable NYHA I/II">
	  <EvaluationScript>function check(SEBA1DBD06F749827A234525639AE1D93Choice) { if(SEBA1DBD06F749827A234525639AE1D93Choice.getValue().getText() == "Stable NYHA I/II") return true; else return false; }</EvaluationScript>
	</NextStep>
	<NextStep ref="S79A4DE33-85B1-BACB-9108-5266509B8214" name="NYHA III/IV or unstable">
	  <EvaluationScript>function check(SEBA1DBD06F749827A234525639AE1D93Choice) { if(SEBA1DBD06F749827A234525639AE1D93Choice.getValue().getText() == "NYHA III/IV or unstable") return true; else return false; }</EvaluationScript>
	</NextStep>
      </ConsultStep>
      <RecommendationStep ID="SABCA5044-B887-E8D6-14CA-52567C0A1852" name="Prescribe Dronedarone">
	<Receiver ref="P3"/>
	<Urgency>2</Urgency>
	<Display>
	  <HTML>
	    <head/>
	    <body>

	      <table  cellspacing="10" style="background-color:#e1e1e1">
		<tbody>
		  <tr name="PatientBlock" id="PatientBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated automatically in the execution phase-->

		      <p align="center"><b>Brief Information about the patient </b></p>

		      <p>Patient Name: 
			<data src="caremanagementdb://Patient/@givenName"/>
			<data src="caremanagementdb://Patient/@secondName"/>
			<data src="caremanagementdb://Patient/@familyName"/>
			<br />
			Patient ID: 
			<data src="caremanagementdb://Patient/@patientIdentifier"/>
			<br />
			Initial Diagnosis: 
			<data src="caremanagementdb://Problem[@code=95281009]/@problemValueOriginalText"/>
			<a
			  href="http://patient.parameter.monitor.link/a.php?patientID">Access to
			  EHR</a> <br />
			Implanted Device:
			<data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
			<data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
			<br />
			Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a href="http://link.to.care.management.db">Access
			  to previous Remote follow-up results</a> </p>

		      <p><br />
		      </p>
		    </td>
		  </tr>
		  <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      Alarms Detected: Atrial Fibrillation episode at a rate of 180 <br />
		      <a href="http://patient.parameter.monitor.link">Access to Report
			Exported</a> </td>
		  </tr>
		  <tr name="RecommendationBlock">
		    <td style="background-color:#eeeeee">
			    <p align="center"><b><font color="#880015">Recommendation and Next Step to follow </font></b> </p>
		      <p>Prescribe Dronedarone</p>

		      <form onsubmit="return ValidateData();" action="null" method="post">
			<input type="submit" name="D5Choice" value="Continue" onclick="btnWhichButton=this"/>
		    </form></td>
		  </tr>
		</tbody>
	      </table>
	    </body>
	  </HTML>
	</Display>
	<NextStep ref="S79A4DE33-85B1-BACB-9108-5266509B8214"/>
      </RecommendationStep>
      <RecommendationStep ID="SD8C0037F-E3AD-BF2A-F758-525666A01F1F" name="Prescribe Dronedarone Sotalol">
	<Receiver ref="P3"/>
	<Urgency>2</Urgency>
	<Display>
	  <HTML>
	    <head/>
	    <body>

	      <table  cellspacing="10" style="background-color:#e1e1e1">
		<tbody>
		  <tr name="PatientBlock" id="PatientBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated automatically in the execution phase-->

		      <p align="center"><b>Brief Information about the patient </b></p>

		      <p>Patient Name: 
			<data src="caremanagementdb://Patient/@givenName"/>
			<data src="caremanagementdb://Patient/@secondName"/>
			<data src="caremanagementdb://Patient/@familyName"/>
			<br />
			Patient ID: 
			<data src="caremanagementdb://Patient/@patientIdentifier"/>
			<br />
			Initial Diagnosis: 
			<data src="caremanagementdb://Problem[@code=95281009]/@problemValueOriginalText"/>
			<a
			  href="http://patient.parameter.monitor.link/a.php?patientID">Access to
			  EHR</a> <br />
			Implanted Device:
			<data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
			<data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
			<br />
			Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a href="http://link.to.care.management.db">Access
			  to previous Remote follow-up results</a> </p>

		      <p><br />
		      </p>
		    </td>
		  </tr>
		  <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      Alarms Detected: Atrial Fibrillation episode at a rate of 180 <br />
		      <a href="http://patient.parameter.monitor.link">Access to Report
			Exported</a> </td>
		  </tr>
		  <tr name="RecommendationBlock">
		    <td style="background-color:#eeeeee">
			    <p align="center"><b><font color="#880015">Recommendation and Next Step to follow </font></b> </p>
		      <p>Prescribe Dronedarone or Sotalol</p>

		      <form onsubmit="return ValidateData();" action="null" method="post">
			<input type="submit" name="D5Choice" value="Continue" onclick="btnWhichButton=this"/>
		    </form></td>
		  </tr>
		</tbody>
	      </table>
	    </body>
	  </HTML>
	</Display>
	<NextStep ref="S79A4DE33-85B1-BACB-9108-5266509B8214"/>
      </RecommendationStep>
      <RecommendationStep ID="S79A4DE33-85B1-BACB-9108-5266509B8214" name="Prescribe Amiodarone, then consider Catheter Ablation">		
	<Receiver ref="P3"/>
	<Urgency>2</Urgency>
	<Display>
	  <HTML>
	    <head/>
	    <body>

	      <table  cellspacing="10" style="background-color:#e1e1e1">
		<tbody>
		  <tr name="PatientBlock" id="PatientBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated automatically in the execution phase-->

		      <p align="center"><b>Brief Information about the patient </b></p>

		      <p>Patient Name: 
			<data src="caremanagementdb://Patient/@givenName"/>
			<data src="caremanagementdb://Patient/@secondName"/>
			<data src="caremanagementdb://Patient/@familyName"/>
			<br />
			Patient ID: 
			<data src="caremanagementdb://Patient/@patientIdentifier"/>
			<br />
			Initial Diagnosis: 
			<data src="caremanagementdb://Problem[@code=95281009]/@problemValueOriginalText"/>
			<a
			  href="http://patient.parameter.monitor.link/a.php?patientID">Access to
			  EHR</a> <br />
			Implanted Device:
			<data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
			<data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
			<br />
			Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a href="http://link.to.care.management.db">Access
			  to previous Remote follow-up results</a> </p>

		      <p><br />
		      </p>
		    </td>
		  </tr>
		  <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      Alarms Detected: Atrial Fibrillation episode at a rate of 180 <br />
		      <a href="http://patient.parameter.monitor.link">Access to Report
			Exported</a> </td>
		  </tr>
		  <tr name="RecommendationBlock">
		    <td style="background-color:#eeeeee">
			    <p align="center"><b><font color="#880015">Recommendation and Next Step to follow </font></b> </p>
		      <p>Prescribe Amiodarone, then consider Catheter Ablation. </p>

		      <form onsubmit="return ValidateData();" action="null" method="post">
			<input type="submit" name="D5Choice" value="Continue" onclick="btnWhichButton=this"/>
		    </form></td>
		  </tr>
		</tbody>
	      </table>
	    </body>
	  </HTML>
	</Display>
	<NextStep ref="S8590B661-27DB-989C-7C2C-51A555B00624"/>
      </RecommendationStep>		
      <ConsultStep ID="S757552D1-B5CE-9B44-C04C-520DA5CC4C66" name="Check Persistent AF or Paroxysmal AF">
	<Variable name="ParoxysmalAF" type="boolean">
	  <Concept code="C0235480" schemeID="UMLS"/>
	  <DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	  <DataSource code="C0033213" name="Problem" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var x; var y=false; var names=list.toArray(); for(var i=0; i &lt; names.length;i++) {	y=true; } return y; }</RefinementScript>
	</Variable>
	<Variable name="AFStatus" type="boolean">
	  <Concept code="739568" name="MDC_IDC_EPISODE_TYPE" schemeID="MDC_IDC"/>
	  <DataSource code="C0581396" name="Cardiac implant device" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var x; var y=false; var names=list.toArray(); for(x in names) { if(names[x] == "Epis_AT_AF") y=true; } return y; }</RefinementScript>
	</Variable>
	<Variable name="EpisodeDuration" type="integer">
	  <Concept code="739712" name="MDC_IDC_EPISODE_DURATION" schemeID="MDC_IDC"/>
	  <DataSource code="C0581396" name="Cardiac implant device" schemeID="UMLS"/>
	  <!--boyle ikinci bir source verince objeleri don ve onun uzerinden refine et-->
	  <DataSource code="MDC_IDC_STAT_EPISODE" name="Episode" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var y=0; var names = list.toArray(); for(var i = 0; i &lt; names.length;i++) {if(names[i].getType() == "Epis_AT_AF") y=names[i].getDuration(); } return y; }</RefinementScript>
	</Variable>
	<Display>
	  <HTML>
	    <head>						
	    </head>
	    <body>

	      <table  cellspacing="10" style="background-color:#e1e1e1">
		<tbody>
		  <tr name="PatientBlock" id="PatientBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated automatically in the execution phase-->

		      <p align="center"><b>Brief Information about the patient </b></p>

		      <p>Patient Name: 
			<data src="caremanagementdb://Patient/@givenName"/>
			<data src="caremanagementdb://Patient/@secondName"/>
			<data src="caremanagementdb://Patient/@familyName"/>
			<br />
			Patient ID: 
			<data src="caremanagementdb://Patient/@patientIdentifier"/>
			<br />
			Initial Diagnosis: 
			<data src="caremanagementdb://Problem[@code=95281009]/@problemValueOriginalText"/>
			<a
			  href="http://patient.parameter.monitor.link/a.php?patientID">Access to
			  EHR</a> <br />
			Implanted Device:
			<data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
			<data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
			<br />
			Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a href="http://link.to.care.management.db">Access
			  to previous Remote follow-up results</a> </p>

		      <p><br />
		      </p>
		    </td>
		  </tr>
		  <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      Alarms Detected: Atrial Fibrillation episode at a rate of 180 <br />
		      <a href="http://patient.parameter.monitor.link">Access to Report
			Exported</a> </td>
		  </tr>
		  <tr name="EGMBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		      <p align="center"><b>Brief Information about the EGM and detected
			  problems </b> </p>

		      <table  cellspacing="10" width="100%">
			<tbody>
			  <tr>
			    <td><!--The following HTML will be populated in the execution step-->
			      <p align="center"> EGM: <a href="http://patient.parameter.monitor.link">Access to
				  Report Exported</a> <br /> </p>


			      <p><img width="312" height="190" id="Picture1"
				  src="caremanagementdb://Patient/Observation/@base64String"
				  alt="x.bmp" /></p>
			    </td>
			    <td><!--The following HTML will be populated in the execution step-->

			      <p align="center">  Assesment by CIED <a href="http://patient.parameter.monitor.link">Access
				  to Report Exported</a> <br />
				<br/>

				<p align="left"><font color="#880015">Paroxysmal AF = $ParoxysmalAF <br/>
						Episode Duration = $EpisodeDuration </font><br/>
				</p>
			      </p>
			    </td>
			  </tr>
			</tbody>
		      </table>
		    </td>
		  </tr>
		  <tr name="ChoiceBlock">
		    <td style="background-color:#eeeeee">
			    <p align="center"><b><font color="#880015">Recommendation and Next Step to follow </font></b> </p>
		      <p>Please choose the suitable option</p>

		      <form onsubmit="return ValidateData();" action="null" method="post">
			<input type="submit" name="D29Choice" value="Persistent AF or Paroxysmal AF exist" onclick="btnWhichButton=this"/>
			<input type="submit" name="D29Choice" value="Persistent AF or Paroxysmal AF does not exist" onclick="btnWhichButton=this"/>
		      </form>
		    </td>
		  </tr>
		</tbody>
	      </table>
	    </body>
	  </HTML>
	</Display>

	<NextStep ref="S57EEFB4A-8B95-3064-D410-526DB529D624" name="Persistent AF or Paroxysmal AF exist">
	  <EvaluationScript>function check(S757552D1B5CE9B44C04C520DA5CC4C66Choice) { if(S757552D1B5CE9B44C04C520DA5CC4C66Choice.getValue().getText() == "Persistent AF or Paroxysmal AF exist") return true; else return false; }</EvaluationScript>
	</NextStep>
	<NextStep ref="S8590B661-27DB-989C-7C2C-51A555B00624" name="Persistent AF or Paroxysmal AF does not exist">
	  <EvaluationScript>function check(S757552D1B5CE9B44C04C520DA5CC4C66Choice) { if(S757552D1B5CE9B44C04C520DA5CC4C66Choice.getValue().getText() == "Persistent AF or Paroxysmal AF does not exist") return true; else return false; }</EvaluationScript>
	</NextStep>
      </ConsultStep>
      <RecommendationStep ID="S57EEFB4A-8B95-3064-D410-526DB529D624" name="Prescribe Dronedarone Flecainide Propafenone Sotalol">		
	<Receiver ref="P3"/>
	<Urgency>2</Urgency>
	<Display>
	  <HTML>
	    <head/>
	    <body>

	      <table  cellspacing="10" style="background-color:#e1e1e1">
		<tbody>
		  <tr name="PatientBlock" id="PatientBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated automatically in the execution phase-->

		      <p align="center"><b>Brief Information about the patient </b></p>

		      <p>Patient Name: 
			<data src="caremanagementdb://Patient/@givenName"/>
			<data src="caremanagementdb://Patient/@secondName"/>
			<data src="caremanagementdb://Patient/@familyName"/>
			<br />
			Patient ID: 
			<data src="caremanagementdb://Patient/@patientIdentifier"/>
			<br />
			Initial Diagnosis: 
			<data src="caremanagementdb://Problem[@code=95281009]/@problemValueOriginalText"/>
			<a
			  href="http://patient.parameter.monitor.link/a.php?patientID">Access to
			  EHR</a> <br />
			Implanted Device:
			<data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
			<data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
			<br />
			Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a href="http://link.to.care.management.db">Access
			  to previous Remote follow-up results</a> </p>

		      <p><br />
		      </p>
		    </td>
		  </tr>
		  <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      Alarms Detected: Atrial Fibrillation episode at a rate of 180 <br />
		      <a href="http://patient.parameter.monitor.link">Access to Report
			Exported</a> </td>
		  </tr>
		  <tr name="RecommendationBlock">
		    <td style="background-color:#eeeeee">
			    <p align="center"><b><font color="#880015">Recommendation and Next Step to follow </font></b> </p>
		      <p>Prescribe Dronedarone or Flecainide or Propafenone or Sotalol</p>

		      <form onsubmit="return ValidateData();" action="null" method="post">
			<input type="submit" name="D5Choice" value="Continue" onclick="btnWhichButton=this"/>
		    </form></td>
		  </tr>
		</tbody>
	      </table>
	    </body>
	  </HTML>
	</Display>
	<NextStep ref="S8590B661-27DB-989C-7C2C-51A555B00624"/>
      </RecommendationStep>
    </Algorithm>
  </Body>
  </MedicalCareplan>
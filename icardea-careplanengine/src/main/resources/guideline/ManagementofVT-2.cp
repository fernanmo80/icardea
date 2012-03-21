<MedicalCareplan name="VT Careplan" ID="VTCareplan" version="2.0" xsi:noNamespaceSchemaLocation="Careplan.xsd" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
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
      <ID schemeID="TCKN">149202063491</ID>
      <ID schemeID="CIED">MODEL:XXX/SERIAL:YYY</ID>
      <Name>Suzie</Name>
      <Middlename>Mayr</Middlename>
      <Surname>Mayr</Surname>
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
      <Variable name="VTStatus" type="boolean">
	<Concept code="739568" name="MDC_IDC_EPISODE_TYPE" schemeID="MDC_IDC"/>
	<DataSource code="C0581396" name="Cardiac implant device" schemeID="UMLS"/>
	<RefinementScript>function refine(list) { var x; var y=false; var names=list.toArray(); for(x in names) { println(names[x]); if(names[x] == "Epis_VT") y=true; } return y; }</RefinementScript>
      </Variable>
      <!--Scriptler degisecek. Ayrica burada input girilen AFStatus objesini incele. Nasil olusturuluyor.-->
      <EvaluationScript>function EligibleToGuidelineCriterion(VTStatus) { if ( VTStatus.getValue().getText() == "true") return true; else return false; }</EvaluationScript>
    </EligibilityCriteria>
    <Algorithm>
      <StartStep ID="S06803B5E-9643-8FF4-B83C-67ADE997CA20">
	<NextStep ref="S9657369B-08ED-F755-3870-67AFCACF7219"/>
      </StartStep>
      <FinalStep ID="S42F61D34-3D6A-29F5-D8FD-67B19FD9CE09" name="Guideline Finalized"/>
      <ConsultStep ID="S9657369B-08ED-F755-3870-67AFCACF7219" name="Present the CIED Data and EGM to the Medical Professional">
	<Variable name="VTStatus" type="boolean">
	  <Concept code="739568" name="MDC_IDC_EPISODE_TYPE" schemeID="MDC_IDC"/>
	  <DataSource code="C0581396" name="Cardiac implant device" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var x; var y=false; var names=list.toArray(); for(x in names) { println(names[x]); if(names[x] == "Epis_VT") y=true; } return y; }</RefinementScript>
	</Variable>
	<Variable name="SVTStatus" type="boolean">
	
	  <Concept code="739568" name="MDC_IDC_EPISODE_TYPE" schemeID="MDC_IDC"/>
	  <DataSource code="C0581396" name="Cardiac implant device" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var x; var y=false; var names=list.toArray(); for(x in names) { println(names[x]); if(names[x] == "Epis_SVT") y=true; } return y; }</RefinementScript>
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
			<a
			  href="PPM:TAB3">Access to
			  EHR</a> <br />
			Implanted Device:
			<data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
			<data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
			<br />
			Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a href="PPM:TAB1">Access
			  to previous Remote follow-up results</a> </p>

		      <p><br />
		      </p>
		    </td>
		  </tr>
		  <tr name="CIEDBlock">

		    <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->
		      Received Date:	<data src="caremanagementdb://Patient/CIEDData/@receivedTime"/>
		      <br/>
		      Alarms Detected:
		      <data src="alarmmanager://Alarm/Time"/>
		      VT Episode
		      <br/>
		      <a href="PPM:TAB1">Access to Report Exported</a>
		    </td>
		  </tr>
		  <tr name="EGMBlock"> <td style="background-color:#eeeeee">
		      <p align="center"><b>Brief Information about the EGM and detected
			  problems </b> </p>
		      <table  cellspacing="10" width="100%">
			<tbody>
			  <tr>
			    <td><!--The following HTML will be populated in the execution step-->
			      <p align="center"> EGM: <a href="PPM:TAB1">Access to
				  Report Exported</a> <br /> </p>


			      <p><img width="312" height="190" id="Picture1"
				  src="caremanagementdb://Patient/Observation/@base64String"
				  alt="x.bmp" /></p>
			    </td>
			    <td><!--The following HTML will be populated in the execution step-->

			      <p align="center">  Assesment by CIED <a href="PPM:TAB1">Access
				  to Report Exported</a> <br />
				<br/>
				<p align="left"> VT status: $VTStatus <br />
				  SVT Status: $SVTStatus . <br />


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
				  <a href="PPM:TAB3">Access to EHR</a>
				</td>
			  </tr>
			  <tr>
				<td>Heart failure:</td>
				<td>
				  $HeartFailure
				   <a href="PPM:TAB3">Access to EHR</a>
				</td>
			  </tr>
			  <tr>
				<td>Diabetes:</td>
				<td>
				  $Diabetes
				   <a href="PPM:TAB3">Access to EHR</a>
				</td>
			  </tr>
			  <tr>
				<td>Atrial arrhythmia:</td>
				<td>
				  $AtrialArrhythmia
				   <a href="PPM:TAB3">Access to EHR</a>
				</td>
			  </tr>			  
			</tbody>
			  </table>

			</td>
			</tr>
		  <tr name="ChoiceBlock">
		    <td style="background-color:#eeeeee">
		      <p align="center"><b>Recommendation and Next Step to follow </b> </p>
		      <p>Please choose the suitable option</p>

		      <form onsubmit="return ValidateData();" action="null" method="post">
			<input type="submit" name="S5Choice" value="The case is VT!" onclick="btnWhichButton=this" />
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
	<NextStep ref="S560A22EF-4D7B-06C7-49E8-67B13AB3C139" name="The case is VT!">
	  <EvaluationScript>function check(S9657369B08EDF755387067AFCACF7219Choice) { if(S9657369B08EDF755387067AFCACF7219Choice.getValue().getText() == "The case is VT!") return true; else return false; }</EvaluationScript>
	</NextStep>
	<NextStep ref="S17972A05-4127-83AD-5792-67B1901E767B" name="The case is Noise!">
	  <EvaluationScript>function check(S9657369B08EDF755387067AFCACF7219Choice) { if(S9657369B08EDF755387067AFCACF7219Choice.getValue().getText() == "There is Noise!") return true; else return false; }</EvaluationScript>
	</NextStep>
	<NextStep ref="SE08A9520-760C-FE41-2182-67B166372B8D" name="The case is SVT!">
	  <EvaluationScript>function check(S9657369B08EDF755387067AFCACF7219Choice) { if(S9657369B08EDF755387067AFCACF7219Choice.getValue().getText() == "The case is SVT!") return true; else return false; }</EvaluationScript>
	</NextStep>
	<NextStep ref="S42F61D34-3D6A-29F5-D8FD-67B19FD9CE09" name="Finalize careplan">
	  <EvaluationScript>function check(S9657369B08EDF755387067AFCACF7219Choice) { if(S9657369B08EDF755387067AFCACF7219Choice.getValue().getText() == "Finalize careplan!") return true; else return false; }</EvaluationScript>
	</NextStep>
      </ConsultStep>
      <ConsultStep ID="S560A22EF-4D7B-06C7-49E8-67B13AB3C139" name="Check Episodes">
	<Variable name="NumberOfEpisode" type="integer">
	  <Concept code="738000" name="MDC_IDC_STAT_EPISODE_RECENT_COUNT" schemeID="MDC_IDC"/>
	  <DataSource code="C0581396" name="Cardiac implant device" schemeID="UMLS"/>
	  <!--RefinementScript>function refine(list) { var y=0; var names = list.toArray(); for(var i = 0; i &lt; names.length;i++) {if(names[i] == "Epis_VT") y=y+1; } return y; }</RefinementScript-->
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
			<a
			  href="PPM:TAB3">Access to
			  EHR</a> <br />
			Implanted Device:
			<data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
			<data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
			<br />
			Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a href="PPM:TAB1">Access
			  to previous Remote follow-up results</a> </p>

		      <p><br />
		      </p>
		    </td>
		  </tr>
		  <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      VT Episode <br />
		      <a href="PPM:TAB1">Access to Report
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
			      <p align="center"> EGM: <a href="PPM:TAB1">Access to
				  Report Exported</a> <br /> </p>


			      <p><img width="312" height="190" id="Picture1"
				  src="caremanagementdb://Patient/Observation/@base64String"
				  alt="x.bmp" /></p>
			    </td>
			    <td><!--The following HTML will be populated in the execution step-->

			      <p align="center">  Assesment by CIED <a href="PPM:TAB1">Access
				  to Report Exported</a> <br />
				<br/>

				<p align="left"># of VT Episodes: $NumberOfEpisode <br />

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
		      <p align="center"><b>Recommendation and Next Step to follow </b> </p>
		      <p>Please choose the suitable option</p>

		      <form onsubmit="return ValidateData();" action="null" method="post">

			<input type="submit" name="D5Choice" value="Single/Rare Episode" onclick="btnWhichButton=this"/>
			<input type="submit" name="D5Choice" value="Frequent Episodes" onclick="btnWhichButton=this"/>

		      </form>
		    </td>
		  </tr>
		</tbody>
	      </table>
	    </body>
	  </HTML>
	</Display>
	<NextStep ref="SD389F35B-1961-B5D3-11CB-67B6FFD0BDE1" name="Frequent Episode">
	  <EvaluationScript>function check(S560A22EF4D7B06C749E867B13AB3C139Choice) { if(S560A22EF4D7B06C749E867B13AB3C139Choice.getValue().getText() == "Frequent Episodes") return true; else return false; }</EvaluationScript>
	</NextStep>
	<NextStep ref="S228AC30A-F1C3-462E-99D2-67B727F4DF02" name="Rare Episode">
	  <EvaluationScript>function check(S560A22EF4D7B06C749E867B13AB3C139Choice) { if(S560A22EF4D7B06C749E867B13AB3C139Choice.getValue().getText() == "Single/Rare Episode")  return true; else return false; }</EvaluationScript>
	</NextStep>
      </ConsultStep>
      <ConsultStep ID="SD389F35B-1961-B5D3-11CB-67B6FFD0BDE1" name="Check Programmed ATP">
	<Variable name="ProgrammedATP" type="integer">
	  <Concept code="737888" name="MDC_IDC_STAT_TACHYTHERAPY_ATP_DELIVERED_RECENT" schemeID="MDC_IDC"/>
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
			<a
			  href="PPM:TAB3">Access to
			  EHR</a> <br />
			Implanted Device:
			<data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
			<data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
			<br />
			Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a href="PPM:TAB1">Access
			  to previous Remote follow-up results</a> </p>

		      <p><br />
		      </p>
		    </td>
		  </tr>
		  <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      VT Episode <br />
		      <a href="PPM:TAB1">Access to Report
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
			      <p align="center"> EGM: <a href="PPM:TAB1">Access to
				  Report Exported</a> <br /> </p>


			      <p><img width="312" height="190" id="Picture1"
				  src="caremanagementdb://Patient/Observation/@base64String"
				  alt="x.bmp" /></p>
			    </td>
			    <td><!--The following HTML will be populated in the execution step-->

			      <p align="center">  Assesment by CIED <a href="PPM:TAB1">Access
				  to Report Exported</a> <br />
				<br/>

				<p align="left"># of ProgrammedATP: $ProgrammedATP <br />

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
		      <p align="center"><b>Recommendation and Next Step to follow </b> </p>
		      <p>Please choose the suitable option</p>
		  
			  
		      <form onsubmit="return ValidateData();" action="null" method="post">

			<input type="submit" name="D51Choice" value="ATP is programmed" onclick="btnWhichButton=this"/>
			<input type="submit" name="D51Choice" value="ATP has not been programmed" onclick="btnWhichButton=this"/>

		      </form>
		    </td>
		  </tr>
		</tbody>
	      </table>
	    </body>
	  </HTML>
	</Display>
	<NextStep ref="SBDD723A2-2616-D9CF-96DA-67B9FF844813" name="ATP is programmed">
	  <EvaluationScript>function check(SD389F35B1961B5D311CB67B6FFD0BDE1Choice) { if(SD389F35B1961B5D311CB67B6FFD0BDE1Choice.getValue().getText() == "ATP is programmed") return true; else return false; }</EvaluationScript>
	</NextStep>
	<NextStep ref="S26C9FB00-C4DF-5CDE-B360-67BA0D286223" name="ATP is not programmed">
	  <EvaluationScript>function check(SD389F35B1961B5D311CB67B6FFD0BDE1Choice) { if(SD389F35B1961B5D311CB67B6FFD0BDE1Choice.getValue().getText() == "ATP has not been programmed") return true; else return false; }</EvaluationScript>
	</NextStep>
      </ConsultStep>
      <ConsultStep ID="SBDD723A2-2616-D9CF-96DA-67B9FF844813" name="Check ATP Effective">
	<Variable name="EffectiveATP" type="integer">
	  <Concept code="737888" name="MDC_IDC_STAT_TACHYTHERAPY_ATP_DELIVERED_RECENT" schemeID="MDC_IDC"/>
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
			<a
			  href="PPM:TAB3">Access to
			  EHR</a> <br />
			Implanted Device:
			<data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
			<data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
			<br />
			Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a href="PPM:TAB1">Access
			  to previous Remote follow-up results</a> </p>

		      <p><br />
		      </p>
		    </td>
		  </tr>
		  <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      VT Episode <br />
		      <a href="PPM:TAB1">Access to Report
			Exported</a> </td>
		  </tr>
		  <tr name="EGMBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		      <p align="center"><b>Brief Information about the EGM and detected
			  problems </b> </p>

		      <table  cellspacing="10" width="100%">
			<tbody>
			  <tr>

			    <p align="center"> EGM: <a href="PPM:TAB1">Access to
				Report Exported</a> <br /> </p>


			    <p><img width="312" height="190" id="Picture1"
				src="caremanagementdb://Patient/Observation/@base64String"
				alt="x.bmp" /></p>

			  </tr>
			</tbody>
		      </table>
		    </td>
		  </tr>
		  <tr name="ChoiceBlock">
		    <td style="background-color:#eeeeee">
		      <p align="center"><b>Recommendation and Next Step to follow </b> </p>
		      <p>Please choose the suitable option</p>

  
		      <form onsubmit="return ValidateData();" action="null" method="post">

			<input type="submit" name="D54Choice" value="ATP is effective" onclick="btnWhichButton=this"/>
			<input type="submit" name="D54Choice" value="ATP was not effective" onclick="btnWhichButton=this"/>

		      </form>
		    </td>
		  </tr>
		</tbody>
	      </table>
	    </body>
	  </HTML>
	</Display>
	<NextStep ref="SAC90834E-0785-24DB-5350-67BC133FA88D" name="ATP is effective">
	  <EvaluationScript>function check(SBDD723A22616D9CF96DA67B9FF844813Choice) { if(SBDD723A22616D9CF96DA67B9FF844813Choice.getValue().getText() == "ATP is effective") return true; else return false; }</EvaluationScript>
	</NextStep>
	<NextStep ref="S26C9FB00-C4DF-5CDE-B360-67BA0D286223" name="ATP is not effective">
	  <EvaluationScript>function check(SBDD723A22616D9CF96DA67B9FF844813Choice) { if(SBDD723A22616D9CF96DA67B9FF844813Choice.getValue().getText() == "ATP was not effective") return true; else return false; }</EvaluationScript>
	</NextStep>
      </ConsultStep>
      <ConsultStep ID="SAC90834E-0785-24DB-5350-67BC133FA88D" name="Consider Decompensating Factor">
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
			<a
			  href="PPM:TAB3">Access to
			  EHR</a> <br />
			Implanted Device:
			<data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
			<data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
			<br />
			Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a href="PPM:TAB1">Access
			  to previous Remote follow-up results</a> </p>

		      <p><br />
		      </p>
		    </td>
		  </tr>
		  <!--tr name="CIEDBlock">
		    <td style="background-color:#eeeeee">

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      Alarms Detected: Atrial Fibrillation episode at a rate of 180 <br />
		      <a href="PPM:TAB1">Access to Report
			Exported</a> </td>
		  </tr-->
		  <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee">

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      VT Episode <br />
		      <a href="PPM:TAB1">Access to Report
			Exported</a> </td>
		  </tr>
		  <tr name="EGMBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		      <p align="center"><b>Brief Information about the EGM and detected
			  problems </b> </p>


		      <p align="center"> EGM: <a href="PPM:TAB1">Access to
			  Report Exported</a> <br /> </p>


		      <p><img width="312" height="190" id="Picture1"
			  src="caremanagementdb://Patient/Observation/@base64String"
			  alt="x.bmp" /></p>

		    </td>
		  </tr>
		  <tr name="ChoiceBlock">
		    <td style="background-color:#eeeeee">
		      <p align="center"><b><font color="#880015">Recommendation and Next Step to follow </font></b> </p>
		      <p>Please check whether there is a need for considering decompensating factor.</p>

		      <form onsubmit="return ValidateData();" action="null" method="post">

			<input type="submit" name="F66Choice" value="Consider Decompensating Factor!" onclick="btnWhichButton=this"/>

			<input type="submit" name="F66Choice" value="Do not consider decompensating factor!" onclick="btnWhichButton=this"/>

		      </form>

		    </td>
		  </tr>
		</tbody>
	      </table>
	    </body>
	  </HTML>
	</Display>
	<NextStep ref="SDB90A900-17C5-021C-3979-67BE0CE1D4A7" name="Consider Decompensating Factor!">
	  <EvaluationScript>function check(SAC90834E078524DB535067BC133FA88DChoice) { if(SAC90834E078524DB535067BC133FA88DChoice.getValue().getText() == "Consider Decompensating Factor!") return true; else return false; }</EvaluationScript>
	</NextStep>
	<NextStep ref="S42F61D34-3D6A-29F5-D8FD-67B19FD9CE09" name="Do not consider decompensating factor!">
	  <EvaluationScript>function check(SAC90834E078524DB535067BC133FA88DChoice) { if(SAC90834E078524DB535067BC133FA88DChoice.getValue().getText() == "Do not consider decompensating factor!") return true; else return false; }</EvaluationScript>
	</NextStep>
      </ConsultStep>
      <ConsultStep ID="S26C9FB00-C4DF-5CDE-B360-67BA0D286223" name="Check Programmed Shock">
	<Variable name="ProgrammedShock" type="integer">
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
			<a
			  href="PPM:TAB3">Access to
			  EHR</a> <br />
			Implanted Device:
			<data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
			<data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
			<br />
			Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a href="PPM:TAB1">Access
			  to previous Remote follow-up results</a> </p>

		      <p><br />
		      </p>
		    </td>
		  </tr>
		  <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      VT Episode <br />
		      <a href="PPM:TAB1">Access to Report
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
			      <p align="center"> EGM: <a href="PPM:TAB1">Access to
				  Report Exported</a> <br /> </p>


			      <p><img width="312" height="190" id="Picture1"
				  src="caremanagementdb://Patient/Observation/@base64String"
				  alt="x.bmp" /></p>
			    </td>
			    <td><!--The following HTML will be populated in the execution step-->

			      <p align="center">  Assesment by CIED <a href="PPM:TAB1">Access
				  to Report Exported</a> <br />
				<br/>

				<p align="left"># of ProgrammedShock: $ProgrammedShock <br />

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
		      <p align="center"><b>Recommendation and Next Step to follow </b> </p>
		      <p>Please choose the suitable option</p>

		     <form onsubmit="return ValidateData();" action="null" method="post">

			<input type="submit" name="D52Choice" value="Shock is programmed and delivered" onclick="btnWhichButton=this"/>
			<input type="submit" name="D52Choice" value="Shock was not delivered" onclick="btnWhichButton=this"/>

		      </form>
		    </td>
		  </tr>
		</tbody>
	      </table>
	    </body>
	  </HTML>
	</Display>
	<NextStep ref="SC9D1AEBC-DBDD-0F0C-BE08-67C1E882AB9B" name="Shock is programmed">
	  <EvaluationScript>function check(S26C9FB00C4DF5CDEB36067BA0D286223Choice) { if(S26C9FB00C4DF5CDEB36067BA0D286223Choice.getValue().getText() == "Shock is programmed and delivered") return true; else return false; }</EvaluationScript>
	</NextStep>
	<NextStep ref="S38E1EFCE-33D8-63CC-7074-67C2032C8FBD" name="Shock is not programmed">
	  <EvaluationScript>function check(S26C9FB00C4DF5CDEB36067BA0D286223Choice) { if(S26C9FB00C4DF5CDEB36067BA0D286223Choice.getValue().getText() == "Shock was not delivered") return true; else return false; }</EvaluationScript>
	</NextStep>
      </ConsultStep>
      <ConsultStep ID="SC9D1AEBC-DBDD-0F0C-BE08-67C1E882AB9B" name="Check Shock Effective">
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
			<a
			  href="PPM:TAB3">Access to
			  EHR</a> <br />
			Implanted Device:
			<data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
			<data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
			<br />
			Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a href="PPM:TAB1">Access
			  to previous Remote follow-up results</a> </p>

		      <p><br />
		      </p>
		    </td>
		  </tr>
		  <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      VT Episode <br />
		      <a href="PPM:TAB1">Access to Report
			Exported</a> </td>
		  </tr>
		  <tr name="EGMBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		      <p align="center"><b>Brief Information about the EGM and detected
			  problems </b> </p>

		      <table  cellspacing="10" width="100%">
			<tbody>
			  <tr>

			    <p align="center"> EGM: <a href="PPM:TAB1">Access to
				Report Exported</a> <br /> </p>


			    <p><img width="312" height="190" id="Picture1"
				src="caremanagementdb://Patient/Observation/@base64String"
				alt="x.bmp" /></p>

			  </tr>
			</tbody>
		      </table>
		    </td>
		  </tr>
		  <tr name="ChoiceBlock">
		    <td style="background-color:#eeeeee">
		      <p align="center"><b>Recommendation and Next Step to follow </b> </p>
		      <p>Please choose the suitable option</p>

		      <form onsubmit="return ValidateData();" action="null" method="post">

			<input type="submit" name="D53Choice" value="Shock is effective" onclick="btnWhichButton=this"/>
			<input type="submit" name="D53Choice" value="Shock was not effective" onclick="btnWhichButton=this"/>

		      </form>
		    </td>
		  </tr>
		</tbody>
	      </table>
	    </body>
	  </HTML>
	</Display>
	<NextStep ref="SDB90A900-17C5-021C-3979-67BE0CE1D4A7" name="Shock is effective">
	  <EvaluationScript>function check(SC9D1AEBCDBDD0F0CBE0867C1E882AB9BChoice) { if(SC9D1AEBCDBDD0F0CBE0867C1E882AB9BChoice.getValue().getText() == "Shock is effective") return true; else return false; }</EvaluationScript>
	</NextStep>
	<NextStep ref="S9185EB27-52A0-0AF7-EB00-67C51BD5B7B0" name="Shock is not effective">
	  <EvaluationScript>function check(SC9D1AEBCDBDD0F0CBE0867C1E882AB9BChoice) {  if(SC9D1AEBCDBDD0F0CBE0867C1E882AB9BChoice.getValue().getText() == "Shock was not effective") return true; else return false; }</EvaluationScript>
	</NextStep>
      </ConsultStep>
      <RecommendationStep ID="S38E1EFCE-33D8-63CC-7074-67C2032C8FBD" name="Perform self monitoring">
	<Receiver ref="P4"/>
	<Urgency>3</Urgency>
	<Display>
	  <HTML>
	    <p>Perform self monitoring and send the ICD Report.</p>

	  </HTML>
	</Display>
	<NextStep ref="S745C6F96-E147-271D-3E14-67C705E833E9"/>
      </RecommendationStep>
      <WaitStep ID="S745C6F96-E147-271D-3E14-67C705E833E9" name="Wait till the CIED report is received">
	<Event>
	  <DataSource code="C0581396" name="Cardiac implant device" schemeID="UMLS"/>
	</Event>
	<NextStep ref="S7B7A20B9-F883-163A-DE95-67C8D6BEDE6C" name="Send notification to Doctor"/>
      </WaitStep> 
      <ConsultStep ID="S7B7A20B9-F883-163A-DE95-67C8D6BEDE6C" name="Present the EGM, check VT">
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
			<a
			  href="PPM:TAB3">Access to
			  EHR</a> <br />
			Implanted Device:
			<data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
			<data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
			<br />
			Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a href="PPM:TAB1">Access
			  to previous Remote follow-up results</a> </p>

		      <p><br />
		      </p>
		    </td>
		  </tr>
		  <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      VT Episode <br />
		      <a href="PPM:TAB1">Access to Report
			Exported</a> </td>
		  </tr>
		  <tr name="EGMBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		      <p align="center"><b>Brief Information about the EGM and detected
			  problems </b> </p>

		      <table  cellspacing="10" width="100%">
			<tbody>
			  <tr>

			    <p align="center"> EGM: <a href="PPM:TAB1">Access to
				Report Exported</a> <br /> </p>


			    <p><img width="312" height="190" id="Picture1"
				src="caremanagementdb://Patient/Observation/@base64String"
				alt="x.bmp" /></p>

			  </tr>
			</tbody>
		      </table>
		    </td>
		  </tr>
		  <tr name="ChoiceBlock">
		    <td style="background-color:#eeeeee">
		      <p align="center"><b>Recommendation and Next Step to follow </b> </p>
		      <p>Patient performed the self monitoring. Check the recent EGM sent by the patient and indicate whether there is VT or not.</p>
		      <form onsubmit="return ValidateData();" action="null" method="post">
			<input type="submit" name="D55Choice" value="There is VT persistent!" onclick="btnWhichButton=this"/>
			<input type="submit" name="D55Choice" value="There is no VT!" onclick="btnWhichButton=this"/>										
		      </form>
		    </td>
		  </tr>
		</tbody>
	      </table>
	    </body>
	  </HTML>
	</Display>
	<NextStep ref="S9185EB27-52A0-0AF7-EB00-67C51BD5B7B0" name="There is VT persistent!">
	  <EvaluationScript>function check(S7B7A20B9F883163ADE9567C8D6BEDE6CChoice) { if(S7B7A20B9F883163ADE9567C8D6BEDE6CChoice.getValue().getText() == "The case is VT!") return true; else return false; }</EvaluationScript>
	</NextStep>
	<NextStep ref="SDB90A900-17C5-021C-3979-67BE0CE1D4A7" name="The case is no VT!">
	  <EvaluationScript>function check(S7B7A20B9F883163ADE9567C8D6BEDE6CChoice) { if(S7B7A20B9F883163ADE9567C8D6BEDE6CChoice.getValue().getText() == "There is no VT!") return true; else return false; }</EvaluationScript>
	</NextStep>	
      </ConsultStep>
      <RecommendationStep ID="S9185EB27-52A0-0AF7-EB00-67C51BD5B7B0" name="Urgent follow-up in hospital">
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
			<a
			  href="PPM:TAB3">Access to
			  EHR</a> <br />
			Implanted Device:
			<data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
			<data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
			<br />
			Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a href="PPM:TAB1">Access
			  to previous Remote follow-up results</a> </p>

		      <p><br />
		      </p>
		    </td>
		  </tr>
		  <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      Alarms Detected: VT Episode <br />
		      <a href="PPM:TAB1">Access to Report
			Exported</a> </td>
		  </tr>
		  <tr name="RecommendationBlock">
		    <td style="background-color:#eeeeee">
		      <p align="center"><b><font color="#880015">Recommendation and Next Step to follow</font> </b> </p>
		      <p>Persistent VT is detected. Arange an urgent follow-up in the clinic and call the patient.</p>

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
	<NextStep ref="S42F61D34-3D6A-29F5-D8FD-67B19FD9CE09"/>
      </RecommendationStep> 
      <ConsultStep ID="SDB90A900-17C5-021C-3979-67BE0CE1D4A7" name="Present Medications Compliance and Medication Change">
	<Variable name="MedicationsEHR" type="String[]">
	  <DataSource code="C2362543" name="Electronic Health Records" schemeID="UMLS"/>
	  <DataSource code="C2598133" name="Medication" schemeID="UMLS"/>
	</Variable>
	<Variable name="MedicationsPHR" type="String[]">
	  <DataSource code="C0018739" name="Health Records, Personal" schemeID="UMLS"/>
	  <DataSource code="C2598133" name="Medication" schemeID="UMLS"/>
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
			<a
			  href="PPM:TAB3">Access to
			  EHR</a> <br />
			Implanted Device:
			<data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
			<data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
			<br />
			Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a href="PPM:TAB1">Access
			  to previous Remote follow-up results</a> </p>

		      <p><br />
		      </p>
		    </td>
		  </tr>
		  <!--tr name="CIEDBlock">
		    <td style="background-color:#eeeeee">

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      Alarms Detected: Atrial Fibrillation episode at a rate of 180 <br />
		      <a href="PPM:TAB1">Access to Report
			Exported</a> </td>
		  </tr-->
		  <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee">

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      VT Episode <br />
		      <a href="PPM:TAB1">Access to Report
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
			  </tr>
			  <script>
			    <arguments>$MedicationsEHR, $MedicationsPHR</arguments>
			    <content>function generate(ehrMeds, phrMeds) { var e; var p; var output = ''; for(e=0; e&lt;ehrMeds.length;e++) { var ehrMed = ehrMeds[e]; var effectiveTimeHighEHR = ehrMed.getEffectiveTimeHigh(); if(!isActiveDate(effectiveTimeHighEHR)) continue; output = output + '&lt;tr&gt;'; var useIt = 'No'; for(p=0; p&lt;phrMeds.length;p++) { var phrMed = phrMeds[p];	var effectiveTimeHighPHR = phrMed.getEffectiveTimeHigh(); if(!isActiveDate(effectiveTimeHighPHR)) continue; if(ehrMed.getDrugCode().equals(phrMed.getDrugCode())) { useIt = '&lt;font color=\"#880015\"&gt;&lt;b&gt;Yes: ' + phrMed.getDoseQuantity() + ' mg&lt;/b&gt;&lt;/font&gt;'; }  } var line = '&lt;td&gt;' + ehrMed.getText() + ':' + ehrMed.getDoseQuantity() + ' mg&lt;/td&gt;' + '&lt;td&gt;' + useIt + '&lt;/td&gt;' + '&lt;td&gt;'; output = output + line; output = output + '&lt;/tr&gt;'; }  return output; }</content>
			  </script>

			</tbody>
		      </table>
		    </td>
		  </tr>
		  <tr name="ChoiceBlock">
		    <td style="background-color:#eeeeee"><p align="center"><b><font color="#880015">Recommendation
			    and Next Step to follow </font></b> </p>
		      <p>Please select the appropriate case: </p>
		      <form onsubmit="return ValidateData();" action="null" method="post">
			<input type="submit" name="F6Choice" value="The patient regulary takes her medications" onclick="btnWhichButton=this"/>
			<input type="submit" name="F6Choice" value="There is medication incompliance/medication change" onclick="btnWhichButton=this"/>
		      </form>
		    </td>
		  </tr>
		</tbody>
	      </table>
	    </body>
	  </HTML>
	</Display>
	<NextStep ref="S4105C271-9A29-9749-DF2F-67CDEBA6879B" name="There is medication incompliance/medication change">
	  <EvaluationScript>function check(SDB90A90017C5021C397967BE0CE1D4A7Choice) { if(SDB90A90017C5021C397967BE0CE1D4A7Choice.getValue().getText() == "There is medication incompliance/medication change") return true; else return false; }</EvaluationScript>
	</NextStep>
	<NextStep ref="S3020C9A9-10AC-0EB5-EEAC-680FDC81033E" name="The patient regulary takes her medications">
	  <EvaluationScript>function check(SDB90A90017C5021C397967BE0CE1D4A7Choice) { if(SDB90A90017C5021C397967BE0CE1D4A7Choice.getValue().getText() == "The patient regulary takes her medications") return true; else return false; }</EvaluationScript>
	</NextStep>
      </ConsultStep>
      <ConsultStep ID="S3020C9A9-10AC-0EB5-EEAC-680FDC81033E" name="Check patient reported Symptoms">
	<Variable name="Vomit" type="string">
	  <DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	  <DataSource code="C0033213" name="Problem" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var x="no"; var y=0; var names=list.toArray(); for(var i=0; i &lt; names.length;i++) { var problem = names[i]; var effectiveTimeHigh = problem.getEffectiveTimeHigh(); if(!isActiveDate(effectiveTimeHigh)) continue; if(problem.getProblemValue().equals("C0042963")) y=y+1; } if(y>0) { x="yes"; } return x; }</RefinementScript>
	</Variable>
	<Variable name="Diarrhea" type="string">
	  <DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	  <DataSource code="C0033213" name="Problem" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var x="no"; var y=0; var names=list.toArray(); for(var i=0; i &lt; names.length;i++) { var problem = names[i]; var effectiveTimeHigh = problem.getEffectiveTimeHigh(); if(!isActiveDate(effectiveTimeHigh)) continue; if(problem.getProblemValue().equals("C0011991")) y=y+1; } if(y>0) { x="yes"; } return x; }</RefinementScript>
	</Variable>
	<Variable name="ChestPain" type="string">
	  <DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	  <DataSource code="C0033213" name="Problem" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var x="no"; var y=0; var names=list.toArray(); for(var i=0; i &lt; names.length;i++) { var problem = names[i]; var effectiveTimeHigh = problem.getEffectiveTimeHigh(); if(!isActiveDate(effectiveTimeHigh)) continue; if(problem.getProblemValue().equals("C0042963")) y=y+1; } if(y>0) { x="yes"; } return x; }</RefinementScript>
	</Variable>
	<Variable name="ShortnessofBreath" type="string">
	  <DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	  <DataSource code="C0033213" name="Problem" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var x="no"; var y=0; var names=list.toArray(); for(var i=0; i &lt; names.length;i++) { var problem = names[i]; var effectiveTimeHigh = problem.getEffectiveTimeHigh(); if(!isActiveDate(effectiveTimeHigh)) continue; if(problem.getProblemValue().equals("C0008031")) y=y+1; } if(y>0) { x="yes"; } return x; }</RefinementScript>
	</Variable>
	<Variable name="WeightGain" type="string">
	  <DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	  <DataSource code="C0033213" name="Problem" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var x="no"; var y=0; var names=list.toArray(); for(var i=0; i &lt; names.length;i++) { var problem = names[i]; var effectiveTimeHigh = problem.getEffectiveTimeHigh(); if(!isActiveDate(effectiveTimeHigh)) continue; if(problem.getProblemValue().equals("C0043094")) y=y+1; } if(y>0) { x="yes"; } return x; }</RefinementScript>
	</Variable>
	<Variable name="Fever" type="string">
	  <DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	  <DataSource code="C0033213" name="Problem" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var x="no"; var y=0; var names=list.toArray(); for(var i=0; i &lt; names.length;i++) { var problem = names[i]; var effectiveTimeHigh = problem.getEffectiveTimeHigh(); if(!isActiveDate(effectiveTimeHigh)) continue; if(problem.getProblemValue().equals("C0015967")) y=y+1; } if(y>0) { x="yes"; } return x; }</RefinementScript>
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
			<a
			  href="PPM:TAB3">Access to
			  EHR</a> <br />
			Implanted Device:
			<data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
			<data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
			<br />
			Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a href="PPM:TAB1">Access
			  to previous Remote follow-up results</a> </p>

		      <p><br />
		      </p>
		    </td>
		  </tr>
		  <!--tr name="CIEDBlock">
		    <td style="background-color:#eeeeee">

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      Alarms Detected: Atrial Fibrillation episode at a rate of 180 <br />
		      <a href="PPM:TAB1">Access to Report
			Exported</a> </td>
		  </tr-->
		  <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee">

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      VT Episode <br />
		      <a href="PPM:TAB1">Access to Report
			Exported</a> </td>
		  </tr>
		  <tr name="PHRBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->
		      <p align="center"><b>Brief Information about the patient reported symptoms retrieved from PHR
		      </b> </p>

		      <table  width="100%">
			<tbody>

			  <tr>
			    <td>Patient Reported Symptoms </td>
			    <td>Value</td>
			  </tr>
			  <tr>
			    <td>Vomit</td>
			    <td>
			      $Vomit
			      <a href="PPM:TAB3">Access to PHR</a> 
				  <br />
			    </td>
			  </tr>
			  <tr>
			    <td>Diarrhea</td>
			    <td>
			      $Diarrhea
			      <a href="PPM:TAB3">Access to PHR</a> 
			    </td>
			  </tr>
			  <tr>
			    <td>Chest Pain</td>
			    <td>
			      $ChestPain
			      <a href="PPM:TAB3">Access to PHR</a> 
			    </td>
			  </tr>
			  <tr>
			    <td>Shortness of Breath</td>
			    <td>
			      $ShortnessofBreath
			      <a href="PPM:TAB3">Access to PHR</a> 
			    </td>
			  </tr>
			  <tr>
			    <td>Weight Gain</td>
			    <td>
			      $WeightGain
			      <a href="PPM:TAB3">Access to PHR</a> 
			    </td>
			  </tr>
			  <tr>
			    <td>Fever</td>
			    <td>
			      $Fever
			      <a href="PPM:TAB3">Access to PHR</a> 
			    </td>
			  </tr>

			</tbody>
		      </table>
		    </td>
		  </tr>
		  <tr name="ChoiceBlock">
		    <td style="background-color:#eeeeee"><p align="center"><b><font color="#880015">Recommendation
			    and Next Step to follow </font></b> </p>
		      <p ID="DecisionParagraph">Please confirm whether patient reported any of these symptoms.</p>

		      <form onsubmit="return ValidateData();" action="null" method="post">
			<input type="submit" name="S63Choice" value="Yes" onclick="btnWhichButton=this"/>
			<input type="submit" name="S63Choice" value="No, there is no such symptoms" onclick="btnWhichButton=this"/>
		      </form>
		    </td>
		  </tr>
		</tbody>
	      </table>
	    </body>
	  </HTML>
	</Display>
	<NextStep ref="S5927F96D-BA49-15E8-9518-68130F5A1DAC" name="Yes">
	  <EvaluationScript>function check(S3020C9A910AC0EB5EEAC680FDC81033EChoice) { if(S3020C9A910AC0EB5EEAC680FDC81033EChoice.getValue().getText() == "Yes") return true; else return false; }</EvaluationScript>
	</NextStep>
	<NextStep ref="SC1C33A2B-82A8-E3CE-EBE5-68131F08323B" name="No, patient has no such symptoms">
	  <EvaluationScript>function check(S3020C9A910AC0EB5EEAC680FDC81033EChoice) { if(S3020C9A910AC0EB5EEAC680FDC81033EChoice.getValue().getText() == "No, there is no such symptoms") return true; else return false; }</EvaluationScript>
	</NextStep>
      </ConsultStep>
      <ConsultStep ID="SC1C33A2B-82A8-E3CE-EBE5-68131F08323B" name="Check Recent Lab Results">
	<Variable name="LastLabResultDate" type="date">
	  <DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	  <DataSource code="C1254595" name="ImagingResult" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var names=list.toArray(); var labResult = names[0]; var effectiveTime = labResult.getEffectiveTime(); var dayDiff=dayDifference(effectiveTime); effectiveTime = effectiveTime + ': ' + dayDiff + ' days ago.'; return effectiveTime; }</RefinementScript>
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
			<a
			  href="PPM:TAB3">Access to
			  EHR</a> <br />
			Implanted Device:
			<data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
			<data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
			<br />
			Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a href="PPM:TAB1">Access
			  to previous Remote follow-up results</a> </p>

		      <p><br />
		      </p>
		    </td>
		  </tr>
		  <!--tr name="CIEDBlock">
		    <td style="background-color:#eeeeee">

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      Alarms Detected: Atrial Fibrillation episode at a rate of 180 <br />
		      <a href="PPM:TAB1">Access to Report
			Exported</a> </td>
		  </tr-->
		  <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee">

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      VT Episode <br />
		      <a href="PPM:TAB1">Access to Report
			Exported</a> </td>
		  </tr>
		  <tr name="RecommendationBlock">
		    <td style="background-color:#eeeeee">
		      <p align="center"><b><font color="#880015">Recommendation and Next Step to follow </font></b> </p>
		      <p>Date of most recent Lab Result = $LastLabResultDate <br/> If the date of most recent lab result is not within the last week, it is recommended to order a new lab test. Please confirm if a new lab order is required:</p>

		     <form onsubmit="return ValidateData();" action="null" method="post">
			<input type="submit" name="D64Choice" value="Yes, Please order a new Lab result" onclick="btnWhichButton=this"/>
			<input type="submit" name="D64Choice" value="No, there is no need for a new lab test" onclick="btnWhichButton=this"/>
		    </form></td>
		  </tr>
		</tbody>
	      </table>
	    </body>
	  </HTML>
	</Display>				
	<NextStep ref="S46AC9672-A770-9CA4-744E-681687250C71" name="Order Lab Test">
	  <EvaluationScript>function check(SC1C33A2B82A8E3CEEBE568131F08323BChoice) { if(SC1C33A2B82A8E3CEEBE568131F08323BChoice.getValue().getText() == "Yes, Please order a new Lab result") return true; else return false; }</EvaluationScript>
	</NextStep>
	<NextStep ref="S2E364938-846A-7C11-B160-681691D331D9" name="Check Lab Results">
	  <EvaluationScript>function check(SC1C33A2B82A8E3CEEBE568131F08323BChoice) { if(SC1C33A2B82A8E3CEEBE568131F08323BChoice.getValue().getText() == "No, there is no need for a new lab test") return true; else return false; }</EvaluationScript>
	</NextStep>
      </ConsultStep>	
      <RecommendationStep ID="S46AC9672-A770-9CA4-744E-681687250C71" name="Order new Lab Test">
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
			<a
			  href="PPM:TAB3">Access to
			  EHR</a> <br />
			Implanted Device:
			<data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
			<data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
			<br />
			Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a href="PPM:TAB1">Access
			  to previous Remote follow-up results</a> </p>

		      <p><br />
		      </p>
		    </td>
		  </tr>
		  <!--tr name="CIEDBlock">
		    <td style="background-color:#eeeeee">

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      Alarms Detected: VT detected.. <br />
		      <a href="PPM:TAB1">Access to Report
			Exported</a> </td>
		  </tr-->
		   <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee">

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      VT Episode <br />
		      <a href="PPM:TAB1">Access to Report
			Exported</a> </td>
		  </tr>
		  <tr name="RecommendationBlock">
		    <td style="background-color:#eeeeee">
		      <p align="center"><b><font color="#880015">Recommendation and Next Step to follow </font> </b></p>
		      <p>The most recent lab test is older than one week, please order a new test, call the patient and continue the care plan when the results of this test are uploaded to iCARDEA System.</p>

		      <form onsubmit="return ValidateData();" action="null" method="post">
			<input type="submit" name="D5Choice" value="Continue" onclick="btnWhichButton=this"/>
		    </form></td>
		  </tr>
		</tbody>
	      </table>
	    </body>
	  </HTML>
	</Display>
	<NextStep ref="S58242B33-8089-534E-9B43-6818C16BCA3E"/>
      </RecommendationStep>
      <WaitStep ID="S58242B33-8089-534E-9B43-6818C16BCA3E" name="Wait till the Lab results are received">
	<Event>
	  <DataSource code="C1254595" name="ImagingResult" schemeID="UMLS"/>
	  <DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	</Event>
	<NextStep ref="S2E364938-846A-7C11-B160-681691D331D9" name="Send notification to Doctor"/>
      </WaitStep> 
      <ConsultStep ID="S2E364938-846A-7C11-B160-681691D331D9" name="Check Lab results for abnormality">

	<Variable name="Potassium" type="float">
	  <Concept code="C0202194" schemeID="UMLS"/>
	  <DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	  <DataSource code="C1254595" name="ImagingResult" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var y=0; var names=list.toArray();	for(var i=0; i &lt; names.length;i++) { y=names[i].getLabResultValue(); } return y; }</RefinementScript>
	</Variable>

	<Variable name="Hemoglobin" type="float">
	  <Concept code="C0518015" schemeID="UMLS"/>
	  <DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	  <DataSource code="C1254595" name="ImagingResult" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var y=0; var names=list.toArray();	for(var i=0; i &lt; names.length;i++) { y=names[i].getLabResultValue(); } return y; }</RefinementScript>
	</Variable>
	<Variable name="Sodium" type="float">
	  <Concept code="C0037473" schemeID="UMLS"/>
	  <DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	  <DataSource code="C1254595" name="ImagingResult" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var y=0; var names=list.toArray();	for(var i=0; i &lt; names.length;i++) { y=names[i].getLabResultValue(); } return y; }</RefinementScript>
	</Variable>
	<Variable name="Chloride" type="float">
	  <Concept code="C0201952" schemeID="UMLS"/>
	  <DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	  <DataSource code="C1254595" name="ImagingResult" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var y=0; var names=list.toArray();	for(var i=0; i &lt; names.length;i++) { y=names[i].getLabResultValue(); } return y; }</RefinementScript>
	</Variable>
	<Variable name="Creatinine" type="float">
	  <Concept code="C0201975" schemeID="UMLS"/>
	  <DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	  <DataSource code="C1254595" name="ImagingResult" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var y=0; var names=list.toArray();	for(var i=0; i &lt; names.length;i++) { y=names[i].getLabResultValue(); } return y; }</RefinementScript>
	</Variable>
	<Variable name="Troponin" type="float">
	  <Concept code="C0077404" schemeID="UMLS"/>
	  <DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	  <DataSource code="C1254595" name="ImagingResult" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var y=0; var names=list.toArray();	for(var i=0; i &lt; names.length;i++) { y=names[i].getLabResultValue(); } return y; }</RefinementScript>
	</Variable>

	<Variable name="LabAbnormality" type="boolean">
	  <Concept code="C0522473" name="Contraindication" schemeID="UMLS"/>
	  <DataSource code="C0178916" name="Care plan" schemeID="UMLS"/>
	  <RefinementScript>function refine()	{ var y = $Sodium &lt; 135 || $Sodium > 148 || $Chloride &lt; 97 || $Chloride > 108 || $Potassium &lt; 3.9 || $Potassium > 5.4 || $Hemoglobin &lt; 11.7 || $Hemoglobin > 15.7 || $Creatinine &lt; 0.5 || $Creatinine > 1.1 || $Troponin >14; return y;}</RefinementScript>
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
			<a
			  href="PPM:TAB3">Access to
			  EHR</a> <br />
			Implanted Device:
			<data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
			<data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
			<br />
			Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a href="PPM:TAB1">Access
			  to previous Remote follow-up results</a> </p>

		      <p><br />
		      </p>
		    </td>
		  </tr>
		  <!--tr name="CIEDBlock">
		    <td style="background-color:#eeeeee">

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      Alarms Detected: Atrial Fibrillation episode at a rate of 180 <br />
		      <a href="PPM:TAB1">Access to Report
			Exported</a> </td>
		  </tr-->
		   <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee">

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      VT Episode <br />
		      <a href="PPM:TAB1">Access to Report
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
			    <td>Potassium</td>
			    <td>
			      $Potassium
			       <a href="PPM:TAB3">Access to EHR</a>
			    </td>
			    <td>3.9-5.4 U/l</td>
			  </tr>
			  <tr>
			    <td>Hemoglobin</td>
			    <td>
			      $Hemoglobin
			       <a href="PPM:TAB3">Access to EHR</a>
			    </td>
			    <td>11.7-15.7 U/l</td>
			  </tr>
			  <tr>
			    <td>Sodium</td>
			    <td>
			      $Sodium
			       <a href="PPM:TAB3">Access to EHR</a>
			    </td>
			    <td>135-148 U/l</td>
			  </tr>
			  <tr>
			    <td>Chloride</td>
			    <td>
			      $Chloride
			       <a href="PPM:TAB3">Access to EHR</a>
			    </td>
			    <td>97-108 U/l</td>
			  </tr>
			  <tr>
			    <td>Creatinine</td>
			    <td>
			      $Creatinine
			       <a href="PPM:TAB3">Access to EHR</a>
			    </td>
			    <td>0.5-1.1 U/l</td>
			  </tr>
			  <tr>
			    <td>Troponin</td>
			    <td>
			      $Troponin
			       <a href="PPM:TAB3">Access to EHR</a>
			    </td>
			    <td>should be less than 14 U/l</td>
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
				   <a href="PPM:TAB3">Access to EHR</a>
				</td>
			  </tr>
			  <tr>
				<td>Heart failure:</td>
				<td>
				  $HeartFailure
				   <a href="PPM:TAB3">Access to EHR</a>
				</td>
			  </tr>
			  <tr>
				<td>Diabetes:</td>
				<td>
				  $Diabetes
				   <a href="PPM:TAB3">Access to EHR</a>
				</td>
			  </tr>
			  <tr>
				<td>Atrial arrhythmia:</td>
				<td>
				  $AtrialArrhythmia
				   <a href="PPM:TAB3">Access to EHR</a>
				</td>
			  </tr>			  
			</tbody>
			  </table>

			</td>
			</tr>
		<tr name="ChoiceBlock">
		  <td style="background-color:#eeeeee"><p align="center"><b><font color="#880015">Recommendation
			  and Next Step to follow </font></b> </p>
		    <p ID="DecisionParagraph">The <font color="#880015">Lab Results Abnormality status is $LabAbnormality </font>. Do you confirm?</p>

		    <form onsubmit="return ValidateData();" action="null" method="post">
		      <input type="submit" name="D65Choice" value="Yes, there is!" onclick="btnWhichButton=this"/>
		      <input type="submit" name="D65Choice" value="No, there is no abnormality" onclick="btnWhichButton=this"/>
		    </form>
		  </td>
		</tr>
	      </tbody>
	    </table>
	  </body> 
	</HTML>
      </Display>
      <NextStep ref="S78F3D07E-FAFB-434E-AEC4-681AC24087BB" name="Yes, there is!">
	<EvaluationScript>function check(S2E364938846A7C11B160681691D331D9Choice) { if(S2E364938846A7C11B160681691D331D9Choice.getValue().getText() == "Yes, there is!") return true; else return false; }</EvaluationScript>
      </NextStep>
      <NextStep ref="S1512EF69-7DB0-A65F-A649-681ACDCBBD57" name="No, there is no abnormality">
	<EvaluationScript>function check(S2E364938846A7C11B160681691D331D9Choice) { if(S2E364938846A7C11B160681691D331D9Choice.getValue().getText() == "No, there is no abnormality") return true; else return false; }</EvaluationScript>
      </NextStep>
    </ConsultStep>
      <RecommendationStep ID="S4105C271-9A29-9749-DF2F-67CDEBA6879B" name="Take Corrective Action about Medication incompliance">
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
		      <a
			href="PPM:TAB3">Access to
			EHR</a> <br />
		      Implanted Device:
		      <data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
		      <data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
		      <br />
		      Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a href="PPM:TAB1">Access
			to previous Remote follow-up results</a> </p>

		    <p><br />
		    </p>
		  </td>
		</tr>
		<!--tr name="CIEDBlock">
		  <td style="background-color:#eeeeee">

		    <p align="center"><b>Brief Information about the recent alarm </b></p>
		    Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		    Alarms Detected: VT detected.. <br />
		    <a href="PPM:TAB1">Access to Report
		      Exported</a> </td>
		</tr-->
		 <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee">

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      VT Episode <br />
		      <a href="PPM:TAB1">Access to Report
			Exported</a> </td>
		  </tr>
		<tr name="RecommendationBlock">
		  <td style="background-color:#eeeeee">
		    <p align="center"><b><font color="#880015">Recommendation and Next Step to follow </font> </b></p>
		    <p>Based on the data retrieved from the PHR, Medication incompliance has been observed, this could be the underlying reason for the CIED Alert, Please take the corrective action.</p>

		    <form onsubmit="return ValidateData();" action="null" method="post">
		      <input type="submit" name="D5Choice" value="Continue" onclick="btnWhichButton=this"/>
		  </form></td>
		</tr>
	      </tbody>
	    </table>
	  </body>
	</HTML>
      </Display>
      <NextStep ref="S42F61D34-3D6A-29F5-D8FD-67B19FD9CE09"/>
    </RecommendationStep>
      <RecommendationStep ID="S5927F96D-BA49-15E8-9518-68130F5A1DAC" name="Take Corrective Action about Patient reported symptoms">
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
		      <a
			href="PPM:TAB3">Access to
			EHR</a> <br />
		      Implanted Device:
		      <data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
		      <data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
		      <br />
		      Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a href="PPM:TAB1">Access
			to previous Remote follow-up results</a> </p>

		    <p><br />
		    </p>
		  </td>
		</tr>
		<!--tr name="CIEDBlock">
		  <td style="background-color:#eeeeee">

		    <p align="center"><b>Brief Information about the recent alarm </b></p>
		    Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		    Alarms Detected: VT detected.. <br />
		    <a href="PPM:TAB1">Access to Report
		      Exported</a> </td>
		</tr-->
		 <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee">

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      VT Episode <br />
		      <a href="PPM:TAB1">Access to Report
			Exported</a> </td>
		  </tr>
		<tr name="RecommendationBlock">
		  <td style="background-color:#eeeeee">
		    <p align="center"><b><font color="#880015">Recommendation and Next Step to follow </font> </b></p>
		    <p>Based on the data retrieved from the PHR, Patient related symptoms have been observed, these could be related with the CIED Alert, Please take the corrective action.</p>

		    <form onsubmit="return ValidateData();" action="null" method="post">
		      <input type="submit" name="D5Choice" value="Continue" onclick="btnWhichButton=this"/>
		  </form></td>
		</tr>
	      </tbody>
	    </table>
	  </body>
	</HTML>
      </Display>
      <NextStep ref="S42F61D34-3D6A-29F5-D8FD-67B19FD9CE09"/>
    </RecommendationStep>
      <RecommendationStep ID="S78F3D07E-FAFB-434E-AEC4-681AC24087BB" name="Take Corrective Action about recent lab results">
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
		      <a
			href="PPM:TAB3">Access to
			EHR</a> <br />
		      Implanted Device:
		      <data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
		      <data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
		      <br />
		      Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a href="PPM:TAB1">Access
			to previous Remote follow-up results</a> </p>

		    <p><br />
		    </p>
		  </td>
		</tr>
		<!--tr name="CIEDBlock">
		  <td style="background-color:#eeeeee">

		    <p align="center"><b>Brief Information about the recent alarm </b></p>
		    Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		    Alarms Detected: VT detected.. <br />
		    <a href="PPM:TAB1">Access to Report
		      Exported</a> </td>
		</tr-->
		 <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee">

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      VT Episode <br />
		      <a href="PPM:TAB1">Access to Report
			Exported</a> </td>
		  </tr>
		<tr name="RecommendationBlock">
		  <td style="background-color:#eeeeee">
		    <p align="center"><b><font color="#880015">Recommendation and Next Step to follow </font> </b></p>
		    <p>Based on the data retrieved from the EHR, Abnormality has been observed in the most recent lab results, this could be related with the CIED Alert, Please take the corrective action.</p>

		    <form onsubmit="return ValidateData();" action="null" method="post">
		      <input type="submit" name="D5Choice" value="Continue" onclick="btnWhichButton=this"/>
		  </form></td>
		</tr>
	      </tbody>
	    </table>
	  </body>
	</HTML>
      </Display>
      <NextStep ref="S42F61D34-3D6A-29F5-D8FD-67B19FD9CE09"/>
    </RecommendationStep>
      <ConsultStep ID="S1512EF69-7DB0-A65F-A649-681ACDCBBD57" name="Consider Anti arrhythmic drug">
      <Variable name="CongenitalHeartDisease" type="boolean">
	<Concept code="C0152021" name="Congenital heart disease" schemeID="UMLS"/>
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
			<a
			  href="PPM:TAB3">Access to
			  EHR</a> <br />
			Implanted Device:
			<data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
			<data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
			<br />
			Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a href="PPM:TAB1">Access
			  to previous Remote follow-up results</a> </p>

		      <p><br />
		      </p>
		    </td>
		  </tr>
		  <!--tr name="CIEDBlock">
		    <td style="background-color:#eeeeee">

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      Alarms Detected: Atrial Fibrillation episode at a rate of 180 <br />
		      <a href="PPM:TAB1">Access to Report
			Exported</a> </td>
		  </tr-->
		   <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee">

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      VT Episode <br />
		      <a href="PPM:TAB1">Access to Report
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
			  <td>Congenital Heart Disease</td>
			  <td>
			    $CongenitalHeartDisease  <a href="PPM:TAB3">Access to EHR</a>
			  </td>
			</tr>

		      </tbody>
		    </table>
		  </td>
		</tr>
		<tr name="EGMBlock">
		  <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		    <p align="center"><b>Brief Information about the EGM and detected
			problems </b> </p>

		    <table  cellspacing="10" width="100%">
		      <tbody>
			<tr>

			  <p align="center"> EGM: <a href="PPM:TAB1">Access to
			      Report Exported</a> <br /> </p>


			  <p><img width="312" height="190" id="Picture1"
			      src="caremanagementdb://Patient/Observation/@base64String"
			      alt="x.bmp" /></p>

			</tr>
		      </tbody>
		    </table>
		  </td>
		</tr>
		<tr name="ChoiceBlock">
		  <td style="background-color:#eeeeee"><p align="center"><b><font color="#880015">Recommendation
			  and Next Step to follow </font> </b></p>
		    <p> Please choose among the appropriate options <br/>

		    </p>

		    <form onsubmit="return ValidateData();" action="null" method="post">
		      <input type="submit" name="F8Choice" value="There is no Congenital Heart Disease" onclick="btnWhichButton=this"/>
		      <input type="submit" name="F8Choice" value="There is Congenital Heart Disease and Sustained VT" onclick="btnWhichButton=this"/>
		      <input type="submit" name="F8Choice" value="There is Congenital Heart Disease and Non-Sustained VT" onclick="btnWhichButton=this"/>
		      <input type="submit" name="F8Choice" value="There is Congenital Heart Disease and Isolated PVCs" onclick="btnWhichButton=this"/>
		    </form>
		  </td>
		</tr>
	      </tbody>
	    </table>
	  </body>
	</HTML>
      </Display>
      <NextStep ref="S2D184FF1-7280-1AB7-81E5-681DE9DE3168" name="There is no Congenital Heart Disease">
	<EvaluationScript>function check(S1512EF697DB0A65FA649681ACDCBBD57Choice) { if(S1512EF697DB0A65FA649681ACDCBBD57Choice.getValue().getText() == "There is no Congenital Heart Disease") return true; else return false; }</EvaluationScript>		
	</NextStep><NextStep ref="S8D06F33C-A0D7-9A1F-AAEF-681DCFEEE12B" name="There is Congenital Heart Disease and Non-Sustained VT">
	<EvaluationScript>function check(S1512EF697DB0A65FA649681ACDCBBD57Choice) { if(S1512EF697DB0A65FA649681ACDCBBD57Choice.getValue().getText() == "There is Congenital Heart Disease and Non-Sustained VT") return true; else return false; }</EvaluationScript>		
	</NextStep><NextStep ref="S254A202C-94C4-CA29-3884-681DDC0A37BA" name="There is Congenital Heart Disease and Sustained VT">
	<EvaluationScript>function check(S1512EF697DB0A65FA649681ACDCBBD57Choice) { if(S1512EF697DB0A65FA649681ACDCBBD57Choice.getValue().getText() == "There is Congenital Heart Disease and Sustained VT") return true; else return false; }</EvaluationScript>		
      </NextStep>
      <NextStep ref="S42F61D34-3D6A-29F5-D8FD-67B19FD9CE09" name="There is Congenital Heart Disease and Isolated PVCs">
	<EvaluationScript>function check(S1512EF697DB0A65FA649681ACDCBBD57Choice) { if(S1512EF697DB0A65FA649681ACDCBBD57Choice.getValue().getText() == "There is Congenital Heart Disease and Non-Sustained VT") return true; else return false; }</EvaluationScript>		
      </NextStep>
    </ConsultStep>
      <ConsultStep ID="S2D184FF1-7280-1AB7-81E5-681DE9DE3168" name="Consider Anti arrhythmic drug">
      <Variable name="LVDysfunction" type="boolean">
	<Concept code="C0242698" name="Ventricular Dysfunction, Left" schemeID="UMLS"/>
	<DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	<DataSource code="C0033213" name="Problem" schemeID="UMLS"/>
	<RefinementScript>function refine(list) { var x; var y="false"; var names=list.toArray(); for(var i=0; i &lt; names.length;i++) { y="&lt;font color=\"#880015\"&gt;&lt;b&gt;true&lt;/b&gt;&lt;/font&gt;"; } return y; }</RefinementScript>
      </Variable>
      <Variable name="DilatedCardiomyopathy" type="boolean">
	<Concept code="C0007193" name="Cardiomyopathy, Dilated" schemeID="UMLS"/>
	<DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	<DataSource code="C0033213" name="Problem" schemeID="UMLS"/>
	<RefinementScript>function refine(list) { var x; var y=false; var names=list.toArray(); for(var i=0; i &lt; names.length;i++) { y=true; } return y; }</RefinementScript>
      </Variable>
      <Variable name="HypertrophicCardiomyopathy" type="boolean">
	<Concept code="C0007194" name="Hypertrophic Cardiomyopathy" schemeID="UMLS"/>
	<DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	<DataSource code="C0033213" name="Problem" schemeID="UMLS"/>
	<RefinementScript>function refine(list) { var x; var y=false; var names=list.toArray(); for(var i=0; i &lt; names.length;i++) { y=true; } return y; }</RefinementScript>
      </Variable>
      <Variable name="ArrhythmogenicRightVentricular" type="boolean">
	<Concept code="C0349788" name="Arrhythmogenic Right Ventricular Dysplasia" schemeID="UMLS"/>
	<DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	<DataSource code="C0033213" name="Problem" schemeID="UMLS"/>
	<RefinementScript>function refine(list) { var x; var y=false; var names=list.toArray(); for(var i=0; i &lt; names.length;i++) { y=true; } return y; }</RefinementScript>
      </Variable>
      <Variable name="LongQTSyndrome" type="boolean">
	<Concept code="C0023976" name="Long QT Syndrome" schemeID="UMLS"/>
	<DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	<DataSource code="C0033213" name="Problem" schemeID="UMLS"/>
	<RefinementScript>function refine(list) { var x; var y=false; var names=list.toArray(); for(var i=0; i &lt; names.length;i++) { y=true; } return y; }</RefinementScript>
      </Variable>
      <Variable name="BrugadaSyndrome" type="boolean">
	<Concept code="C1142166" name="Brugada Syndrome (disorder)" schemeID="UMLS"/>
	<DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	<DataSource code="C0033213" name="Problem" schemeID="UMLS"/>
	<RefinementScript>function refine(list) { var x; var y=false; var names=list.toArray(); for(var i=0; i &lt; names.length;i++) { y=true; } return y; }</RefinementScript>
      </Variable>
      <Variable name="ValvularHeartDisease" type="boolean">
	<Concept code="C0018824" name="Heart valve disease" schemeID="UMLS"/>
	<DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	<DataSource code="C0033213" name="Problem" schemeID="UMLS"/>
	<RefinementScript>function refine(list) { var x; var y=false; var names=list.toArray(); for(var i=0; i &lt; names.length;i++) { y=true; } return y; }</RefinementScript>
      </Variable>
      <Variable name="HeartFailure" type="boolean">
	<Concept code="C0018801" name="Heart failure" schemeID="UMLS"/>
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
			<a
			  href="PPM:TAB3">Access to
			  EHR</a> <br />
			Implanted Device:
			<data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
			<data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
			<br />
			Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a href="PPM:TAB1">Access
			  to previous Remote follow-up results</a> </p>

		      <p><br />
		      </p>
		    </td>
		  </tr>
		  <!--tr name="CIEDBlock">
		    <td style="background-color:#eeeeee">

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      Alarms Detected: Atrial Fibrillation episode at a rate of 180 <br />
		      <a href="PPM:TAB1">Access to Report
			Exported</a> </td>
		  </tr-->
		   <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee">

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      VT Episode <br />
		      <a href="PPM:TAB1">Access to Report
			Exported</a> </td>
		  </tr>
		  
		<!--tr name="EHRBlock">
		    <td style="background-color:#eeeeee">
		      <p align="center"><b>Brief Information about the Patient History retrieved from EHR
		      </b> </p>

		      <table  width="100%">
			<tbody>
			  <tr>
			    <th>Status of associated Diseases</th>
			    <th>EHR values</th>
			  </tr>
			  <script>
			    <arguments>$LVDysfunction</arguments>
			    <content></content>
			  </script>
			  
			  
			  
			  <script>
				<arguments>$LVDysfunction, $DilatedCardiomyopathy, $HypertrophicCardiomyopathy, $HypertrophicCardiomyopathy, $ArrhythmogenicRightVentricular, $LongQTSyndrome, $BrugadaSyndrome, $ValvularHeartDisease, $HeartFailure</arguments>
			  <content>
			  function generate(ehrDis) { var useIt = 'false'; var output = ''; if(ehrDis.equals('true')) { useIt = '&lt;font color=\"#880015\"&gt;&lt;b&gt;true&lt;b&gt;' }output = output + ehrDis + useIt +'&lt;/tr&gt;';   return output; }
			  </content>
			  </script>
			  
			  
			   
			
			</tbody>
		      </table>
		    </td>
		  </tr-->  
		  
		<tr name="EHRBlock">
		  <td style="background-color:#eeeeee">
		    <p align="center"><b>Brief Information about the Patient History retrieved from EHR
		    </b> </p>

		    <table  width="100%">
		      <tbody>
			<tr>
			  <td><b>Status of associated Diseases</b></td>
			  <td><b>EHR values</b></td>
			</tr>

			<tr>
			  <td>
			  LV Dysfunction </td> 
			  <td> <font color="#880015">
			    $LVDysfunction
				</font>
			     <a href="PPM:TAB3">Access to EHR</a>
			  </td>
			</tr>
			<tr>
			  <td>Dilated Cardiomyopathy</td>
			  <td>
			    $DilatedCardiomyopathy
			     <a href="PPM:TAB3">Access to EHR</a>
			  </td>
			</tr>
			<tr>
			  <td>Hypertrophic Cardiomyopathy</td>
			  <td>
			    $HypertrophicCardiomyopathy
			     <a href="PPM:TAB3">Access to EHR</a>
			  </td>
			</tr>
			<tr>
			  <td>Arrhythmogenic Right Ventricular</td>
			  <td>
			    $ArrhythmogenicRightVentricular
			     <a href="PPM:TAB3">Access to EHR</a>
			  </td>
			</tr>
			<tr>
			  <td>Long QT Syndrome</td>
			  <td>
			    $LongQTSyndrome
			     <a href="PPM:TAB3">Access to EHR</a>
			  </td>
			</tr>
			<tr>
			  <td>Brugada Syndrome</td>
			  <td>
			    $BrugadaSyndrome
			     <a href="PPM:TAB3">Access to EHR</a>
			  </td>
			</tr>
			<tr>
			  <td>Valvular Heart Disease</td>
			  <td>
			    $ValvularHeartDisease
			     <a href="PPM:TAB3">Access to EHR</a>
			  </td>
			</tr>
			<tr>
			  <td>Heart Failure</td>
			  <td>
			    $HeartFailure
			     <a href="PPM:TAB3">Access to EHR</a>
			  </td>
			</tr>
		      </tbody>
		    </table>
		  </td>
		</tr>
		<tr name="ChoiceBlock">
		  <td style="background-color:#eeeeee"><p align="center"><b><font color="#880015">Recommendation
			  and Next Step to follow </font> </b></p>
		    <p ID="DecisionParagraph">If patient has LV dysfunction due to prior myocardial infarction prescribe amiodarone + / - beta-blockers  (class IIa, level of evidence B) or sotalol (class IIa, level of evidence C) or consider Catheter ablation (class IIb, level of evidence B)  <br/>
		      If patient has Dilated cardiomyopathy (nonischemic) prescribe amiodarone + / - beta-blockers (class IIa, level of evidence B) <br/>
		      If patient has Hypertrophic cardiomyopathy prescribe Amiodarone (class IIa, level of evidence C) <br/>
		      If patient has Arrhythmogenic right ventricular cardiomyopathy prescribe Amiodarone (class IIa, level of evidence C)or Sotalol (class IIa, level of evidence C). <br/>
		      If patient has Heart failure prescribe Amiodarone + / - beta-blocker (class I, level of evidence C) or Sotalol (class I, level of evidence C). <br/>
		      If patient has Long QT syndrome prescribe Beta-blockers. <br/>
		      If patient has Brugada Syndrome consider Electrical storm: isoproterenol (class IIa, level of evicence C) or Electrical storm: quinidine (class IIb, level of evidence C <br/>
		      If patient has Valvular heart disease check if the patient is a candidate for valvular repair / replacement, No specific drug suggested by guidelines. <br/>
		    </p>

		    <form onsubmit="return ValidateData();" action="null" method="post">
		      <input type="submit" name="F82Choice" value="Confirm medication change" onclick="btnWhichButton=this"/>
		    </form>
		  </td>
		</tr>
	      </tbody>
	    </table>
	  </body>
	</HTML>
      </Display>
      <NextStep ref="S64F07DD6-7A5C-E3A9-2587-6822C682B0A7" name="Wait 1 week to see if medication change is effective">

      </NextStep>
    </ConsultStep>
      <WaitStep ID="S64F07DD6-7A5C-E3A9-2587-6822C682B0A7" name="Wait 1 week to see if medication change is effective">
      <!--Duration unit="ms" amount="604800" /-->	 
      <Duration unit="ms" amount="6000" />	 
      <NextStep ref="SEF5E5757-1BE9-0643-6B18-68244363F8CF" name="Send notification to patient"/>
    </WaitStep>
      <RecommendationStep ID="SEF5E5757-1BE9-0643-6B18-68244363F8CF" name="Send notification to patient">
      <Receiver ref="P4"/>
      <Urgency>3</Urgency>
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
		      <a
			href="PPM:TAB3">Access to
			EHR</a> <br />
		      Implanted Device:
		      <data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
		      <data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
		      <br />
		      Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a href="PPM:TAB1">Access
			to previous Remote follow-up results</a> </p>

		    <p><br />
		    </p>
		  </td>
		</tr>
		<!--tr name="CIEDBlock">
		  <td style="background-color:#eeeeee">

		    <p align="center"><b>Brief Information about the recent alarm </b></p>
		    Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		    Alarms Detected: VT detected.. <br />
		    <a href="PPM:TAB1">Access to Report
		      Exported</a> </td>
		</tr-->
		 <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee">

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      VT Episode <br />
		      <a href="PPM:TAB1">Access to Report
			Exported</a> </td>
		  </tr>
		<tr name="RecommendationBlock">
		  <td style="background-color:#eeeeee">
		    <p align="center"><b><font color="#880015">Recommendation and Next Step to follow </font> </b></p>
		    <p>Sending the following message to the patient: <br/>
		      <b>To check effectiveness of medication change, please perform a self monitoring and send the ICD Report</b></p>
		    <form onsubmit="return ValidateData();" action="null" method="post">
		      <input type="submit" name="R810Choice" value="Continue" onclick="btnWhichButton=this"/>
		  </form></td>
		</tr>
	      </tbody>
	    </table>
	  </body>
	</HTML>
      </Display>
      <NextStep ref="S481833F9-A2AF-EFDE-98D7-68255539DAF6" name="Send notification to Patient"/>
    </RecommendationStep>	
      <WaitStep ID="S481833F9-A2AF-EFDE-98D7-68255539DAF6" name="Wait till the CIED report is received">
      <Event>
	<DataSource code="C0581396" name="Cardiac implant device" schemeID="UMLS"/>
      </Event>
      <NextStep ref="SF32B3CA0-1214-AF04-5657-6827937A321E" name="Send notification to Doctor"/>
    </WaitStep> 
      <RecommendationStep ID="SF32B3CA0-1214-AF04-5657-6827937A321E" name="Send notification to doctor">
      <Receiver ref="P3"/>
      <Urgency>3</Urgency>
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
		      <a
			href="PPM:TAB3">Access to
			EHR</a> <br />
		      Implanted Device:
		      <data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
		      <data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
		      <br />
		      Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a href="PPM:TAB1">Access
			to previous Remote follow-up results</a> </p>

		    <p><br />
		    </p>
		  </td>
		</tr>
		<tr name="RecommendationBlock">
		  <td style="background-color:#eeeeee">
		    <p align="center"><b><font color="#880015">Recommendation and Next Step to follow </font> </b></p>
		    <p>Patient has sent the report of the self monitoring. Please check care plan execution to assess the effectiveness of medication change </p>
		    <form onsubmit="return ValidateData();" action="null" method="post">
		      <input type="submit" name="R811Choice" value="Continue" onclick="btnWhichButton=this"/>
		  </form></td>
		</tr>
	      </tbody>
	    </table>
	  </body>
	</HTML>
      </Display>
      <NextStep ref="SB86C5369-FB3A-46E9-6272-6828E1F0664A"/>
    </RecommendationStep>	
      <ConsultStep ID="SB86C5369-FB3A-46E9-6272-6828E1F0664A" name="Check Medication effectiveness">
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
			<a
			  href="PPM:TAB3">Access to
			  EHR</a> <br />
			Implanted Device:
			<data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
			<data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
			<br />
			Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a href="PPM:TAB1">Access
			  to previous Remote follow-up results</a> </p>

		      <p><br />
		      </p>
		    </td>
		  </tr>
		  <!--tr name="CIEDBlock">
		    <td style="background-color:#eeeeee">

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      Alarms Detected: Atrial Fibrillation episode at a rate of 180 <br />
		      <a href="PPM:TAB1">Access to Report
			Exported</a> </td>
		  </tr-->
		   <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee">

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      VT Episode <br />
		      <a href="PPM:TAB1">Access to Report
			Exported</a> </td>
		  </tr>

		<tr name="EGMBlock">
		  <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		    <p align="center"><b>Brief Information about the EGM and detected
			problems </b> </p>

		    <table  cellspacing="10" width="100%">
		      <tbody>
			<tr>

			  <p align="center"> EGM: <a href="PPM:TAB1">Access to
			      Report Exported</a> <br /> </p>


			  <p><img width="312" height="190" id="Picture1"
			      src="caremanagementdb://Patient/Observation/@base64String"
			      alt="x.bmp" /></p>

			</tr>
		      </tbody>
		    </table>
		  </td>
		</tr>
		<tr name="ChoiceBlock">
		  <td style="background-color:#eeeeee"><p align="center"><b><font color="#880015">Recommendation
			  and Next Step to follow </font> </b></p>
		    <p> Please choose among the appropriate options <br/>

		    </p>

		    <form onsubmit="return ValidateData();" action="null" method="post">
		      <input type="submit" name="C810Choice" value="Medication change is effective" onclick="btnWhichButton=this"/>
		      <input type="submit" name="C810Choice" value="Medication change is not effective" onclick="btnWhichButton=this"/>
		    </form>
		  </td>
		</tr>
	      </tbody>
	    </table>
	  </body>
	</HTML>
      </Display>

      <NextStep ref="S254A202C-94C4-CA29-3884-681DDC0A37BA" name="Medication change is not effective">
	<EvaluationScript>function check(SB86C5369FB3A46E962726828E1F0664AChoice) { if(SB86C5369FB3A46E962726828E1F0664AChoice.getValue().getText() == "Medication change is not effective") return true; else return false; }</EvaluationScript>		
      </NextStep>
      <NextStep ref="S42F61D34-3D6A-29F5-D8FD-67B19FD9CE09" name="Medication change is effective">
	<EvaluationScript>function check(SB86C5369FB3A46E962726828E1F0664AChoice) { if(SB86C5369FB3A46E962726828E1F0664AChoice.getValue().getText() == "Medication change is effective") return true; else return false; }</EvaluationScript>		
      </NextStep>
    </ConsultStep>
      <RecommendationStep ID="S254A202C-94C4-CA29-3884-681DDC0A37BA" name="Consider Ablation">
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
		      <a
			href="PPM:TAB3">Access to
			EHR</a> <br />
		      Implanted Device:
		      <data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
		      <data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
		      <br />
		      Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a href="PPM:TAB1">Access
			to previous Remote follow-up results</a> </p>

		    <p><br />
		    </p>
		  </td>
		</tr>
		<!--tr name="CIEDBlock">
		  <td style="background-color:#eeeeee">

		    <p align="center"><b>Brief Information about the recent alarm </b></p>
		    Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		    Alarms Detected: VT detected.. <br />
		    <a href="PPM:TAB1">Access to Report
		      Exported</a> </td>
		</tr-->
		 <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee">

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      VT Episode <br />
		      <a href="PPM:TAB1">Access to Report
			Exported</a> </td>
		  </tr>
		<tr name="RecommendationBlock">
		  <td style="background-color:#eeeeee">
		    <p align="center"><b><font color="#880015">Recommendation and Next Step to follow </font> </b></p>
		    <p>Consider Ablation Theraphy</p>

		    <form onsubmit="return ValidateData();" action="null" method="post">
		      <input type="submit" name="D5Choice" value="Continue" onclick="btnWhichButton=this"/>
		  </form></td>
		</tr>
	      </tbody>
	    </table>
	  </body>
	</HTML>
      </Display>
      <NextStep ref="S42F61D34-3D6A-29F5-D8FD-67B19FD9CE09"/>
    </RecommendationStep>
      <RecommendationStep ID="S8D06F33C-A0D7-9A1F-AAEF-681DCFEEE12B" name="Consider EP Study">
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
		      <a
			href="PPM:TAB3">Access to
			EHR</a> <br />
		      Implanted Device:
		      <data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
		      <data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
		      <br />
		      Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a href="PPM:TAB1">Access
			to previous Remote follow-up results</a> </p>

		    <p><br />
		    </p>
		  </td>
		</tr>
		<!--tr name="CIEDBlock">
		  <td style="background-color:#eeeeee">

		    <p align="center"><b>Brief Information about the recent alarm </b></p>
		    Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		    Alarms Detected: VT detected.. <br />
		    <a href="PPM:TAB1">Access to Report
		      Exported</a> </td>
		</tr-->
		 <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee">

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      VT Episode <br />
		      <a href="PPM:TAB1">Access to Report
			Exported</a> </td>
		  </tr>
		<tr name="RecommendationBlock">
		  <td style="background-color:#eeeeee">
		    <p align="center"><b><font color="#880015">Recommendation and Next Step to follow </font> </b></p>
		    <p>Consider EP electrophysiology study.</p>

		    <form onsubmit="return ValidateData();" action="null" method="post">
		      <input type="submit" name="D5Choice" value="Continue" onclick="btnWhichButton=this"/>
		  </form></td>
		</tr>
	      </tbody>
	    </table>
	  </body>
	</HTML>
      </Display>
      <NextStep ref="S254A202C-94C4-CA29-3884-681DDC0A37BA"/>
    </RecommendationStep>	
      <ConsultStep ID="SE08A9520-760C-FE41-2182-67B166372B8D" name="Check Inappropriate Discharge">
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
		  <a href="PPM:TAB3">Access to EHR</a>
		  <br/>
		  Implanted Device:
		  <data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
		  <data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
		  <br/>
		  Last Follow-up Date:<data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/>
		  <a href="PPM:TAB1">Access to previous Remote follow-up results</a>
		  <br/>
		</td>
	      </tr>
	      <!--tr name="CIEDBlock">
		<td>
		 
		  Received Date:<data src="caremanagementdb://Patient/CIEDData/@receivedTime"/>
		  <br/>
		  Alarms Detected: VT is detected..
		  <br/>
		  <a href="PPM:TAB1">Access to Report Exported</a>
		</td>
	      </tr-->
		   <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee">

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      VT Episode <br />
		      <a href="PPM:TAB1">Access to Report
			Exported</a> </td>
		  </tr>
	      <tr name="EGMBlock">
		<td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		  <p align="center"><b>Brief Information about the EGM and detected
		      problems </b> </p>

		  <table  cellspacing="10" width="100%">
		    <tbody>
		      <tr>

			<p align="center"> EGM: <a href="PPM:TAB1">Access to
			    Report Exported</a> <br /> </p>


			<p><img width="312" height="190" id="Picture1"
			    src="caremanagementdb://Patient/Observation/@base64String"
			    alt="x.bmp" /></p>

		      </tr>
		    </tbody>
		  </table>
		</td>
	      </tr>
	      <tr name="ChoiceBlock">
		<td style="background-color:#eeeeee"><p align="center"><b><font color="#880015">Recommendation
			and Next Step to follow </font> </b></p>
		  <p> Please choose among the appropriate options <br/>

		  </p>

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
      <NextStep ref="S2A714E73-92E0-99B5-42E5-682F4D83B9AC" name="InappropriateDischarge > 1">
	<EvaluationScript>function check(SE08A9520760CFE41218267B166372B8DChoice) { if(SE08A9520760CFE41218267B166372B8DChoice.getValue().getText() == "Inappropriate Discharge > 1") return true; else return false; }</EvaluationScript>
      </NextStep>
      <NextStep ref="SF2DA11EC-091E-5443-AF36-682F5E65CDEE" name="InappropriateDischarge = 1">
	<EvaluationScript>function check(SE08A9520760CFE41218267B166372B8DChoice) { if(SE08A9520760CFE41218267B166372B8DChoice.getValue().getText() == "Inappropriate Discharge = 1") return true; else return false; }</EvaluationScript>
      </NextStep>
      <NextStep ref="S0A282FD3-B82E-0882-BC30-682F6FDAC5C0" name="InappropriateDischarge = 0">
	<EvaluationScript>function check(SE08A9520760CFE41218267B166372B8DChoice) { if(SE08A9520760CFE41218267B166372B8DChoice.getValue().getText() == "Inappropriate Discharge = 0") return true; else return false; }</EvaluationScript>
      </NextStep>
    </ConsultStep>
      <ConsultStep ID="S2A714E73-92E0-99B5-42E5-682F4D83B9AC" name="Consider immediate referral to the Clinic"><!--Change from RecommendationStep to ConsultStep-->
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
		      <a
			href="PPM:TAB3">Access to
			EHR</a> <br />
		      Implanted Device:
		      <data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
		      <data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
		      <br />
		      Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a href="PPM:TAB1">Access
			to previous Remote follow-up results</a> </p>

		    <p><br />
		    </p>
		  </td>
		</tr>
		<!--tr name="CIEDBlock">
		  <td style="background-color:#eeeeee">

		    <p align="center"><b>Brief Information about the recent alarm </b></p>
		    Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		    Alarms Detected: VT detected.. <br />
		    <a href="PPM:TAB1">Access to Report
		      Exported</a> </td>
		</tr-->
		 <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee">

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      VT Episode <br />
		      <a href="PPM:TAB1">Access to Report
			Exported</a> </td>
		  </tr>
		<tr name="RecommendationBlock">
		  <td style="background-color:#eeeeee">
		    <p align="center"><b><font color="#880015">Recommendation and Next Step to follow </font> </b></p>
		    <p>Real SVT is detected and there are more than one inappropriate discharges. Arrange immediate referral to the Clinic and call the patient</p>

		    <form onsubmit="return ValidateData();" action="null" method="post">
		      <input type="submit" name="D5Choice" value="Finalize the Care Plan" onclick="btnWhichButton=this"/>
		      <input type="submit" name="D5Choice" value="Send an SMS to patient/caregiver and Finalize the Care Plan" onclick="btnWhichButton=this"/>
		  </form></td>
		</tr>
	      </tbody>
	    </table>
	  </body>
	</HTML>
      </Display>
      <NextStep ref="S42F61D34-3D6A-29F5-D8FD-67B19FD9CE09" name="finalize">
	<EvaluationScript>function check(S2A714E7392E099B542E5682F4D83B9ACChoice) { if(S2A714E7392E099B542E5682F4D83B9ACChoice.getValue().getText() == "Finalize the Care Plan") return true; else return false; }</EvaluationScript>
      </NextStep>
      <NextStep ref="SE42480E6-144C-CDCB-B6D6-68321C809E60" name="send ands sms and finalize">
	<EvaluationScript>function check(S2A714E7392E099B542E5682F4D83B9ACChoice) { if(S2A714E7392E099B542E5682F4D83B9ACChoice.getValue().getText() == "Send an SMS to patient/caregiver and Finalize the Care Plan"") return true; else return false; }</EvaluationScript>
      </NextStep>
    </ConsultStep>	
      <RecommendationStep ID="SE42480E6-144C-CDCB-B6D6-68321C809E60" name="Send notification to patient for immediate referral">
      <Receiver ref="P4"/>
      <Urgency>3</Urgency>
      <Display>
	<HTML>
	  <p>Please go to the clinic as soon as possible for an immediate ICD Follow-up</p>

	</HTML>
      </Display>
      <NextStep ref="S42F61D34-3D6A-29F5-D8FD-67B19FD9CE09"/>
    </RecommendationStep>	
      <ConsultStep ID="SF2DA11EC-091E-5443-AF36-682F5E65CDEE" name="Consider a follow up in clinic"><!--Change from RecommendationStep to ConsultStep-->
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
		      <a
			href="PPM:TAB3">Access to
			EHR</a> <br />
		      Implanted Device:
		      <data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
		      <data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
		      <br />
		      Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a href="PPM:TAB1">Access
			to previous Remote follow-up results</a> </p>

		    <p><br />
		    </p>
		  </td>
		</tr>
		<!--tr name="CIEDBlock">
		  <td style="background-color:#eeeeee">

		    <p align="center"><b>Brief Information about the recent alarm </b></p>
		    Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		    Alarms Detected: VT detected.. <br />
		    <a href="PPM:TAB1">Access to Report
		      Exported</a> </td>
		</tr-->
		 <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee">

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      VT Episode <br />
		      <a href="PPM:TAB1">Access to Report
			Exported</a> </td>
		  </tr>
		<tr name="RecommendationBlock">
		  <td style="background-color:#eeeeee">
		    <p align="center"><b><font color="#880015">Recommendation and Next Step to follow </font> </b></p>
		    <p>Real SVT is detected and there is a inappropriate discharges. Arrange a follow up the Clinic and call the patient</p>

		    <form onsubmit="return ValidateData();" action="null" method="post">
		      <input type="submit" name="D5Choice" value="Finalize the Care Plan" onclick="btnWhichButton=this"/>
		      <input type="submit" name="D5Choice" value="Send an SMS to patient/caregiver and Finalize the Care Plan" onclick="btnWhichButton=this"/>
		  </form></td>
		</tr>
	      </tbody>
	    </table>
	  </body>
	</HTML>
      </Display>
      <NextStep ref="S42F61D34-3D6A-29F5-D8FD-67B19FD9CE09" name="finalize">
	<EvaluationScript>function check(SF2DA11EC091E5443AF36682F5E65CDEEChoice) { if(SF2DA11EC091E5443AF36682F5E65CDEEChoice.getValue().getText() == "Finalize the Care Plan") return true; else return false; }</EvaluationScript>
      </NextStep>
      <NextStep ref="S47B87C0D-1996-E938-00F1-6834B85DCC19" name="send ands sms and finalize">
	<EvaluationScript>function check(SF2DA11EC091E5443AF36682F5E65CDEEChoice) { if(SF2DA11EC091E5443AF36682F5E65CDEEChoice.getValue().getText() == "Send an SMS to patient/caregiver and Finalize the Care Plan"") return true; else return false; }</EvaluationScript>
      </NextStep>
    </ConsultStep>	
      <RecommendationStep ID="S47B87C0D-1996-E938-00F1-6834B85DCC19" name="Send notification to patient for immediate referral">
      <Receiver ref="P4"/>
      <Urgency>3</Urgency>
      <Display>
	<HTML>
	  <p>Please call the clinic for an in clinic follow up appointment</p>

	</HTML>
      </Display>
      <NextStep ref="S42F61D34-3D6A-29F5-D8FD-67B19FD9CE09"/>
    </RecommendationStep>		 
      <ConsultStep ID="S0A282FD3-B82E-0882-BC30-682F6FDAC5C0" name="Consider a follow up in clinic"><!--Change from RecommendationStep to ConsultStep-->
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
		      <a
			href="PPM:TAB3">Access to
			EHR</a> <br />
		      Implanted Device:
		      <data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
		      <data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
		      <br />
		      Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a href="PPM:TAB1">Access
			to previous Remote follow-up results</a> </p>

		    <p><br />
		    </p>
		  </td>
		</tr>
		<!--tr name="CIEDBlock">
		  <td style="background-color:#eeeeee">

		    <p align="center"><b>Brief Information about the recent alarm </b></p>
		    Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		    Alarms Detected: VT detected.. <br />
		    <a href="PPM:TAB1">Access to Report
		      Exported</a> </td>
		</tr-->
		 <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee">

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      VT Episode <br />
		      <a href="PPM:TAB1">Access to Report
			Exported</a> </td>
		  </tr>
		<tr name="RecommendationBlock">
		  <td style="background-color:#eeeeee">
		    <p align="center"><b><font color="#880015">Recommendation and Next Step to follow </font> </b></p>
		    <p>Real SVT is detected however there is no inappropriate discharges. Arrange a routine follow up the Clinic and call the patient</p>

		    <form onsubmit="return ValidateData();" action="null" method="post">
		      <input type="submit" name="D5Choice" value="Finalize the Care Plan" onclick="btnWhichButton=this"/>
		      <input type="submit" name="D5Choice" value="Send an SMS to patient/caregiver and Finalize the Care Plan" onclick="btnWhichButton=this"/>
		  </form></td>
		</tr>
	      </tbody>
	    </table>
	  </body>
	</HTML>
      </Display>
      <NextStep ref="S42F61D34-3D6A-29F5-D8FD-67B19FD9CE09" name="finalize">
	<EvaluationScript>function check(S0A282FD3B82E0882BC30682F6FDAC5C0Choice) { if(S0A282FD3B82E0882BC30682F6FDAC5C0Choice.getValue().getText() == "Finalize the Care Plan") return true; else return false; }</EvaluationScript>
      </NextStep>
      <NextStep ref="SD059A2BA-E71C-AB51-ED11-683717CA826D" name="send ands sms and finalize">
	<EvaluationScript>function check(S0A282FD3B82E0882BC30682F6FDAC5C0Choice) { if(S0A282FD3B82E0882BC30682F6FDAC5C0Choice.getValue().getText() == "Send an SMS to patient/caregiver and Finalize the Care Plan"") return true; else return false; }</EvaluationScript>
      </NextStep>
    </ConsultStep>	
      <RecommendationStep ID="SD059A2BA-E71C-AB51-ED11-683717CA826D" name="Send notification to patient for immediate referral">
      <Receiver ref="P4"/>
      <Urgency>3</Urgency>
      <Display>
	<HTML>
	  <p>Please call the clinic for an routine follow up appointment</p>

	</HTML>
      </Display>
      <NextStep ref="S42F61D34-3D6A-29F5-D8FD-67B19FD9CE09"/>
    </RecommendationStep>
      <RecordActionStep ID="S17972A05-4127-83AD-5792-67B1901E767B" name="Record Noise Event">
      <Concept code="C0028263" name="Noise" schemeID="UMLS"/>
      <DataSource code="C0033213" name="Problem" schemeID="UMLS"/>
      <Value text="true"/>
      <NextStep ref="SC76BFC25-FF45-C749-521C-683B3EDFC8EF" name="Present the EGM, check electrode dysfunction"/>
    </RecordActionStep>
      <ConsultStep ID="SC76BFC25-FF45-C749-521C-683B3EDFC8EF" name="Present the EGM, check electrode dysfunction">
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
		      <a
			href="PPM:TAB3">Access to
			EHR</a> <br />
		      Implanted Device:
		      <data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
		      <data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
		      <br />
		      Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a href="PPM:TAB1">Access
			to previous Remote follow-up results</a> </p>

		    <p><br />
		    </p>
		  </td>
		</tr>
		<tr name="CIEDBlock">
		  <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		    <p align="center"><b>Brief Information about the recent alarm </b></p>
		    Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		    VT Episode <br />
		    <a href="PPM:TAB1">Access to Report
		      Exported</a> </td>
		</tr>
		<tr name="EGMBlock">
		  <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		    <p align="center"><b>Brief Information about the EGM and detected
			problems </b> </p>

		    <table  cellspacing="10" width="100%">
		      <tbody>
			<tr>

			  <p align="center"> EGM: <a href="PPM:TAB1">Access to
			      Report Exported</a> <br /> </p>


			  <p><img width="312" height="190" id="Picture1"
			      src="caremanagementdb://Patient/Observation/@base64String"
			      alt="x.bmp" /></p>

			</tr>
		      </tbody>
		    </table>
		  </td>
		</tr>
		<tr name="ChoiceBlock">
		  <td style="background-color:#eeeeee">
		    <p align="center"><b>Recommendation and Next Step to follow </b> </p>
		    <p>Check the recent EGM and present whether there is electrode dysfunction?</p>
		    <form onsubmit="return ValidateData();" action="null" method="post">
		      <input type="submit" name="C2Choice" value="There is electrode dysfunction!" onclick="btnWhichButton=this"/>
		      <input type="submit" name="C2Choice" value="There is no electrode dysfunction!" onclick="btnWhichButton=this"/>										
		    </form>
		  </td>
		</tr>
	      </tbody>
	    </table>
	  </body>
	</HTML>
      </Display>
      <NextStep ref="SABCF8479-CDCC-ECFB-780C-683C298D1508" name="There is electrode dysfunction!">
	<EvaluationScript>function check(SC76BFC25FF45C749521C683B3EDFC8EFChoice) { if(SC76BFC25FF45C749521C683B3EDFC8EFChoice.getValue().getText() == "There is electrode dysfunction!") return true; else return false; }</EvaluationScript>
      </NextStep>
      <NextStep ref="S5A46EBED-CAD6-49D2-AF54-683C369E1D34" name="There is no electrode dysfunction!">
	<EvaluationScript>function check(SC76BFC25FF45C749521C683B3EDFC8EFChoice) { if(SC76BFC25FF45C749521C683B3EDFC8EFChoice.getValue().getText() == "There is no electrode dysfunction!") return true; else return false; }</EvaluationScript>
      </NextStep>	
    </ConsultStep>
      <ConsultStep ID="SABCF8479-CDCC-ECFB-780C-683C298D1508" name="Present the Lead Impedance Alerts, Lead Impedance Trend, Amplitude of the signal to the Medical Professional">
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
		      <a
			href="PPM:TAB3">Access to
			EHR</a> <br />
		      Implanted Device:
		      <data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
		      <data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
		      <br />
		      Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a href="PPM:TAB1">Access
			to previous Remote follow-up results</a> </p>

		    <p><br />
		    </p>
		  </td>
		</tr>
		<!--tr name="CIEDBlock">
		  <td style="background-color:#eeeeee">

		    <p align="center"><b>Brief Information about the recent alarm </b></p>
		    Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		    Alarms Detected: Atrial Fibrillation episode at a rate of 180 <br />
		    <a href="PPM:TAB1">Access to Report
		      Exported</a> </td>
		</tr-->
		 <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee">

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      VT Episode <br />
		      <a href="PPM:TAB1">Access to Report
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
			    <p align="center"> EGM: <a href="PPM:TAB1">Access to
				Report Exported</a> <br /> </p>


			    <p><img width="312" height="190" id="Picture1"
				src="caremanagementdb://Patient/Observation/@base64String"
				alt="x.bmp" /></p>
			  </td>
			  <td><!--The following HTML will be populated in the execution step-->

			    <p align="center">  Assesment by CIED <a href="PPM:TAB1">Access
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
		      <input type="submit" name="S21Choice" value="Yes, there are!" onclick="btnWhichButton=this"/>
		      <input type="submit" name="S21Choice" value="No, there is not!" onclick="btnWhichButton=this"/>
		    </form>
		  </td>
		</tr>
	      </tbody>
	    </table>
	  </body>
	</HTML>
      </Display>
      <NextStep ref="SA09B2A03-E56D-CC98-2769-683FAB6A6DF5" name="Yes, there are!">
	<EvaluationScript>function check(SABCF8479CDCCECFB780C683C298D1508Choice) { if(SABCF8479CDCCECFB780C683C298D1508Choice.getValue().getText() == "Yes, there are!") return true; else return false; }</EvaluationScript>
      </NextStep>
      <NextStep ref="S42F61D34-3D6A-29F5-D8FD-67B19FD9CE09" name="No, there is not!">
	<EvaluationScript>function check(SABCF8479CDCCECFB780C683C298D1508Choice) { if(SABCF8479CDCCECFB780C683C298D1508Choice.getValue().getText() == "No, there is not!") return true; else return false; }</EvaluationScript>
      </NextStep>
    </ConsultStep>
      <ConsultStep ID="SA09B2A03-E56D-CC98-2769-683FAB6A6DF5" name="Consider urgent followup in hospital"><!--Change from RecommendationStep to ConsultStep-->
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
		      <a
			href="PPM:TAB3">Access to
			EHR</a> <br />
		      Implanted Device:
		      <data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
		      <data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
		      <br />
		      Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a href="PPM:TAB1">Access
			to previous Remote follow-up results</a> </p>

		    <p><br />
		    </p>
		  </td>
		</tr>
		<!--tr name="CIEDBlock">
		  <td style="background-color:#eeeeee">

		    <p align="center"><b>Brief Information about the recent alarm </b></p>
		    Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		    Alarms Detected: VT detected.. <br />
		    <a href="PPM:TAB1">Access to Report
		      Exported</a> </td>
		</tr-->
		 <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee">

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      VT Episode <br />
		      <a href="PPM:TAB1">Access to Report
			Exported</a> </td>
		  </tr>
		<tr name="RecommendationBlock">
		  <td style="background-color:#eeeeee">
		    <p align="center"><b><font color="#880015">Recommendation and Next Step to follow </font> </b></p>
		    <p>Noise is detected and there seems to be a problem in ICD Device. Arrange immediate referral to the Clinic and call the patient</p>

		    <form onsubmit="return ValidateData();" action="null" method="post">
		      <input type="submit" name="R22Choice" value="Finalize the Care Plan" onclick="btnWhichButton=this"/>
		      <input type="submit" name="R22Choice" value="Send an SMS to patient/caregiver and Finalize the Care Plan" onclick="btnWhichButton=this"/>
		  </form></td>
		</tr>
	      </tbody>
	    </table>
	  </body>
	</HTML>
      </Display>
      <NextStep ref="S42F61D34-3D6A-29F5-D8FD-67B19FD9CE09" name="finalize">
	<EvaluationScript>function check(SA09B2A03E56DCC982769683FAB6A6DF5Choice) { if(SA09B2A03E56DCC982769683FAB6A6DF5Choice.getValue().getText() == "Finalize the Care Plan") return true; else return false; }</EvaluationScript>
      </NextStep>
      <NextStep ref="S2C052A30-21E5-8048-7C3D-68412BD3FEB0" name="send ands sms and finalize">
	<EvaluationScript>function check(SA09B2A03E56DCC982769683FAB6A6DF5Choice) { if(SA09B2A03E56DCC982769683FAB6A6DF5Choice.getValue().getText() == "Send an SMS to patient/caregiver and Finalize the Care Plan"") return true; else return false; }</EvaluationScript>
      </NextStep>
    </ConsultStep>	
      <RecommendationStep ID="S2C052A30-21E5-8048-7C3D-68412BD3FEB0" name="Send notification to patient for immeidiate referral">
      <Receiver ref="P4"/>
      <Urgency>3</Urgency>
      <Display>
	<HTML>
	  <p>Please go to the clinic as soon as possible for an immediate ICD Follow-up</p>

	</HTML>
      </Display>
      <NextStep ref="S42F61D34-3D6A-29F5-D8FD-67B19FD9CE09"/>
    </RecommendationStep>	
      <ConsultStep ID="S5A46EBED-CAD6-49D2-AF54-683C369E1D34" name="Present the EGM, check external disturbances">

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
		      <a
			href="PPM:TAB3">Access to
			EHR</a> <br />
		      Implanted Device:
		      <data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
		      <data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
		      <br />
		      Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a href="PPM:TAB1">Access
			to previous Remote follow-up results</a> </p>

		    <p><br />
		    </p>
		  </td>
		</tr>
		<tr name="CIEDBlock">
		  <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		    <p align="center"><b>Brief Information about the recent alarm </b></p>
		    Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		    VT Episode <br />
		    <a href="PPM:TAB1">Access to Report
		      Exported</a> </td>
		</tr>
		<tr name="EGMBlock">
		  <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		    <p align="center"><b>Brief Information about the EGM and detected
			problems </b> </p>

		    <table  cellspacing="10" width="100%">
		      <tbody>
			<tr>

			  <p align="center"> EGM: <a href="PPM:TAB1">Access to
			      Report Exported</a> <br /> </p>


			  <p><img width="312" height="190" id="Picture1"
			      src="caremanagementdb://Patient/Observation/@base64String"
			      alt="x.bmp" /></p>

			</tr>
		      </tbody>
		    </table>
		  </td>
		</tr>
		<tr name="ChoiceBlock">
		  <td style="background-color:#eeeeee">
		    <p align="center"><b>Recommendation and Next Step to follow </b> </p>
		    <p>Check the recent EGM and present whether there seems to be external disturbances?</p>
		    <form onsubmit="return ValidateData();" action="null" method="post">
		      <input type="submit" name="D22Choice" value="There seems to be external disturbances!" onclick="btnWhichButton=this"/>
		      <input type="submit" name="D22Choice" value="There is no external disturbance, check Real VT Case!" onclick="btnWhichButton=this"/>	
		      <input type="submit" name="D22Choice" value="There is no external disturbance, check Real SVT Case!" onclick="btnWhichButton=this"/>											
		    </form>
		  </td>
		</tr>
	      </tbody>
	    </table>
	  </body>
	</HTML>
      </Display>
      <NextStep ref="S1E38BE68-A877-A6BA-A012-6843C13C7AD8" name="There seems to be external disturbances!">
	<EvaluationScript>function check(S5A46EBEDCAD649D2AF54683C369E1D34Choice) { if(S5A46EBEDCAD649D2AF54683C369E1D34Choice.getValue().getText() == "There seems to be external disturbances") return true; else return false; }</EvaluationScript>
      </NextStep>
      <NextStep ref="S560A22EF-4D7B-06C7-49E8-67B13AB3C139" name="There is no external disturbance, check Real VT Case!">
	<EvaluationScript>function check(S5A46EBEDCAD649D2AF54683C369E1D34Choice) { if(S5A46EBEDCAD649D2AF54683C369E1D34Choice.getValue().getText() == "There is no external disturbance, check Real VT Case!") return true; else return false; }</EvaluationScript>
      </NextStep>	
      <NextStep ref="SE08A9520-760C-FE41-2182-67B166372B8D" name="There is no external disturbance, check Real SVT Case!">
	<EvaluationScript>function check(S5A46EBEDCAD649D2AF54683C369E1D34Choice) { if(S5A46EBEDCAD649D2AF54683C369E1D34Choice.getValue().getText() == "There is no external disturbance, check Real SVT Case!") return true; else return false; }</EvaluationScript>
      </NextStep>	
    </ConsultStep>
      <ConsultStep ID="S1E38BE68-A877-A6BA-A012-6843C13C7AD8" name="Check Number of Noises within that week">
      <Variable name="NumberOfNoiseCase" type="integer">
	<Concept code="C0028263" name="Noise" schemeID="UMLS"/>
	<DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	<DataSource code="C0033213" name="Problem" schemeID="UMLS"/>
	<RefinementScript>"TODO:SON BIR HAFTADAKI SAYISI"</RefinementScript>
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
		      <a
			href="PPM:TAB3">Access to
			EHR</a> <br />
		      Implanted Device:
		      <data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
		      <data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
		      <br />
		      Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a href="PPM:TAB1">Access
			to previous Remote follow-up results</a> </p>

		    <p><br />
		    </p>
		  </td>
		</tr>
		<tr name="CIEDBlock">
		  <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		    <p align="center"><b>Brief Information about the recent alarm </b></p>
		    Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		    VT Episode <br />
		    <a href="PPM:TAB1">Access to Report
		      Exported</a> </td>
		</tr>
		<tr name="EGMBlock">
		  <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		    <p align="center"><b>Brief Information about the EGM and detected
			problems </b> </p>

		    <table  cellspacing="10" width="100%">
		      <tbody>
			<tr>

			  <p align="center"> EGM: <a href="PPM:TAB1">Access to
			      Report Exported</a> <br /> </p>


			  <p><img width="312" height="190" id="Picture1"
			      src="caremanagementdb://Patient/Observation/@base64String"
			      alt="x.bmp" /></p>

			</tr>
		      </tbody>
		    </table>
		  </td>
		</tr>
		<tr name="ChoiceBlock">
		  <td style="background-color:#eeeeee">
		    <p align="center"><b>Recommendation and Next Step to follow </b> </p>
		    <p>Number of Noise Cases in this week is: $NumberOfNoiseCase. Do you confirm?</p>
		    <form onsubmit="return ValidateData();" action="null" method="post">
		      <input type="submit" name="D23Choice" value="Number of Noise Cases in >3" onclick="btnWhichButton=this"/>
		      <input type="submit" name="D23Choice" value="Number of Noise cases is 1" onclick="btnWhichButton=this"/>	

		    </form>
		  </td>
		</tr>
	      </tbody>
	    </table>
	  </body>
	</HTML>
      </Display>
      <NextStep ref="S3768F2C0-217B-0964-3A33-684B514A4EF3" name="Number of Noise Cases in >3">
	<EvaluationScript>function check(S1E38BE68A877A6BAA0126843C13C7AD8Choice) { if(S1E38BE68A877A6BAA0126843C13C7AD8Choice.getValue().getText() == "Number of Noise Cases in >3") return true; else return false; }</EvaluationScript>
      </NextStep>
      <NextStep ref="S42F61D34-3D6A-29F5-D8FD-67B19FD9CE09" name="Number of Noise cases is 1">
	<EvaluationScript>function check(S1E38BE68A877A6BAA0126843C13C7AD8Choice) { if(S1E38BE68A877A6BAA0126843C13C7AD8Choice.getValue().getText() == "Number of Noise cases is 1") return true; else return false; }</EvaluationScript>
      </NextStep>	
    </ConsultStep>
      <RecommendationStep ID="S3768F2C0-217B-0964-3A33-684B514A4EF3" name="Contacts the patient">
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
		      <a
			href="PPM:TAB3">Access to
			EHR</a> <br />
		      Implanted Device:
		      <data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
		      <data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
		      <br />
		      Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a href="PPM:TAB1">Access
			to previous Remote follow-up results</a> </p>

		    <p><br />
		    </p>
		  </td>
		</tr>
		<!--tr name="CIEDBlock">
		  <td style="background-color:#eeeeee">

		    <p align="center"><b>Brief Information about the recent alarm </b></p>
		    Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		    Alarms Detected: VT detected.. <br />
		    <a href="PPM:TAB1">Access to Report
		      Exported</a> </td>
		</tr-->
		 <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee">

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      VT Episode <br />
		      <a href="PPM:TAB1">Access to Report
			Exported</a> </td>
		  </tr>
		<tr name="RecommendationBlock">
		  <td style="background-color:#eeeeee">
		    <p align="center"><b><font color="#880015">Recommendation and Next Step to follow </font> </b></p>
		    <p>Number of noises detected in this week exceeded 3 and there seems to be no problem in Electrode Dysfunction and external disturbances, please call the patient and investigate possible reasons of Noise cases</p>

		  </td>
		</tr>
	      </tbody>
	    </table>
	  </body>
	</HTML>
      </Display>
      <NextStep ref="S42F61D34-3D6A-29F5-D8FD-67B19FD9CE09" name="finalize"/>

    </RecommendationStep>	
      <ConsultStep ID="S228AC30A-F1C3-462E-99D2-67B727F4DF02" name="Check Programmed ATP">
      <Variable name="ProgrammedATP" type="integer">
	<Concept code="737888" name="MDC_IDC_STAT_TACHYTHERAPY_ATP_DELIVERED_RECENT" schemeID="MDC_IDC"/>
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
		      <a
			href="PPM:TAB3">Access to
			EHR</a> <br />
		      Implanted Device:
		      <data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
		      <data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
		      <br />
		      Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a href="PPM:TAB1">Access
			to previous Remote follow-up results</a> </p>

		    <p><br />
		    </p>
		  </td>
		</tr>
		<tr name="CIEDBlock">
		  <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		    <p align="center"><b>Brief Information about the recent alarm </b></p>
		    Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		    VT Episode <br />
		    <a href="PPM:TAB1">Access to Report
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
			    <p align="center"> EGM: <a href="PPM:TAB1">Access to
				Report Exported</a> <br /> </p>


			    <p><img width="312" height="190" id="Picture1"
				src="caremanagementdb://Patient/Observation/@base64String"
				alt="x.bmp" /></p>
			  </td>
			  <td><!--The following HTML will be populated in the execution step-->

			    <p align="center">  Assesment by CIED <a href="PPM:TAB1">Access
				to Report Exported</a> <br />
			      <br/>

			      <p align="left"># of ProgrammedATP: $ProgrammedATP <br />

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
		    <p align="center"><b>Recommendation and Next Step to follow </b> </p>
		    <p>Please choose the suitable option</p>

		    <form onsubmit="return ValidateData();" action="null" method="post">

		      <input type="submit" name="F4Choice" value="ATP is programmed" onclick="btnWhichButton=this"/>
		      <input type="submit" name="F4Choice" value="ATP has not been programmed" onclick="btnWhichButton=this"/>

		    </form>
		  </td>
		</tr>
	      </tbody>
	    </table>
	  </body>
	</HTML>
      </Display>
      <NextStep ref="S96451C42-F39E-B3C2-AAB4-684E5C40BE18" name="ATP is programmed">
	<EvaluationScript>function check(S228AC30AF1C3462E99D267B727F4DF02Choice) { if(S228AC30AF1C3462E99D267B727F4DF02Choice.getValue().getText() == "ATP is programmed") return true; else return false; }</EvaluationScript>
      </NextStep>
      <NextStep ref="SAC419FD7-13FC-EC66-A478-684E6B582461" name="ATP is not programmed">
	<EvaluationScript>function check(S228AC30AF1C3462E99D267B727F4DF02Choice) { if(S228AC30AF1C3462E99D267B727F4DF02Choice.getValue().getText() == "ATP has not been programmed") return true; else return false; }</EvaluationScript>
      </NextStep>

    </ConsultStep>
      <ConsultStep ID="S96451C42-F39E-B3C2-AAB4-684E5C40BE18" name="Check ATP Effective">
      <Variable name="EffectiveATP" type="integer">
	<Concept code="737888" name="MDC_IDC_STAT_TACHYTHERAPY_ATP_DELIVERED_RECENT" schemeID="MDC_IDC"/>
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
		      <a
			href="PPM:TAB3">Access to
			EHR</a> <br />
		      Implanted Device:
		      <data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
		      <data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
		      <br />
		      Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a href="PPM:TAB1">Access
			to previous Remote follow-up results</a> </p>

		    <p><br />
		    </p>
		  </td>
		</tr>
		<tr name="CIEDBlock">
		  <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		    <p align="center"><b>Brief Information about the recent alarm </b></p>
		    Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		    VT Episode <br />
		    <a href="PPM:TAB1">Access to Report
		      Exported</a> </td>
		</tr>
		<tr name="EGMBlock">
		  <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		    <p align="center"><b>Brief Information about the EGM and detected
			problems </b> </p>

		    <table  cellspacing="10" width="100%">
		      <tbody>
			<tr>

			  <p align="center"> EGM: <a href="PPM:TAB1">Access to
			      Report Exported</a> <br /> </p>


			  <p><img width="312" height="190" id="Picture1"
			      src="caremanagementdb://Patient/Observation/@base64String"
			      alt="x.bmp" /></p>

			</tr>
		      </tbody>
		    </table>
		  </td>
		</tr>
		<tr name="ChoiceBlock">
		  <td style="background-color:#eeeeee">
		    <p align="center"><b>Recommendation and Next Step to follow </b> </p>
		    <p>Please choose the suitable option</p>

		    <form onsubmit="return ValidateData();" action="null" method="post">

		      <input type="submit" name="D45Choice" value="ATP is effective" onclick="btnWhichButton=this"/>
		      <input type="submit" name="D45Choice" value="ATP was not effective" onclick="btnWhichButton=this"/>

		    </form>
		  </td>
		</tr>
	      </tbody>
	    </table>
	  </body>
	</HTML>
      </Display>
      <NextStep ref="S42F61D34-3D6A-29F5-D8FD-67B19FD9CE09" name="ATP is effective">
	<EvaluationScript>function check(S96451C42F39EB3C2AAB4684E5C40BE18Choice) { if(S96451C42F39EB3C2AAB4684E5C40BE18Choice.getValue().getText() == "ATP is effective") return true; else return false; }</EvaluationScript>
      </NextStep>
      <NextStep ref="SAC419FD7-13FC-EC66-A478-684E6B582461" name="ATP is not effective">
	<EvaluationScript>function check(S96451C42F39EB3C2AAB4684E5C40BE18Choice) { if(S96451C42F39EB3C2AAB4684E5C40BE18Choice.getValue().getText() == "ATP was not effective") return true; else return false; }</EvaluationScript>
      </NextStep>

    </ConsultStep>
      <ConsultStep ID="SAC419FD7-13FC-EC66-A478-684E6B582461" name="Check Programmed Shock">
      <Variable name="ProgrammedShock" type="integer">
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
		      <a
			href="PPM:TAB3">Access to
			EHR</a> <br />
		      Implanted Device:
		      <data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
		      <data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
		      <br />
		      Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a href="PPM:TAB1">Access
			to previous Remote follow-up results</a> </p>

		    <p><br />
		    </p>
		  </td>
		</tr>
		<tr name="CIEDBlock">
		  <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		    <p align="center"><b>Brief Information about the recent alarm </b></p>
		    Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		    VT Episode <br />
		    <a href="PPM:TAB1">Access to Report
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
			    <p align="center"> EGM: <a href="PPM:TAB1">Access to
				Report Exported</a> <br /> </p>


			    <p><img width="312" height="190" id="Picture1"
				src="caremanagementdb://Patient/Observation/@base64String"
				alt="x.bmp" /></p>
			  </td>
			  <td><!--The following HTML will be populated in the execution step-->

			    <p align="center">  Assesment by CIED <a href="PPM:TAB1">Access
				to Report Exported</a> <br />
			      <br/>

			      <p align="left"># of ProgrammedShock: $ProgrammedShock <br />

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
		    <p align="center"><b>Recommendation and Next Step to follow </b> </p>
		    <p>Please choose the suitable option</p>

		    <form onsubmit="return ValidateData();" action="null" method="post">

		      <input type="submit" name="D42Choice" value="Shock is programmed and delivered" onclick="btnWhichButton=this"/>
		      <input type="submit" name="D42Choice" value="Shock was not delivered" onclick="btnWhichButton=this"/>

		    </form>
		  </td>
		</tr>
	      </tbody>
	    </table>
	  </body>
	</HTML>
      </Display>
      <NextStep ref="S7C868CFC-1BE2-E3FB-4F76-6853BF2C9B36" name="Shock is programmed">
	<EvaluationScript>function check(SAC419FD713FCEC66A478684E6B582461Choice) { if(SAC419FD713FCEC66A478684E6B582461Choice.getValue().getText() == "Shock is programmed and delivered") return true; else return false; }</EvaluationScript>
      </NextStep>
      <NextStep ref="S92517FF5-96FF-83FD-CF3B-6853CE4CFDAA" name="Shock is not programmed">
	<EvaluationScript>function check(SAC419FD713FCEC66A478684E6B582461Choice) { if(SAC419FD713FCEC66A478684E6B582461Choice.getValue().getText() == "Shock was not delivered") return true; else return false; }</EvaluationScript>
      </NextStep>

    </ConsultStep>
      <ConsultStep ID="S7C868CFC-1BE2-E3FB-4F76-6853BF2C9B36" name="Check Shock Effective">

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
		      <a
			href="PPM:TAB3">Access to
			EHR</a> <br />
		      Implanted Device:
		      <data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
		      <data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
		      <br />
		      Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a href="PPM:TAB1">Access
			to previous Remote follow-up results</a> </p>

		    <p><br />
		    </p>
		  </td>
		</tr>
		<tr name="CIEDBlock">
		  <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		    <p align="center"><b>Brief Information about the recent alarm </b></p>
		    Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		    VT Episode <br />
		    <a href="PPM:TAB1">Access to Report
		      Exported</a> </td>
		</tr>
		<tr name="EGMBlock">
		  <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		    <p align="center"><b>Brief Information about the EGM and detected
			problems </b> </p>

		    <table  cellspacing="10" width="100%">
		      <tbody>
			<tr>

			  <p align="center"> EGM: <a href="PPM:TAB1">Access to
			      Report Exported</a> <br /> </p>


			  <p><img width="312" height="190" id="Picture1"
			      src="caremanagementdb://Patient/Observation/@base64String"
			      alt="x.bmp" /></p>

			</tr>
		      </tbody>
		    </table>
		  </td>
		</tr>
		<tr name="ChoiceBlock">
		  <td style="background-color:#eeeeee">
		    <p align="center"><b>Recommendation and Next Step to follow </b> </p>
		    <p>Please choose the suitable option</p>

		    <form onsubmit="return ValidateData();" action="null" method="post">

		      <input type="submit" name="D43Choice" value="Shock is effective" onclick="btnWhichButton=this"/>
		      <input type="submit" name="D43Choice" value="Shock was not effective" onclick="btnWhichButton=this"/>

		    </form>
		  </td>
		</tr>
	      </tbody>
	    </table>
	  </body>
	</HTML>
      </Display>
      <NextStep ref="S42F61D34-3D6A-29F5-D8FD-67B19FD9CE09" name="Shock is effective">
	<EvaluationScript>function check(S7C868CFC1BE2E3FB4F766853BF2C9B36Choice) { if(S7C868CFC1BE2E3FB4F766853BF2C9B36Choice.getValue().getText() == "Shock is effective") return true; else return false; }</EvaluationScript>
      </NextStep>
      <NextStep ref="S9185EB27-52A0-0AF7-EB00-67C51BD5B7B0" name="Shock is not effective">
	<EvaluationScript>function check(S7C868CFC1BE2E3FB4F766853BF2C9B36Choice) {  if(S7C868CFC1BE2E3FB4F766853BF2C9B36Choice.getValue().getText() == "Shock was not effective") return true; else return false; }</EvaluationScript>
      </NextStep>
    </ConsultStep>
      <RecommendationStep ID="S92517FF5-96FF-83FD-CF3B-6853CE4CFDAA" name="Perform self monitoring">
      <Receiver ref="P4"/>
      <Urgency>3</Urgency>
      <Display>
	<HTML>
	  <p>Perform self monitoring and send the ICD Report.</p>

	</HTML>
      </Display>
      <NextStep ref="SDC22B3FB-3C40-7D26-2601-68577A79EDEB"/>
    </RecommendationStep>
      <WaitStep ID="SDC22B3FB-3C40-7D26-2601-68577A79EDEB" name="Wait till the CIED report is received">
      <Event>
	<DataSource code="C0581396" name="Cardiac implant device" schemeID="UMLS"/>
      </Event>
      <NextStep ref="S7FE1C19C-B68B-6DD1-B8F8-6858A500F11D" name="Send notification to Doctor"/>
    </WaitStep> 
      <ConsultStep ID="S7FE1C19C-B68B-6DD1-B8F8-6858A500F11D" name="Present the EGM, check VT">

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
		      <a
			href="PPM:TAB3">Access to
			EHR</a> <br />
		      Implanted Device:
		      <data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
		      <data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
		      <br />
		      Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a href="PPM:TAB1">Access
			to previous Remote follow-up results</a> </p>

		    <p><br />
		    </p>
		  </td>
		</tr>
		<tr name="CIEDBlock">
		  <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		    <p align="center"><b>Brief Information about the recent alarm </b></p>
		    Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		    VT Episode <br />
		    <a href="PPM:TAB1">Access to Report
		      Exported</a> </td>
		</tr>
		<tr name="EGMBlock">
		  <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		    <p align="center"><b>Brief Information about the EGM and detected
			problems </b> </p>

		    <table  cellspacing="10" width="100%">
		      <tbody>
			<tr>

			  <p align="center"> EGM: <a href="PPM:TAB1">Access to
			      Report Exported</a> <br /> </p>


			  <p><img width="312" height="190" id="Picture1"
			      src="caremanagementdb://Patient/Observation/@base64String"
			      alt="x.bmp" /></p>

			</tr>
		      </tbody>
		    </table>
		  </td>
		</tr>
		<tr name="ChoiceBlock">
		  <td style="background-color:#eeeeee">
		    <p align="center"><b>Recommendation and Next Step to follow </b> </p>
		    <p>Check the recent EGM sent by the patient and indicate whether there is VT or not.</p>
		    <form onsubmit="return ValidateData();" action="null" method="post">
		      <input type="submit" name="D44Choice" value="There is VT persistent!" onclick="btnWhichButton=this"/>
		      <input type="submit" name="D44Choice" value="There is no VT!" onclick="btnWhichButton=this"/>										
		    </form>
		  </td>
		</tr>
	      </tbody>
	    </table>
	  </body>
	</HTML>
      </Display>
      <NextStep ref="S9185EB27-52A0-0AF7-EB00-67C51BD5B7B0" name="There is VT persistent!">
	<EvaluationScript>function check(S7FE1C19CB68B6DD1B8F86858A500F11DChoice) { if(S7FE1C19CB68B6DD1B8F86858A500F11DChoice.getValue().getText() == "The case is VT!") return true; else return false; }</EvaluationScript>
      </NextStep>
      <NextStep ref="S42F61D34-3D6A-29F5-D8FD-67B19FD9CE09" name="The case is no VT!">
	<EvaluationScript>function check(S7FE1C19CB68B6DD1B8F86858A500F11DChoice) { if(S7FE1C19CB68B6DD1B8F86858A500F11DChoice.getValue().getText() == "There is no VT!") return true; else return false; }</EvaluationScript>
      </NextStep>	
    </ConsultStep>
  </Algorithm>
</Body>
</MedicalCareplan>

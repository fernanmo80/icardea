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
      <StartStep ID="SEC1015ACF16AF3331C376E3054D26595">
	<NextStep ref="S80251CF3E98C720F5B4D6E37322A6A8C"/>
      </StartStep>
      <FinalStep ID="SCCCB5EA8B07CAC2607AF6E3FB7A74B86" name="Guideline Finalized"/>
      <ConsultStep ID="S80251CF3E98C720F5B4D6E37322A6A8C" name="Present the CIED Data and EGM to the Medical Professional">
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
			  target="_blank" href="PPM:TAB3">Access to
			  EHR</a> <br />
			Implanted Device:
			<data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
			<data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
			<br />
			Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a target="_blank" href="PPM:TAB1">Access
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
		      <a target="_blank" href="PPM:TAB1">Access to Report Exported</a>
		    </td>
		  </tr>
		  <tr name="EGMBlock"> <td style="background-color:#eeeeee">
		      <p align="center"><b>Brief Information about the EGM and detected
			  problems </b> </p>
		      <table  cellspacing="10" width="100%">
			<tbody>
			  <tr>
			    <td><!--The following HTML will be populated in the execution step-->
			      <p align="center"> EGM: <a target="_blank" href="PPM:TAB1">Access to
				  Report Exported</a> <br /> </p>


			      <p><img width="312" height="190" id="Picture1"
				  src="caremanagementdb://Patient/Observation/@base64String"
				  alt="x.bmp" /></p>
			    </td>
			    <td><!--The following HTML will be populated in the execution step-->

			      <p align="center">  Assesment by CIED <a target="_blank" href="PPM:TAB1">Access
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
			<td style="background-color:#eeeeee">
			  <p align="center"><b>Brief Information about the Comorbid diseases
			  </b> </p>
			  <table  width="100%">
			<tbody>
			  <tr>
				<td>Renal insufficiency or renal failure:</td>
				<td>
				  $RenalInsufficiency
				  <a target="_blank" href="PPM:TAB3">Access to EHR</a>
				</td>
			  </tr>
			  <tr>
				<td>Heart failure:</td>
				<td>
				  $HeartFailure
				   <a target="_blank" href="PPM:TAB3">Access to EHR</a>
				</td>
			  </tr>
			  <tr>
				<td>Diabetes:</td>
				<td>
				  $Diabetes
				   <a target="_blank" href="PPM:TAB3">Access to EHR</a>
				</td>
			  </tr>
			  <tr>
				<td>Atrial arrhythmia:</td>
				<td>
				  $AtrialArrhythmia
				   <a target="_blank" href="PPM:TAB3">Access to EHR</a>
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
	<NextStep ref="S685A96A2F701EC9EF05D00D4BF84CD9A" name="The case is VT!">
	  <EvaluationScript>function check(S80251CF3E98C720F5B4D6E37322A6A8CChoice) { if(S80251CF3E98C720F5B4D6E37322A6A8CChoice.getValue().getText() == "The case is VT!") return true; else return false; }</EvaluationScript>
	</NextStep>
	<NextStep ref="SA023F5C263D7E7B700716E3FA3B6D7ED" name="There is Noise!">
	  <EvaluationScript>function check(S80251CF3E98C720F5B4D6E37322A6A8CChoice) { if(S80251CF3E98C720F5B4D6E37322A6A8CChoice.getValue().getText() == "There is Noise!") return true; else return false; }</EvaluationScript>
	</NextStep>
	<NextStep ref="SF0A4C709DF5ADE9E9DE36E3F6F435150" name="The case is SVT!">
	  <EvaluationScript>function check(S80251CF3E98C720F5B4D6E37322A6A8CChoice) { if(S80251CF3E98C720F5B4D6E37322A6A8CChoice.getValue().getText() == "The case is SVT!") return true; else return false; }</EvaluationScript>
	</NextStep>
	<NextStep ref="SCCCB5EA8B07CAC2607AF6E3FB7A74B86" name="Finalize careplan!">
	  <EvaluationScript>function check(S80251CF3E98C720F5B4D6E37322A6A8CChoice) { if(S80251CF3E98C720F5B4D6E37322A6A8CChoice.getValue().getText() == "Finalize careplan!") return true; else return false; }</EvaluationScript>
	</NextStep>
      </ConsultStep>
	  <ConsultStep ID="S685A96A2F701EC9EF05D00D4BF84CD9A" name="Check Sustain/Non-Sustain VT">
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
			  target="_blank" href="PPM:TAB3">Access to
			  EHR</a> <br />
			Implanted Device:
			<data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
			<data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
			<br />
			Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a target="_blank" href="PPM:TAB1">Access
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
		      <a target="_blank" href="PPM:TAB1">Access to Report Exported</a>
		    </td>
		  </tr>
		 <tr name="EGMBlock"> <td style="background-color:#eeeeee">
		      <p align="center"><b>Brief Information about the EGM and detected
			  problems </b> </p>
		      <table  cellspacing="10" width="100%">
			<tbody>
			  <tr>
			    <td><!--The following HTML will be populated in the execution step-->
			      <p align="center"> EGM: <a target="_blank" href="PPM:TAB1">Access to
				  Report Exported</a> <br /> </p>


			      <p><img width="312" height="190" id="Picture1"
				  src="caremanagementdb://Patient/Observation/@base64String"
				  alt="x.bmp" /></p>
			    </td>
			    <td><!--The following HTML will be populated in the execution step-->

			      <p align="center">  Assesment by CIED <a target="_blank" href="PPM:TAB1">Access
				  to Report Exported</a> <br />
				<br/>
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
			<input type="submit" name="S5Choice" value="There is Sustained VT!" onclick="btnWhichButton=this" />
			<input type="submit" name="S5Choice" value="There is no Sustained VT!" onclick="btnWhichButton=this"/>
			  </form>
		    </td>
		  </tr>
		</tbody>
	      </table>
	    </body>
	  </HTML>
	</Display>
        <NextStep name="There is Sustained VT!" ref="S28D3B94DCE4E4DF7D86F6E3FABF8C4A5">
          <EvaluationScript>function check(S685A96A2F701EC9EF05D00D4BF84CD9AChoice) { if(S685A96A2F701EC9EF05D00D4BF84CD9AChoice.getValue().getText() == "There is Sustained VT!") return true; else return false; }</EvaluationScript>
        </NextStep>
        <NextStep name="There is no Sustained VT!" ref="SCCCB5EA8B07CAC2607AF6E3FB7A74B86">
          <EvaluationScript>function check(S685A96A2F701EC9EF05D00D4BF84CD9AChoice) { if(S685A96A2F701EC9EF05D00D4BF84CD9AChoice.getValue().getText() == "There is no Sustained VT!") return true; else return false; }</EvaluationScript>
        </NextStep>
      </ConsultStep>
	  
      <ConsultStep ID="S28D3B94DCE4E4DF7D86F6E3FABF8C4A5" name="Check Episodes">
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
			  target="_blank" href="PPM:TAB3">Access to
			  EHR</a> <br />
			Implanted Device:
			<data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
			<data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
			<br />
			Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a target="_blank" href="PPM:TAB1">Access
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
		      <a target="_blank" href="PPM:TAB1">Access to Report
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
			      <p align="center"> EGM: <a target="_blank" href="PPM:TAB1">Access to
				  Report Exported</a> <br /> </p>


			      <p><img width="312" height="190" id="Picture1"
				  src="caremanagementdb://Patient/Observation/@base64String"
				  alt="x.bmp" /></p>
			    </td>
			    <td><!--The following HTML will be populated in the execution step-->

			      <p align="center">  Assesment by CIED <a target="_blank" href="PPM:TAB1">Access
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
	<NextStep ref="SC3B74767147B37445C0E6E41413D4DEC" name="Frequent Episodes">
	  <EvaluationScript>function check(S28D3B94DCE4E4DF7D86F6E3FABF8C4A5Choice) { if(S28D3B94DCE4E4DF7D86F6E3FABF8C4A5Choice.getValue().getText() == "Frequent Episodes") return true; else return false; }</EvaluationScript>
	</NextStep>
	<NextStep ref="SDB9C456801A5FBB48F7E6E414E831533" name="Single/Rare Episode">
	  <EvaluationScript>function check(S28D3B94DCE4E4DF7D86F6E3FABF8C4A5Choice) { if(S28D3B94DCE4E4DF7D86F6E3FABF8C4A5Choice.getValue().getText() == "Single/Rare Episode")  return true; else return false; }</EvaluationScript>
	</NextStep>
      </ConsultStep>
      <ConsultStep ID="SC3B74767147B37445C0E6E41413D4DEC" name="Check Programmed ATP">
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
			  target="_blank" href="PPM:TAB3">Access to
			  EHR</a> <br />
			Implanted Device:
			<data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
			<data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
			<br />
			Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a target="_blank" href="PPM:TAB1">Access
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
		      <a target="_blank" href="PPM:TAB1">Access to Report
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
			      <p align="center"> EGM: <a target="_blank" href="PPM:TAB1">Access to
				  Report Exported</a> <br /> </p>


			      <p><img width="312" height="190" id="Picture1"
				  src="caremanagementdb://Patient/Observation/@base64String"
				  alt="x.bmp" /></p>
			    </td>
			    <td><!--The following HTML will be populated in the execution step-->

			      <p align="center">  Assesment by CIED <a target="_blank" href="PPM:TAB1">Access
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
	<NextStep ref="S24EE72B1477E036E87DC6E4256189F75" name="ATP is programmed">
	  <EvaluationScript>function check(SC3B74767147B37445C0E6E41413D4DECChoice) { if(SC3B74767147B37445C0E6E41413D4DECChoice.getValue().getText() == "ATP is programmed") return true; else return false; }</EvaluationScript>
	</NextStep>
	<NextStep ref="S075C8C86D5472BB7852C6E425FCB8411" name="ATP has not been programmed">
	  <EvaluationScript>function check(SC3B74767147B37445C0E6E41413D4DECChoice) { if(SC3B74767147B37445C0E6E41413D4DECChoice.getValue().getText() == "ATP has not been programmed") return true; else return false; }</EvaluationScript>
	</NextStep>
      </ConsultStep>
      <ConsultStep ID="S24EE72B1477E036E87DC6E4256189F75" name="Check ATP Effective">
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
			  target="_blank" href="PPM:TAB3">Access to
			  EHR</a> <br />
			Implanted Device:
			<data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
			<data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
			<br />
			Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a target="_blank" href="PPM:TAB1">Access
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
		      <a target="_blank" href="PPM:TAB1">Access to Report
			Exported</a> </td>
		  </tr>
		  <tr name="EGMBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		      <p align="center"><b>Brief Information about the EGM and detected
			  problems </b> </p>

		      <table  cellspacing="10" width="100%">
			<tbody>
			  <tr>

			    <p align="center"> EGM: <a target="_blank" href="PPM:TAB1">Access to
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
	<NextStep ref="SCCB9A5A6FE1C4D4AA6CA6E4345338ACE" name="ATP is effective">
	  <EvaluationScript>function check(S24EE72B1477E036E87DC6E4256189F75Choice) { if(S24EE72B1477E036E87DC6E4256189F75Choice.getValue().getText() == "ATP is effective") return true; else return false; }</EvaluationScript>
	</NextStep>
	<NextStep ref="S075C8C86D5472BB7852C6E425FCB8411" name="ATP was not effective">
	  <EvaluationScript>function check(S24EE72B1477E036E87DC6E4256189F75Choice) { if(S24EE72B1477E036E87DC6E4256189F75Choice.getValue().getText() == "ATP was not effective") return true; else return false; }</EvaluationScript>
	</NextStep>
      </ConsultStep>
      <ConsultStep ID="SCCB9A5A6FE1C4D4AA6CA6E4345338ACE" name="Consider Decompensating Factor">
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
			  target="_blank" href="PPM:TAB3">Access to
			  EHR</a> <br />
			Implanted Device:
			<data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
			<data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
			<br />
			Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a target="_blank" href="PPM:TAB1">Access
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
		      <a target="_blank" href="PPM:TAB1">Access to Report
			Exported</a> </td>
		  </tr-->
		  <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee">

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      VT Episode <br />
		      <a target="_blank" href="PPM:TAB1">Access to Report
			Exported</a> </td>
		  </tr>
		  <tr name="EGMBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		      <p align="center"><b>Brief Information about the EGM and detected
			  problems </b> </p>


		      <p align="center"> EGM: <a target="_blank" href="PPM:TAB1">Access to
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
	<NextStep ref="S0C9434BEF59F5AD46B476E4490D2D37E" name="Consider Decompensating Factor!">
	  <EvaluationScript>function check(SCCB9A5A6FE1C4D4AA6CA6E4345338ACEChoice) { if(SCCB9A5A6FE1C4D4AA6CA6E4345338ACEChoice.getValue().getText() == "Consider Decompensating Factor!") return true; else return false; }</EvaluationScript>
	</NextStep>
	<NextStep ref="SCCCB5EA8B07CAC2607AF6E3FB7A74B86" name="Do not consider decompensating factor!">
	  <EvaluationScript>function check(SCCB9A5A6FE1C4D4AA6CA6E4345338ACEChoice) { if(SCCB9A5A6FE1C4D4AA6CA6E4345338ACEChoice.getValue().getText() == "Do not consider decompensating factor!") return true; else return false; }</EvaluationScript>
	</NextStep>
      </ConsultStep>
      <ConsultStep ID="S075C8C86D5472BB7852C6E425FCB8411" name="Check Programmed Shock">
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
			  target="_blank" href="PPM:TAB3">Access to
			  EHR</a> <br />
			Implanted Device:
			<data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
			<data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
			<br />
			Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a target="_blank" href="PPM:TAB1">Access
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
		      <a target="_blank" href="PPM:TAB1">Access to Report
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
			      <p align="center"> EGM: <a target="_blank" href="PPM:TAB1">Access to
				  Report Exported</a> <br /> </p>


			      <p><img width="312" height="190" id="Picture1"
				  src="caremanagementdb://Patient/Observation/@base64String"
				  alt="x.bmp" /></p>
			    </td>
			    <td><!--The following HTML will be populated in the execution step-->

			      <p align="center">  Assesment by CIED <a target="_blank" href="PPM:TAB1">Access
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
	<NextStep ref="S585FF23CB962903656236E46E1E3A6AF" name="Shock is programmed and delivered">
	  <EvaluationScript>function check(S075C8C86D5472BB7852C6E425FCB8411Choice) { if(S075C8C86D5472BB7852C6E425FCB8411Choice.getValue().getText() == "Shock is programmed and delivered") return true; else return false; }</EvaluationScript>
	</NextStep>
	<NextStep ref="S7091CE1C6F8C1066FEEE6E46ED441F21" name="Shock was not delivered">
	  <EvaluationScript>function check(S075C8C86D5472BB7852C6E425FCB8411Choice) { if(S075C8C86D5472BB7852C6E425FCB8411Choice.getValue().getText() == "Shock was not delivered") return true; else return false; }</EvaluationScript>
	</NextStep>
      </ConsultStep>
      <ConsultStep ID="S585FF23CB962903656236E46E1E3A6AF" name="Check Shock Effective">
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
			  target="_blank" href="PPM:TAB3">Access to
			  EHR</a> <br />
			Implanted Device:
			<data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
			<data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
			<br />
			Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a target="_blank" href="PPM:TAB1">Access
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
		      <a target="_blank" href="PPM:TAB1">Access to Report
			Exported</a> </td>
		  </tr>
		  <tr name="EGMBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		      <p align="center"><b>Brief Information about the EGM and detected
			  problems </b> </p>

		      <table  cellspacing="10" width="100%">
			<tbody>
			  <tr>

			    <p align="center"> EGM: <a target="_blank" href="PPM:TAB1">Access to
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
	<NextStep ref="S0C9434BEF59F5AD46B476E4490D2D37E" name="Shock is effective">
	  <EvaluationScript>function check(S585FF23CB962903656236E46E1E3A6AFChoice) { if(S585FF23CB962903656236E46E1E3A6AFChoice.getValue().getText() == "Shock is effective") return true; else return false; }</EvaluationScript>
	</NextStep>
	<NextStep ref="SF1752270F59BF4C5D44F6E4856FECAC9" name="Shock was not effective">
	  <EvaluationScript>function check(S585FF23CB962903656236E46E1E3A6AFChoice) {  if(S585FF23CB962903656236E46E1E3A6AFChoice.getValue().getText() == "Shock was not effective") return true; else return false; }</EvaluationScript>
	</NextStep>
      </ConsultStep>
      <RecommendationStep ID="S7091CE1C6F8C1066FEEE6E46ED441F21" name="Perform self monitoring">
	<Receiver ref="P4"/>
	<Urgency>3</Urgency>
	<Display>
	  <HTML>
	    <p>Perform self monitoring and send the ICD Report.</p>

	  </HTML>
	</Display>
	<NextStep ref="S9F521F1FA6AC0487C4AE6E495CF34AA2"/>
      </RecommendationStep>
      <WaitStep ID="S9F521F1FA6AC0487C4AE6E495CF34AA2" name="The CIED report has been received.">
	<Event>
	  <DataSource code="C0581396" name="Cardiac implant device" schemeID="UMLS"/>
	</Event>
	<NextStep ref="S679EFF085265CD4266CD6E4A3EAB3FEA" name="Present the EGM, check VT"/>
      </WaitStep> 
      <ConsultStep ID="S679EFF085265CD4266CD6E4A3EAB3FEA" name="Present the EGM, check VT">
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
			  target="_blank" href="PPM:TAB3">Access to
			  EHR</a> <br />
			Implanted Device:
			<data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
			<data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
			<br />
			Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a target="_blank" href="PPM:TAB1">Access
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
		      <a target="_blank" href="PPM:TAB1">Access to Report
			Exported</a> </td>
		  </tr>
		  <tr name="EGMBlock">
		    <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		      <p align="center"><b>Brief Information about the EGM and detected
			  problems </b> </p>

		      <table  cellspacing="10" width="100%">
			<tbody>
			  <tr>

			    <p align="center"> EGM: <a target="_blank" href="PPM:TAB1">Access to
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
	<NextStep ref="SF1752270F59BF4C5D44F6E4856FECAC9" name="There is VT persistent!">
	  <EvaluationScript>function check(S679EFF085265CD4266CD6E4A3EAB3FEAChoice) { if(S679EFF085265CD4266CD6E4A3EAB3FEAChoice.getValue().getText() == "The case is VT!") return true; else return false; }</EvaluationScript>
	</NextStep>
	<NextStep ref="S0C9434BEF59F5AD46B476E4490D2D37E" name="There is no VT!">
	  <EvaluationScript>function check(S679EFF085265CD4266CD6E4A3EAB3FEAChoice) { if(S679EFF085265CD4266CD6E4A3EAB3FEAChoice.getValue().getText() == "There is no VT!") return true; else return false; }</EvaluationScript>
	</NextStep>	
      </ConsultStep>
      <RecommendationStep ID="SF1752270F59BF4C5D44F6E4856FECAC9" name="Urgent follow-up in hospital">
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
			  target="_blank" href="PPM:TAB3">Access to
			  EHR</a> <br />
			Implanted Device:
			<data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
			<data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
			<br />
			Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a target="_blank" href="PPM:TAB1">Access
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
		      <a target="_blank" href="PPM:TAB1">Access to Report
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
	<NextStep ref="SCCCB5EA8B07CAC2607AF6E3FB7A74B86"/>
      </RecommendationStep> 
      <ConsultStep ID="S0C9434BEF59F5AD46B476E4490D2D37E" name="Present Medications Compliance and Medication Change">
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
			  target="_blank" href="PPM:TAB3">Access to
			  EHR</a> <br />
			Implanted Device:
			<data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
			<data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
			<br />
			Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a target="_blank" href="PPM:TAB1">Access
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
		      <a target="_blank" href="PPM:TAB1">Access to Report
			Exported</a> </td>
		  </tr-->
		  <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee">

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      VT Episode <br />
		      <a target="_blank" href="PPM:TAB1">Access to Report
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
			    <content>function generate(ehrMeds, phrMeds) { var e; var p; var output = ''; for(e=0; e&lt;ehrMeds.length;e++) { var ehrMed = ehrMeds[e]; var effectiveTimeHighEHR = ehrMed.getEffectiveTimeHigh(); if(!isActiveDate(effectiveTimeHighEHR)) continue; output = output + '&lt;tr&gt;'; var useIt = 'No'; for(p=0; p&lt;phrMeds.length;p++) { var phrMed = phrMeds[p];	var effectiveTimeHighPHR = phrMed.getEffectiveTimeHigh(); if(!isActiveDate(effectiveTimeHighPHR)) continue; if(ehrMed.getDrugCode() != null) if(ehrMed.getDrugCode().equals(phrMed.getDrugCode())) { useIt = '&lt;font color=\"#880015\"&gt;&lt;b&gt;Yes: ' + phrMed.getDoseQuantity() + ' mg&lt;/b&gt;&lt;/font&gt;'; }  } var line = '&lt;td&gt;' + ehrMed.getText() + ':' + ehrMed.getDoseQuantity() + ' mg&lt;/td&gt;' + '&lt;td&gt;' + useIt + '&lt;/td&gt;' + '&lt;td&gt;'; output = output + line; output = output + '&lt;/tr&gt;'; }  return output; }</content>
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
	<NextStep ref="S89990E344751A753CA206E4F18090C65" name="There is medication incompliance/medication change">
	  <EvaluationScript>function check(S0C9434BEF59F5AD46B476E4490D2D37EChoice) { if(S0C9434BEF59F5AD46B476E4490D2D37EChoice.getValue().getText() == "There is medication incompliance/medication change") return true; else return false; }</EvaluationScript>
	</NextStep>
	<NextStep ref="SF7B4C2BAF8033CA971B06E4F268E4DB2" name="The patient regulary takes her medications">
	  <EvaluationScript>function check(S0C9434BEF59F5AD46B476E4490D2D37EChoice) { if(S0C9434BEF59F5AD46B476E4490D2D37EChoice.getValue().getText() == "The patient regulary takes her medications") return true; else return false; }</EvaluationScript>
	</NextStep>
      </ConsultStep>
      <ConsultStep ID="SF7B4C2BAF8033CA971B06E4F268E4DB2" name="Check patient reported Symptoms">
	<Variable name="Vomit" type="string">
	  <DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	  <DataSource code="C0033213" name="Problem" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var x="no"; var y=0; var names=list.toArray(); for(var i=0; i &lt; names.length;i++) { var problem = names[i]; var effectiveTimeHigh = problem.getEffectiveTimeHigh(); if(!isActiveDate(effectiveTimeHigh)) continue; if(problem.getProblemValue() != null) if(problem.getProblemValue().equals("C0042963")) y=y+1; } if(y>0) { x="yes"; } return x; }</RefinementScript>
	</Variable>
	<Variable name="Diarrhea" type="string">
	  <DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	  <DataSource code="C0033213" name="Problem" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var x="no"; var y=0; var names=list.toArray(); for(var i=0; i &lt; names.length;i++) { var problem = names[i]; var effectiveTimeHigh = problem.getEffectiveTimeHigh(); if(!isActiveDate(effectiveTimeHigh)) continue; if(problem.getProblemValue() != null) if(problem.getProblemValue().equals("C0011991")) y=y+1; } if(y>0) { x="yes"; } return x; }</RefinementScript>
	</Variable>
	<Variable name="ChestPain" type="string">
	  <DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	  <DataSource code="C0033213" name="Problem" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var x="no"; var y=0; var names=list.toArray(); for(var i=0; i &lt; names.length;i++) { var problem = names[i]; var effectiveTimeHigh = problem.getEffectiveTimeHigh(); if(!isActiveDate(effectiveTimeHigh)) continue; if(problem.getProblemValue() != null) if(problem.getProblemValue().equals("C0042963")) y=y+1; } if(y>0) { x="yes"; } return x; }</RefinementScript>
	</Variable>
	<Variable name="ShortnessofBreath" type="string">
	  <DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	  <DataSource code="C0033213" name="Problem" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var x="no"; var y=0; var names=list.toArray(); for(var i=0; i &lt; names.length;i++) { var problem = names[i]; var effectiveTimeHigh = problem.getEffectiveTimeHigh(); if(!isActiveDate(effectiveTimeHigh)) continue; if(problem.getProblemValue() != null) if(problem.getProblemValue().equals("C0008031")) y=y+1; } if(y>0) { x="yes"; } return x; }</RefinementScript>
	</Variable>
	<Variable name="WeightGain" type="string">
	  <DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	  <DataSource code="C0033213" name="Problem" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var x="no"; var y=0; var names=list.toArray(); for(var i=0; i &lt; names.length;i++) { var problem = names[i]; var effectiveTimeHigh = problem.getEffectiveTimeHigh(); if(!isActiveDate(effectiveTimeHigh)) continue; if(problem.getProblemValue() != null) if(problem.getProblemValue().equals("C0043094")) y=y+1; } if(y>0) { x="yes"; } return x; }</RefinementScript>
	</Variable>
	<Variable name="Fever" type="string">
	  <DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	  <DataSource code="C0033213" name="Problem" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var x="no"; var y=0; var names=list.toArray(); for(var i=0; i &lt; names.length;i++) { var problem = names[i]; var effectiveTimeHigh = problem.getEffectiveTimeHigh(); if(!isActiveDate(effectiveTimeHigh)) continue; if(problem.getProblemValue() != null) if(problem.getProblemValue().equals("C0015967")) y=y+1; } if(y>0) { x="yes"; } return x; }</RefinementScript>
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
			  target="_blank" href="PPM:TAB3">Access to
			  EHR</a> <br />
			Implanted Device:
			<data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
			<data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
			<br />
			Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a target="_blank" href="PPM:TAB1">Access
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
		      <a target="_blank" href="PPM:TAB1">Access to Report
			Exported</a> </td>
		  </tr-->
		  <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee">

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      VT Episode <br />
		      <a target="_blank" href="PPM:TAB1">Access to Report
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
			      <a target="_blank" href="PPM:TAB3">Access to PHR</a> 
				  <br />
			    </td>
			  </tr>
			  <tr>
			    <td>Diarrhea</td>
			    <td>
			      $Diarrhea
			      <a target="_blank" href="PPM:TAB3">Access to PHR</a> 
			    </td>
			  </tr>
			  <tr>
			    <td>Chest Pain</td>
			    <td>
			      $ChestPain
			      <a target="_blank" href="PPM:TAB3">Access to PHR</a> 
			    </td>
			  </tr>
			  <tr>
			    <td>Shortness of Breath</td>
			    <td>
			      $ShortnessofBreath
			      <a target="_blank" href="PPM:TAB3">Access to PHR</a> 
			    </td>
			  </tr>
			  <tr>
			    <td>Weight Gain</td>
			    <td>
			      $WeightGain
			      <a target="_blank" href="PPM:TAB3">Access to PHR</a> 
			    </td>
			  </tr>
			  <tr>
			    <td>Fever</td>
			    <td>
			      $Fever
			      <a target="_blank" href="PPM:TAB3">Access to PHR</a> 
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
	<NextStep ref="S83FEA01C119022C6DCE86E50CAB64AF6" name="Yes">
	  <EvaluationScript>function check(SF7B4C2BAF8033CA971B06E4F268E4DB2Choice) { if(SF7B4C2BAF8033CA971B06E4F268E4DB2Choice.getValue().getText() == "Yes") return true; else return false; }</EvaluationScript>
	</NextStep>
	<NextStep ref="S6F08F29CA65B231D4EBF6E50D96144AF" name="No, there is no such symptoms">
	  <EvaluationScript>function check(SF7B4C2BAF8033CA971B06E4F268E4DB2Choice) { if(SF7B4C2BAF8033CA971B06E4F268E4DB2Choice.getValue().getText() == "No, there is no such symptoms") return true; else return false; }</EvaluationScript>
	</NextStep>
      </ConsultStep>
      <ConsultStep ID="S6F08F29CA65B231D4EBF6E50D96144AF" name="Check Recent Lab Results">
	<Variable name="LastLabResultDate" type="date">
	  <DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	  <DataSource code="C1254595" name="ImagingResult" schemeID="UMLS"/>
	  <RefinementScript>function refine(list) { var names=list.toArray(); if(names == null || names.length == 0) { return ': 175 days ago'; } var labResult = names[0]; var effectiveTime = labResult.getEffectiveTime(); var dayDiff=dayDifference(effectiveTime); effectiveTime = effectiveTime + ': ' + dayDiff + ' days ago.'; return effectiveTime; }</RefinementScript>
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
			  target="_blank" href="PPM:TAB3">Access to
			  EHR</a> <br />
			Implanted Device:
			<data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
			<data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
			<br />
			Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a target="_blank" href="PPM:TAB1">Access
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
		      <a target="_blank" href="PPM:TAB1">Access to Report
			Exported</a> </td>
		  </tr-->
		  <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee">

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      VT Episode <br />
		      <a target="_blank" href="PPM:TAB1">Access to Report
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
	<NextStep ref="S4E8C5D382F57D71583216E52DFCC2AE7" name="Yes, Please order a new Lab result">
	  <EvaluationScript>function check(S6F08F29CA65B231D4EBF6E50D96144AFChoice) { if(S6F08F29CA65B231D4EBF6E50D96144AFChoice.getValue().getText() == "Yes, Please order a new Lab result") return true; else return false; }</EvaluationScript>
	</NextStep>
	<NextStep ref="SA71D2E02A0E36D31D6376E52EB835DB9" name="No, there is no need for a new lab test">
	  <EvaluationScript>function check(S6F08F29CA65B231D4EBF6E50D96144AFChoice) { if(S6F08F29CA65B231D4EBF6E50D96144AFChoice.getValue().getText() == "No, there is no need for a new lab test") return true; else return false; }</EvaluationScript>
	</NextStep>
      </ConsultStep>	
      <RecommendationStep ID="S4E8C5D382F57D71583216E52DFCC2AE7" name="Order new Lab Test">
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
			  target="_blank" href="PPM:TAB3">Access to
			  EHR</a> <br />
			Implanted Device:
			<data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
			<data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
			<br />
			Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a target="_blank" href="PPM:TAB1">Access
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
		      <a target="_blank" href="PPM:TAB1">Access to Report
			Exported</a> </td>
		  </tr-->
		   <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee">

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      VT Episode <br />
		      <a target="_blank" href="PPM:TAB1">Access to Report
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
	<NextStep ref="SD8E32B1D51CFBD14AC466E53B595BBC1"/>
      </RecommendationStep>
      <WaitStep ID="SD8E32B1D51CFBD14AC466E53B595BBC1" name="The Lab results have been received">
	<Event>
	  <DataSource code="C1254595" name="ImagingResult" schemeID="UMLS"/>
	  <DataSource code="C1562065" name="Record of health event" schemeID="UMLS"/>
	</Event>
	<NextStep ref="SA71D2E02A0E36D31D6376E52EB835DB9" name="Check Lab results for abnormality"/>
      </WaitStep> 
      <ConsultStep ID="SA71D2E02A0E36D31D6376E52EB835DB9" name="Check Lab results for abnormality">

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
			  target="_blank" href="PPM:TAB3">Access to
			  EHR</a> <br />
			Implanted Device:
			<data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
			<data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
			<br />
			Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a target="_blank" href="PPM:TAB1">Access
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
		      <a target="_blank" href="PPM:TAB1">Access to Report
			Exported</a> </td>
		  </tr-->
		   <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee">

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      VT Episode <br />
		      <a target="_blank" href="PPM:TAB1">Access to Report
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
			       <a target="_blank" href="PPM:TAB3">Access to EHR</a>
			    </td>
			    <td>3.9-5.4 U/l</td>
			  </tr>
			  <tr>
			    <td>Hemoglobin</td>
			    <td>
			      $Hemoglobin
			       <a target="_blank" href="PPM:TAB3">Access to EHR</a>
			    </td>
			    <td>11.7-15.7 U/l</td>
			  </tr>
			  <tr>
			    <td>Sodium</td>
			    <td>
			      $Sodium
			       <a target="_blank" href="PPM:TAB3">Access to EHR</a>
			    </td>
			    <td>135-148 U/l</td>
			  </tr>
			  <tr>
			    <td>Chloride</td>
			    <td>
			      $Chloride
			       <a target="_blank" href="PPM:TAB3">Access to EHR</a>
			    </td>
			    <td>97-108 U/l</td>
			  </tr>
			  <tr>
			    <td>Creatinine</td>
			    <td>
			      $Creatinine
			       <a target="_blank" href="PPM:TAB3">Access to EHR</a>
			    </td>
			    <td>0.5-1.1 U/l</td>
			  </tr>
			  <tr>
			    <td>Troponin</td>
			    <td>
			      $Troponin
			       <a target="_blank" href="PPM:TAB3">Access to EHR</a>
			    </td>
			    <td>should be less than 14 U/l</td>
			  </tr>
		      </tbody>
		    </table>
		  </td>
		</tr>
		<tr name="EHRBlock">
		  <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->
		    <p align="center"><b>Brief Information about the Patient History retrieved from EHR
		    </b> </p>

		    <table  width="100%">
		      <tbody>
			<tr>
			  <td><b>Comorbid Diseases</b></td>
			  <td><b>EHR values</b></td>
			</tr>

			  <tr>
				<td>Renal insufficiency or renal failure:</td>
				<td>
				  $RenalInsufficiency
				   <a target="_blank" href="PPM:TAB3">Access to EHR</a>
				</td>
			  </tr>
			  <tr>
				<td>Heart failure:</td>
				<td>
				  $HeartFailure
				   <a target="_blank" href="PPM:TAB3">Access to EHR</a>
				</td>
			  </tr>
			  <tr>
				<td>Diabetes:</td>
				<td>
				  $Diabetes
				   <a target="_blank" href="PPM:TAB3">Access to EHR</a>
				</td>
			  </tr>
			  <tr>
				<td>Atrial arrhythmia:</td>
				<td>
				  $AtrialArrhythmia
				   <a target="_blank" href="PPM:TAB3">Access to EHR</a>
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
      <NextStep ref="S1DF29D0DACECFA6F1E286E555B5C5C29" name="Yes, there is!">
	<EvaluationScript>function check(SA71D2E02A0E36D31D6376E52EB835DB9Choice) { if(SA71D2E02A0E36D31D6376E52EB835DB9Choice.getValue().getText() == "Yes, there is!") return true; else return false; }</EvaluationScript>
      </NextStep>
      <NextStep ref="S0DF7DC9B914BB08F465A6E5574209343" name="No, there is no abnormality">
	<EvaluationScript>function check(SA71D2E02A0E36D31D6376E52EB835DB9Choice) { if(SA71D2E02A0E36D31D6376E52EB835DB9Choice.getValue().getText() == "No, there is no abnormality") return true; else return false; }</EvaluationScript>
      </NextStep>
    </ConsultStep>
      <RecommendationStep ID="S89990E344751A753CA206E4F18090C65" name="Take Corrective Action about Medication incompliance">
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
			target="_blank" href="PPM:TAB3">Access to
			EHR</a> <br />
		      Implanted Device:
		      <data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
		      <data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
		      <br />
		      Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a target="_blank" href="PPM:TAB1">Access
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
		    <a target="_blank" href="PPM:TAB1">Access to Report
		      Exported</a> </td>
		</tr-->
		 <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee">

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      VT Episode <br />
		      <a target="_blank" href="PPM:TAB1">Access to Report
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
      <NextStep ref="SCCCB5EA8B07CAC2607AF6E3FB7A74B86"/>
    </RecommendationStep>
      <RecommendationStep ID="S83FEA01C119022C6DCE86E50CAB64AF6" name="Take Corrective Action about Patient reported symptoms">
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
			target="_blank" href="PPM:TAB3">Access to
			EHR</a> <br />
		      Implanted Device:
		      <data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
		      <data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
		      <br />
		      Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a target="_blank" href="PPM:TAB1">Access
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
		    <a target="_blank" href="PPM:TAB1">Access to Report
		      Exported</a> </td>
		</tr-->
		 <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee">

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      VT Episode <br />
		      <a target="_blank" href="PPM:TAB1">Access to Report
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
      <NextStep ref="SCCCB5EA8B07CAC2607AF6E3FB7A74B86"/>
    </RecommendationStep>
      <RecommendationStep ID="S1DF29D0DACECFA6F1E286E555B5C5C29" name="Take Corrective Action about recent lab results">
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
			target="_blank" href="PPM:TAB3">Access to
			EHR</a> <br />
		      Implanted Device:
		      <data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
		      <data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
		      <br />
		      Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a target="_blank" href="PPM:TAB1">Access
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
		    <a target="_blank" href="PPM:TAB1">Access to Report
		      Exported</a> </td>
		</tr-->
		 <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee">

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      VT Episode <br />
		      <a target="_blank" href="PPM:TAB1">Access to Report
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
      <NextStep ref="SCCCB5EA8B07CAC2607AF6E3FB7A74B86"/>
    </RecommendationStep>
      <ConsultStep ID="S0DF7DC9B914BB08F465A6E5574209343" name="Consider Anti arrhythmic drug">
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
			  target="_blank" href="PPM:TAB3">Access to
			  EHR</a> <br />
			Implanted Device:
			<data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
			<data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
			<br />
			Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a target="_blank" href="PPM:TAB1">Access
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
		      <a target="_blank" href="PPM:TAB1">Access to Report
			Exported</a> </td>
		  </tr-->
		   <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee">

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      VT Episode <br />
		      <a target="_blank" href="PPM:TAB1">Access to Report
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
			    $CongenitalHeartDisease  <a target="_blank" href="PPM:TAB3">Access to EHR</a>
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

			  <p align="center"> EGM: <a target="_blank" href="PPM:TAB1">Access to
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
      <NextStep ref="SB52A72C639B4ED53A2856E59BAD4587F" name="There is no Congenital Heart Disease">
	<EvaluationScript>function check(S0DF7DC9B914BB08F465A6E5574209343Choice) { if(S0DF7DC9B914BB08F465A6E5574209343Choice.getValue().getText() == "There is no Congenital Heart Disease") return true; else return false; }</EvaluationScript>		
	</NextStep><NextStep ref="S72B5635841C27339ED466E59C70A8C13" name="There is Congenital Heart Disease and Non-Sustained VT">
	<EvaluationScript>function check(S0DF7DC9B914BB08F465A6E5574209343Choice) { if(S0DF7DC9B914BB08F465A6E5574209343Choice.getValue().getText() == "There is Congenital Heart Disease and Non-Sustained VT") return true; else return false; }</EvaluationScript>		
	</NextStep><NextStep ref="S29AC463513691C7A6CB16E59D3649230" name="There is Congenital Heart Disease and Sustained VT">
	<EvaluationScript>function check(S0DF7DC9B914BB08F465A6E5574209343Choice) { if(S0DF7DC9B914BB08F465A6E5574209343Choice.getValue().getText() == "There is Congenital Heart Disease and Sustained VT") return true; else return false; }</EvaluationScript>		
      </NextStep>
      <NextStep ref="SCCCB5EA8B07CAC2607AF6E3FB7A74B86" name="There is Congenital Heart Disease and Isolated PVCs">
	<EvaluationScript>function check(S0DF7DC9B914BB08F465A6E5574209343Choice) { if(S0DF7DC9B914BB08F465A6E5574209343Choice.getValue().getText() == "There is Congenital Heart Disease and Isolated PVCs") return true; else return false; }</EvaluationScript>		
      </NextStep>
    </ConsultStep>
      <ConsultStep ID="SB52A72C639B4ED53A2856E59BAD4587F" name="Consider Anti arrhythmic drug">
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
			  target="_blank" href="PPM:TAB3">Access to
			  EHR</a> <br />
			Implanted Device:
			<data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
			<data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
			<br />
			Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a target="_blank" href="PPM:TAB1">Access
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
		      <a target="_blank" href="PPM:TAB1">Access to Report
			Exported</a> </td>
		  </tr-->
		   <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee">

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      VT Episode <br />
		      <a target="_blank" href="PPM:TAB1">Access to Report
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
			     <a target="_blank" href="PPM:TAB3">Access to EHR</a>
			  </td>
			</tr>
			<tr>
			  <td>Dilated Cardiomyopathy</td>
			  <td>
			    $DilatedCardiomyopathy
			     <a target="_blank" href="PPM:TAB3">Access to EHR</a>
			  </td>
			</tr>
			<tr>
			  <td>Hypertrophic Cardiomyopathy</td>
			  <td>
			    $HypertrophicCardiomyopathy
			     <a target="_blank" href="PPM:TAB3">Access to EHR</a>
			  </td>
			</tr>
			<tr>
			  <td>Arrhythmogenic Right Ventricular</td>
			  <td>
			    $ArrhythmogenicRightVentricular
			     <a target="_blank" href="PPM:TAB3">Access to EHR</a>
			  </td>
			</tr>
			<tr>
			  <td>Long QT Syndrome</td>
			  <td>
			    $LongQTSyndrome
			     <a target="_blank" href="PPM:TAB3">Access to EHR</a>
			  </td>
			</tr>
			<tr>
			  <td>Brugada Syndrome</td>
			  <td>
			    $BrugadaSyndrome
			     <a target="_blank" href="PPM:TAB3">Access to EHR</a>
			  </td>
			</tr>
			<tr>
			  <td>Valvular Heart Disease</td>
			  <td>
			    $ValvularHeartDisease
			     <a target="_blank" href="PPM:TAB3">Access to EHR</a>
			  </td>
			</tr>
			<tr>
			  <td>Heart Failure</td>
			  <td>
			    $HeartFailure
			     <a target="_blank" href="PPM:TAB3">Access to EHR</a>
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
      <NextStep ref="SFEB5652182EA365E240E6E5DB6F86A15" name="Wait 1 week to see if medication change is effective">

      </NextStep>
    </ConsultStep>
      <WaitStep ID="SFEB5652182EA365E240E6E5DB6F86A15" name="One week has passed. Check if medication change is effective...">
      <!--Duration unit="ms" amount="604800" /-->	 
      <Duration unit="ms" amount="6000" />	 
      <NextStep ref="S82DCC7FD03EB3DC588C76E5F2723613D" name="Send notification to patient"/>
    </WaitStep>
      <RecommendationStep ID="S82DCC7FD03EB3DC588C76E5F2723613D" name="Send notification to patient">
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
			target="_blank" href="PPM:TAB3">Access to
			EHR</a> <br />
		      Implanted Device:
		      <data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
		      <data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
		      <br />
		      Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a target="_blank" href="PPM:TAB1">Access
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
		    <a target="_blank" href="PPM:TAB1">Access to Report
		      Exported</a> </td>
		</tr-->
		 <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee">

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      VT Episode <br />
		      <a target="_blank" href="PPM:TAB1">Access to Report
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
      <NextStep ref="S500564251A37DBEFF7876E5F9E222560" name="Send notification to Patient"/>
    </RecommendationStep>	
      <WaitStep ID="S500564251A37DBEFF7876E5F9E222560" name="The CIED report has been received...">
      <Event>
	<DataSource code="C0581396" name="Cardiac implant device" schemeID="UMLS"/>
      </Event>
      <NextStep ref="S0E5FED6C8911FC7371EC6E605F323379" name="Check Medication effectiveness"/>
    </WaitStep> 
      <ConsultStep ID="S0E5FED6C8911FC7371EC6E605F323379" name="Check Medication effectiveness">
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
			  target="_blank" href="PPM:TAB3">Access to
			  EHR</a> <br />
			Implanted Device:
			<data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
			<data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
			<br />
			Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a target="_blank" href="PPM:TAB1">Access
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
		      <a target="_blank" href="PPM:TAB1">Access to Report
			Exported</a> </td>
		  </tr-->
		   <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee">

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      VT Episode <br />
		      <a target="_blank" href="PPM:TAB1">Access to Report
			Exported</a> </td>
		  </tr>

		<tr name="EGMBlock">
		  <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		    <p align="center"><b>Brief Information about the EGM and detected
			problems </b> </p>

		    <table  cellspacing="10" width="100%">
		      <tbody>
			<tr>

			  <p align="center"> EGM: <a target="_blank" href="PPM:TAB1">Access to
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

      <NextStep ref="S29AC463513691C7A6CB16E59D3649230" name="Medication change is not effective">
	<EvaluationScript>function check(S0E5FED6C8911FC7371EC6E605F323379Choice) { if(S0E5FED6C8911FC7371EC6E605F323379Choice.getValue().getText() == "Medication change is not effective") return true; else return false; }</EvaluationScript>		
      </NextStep>
      <NextStep ref="SCCCB5EA8B07CAC2607AF6E3FB7A74B86" name="Medication change is effective">
	<EvaluationScript>function check(S0E5FED6C8911FC7371EC6E605F323379Choice) { if(S0E5FED6C8911FC7371EC6E605F323379Choice.getValue().getText() == "Medication change is effective") return true; else return false; }</EvaluationScript>		
      </NextStep>
    </ConsultStep>
      <RecommendationStep ID="S29AC463513691C7A6CB16E59D3649230" name="Consider Ablation">
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
			target="_blank" href="PPM:TAB3">Access to
			EHR</a> <br />
		      Implanted Device:
		      <data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
		      <data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
		      <br />
		      Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a target="_blank" href="PPM:TAB1">Access
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
		    <a target="_blank" href="PPM:TAB1">Access to Report
		      Exported</a> </td>
		</tr-->
		 <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee">

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      VT Episode <br />
		      <a target="_blank" href="PPM:TAB1">Access to Report
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
      <NextStep ref="SCCCB5EA8B07CAC2607AF6E3FB7A74B86"/>
    </RecommendationStep>
      <RecommendationStep ID="S72B5635841C27339ED466E59C70A8C13" name="Consider EP Study">
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
			target="_blank" href="PPM:TAB3">Access to
			EHR</a> <br />
		      Implanted Device:
		      <data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
		      <data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
		      <br />
		      Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a target="_blank" href="PPM:TAB1">Access
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
		    <a target="_blank" href="PPM:TAB1">Access to Report
		      Exported</a> </td>
		</tr-->
		 <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee">

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      VT Episode <br />
		      <a target="_blank" href="PPM:TAB1">Access to Report
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
      <NextStep ref="S29AC463513691C7A6CB16E59D3649230"/>
    </RecommendationStep>	
      <ConsultStep ID="SF0A4C709DF5ADE9E9DE36E3F6F435150" name="Check Inappropriate Discharge">
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
		  <a target="_blank" href="PPM:TAB3">Access to EHR</a>
		  <br/>
		  Implanted Device:
		  <data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
		  <data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
		  <br/>
		  Last Follow-up Date:<data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/>
		  <a target="_blank" href="PPM:TAB1">Access to previous Remote follow-up results</a>
		  <br/>
		</td>
	      </tr>
	      <!--tr name="CIEDBlock">
		<td>
		 
		  Received Date:<data src="caremanagementdb://Patient/CIEDData/@receivedTime"/>
		  <br/>
		  Alarms Detected: VT is detected..
		  <br/>
		  <a target="_blank" href="PPM:TAB1">Access to Report Exported</a>
		</td>
	      </tr-->
		   <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee">

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      VT Episode <br />
		      <a target="_blank" href="PPM:TAB1">Access to Report
			Exported</a> </td>
		  </tr>
	      <tr name="EGMBlock">
		<td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		  <p align="center"><b>Brief Information about the EGM and detected
		      problems </b> </p>

		  <table  cellspacing="10" width="100%">
		    <tbody>
		      <tr>

			<p align="center"> EGM: <a target="_blank" href="PPM:TAB1">Access to
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
      <NextStep ref="SBE70C276CA590B4159B46E66AF0CEF0D" name="Inappropriate Discharge > 1">
	<EvaluationScript>function check(SF0A4C709DF5ADE9E9DE36E3F6F435150Choice) { if(SF0A4C709DF5ADE9E9DE36E3F6F435150Choice.getValue().getText() == "Inappropriate Discharge > 1") return true; else return false; }</EvaluationScript>
      </NextStep>
      <NextStep ref="S0CBC7230AB40836025206E66B85D19E2" name="Inappropriate Discharge = 1">
	<EvaluationScript>function check(SF0A4C709DF5ADE9E9DE36E3F6F435150Choice) { if(SF0A4C709DF5ADE9E9DE36E3F6F435150Choice.getValue().getText() == "Inappropriate Discharge = 1") return true; else return false; }</EvaluationScript>
      </NextStep>
      <NextStep ref="SF8B65E00D8C661B6EBE36E66C879E309" name="Inappropriate Discharge = 0">
	<EvaluationScript>function check(SF0A4C709DF5ADE9E9DE36E3F6F435150Choice) { if(SF0A4C709DF5ADE9E9DE36E3F6F435150Choice.getValue().getText() == "Inappropriate Discharge = 0") return true; else return false; }</EvaluationScript>
      </NextStep>
    </ConsultStep>
      <ConsultStep ID="SBE70C276CA590B4159B46E66AF0CEF0D" name="Consider immediate referral to the Clinic"><!--Change from RecommendationStep to ConsultStep-->
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
			target="_blank" href="PPM:TAB3">Access to
			EHR</a> <br />
		      Implanted Device:
		      <data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
		      <data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
		      <br />
		      Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a target="_blank" href="PPM:TAB1">Access
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
		    <a target="_blank" href="PPM:TAB1">Access to Report
		      Exported</a> </td>
		</tr-->
		 <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee">

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      VT Episode <br />
		      <a target="_blank" href="PPM:TAB1">Access to Report
			Exported</a> </td>
		  </tr>
		<tr name="RecommendationBlock">
		  <td style="background-color:#eeeeee">
		    <p align="center"><b><font color="#880015">Recommendation and Next Step to follow </font> </b></p>
		    <p>Real SVT is detected and there are more than one inappropriate discharges. Arrange immediate referral to the Clinic and call the patient</p>

		    <form onsubmit="return ValidateData();" action="null" method="post">
		      <input type="submit" name="D5Choice" value="Finalize the Care Plan!" onclick="btnWhichButton=this"/>
		      <input type="submit" name="D5Choice" value="Send an SMS to patient/caregiver and Finalize the Care Plan!" onclick="btnWhichButton=this"/>
		  </form></td>
		</tr>
	      </tbody>
	    </table>
	  </body>
	</HTML>
      </Display>
      <NextStep ref="SCCCB5EA8B07CAC2607AF6E3FB7A74B86" name="Finalize the Care Plan!">
	<EvaluationScript>function check(SBE70C276CA590B4159B46E66AF0CEF0DChoice) { if(SBE70C276CA590B4159B46E66AF0CEF0DChoice.getValue().getText() == "Finalize the Care Plan!") return true; else return false; }</EvaluationScript>
      </NextStep>
      <NextStep ref="S1F52066191605F05B5CB6E68951DB677" name="Send an SMS to patient/caregiver and Finalize the Care Plan!">
	<EvaluationScript>function check(SBE70C276CA590B4159B46E66AF0CEF0DChoice) { if(SBE70C276CA590B4159B46E66AF0CEF0DChoice.getValue().getText() == "Send an SMS to patient/caregiver and Finalize the Care Plan!") return true; else return false; }</EvaluationScript>
      </NextStep>
    </ConsultStep>	
      <RecommendationStep ID="S1F52066191605F05B5CB6E68951DB677" name="Send notification to patient for immediate referral">
      <Receiver ref="P4"/>
      <Urgency>3</Urgency>
      <Display>
	<HTML>
	  <p>Please go to the clinic as soon as possible for an immediate ICD Follow-up</p>

	</HTML>
      </Display>
      <NextStep ref="SCCCB5EA8B07CAC2607AF6E3FB7A74B86"/>
    </RecommendationStep>	
      <ConsultStep ID="S0CBC7230AB40836025206E66B85D19E2" name="Consider a follow up in clinic"><!--Change from RecommendationStep to ConsultStep-->
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
			target="_blank" href="PPM:TAB3">Access to
			EHR</a> <br />
		      Implanted Device:
		      <data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
		      <data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
		      <br />
		      Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a target="_blank" href="PPM:TAB1">Access
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
		    <a target="_blank" href="PPM:TAB1">Access to Report
		      Exported</a> </td>
		</tr-->
		 <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee">

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      VT Episode <br />
		      <a target="_blank" href="PPM:TAB1">Access to Report
			Exported</a> </td>
		  </tr>
		<tr name="RecommendationBlock">
		  <td style="background-color:#eeeeee">
		    <p align="center"><b><font color="#880015">Recommendation and Next Step to follow </font> </b></p>
		    <p>Real SVT is detected and there is a inappropriate discharges. Arrange a follow up the Clinic and call the patient</p>

		    <form onsubmit="return ValidateData();" action="null" method="post">
		      <input type="submit" name="D5Choice" value="Finalize the Care Plan!" onclick="btnWhichButton=this"/>
		      <input type="submit" name="D5Choice" value="Send an SMS to patient/caregiver and Finalize the Care Plan!" onclick="btnWhichButton=this"/>
		  </form></td>
		</tr>
	      </tbody>
	    </table>
	  </body>
	</HTML>
      </Display>
      <NextStep ref="SCCCB5EA8B07CAC2607AF6E3FB7A74B86" name="Finalize the Care Plan!">
	<EvaluationScript>function check(S0CBC7230AB40836025206E66B85D19E2Choice) { if(S0CBC7230AB40836025206E66B85D19E2Choice.getValue().getText() == "Finalize the Care Plan!") return true; else return false; }</EvaluationScript>
      </NextStep>
      <NextStep ref="S68C2C3BD6D4AECF8682C6E6BD015530D" name="Send an SMS to patient/caregiver and Finalize the Care Plan!">
	<EvaluationScript>function check(S0CBC7230AB40836025206E66B85D19E2Choice) { if(S0CBC7230AB40836025206E66B85D19E2Choice.getValue().getText() == "Send an SMS to patient/caregiver and Finalize the Care Plan!") return true; else return false; }</EvaluationScript>
      </NextStep>
    </ConsultStep>	
      <RecommendationStep ID="S68C2C3BD6D4AECF8682C6E6BD015530D" name="Send notification to patient for immediate referral">
      <Receiver ref="P4"/>
      <Urgency>3</Urgency>
      <Display>
	<HTML>
	  <p>Please call the clinic for an in clinic follow up appointment</p>

	</HTML>
      </Display>
      <NextStep ref="SCCCB5EA8B07CAC2607AF6E3FB7A74B86"/>
    </RecommendationStep>		 
      <ConsultStep ID="SF8B65E00D8C661B6EBE36E66C879E309" name="Consider a follow up in clinic"><!--Change from RecommendationStep to ConsultStep-->
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
			target="_blank" href="PPM:TAB3">Access to
			EHR</a> <br />
		      Implanted Device:
		      <data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
		      <data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
		      <br />
		      Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a target="_blank" href="PPM:TAB1">Access
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
		    <a target="_blank" href="PPM:TAB1">Access to Report
		      Exported</a> </td>
		</tr-->
		 <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee">

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      VT Episode <br />
		      <a target="_blank" href="PPM:TAB1">Access to Report
			Exported</a> </td>
		  </tr>
		<tr name="RecommendationBlock">
		  <td style="background-color:#eeeeee">
		    <p align="center"><b><font color="#880015">Recommendation and Next Step to follow </font> </b></p>
		    <p>Real SVT is detected however there is no inappropriate discharges. Arrange a routine follow up the Clinic and call the patient</p>

		    <form onsubmit="return ValidateData();" action="null" method="post">
		      <input type="submit" name="D5Choice" value="Finalize the Care Plan!" onclick="btnWhichButton=this"/>
		      <input type="submit" name="D5Choice" value="Send an SMS to patient/caregiver and Finalize the Care Plan!" onclick="btnWhichButton=this"/>
		  </form></td>
		</tr>
	      </tbody>
	    </table>
	  </body>
	</HTML>
      </Display>
      <NextStep ref="SCCCB5EA8B07CAC2607AF6E3FB7A74B86" name="Finalize the Care Plan!">
	<EvaluationScript>function check(SF8B65E00D8C661B6EBE36E66C879E309Choice) { if(SF8B65E00D8C661B6EBE36E66C879E309Choice.getValue().getText() == "Finalize the Care Plan!") return true; else return false; }</EvaluationScript>
      </NextStep>
      <NextStep ref="SE8F9916B35B89644392D6E6DE2A6E46E" name="Send an SMS to patient/caregiver and Finalize the Care Plan!">
	<EvaluationScript>function check(SF8B65E00D8C661B6EBE36E66C879E309Choice) { if(SF8B65E00D8C661B6EBE36E66C879E309Choice.getValue().getText() == "Send an SMS to patient/caregiver and Finalize the Care Plan!") return true; else return false; }</EvaluationScript>
      </NextStep>
    </ConsultStep>	
      <RecommendationStep ID="SE8F9916B35B89644392D6E6DE2A6E46E" name="Send notification to patient for immediate referral">
      <Receiver ref="P4"/>
      <Urgency>3</Urgency>
      <Display>
	<HTML>
	  <p>Please call the clinic for an routine follow up appointment</p>

	</HTML>
      </Display>
      <NextStep ref="SCCCB5EA8B07CAC2607AF6E3FB7A74B86"/>
    </RecommendationStep>
      <RecordActionStep ID="SA023F5C263D7E7B700716E3FA3B6D7ED" name="Record Noise Event">
      <Concept code="C0028263" name="Noise" schemeID="UMLS"/>
      <DataSource code="C0033213" name="Problem" schemeID="UMLS"/>
      <Value text="true"/>
      <NextStep ref="S74CDBB1CBD692B3A52066E6FD3470AC7" name="Present the EGM, check electrode dysfunction"/>
    </RecordActionStep>
      <ConsultStep ID="S74CDBB1CBD692B3A52066E6FD3470AC7" name="Present the EGM, check electrode dysfunction">
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
			target="_blank" href="PPM:TAB3">Access to
			EHR</a> <br />
		      Implanted Device:
		      <data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
		      <data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
		      <br />
		      Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a target="_blank" href="PPM:TAB1">Access
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
		    <a target="_blank" href="PPM:TAB1">Access to Report
		      Exported</a> </td>
		</tr>
		<tr name="EGMBlock">
		  <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		    <p align="center"><b>Brief Information about the EGM and detected
			problems </b> </p>

		    <table  cellspacing="10" width="100%">
		      <tbody>
			<tr>

			  <p align="center"> EGM: <a target="_blank" href="PPM:TAB1">Access to
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
      <NextStep ref="SD456A0A5A709B829D6846E70BF98A865" name="There is electrode dysfunction!">
	<EvaluationScript>function check(S74CDBB1CBD692B3A52066E6FD3470AC7Choice) { if(S74CDBB1CBD692B3A52066E6FD3470AC7Choice.getValue().getText() == "There is electrode dysfunction!") return true; else return false; }</EvaluationScript>
      </NextStep>
      <NextStep ref="S2A57AA09F1BBBCFBDE9A6E70CB9B6BB3" name="There is no electrode dysfunction!">
	<EvaluationScript>function check(S74CDBB1CBD692B3A52066E6FD3470AC7Choice) { if(S74CDBB1CBD692B3A52066E6FD3470AC7Choice.getValue().getText() == "There is no electrode dysfunction!") return true; else return false; }</EvaluationScript>
      </NextStep>	
    </ConsultStep>
      <ConsultStep ID="SD456A0A5A709B829D6846E70BF98A865" name="Present the Lead Impedance Alerts, Lead Impedance Trend, Amplitude of the signal to the Medical Professional">
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
			target="_blank" href="PPM:TAB3">Access to
			EHR</a> <br />
		      Implanted Device:
		      <data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
		      <data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
		      <br />
		      Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a target="_blank" href="PPM:TAB1">Access
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
		    <a target="_blank" href="PPM:TAB1">Access to Report
		      Exported</a> </td>
		</tr-->
		 <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee">

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      VT Episode <br />
		      <a target="_blank" href="PPM:TAB1">Access to Report
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
			    <p align="center"> EGM: <a target="_blank" href="PPM:TAB1">Access to
				Report Exported</a> <br /> </p>


			    <p><img width="312" height="190" id="Picture1"
				src="caremanagementdb://Patient/Observation/@base64String"
				alt="x.bmp" /></p>
			  </td>
			  <td><!--The following HTML will be populated in the execution step-->

			    <p align="center">  Assesment by CIED <a target="_blank" href="PPM:TAB1">Access
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
      <NextStep ref="S19BCE6D3A4932C938C726E72E4033A90" name="Yes, there are!">
	<EvaluationScript>function check(SD456A0A5A709B829D6846E70BF98A865Choice) { if(SD456A0A5A709B829D6846E70BF98A865Choice.getValue().getText() == "Yes, there are!") return true; else return false; }</EvaluationScript>
      </NextStep>
      <NextStep ref="SCCCB5EA8B07CAC2607AF6E3FB7A74B86" name="No, there is not!">
	<EvaluationScript>function check(SD456A0A5A709B829D6846E70BF98A865Choice) { if(SD456A0A5A709B829D6846E70BF98A865Choice.getValue().getText() == "No, there is not!") return true; else return false; }</EvaluationScript>
      </NextStep>
    </ConsultStep>
      <ConsultStep ID="S19BCE6D3A4932C938C726E72E4033A90" name="Consider urgent follow up in hospital"><!--Change from RecommendationStep to ConsultStep-->
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
			target="_blank" href="PPM:TAB3">Access to
			EHR</a> <br />
		      Implanted Device:
		      <data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
		      <data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
		      <br />
		      Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a target="_blank" href="PPM:TAB1">Access
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
		    <a target="_blank" href="PPM:TAB1">Access to Report
		      Exported</a> </td>
		</tr-->
		 <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee">

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      VT Episode <br />
		      <a target="_blank" href="PPM:TAB1">Access to Report
			Exported</a> </td>
		  </tr>
		<tr name="RecommendationBlock">
		  <td style="background-color:#eeeeee">
		    <p align="center"><b><font color="#880015">Recommendation and Next Step to follow </font> </b></p>
		    <p>Noise is detected and there seems to be a problem in ICD Device. Arrange immediate referral to the Clinic and call the patient</p>

		    <form onsubmit="return ValidateData();" action="null" method="post">
		      <input type="submit" name="R22Choice" value="Finalize the Care Plan!" onclick="btnWhichButton=this"/>
		      <input type="submit" name="R22Choice" value="Send an SMS to patient/caregiver and Finalize the Care Plan!" onclick="btnWhichButton=this"/>
		  </form></td>
		</tr>
	      </tbody>
	    </table>
	  </body>
	</HTML>
      </Display>
      <NextStep ref="SCCCB5EA8B07CAC2607AF6E3FB7A74B86" name="Finalize the Care Plan!">
	<EvaluationScript>function check(S19BCE6D3A4932C938C726E72E4033A90Choice) { if(S19BCE6D3A4932C938C726E72E4033A90Choice.getValue().getText() == "Finalize the Care Plan!") return true; else return false; }</EvaluationScript>
      </NextStep>
      <NextStep ref="SC8AAE5225EE3B246C5A36E746E5B32F7" name="Send an SMS to patient/caregiver and Finalize the Care Plan!">
	<EvaluationScript>function check(S19BCE6D3A4932C938C726E72E4033A90Choice) { if(S19BCE6D3A4932C938C726E72E4033A90Choice.getValue().getText() == "Send an SMS to patient/caregiver and Finalize the Care Plan!") return true; else return false; }</EvaluationScript>
      </NextStep>
    </ConsultStep>	
      <RecommendationStep ID="SC8AAE5225EE3B246C5A36E746E5B32F7" name="Send notification to patient for immeidiate referral">
      <Receiver ref="P4"/>
      <Urgency>3</Urgency>
      <Display>
	<HTML>
	  <p>Please go to the clinic as soon as possible for an immediate ICD Follow-up</p>

	</HTML>
      </Display>
      <NextStep ref="SCCCB5EA8B07CAC2607AF6E3FB7A74B86"/>
    </RecommendationStep>	
      <ConsultStep ID="S2A57AA09F1BBBCFBDE9A6E70CB9B6BB3" name="Present the EGM, check external disturbances">

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
			target="_blank" href="PPM:TAB3">Access to
			EHR</a> <br />
		      Implanted Device:
		      <data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
		      <data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
		      <br />
		      Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a target="_blank" href="PPM:TAB1">Access
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
		    <a target="_blank" href="PPM:TAB1">Access to Report
		      Exported</a> </td>
		</tr>
		<tr name="EGMBlock">
		  <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		    <p align="center"><b>Brief Information about the EGM and detected
			problems </b> </p>

		    <table  cellspacing="10" width="100%">
		      <tbody>
			<tr>

			  <p align="center"> EGM: <a target="_blank" href="PPM:TAB1">Access to
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
      <NextStep ref="SE05C20D9D05E03A35F886E76C70477D8" name="There seems to be external disturbances!">
	<EvaluationScript>function check(S2A57AA09F1BBBCFBDE9A6E70CB9B6BB3Choice) { if(S2A57AA09F1BBBCFBDE9A6E70CB9B6BB3Choice.getValue().getText() == "There seems to be external disturbances!") return true; else return false; }</EvaluationScript>
      </NextStep>
      <NextStep ref="S28D3B94DCE4E4DF7D86F6E3FABF8C4A5" name="There is no external disturbance, check Real VT Case!">
	<EvaluationScript>function check(S2A57AA09F1BBBCFBDE9A6E70CB9B6BB3Choice) { if(S2A57AA09F1BBBCFBDE9A6E70CB9B6BB3Choice.getValue().getText() == "There is no external disturbance, check Real VT Case!") return true; else return false; }</EvaluationScript>
      </NextStep>	
      <NextStep ref="SF0A4C709DF5ADE9E9DE36E3F6F435150" name="There is no external disturbance, check Real SVT Case!">
	<EvaluationScript>function check(S2A57AA09F1BBBCFBDE9A6E70CB9B6BB3Choice) { if(S2A57AA09F1BBBCFBDE9A6E70CB9B6BB3Choice.getValue().getText() == "There is no external disturbance, check Real SVT Case!") return true; else return false; }</EvaluationScript>
      </NextStep>	
    </ConsultStep>
      <ConsultStep ID="SE05C20D9D05E03A35F886E76C70477D8" name="Check Number of Noises within that week">
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
			target="_blank" href="PPM:TAB3">Access to
			EHR</a> <br />
		      Implanted Device:
		      <data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
		      <data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
		      <br />
		      Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a target="_blank" href="PPM:TAB1">Access
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
		    <a target="_blank" href="PPM:TAB1">Access to Report
		      Exported</a> </td>
		</tr>
		<tr name="EGMBlock">
		  <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		    <p align="center"><b>Brief Information about the EGM and detected
			problems </b> </p>

		    <table  cellspacing="10" width="100%">
		      <tbody>
			<tr>

			  <p align="center"> EGM: <a target="_blank" href="PPM:TAB1">Access to
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
		      <input type="submit" name="D23Choice" value="Number of Noise Cases is > 3" onclick="btnWhichButton=this"/>
		      <input type="submit" name="D23Choice" value="Number of Noise cases is 1" onclick="btnWhichButton=this"/>	

		    </form>
		  </td>
		</tr>
	      </tbody>
	    </table>
	  </body>
	</HTML>
      </Display>
      <NextStep ref="S3EF157451C547A3087966E7974356606" name="Number of Noise Cases is > 3">
	<EvaluationScript>function check(SE05C20D9D05E03A35F886E76C70477D8Choice) { if(SE05C20D9D05E03A35F886E76C70477D8Choice.getValue().getText() == "Number of Noise Cases is > 3") return true; else return false; }</EvaluationScript>
      </NextStep>
      <NextStep ref="SCCCB5EA8B07CAC2607AF6E3FB7A74B86" name="Number of Noise cases is 1">
	<EvaluationScript>function check(SE05C20D9D05E03A35F886E76C70477D8Choice) { if(SE05C20D9D05E03A35F886E76C70477D8Choice.getValue().getText() == "Number of Noise cases is 1") return true; else return false; }</EvaluationScript>
      </NextStep>	
    </ConsultStep>
      <RecommendationStep ID="S3EF157451C547A3087966E7974356606" name="Contacts the patient">
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
			target="_blank" href="PPM:TAB3">Access to
			EHR</a> <br />
		      Implanted Device:
		      <data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
		      <data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
		      <br />
		      Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a target="_blank" href="PPM:TAB1">Access
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
		    <a target="_blank" href="PPM:TAB1">Access to Report
		      Exported</a> </td>
		</tr-->
		 <tr name="CIEDBlock">
		    <td style="background-color:#eeeeee">

		      <p align="center"><b>Brief Information about the recent alarm </b></p>
		      Received Date: <data src="caremanagementdb://Patient/CIEDData/@receivedTime"/><br />
		      VT Episode <br />
		      <a target="_blank" href="PPM:TAB1">Access to Report
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
      <NextStep ref="SCCCB5EA8B07CAC2607AF6E3FB7A74B86" name="finalize"/>

    </RecommendationStep>	
      <ConsultStep ID="SDB9C456801A5FBB48F7E6E414E831533" name="Check Programmed ATP">
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
			target="_blank" href="PPM:TAB3">Access to
			EHR</a> <br />
		      Implanted Device:
		      <data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
		      <data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
		      <br />
		      Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a target="_blank" href="PPM:TAB1">Access
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
		    <a target="_blank" href="PPM:TAB1">Access to Report
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
			    <p align="center"> EGM: <a target="_blank" href="PPM:TAB1">Access to
				Report Exported</a> <br /> </p>


			    <p><img width="312" height="190" id="Picture1"
				src="caremanagementdb://Patient/Observation/@base64String"
				alt="x.bmp" /></p>
			  </td>
			  <td><!--The following HTML will be populated in the execution step-->

			    <p align="center">  Assesment by CIED <a target="_blank" href="PPM:TAB1">Access
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
      <NextStep ref="S54FE76FB9BBE0DBA14686E7C058E2A3A" name="ATP is programmed">
	<EvaluationScript>function check(SDB9C456801A5FBB48F7E6E414E831533Choice) { if(SDB9C456801A5FBB48F7E6E414E831533Choice.getValue().getText() == "ATP is programmed") return true; else return false; }</EvaluationScript>
      </NextStep>
      <NextStep ref="S87FC60A4B13C7F3B15156E7C106550FA" name="ATP has not been programmed">
	<EvaluationScript>function check(SDB9C456801A5FBB48F7E6E414E831533Choice) { if(SDB9C456801A5FBB48F7E6E414E831533Choice.getValue().getText() == "ATP has not been programmed") return true; else return false; }</EvaluationScript>
      </NextStep>

    </ConsultStep>
      <ConsultStep ID="S54FE76FB9BBE0DBA14686E7C058E2A3A" name="Check ATP Effective">
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
			target="_blank" href="PPM:TAB3">Access to
			EHR</a> <br />
		      Implanted Device:
		      <data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
		      <data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
		      <br />
		      Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a target="_blank" href="PPM:TAB1">Access
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
		    <a target="_blank" href="PPM:TAB1">Access to Report
		      Exported</a> </td>
		</tr>
		<tr name="EGMBlock">
		  <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		    <p align="center"><b>Brief Information about the EGM and detected
			problems </b> </p>

		    <table  cellspacing="10" width="100%">
		      <tbody>
			<tr>

			  <p align="center"> EGM: <a target="_blank" href="PPM:TAB1">Access to
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
      <NextStep ref="SCCCB5EA8B07CAC2607AF6E3FB7A74B86" name="ATP is effective">
	<EvaluationScript>function check(S54FE76FB9BBE0DBA14686E7C058E2A3AChoice) { if(S54FE76FB9BBE0DBA14686E7C058E2A3AChoice.getValue().getText() == "ATP is effective") return true; else return false; }</EvaluationScript>
      </NextStep>
      <NextStep ref="S87FC60A4B13C7F3B15156E7C106550FA" name="ATP was not effective">
	<EvaluationScript>function check(S54FE76FB9BBE0DBA14686E7C058E2A3AChoice) { if(S54FE76FB9BBE0DBA14686E7C058E2A3AChoice.getValue().getText() == "ATP was not effective") return true; else return false; }</EvaluationScript>
      </NextStep>

    </ConsultStep>
      <ConsultStep ID="S87FC60A4B13C7F3B15156E7C106550FA" name="Check Programmed Shock">
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
			target="_blank" href="PPM:TAB3">Access to
			EHR</a> <br />
		      Implanted Device:
		      <data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
		      <data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
		      <br />
		      Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a target="_blank" href="PPM:TAB1">Access
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
		    <a target="_blank" href="PPM:TAB1">Access to Report
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
			    <p align="center"> EGM: <a target="_blank" href="PPM:TAB1">Access to
				Report Exported</a> <br /> </p>


			    <p><img width="312" height="190" id="Picture1"
				src="caremanagementdb://Patient/Observation/@base64String"
				alt="x.bmp" /></p>
			  </td>
			  <td><!--The following HTML will be populated in the execution step-->

			    <p align="center">  Assesment by CIED <a target="_blank" href="PPM:TAB1">Access
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
      <NextStep ref="S44DC47FF149E3B95DCB66E7EA43A916D" name="Shock is programmed and delivered">
	<EvaluationScript>function check(S87FC60A4B13C7F3B15156E7C106550FAChoice) { if(S87FC60A4B13C7F3B15156E7C106550FAChoice.getValue().getText() == "Shock is programmed and delivered") return true; else return false; }</EvaluationScript>
      </NextStep>
      <NextStep ref="S3895B117FD378140B7BC6E7EAFFEAE6F" name="Shock was not delivered">
	<EvaluationScript>function check(S87FC60A4B13C7F3B15156E7C106550FAChoice) { if(S87FC60A4B13C7F3B15156E7C106550FAChoice.getValue().getText() == "Shock was not delivered") return true; else return false; }</EvaluationScript>
      </NextStep>

    </ConsultStep>
      <ConsultStep ID="S44DC47FF149E3B95DCB66E7EA43A916D" name="Check Shock Effective">

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
			target="_blank" href="PPM:TAB3">Access to
			EHR</a> <br />
		      Implanted Device:
		      <data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
		      <data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
		      <br />
		      Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a target="_blank" href="PPM:TAB1">Access
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
		    <a target="_blank" href="PPM:TAB1">Access to Report
		      Exported</a> </td>
		</tr>
		<tr name="EGMBlock">
		  <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		    <p align="center"><b>Brief Information about the EGM and detected
			problems </b> </p>

		    <table  cellspacing="10" width="100%">
		      <tbody>
			<tr>

			  <p align="center"> EGM: <a target="_blank" href="PPM:TAB1">Access to
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
      <NextStep ref="SCCCB5EA8B07CAC2607AF6E3FB7A74B86" name="Shock is effective">
	<EvaluationScript>function check(S44DC47FF149E3B95DCB66E7EA43A916DChoice) { if(S44DC47FF149E3B95DCB66E7EA43A916DChoice.getValue().getText() == "Shock is effective") return true; else return false; }</EvaluationScript>
      </NextStep>
      <NextStep ref="SF1752270F59BF4C5D44F6E4856FECAC9" name="Shock was not effective">
	<EvaluationScript>function check(S44DC47FF149E3B95DCB66E7EA43A916DChoice) {  if(S44DC47FF149E3B95DCB66E7EA43A916DChoice.getValue().getText() == "Shock was not effective") return true; else return false; }</EvaluationScript>
      </NextStep>
    </ConsultStep>
      <RecommendationStep ID="S3895B117FD378140B7BC6E7EAFFEAE6F" name="Perform self monitoring">
      <Receiver ref="P4"/>
      <Urgency>3</Urgency>
      <Display>
	<HTML>
	  <p>Perform self monitoring and send the ICD Report.</p>

	</HTML>
      </Display>
      <NextStep ref="S7F2B8D751F5AADD8DD6B6E815E688931"/>
    </RecommendationStep>
      <WaitStep ID="S7F2B8D751F5AADD8DD6B6E815E688931" name="The CIED report has been received...">
      <Event>
	<DataSource code="C0581396" name="Cardiac implant device" schemeID="UMLS"/>
      </Event>
      <NextStep ref="S4CC895B601B5F122F1726E824820A86E" name="Present the EGM, check VT"/>
    </WaitStep> 
      <ConsultStep ID="S4CC895B601B5F122F1726E824820A86E" name="Present the EGM, check VT">

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
			target="_blank" href="PPM:TAB3">Access to
			EHR</a> <br />
		      Implanted Device:
		      <data src="caremanagementdb://720897:MDC_IDC_PG_TYPE"/>
		      <data src="caremanagementdb://720898:MDC_IDC_PG_MODEL"/>
		      <br />
		      Last Follow-up Date: <data src="caremanagementdb://721028:MDC_IDC_SESS_DTM_PREVIOUS"/><a target="_blank" href="PPM:TAB1">Access
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
		    <a target="_blank" href="PPM:TAB1">Access to Report
		      Exported</a> </td>
		</tr>
		<tr name="EGMBlock">
		  <td style="background-color:#eeeeee"><!--The following HTML will be populated in the execution step-->

		    <p align="center"><b>Brief Information about the EGM and detected
			problems </b> </p>

		    <table  cellspacing="10" width="100%">
		      <tbody>
			<tr>

			  <p align="center"> EGM: <a target="_blank" href="PPM:TAB1">Access to
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
      <NextStep ref="SF1752270F59BF4C5D44F6E4856FECAC9" name="There is VT persistent!">
	<EvaluationScript>function check(S4CC895B601B5F122F1726E824820A86EChoice) { if(S4CC895B601B5F122F1726E824820A86EChoice.getValue().getText() == "The case is VT!") return true; else return false; }</EvaluationScript>
      </NextStep>
      <NextStep ref="SCCCB5EA8B07CAC2607AF6E3FB7A74B86" name="The case is no VT!">
	<EvaluationScript>function check(S4CC895B601B5F122F1726E824820A86EChoice) { if(S4CC895B601B5F122F1726E824820A86EChoice.getValue().getText() == "There is no VT!") return true; else return false; }</EvaluationScript>
      </NextStep>	
    </ConsultStep>
  </Algorithm>
</Body>
</MedicalCareplan>

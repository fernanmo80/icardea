<?php
session_start();

if ($_GET['mode'] == 'get_epsos_data')
{
	require_once('../nusoap/nusoap.php');
	
	
	// Create the client instance
	$client = new soapclient('http://www.webservicex.net/CurrencyConvertor.asmx?WSDL', true);
	// Check for an error
	$err = $client->getError();
	if ($err) {
	    // Display the error
	    echo '<h2>Constructor error</h2><pre>' . $err . '</pre>';
	    // At this point, you know the call that follows will fail
	}
	// Create the proxy
	$proxy = $client->getProxy();
	// Call the SOAP method
	$params =  array('FromCurrency' => 'EUR', 'ToCurrency' => 'USD');
	$result = $proxy->ConversionRate($params);
	echo $result['ConversionRateResult'];
	exit;
}
?>
<html>
<head>
<title>Patient Manager</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<style type="text/css" media="screen">@import "../css/tabs.css";</style>
	
<SCRIPT LANGUAGE="JavaScript" SRC="jscript/lib.js"></SCRIPT>
<script src="jscript/epoch_classes.js"></script>

<SCRIPT LANGUAGE="JavaScript">
function CheckFields(){
	var msg="";
	if(trim(document.getElementById('protocol_id').value).length==0)
		msg=msg+" -PROTOCOL ID field is empty\n";
	if(trim(document.getElementById('his_id1').value).length==0)
		msg=msg+" -HIS ID field is empty\n";
	if(trim(document.getElementById('implant_id').value).length==0)
		msg=msg+" -IMPLANT ID field is empty\n";
	/*if(trim(document.getElementById('his_namespace').value).length==0)
		msg=msg+" -HIS NAMESPACE field is empty\n";
	if(trim(document.getElementById('his_universal').value).length==0)
		msg=msg+" -HIS UNIVERSAL ID field is empty\n";
	if(trim(document.getElementById('his_universaltype').value).length==0)
		msg=msg+" -HIS UNIVERSAL ID TYPE field is empty\n";*/
	/*if(document.getElementById('auth').selectedIndex==0)
		msg=msg+" -Authority is not selected\n";*/
	if(trim(document.getElementById('firstname').value).length==0)
		msg=msg+" -FIRSTNAME field is empty\n";
	if(trim(document.getElementById('lastname').value).length==0)
		msg=msg+" -LASTNAME field is empty\n";
	if(trim(document.getElementById('birthdate').value).length==0)
		msg=msg+" -BIRTHDATE field is empty\n";
	if(document.getElementById('sex').selectedIndex==0)
		msg=msg+" -SEX field is empty\n";
		
	//if (el('country_code').disabled)
	//{
		el('hdnCountryCode').value = el('country_code').value.replace('$','&');
		el('hdnEpsosID').value = el('epsos_id').value;
		//alert(el('hdnEpsosID').value);
	//}
	//return false;
		
		
	if(msg=="")
		return true;
	else{
		alert("The following errors occured:\n"+msg);
		return false;
	}
	
	
}

function GetEpsosData(epsos_id)
{
	//call epsos ws and get data
	//alert(epsos_id);
	
	AjaxRequest('feed.php?mode=get_epsos_data&epsos_id=' + epsos_id, GetEpsosData_cb, 'GET');
	
	return false;
}

function GetEpsosData_cb(req)
{
	alert(req.responseText);
}
</SCRIPT>
</head>
<body>
<?php
	include '../library/usercheckLogin.php';	
	include '../lang/'.$lang.'.php'
?>
<div class="Base">
	<div id="header_cv">
	<?php
		include '../library/usermenu.php';
	 ?>
	 </div>
	 <div id="maincontent">
		 <div id="central">
			<table width="100%" style="border-style: solid;border-width: 1px;" cellspacing="0" cellpadding="15">
				<tr> 
					<td class="title" height="60" align="center"><?php if ($_POST['adt_type']=='A08'){echo $_UPDATE_PATIENT;}else{echo $_REGISTER_NEW_PATIENT;} ?></td>
				</tr>
			</table>
		<?php
			$myFile = "config\config.txt";
			$fh = fopen($myFile, 'r');
			$theData = fread($fh, filesize($myFile));
			fclose($fh);
			$auth=explode("\n", $theData);
		?>
          <form action="feed.php" method="post">
				<!-- ============================== Fieldset 1 ============================== -->
					<fieldset>
						<legend>IDs</legend>
						<table class="main22">
							<tr>
								<td><?php echo $_PROTOCOL_ID;?>:</td>
								<td><input <?php if ($_POST['adt_type']=='A08'){?> readonly <?php } ?> name="protocol_id" type="text" size="20" id="protocol_id" class="text" value="<?php echo trim($_POST['protocol_id']); ?>"/></td>
							</tr>
							<tr>
								<td><?php echo $_HIS_ID;?>:</td>
								<td><input <?php if ($_POST['adt_type']=='A08'){?> readonly <?php } ?> name="his_id1" type="text" size="20" id="his_id1" class="text" value="<?php echo trim($_POST['his_id1']); ?>"/></td>
							</tr>
							<tr>
								<td><?php echo $_IMPLANT_ID;?>:</td>
								<td><input <?php if ($_POST['adt_type']=='A08'){?> readonly <?php } ?> name="implant_id" type="text" size="20" id="implant_id" class="text" value="<?php echo trim($_POST['implant_id']);?>"/><br /></td>
							</tr>
							
							<?php if ($has_epsos_id == 1){?>
								
							<tr>
								<td><?php echo $_EPSOS_ID;?>:</td>
								<td>
								<?php echo $country_select; ?>
								
								<script type="text/javascript">
								
								try
								{
									var country_namespace = '<?php echo trim($_POST['country_code']);?>';	
									if (country_namespace != '')
									{
										el('country_code').value = country_namespace.replace('&','$');	
									}
									else
									{
										country_namespace = '<?php echo trim($_POST['hdnCountryCode']);?>';	
										el('country_code').value = country_namespace.replace('&','$');	
									}
									
									
									
									
								}
								catch(e){}
								
								<?php if ($_POST['adt_type']=='A08'){?> 
								el('country_code').disabled = true;
								<?php } ?>
								</script>
								<input type="hidden" id="hdnCountryCode" name="hdnCountryCode"/>
								<input type="hidden" id="hdnEpsosID" name="hdnEpsosID"/>
								<input <?php if ($_POST['adt_type']=='A08'){?> readonly <?php } ?> name="epsos_id" type="text" size="20" id="epsos_id" class="text" value="<?php echo trim($_POST['epsos_id']);?>"/>
								
								<input type="button" style="display:none" id="btnGetEpsosData" name="btnGetEpsosData" 
									value="<?php echo $_GET_EPSOS_DATA;?>"
									onclick="return GetEpsosData(el('epsos_id').value);"/>
								
								<br /></td>
							</tr>
							<?php } ?>
						</table>
							<?php 
								for($i=1;$i<count($auth);$i++){
									if(strlen(trim($auth[$i]))>0){
										$curr_auth=explode("&", $auth[$i]);?>
										<!--<option value="<?php echo trim($auth[$i]);?>"><?php echo $curr_auth[0];?></option>-->
							<?php }} ?>
					</fieldset>

				<!-- ============================== Fieldset 1 end ============================== -->
				<!-- ============================== Fieldset 2 ============================== -->
					<fieldset>
						<legend><?php echo $_DEMOGRAPHIC_DATA;?>:</legend>
							<table class="main22">
								<tr>
									<td><?php echo $_FIRSTNAME;?>:</td>
									<td><input name="firstname" type="text" size="20" id="firstname" class="text" value="<?php echo trim($_POST['firstname']); ?>" /></td>
								</tr>
								<tr>
									<td><?php echo $_LASTNAME;?>:</td>
									<td><input name="lastname" type="text" size="20" id="lastname" class="text" value="<?php echo trim($_POST['lastname']); ?>"/></td>
								</tr>
								<tr>
									<td><?php echo $_BIRTHDATE;?>:</td>
									<td><input name="birthdate" type="text" size="20" id="birthdate" onclick="javascript:newCalendar(this,'<?php echo trim($_POST['birthdate']); ?>');" class="text" value="<?php echo trim($_POST['birthdate']); ?>"/></td>
								</tr>
								<tr>
									<td><?php echo $_SEX;?>:</td>
									<td><select id="sex" name="sex" class="select">
										<option value="1" <?php if($_POST['sex']!='M' && $_POST['sex']!='F'){ echo "selected='selected'";} ?>>--- <?php echo $_CHOOSE_ONE; ?>---</option>
										<option value="M" <?php if($_POST['sex']=='M'){ echo "selected='selected'";} ?>><?php echo $_MALE;?></option>
										<option value="F" <?php if($_POST['sex']=='F'){ echo "selected='selected'";} ?>><?php echo $_FEMALE;?></option>
										</select>
									</td>
								</tr>
								<tr>
									<td><?php echo $_ADDRESS;?>:</td>
									<td><input name="address" type="text" size="20" id="address" class="text" value="<?php echo trim($_POST['address']); ?>"/></td>
								</tr>
								<tr>
									<td><?php echo $_CITY;?>:</td>
									<td><input name="city" type="text" size="20" id="city" class="text" value="<?php echo trim($_POST['city']); ?>"/></td>
								</tr>
								<tr>
									<td><?php echo $_STATE;?>:</td>
									<td><input name="state" type="text" size="20" id="state" class="text" value="<?php echo trim($_POST['state']); ?>"/></td>
								</tr>
								<tr>
									<td><?php echo $_POSTAL;?>:</td>
									<td><input name="postal" type="text" size="20" id="postal" class="text" value="<?php echo trim($_POST['postal']); ?>"/></td>
								</tr>
							</table>
					</fieldset>
				<!-- ============================== Fieldset 2 end ============================== -->
				<?php
					$adt_type="";
					if(isset($_POST['adt_type']))
						$adt_type=$_POST['adt_type'];
					else	
						$adt_type="A01";
					?>
					<table class="main22">
						<tr>
							<td align=center>
								<input class="submit" type="submit" alt="SUBMIT" name="Submit" value="<?php if ($_POST['adt_type']=='A08'){echo $_UPDATE_SUBMIT;}else{echo $_SUBMIT2;} ?>" onClick="return CheckFields();" />
								<INPUT type="hidden" id="adt_type" name="adt_type" value="<?php echo $adt_type;?>"/>
							</td>
						</tr>
					</table>
				</form>
		<?php if(!isset($_POST['update']) && isset($_POST['protocol_id']) && isset($_POST['implant_id']) &&  isset($_POST['firstname']) && isset($_POST['lastname']) && isset($_POST['sex']) && isset($_POST['his_id1']) ){
					/////////////////////////////////////////////////////////////////////////////////////////////
					// Date		: 03 November 2008
					// Author	: abejali
					// Email		: abejali@yahoo.com
					// Title		: Communicating Java Socket Server With PHP
					//			  This Function is to send parameter and get the result from java socket server
					/////////////////////////////////////////////////////////////////////////////////////////////
					require_once "HL7\parser.php";
					require_once "sockets.php";

					// Test This Function
					
					$curr_auth=explode("&", $_POST['auth']);
					$msh='MSH|^~\&|PIXInterface|EHR|PIX|EHR|'.date("Ymdhis").'||ADT^'.$adt_type.'^ADT_A01|0851077658473390286|P|2.3.1'.chr(13);
					$evn='EVN||'.date("Ymdhis").chr(13);
					$pid='PID|||'.trim($_POST['protocol_id']).'^^^icardea.pix&1.2.826.0.1.3680043.2.44.248240.1&ISO~';
					$pid .= trim($_POST['his_id1']) .'^^^ORBIS&www.salk.at&DNS~';
					$pid .= trim($_POST['implant_id']) . '^^^CIED&bbe3a050-079a-11e0-81e0-0800200c9a66&UUID~';
					
					//START - EPSOS_ID - parg
					if (trim($_POST['epsos_id']) != '')					{
						//$pid .= trim($_POST['epsos_id']) . '^^^EPSOS&'.$_POST['country_code'].'&7b7c3f60-36e0-11e1-b86c-0800200c9a66&UUID~';	
						$countryArr = explode('$',$_POST['country_code']);						
						//$pid .= trim($_POST['epsos_id']) . '^^^EPSOS&'.$countryArr[0].'&'.$countryArr[1].'&UUID~';	
						//$pid .= trim($_POST['epsos_id']) . '^^^'.$countryArr[0].'&'.$countryArr[1].'&UUID^EPSOS~';	
						$pid .= trim($_POST['epsos_id']) . '^^^'.trim($_POST['hdnCountryCode']).'&UUID^EPSOS~';	
					}
					
					//END - EPSOS_ID - parg
					
					$pid .= '||'.trim($_POST['lastname']).'^'.trim($_POST['firstname']).'||'.trim($_POST['birthdate']).'|'.trim($_POST['sex']).'|||'.trim($_POST['address']).'^^'.trim($_POST['city']).'^'.trim($_POST['state']).'^'.trim($_POST['postal']).'||||||||'.chr(13);
					
					
					
					
					
					
					$pv1='PV1||O'.chr(13);
					$hl7=$msh.$evn.$pid.$pv1;
					//echo $hl7;
					//exit;
					//echo '<br>';
					$res=GetTCPResponse1($hl7);

					
					//$msg  =& new Net_HL7_Message($res);
					$err_seg=GetSegmentByName($res,'ERR');
					$msa_seg=GetSegmentByName($res,'MSA');
					$msa_res=GetFieldByIndex($msa_seg,1);
					//echo "<br>msa:".$msa_seg."<br>";
					//echo "<br>msa res:".$msa_res."<br>";
					if($err_seg=='' && $msa_res=='AA')
					{
						?><script>alert('<?php echo $_SUCCESSFUL_UPDATE;?>');</script><?php
					}
					else
					{
						?><script>alert('<?php echo $_UPDATE_FAILED;?>');</script><?php
					}
					/*echo 'SEG:'.$seg.'<br>';
					echo 'FIELD:'.GetFieldByIndex($seg,1).'<br>';


					echo 'RES:'.$res.'<br>'*/
					?>
		<?php }?>
      <!--td width="191" bgcolor="#E5E5E5" valign="top"><img src="images/top02.gif" width="191" height="87"><br>
      <table width="150" border="0" cellspacing="0" cellpadding="0" align="center">
        <tr> 
          <td valign="top" height="50" class="text"><b>Lorem ipsum dolor sit amet, 
            consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt 
            ut labore et dolore magna aliquyam erat, sed diam voluptua.</b></td>
        </tr>
        <tr> 
          <td valign="bottom" height="40"><font size="1" color="#666666" face="Verdana, Arial, Helvetica, sans-serif"><img src="images/newsletter.gif" width="122" height="21"></font></td>
        </tr>
        <tr> 
          <td valign="top" height="50"> 
            <table width="100%" border="0" cellspacing="0" cellpadding="0">
              <form name="form1" method="post" action="">
                <tr> 
                  <td class="text"><font size="1">Your E-mail Address</font><br>
                    <input type="text" name="textfield" size="18">
                  </td>
                </tr>
                <tr> 
                  <td height="38"> 
                    <input type="image" border="0" name="imageField" src="images/btn_submit.gif" width="58" height="19">
                  </td>
                </tr>
              </form>
            </table>
          </td-->
<!--table width="770" border="0" cellspacing="0" cellpadding="0" align="center">
  <tr> 
    <td><img src="images/bottom_01.gif" width="770" height="6"></td>
  </tr>
  <tr>
    <td bgcolor="#E5E5E5" height="40" align="center"> <font size="1" face="Verdana, Arial, Helvetica, sans-serif" color="#999999">Copyright 
      &copy; 2005 Your Company Name. All rights reserved. Designed by <a href="http://www.templateyes.com" class="designby" target="_blank">TemplateYes</a></font></td>
  </tr>
</table-->
		 </div>
	</div>
</div>
</body>
</html>

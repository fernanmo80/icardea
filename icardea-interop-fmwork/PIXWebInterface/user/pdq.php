<?php
require_once "HL7\parser.php";
require_once "sockets.php";
?>

<html>
<?php
session_start();
?>
<head>
<title>Patient Manager</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<style type="text/css" media="screen">@import "../css/basic.css";</style>
	<style type="text/css" media="screen">@import "../css/tabs.css";</style>
<SCRIPT LANGUAGE="JavaScript" SRC="jscript/lib.js"></script>
<script src="jscript/epoch_classes.js"></script>
<SCRIPT LANGUAGE="JavaScript" >
		
		
function createHl7(tableID,curr_date,msg_ctrl_id,qry_tag){
	try {	
	if(el('auth').selectedIndex!=0)
		el('auth_name').value = el('auth')[el('auth').selectedIndex].innerHTML;
	if(document.getElementById('sex').selectedIndex!=0)
		document.getElementById('sex_name').value = document.getElementById('sex')[document.getElementById('sex').selectedIndex].innerHTML;
	var his_id=trim(document.getElementById('his_id').value);
	var auth=trim(document.getElementById('auth')[document.getElementById('auth').selectedIndex].value);
	var firstname=trim(document.getElementById('firstname').value);
	var lastname=trim(document.getElementById('lastname').value);
	var dob=trim(document.getElementById('birthdate').value);
	var address=trim(document.getElementById('address').value);
	var city=trim(document.getElementById('city').value);
	var state=trim(document.getElementById('state').value);
	var sex=trim(document.getElementById('sex')[document.getElementById('sex').selectedIndex].value);
	var postal=trim(document.getElementById('postal').value);
	/*var namespace_id=trim(document.getElementById('his_namespace').value);
	var universal_id=trim(document.getElementById('his_universal').value);
	var universal_id_type=trim(document.getElementById('his_universaltype').value);*/
	var msh="MSH|^~\\&|PIXInterface|EHR|PIX|EHR|"+curr_date+"||QBP^Q22^QBP_Q21|"+msg_ctrl_id+"|P|2.5";
	var domains="";
	var criteria="";
	var flag=0;
	
	
	if(his_id.length>0){
		if(flag==1)
			criteria=criteria+"~";
		criteria=criteria+"@PID.3.1^"+his_id;
		flag=1;
	}
	if(firstname.length>0){
		if(flag==1)
			criteria=criteria+"~";
		criteria=criteria+"@PID.5.2^"+firstname;
		flag=1;
	}
	if(lastname.length>0){
		if(flag==1)
			criteria=criteria+"~";
		criteria=criteria+"@PID.5.1.1^"+lastname;
		flag=1;
	}
	if(dob.length>0){
		if(flag==1)
			criteria=criteria+"~";
		criteria=criteria+"@PID.7.1^"+dob;
		flag=1;
	}
	if(address.length>0){
		if(flag==1)
			criteria=criteria+"~";
		criteria=criteria+"@PID.11.1.1^"+address;
		flag=1;
	}
	if(city.length>0){
		if(flag==1)
			criteria=criteria+"~";
		criteria=criteria+"@PID.11.3^"+city;
		flag=1;
	}
	if(state.length>0){
		if(flag==1)
			criteria=criteria+"~";
		criteria=criteria+"@PID.11.4^"+state;
		flag=1;
	}
	if(postal.length>0){
		if(flag==1)
			criteria=criteria+"~";
		criteria=criteria+"@PID.11.5^"+postal;
		flag=1;
	}
	if(document.getElementById('sex').selectedIndex!=0){
		if(flag==1)
			criteria=criteria+"~";
		criteria=criteria+"@PID.8^"+sex;
		flag=1;
	}
	var curr_auth=auth.split("&");
	if(document.getElementById('auth').selectedIndex!=0){
		if(flag==1)
			criteria=criteria+"~";
		
		var the_auth = curr_auth[0];
		if (the_auth == 'EPSOS')
		{
			the_auth = 'EPSOS&COUNTRY_CODE';//&COUNTRY_GUID'
		}
		
		//criteria=criteria+"@PID.3.4.1^"+curr_auth[0];
		
		criteria = criteria + "@PID.3.4.1^" + the_auth;
		
		
		/*criteria=criteria+"~@PID.3.4.2^"+curr_auth[1];
		criteria=criteria+"~@PID.3.4.3^"+curr_auth[2];*/
		flag=1;
	}
	
	
	var table = document.getElementById(tableID);
    var rowCount = table.rows.length;

	
	flag=0;
	for(var i=0; i<rowCount; i++) {
		var cb;
		cb=document.getElementById('cb'+i.toString());
		if(cb.checked==true)
		{
			domain=cb.value;
			if(flag==1)
				domains=domains+"~";
			else
				domains="|||||"
			domains=domains+"^^^"+domain;
			flag=1;
		}
	}
	
	var qpd = "\rQPD|Q22^Find Candidates^HL7|"+qry_tag+"|"+criteria + domains+"\r";
	var msg = msh + qpd + "RCP|I\r";
	
	if (msg.indexOf('EPSOS')>=0)
	{
		var country_code = el('country_code').value.split('$')[0];
		var country_guid = el('country_code').value.split('$')[1];
		msg = msg.replace('COUNTRY_CODE', country_code);
		msg = msg.replace('COUNTRY_GUID', country_guid);
		msg = msg.replace('EPSOS&', '');
	}
	el('msg').value = msg;
	//alert(msg);
	//return false;
	document.forms[0].submit();
	return true;
	}catch(e) {
        alert(e);
		return false;
    }
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
			<table width="100%" style="border-style: solid;border-width: 1px;" cellspacing="0" cellpadding="15" align="center">
				<tr> 
					<td class="title" height="60" align="center"><?php echo $_DEMOGRAPHIC_QUERY;?></td>
				</tr>
			</table>
		<form action="pdqresults.php" method="post" id="myform" name="myform">

				<?php
					$myFile = "config\config.txt";
					$fh = fopen($myFile, 'r');
					$theData = fread($fh, filesize($myFile));
					fclose($fh);
					$auth=explode("\n", $theData);
					$auth_name="";
				?>
				
					<fieldset>
						<legend>ID</legend>
							<table class="main22">
								<tr>
								<td><?php echo $_PATIENT_ID;?>:</td>
								<td><input name="his_id" type="text" size="20" id="his_id" class="text" value="<?php echo $_POST['his_id'];?>" /></td>
							</tr>
							<tr>
								<td><?php echo $_AUTHORITY;?>:</td>
								<td>
										<select id="auth" name="auth" class="select" 
			onchange="el('country_code').style.display='';if (this.value.indexOf('EPSOS')<0){el('country_code').style.display='none'}">
										<option value="1" <?php if(!isset($_POST['auth'])){?>selected="selected" <?php } ?>>--- <?php echo $_CHOOSE_ONE; ?> ---</option>
											<?php 
												for($i=0;$i<count($auth);$i++){
													if(strlen(trim($auth[$i]))>0){
														$curr_auth=explode("&", $auth[$i]);?>	
														<option value="<?php echo trim($auth[$i]);?>" <?php if(isset($_POST['auth']) && $_POST['auth']==trim($auth[$i])){ $auth_name=$curr_auth[0];?>selected="selected" <?php } ?>><?php echo $curr_auth[0];?></option>
											<?php }} ?>
									</select>
									<?php echo $country_select;?>
									<script>el('country_code').style.display='none';</script>
									<input name="auth_name" type="hidden" size="20" id="auth_name" class="text" value="" />
								</td>
							</tr>
							</table>
					</fieldset>
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
									<td><input name="birthdate" type="text" readonly id="birthdate" class="text" onclick="javascript:newCalendar(this,'<?php echo trim($_POST['birthdate']); ?>');" value="<?php echo trim($_POST['birthdate']); ?>"/>
									</td>
								</tr>
								<tr>
									<td><?php echo $_SEX;?>:</td>
									<td><select id="sex" name="sex" class="select">
										<option value="1" <?php if($_POST['sex']!='M' && $_POST['sex']!='F'){ echo "selected='selected'";} ?>>--- <?php echo $_CHOOSE_ONE; ?>---</option>
										<option value="M" <?php if($_POST['sex']=='M'){ echo "selected='selected'";} ?>><?php echo $_MALE;?></option>
										<option value="F" <?php if($_POST['sex']=='F'){ echo "selected='selected'";} ?>><?php echo $_FEMALE;?></option>
										</select>
										<input name="sex_name" type="hidden" size="20" id="sex_name" class="text" value="" />
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
					<fieldset style="display:none;">
						<legend><?php echo $_SEARCH_DOMAINS;?>:</legend>
							<?php
											if(isset($_POST['msg'])){
												$qpd_seg=GetSegmentByName($_POST['msg'],'QPD');
												$domains=GetFieldByIndex($qpd_seg,4);
												if(strlen(trim($domains))>0){
													$domains=explode("~", $domains);
													for($i=0;$i<count($domains);$i++){
														$curr_domain=explode("^",$domains[$i]);
														$domain_info=explode("&",$curr_domain[3]);
														?>
														<?php echo ($i+1);?>
															<?php if(count($domain_info)==2){?>
																<?php }else{?>
															<?php }?>
															
														<?php
													}
												}
											}
											?>
										<table class="main22" id="dataTable">
										<?php 
													for($i=0;$i<count($auth);$i++){
														if(strlen(trim($auth[$i]))>0){
															$curr_auth=explode("&", $auth[$i]);?>
															<tr>
																<td>
																<input type="checkbox" id="cb<?php echo $i;?>" name="cb<?php echo $i;?>" value="<?php echo trim($auth[$i]);?>" <?php if($_POST['cb'.$i]==trim($auth[$i])) echo "checked='true'";?>/>
																<?php echo $curr_auth[0];?>
																</td>
															</tr>
												<?php }} ?>
										</table>
								</fieldset>
								<table class="main22">
									<tr>
										<td align=center>
											<INPUT type="hidden" id="msg" name="msg" />
											<input type="button" alt="SUBMIT" name="Submit" value="<?php echo $_SUBMIT3;?>" class="submit" onClick="return createHl7('dataTable','<?php echo date("Ymdhis");?>','msg123','qry123');" />
										</td>
									</tr>
								<table>
			</form>	
		 </div>
	 </div>
</div>
</body>
</html>

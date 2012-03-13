<?php
session_start();
?>
<?php
require_once "HL7\parser.php";
require_once "sockets.php";
?>

<html>
<head>
<title>Patient Manager</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<style type="text/css" media="screen">@import "../css/basic.css";</style>
	<style type="text/css" media="screen">@import "../css/tabs.css";</style>
<SCRIPT LANGUAGE="JavaScript" SRC="jscript/lib.js">
</SCRIPT>
<SCRIPT LANGUAGE="JavaScript" >
		function CheckFields(){
			var msg="";
			if(trim(document.getElementById('his_id').value).length==0)
				msg=msg+" -ID field is empty\n";
			if(document.getElementById('auth').selectedIndex==0)
				msg=msg+" -Authority is not selected\n";
			
			if(msg=="")
				return msg;
			else{
				return "The following errors occured:\n"+msg;
			}
		}
		function createHl7(tableID,curr_date,msg_ctrl_id,qry_tag){
			try {
			var msg=CheckFields();
			if(msg.length>0){
				alert(msg);
				return false;
			}
			var his_id=document.getElementById('his_id').value;
			var auth = trim(document.getElementById('auth')[document.getElementById('auth').selectedIndex].value);
			
			var msg="MSH|^~\\&|PIXInterface|EHR|PIX|EHR|"+curr_date+"||QBP^Q23^QBP_Q21|"+msg_ctrl_id+"|P|2.5\rQPD|IHE PIX Query|"+qry_tag;
			msg=msg+"|"+his_id+"^^^"+auth+"|";
			var table = document.getElementById(tableID);
            var rowCount = table.rows.length;
			
			var flag=0
			for(var i=0; i<rowCount; i++) {
				var cb;
				cb=document.getElementById('cb'+i.toString());
				if(cb.checked==true)
				{
					domain=cb.value;
					if(flag==1)
						msg=msg+"~";
					msg=msg+"^^^"+domain;
					flag=1;
				}
			}
			
			msg=msg+"\rRCP|I\r";
			
			if (msg.indexOf('EPSOS')>=0)
			{
				var country_code = el('country_code').value.split('$')[0];
				var country_guid = el('country_code').value.split('$')[1];
				msg = msg.replace('COUNTRY_CODE', country_code);
				msg = msg.replace('COUNTRY_GUID', country_guid);
				msg = msg.replace('EPSOS&','');
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
			<table width="100%" style="border-style: solid;border-width: 1px;" cellspacing="0" cellpadding="15">
				<tr> 
				  <td class="title" height="60" align="center"><?php echo $_ID_MAPPING;?></td>
				</tr>
			</table>	
				<form action="pixqueryresults.php" method="POST">
							<?php
								$myFile = "config\config.txt";
								$fh = fopen($myFile, 'r');
								$theData = fread($fh, filesize($myFile));
								fclose($fh);
								$auth=explode("\n", $theData);
							?>
							
								<!-- ============================== Fieldset 1 ============================== -->
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
														<option value="<?php echo trim($auth[$i]);?>" <?php if(isset($_POST['auth']) && $_POST['auth']==trim($auth[$i])){?>selected="selected" <?php } ?>><?php echo $curr_auth[0];?></option>
											<?php }} ?>
									</select>
									<?php echo $country_select;?>
									<script>el('country_code').style.display='none';</script>
								</td>
							</tr>
						</table>
					</fieldset>
								<!-- ============================== Fieldset 1 end ============================== -->
								<!-- ============================== Fieldset 2 ============================== -->
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

								<!-- ============================== Fieldset 2 end ============================== -->
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

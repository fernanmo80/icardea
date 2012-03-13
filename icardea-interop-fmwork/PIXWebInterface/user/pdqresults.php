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
<SCRIPT LANGUAGE="JavaScript" SRC="jscript/lib.js">
</SCRIPT>
<script LANGUAGE="JavaScript" >
	function SetUpdateData(protocol_id,his_id,implant_id,epsos_id,country_code,lastname,firstname,birthdate,sex,address,city,state,postal){
			el('protocol_id').value=protocol_id;
			el('his_id1').value=his_id;
			el('implant_id').value=implant_id;
			el('epsos_id').value=epsos_id;
			el('country_code').value=country_code;
			el('lastname').value=lastname;
			el('firstname').value=firstname;
			el('birthdate').value=birthdate;
			el('sex').value=sex;
			el('address').value=address;
			el('city').value=city;
			el('state').value=state;
			el('postal').value=postal;
			document.forms['tform'].submit();
			return true;
		}
</script>
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
					<td class="title" height="60" align="center"><?php echo $_DEMOGRAPHIC_QUERY_RESULTS;?></td>
				</tr>
			</table>
		<form name="tform" id="tform" action="feed.php" method="post">
			<fieldset>
				<legend><?php echo $_CRITERIA;?></legend><br><BR>
				<table class="main22_0">
					<tr>
						<?php 
						if ($_POST['his_id']!='')
						{
						?>
						<td class="main22_1"><?php echo $_PATIENT_ID;?>:</td>
						<?php
						}
						if ($_POST['auth_name']!='')
						{
						?>
						<td class="main22_1"><?php echo $_AUTHORITY;?>:</td>
						<?php
						} 
						if ($_POST['lastname']!='')
						{
						?>
						<td class="main22_1"><?php echo $_LASTNAME;?>:</td>
						<?php
						} 
						if ($_POST['firstname']!='') 
						{
						?>
						<td class="main22_1"><?php echo $_FIRSTNAME;?>:</td>
						<?php
						} 
						if ($_POST['birthdate']!='')
						{
						?>
						<td class="main22_1"><?php echo $_BIRTHDATE;?>:</td>
						<?php
						} 
						if ($_POST['sex_name']!='')
						{
						?>
						<td class="main22_1"><?php echo $_SEX;?>:</td>
						<?php
						}
						if ($_POST['address']!='')
						{
						?>
						<td class="main22_1"><?php echo $_ADDRESS;?>:</td>
						<?php
						} 
						if ($_POST['city']!='') 
						{
						?>
						<td class="main22_1"><?php echo $_CITY;?>:</td>
						<?php
						} 
						if ($_POST['state']!='')
						{
						?>
						<td class="main22_1"><?php echo $_STATE;?>:</td>
						<?php
						}
						if ($_POST['postal']!='')
						{
						?>
						<td class="main22_1"><?php echo $_POSTAL;?>:</td>
						<?php
						}
						?>
					</tr>
					<tr>
						<?php
						if ($_POST['his_id']!='')
						{
						?>
						<td class="main22_2"><label type="text" size="20" class="text"><?php echo $_POST['his_id'];?></label></td>
						<?php
						}
						if ($_POST['auth_name']!='')
						{
						?>
						<td class="main22_2"><label type="text" size="20" class="text">
						<?php 
						echo $_POST['auth_name'];
						if ($_POST['auth_name'] == 'EPSOS')
						{
							$epsos_mapping = explode('$', $_POST['country_code']);
							echo ' - ' . $country_names[$epsos_mapping[0]];
						}
						?></label></td>
						<?php
						}
						if ($_POST['lastname']!='')
						{
						?>
						<td class="main22_2"><label type="text" size="20" class="text"><?php echo $_POST['lastname'];?></label></td>
						<?php
						} 
						if ($_POST['firstname']!='')
						{
						?>
						<td class="main22_2"><label type="text" size="20" class="text"><?php echo $_POST['firstname'];?></label></td>
						<?php
						}
						if ($_POST['birthdate']!='')
						{
						?>
						<td class="main22_2"><label type="text" size="20" class="text"><?php echo $_POST['birthdate'];?></label></td>
						<?php
						}
						if ($_POST['sex_name']!='')
						{
						?>
						<td class="main22_2"><label type="text" size="20" class="text"><?php echo $_POST['sex_name'];?></label></td>
						<?php
						}
						if ($_POST['address']!='')
						{
						?>
						<td class="main22_2"><label type="text" size="20" class="text"><?php echo $_POST['address'];?></label></td>
						<?php
						}
						if ($_POST['city']!='')
						{
						?>
						<td class="main22_2"><label type="text" size="20" class="text"><?php echo $_POST['city'];?></label></td>
						<?php
						}
						if ($_POST['state']!='')
						{
						?>
						<td class="main22_2"><label type="text" size="20" class="text"><?php echo $_POST['state'];?></label></td>
						<?php
						}
						if ($_POST['postal']!='') 
						{
						?>
						<td class="main22_2"><label type="text" size="20" class="text"><?php echo $_POST['postal'];?></label></td>
						<?php
						}
						?>
					</tr>
					
							
				</table>
			</fieldset>
			<fieldset>
				<legend><?php echo $_RESULTS;?></legend><br><BR>
				<INPUT type="hidden" id="update" name="update"/>
					<?php
					if(isset($_POST['msg'])){
						$res=GetTCPResponse1($_POST['msg']);
						$err_seg=GetSegmentByName($res,'ERR');
						$msa_seg=GetSegmentByName($res,'MSA');
						$qak_seg=GetSegmentByName($res,'QAK');
						$msa_res=GetFieldByIndex($msa_seg,1);
						$qak_res=GetFieldByIndex($qak_seg,2);
						$pid_seg=GetSegmentByName($res,'PID');
						if($err_seg=='' && $msa_res=='AA' && $qak_res=='OK'){
							?>
							<table class="imagetable">
								<tr align=center>
									<th> # </th>
									<th> <?php echo $_PROTOCOL_ID;?></th>
									<th> <?php echo $_PROTOCOL_NAMESPACE_ID;?></th>
									<th> <?php echo $_HIS_ID;?></th>
									<th> <?php echo $_HIS_NAMESPACE_ID;?> </th>
									<th> <?php echo $_IMPLANT_ID;?></th>
									<th> <?php echo $_IMPLANT_NAMESPACE_ID;?> </th>
									<?php if ($has_epsos_id == 1){?>
									<th> <?php echo $_EPSOS_ID;?></th>
									<th> <?php echo $_EPSOS_NAMESPACE_ID;?> </th>
									<?php } ?>
									<th><?php echo $_FIRSTNAME;?></th>
									<th><?php echo $_LASTNAME;?></th>
									<th><?php echo $_BIRTHDATE;?></th>
									<th><?php echo $_SEX;?></th>
									<th><?php echo $_ADDRESS;?></th>
									<th><?php echo $_CITY;?></th>
									<th><?php echo $_STATE;?></th>
									<th><?php echo $_POSTAL;?></th>
									<th>&nbsp;</th>
								</TR>
							<?php

							$pid_seg=GetMultipleSegmentsByName($res,'PID');
							
							$page_res=10;
							$protocol_id=$his_id=$implant_id= $epsos_id= $lastname=$firstname=$dob=$sex=$address=$city=$state=$postal="";
							for($j=0;$j<count($pid_seg);$j++){
								$pid_id=GetFieldByIndex($pid_seg[$j],3);
								$res_id=explode("~", $pid_id);
								
								
								?>
									
										<TR align=center>
											<TD> <?php echo ($j+1);?>  </TD>
								<?php
									$pid_array=explode("^", $res_id[0]);
									$protocol_id=$pid_array[0];
									$auth_array=explode("&", $pid_array[3]);
									$namespace_id=$auth_array[0];
								?>
											
											<TD> <?php echo $protocol_id;?> </TD>
											<TD> <?php echo $namespace_id;?> </TD>
											
									<?php
									$pid_array=explode("^", $res_id[1]);
									$his_id=$pid_array[0];
									$auth_array=explode("&", $pid_array[3]);
									$namespace_id=$auth_array[0];
								?>
											
											<TD> <?php echo $his_id;?> </TD>
											<TD> <?php echo $namespace_id;?> </TD>	
								<?php
									$pid_array=explode("^", $res_id[2]);
									$implant_id=$pid_array[0];
									$auth_array=explode("&", $pid_array[3]);
									$namespace_id=$auth_array[0];
								
								?>
											
											<TD> <?php echo $implant_id;?> </TD>
											<TD> <?php echo $namespace_id;?> </TD>	
											
											
								<!--	EPSOS_ID -->
								
								<?php
								
								if ($has_epsos_id == 1){
								
									$pid_array=explode("^", $res_id[3]);
									$epsos_id=$pid_array[0];
									$auth_array=explode("&", $pid_array[3]);
									$namespace_id=$auth_array[0];
									$country_code=$namespace_id;
									$country_namespace = $auth_array[0] .'&'. $auth_array[1];
								?>
											
											<TD> <?php echo $epsos_id;?> </TD>
											<TD> <?php echo $country_names[$country_code];?> </TD>	
							<?php
								}
								
								
								$pid_name=GetFieldByIndex($pid_seg[$j],5);
								$res_name=explode("^", $pid_name);
								$pid_dob=GetFieldByIndex($pid_seg[$j],7);
								$pid_sex=GetFieldByIndex($pid_seg[$j],8);
								$pid_addr=GetFieldByIndex($pid_seg[$j],11);
								$res_addr=explode("^", $pid_addr);
								$firstname=$res_name[1];
								$lastname=$res_name[0];
								$birthdate=$pid_dob;
								$sex=$pid_sex;
								$address=$res_addr[0];
								$city=$res_addr[2];
								$state=$res_addr[3];
								$postal=$res_addr[4];
							?>
											<TD> <?php echo $res_name[1];?> </TD>
											<TD> <?php echo $res_name[0];?> </TD>
											<TD> <?php echo $pid_dob;?> </TD>
											<TD> <?php echo $pid_sex;?> </TD>
											<TD> <?php echo $res_addr[0];?> </TD>
											<TD> <?php echo $res_addr[2];?> </TD>
											<TD> <?php echo $res_addr[3];?> </TD>
											<TD> <?php echo $res_addr[4];?> </TD>
											<TD> <input type="image" src="images/editbtn.png" name="updateimg" id="updateimg" title="Edit" 
											onClick="SetUpdateData('<?php echo trim($protocol_id); ?>','<?php echo trim($his_id); ?>','<?php echo trim($implant_id); ?>','<?php echo trim($epsos_id); ?>','<?php echo trim($country_namespace); ?>','<?php echo trim($lastname); ?>','<?php echo trim($firstname); ?>','<?php echo trim($birthdate); ?>','<?php echo trim($sex); ?>','<?php echo trim($address); ?>','<?php echo trim($city); ?>','<?php echo trim($state); ?>','<?php echo trim($postal); ?>');"> </TD>
										</TR>
							<?php
							}
							?>
							</TABLE>
							<INPUT type="hidden" id="flag" name="adt_type" value="A08"/>
							<INPUT type="hidden" id="protocol_id" name="protocol_id"/>
							<INPUT type="hidden" id="his_id1" name="his_id1"/>
							<INPUT type="hidden" id="implant_id" name="implant_id"/>
							
							<INPUT type="hidden" id="epsos_id" name="epsos_id"/>
							<INPUT type="hidden" id="country_code" name="country_code"/>
							
							<INPUT type="hidden" id="lastname" name="lastname"/>
							<INPUT type="hidden" id="firstname" name="firstname"/>
							<INPUT type="hidden" id="birthdate" name="birthdate"/>
							<INPUT type="hidden" id="sex" name="sex"/>
							<INPUT type="hidden" id="address" name="address"/>
							<INPUT type="hidden" id="city" name="city"/>
							<INPUT type="hidden" id="state" name="state"/>
							<INPUT type="hidden" id="postal" name="postal"/>
						<?php
						}
						else	
							echo '<br>ERROR OCCURRED';
					}
				?>
					</fieldset>
					
			</form>	
		 </div>
	 </div>
</div>
</body>
</html>

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
				  <td class="title" height="60" align="center"><?php echo $_ID_MAPPING_RESULTS;?></td>
				</tr>
			</table>	
				<fieldset>
					<legend><?php echo $_RESULTS;?></legend><br><BR>
						<?php
								if(isset($_POST['msg'])){
									$res=GetTCPResponse($_POST['msg']);
									$err_seg=GetSegmentByName($res,'ERR');
									$msa_seg=GetSegmentByName($res,'MSA');
									$qak_seg=GetSegmentByName($res,'QAK');
									$msa_res=GetFieldByIndex($msa_seg,1);
									$qak_res=GetFieldByIndex($qak_seg,2);
									$pid_seg=GetSegmentByName($res,'PID');
									if($err_seg=='' && $msa_res=='AA' && $qak_res=='OK'){
										$pid_seg=GetMultipleSegmentsByName($res,'PID');
										?>
											<table  class="imagetable">
												<tr align=center>
													<th> # </th>
													<th> <?php echo $_PROTOCOL_ID;?></th>
													<th> <?php echo $_PROTOCOL_NAMESPACE_ID;?></th>
													<th> <?php echo $_HIS_ID;?></th>
													<th> <?php echo $_HIS_NAMESPACE_ID;?> </th>
													<th> <?php echo $_IMPLANT_ID;?></th>
													<th> <?php echo $_IMPLANT_NAMESPACE_ID;?> </th>
												</TR>
											<?php
										for($i=0;$i<count($pid_seg);$i++){
											$pid_res=GetFieldByIndex($pid_seg[$i],3);
											$results=explode("~", $pid_res);	
											if(count($results)==3)
												$pid_array=explode("^", $results[0]);
												$protocol_id=$pid_array[0];
												$auth_array=explode("&", $pid_array[3]);
												$pnamespace_id=$auth_array[0];
												$puniversal_id=$auth_array[1];
												$puniversal_id_type=$auth_array[2];
												
												$pid_array=explode("^", $results[1]);
												$his_id=$pid_array[0];
												$auth_array=explode("&", $pid_array[3]);
												$hnamespace_id=$auth_array[0];
												$huniversal_id=$auth_array[1];
												$huniversal_id_type=$auth_array[2];
												
												$pid_array=explode("^", $results[2]);
												$implant_id=$pid_array[0];
												$auth_array=explode("&", $pid_array[3]);
												$inamespace_id=$auth_array[0];
												$iuniversal_id=$auth_array[1];
												$iuniversal_id_type=$auth_array[2];
										?>
												
													<tr align=center>
														<td> <?php echo ($i+1);?>  </td>
														<td> <?php echo $protocol_id;?> </td>
														<td> <?php echo $pnamespace_id;?> </td>
														<td> <?php echo $his_id;?> </td>
														<td> <?php echo $hnamespace_id;?> </td>
														<td> <?php echo $implant_id;?> </td>
														<td> <?php echo $inamespace_id;?> </td>
													</tr>
												
										<?php
											}
										?>
										</table>
									<?php
									}
									else if($err_seg=='' && $msa_res=='AA' && $qak_res=='NF')
										echo "<br>NO RESULTS FOUND";
									else	
										echo '<br>ERROR OCCURRED';
								}
							?>
					</fieldset>
					<!-- ============================== Fieldset 1 end ============================== -->
		 </div>
	</div>
</div>
</body>
</html>

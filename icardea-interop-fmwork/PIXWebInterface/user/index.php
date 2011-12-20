<?php
session_start();
?>
<html>
<head>
<title>PIX Manager</title>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<style type="text/css" media="screen">@import "../css/basic.css";</style>
	<style type="text/css" media="screen">@import "../css/tabs.css";</style>
<SCRIPT LANGUAGE="JavaScript" SRC="jscript/lib.js">
</SCRIPT>
<SCRIPT LANGUAGE="JavaScript">
function CheckFields(){
	var msg="";
	if(trim(document.getElementById('his_id').value).length==0)
		msg=msg+" -HIS ID field is empty\n";
	if(trim(document.getElementById('his_namespace').value).length==0)
		msg=msg+" -HIS NAMESPACE field is empty\n";
	if(trim(document.getElementById('his_universal').value).length==0)
		msg=msg+" -HIS UNIVERSAL ID field is empty\n";
	if(trim(document.getElementById('his_universaltype').value).length==0)
		msg=msg+" -HIS UNIVERSAL ID TYPE field is empty\n";
	if(trim(document.getElementById('implant_id').value).length==0)
		msg=msg+" -IMPLANT ID field is empty\n";
	if(trim(document.getElementById('firstname').value).length==0)
		msg=msg+" -FIRSTNAME field is empty\n";
	if(trim(document.getElementById('lastname').value).length==0)
		msg=msg+" -LASTNAME field is empty\n";
	if(trim(document.getElementById('birthdate').value).length==0)
		msg=msg+" -BIRTHDATE field is empty\n";
	if(document.getElementById('sex').selectedIndex==0)
		msg=msg+" -SEX field is empty\n";
	if(msg=="")
		return true;
	else{
		alert("The following errors occured:\n"+msg);
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
		 <table width="100%" style="border-style: solid;border-width: 1px;" cellspacing="0" cellpadding="0" align="center">
			  <tr> 
				<td valign="top" bgcolor="#FFFFFF">
				  <table width="100%" border="0" cellspacing="0" cellpadding="15">
					<tr> 
					  <td class="title" height="60" align="center"><?php echo $_SESSION['fullname'] . ', ' . $_WELCOME_MESSAGE; ?></td>
					</tr>
					<tr > 
					  <td valign="top" class="text" align="center"> 
						<p>
					
						</p>

					  </td>
					</tr>
				  </table>
				</td>
			</tr>
			</table>
		</div>
	</div>
</div>
</body>
</html>

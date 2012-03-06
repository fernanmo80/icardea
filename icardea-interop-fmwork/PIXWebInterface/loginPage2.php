<?php
	session_start();
	session_unset();
	session_destroy();
	
	//include 'library/config.php';
	//include 'library/openDB.php';
	include 'lang/en.php'
	
?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title>Welcome to PIX</title>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<style type="text/css" media="screen">@import "css/loginpage.css";</style>
</head>
<body>
	<table align="center" border="0" style="width:100%;height:550px;" >
	<tr>
		<td valign=top>
		<p align="center"><img src="images/icardea.png"></p>
		</td>
	</tr>
	<tr align="center">
		<td>
		<form method="get" action="try_auth.php">
        <b>Identity</b></br>
        <input type="hidden" name="action" value="verify" />
        <input id="openid_identifier" type="text" name="openid_identifier" value="" style="width:300px"/>
        <input type="submit" value="Verify" />
      </form>
	</tr>
<script>document.getElementById('openid_identifier').focus();</script>
</body>
</html>

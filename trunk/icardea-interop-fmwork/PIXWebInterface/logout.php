<?php
	session_start();
?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Logout Page</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="css/style.css" rel="stylesheet" type="text/css" />
<style type="text/css" media="screen">@import "css/basic.css";</style>
</head>
<body>
<?php
$lang=$_SESSION['lang'];
include 'lang/'.$lang.'.php';
?>
<div id="main_content">
	<table  align="center">
		<tr>
			<td align="center">
<?php
		echo $_LOGOUT_MSG;
		
		session_unset();
		session_destroy();
		
?>
			</td>
		</tr>
	</table>
</div>
</body>
</html>



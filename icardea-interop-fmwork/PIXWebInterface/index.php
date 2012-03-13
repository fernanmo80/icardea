<?php
session_start();
			
$_SESSION['uid']='';
$_SESSION['pid']='';
$_SESSION['level']='';
				
echo("<script>window.location.href = 'startPage.php';</script>");
?>


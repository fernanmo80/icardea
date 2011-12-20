<?php
$user_id=$_SESSION['user_id'];
//$displayname=$_SESSION['displayname'];
$lang=$_SESSION['lang'];
if ($user_id=='')
{
	$URL="../loginPage.php";
	echo("<script>location.href = '$URL';</script>");
}
?>

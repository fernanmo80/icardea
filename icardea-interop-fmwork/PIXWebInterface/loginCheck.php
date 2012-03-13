<?php
session_start();
//include 'library/config.php';
//include 'library/openDB.php';

$username=trim($_REQUEST['username']);
$password=trim($_REQUEST['password']);
$lang=trim($_REQUEST['lang']);

if (($username=="") || ($password==""))
	{
		echo("<script>window.location.href = 'index.php?login=error';</script>");
	}
else
	{	
		$myFile = "user/config/login.txt";
		$fh = fopen($myFile, 'r');
		$Data = fread($fh,  filesize($myFile));
		$login=explode("\n",$Data);
		$num=count($login);
		
		for ($i=1;$i<=$num;$i++)
		{
			$j=$i-1;
			$data1=$login[$j];
			$data2=explode("!@#$%",$data1);
			$username1=$data2[0];
			$password1=$data2[1];
			
			if (trim($password1)==$password and trim($username1)==$username)
			{
				$user_id=trim($username1);
			}
		}
		
		fclose($fh);
		
		if($user_id != '')
		{
			$_SESSION['user_id']=$user_id;
			$_SESSION['lang']=$lang;
			echo("<script>window.location.href = 'user/index.php';</script>");
		}
		else
		{
			echo("<script>window.location.href = 'index.php?login=error';</script>");
		}
		
		/* $q="SELECT * FROM users WHERE username='$username' and password='$password' and enabled=true";
		$sql = pg_query($conn,$q);
		
		
		$result = pg_fetch_array($sql);
		$numrows = pg_num_rows($sql);
		if($numrows != '')
		{
			$user_id=$result['id'];
			$_SESSION['user_id']=$user_id;
			$displayname=$result['displayname'];
			$_SESSION['displayname']=$displayname;
			$_SESSION['lang']=$lang;
			echo("<script>window.location.href = 'user/index.php';</script>");
		}
		else
		{
			echo("<script>window.location.href = 'index.php?login=error';</script>");
		} */
	}
	?>
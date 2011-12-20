<?php
	session_start();

		session_unset();
		session_destroy();
		//echo('Για να συνδεθείται στο σύστημα πατήστε <a href="loginPage2.php">Εδώ</a>');
		echo("<script>window.location.href = 'loginPage2.php';</script>");
?>
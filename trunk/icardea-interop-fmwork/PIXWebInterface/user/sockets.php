<?php	
function GetTCPResponse($Parameter)
{
	$myFile = "config\server.txt";
	$fh = fopen($myFile, 'r');
	$theData = fread($fh, filesize($myFile));
	fclose($fh);
	$arr=explode("\n", $theData);
	/* Change to your Java Server Port */
	$service_port =$arr[1]; //getservbyname(‘www’, ‘tcp’);
	/* Get the IP address for the target host. */
	//$address ='139.91.190.45'; //gethostbyname(‘www.example.com’);
	$address =$arr[0]; //gethostbyname(‘www.example.com’);
	/* Create a TCP/IP socket. */
	//echo "Attempting to connect to ".$address." on port ".$service_port;
	$socket = socket_create(AF_INET,SOCK_STREAM, SOL_TCP);

	if ($socket == false) {
		echo 'socket_create() failed: reason:'.socket_strerror(socket_last_error()).'<BR>';
	}
	//echo “Attempting to connect to ‘$address’ on port ‘$service_port’…”;
	$result = socket_connect($socket, $address, $service_port);
	if ($result == false) {
		
		echo 'socket_connect() failed.\nReason: ($result)'.socket_strerror(socket_last_error($socket)).'<BR>';
	}
	$in = chr(11) . $Parameter . chr(28) . chr(13);
	//$in.= chr(13).chr(10); //End Of Java Transmission 
	$out ='';
	$response ='';
	//echo “Sending Data Transfer …”;
	socket_write($socket, $in, strlen($in));
	//echo “Reading response:\n\n<BR>”;
	try {
		while ($out = @socket_read($socket,2048, PHP_NORMAL_READ)) {
			$response.= $out;
			if (substr($out, -2) == (chr(28) . chr(13)))
			   break;
		}
	} catch (Exception $e) {
		echo $response .= 'Caught exception:'.$e->getMessage().'\n';
	}
	//echo “<BR><BR>Closing socket…”;
	//echo ":".$response.":";
	socket_close($socket);
	return $response;
}


function GetTCPResponse1($data) { 

include 'config/server.php';

$response = '';
$out ='';
$fp = fsockopen($host, $port, $errno, $errstr, 30);
if (!$fp) {
    echo "$errstr ($errno)<br />\n";
} else {
	$in = chr(11) . $data . chr(28) . chr(13);
    fwrite($fp, $in);
	$i = 0;
    
	while (!feof($fp)) {
	    $out = fread($fp, 1024);
		$response .= $out;
		if (substr($out, -2) == (chr(28) . chr(13)))
			   break;
    }
    
}

return $response;


/*
$ctx = stream_context_create();
stream_context_set_option($ctx, 'ssl', 'local_cert', 'C:\EasyPHP5.2.10\www\ICARDEA\PIXPDQ\certificates\cacert.crt');


$fp = stream_socket_client($host . ':' . $port, $err, $errstr, 10, STREAM_CLIENT_CONNECT, $ctx);

$response = '';
if (!$fp) {

    print "Failed to connect $err $errstr\n";
    return;
}
else 
{
	$in = chr(11) . $data . chr(28) . chr(13);
	//echo $in;exit;
	fputs($fp, $in, strlen($in));
    while (!feof($fp)) {
        $response .= fread ($fp,4096);
    }
    fclose ($fp);
	
}
return $response;
*/
/*
$timeout = 10;

//$cert = file_get_contents('../certificates/cacert.pem');
$cert = '../certificates/cacert.pem';
//echo $cert;exit;
$context = stream_context_create(array('ssl'=>array('local_cert'=> $cert,)));

$response = '';

$fp = stream_socket_client('ssl://'.$host.':'.$port, $errno, $errstr, $timeout, STREAM_CLIENT_CONNECT, $context);

//fwrite($fp, $data);

if ($fp) {
    fwrite($fp, $data);
    $response .= fread($fp,8192);
    fclose($fp);
} else {
   $response = "ERROR: $errno - $errstr<br />\n";
}
return $response;
*/

    /*
	$ip=$host;       //Set the TCP PORT to connect too
$command=$data;       //Command to run


//Connect to Server
$socket = stream_socket_client("tcp://{$ip}:{$port}", $errno, $errstr, 30);

if($socket) {
 //Start SSL
 stream_set_blocking ($socket, true);
 
 $session_stream = file_get_contents('C:\EasyPHP5.2.10\www\ICARDEA\PIXPDQ\certificates\cacert.pem');
 stream_socket_enable_crypto ($socket, true, STREAM_CRYPTO_METHOD_SSLv23_CLIENT, $session_stream);
 stream_set_blocking ($socket, false);

 //Send a command
 fwrite($socket, $command);


 $buf = null;
 //Receive response from server. Loop until the response is finished
 while (!feof($socket)) {
  $buf .= fread($socket, 20240);
 }

 //close connection
 fclose($socket);

 //echo our command response
 return $buf;
}
else{
	return 'nothing';
}
*/
} 


?>
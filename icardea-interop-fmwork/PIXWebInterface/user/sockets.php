				<?php	function GetTCPResponse($Parameter){
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
							echo 'Caught exception:'.$e->getMessage().'\n';
						}
						//echo “<BR><BR>Closing socket…”;
						//echo ":".$response.":";
						socket_close($socket);
						return $response;
					}
					
					
					
					?>
<?php
function GetSegmentByName($msg,$name){
	$segs=explode(chr(13), $msg);
	for($i=0;$i<count($segs);$i++){
		//echo 'pos:'.strpos($segs[$i],$name);
		if(strpos($segs[$i],$name)===false)
			;
		else if(strpos($segs[$i],$name)==0)
			return $segs[$i];
	}
	return '';
}


function GetMultipleSegmentsByName($msg,$name){
	$seg=explode(chr(13), $msg);
	$segs=array();
	$j=0;
	for($i=0;$i<count($seg);$i++){
		//echo 'pos:'.strpos($segs[$i],$name);
		if(strpos($seg[$i],$name)===false)
			;
		else if(strpos($seg[$i],$name)==0)
			$segs[$j++]=$seg[$i];
	}
	return $segs;
}



function GetFieldByIndex($seg,$field){
	$fields=explode("|", $seg);
	return $fields[$field];
}
?>
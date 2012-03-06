<?php
$has_epsos_id = 1;

$countries = array();
$countries[] = 'GRE';
$countries[] = 'ESP';
$countries[] = 'AUT';
$countries[] = 'TUR';

$country_codes["GRE"] = '9C1BFE7A-7938-4692-A4A2-9971BE6B26AE';
$country_names["GRE"] = 'Greece';

$country_codes["ESP"] = 'E26A34BE-6F77-420b-872C-9ABF7BC9818D';
$country_names["ESP"] = 'Spain';

$country_codes["AUT"] = '9F64FAB1-DAEB-4c3d-9E5B-196FBDDA017D';
$country_names["AUT"] = 'Austria';

$country_codes["TUR"] = 'E2A67319-824E-49eb-B52F-336E8D52385B';
$country_names["TUR"] = 'Turkey';



$country_select = '<select id="country_code" name="country_code">';

for ($i=0;$i<count($countries);$i++)
{
	$country_select .= '<option value="'.$countries[$i].'$'.$country_codes[$countries[$i]].'">'.$country_names[$countries[$i]].'</option>';
}

/*$country_select .= '<option value="GRE$9C1BFE7A-7938-4692-A4A2-9971BE6B26AE">Greece</option>';
$country_select .= '<option value="ESP$E26A34BE-6F77-420b-872C-9ABF7BC9818D">Spain</option>';
$country_select .= '<option value="AUS$9F64FAB1-DAEB-4c3d-9E5B-196FBDDA017D">Austria</option>';
$country_select .= '<option value="TUR$E2A67319-824E-49eb-B52F-336E8D52385B">Turkey</option>';*/
$country_select .= '</select>';
?>

<script src="jscript/javascript.js"></script>
<script src="jscript/ajax.js"></script>
<table>
	<tr height="165px;">
		<td>&nbsp;</td>
	</tr>
	<tr>
		<td>
			<span class="ui-state-active2 ui-corner-all"><a href="index.php"><?php echo $_HOME;?></a></span>
			&nbsp;&nbsp;<font color="#ffffff">|</font>&nbsp;&nbsp;
			<span class="ui-state-active2 ui-corner-all"><a href="feed.php"><?php echo $_REGISTRATION;?></a></span>
			&nbsp;&nbsp;<font color="#ffffff">|</font>&nbsp;&nbsp;
			<span class="ui-state-active2 ui-corner-all"><a href="pixquery.php"><?php echo $_PIXQUERY;?></a></span>
			&nbsp;&nbsp;<font color="#ffffff">|</font>&nbsp;&nbsp;
			<span class="ui-state-active2 ui-corner-all"><a href="pdq.php"><?php echo $_DEMOGRAPHIC_QUERY;?></a></span>
			&nbsp;&nbsp;<font color="#ffffff">|</font>&nbsp;&nbsp;
			<span class="ui-state-active2 ui-corner-all"><a href="#"><?php echo $_HELP;?></a></span>
			&nbsp;&nbsp;<font color="#ffffff">|</font>&nbsp;&nbsp;
			<span class="ui-state-active2 ui-corner-all"><a href="#"><?php echo $_CONTACT_US;?></a></span>
			&nbsp;&nbsp;<font color="#ffffff">|</font>&nbsp;&nbsp;
			<span class="ui-state-active2 ui-corner-all"><a href="../logout.php"><?php echo $_SESSION['user_id'] . ': ' . $_LOGOUT;?></a></span>
		</td>
	</tr>
</table>
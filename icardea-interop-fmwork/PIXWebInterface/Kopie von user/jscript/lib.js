function trim(str)
{
	try{
    if(!str || typeof str != 'string')
        return '';

    return str.replace(/^[\s]+/,'').replace(/[\s]+$/,'').replace(/[\s]{2,}/,' ');
	}
	catch(e){
		return '';
	}
}
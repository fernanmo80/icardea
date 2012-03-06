function HttpRequest()
{
	 var httpRequest;
	 if (window.XMLHttpRequest) { // Mozilla, Safari, ...
        httpRequest = new XMLHttpRequest();
        if (httpRequest.overrideMimeType) {
            httpRequest.overrideMimeType('text/xml');
            // See note below about this line
        }
    } 
    else if (window.ActiveXObject) { // IE
        try {
            httpRequest = new ActiveXObject("Msxml2.XMLHTTP");
            } 
            catch (e) {
                        try {
                            httpRequest = new ActiveXObject("Microsoft.XMLHTTP");
                            } 
                            catch (e) {}
                        }
                                    }

    if (!httpRequest) {
        alert('Giving up :( Cannot create an XMLHTTP instance');
        return false;
    }
    
    return httpRequest;
}

function HttpRequestSend(httpRequest, url, method, async)
{
	httpRequest.open(method, url, async);
	httpRequest.send(null);
}

var XMLHttpArray = [
        function() {return new XMLHttpRequest()},
        function() {return new ActiveXObject("Msxml2.XMLHTTP")},
        function() {return new ActiveXObject("Msxml2.XMLHTTP")},
        function() {return new ActiveXObject("Microsoft.XMLHTTP")}
];
function createXMLHTTPObject(){
        var xmlhttp = false;
        for(var i=0; i<XMLHttpArray.length; i++){
                try{
                        xmlhttp = XMLHttpArray[i]();
                }catch(e){
                        continue;
                }
                break;
        }
        return xmlhttp;
}////
function AjaxRequest(url,callback,method){
        var req = createXMLHTTPObject();
        req.onreadystatechange= function(){
                if(req.readyState != 4) return;
                if(req.status != 200) return;
                callback(req);
        }
        req.open(method,url,true);
        req.setRequestHeader('User-Agent', 'My XMLHTTP Agent');
        req.send(null);
}////

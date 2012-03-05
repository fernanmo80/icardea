set ICARDEA_HOME="D:\srdc\codes\google-icardea\icardea"
				 set ICARDEA_HOME="D:\svn-repositories\icardea"

set PHRS_HOME=%ICARDEA_HOME%\icardea-phrs
rem set PHRS_HOME=D:\srfg\new-phrs\icardea-phrs

set PHRS_TOMCAT=D:\srfg\tomcat\phrs-tomcat-6
				 set PHRS_TOMCAT="C:\Programme\Apache Software Foundation\tomcat6
set CATALINA_HOME=%PHRS_TOMCAT%

set mypwd=%CD%

call %PHRS_TOMCAT%\startup.bat
echo "TOMCAT STARTED FROM %PHRS_TOMCAT%"

cd %PHRS_HOME%\phrs-soap-pcc09ws\
start start-securepcc9-endpoint.bat
echo "SECURE PCC09 ENDPOINT STARTED: %PHRS_HOME%\phrs-soap-pcc09ws\start-securepcc9-endpoint.bat"

cd %PHRS_HOME%\phrs-soap-pcc10ws\
start start-securepcc10-endpoint.bat
echo "SECURE PCC10 ENDPOINT STARTED: %PHRS_HOME%\phrs-soap-pcc10ws\start-securepcc10-endpoint.bat"

start start-socketlistener.bat
echo "SOCKET LISTENER       STARTED: %PHRS_HOME%\phrs-soap-pcc10ws\start-socketlistener.bat"

cd "%mypwd%"
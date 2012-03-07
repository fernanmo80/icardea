set mypwd=%CD%

rem @KMT57-SRFG
if "%COMPUTERNAME%" == "KMT57" (
	set ICARDEA_HOME=D:\svn-repositories\icardea
	set PHRS_TOMCAT=C:\Programme\Apache Software Foundation\tomcat6
)

rem @SALK
if "%COMPUTERNAME%" == "N1RZ159" (
	set ICARDEA_HOME=D:\srdc\codes\google-icardea\icardea
	set PHRS_TOMCAT=D:\srfg\tomcat\phrs-tomcat-6
)

rem @SRDC-VirtualMachine
if "%COMPUTERNAME%" == "SRDC-ICARDEA" (
	set ICARDEA_HOME=C:\icardea-google\icardea
	set PHRS_TOMCAT=C:\icardea-google\icardea\tools\apache-tomcat-6.0.20
)

set CATALINA_HOME=%PHRS_TOMCAT%
set PHRS_HOME=%ICARDEA_HOME%\icardea-phrs

call %PHRS_TOMCAT%\startup.bat
echo "TOMCAT STARTED FROM %PHRS_TOMCAT%"

cd %PHRS_HOME%\phrs-soap-pcc09ws\
start start-securepcc9-endpoint.bat
echo "SECURE PCC09 ENDPOINT STARTED in new Window: %PHRS_HOME%\phrs-soap-pcc09ws\start-securepcc9-endpoint.bat"

cd %PHRS_HOME%\phrs-soap-pcc10ws\
start start-securepcc10-endpoint.bat
echo "SECURE PCC10 ENDPOINT STARTED in new Window: %PHRS_HOME%\phrs-soap-pcc10ws\start-securepcc10-endpoint.bat"

start start-socketlistener.bat
echo "SOCKET LISTENER       STARTED in new Window: %PHRS_HOME%\phrs-soap-pcc10ws\start-socketlistener.bat"

cd "%mypwd%"
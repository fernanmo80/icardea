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
set CATALINA_OPTS=-Xms256m -Xmx512m -XX:PermSize=256m -XX:MaxPermSize=1024m

title wait for tomcat to startup
call "%PHRS_TOMCAT%\bin\startup.bat"
echo "TOMCAT STARTED FROM %PHRS_TOMCAT%"

echo **** please wait for TOMCAT to start up, then press a key to start pcc9, pcc10 and socket-listener
pause

title creating phrs1 repository
call %ICARDEA_HOME%\tools_resources\curl\curl -X POST "%SESAME_WORKBENCH_URL%/repositories/NONE/create?type=native&Repository+ID=phrs1&Repository+title=phrs1+title&Triple+indexes=spoc,posc"
echo phrs1 repository created
echo.
echo.

cd "%PHRS_HOME%\phrs-soap-pcc09ws\"
start start-securepcc9-endpoint.bat
echo SECURE PCC09 ENDPOINT STARTED in new Window: %PHRS_HOME%\phrs-soap-pcc09ws\start-securepcc9-endpoint.bat

cd "%PHRS_HOME%\phrs-soap-pcc10ws\"
start start-securepcc10-endpoint.bat
echo SECURE PCC10 ENDPOINT STARTED in new Window: %PHRS_HOME%\phrs-soap-pcc10ws\start-securepcc10-endpoint.bat

start start-socketlistener.bat
echo SOCKET LISTENER       STARTED in new Window: %PHRS_HOME%\phrs-soap-pcc10ws\start-socketlistener.bat

cd "%mypwd%"
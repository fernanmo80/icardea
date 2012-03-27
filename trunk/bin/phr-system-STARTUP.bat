set mypwd=%CD%

rem @KMT57-SRFG
if "%COMPUTERNAME%" == "KMT57" (
	set PROJECT_ROOT=D:\svn-repositories\icardea
	set PHRS_TOMCAT=C:\Programme\Apache Software Foundation\tomcat6
	set SESAME_WORKBENCH_URL=http://localhost:8080/openrdf-workbench
)

rem @KMT53-SRFG
if "%COMPUTERNAME%" == "KMT53" (
	set PROJECT_ROOT=C:\icardea-google\icardea
        rem set PHRS_TOMCAT=C:\icardea-google\icardea\tools\apache-tomcat-6.0.20
        rem set PHRS_TOMCAT=D:\srdc\codes\icardea-google\tools\apache-tomcat-phr

    set PHRS_TOMCAT=C:\srfg\phrs-tomcat-6
	set SESAME_WORKBENCH_URL=http://localhost:6060/openrdf-workbench
)

rem @SALK
if "%COMPUTERNAME%" == "N1RZ159" (
	set PROJECT_ROOT=D:\srdc\codes\icardea-google\icardea
	set PHRS_TOMCAT=D:\srfg\tomcat\phrs-tomcat-6
	set SESAME_WORKBENCH_URL=http://localhost:6060/openrdf-workbench
)


rem @SRDC-VirtualMachine
if "%COMPUTERNAME%" == "SRDC-ICARDEA" (
	set PROJECT_ROOT=C:\icardea-google\icardea
        rem set PHRS_TOMCAT=C:\icardea-google\icardea\tools\apache-tomcat-6.0.20
        rem set PHRS_TOMCAT=D:\srdc\codes\icardea-google\tools\apache-tomcat-phr

    set PHRS_TOMCAT=C:\srfg\phrs-tomcat-6
	set SESAME_WORKBENCH_URL=http://localhost:6060/openrdf-workbench
)

set CATALINA_HOME=%PHRS_TOMCAT%
set PHRS_HOME=%PROJECT_ROOT%\icardea-phrs
set CATALINA_OPTS=-Xms256m -Xmx512m -XX:PermSize=256m -XX:MaxPermSize=1024m


rem set PHR_TRUST_STORE=%PHRS_HOME%\phrs-soap-pcc10ws\src\main\resources\srfg-phrs-core-keystore.ks


title wait for tomcat to startup
call "%PHRS_TOMCAT%\bin\startup.bat"
echo "TOMCAT STARTED FROM %PHRS_TOMCAT%"

echo **** please wait for TOMCAT to start up, then press a key to start pcc9, pcc10 and socket-listener
echo **** wait for this last message in the tomcat window!!  INFO: Server startup in XXXXX ms
pause

title creating phrs1 repository 
rem echo %PROJECT_ROOT%\tools_resources\curl\curl -X POST "%SESAME_WORKBENCH_URL%/repositories"
echo %PROJECT_ROOT%\tools_resources\curl\curl -X POST "%SESAME_WORKBENCH_URL%/repositories/NONE/create?type=native&Repository+ID=phrs1&Repository+title=phrs1+title&Triple+indexes=spoc,posc"
rem first curl is to wake up...if there is a malformed URL, it will be obvious here
call %PROJECT_ROOT%\tools_resources\curl\curl -X POST "%SESAME_WORKBENCH_URL%/repositories"
call %PROJECT_ROOT%\tools_resources\curl\curl -X POST "%SESAME_WORKBENCH_URL%/repositories/NONE/create?type=native&Repository+ID=phrs1&Repository+title=phrs1+title&Triple+indexes=spoc,posc"


echo phrs1 repository created
echo ****
echo *****WAIT a moment, we sent CURL messages to sesame for the DB init. Press any key to continue.
echo ****
pause

title starting pcc9, pcc10 and socket-listener
cd "%PHRS_HOME%\phrs-soap-pcc09ws\"
start start-securepcc9-endpoint.bat
echo SECURE PCC09 ENDPOINT STARTED in new Window: %PHRS_HOME%\phrs-soap-pcc09ws\start-securepcc9-endpoint.bat

cd "%PHRS_HOME%\phrs-soap-pcc10ws\"
start start-securepcc10-endpoint.bat
echo SECURE PCC10 ENDPOINT STARTED in new Window: %PHRS_HOME%\phrs-soap-pcc10ws\start-securepcc10-endpoint.bat

start start-socketlistener.bat

echo SOCKET LISTENER       STARTED in new Window: %PHRS_HOME%\phrs-soap-pcc10ws\start-socketlistener.bat

echo ****
echo **** NEXT: PCC-09 QUERY TO EHR - Please wait for PCC-10 endpoint startup, then press a key to start PCC-9 query to EHR
echo **** You can abort if needed, this is the last to run
echo ****
pause

cd "%PHRS_HOME%\phrs-soap-pcc09ws\"
call phr-send-pcc9.bat 

title phr-system-STARTUP FINISHED
rem paused already from send pcc9 
cd "%mypwd%"
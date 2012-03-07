set mypwd=%CD%

rem @KMT57-SRFG
if "%COMPUTERNAME%" == "KMT57" (
	set ICARDEA_HOME=D:\svn-repositories\icardea
	set PHRS_TOMCAT=C:\Programme\Apache Software Foundation\tomcat6
	set SESAME_WORKBENCH_URL=http://localhost:8080/openrdf-workbench
)

rem @SALK
if "%COMPUTERNAME%" == "N1RZ159" (
	set ICARDEA_HOME=D:\srdc\codes\google-icardea\icardea
	set PHRS_TOMCAT=D:\srfg\tomcat\phrs-tomcat-6
	set SESAME_WORKBENCH_URL=http://localhost:6060/openrdf-workbench
)

rem @SRDC-VirtualMachine
if "%COMPUTERNAME%" == "SRDC-ICARDEA" (
	set ICARDEA_HOME=C:\icardea-google\icardea
	set PHRS_TOMCAT=C:\icardea-google\icardea\tools\apache-tomcat-6.0.20
	set SESAME_WORKBENCH_URL=http://localhost:8080/openrdf-workbench
)


set CATALINA_HOME=%PHRS_TOMCAT%

set PCC09WS_HOME=%ICARDEA_HOME%\icardea-phrs\phrs-soap-pcc09ws

title currently installing QUPC_AR004040UV_Service
call mvn install:install-file -Dfile="%PCC09WS_HOME%\QUPC_AR004040UV_Service.jar"  -Dsource="%PCC09WS_HOME%\QUPC_AR004040UV_Service-sources.jar" -DgroupId=org.hl7.v3 -DartifactId=QUPC_AR004040UV_Service -Dversion=0.1 -Dpackaging=jar -DgeneratePom=true
echo QUPC_AR004040UV_Service installed
echo.
echo.

title currently installing QUPC_AR004030UV_Service
call mvn install:install-file -Dfile="%PCC09WS_HOME%\QUPC_AR004030UV_Service.jar"  -Dsource="%PCC09WS_HOME%\QUPC_AR004030UV_Service-sources.jar" -DgroupId=org.hl7.v3 -DartifactId=QUPC_AR004030UV_Service -Dversion=0.1 -Dpackaging=jar -DgeneratePom=true
echo "QUPC_AR004030UV_Service installed"
echo.
echo.

rem this should run after the initial setup of the whole icardea system.
title currently installing icardea-config
call mvn install -f "%ICARDEA_HOME%\icardea-config\pom.xml" -Dmaven.test.skip=true -DgeneratePom=true
echo icardea-config installed
echo.
echo.

title currently installing icardea-atnalog-client
call mvn install -f "%ICARDEA_HOME%\icardea-atnalog-client\pom.xml" -Dmaven.test.skip=true -DgeneratePom=true
echo icardea-atnalog-client installed
echo.
echo.

title currently installing icardea-phrs
cd "%ICARDEA_HOME%\icardea-phrs"
call mvn install -DskipTests=true -Dicardea.home="%ICARDEA_HOME%"
echo icardea-phrs installed
echo.
echo.

title currently installing phrweb
cd "%ICARDEA_HOME%\icardea-phrs\phrweb\"
call mvn cargo:deploy -Dcatalina.home=%CATALINA_HOME%
echo phrweb installed (mvn cargo:deploy to %CATALINA_HOME% finished)
echo.
echo.

title creating phrs1 repository
call %ICARDEA_HOME%\tools_resources\curl\curl -X POST "%SESAME_WORKBENCH_URL%/repositories/NONE/create?type=native&Repository+ID=phrs1&Repository+title=phrs1+title&Triple+indexes=spoc%2Cposc"
echo phrs1 repository created
echo.
echo.


title PHRS-INSTALL FINISHED
echo ICARDEA_HOME was %ICARDEA_HOME%
echo PHRS_TOMCAT was %PHRS_TOMCAT%
echo CATALINA_HOME was %CATALINA_HOME%


cd %mypwd%

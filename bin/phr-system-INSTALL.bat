set mypwd=%CD%
echo installing. Cleaning software and removing log files. Databases are not deleted, but triplestore location and port must be designated. Triplestore is created if missing.
rem @KMT57-SRFG
if "%COMPUTERNAME%" == "KMT57" (
	set PROJECT_ROOT=D:\svn-repositories\icardea
	set PHRS_TOMCAT=C:\Programme\Apache Software Foundation\tomcat6
	set SESAME_WORKBENCH_URL=http://localhost:8080/openrdf-workbench
	set TRIPLESTORE_SRC=generic_triplestore_http_8080.xml
)
rem @KMT53-SRFG
if "%COMPUTERNAME%" == "KMT53" (
	set PROJECT_ROOT=C:\icardea-google\icardea
        rem set PHRS_TOMCAT=C:\icardea-google\icardea\tools\apache-tomcat-6.0.20
        rem set PHRS_TOMCAT=D:\srdc\codes\icardea-google\tools\apache-tomcat-phr

    set PHRS_TOMCAT=C:\srfg\phrs-tomcat-6
	set SESAME_WORKBENCH_URL=http://localhost:6060/openrdf-workbench
	set TRIPLESTORE_SRC=generic_triplestore_http_6060.xml
)

rem @SALK
if "%COMPUTERNAME%" == "N1RZ159" (
	set PROJECT_ROOT=D:\srdc\codes\icardea-google\icardea
	set PHRS_TOMCAT=D:\srfg\tomcat\phrs-tomcat-6
	set SESAME_WORKBENCH_URL=http://localhost:6060/openrdf-workbench
	set TRIPLESTORE_SRC=generic_triplestore_http_6060.xml
)


rem @SRDC-VirtualMachine
if "%COMPUTERNAME%" == "SRDC-ICARDEA" (
	set PROJECT_ROOT=C:\icardea-google\icardea
        rem set PHRS_TOMCAT=C:\icardea-google\icardea\tools\apache-tomcat-6.0.20
        rem set PHRS_TOMCAT=D:\srdc\codes\icardea-google\tools\apache-tomcat-phr

        set PHRS_TOMCAT=C:\srfg\phrs-tomcat-6
	set SESAME_WORKBENCH_URL=http://localhost:6060/openrdf-workbench
	set TRIPLESTORE_SRC=generic_triplestore_http_6060.xml
)

rem set CATALINA_OPTS=-Xms256m -Xmx512m -XX:PermSize=256m -XX:MaxPermSize=1024m
set CATALINA_HOME=%PHRS_TOMCAT%
set PHRS_HOME=%PROJECT_ROOT%\icardea-phrs

set PCC09WS_HOME=%PROJECT_ROOT%\icardea-phrs\phrs-soap-pcc09ws
set TRIPLESTORE_SRC=%PROJECT_ROOT%\icardea-phrs\phrs-dataexchange-client\src\main\resources\%TRIPLESTORE_SRC%
set TRIPLESTORE_DST=%PROJECT_ROOT%\icardea-phrs\phrs-dataexchange-client\src\main\resources\generic_triplestore.xml

title deleting webapp related files phrweb, sesame
del "%PHRS_TOMCAT%\webapps\phrweb.war"
del "%PHRS_TOMCAT%\webapps\openrdf-sesame.war"
del "%PHRS_TOMCAT%\webapps\openrdf-workbench.war"

rmdir /S /Q "%PHRS_TOMCAT%\work\Catalina\localhost\phrweb\"
del "%PHRS_TOMCAT%\conf\Catalina\localhost\phrweb.xml"

rmdir /S /Q "%PHRS_TOMCAT%\webapps\phrweb\"
rmdir /S /Q "%PHRS_TOMCAT%\webapps\openrdf-sesame\"
rmdir /S /Q "%PHRS_TOMCAT%\webapps\openrdf-workbench\"
rmdir /S /Q "%PHRS_TOMCAT%\work\Catalina\localhost\openrdf-sesame\"
rmdir /S /Q "%PHRS_TOMCAT%\work\Catalina\localhost\openrdf-workbench\"

rem del "%PHRS_TOMCAT%\bin\log_phr_app.txt"
rem del "%PHRS_TOMCAT%\bin\log_phr_libs.txt"
rem del "%PHRS_TOMCAT%\bin\log_phr_root.txt"

rem del "%PROJECT_ROOT%\bin\log_phr_app.txt"
rem del "%PROJECT_ROOT%\bin\log_phr_libs.txt"
rem del "%PROJECT_ROOT%\bin\log_phr_root.txt"

call mvn clean -f "%PHRS_HOME%\pom.xml" -Dtomcat.home="%PHRS_TOMCAT%" -Dicardea.home="%PROJECT_ROOT%" -Daduna.parentdir="%APPDATA%" -DcleanTomcatWebapps=true -DremoveSesameAduna=false -DremoveSesame=true -DcleanLogs=false

title copying triplestore configuration
copy /Y "%TRIPLESTORE_SRC%" "%TRIPLESTORE_DST%"

title currently installing QUPC_AR004040UV_Service
call mvn install:install-file -Dfile="%PCC09WS_HOME%\QUPC_AR004040UV_Service.jar" -Dsource="%PCC09WS_HOME%\QUPC_AR004040UV_Service-sources.jar" -DgroupId=org.hl7.v3 -DartifactId=QUPC_AR004040UV_Service -Dversion=0.1 -Dpackaging=jar -DgeneratePom=true
echo QUPC_AR004040UV_Service installed
echo.
echo.

title currently installing QUPC_AR004030UV_Service
call mvn install:install-file -Dfile="%PCC09WS_HOME%\QUPC_AR004030UV_Service.jar" -Dsource="%PCC09WS_HOME%\QUPC_AR004030UV_Service-sources.jar" -DgroupId=org.hl7.v3 -DartifactId=QUPC_AR004030UV_Service -Dversion=0.1 -Dpackaging=jar -DgeneratePom=true
echo "QUPC_AR004030UV_Service installed"
echo.
echo.

rem this should run after the initial setup of the whole icardea system.
rem title currently installing icardea-config
rem call mvn install -f "%PROJECT_ROOT%\icardea-config\pom.xml" -Dmaven.test.skip=true -DgeneratePom=true
rem echo icardea-config installed
rem echo.
rem echo.
echo We do not install icardea atnalog client, it must be in the mvn repository. If there is a compile problem, please install
rem title currently installing icardea-atnalog-client
rem call mvn install:install-file -Dfile="%PCC09WS_HOME%\icardea-atnalog-client-1.0-SNAPSHOT.jar" -DgroupId=tr.com.srdc.icardea -DartifactId=icardea-atnalog-client -Dversion=1.0-SNAPSHOT -Dpackaging=jar -DgeneratePom=true
rem call mvn install -f "%PROJECT_ROOT%\icardea-atnalog-client\pom.xml" -Dmaven.test.skip=true -DgeneratePom=true
rem echo Audit icardea-atnalog-client installed from %PCC09WS_HOME%\icardea-atnalog-client-1.0-SNAPSHOT.jar
rem echo.
rem echo.

title currently installing icardea-phrs
cd "%PROJECT_ROOT%\icardea-phrs"
call mvn install -DskipTests=true -Dicardea.home="%PROJECT_ROOT%" -Dtomcat.home="%CATALINA_HOME%" -DinstallSesame=true
echo icardea-phrs installed
echo.
echo.

title currently installing phrweb
cd "%PROJECT_ROOT%\icardea-phrs\phrweb\"
call mvn cargo:deploy -Dcatalina.home="%CATALINA_HOME%"
echo phrweb installed (mvn cargo:deploy to %CATALINA_HOME% finished)
echo.
echo.


title phr-system-INSTALL FINISHED
echo PROJECT_ROOT was %PROJECT_ROOT%
echo PHRS_TOMCAT was %PHRS_TOMCAT%
echo CATALINA_HOME was %CATALINA_HOME%
echo continue with startup


cd %mypwd%
pause
set mypwd=%CD%

rem @KMT57-SRFG
if "%COMPUTERNAME%" == "KMT57" (
	set PROJECT_ROOT=D:\svn-repositories\icardea
	set PHRS_TOMCAT=C:\Programme\Apache Software Foundation\tomcat6
	set SESAME_WORKBENCH_URL=http://localhost:8080/openrdf-workbench
    set MONGO_TMP=C:\icardea\EHR\mongodb-win32-i386-1.8.2
)
rem @KMT53-SRFG
if "%COMPUTERNAME%" == "KMT53" (
	set PROJECT_ROOT=C:\icardea-google\icardea
	set PHRS_TOMCAT=C:\icardea-google\icardea\tools\apache-tomcat-6.0.20
	set SESAME_WORKBENCH_URL=http://localhost:8080/openrdf-workbench
    set MONGO_TMP=D:\local\mongodb-win32-i386-1.6.3
)

rem @SALK
if "%COMPUTERNAME%" == "N1RZ159" (
	set PROJECT_ROOT=D:\srdc\codes\icardea-google\icardea
	set PHRS_TOMCAT=D:\srfg\tomcat\phrs-tomcat-6
	set SESAME_WORKBENCH_URL=http://localhost:6060/openrdf-workbench
    set MONGO_TMP=C:\icardea\EHR\mongodb-win32-i386-1.8.2
)

rem @SRDC-VirtualMachine
if "%COMPUTERNAME%" == "SRDC-ICARDEA" (
	set PROJECT_ROOT=C:\icardea-google\icardea
	set PHRS_TOMCAT=C:\icardea-google\icardea\tools\apache-tomcat-6.0.20
	set SESAME_WORKBENCH_URL=http://localhost:8080/openrdf-workbench
    set MONGO_TMP=D:\local\mongodb-win32-i386-1.6.3
)

set CATALINA_HOME=%PHRS_TOMCAT%
set PHRS_HOME=%PROJECT_ROOT%\icardea-phrs

title undeploy phrs-related applications and shutdown tomcat
del "%PHRS_TOMCAT%\webapps\phrweb.war"

del "%PHRS_TOMCAT%\webapps\openrdf-sesame.war"
del "%PHRS_TOMCAT%\webapps\openrdf-workbench.war"
call "%PHRS_TOMCAT%\bin\shutdown.bat"

echo **** please wait for tomcat to shutdown, then press a key to delete remaining files."
pause

rem title deleting phrs-related directories and files

rmdir /S /Q "%PHRS_TOMCAT%\work\Catalina\localhost\phrweb\"
del "%PHRS_TOMCAT%\conf\Catalina\localhost\phrweb.xml"
rmdir /S /Q "%APPDATA%\Aduna"

rem These should not be here unless tomcat is down and did not clean up, therefore CLEAN UP manually ....
rmdir /S /Q "%PHRS_TOMCAT%\webapps\phrweb\"
rmdir /S /Q "%PHRS_TOMCAT%\webapps\openrdf-sesame\"
rmdir /S /Q "%PHRS_TOMCAT%\webapps\openrdf-workbench\"
rmdir /S /Q "%PHRS_TOMCAT%\work\Catalina\localhost\openrdf-sesame\"
rmdir /S /Q "%PHRS_TOMCAT%\work\Catalina\localhost\openrdf-workbench\"

del "%PHRS_TOMCAT%\bin\log_phr_app.txt"
del "%PHRS_TOMCAT%\bin\log_phr_libs.txt"
del "%PHRS_TOMCAT%\bin\log_phr_root.txt"

del "%PROJECT_ROOT%\bin\log_phr_app.txt"
del "%PROJECT_ROOT%\bin\log_phr_libs.txt"
del "%PROJECT_ROOT%\bin\log_phr_root.txt"


title Doing mvn clean with complete removal of files
call mvn clean -f "%PHRS_HOME%\pom.xml" -Dtomcat.home="%PHRS_TOMCAT%" -Dicardea.home="%PROJECT_ROOT%" -Daduna.parentdir="%APPDATA%" -DcleanTomcatWebapps=true -DremoveSesameAduna=true -DremoveSesame=true

rem Do mongo last ... mongo db
rem http://www.w3resource.com/mongodb/mongodb-remove-collection.php
echo  ****
echo  **** Mongo start cleanup of phrdata %MONGO_TMP%\bin\mongo localhost/phrsdata1 -quiet -eval "db.dropDatabase()"
%MONGO_TMP%\bin\mongo localhost/phrsdata1 -quiet -eval "db.dropDatabase()"
echo  **** Mongo cleanup of phrdata1 completed

cd %mypwd%
title phr-system-CLEANALL FINISHED
pause
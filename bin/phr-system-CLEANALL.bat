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
        set PHRS_TOMCAT=C:\srfg\phrs-tomcat-6
	set SESAME_WORKBENCH_URL=http://localhost:6060/openrdf-workbench
	set MONGO_TMP=D:\local\mongodb-win32-i386-1.6.3
		rem set MONGO_TMP=C:\icardea-google\icardea\tools_resources\tools\mongo\mongodb-win32-i386-1.8.3
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
        rem set PHRS_TOMCAT=C:\icardea-google\icardea\tools\apache-tomcat-6.0.20
        rem set PHRS_TOMCAT=C:\icardea-google\icardea\tools\apache-tomcat-phr
    set PHRS_TOMCAT=C:\srfg\phrs-tomcat-6

	set SESAME_WORKBENCH_URL=http://localhost:6060/openrdf-workbench
		rem are there different DB versions, data under C:\icardea-google\icardea\tools_resources\tools\mongo\mongodb-win32-i386-1.8.3
        rem if NOT DEFINED MONGO_HOME set MONGO_HOME=????
	set MONGO_TMP=C:\icardea-google\icardea\tools\mongo\mongodb-win32-i386-1.8.3
)

set CATALINA_HOME=%PHRS_TOMCAT%
set PHRS_HOME=%PROJECT_ROOT%\icardea-phrs

title undeploy phrs-related applications and shutdown tomcat
del "%PHRS_TOMCAT%\webapps\phrweb.war"

del "%PHRS_TOMCAT%\webapps\openrdf-sesame.war"
del "%PHRS_TOMCAT%\webapps\openrdf-workbench.war"

rem keep tomcat up if up, other partner might have stopped it. Must try to remove via tomcat or via file system because tomcat could be down
rem echo **** REMOVING TOMCAT PHR and SESAME WAR FILES, please wait for tomcat , then press a key to delete remaining files. There might fail if tomcat is running"
call "%PHRS_TOMCAT%\bin\shutdown.bat"
echo ****
echo **** please wait for tomcat to shutdown, CHECK WINDOW and close/Kill if necessary. Then press a key to delete remaining files."
echo ****
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

rem Mongo cleanup
rem http://www.w3resource.com/mongodb/mongodb-remove-collection.php
echo  ****
echo  **** Mongo start cleanup of phrdata %MONGO_TMP%\bin\mongo localhost/phrsdata1 -quiet -eval "db.dropDatabase()"
rem mongo drop
%MONGO_TMP%\bin\mongo localhost/phrsdata1 -quiet -eval "db.dropDatabase()"
echo  **** Mongo cleanup of phrdata1 completed

title Doing mvn clean with complete removal of files
rem this will fail if tomcat is running.... we experienced that tomcat window does not close, tomcat stopped, but still prevents access
call mvn clean -f "%PHRS_HOME%\pom.xml" -Dtomcat.home="%PHRS_TOMCAT%" -Dicardea.home="%PROJECT_ROOT%" -Daduna.parentdir="%APPDATA%" -DcleanTomcatWebapps=true -DremoveSesameAduna=true -DremoveSesame=true


cd %mypwd%
title phr-system-CLEANALL FINISHED, continue with phr-system-INSTALL.bat
pause
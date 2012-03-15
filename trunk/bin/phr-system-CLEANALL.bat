set mypwd=%CD%

rem @KMT57-SRFG
if "%COMPUTERNAME%" == "KMT57" (
	set ICARDEA_HOME=D:\svn-repositories\icardea
	set PHRS_TOMCAT=C:\Programme\Apache Software Foundation\tomcat6
	set SESAME_WORKBENCH_URL=http://localhost:8080/openrdf-workbench
)

rem @SALK
if "%COMPUTERNAME%" == "N1RZ159" (
	set ICARDEA_HOME=D:\srdc\codes\icardea-google\icardea
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
set PHRS_HOME=%ICARDEA_HOME%\icardea-phrs

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

rem it should not be here....
rmdir /S /Q "%PHRS_TOMCAT%\webapps\phrweb\"
rem rmdir /S /Q "%PHRS_TOMCAT%\webapps\openrdf-sesame\"
rem rmdir /S /Q "%PHRS_TOMCAT%\webapps\openrdf-workbench\"

rem rmdir /S /Q "%PHRS_TOMCAT%\work\Catalina\localhost\openrdf-sesame\"
rem rmdir /S /Q "%PHRS_TOMCAT%\work\Catalina\localhost\openrdf-workbench\"

rem del "%PHRS_TOMCAT%\bin\log_phr_app.txt"
rem del "%PHRS_TOMCAT%\bin\log_phr_libs.txt"
rem del "%PHRS_TOMCAT%\bin\log_phr_root.txt"


del "%ICARDEA_HOME%\bin\log_phr_app.txt"
del "%ICARDEA_HOME%\bin\log_phr_libs.txt"
del "%ICARDEA_HOME%\bin\log_phr_root.txt"

title doing mvn clean with complete removal of files
call mvn clean -f "%PHRS_HOME%\pom.xml" -Dtomcat.home="%PHRS_TOMCAT%" -Dicardea.home="%ICARDEA_HOME%" -Daduna.parentdir="%APPDATA%" -DcleanTomcatWebapps=true -DremoveSesameAduna=true -DremoveSesame=true

cd %mypwd%
title phr-system-CLEANALL FINISHED
pause
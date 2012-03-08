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
set PHRS_HOME=%ICARDEA_HOME%\icardea-phrs

title undeploy phrs-related applications and shutdown tomcat
del "%PHRS_TOMCAT%\webapps\phrweb.war"
del "%PHRS_TOMCAT%\webapps\openrdf-sesame.war"
del "%PHRS_TOMCAT%\webapps\openrdf-workbench.war"
call "%PHRS_TOMCAT%\bin\shutdown.bat"

echo **** please wait for tomcat to shutdown, then press a key to delete remaining files."
pause

title deleting phrs-related directories and files
rmdir /S /Q "%PHRS_TOMCAT%\webapps\phrweb\"
rmdir /S /Q "%PHRS_TOMCAT%\webapps\openrdf-sesame\"
rmdir /S /Q "%PHRS_TOMCAT%\webapps\openrdf-workbench\"
rmdir /S /Q "%APPDATA%\Aduna"
del "%PHRS_TOMCAT%\bin\log_phr_app.txt"
del "%PHRS_TOMCAT%\bin\log_phr_libs.txt"
del "%PHRS_TOMCAT%\bin\log_phr_root.txt"
del "%ICARDEA_HOME%\bin\log_phr_app.txt"
del "%ICARDEA_HOME%\bin\log_phr_libs.txt"
del "%ICARDEA_HOME%\bin\log_phr_root.txt"

title doing mvn clean
call mvn clean -f "%PHRS_HOME%\pom.xml"

cd %mypwd%
title phr-system-CLEANALL FINISHED

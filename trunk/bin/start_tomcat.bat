@echo off
call setenv.bat
set CATALINA_HOME=../tools/apache-tomcat-6.0.20/
call %CATALINA_HOME%bin/startup.bat

@echo off
set CATALINA_HOME=..\tools\apache-tomcat-6.0.20
set MAVEN_OPTS=-Xms256m -Xmx1024m
set CATALINA_OPTS=-Xms256m -Xmx512m -XX:PermSize=256m -XX:MaxPermSize=1024m
set EPSOS_PROPS_PATH=..\tools_resources\EPSOS_CONFIG\
PATH=%PATH:C:\apache-maven-3.0.2\bin=..\tools_resources\apache-maven-2.2.1-bin\apache-maven-2.2.1\bin%


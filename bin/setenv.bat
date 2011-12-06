@echo off
set CATALINA_HOME=..\tools\apache-tomcat-6.0.20
set MAVEN_OPTS=-Xms256m -Xmx1024m
set CATALINA_OPTS=-Xms256m -Xmx512m -XX:PermSize=256m -XX:MaxPermSize=1024m

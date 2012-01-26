@echo off

if not "%MAVEN_HOME%" == "" goto run
SET MAVEN_HOME=C:\apache-maven-3.0.2

:run
%MAVEN_HOME%\bin\mvn exec:java -Dexec.mainClass="gr.forth.ics.icardea.listener.EDFReceiver" -Dexec.classpathScope=runtime -e

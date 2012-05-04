#!/bin/bash
#set -xv

clear

rem mvn clean compile
rem mvn test-compile
mvn exec:java -Dexec.mainClass=at.srfg.kmt.ehealth.phrs.ws.soap.pcc10.VitalSignClientExample -Dexec.classpathScope=test $1



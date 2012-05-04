#!/bin/bash
#set -xv

clear

rem mvn clean
rem mvn compile
rem mvn test-compile
mvn exec:java -Dexec.mainClass=at.srfg.kmt.ehealth.phrs.ws.soap.pcc10.MedicationClientExample -Dexec.classpathScope=test

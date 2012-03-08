cls
call title Start PCC10 endpoint Simulation 
rem call mvn clean compile
rem call mvn test-compile
call mvn exec:java -Dexec.mainClass=at.srfg.kmt.ehealth.phrs.ws.soap.pcc10.PCC10EndpointExample -Dexec.classpathScope=test -Dexec.args="localhost 8989 testws/pcc10" -Dpcc10.process="true"
pause
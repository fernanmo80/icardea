cls
call title Send Cobscat pcc09
rem call mvn compile
rem call mvn test-compile

call mvn exec:java -Dexec.mainClass=at.srfg.kmt.ehealth.phrs.ws.soap.pcc9.SendComplexPcc09MessageExample -Dexec.classpathScope=test -Dexec.args="http://localhost:8089/testws/pcc9 http://localhost:8989/testws/pcc10 COBSCAT 191 Suzie Mayr F"

call mvn exec:java -Dexec.mainClass=at.srfg.kmt.ehealth.phrs.ws.soap.pcc9.SendComplexPcc09MessageExample -Dexec.classpathScope=test -Dexec.args="http://localhost:8089/testws/pcc9 http://localhost:8989/testws/pcc10 MEDLIST 191 Suzie Mayr F"

call mvn exec:java -Dexec.mainClass=at.srfg.kmt.ehealth.phrs.ws.soap.pcc9.SendComplexPcc09MessageExample -Dexec.classpathScope=test -Dexec.args="http://localhost:8089/testws/pcc9 http://localhost:8989/testws/pcc10 MEDCCAT 191 Suzie Mayr F"

pause
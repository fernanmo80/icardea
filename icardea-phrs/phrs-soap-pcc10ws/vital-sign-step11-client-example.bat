cls
call Vital sign example step11
call mvn clean compile
call mvn test-compile
call mvn exec:java -Dexec.mainClass=at.srfg.kmt.ehealth.phrs.ws.soap.pcc10.VitalSignStep11ClientExample -Dexec.classpathScope=test


pause
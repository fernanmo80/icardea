call title iCARDEA PIX PDQ Server
call setenv.bat
rem mvn exec:java -Dtask=patientindex -f icardea-interop-fmwork\pixpdq\pom.xml
call mvn -o install -Dmaven.test.skip=true -Ppatientindex -f ..\icardea-interop-fmwork\pixpdq\pom.xml

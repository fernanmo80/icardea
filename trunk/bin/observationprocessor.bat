call title OBSERVATION PROCESSOR iCARDEA 
call setenv.bat
call mvn -o -f ..\icardea-caremanagementdb\pom.xml exec:java -Dtask=observation.processor 

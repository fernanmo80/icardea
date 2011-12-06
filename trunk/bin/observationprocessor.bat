call title iCARDEA OBSERVATION PROCESSOR
call setenv.bat
call mvn -o -f ..\icardea-caremanagementdb\pom.xml exec:java -Dtask=observation.processor

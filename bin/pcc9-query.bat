call setenv.bat
rem call mvn -o -f ..\icardea-caremanagementdb\pom.xml exec:java -Dtask=pcc9.query
call mvn -o -f ..\icardea-caremanagementdb\pom.xml exec:java -Dtask=pcc9.to.phr.query

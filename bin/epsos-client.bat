call title EPSOS Client
call setenv.bat
call mvn -o -f ..\icardea-epsos-client\pom.xml exec:java -Dtask=epsos.client

call setenv.bat
call mvn -f ..\icardea-ctsinvoker\pom.xml exec:java -Dtask=invoke.cts

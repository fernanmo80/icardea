call title iCARDEA CAREPLAN ENGINE
call setenv.bat
call mvn -o -f ..\icardea-careplanengine\pom.xml exec:java -Dtask=run.engine

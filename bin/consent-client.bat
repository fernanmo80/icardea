call setenv.bat
call mvn -f ..\icardea-consenteditor-invoker\pom.xml exec:java -Dtask=invoke.consent

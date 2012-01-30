call setenv.bat
call mvn -o install -f ..\icardea-interop-fmwork\pixpdq\pom.xml -Dmaven.test.skip=true
call mvn -o install -f ..\icardea-cts-ws\pom.xml -Dmaven.test.skip=true
call mvn -o install -f ..\icardea-ctsinvoker\pom.xml -Dmaven.test.skip=true
call mvn -o install -f ..\icardea-consenteditor-invoker\pom.xml -Dmaven.test.skip=true
call mvn -o install -f ..\icardea-consenteditor\pom.xml -Dmaven.test.skip=true
call mvn -o install -f ..\icardea-caremanagementdb\pom.xml -Dmaven.test.skip=true
call mvn -o install -f ..\icardea-caremanager-ws\pom.xml -Dmaven.test.skip=true
call mvn -o install -f ..\icardea-careplanengine\pom.xml -Dmaven.test.skip=true 
call mvn -o install -f ..\icardea-careplaneditor\pom.xml -Dmaven.test.skip=true
call mvn -o install -f ..\icardea-atnalog-client\pom.xml -Dmaven.test.skip=true
call mvn -o install -f ..\icardea-epsos-client\pom.xml -Dmaven.test.skip=true

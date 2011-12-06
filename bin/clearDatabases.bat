call mvn -o install -f ..\icardea-caremanagementdb\pom.xml -DcreateDatabases=true -Dmaven.test.skip=true
call rmdir /S /Q ..\data
call md ..\data

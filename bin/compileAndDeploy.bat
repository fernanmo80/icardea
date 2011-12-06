call setenv.bat

call mvn -o install -Dmaven.test.skip=true -f ..\pom.xml

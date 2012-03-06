call mvn install:install-file -DgroupId=gr.ics.forth.icardea -DartifactId=jpathwatch -Dversion=0.94 -Dpackaging=jar -Dfile=..\tools_resources\external-lib\jpathwatch-0.94\jpathwatch_0.94.jar

call mvn install:install-file -DgroupId=gr.ics.forth.icardea -DartifactId=ctsclient -Dversion=1.0_SNAPSHOT -Dpackaging=jar -Dfile=..\tools_resources\external-lib\cts_client\ctsclient_1.0_SNAPSHOT.jar

call mvn install:install-file -DgroupId=gr.forth.ics.icardea.mllp -DartifactId=HL7MLLPServerSSL -Dversion=1.0 -Dpackaging=jar -Dfile=..\tools_resources\external-lib\HL7MLLPServer\HL7MLLPServer2.jar
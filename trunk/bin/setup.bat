call setenv.bat

echo Installing additional libraries to local Maven repository

call mvn -q install:install-file -DgroupId=hapi -DartifactId=hapi -Dversion=1.0.2 -Dpackaging=jar -Dfile=..\tools_resources\external-lib\hapi-1.0.1\hapi-1.0.2.jar

call mvn -q install:install-file -DgroupId=hapi -DartifactId=structures-v24 -Dversion=1.0.1 -Dpackaging=jar -Dfile=..\tools_resources\external-lib\hapi-1.0.1\hapi-structures-v24-1.0.1.jar

call mvn -q install:install-file -DgroupId=org.vp -DartifactId=vp -Dversion=5.0 -Dpackaging=jar -Dfile=..\tools_resources\external-lib\vp-5.0\orm.jar

call mvn -q install:install-file -DgroupId=jess -DartifactId=jess -Dversion=7.1 -Dpackaging=jar -Dfile=..\tools_resources\external-lib\jess-7.1\jess.jar

call mvn -q install:install-file -DgroupId=prefuse -DartifactId=prefuse -Dversion=1.0 -Dpackaging=jar -Dfile=..\tools_resources\external-lib\prefuse-1.0\prefuse.jar

call mvn -q install:install-file -DgroupId=org.jivesoftware.smack -DartifactId=smack -Dversion=2.2.1 -Dpackaging=jar -Dfile=..\tools_resources\external-lib\smack-2.2.1\smack.jar

call mvn -q install:install-file -DgroupId=edu.standford.smi.protegex -DartifactId=protegex -Dversion=3.4.1 -Dpackaging=jar -Dfile=..\tools_resources\external-lib\protege-3.4.1\protege-owl.jar

call mvn -q install:install-file -DgroupId=org.mrf.MSNBot -DartifactId=MSNBot -Dversion=1.0 -Dpackaging=jar -Dfile=..\tools_resources\external-lib\msnbot-1.0\MSNBot.jar

call mvn -q install:install-file -DgroupId=edu.standford.smi.protege -DartifactId=protege -Dversion=3.4.1 -Dpackaging=jar -Dfile=..\tools_resources\external-lib\protege-3.4.1\protege.jar

call mvn -q install:install-file -DgroupId=org.enhydra.oyster -DartifactId=oyster -Dversion=3.4.1 -Dpackaging=jar -Dfile=..\tools_resources\external-lib\oyster-3.4.1\oyster.jar

call mvn -q install:install-file -DgroupId=org.apache.bsf -DartifactId=bsf -Dversion=1.0 -Dpackaging=jar -Dfile=..\tools_resources\external-lib\bsf-1.0\bsf.jar

call mvn -q install:install-file -DgroupId=org.mongodb -DartifactId=mongo-java-driver -Dversion=2.4 -Dpackaging=jar -Dfile=..\tools_resources\external-lib\mongo-2.3\mongo-2.3.jar

call mvn -q install:install-file -DgroupId=xom -DartifactId=xom -Dversion=1.2.6 -Dpackaging=jar -Dfile=..\tools_resources\external-lib\xom-1.2.6\xom-1.2.6.jar

call mvn -q install:install-file -DgroupId=org.jboss.netty -DartifactId=netty -Dversion=3.2.4.Final -Dpackaging=jar -Dfile=..\tools_resources\external-lib\netty-3.2.3.Final\netty-3.2.3.Final.jar

echo Installing additional libraries for Consent

call mvn install:install-file -DgroupId=hibernate-commons-annotations -DartifactId=hibernate-commons-annotations -Dversion=3.0.0.GA -Dpackaging=jar -Dfile=..\tools_resources\external-lib\forConsent\hibernate-commons-annotations-3.0.0.GA.jar
call mvn install:install-file -DgroupId=sun-xacml -DartifactId=sunxacml-support -Dversion=2.0 -Dpackaging=jar -Dfile=..\tools_resources\external-lib\forConsent\sunxacml-support-2.0.jar
call mvn install:install-file -DgroupId=hibernate-entitymanager -DartifactId=hibernate-entitymanager -Dversion=3.3.1.GA -Dpackaging=jar -Dfile=..\tools_resources\external-lib\forConsent\hibernate-entitymanager-3.3.1.GA.jar
call mvn install:install-file -DgroupId=hibernate-annotations -DartifactId=hibernate-annotations -Dversion=3.3.0.GA -Dpackaging=jar -Dfile=..\tools_resources\external-lib\forConsent\hibernate-annotations-3.3.0.GA.jar
call mvn install:install-file -DgroupId=jboss -DartifactId=jboss-common-core -Dversion=2.2.0.GA -Dpackaging=jar -Dfile=..\tools_resources\external-lib\forConsent\jboss-common-core-2.2.0.GA.jar
call mvn install:install-file -DgroupId=apache-httpclient -DartifactId=commons-httpclient -Dversion=3.1 -Dpackaging=jar -Dfile=..\tools_resources\external-lib\forConsent\commons-httpclient-3.1.jar
call mvn install:install-file -DgroupId=sun-xacml -DartifactId=sun-xacml -Dversion=2.0 -Dpackaging=jar -Dfile=..\tools_resources\external-lib\forConsent\sun-xacml-2.0.jar
call mvn install:install-file -DgroupId=hibernate -DartifactId=hibernate3 -Dversion=3.2.4.SP1 -Dpackaging=jar -Dfile=..\tools_resources\external-lib\forConsent\hibernate3-3.2.4.SP1.jar
call mvn install:install-file -DgroupId=commons-logging -DartifactId=commons-logging -Dversion=1.1.0.jboss -Dpackaging=jar -Dfile=..\tools_resources\external-lib\forConsent\commons-logging-1.1.0.jboss.jar
call mvn install:install-file -DgroupId=org.wicket -DartifactId=wicket -Dversion=1.3.3 -Dpackaging=jar -Dfile=..\tools_resources\external-lib\wicket-1.3.3\wicket-1.3.3.jar

rem echo Installing additional libraries for Epsos

rem call mvn install:install-file -DgroupId=tr.com.srdc.epsos -DartifactId=epsos-util -Dversion=0.0.1-SNAPSHOT -Dpackaging=jar -Dfile=..\tools_resources\EPSOS_CONFIG\epsos-util-0.0.1-SNAPSHOT.jar
rem call mvn install:install-file -DgroupId=tr.com.srdc.epsos -DartifactId=epsos-data-model -Dversion=0.0.1-SNAPSHOT -Dpackaging=jar -Dfile=..\tools_resources\EPSOS_CONFIG\epsos-data-model-0.0.1-SNAPSHOT.jar
rem call mvn install:install-file -DgroupId=tr.com.srdc.epsos -DartifactId=epsos-security-man -Dversion=0.0.1-SNAPSHOT -Dpackaging=jar -Dfile=..\tools_resources\EPSOS_CONFIG\epsos-security-man-0.0.1-SNAPSHOT.jar
rem call mvn install:install-file -DgroupId=tr.com.srdc.epsos -DartifactId=epsos-xca-ws-client -Dversion=0.0.1-SNAPSHOT -Dpackaging=jar -Dfile=..\tools_resources\EPSOS_CONFIG\epsos-xca-ws-client-0.0.1-SNAPSHOT.jar

echo Installing the databases

call mvn install -DcreateDatabases=true -DinstallApacheAndMongo=true -Dmaven.test.skip=true -f ..\pom.xml
call mvn -o install -f ..\icardea-careplanengine\pom.xml -DafCareplan=true


echo 
echo Install the HL7 PCC related libraries (required by phrweb)
echo  

call mvn install:install-file  -Dfile=..\tools_resources\external-lib\for-phrs\QUPC_AR004040UV_Service.jar  -Dsource=..\tools_resources\external-lib\for-phrs\QUPC_AR004040UV_Service-sources.jar -DgroupId=org.hl7.v3 -DartifactId=QUPC_AR004040UV_Service -Dversion=0.1 -Dpackaging=jar
echo QUPC_AR004040UV_Service (binary and sources) was install

call mvn install:install-file  -Dfile=..\tools_resources\external-lib\for-phrs\QUPC_AR004030UV_Service.jar  -Dsource=..\tools_resources\external-lib\for-phrs\QUPC_AR004030UV_Service-sources.jar -DgroupId=org.hl7.v3 -DartifactId=QUPC_AR004030UV_Service -Dversion=0.1 -Dpackaging=jar
echo QUPC_AR004030UV_Service (binary and sources) was install

call ..\icardea-phrs\phrweb\package.bat
echo The phrweb was installed.


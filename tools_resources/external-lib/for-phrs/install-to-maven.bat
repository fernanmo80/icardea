cls

echo on

call mvn install:install-file  -Dfile=QUPC_AR004040UV_Service.jar  -Dsource=QUPC_AR004040UV_Service-sources.jar -DgroupId=org.hl7.v3 -DartifactId=QUPC_AR004040UV_Service -Dversion=0.1 -Dpackaging=jar -DgeneratePom=true
echo "QUPC_AR004040UV_Service was install"

call mvn install:install-file  -Dfile=QUPC_AR004030UV_Service.jar  -Dsource=QUPC_AR004030UV_Service-sources.jar -DgroupId=org.hl7.v3 -DartifactId=QUPC_AR004030UV_Service -Dversion=0.1 -Dpackaging=jar -DgeneratePom=true

echo "QUPC_AR00400UV_Service was install"

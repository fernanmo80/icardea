
rem this bash script is used to pack all the phrweb project in to an
rem singular war file. The location of the file is target/ directory. 

cls

del /s target

mkdir   target

tartool  zxf src\main\assembly\classes.tgz
move /y classes  target\classes\

mvn package -DskipTests=true


echo ""
echo "The phrs war file is ready."
echo ""

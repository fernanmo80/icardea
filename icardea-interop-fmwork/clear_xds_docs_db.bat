@echo off
if NOT DEFINED MONGO_HOME set MONGO_HOME=D:\local\mongodb-win32-i386-1.6.3
for /f "delims=" %%a in ('%MONGO_HOME%\bin\mongo localhost/xds -quiet -eval "db.docs.count()"') do @set delcount=%%a
echo You are going to delete %delcount% documents in the XDS database.
echo Are you sure? (press Ctrl-C otherwise)
pause
%MONGO_HOME%\bin\mongo localhost/xds -quiet -eval "db.docs.remove()"
echo Done!
pause

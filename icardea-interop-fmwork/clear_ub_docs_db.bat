@echo off
if NOT DEFINED MONGO_HOME set MONGO_HOME=D:\local\mongodb-win32-i386-1.6.3
for /f "delims=" %%a in ('%MONGO_HOME%\bin\mongo localhost/xds -quiet -eval "db.pcc.count()"') do @set delcount=%%a
echo You are going to delete %delcount% subscriptions in the Update Broker db.
echo Are you sure? (press Ctrl-C otherwise)
pause
%MONGO_HOME%\bin\mongo localhost/xds -quiet -eval "db.pcc.remove()"
echo Done! Don't forget to restart the Update Broker if it's running now..
pause


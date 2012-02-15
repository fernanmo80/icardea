@ECHO OFF

REM ============================
REM Set some path details
REM ============================
SET APP_START_DIR=%CD%
SET OLDPATH=%PATH%
SET PATH=%APP_START_DIR%;%PATH%


REM ============================
REM Set Java executable
REM ============================
SET JAVAEXE=java
IF /I "%1"=="hidden" SET JAVAEXE=javaw


REM ============================
REM Check if config directory 
REM exists and create it if not.
REM See also:
REM java .. -DAPPCONFIG_FILEPATH
REM ============================ 
IF NOT EXIST "%APP_START_DIR%\config\" (
   MD "%APP_START_DIR%\config"
)
IF NOT EXIST "%APP_START_DIR%\config\AppConfig.properties" (
   ECHO ERROR: The 'AppConfig.properties' file is missing!
   ECHO        Extract the default AppConfig.propierties from the
   ECHO        CIEDInformationSystem.jar [it's a ZIP-Archive] and
   ECHO        copy it to:
   ECHO        "%APP_START_DIR%\config\"
   PAUSE
   SET JAVA_APPCONFIG=
) ELSE (
   SET JAVA_APPCONFIG=-DAPPCONFIG_FILEPATH="%APP_START_DIR%\config"
)

REM ============================
REM Start the application
REM ============================ 
ECHO.
ECHO.
ECHO Starting iCARDEA 'CIED Information System' application...
ECHO    Calling: %JAVAEXE% -Xmx512M %JAVA_APPCONFIG% -jar CIEDInformationSystem.jar
ECHO.
%JAVAEXE% -Xmx512M %JAVA_APPCONFIG% -jar CIEDInformationSystem.jar
ECHO.
ECHO.
ECHO The iCARDEA 'CIED Information System' application has been stopped.
ECHO.

REM ===========================
REM Reset variables
REM ===========================
SET PATH=%OLDPATH%
PAUSE
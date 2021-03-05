@echo off
echo --------------------------------------
echo    SIMPLE CAMEL APP
echo --------------------------------------
echo.
echo Starting ...
call mvn -q compile exec:java -Dexec.mainClass="org.bhushan.test.App"
echo.

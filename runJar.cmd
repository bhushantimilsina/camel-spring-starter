@echo off
echo --------------------------------------
echo    SIMPLE CAMEL APP
echo --------------------------------------
echo.
echo Building ...
call mvn -q -DskipTests=true clean package

:: Copy required inbox\inputFile.txt to target
md .\target\inbox
copy .\inbox\inputFile.txt .\target\inbox
echo Starting ...
cd target
java -jar camel-simple-app-1.0-executable-jar.jar
cd ..
echo.


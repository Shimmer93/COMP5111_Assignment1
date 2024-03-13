ECHO OFF

SET DIR=%~dp0
SET ROOT_DIR="%DIR%\.."
cd "%ROOT_DIR%"

if not exist "%ROOT_DIR%\raw-classes" (
    mkdir "%ROOT_DIR%\raw-classes"
)

:: 1. we compile the class under test castle.comp5111.example.Subject
echo "compiling comp5111.assignment.cut.Subject ..."
javac -g -d "%ROOT_DIR%\raw-classes" "%ROOT_DIR%\src\main\java\comp5111\assignment\cut\Subject.java"

:: 2. we compile the classes to instrument Subject and count invocations using soot
echo "compiling instrumentation classes ..."
if not exist "%ROOT_DIR%\target\classes" (
    mkdir "%ROOT_DIR%\target\classes"
)
javac -classpath ".;%CLASSPATH%;%ROOT_DIR%\lib\*" -d "%ROOT_DIR%\target\classes"^
    "%ROOT_DIR%"\src\main\java\comp5111\assignment\cut\*.java

:: 3. we run the main method of castle.comp5111.example.EntryPoint
java -classpath ".;%CLASSPATH%;%ROOT_DIR%\lib\*;%ROOT_DIR%\target\classes;%ROOT_DIR%\target\test-classes" comp5111.assignment.Assignment1 1 comp5111.assignment.cut.RegressionTest -process-dir "%ROOT_DIR%\raw-classes"
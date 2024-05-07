ECHO OFF

SET DIR=%~dp0
SET ROOT_DIR="%DIR%\.."
cd "%ROOT_DIR%"

if not exist "%ROOT_DIR%\raw-classes" (
    mkdir "%ROOT_DIR%\raw-classes"
)
if not exist "%ROOT_DIR%\target\classes" (
    mkdir "%ROOT_DIR%\target\classes"
)
if not exist "%ROOT_DIR%\target\test-classes" (
    mkdir "%ROOT_DIR%\target\test-classes"
)

FOR %%C IN (Subject_evosuite33_refined_ESTest, Subject_evosuite66_refined_ESTest, Subject_evosuite67_refined_ESTest, Subject_randoop10_refined_RegressionTest0, Subject_randoop990021_refined_RegressionTest0, Subject_randoop990044_refined_RegressionTest0) DO (

    :: 1. we compile the class under test castle.comp5111.example.Subject
    echo "compiling comp5111.assignment.cut.Subject ..."
    javac -g -d "%ROOT_DIR%\raw-classes" "%ROOT_DIR%\src\main\java\comp5111\assignment\cut\Subject.java"

    :: 2. we compile the classes to instrument Subject and count invocations using soot
    echo "compiling instrumentation classes ..."
    javac -classpath ".;%CLASSPATH%;%ROOT_DIR%\lib\*" -d "%ROOT_DIR%\target\classes"^
        "%ROOT_DIR%\src\main\java\comp5111\assignment\Counter.java"^
        "%ROOT_DIR%\src\main\java\comp5111\assignment\Instrumenter.java"^
        "%ROOT_DIR%\src\main\java\comp5111\assignment\Assignment2.java"

    :: 3. we compile the test classes
    echo "compiling test classes ..."
    javac -classpath ".;%CLASSPATH%;%ROOT_DIR%\lib\*;%ROOT_DIR%\raw-classes;%ROOT_DIR%\target\classes" -d "%ROOT_DIR%\target\test-classes"^
        "%ROOT_DIR%\src\test\refined-evosuite0\comp5111\assignment\cut\*.java"^
        "%ROOT_DIR%\src\test\refined-evosuite1\comp5111\assignment\cut\*.java"^
        "%ROOT_DIR%\src\test\refined-evosuite2\comp5111\assignment\cut\*.java"^
        "%ROOT_DIR%\src\test\refined-randoop0\comp5111\assignment\cut\*.java"^
        "%ROOT_DIR%\src\test\refined-randoop1\comp5111\assignment\cut\*.java"^
        "%ROOT_DIR%\src\test\refined-randoop2\comp5111\assignment\cut\*.java"

    :: 4. we run the main method of castle.comp5111.example.EntryPoint
    java -classpath ".;%CLASSPATH%;%ROOT_DIR%\lib\*;%ROOT_DIR%\raw-classes;%ROOT_DIR%\target\classes;%ROOT_DIR%\target\test-classes" comp5111.assignment.Assignment2 comp5111.assignment.cut.%%C -process-dir "%ROOT_DIR%\raw-classes"

)

@REM java -classpath ".;%CLASSPATH%;%ROOT_DIR%\lib\*;%ROOT_DIR%\target\classes;%ROOT_DIR%\target\test-classes"^
@REM     comp5111.assignment.Assignment2 comp5111.assignment.cut.Subject_1_Test -process-dir "%ROOT_DIR%\raw-classes"

@REM java -classpath ".;%CLASSPATH%;%ROOT_DIR%\lib\*;%ROOT_DIR%\target\classes;%ROOT_DIR%\target\test-classes"^
@REM     comp5111.assignment.Assignment2 comp5111.assignment.cut.Subject_2_Test -process-dir "%ROOT_DIR%\raw-classes"

@REM java -classpath ".;%CLASSPATH%;%ROOT_DIR%\lib\*;%ROOT_DIR%\target\classes;%ROOT_DIR%\target\test-classes"^
@REM     comp5111.assignment.Assignment2 comp5111.assignment.cut.Subject_3_Test -process-dir "%ROOT_DIR%\raw-classes"

@REM java -classpath ".;%CLASSPATH%;%ROOT_DIR%\lib\*;%ROOT_DIR%\target\classes;%ROOT_DIR%\target\test-classes"^
@REM     comp5111.assignment.Assignment2 comp5111.assignment.cut.Subject_4_Test -process-dir "%ROOT_DIR%\raw-classes"
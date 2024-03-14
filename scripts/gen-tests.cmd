ECHO OFF

SET DIR=%~dp0
SET ROOT_DIR="%DIR%\.."
cd "%ROOT_DIR%"

if not exist "%ROOT_DIR%\raw-classes" (
    mkdir "%ROOT_DIR%\raw-classes"
)

javac -g -d "%ROOT_DIR%\raw-classes" "src\main\java\comp5111\assignment\cut\Subject.java"

java -ea -classpath "lib\randoop-all-4.3.1.jar;raw-classes" randoop.main.Main gentests --testclass=comp5111.assignment.cut.Subject^
    --time-limit=60 --junit-package-name=comp5111.assignment.cut --junit-output-dir=./src/test/randoop0 --regression-test-basename=Regression_0_Test --randomseed=0

java -ea -classpath "lib\randoop-all-4.3.1.jar;raw-classes" randoop.main.Main gentests --testclass=comp5111.assignment.cut.Subject^
    --time-limit=60 --junit-package-name=comp5111.assignment.cut --junit-output-dir=./src/test/randoop1 --regression-test-basename=Regression_1_Test --randomseed=1

java -ea -classpath "lib\randoop-all-4.3.1.jar;raw-classes" randoop.main.Main gentests --testclass=comp5111.assignment.cut.Subject^
    --time-limit=60 --junit-package-name=comp5111.assignment.cut --junit-output-dir=./src/test/randoop2 --regression-test-basename=Regression_2_Test --randomseed=2

java -ea -classpath "lib\randoop-all-4.3.1.jar;raw-classes" randoop.main.Main gentests --testclass=comp5111.assignment.cut.Subject^
    --time-limit=60 --junit-package-name=comp5111.assignment.cut --junit-output-dir=./src/test/randoop3 --regression-test-basename=Regression_3_Test --randomseed=3

java -ea -classpath "lib\randoop-all-4.3.1.jar;raw-classes" randoop.main.Main gentests --testclass=comp5111.assignment.cut.Subject^
    --time-limit=60 --junit-package-name=comp5111.assignment.cut --junit-output-dir=./src/test/randoop4 --regression-test-basename=Regression_4_Test --randomseed=4
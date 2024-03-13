ECHO OFF

javac "src\main\java\comp5111\assignment\cut\Subject.java" -d target\classes -g
java -ea -classpath "lib\randoop-all-4.3.1.jar;target\classes" randoop.main.Main gentests --testclass=comp5111.assignment.cut.Subject^
    --time-limit=60 --junit-package-name=comp5111.assignment.cut --junit-output-dir=./src/test/randoop3 --regression-test-basename=Regression_3_Test --randomseed=3
ECHO OFF

SET DIR=%~dp0
SET ROOT_DIR="%DIR%\.."
cd "%ROOT_DIR%"

if not exist "%ROOT_DIR%\raw-classes" (
    mkdir "%ROOT_DIR%\raw-classes"
)

javac -g -d "%ROOT_DIR%\raw-classes" "src\main\java\comp5111\assignment\cut\Subject.java"

java -jar "%ROOT_DIR%\lib\evosuite-1.2.0.jar" -class comp5111.assignment.cut.Subject -projectCP "%ROOT_DIR%\raw-classes" -Dsearch_budget=3000 -criterion branch -Dtest_dir="%ROOT_DIR%\src\test\evosuite0" -Dreport_dir="%ROOT_DIR%\src\test\evosuite0" -Djunit_suffix=_0_Test -Drandom_seed=5

java -jar "%ROOT_DIR%\lib\evosuite-1.2.0.jar" -class comp5111.assignment.cut.Subject -projectCP "%ROOT_DIR%\raw-classes" -Dsearch_budget=3000 -criterion branch -Dtest_dir="%ROOT_DIR%\src\test\evosuite1" -Dreport_dir="%ROOT_DIR%\src\test\evosuite1" -Djunit_suffix=_1_Test -Drandom_seed=1

java -jar "%ROOT_DIR%\lib\evosuite-1.2.0.jar" -class comp5111.assignment.cut.Subject -projectCP "%ROOT_DIR%\raw-classes" -Dsearch_budget=3000 -criterion branch -Dtest_dir="%ROOT_DIR%\src\test\evosuite2" -Dreport_dir="%ROOT_DIR%\src\test\evosuite2" -Djunit_suffix=_2_Test -Drandom_seed=2

java -jar "%ROOT_DIR%\lib\evosuite-1.2.0.jar" -class comp5111.assignment.cut.Subject -projectCP "%ROOT_DIR%\raw-classes" -Dsearch_budget=3000 -criterion branch -Dtest_dir="%ROOT_DIR%\src\test\evosuite3" -Dreport_dir="%ROOT_DIR%\src\test\evosuite3" -Djunit_suffix=_3_Test -Drandom_seed=3

java -jar "%ROOT_DIR%\lib\evosuite-1.2.0.jar" -class comp5111.assignment.cut.Subject -projectCP "%ROOT_DIR%\raw-classes" -Dsearch_budget=3000 -criterion branch -Dtest_dir="%ROOT_DIR%\src\test\evosuite4" -Dreport_dir="%ROOT_DIR%\src\test\evosuite4" -Djunit_suffix=_4_Test -Drandom_seed=4
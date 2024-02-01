# HKUST COMP5111 (2024Spring) Assignment 1

## Deadline: 11:55 pm 16 March 2024

## Update:
(Feb 1): Release the [tutorial workshop slide (preview version)](tutorials/COMP5111_24S_workshop_songqiang_Feb1_ForStuPreview.pdf). *You are highly recommended to preview the slide (and play with the tools if interested) before the tutorial on Feb 14.*

## Assignment Objective

In assignment 1, you are expected to: 
1. Generate test cases using Randoop (Task 1); 
2. Use EclEmma to measure test coverage (Task 1);
3. Build a test coverage tool with Soot (Tasks 2 & 3);
4. Explore the usefulness of GenAI in test preparation (Task 4).

*We have prepared a tutorial to brief you on this assignment. Note that the tutorial may not have covered all required Soot APIs. You may need to pick up some APIs by yourself.*

### Having Questions?
1. If you have questions, please first check our [FAQ](Assignment1_FAQ.md). 
2. If your problem is not solved, you are recommended to create `Issues` in this repository.
   Issues shall be attended to by the TA within 24 hrs. You are highly encouraged to start early to accommodate unexpected uncertainties arising from hardware and software.
3. If you want to discuss with other classmates, you can go to `Discussions` in this repository. 
   This repository is `ONLY` for the programming assignment. Note that assignments must be individual work.
   Note: Your reading reports and related discussions for the reading assignment should be made on CANVAS.
3. If you don't want your question to be visible to other classmates, you can send an email to the TA. 

## Assignment Materials

### Class Under Test

Please download/fork the project in this repo, which we have prepared for this assignment.

The project contains a Java Class under test (CUT), `comp5111.assignment.cut.Subject`, residing in `src/main/java/`.

You need to generate test suites for this program and measure the corresponding test coverage, i.e., the percentages of statements/branches/lines of this program covered by the generated tests.

**Note that all `inner classes` of CUT should be included in the test.**

The CUT program that we prepared is buggy. You do not need to locate the bugs in Assignment 1. The task of bug localization will be covered in Assignment 2.

### Platform

Assignment 1 requires the use of Eclipse IDE and command lines with Java 11 (SE).

The following environment and library versions are recommended.

#### Environment
- Linux / MacOS / Windows
- Java 11 (SE)
- Eclipse 2023-12
  
#### Libraries
- [Randoop 4.3.1](https://github.com/randoop/randoop/releases/download/v4.3.1/randoop-4.3.1.zip)
- [Soot 4.2.1](https://repo1.maven.org/maven2/org/soot-oss/soot/4.2.1/soot-4.2.1-jar-with-dependencies.jar)
- [JUnit 4.12](https://repo1.maven.org/maven2/junit/junit/4.12/junit-4.12.jar), with [hamcrest-1.3](https://repo1.maven.org/maven2/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar) (only needed if you get errors)

If you use `maven`, these dependencies have already been declared in `pom.xml`. In case you want to use `jar` file of the libraries directly, we have already included them in `lib/`.

## Assignment Tasks

### Task 1: Test case generation and Code coverage measurement (26%)

You are expected to finish 2 subtasks.

### Task 1.1: To learn how to use Randoop for unit test generation.

Randoop is a tool to generate JUnit test suites.
A short tutorial about Randoop is available [here](./tutorials/randoop.md), including how to use Randoop to generate unit tests, and execute them using Eclipse.

#### Requirements: 
1. You need to use Randoop to generate **5 different test suites** for the given program.
2. Each test suite must achieve at least 40% statement coverage.
3. The 5 test suites should be different from each other. Randoop parameter `--randomseed` may be helpful.
4. The package name of generated test suites should be `comp5111.assignment.cut`. Randoop parameter `--junit-package-name` may be helpful.
5. The 5 test suites should be put in `src/test/randoop<i>` for the `<i>`th test suite, where `0<=i<=4`. Randoop parameter `--junit-output-dir` may be helpful.

#### Submissions: 
Submit the 5 test suites generated by you, i.e., the folders `randoop0`, `randoop1`, `randoop2`, `randoop3`, and `randoop4` in `src/test`. 

#### Grading Scheme:
Each test suite accounts for `2%` if it can be successfully executed.

### Task 1.2: To learn how to use EclEmma for code coverage measurement.

EclEmma is a bundled Eclipse plugin to measure code coverage. A tutorial is available [here](./tutorials/eclipse_eclemma.md).

#### Requirements:
1. Please use EclEmma to measure the coverage of each of the 5 submitted test suites generated by Randoop.

#### Submissions:
For **each test suite**, please submit a screenshot showing the `instruction coverage`, and a screenshot for `branch coverage`. 
In total, you are expected to submit a folder containing **10 screenshots**.
Each screenshot should be properly named to identify the corresponding instruction coverage or branch coverage.

#### Grading Scheme: 
Each screenshot accounts for `1.6%` if the values in the screenshot are correct.


### Task 2: Statement coverage measurement using Soot (25%)

Soot is a framework for analyzing and transforming Java programs.
We have prepared a tutorial about Soot, [here](./tutorials/soot.md). Answers to some common questions are available, [here](Assignment1_FAQ.md).

For Tasks 2 and 3, you may take reference of an [example test suite](./src/test/example_test) along with its [statement coverage](./src/test/example_test/TA-stmt.txt) and [branch coverage](./src/test/example_test/TA-branch.txt) collected by our implementation using Soot. You can run your program on this example test suite and crosscheck the coverage results with ours, coverage reported by your tool should be close to ours.

#### Requirements:
1. Use Soot to instrument the given CUT to measure the statement coverage of tests.
   By statements, we refer to `Jimple statement`, which is an intermediate representation of Java program in Soot.

#### Notes:
- You may consider leveraging Soot to insert a piece of code before or after each statement in Java bytecode.
When the unit tests are running, the inserted code logs if the associated bytecode is executed. As such, your tool should be able to report the statement coverage achieved by a test suite.
- When instrumenting the CUT, **you are required to skip the `JIdentityStmt`**. Please refer to [FAQ Q3](./Assignment1_FAQ.md#3-why-we-got-the-exception-javalangruntimeexception-param-assignment-statements-should-precede-all-non-identity-statements-) on why we need to skip the `JIdentityStmt` and the hint on how to skip it.
- To validate the correctness of your statement coverage report, you can crosscheck it with the report generated by EclEmma. The coverage reported by your tool should be close to that reported by EclEmma for *most of the classes* in the CUT.

#### Program Output Requirement:
Your program needs to generate a report file, which **at least contains the following information**:

1. The coverage of each statement (statement code, yes or no).
2. The statement coverage for each class (percentage), **including the inner classes**.

#### Submissions:
1. You may put your source code under `comp5111.assignment` package in `src/main/java` folder.
2. You are recommended to use Java build tools to manage your project, e.g., maven, or gradle.
3. **Please prepare useful scripts and readme files in the project root**, containing instructions on how to run your implementation of **each task**.
4. A file showing the differences of the percentage (coverage for all classes) report by your tool and EclEmma, for **all coverage criteria** you implemented. *Note that: minor differences are allowed.*
5. You need to measure all the five submitted test suites.
6. Advice: You are highly encouraged to maintain your code in a `private` repository at Github. It provides a backup of your code in case your computer crashes and allows us to retrieve code from your GitHub repository in case of submission errors. Such incidents did happen in the past.

#### Grading Scheme:
- `15%` if your soot-based program can successfully instrument the code and report the coverage.
- `10%` if the results by your code are correct.


### Task 3: Branch coverage measurement using Soot (25%)

#### Requirements:
1. Use Soot to instrument the given CUT to measure `branch coverage` of tests.

#### Notes:
- The implementation is similar to that of task 2. While we insert code for **each statement** in task 2, we insert code for **each branch** in task 3.
- You may reuse your code in task 2.

#### Program Output Requirement:
Your program needs to generate a report file, which **at least contains the following info**:

1. The coverage of each branch (branch code, yes or no).
2. The branch coverage for each class (percentage), **including the inner classes**.

#### Submissions:
(Same to Task 2.)

#### Grading Scheme:
- `15%` if your program can successfully instrument the program and report the coverage.
- `10%` if the results reported by your code are correct. 


### Task 4: Exploring the usefulness of Generative AI (24% + 10% bonus)

#### Requirements:
1. Explore the usefulness of GenAI (LLMs like GPT, Gemini, and CodeLlama.) in each of the above three tasks (i.e., test case generation, and statement and branch coverage measurements).
2. Write a report to record an effective prompt and discuss the findings on this prompt for **each of the three previous tasks**. An effective prompt should offer better performance than that achieved by the Baseline Prompt below.

#### Notes:
- For each task, you may explore various prompting and record the **best prompting strategy**. Note that:
  1. You can report **only one series of** prompts as the final prompting strategy for each task. "A series" means that for each task, after giving the LLM the first prompt, you can design follow-up prompts for the LLM based on its response if needed.
  2. A series of prompts for one task contains **at most three correlated prompts**, organized in some context-aware way, e.g., Chain-of-Thoughts. Note that you are *not allowed* to submit several individual prompts for *the same goal* (e.g., you should *not* submit three prompts that all ask LLMs for tests but in different querying styles).
  3. The prompts can be based on in-context learning that includes few-shot examples and a chain of thoughts.
- There should be (around) 100-400 illustrative words (not counting codes) and appropriate images in the finding **for each task (and bonus task)**. The exploration subjects that you can try and report include:
  1. For Task 1, you may design a series of effective prompts for **one LLM** to generate test cases for some methods (no need for all) in `Subject.java` (do not change the method). The finding can be the observed strengths (and weaknesses) of LLMs along with the justification for the effectiveness of LLMs for this task, e.g., the proportion of compilable tests generated by the LLM, the proportion of tests with correct assertions, and the proportion of fault-triggering tests. (***Bonus Discussion (5%):*** You are encouraged to put down the advice in designing an effective prompt for this task.)
  2. For either task 2 or task 3 or none, you may design a series of effective prompts for **one LLM** to measure (estimate) the corresponding coverage. Then, discuss the experience to write a prompt that leads to an accurate coverage estimation. (Note that you are **not allowed** to choose this subject for BOTH tasks 2 and 3.)
  3. For tasks 2 and 3 (either one or both), you can design a series of effective prompts for **one LLM** to enhance the corresponding coverage of some tests generated in Task 1, for some methods (no need for all) in `Subject.java`. (Note that you should NOT submit any LLM-generated test in Task 1.) The finding can be the observed strengths (and weaknesses) of LLMs along with the justification for the improvement on the tests, i.e., the coverage difference between the original tests generated by Randoop and the ones improved by LLMs. (***Bonus Discussion (5%):*** You are encouraged to put down the advice in designing an effective prompt for the tasks.)
  4. For each task, you may also design a series of effective prompts to drive **at least three** LLMs, and then compare and discuss their performance. Two bonus tasks are also valid if you choose this exploration subject.
- Baseline Prompt (for reference):
```text
[Task 1]

Prompt Strategy: I use 2 prompts in a chain of thoughts.
I: Generate five diverse failing unit tests with assert statements for the following function: public int getIndex(final String exp) {<omit code>}
LLM: xxxxxx.
I: Explain and validate the assertion in your generated tests. Revise it if you find it not good.
LLM: yyyyyy.

Findings:
I found HKUST GPT3.5 effective for test generation when appropriate information about P and Q is given. For example, (explanation)... I also found its limitations on ...
The 3 tests generated by HKUST GPT3.5 are XXX, YYY, ZZZ.
Compilable tests: XXX, YYY. (The issue of ZZZ is ...)
Test with a correct assertion: XXX. (The issue of YYY is ...)

Advice:
Developers should contain info on A, B, and C in the prompt for compilable/effective tests. For example, when I add A, LLMs ... 
CoT is also found useful. For example, ...

[Task 2]
Prompt Strategy: I use 1 zero-shot prompt, which I found effective enough.
What is the statement coverage of applying the following test test003 on function getIndex? 
Code:
public int getIndex(final String exp) {<omit code>}
public void test003() throws Throwable {<omit code>}
...(omit)...

[Task 3]
Prompt Strategy: I use 1 zero-shot prompt, which I found effective enough.
What is the branch coverage of applying the following test test003 on function getIndex? 
Code:
public int getIndex(final String exp) {<omit code>}
public void test003() throws Throwable {<omit code>}
...(omit)...
```

#### Submissions:
Submit a `pdf` file as your report, following the content format illustrated by the above example. 
Name the report as `Task4_Report.pdf` and put it under the root folder of your submission.

#### Grading Scheme:
- `3%` for each prompt, `9%` in total.
- `5%` for the quality of each discussion, `15%` in total. Score will be earned if the justification concretely demonstrates the ability of LLMs in the according task, or clearly reflects the limitation of LLMs with rationale discussion.
- `5%` for the quality of each bonus discussion, `10%` in total. Score will be earned if the advice is concretely and clearly presented and indeed insightful and actionable. Bonus point policy can be found in our course website.

---

## Assignment 1 Submission

- You are required to submit your assignment to [Canvas](https://canvas.ust.hk/courses/54699/assignments).
- Please put all your code, screenshots, readme, and so on into a single folder and compress it to `comp5111asn1.zip`

**The *recommended* folder structure is:**

1. Put your code into `${PROJECT_ROOT}/src/main/java/`
2. If you do not use Java build tools, put the libraries jar files that your code depends on into `${PROJECT_ROOT}/lib/`
3. Put your running scripts under `${PROJECT_ROOT}/scripts`
4. Put your screenshot into `${PROJECT_ROOT}/screenshots`
5. Put the test suites generated by you into `${PROJECT_ROOT}/src/test/randoop[0-4]`
6. Put the report at `${PROJECT_ROOT}/Task4_Report.pdf`.

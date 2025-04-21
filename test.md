#Test
- [What is the difference between integration and unit tests?](#what-is-the-difference-between-integration-and-unit-tests)
- [Unit test executes code from 2 classes, is it correct? Is it unit or integration test?](#unit-test-executes-code-from-2-classes-is-it-correct-is-it-unit-or-integration-test)
- [What can be used for unit tests?](#what-can-be-used-for-unit-tests)
- [What is better to use randomized or hardcode data for unit tests?](#what-is-better-to-use-randomized-or-hardcode-data-for-unit-tests)
- [Is it possible to test the architecture of application?](#is-it-possible-to-test-the-architecture-of-application)
- [Does TDD include integration tests?](#does-tdd-include-integration-tests)
- [Is it good practice to check in tests that non-state-changing methods were called?](#is-it-good-practice-to-check-in-tests-that-non-state-changing-methods-were-called)
- [The differences between Spy and Mock in Mockito?](#the-differences-between-spy-and-mock-in-mockito)
- [Is it good practice to use in-memory db for tests?](#is-it-good-practice-to-use-in-memory-db-for-tests)
- [Mockito: doReturn vs thenReturn?](#mockito-doreturn-vs-thenreturn)
- [How would you assess the quality and effectiveness of unit tests in a Java codebase? Can you explain what mutation testing is and how tools like PIT can help?](#how-would-you-assess-the-quality-and-effectiveness-of-unit-tests-in-a-java-codebase-can-you-explain-what-mutation-testing-is-and-how-tools-like-pit-can-help)

## What is the difference between integration and unit tests?
A ***unit test*** is a test written by the programmer to verify that a relatively small piece of code is doing what it is intended to do. They are narrow in scope, they should be easy to write and execute, and their effectiveness depends on what the programmer considers to be useful. The tests are intended for the use of the programmer, they are not directly useful to anybody else, though, if they do their job, testers and users downstream should benefit from seeing fewer bugs.

Part of being a unit test is the implication that things outside the code under test are mocked or stubbed out. Unit tests shouldn't have dependencies on outside systems. They test internal consistency as opposed to proving that they play nicely with some outside system.

An ***integration test*** is done to demonstrate that different pieces of the system work together. Integration tests can cover whole applications, and they require much more effort to put together. They usually require resources like database instances and hardware to be allocated for them. The integration tests do a more convincing job of demonstrating the system works (especially to non-programmers) than a set of unit tests can, at least to the extent the integration test environment resembles production.

Actually "integration test" gets used for a wide variety of things, from full-on system tests against an environment made to resemble production to any test that uses a resource (like a database or queue) that isn't mocked out. At the lower end of the spectrum an integration test could be a junit test where a repository is exercised against an in-memory database, toward the upper end it could be a system test verifying applications can exchange messages.
###### Relative links:
- https://stackoverflow.com/questions/5357601/whats-the-difference-between-unit-tests-and-integration-tests

## Unit test executes code from 2 classes, is it correct? Is it unit or integration test?
In general, I would say that it's unit tests but with requirements:
- test executes the logic from one module;
- test checks only one scenario (in the nested execution there is no branching).

## What can be used for unit tests?
**JUnit** and **TestNG** are the main unit test frameworks.
###### Relative links:
- https://stackoverflow.com/questions/4055957/what-are-the-unit-testing-frameworks-available-in-java

## What is better to use randomized or hardcode data for unit tests?
Avoid randomized data as it can lead to toggling tests which can be hard to debug and omit error messages that make tracing the error back to the code harder.

Instead, use fixed values for everything. They will create highly reproducible tests, which are easy to debug and create error messages that can be easily traced back to the relevant line of code.
###### Relative links:
- https://phauer.com/2019/modern-best-practices-testing-java/

## Is it possible to test the architecture of application?
Yes, ArchUnit as example. It does not test your code flow or business logic. The library lets you test your “architecture” including class dependencies, cyclic dependencies, layer accesses, naming conventions, and inheritance checking.
###### Relative links:
- https://www.freecodecamp.org/news/java-archunit-testing-the-architecture-a09f089585be/
- https://github.com/TNG/ArchUnit

## Does TDD include integration tests?
###### Relative links:
- https://stackoverflow.com/questions/18988040/does-tdd-include-integration-tests

## Is it good practice to check in tests that non-state-changing methods were called?
###### Relative links:
- https://testing.googleblog.com/2017/12/testing-on-toilet-only-verify-state.html

## The differences between Spy and Mock in Mockito?
When Mockito creates a mock – it does so from the Class of a Type, not from an actual instance. The mock simply creates a bare-bones shell instance of the Class, entirely instrumented to track interactions with it.

On the other hand, the spy will wrap an existing instance. It will still behave in the same way as the normal instance – the only difference is that it will also be instrumented to track all the interactions with it.
###### Relative links:
- https://www.baeldung.com/mockito-spy

## Is it good practice to use in-memory db for tests?
###### Relative links:
- https://phauer.com/2017/dont-use-in-memory-databases-tests-h2/

## Mockito doReturn vs thenReturn?
###### Relative links:
- http://sangsoonam.github.io/2019/02/04/mockito-doreturn-vs-thenreturn.html

## How would you assess the quality and effectiveness of unit tests in a Java codebase? Can you explain what mutation testing is and how tools like PIT can help?
One effective way to assess the quality of unit tests in Java is through **mutation testing**, which checks whether tests can detect intentional defects. A commonly used tool for this is **PIT (Pitest)**. PIT works by introducing small changes (mutations) to the production code—like flipping conditions or modifying operators—and then running the existing tests. If the tests fail, the mutation is “killed.” If not, it indicates a possible gap in the test’s effectiveness. This approach goes beyond traditional code coverage, focusing on how well tests catch real issues.
###### Relative links:
- https://pitest.org/

[Home Page](README.md)

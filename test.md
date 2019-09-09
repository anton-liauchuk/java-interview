#Test
- [отличия интеграционных от unit тестов?](#отличия-интеграционных-от-unit-тестов)
- [unit тест тестирует 2 класса, это правильно? это unit или интеграционный тест?](#unit-тест-тестирует-2-класса-это-правильно-это-unit-или-интеграционный-тест)
- [что можно использовать для unit tests?](#что-можно-использовать-для-unit-tests)

## отличия интеграционных от unit тестов?
A ***unit test*** is a test written by the programmer to verify that a relatively small piece of code is doing what it is intended to do. They are narrow in scope, they should be easy to write and execute, and their effectiveness depends on what the programmer considers to be useful. The tests are intended for the use of the programmer, they are not directly useful to anybody else, though, if they do their job, testers and users downstream should benefit from seeing fewer bugs.

Part of being a unit test is the implication that things outside the code under test are mocked or stubbed out. Unit tests shouldn't have dependencies on outside systems. They test internal consistency as opposed to proving that they play nicely with some outside system.

An ***integration test*** is done to demonstrate that different pieces of the system work together. Integration tests can cover whole applications, and they require much more effort to put together. They usually require resources like database instances and hardware to be allocated for them. The integration tests do a more convincing job of demonstrating the system works (especially to non-programmers) than a set of unit tests can, at least to the extent the integration test environment resembles production.

Actually "integration test" gets used for a wide variety of things, from full-on system tests against an environment made to resemble production to any test that uses a resource (like a database or queue) that isn't mocked out. At the lower end of the spectrum an integration test could be a junit test where a repository is exercised against an in-memory database, toward the upper end it could be a system test verifying applications can exchange messages.
###### Relative links:
- https://stackoverflow.com/questions/5357601/whats-the-difference-between-unit-tests-and-integration-tests

## unit тест тестирует 2 класса, это правильно? это unit или интеграционный тест?
В общем случае, я бы сказал что unit тест может считаться таковым даже если есть реальные вызовы зависимостей, но при условии что это :
А. Происходит в рамках одного и того же бизнес-домена (модуля)
Б. Тестирует один сценарий (т. е. во вложенном вызове нету вевтвлений) 

## что можно использовать для unit tests?
JUnit and TestNG are the main unit test frameworks.
###### Relative links:
- https://stackoverflow.com/questions/4055957/what-are-the-unit-testing-frameworks-available-in-java


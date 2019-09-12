# Java interview questions
This repository contains interview questions for Java developers.

# Table of Contents
+ [Core](#Core)
+ [Collections](#Collections)
+ [Concurrency](#Concurrency)
+ [Spring](#Spring)
+ [Servlet](#Servlet)
+ [Hibernate](#Hibernate)
+ [Git](#Git)
+ [Maven](#Maven)
+ [Microservices](#Microservices)
+ [JavaScript](#JavaScript)
+ [Linux](#Linux)
+ [Algorithms](#Algorithms)
+ [Patterns](#Patterns)
+ [React](#React)
+ [REST](#REST)
+ [SQL](#SQL)
+ [Test](#Test)
+ [Transactions](#Transactions)

## Core
- [What's new in Java 8?](core.md#whats-new-in-java-8)
- [What is the main difference between Stream API and Collection?](core.md#what-is-the-main-difference-between-stream-api-and-collection)
- [What are the memory types in Java?](core.md#what-are-the-memory-types-in-java)
- [What is java agent?](core.md#what-is-java-agent)
- [Possible Performance Tools for Java?](core.md#possible-performance-tools-for-java)
- [What is java profiler?](core.md#what-is-java-profiler)
- [What is stop the world?](core.md#what-is-stop-the-world)
- [What is the difference between int, Integer and AtomicInteger?](core.md#what-is-the-difference-between-int-integer-and-atomicinteger)
- [How i++ will work for Integer?](core.md#how-i-will-work-for-integer)
- [What can you say about interface constants?](core.md#what-can-you-say-about-interface-constants)
- [What is the contract between equals and hashcode?](core.md#what-is-the-contract-between-equals-and-hashcode)
- [What are the rules for overriding equals/hashcode methods?](core.md#what-are-the-rules-for-overriding-equalshashcode-methods)
- [Are the same fields needed for equals/hashcode implementation?](core.md#are-the-same-fields-needed-for-equalshashcode-implementation)
- [What are the purposes of inner classes?](core.md#what-are-the-purposes-of-inner-classes)
- [What is better interfaces or abstract classes?](core.md#what-is-better-interfaces-or-abstract-classes)
- [Do inner classes have access to private fields from outer class?](core.md#do-inner-classes-have-access-to-private-fields-from-outer-class)
- [What are the differences between static nested classes and non-static nested classes?](core.md#what-are-the-differences-between-static-nested-classes-and-non-static-nested-classes)
- [What should be avoided in parallel stream?](core.md#what-should-be-avoided-in-parallel-stream)
- [What are the methods of Object class?](core.md#what-are-the-methods-of-object-class)
- [What is Jmeter?](core.md#what-is-jmeter)
- [Possible Ways to Capture Java Heap Dumps?](core.md#possible-ways-to-capture-java-heap-dumps)

## Collections
- [What is the complexity for get in Hashmap?](collections.md#what-is-the-complexity-for-get-in-hashmap)
- [What is the complexity for get in Hashmap for keys with hashcode = 1?](collections.md#what-is-the-complexity-for-get-in-hashmap-for-keys-with-hashcode--1)
- [What is the hierarchy of collections?](collections.md#what-is-the-hierarchy-of-collections)
- [What is the difference between LinkedList and ArrayList?](collections.md#what-is-the-difference-between-linkedlist-and-arraylist)
- [What is better to use LinkedList or ArrayList?](collections.md#what-is-better-to-use-linkedlist-or-arraylist)
- [What is the implementation of HashMap?](collections.md#what-is-the-implementation-of-hashmap)
- [What are the implementations of Map?](collections.md#what-are-the-implementations-of-map)
- [What is the complexity of removing the last element from LinkedList?](collections.md#what-is-the-complexity-of-removing-the-last-element-from-linkedlist)
- [What are the differences between Set and Map?](collections.md#what-are-the-differences-between-set-and-map)
- [Possible maps in concurrency?](collections.md#possible-maps-in-concurrency)

## Concurrency
- [Методы wait/notify для чего используются?](concurrency.md#методы-waitnotify-для-чего-используются)
- [Where wait() can be used?](concurrency.md#where-wait-can-be-used)
- [What is the keyword synchronized?](concurrency.md#what-is-the-keyword-synchronized)
- [What is the keyword volatile?](concurrency.md#what-is-the-keyword-volatile)
- [How volatile is related to happens before?](concurrency.md#how-volatile-is-related-to-happens-before)
- [What are the concurrent collections?](concurrency.md#what-are-the-concurrent-collections)
- [What is CopyOnWriteArrayList?](concurrency.md#what-is-copyonwritearraylist)
- [What can you say about ConcurrentHashMap?](concurrency.md#what-can-you-say-about-concurrenthashmap)
- [What are the benefits of using ConcurrentHashMap over HashTable?](concurrency.md#what-are-the-benefits-of-using-concurrenthashmap-over-hashtable)
- [What is the synchronized access?](concurrency.md#what-is-the-synchronized-access)
- [What is the monitor for non-static synchronized method?](concurrency.md#what-is-the-monitor-for-non-static-synchronized-method)

## Spring
- [How make spring service thread-safe?](spring.md#how-make-spring-service-thread-safe)
- [What is bean?](spring.md#what-is-bean)
- [How bean gets into the container?](spring.md#how-bean-gets-into-the-container)
- [What are the possible bean scopes?](spring.md#what-are-the-possible-bean-scopes)
- [What is the difference @Service between @Component?](spring.md#what-is-the-difference-service-between-component)
- [How to call a method after bean initialization?](spring.md#how-to-call-a-method-after-bean-initialization)
- [What is the default scope?](spring.md#what-is-the-default-scope)
- [What is the prototype scope?](spring.md#what-is-the-prototype-scope)
- [What are the possible ways of Dependency Injection?](spring.md#what-are-the-possible-ways-of-dependency-injection)
- [Where better to use dependency injection via constructor? Where via setter?](spring.md#where-better-to-use-dependency-injection-via-constructor-where-via-setter)
- [How to catch the exceptions for controllers?](spring.md#how-to-catch-the-exceptions-for-controllers)
- [What is the difference between BeanFactory and FactoryBean?](spring.md#what-is-the-difference-between-beanfactory-and-factorybean)
- [What is the difference Spring and Spring Boot?](spring.md#what-is-the-difference-spring-and-spring-boot)
- [How to add own auto-configurations?](spring.md#how-to-add-own-auto-configurations)
- [Where can be stored the list of auto-configurations in META-INF?](spring.md#where-can-be-stored-the-list-of-auto-configurations-in-meta-inf)
- [What are the possible ways of configurations in Spring?](spring.md#what-are-the-possible-ways-of-configurations-in-spring)
- [What is the lookup method?](spring.md#what-is-the-lookup-method)
- [What is declarative transaction in Spring?](spring.md#what-is-declarative-transaction-in-spring)
- [What creates a proxy?](spring.md#what-creates-a-proxy)
- [Does @transactional method work in the case of execution in the same class?](spring.md#does-transactional-method-work-in-the-case-of-execution-in-the-same-class)

## Servlet
- [Что такое servlet api?](servlet.md#что-такое-servlet-api)
- [В чем разница между параметрами и аттрибутами?](servlet.md#в-чем-разница-между-параметрами-и-аттрибутами)
- [Жизненный цикл сервлета?](servlet.md#жизненный-цикл-сервлета)
- [Можно ли какой-то сервлет быстрее создать, чем другие?](servlet.md#можно-ли-какой-то-сервлет-быстрее-создать-чем-другие)
- [Что такое servlet mapping?](servlet.md#что-такое-servlet-mapping)

## Hibernate
- [Что значит attached/detached entity?](hibernate.md#что-значит-attacheddetached-entity)
- [Зачем нужен flush?](hibernate.md#зачем-нужен-flush)
- [Уровни кэша в hibernate?](hibernate.md#уровни-кэша-в-hibernate)
- [Где находится кэш первого уровня?](hibernate.md#где-находится-кэш-первого-уровня)

## Git
- [Различия между merge и rebase?](git.md#различия-между-merge-и-rebase)
- [Что такое reset?](git.md#что-такое-reset)
- [Различия между soft reset и hard reset?](git.md#различия-между-soft-reset-и-hard-reset)

## Maven
- [Различия между maven и gradle?](maven.md#различия-между-maven-и-gradle)
- [библиотеки разных версий в maven?](maven.md#библиотеки-разных-версий-в-maven)
- [что такое dependency management в maven?](maven.md#что-такое-dependency-management-в-maven)
- [есть ли наследование pom в maven?](maven.md#есть-ли-наследование-pom-в-maven)

## Microservices
- [способы коммуникации между микросервисами?](microservices.md#способы-коммуникации-между-микросервисами)
- [exchange в message queue?](microservices.md#exchange-в-message-queue)
- [в чем плюсы микросервисов?](microservices.md#в-чем-плюсы-микросервисов)
- [минусы микросервисов?](microservices.md#минусы-микросервисов)
- [В микросервисах какие могут быть проблемы?](microservices.md#в-микросервисах-какие-могут-быть-проблемы)
- [как решается проблема с коммуникацией, когда какой-либо сервис не доступен?](microservices.md#как-решается-проблема-с-коммуникацией-когда-какой-либо-сервис-не-доступен)
- [что такое rabbitMQ?](microservices.md#что-такое-rabbitmq)
- [асинхронный vs синхронный вид коммуникации?](microservices.md#асинхронный-vs-синхронный-вид-коммуникации)
- [возможные решениея для реализации аутентификации в микросервисной архитектуре?](microservices.md#возможные-решениея-для-реализации-аутентификации-в-микросервисной-архитектуре)

## JavaScript
- [Какие есть области видимости?](javascript.md#какие-есть-области-видимости)
- [Что такое bind? call & apply?](javascript.md#что-такое-bind-call--apply)
- [Потеря контекста в js?](javascript.md#потеря-контекста-в-js)
- [js однопоточный или многопоточный?](javascript.md#js-однопоточный-или-многопоточный)
- [Что такое closure в js?](javascript.md#что-такое-closure-в-js)
- [Как проверить присутствует ли идентификатор в html?](javascript.md#как-проверить-присутствует-ли-идентификатор-в-html)
- [2 функции с одинаковам названием, но разным количеством параметров, могут ли быть проблемы?](javascript.md#2-функции-с-одинаковам-названием-но-разным-количеством-параметров-могут-ли-быть-проблемы)

## Linux
- [как вывести список процессов в командной строке linux?](linux.md#как-вывести-список-процессов-в-командной-строке-linux)

## Patterns
+ [Какие знаешь архитектурные паттерны?](patterns.md#какие-знаешь-архитектурные-паттерны)
+ [В чем суть single responsibility?](patterns.md#в-чем-суть-single-responsibility)
+ [Отличия фасада от proxy/gateway?](patterns.md#отличия-фасада-от-proxygateway)
+ [что можно предложить вместо констуктора с большим количеством параметров?](patterns.md#что-можно-предложить-вместо-констуктора-с-большим-количеством-параметров)
+ [как реализовать builder?](patterns.md#как-реализовать-builder)
+ [Что можете рассказать о паттерне визитор?](patterns.md#что-можете-рассказать-о-паттерне-визитор)
+ [какую проблему решает визитор?](patterns.md#какую-проблему-решает-визитор)
+ [Что можете рассказать о паттерне observer?](patterns.md#что-можете-рассказать-о-паттерне-observer)
+ [как инициализировать классы в зависимости от типа?](patterns.md#как-инициализировать-классы-в-зависимости-от-типа)

## REST
- [Что такое rest-архитектура? что должно выполняться?](rest.md#что-такое-rest-архитектура-что-должно-выполняться)
- [Есть ли state в rest архитектуре](rest.md#есть-ли-state-в-rest-архитектуре)
- [Можно ли использовать query params в rest архитектуре?](rest.md#можно-ли-использовать-query-params-в-rest-архитектуре)
- [Различия между get и post?](rest.md#различия-между-get-и-post)
- [Принципиальная разница между soap и rest?](rest.md#принципиальная-разница-между-soap-и-rest)
- [при get-запросе что-то обновляется на серваке, это правильно?](rest.md#при-get-запросе-что-то-обновляется-на-серваке-это-правильно)
- [возможно ли передать body в get запросах?](rest.md#возможно-ли-передать-body-в-get-запросах)
- [какие типы запросов в http протоколе?](rest.md#какие-типы-запросов-в-http-протоколе)
- [зачем нужен метод options?](rest.md#зачем-нужен-метод-options)
- [различия между put и post?](rest.md#различия-между-put-и-post)
- [в качестве rest-клиента что может использоваться?](rest.md#в-качестве-rest-клиента-что-может-использоваться)
- [как http протокол работает?](rest.md#как-http-протокол-работает)

## SQL
- [что такое having в sql?](sql.md#что-такое-having-в-sql)
- [возможные проблемы индексов?](sql.md#возможные-проблемы-индексов)

## Test
- [отличия интеграционных от unit тестов?](test.md#отличия-интеграционных-от-unit-тестов)
- [unit тест тестирует 2 класса, это правильно? это unit или интеграционный тест?](test.md#unit-тест-тестирует-2-класса-это-правильно-это-unit-или-интеграционный-тест)
- [что можно использовать для unit tests?](test.md#что-можно-использовать-для-unit-tests)

## Transactions
- [что такое транзакция?](transaction.md#что-такое-транзакция)
- [Требования к транзакции? для чего нужны?](transaction.md#требования-к-транзакции-для-чего-нужны)
- [что такое распределенная транзакция?](transaction.md#что-такое-распределенная-транзакция)
- [уровни изоляции транзакций?](transaction.md#уровни-изоляции-транзакций)
- [Какие проблемы могут возникать при параллельном доступе с использованием транзакций?](transaction.md#какие-проблемы-могут-возникать-при-параллельном-доступе-с-использованием-транзакций)
- [Возможные варианты реализации транзакционности в микросервисах](transaction.md#возможные-варианты-реализации-транзакционности-в-микросервисах)
- [В чем разница между optimistic и pessimistic locking?](transaction.md#в-чем-разница-между-optimistic-и-pessimistic-locking)
- [Что такое Eventual consistency?](transaction.md#что-такое-eventual-consistency)

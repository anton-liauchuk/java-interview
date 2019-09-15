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
- [What is difference between parameters and attributes?](servlet.md#what-is-difference-between-parameters-and-attributes)
- [What is the life cycle of servlet?](servlet.md#what-is-the-life-cycle-of-servlet)
- [What is the servlet mapping?](servlet.md#what-is-the-servlet-mapping)

## Hibernate
- [What is detached entity?](hibernate.md#what-is-detached-entity)
- [What is the use of flush?](hibernate.md#what-is-the-use-of-flush)
- [What are the cache levels?](hibernate.md#what-are-the-cache-levels)
- [What is the first-level cache?](hibernate.md#what-is-the-first-level-cache)

## Git
- [What is the difference between merge and rebase?](git.md#what-is-the-difference-between-merge-and-rebase)
- [What is git reset?](git.md#what-is-git-reset)
- [What is the difference between soft reset and hard reset?](git.md#what-is-the-difference-between-soft-reset-and-hard-reset)

## Maven
- [What is the difference between Maven and Gradle?](maven.md#what-is-the-difference-between-maven-and-gradle)
- [How will work Maven in the case of multiple version of the same dependency?](maven.md#how-will-work-maven-in-the-case-of-multiple-version-of-the-same-dependency)
- [What is the dependency management in Maven?](maven.md#what-is-the-dependency-management-in-maven)
- [Does maven support inheritance for pom files?](maven.md#does-maven-support-inheritance-for-pom-files)

## Microservices
- [What are the possible ways for communication between microservices?](microservices.md#what-are-the-possible-ways-for-communication-between-microservices)
- [What is exchange in message queue?](microservices.md#what-is-exchange-in-message-queue)
- [What are the benefits of microservices?](microservices.md#what-are-the-benefits-of-microservices)
- [What are the disadvantages of microservices?](microservices.md#what-are-the-disadvantages-of-microservices)
- [What are the possible issues in microservices](microservices.md#what-are-the-possible-issues-in-microservices)
- [What are the possible solutions for the case when one service is not available?](microservices.md#what-are-the-possible-solutions-for-the-case-when-one-service-is-not-available)
- [What is RabbitMQ?](microservices.md#what-is-rabbitmq)
- [What is the difference between synchronous and asynchronous communication?](microservices.md#what-is-the-difference-between-synchronous-and-asynchronous-communication)
- [What are possible ways for implementing authentication in microservices?](microservices.md#what-are-possible-ways-for-implementing-authentication-in-microservices)
- [What is Eventual consistency?](microservices.md#what-is-eventual-consistency)

## JavaScript
- [What are possible variable scopes?](javascript.md#what-are-possible-variable-scopes)
- [What is bind? call & apply?](javascript.md#what-is-bind-call--apply)
- [What is losing of context in js?](javascript.md#what-is-losing-of-context-in-js)
- [Is Javascript single threaded?](javascript.md#is-javascript-single-threaded)
- [What is closure in js?](javascript.md#what-is-closure-in-js)
- [How to check if element exists in html?](javascript.md#how-to-check-if-element-exists-in-html)
- [2 functions with the same name but with different number of parameters. Can be the issues in this case?](javascript.md#2-functions-with-the-same-name-but-with-different-number-of-parameters-can-be-the-issues-in-this-case)

## Linux
- [How to print the list of processes in terminal Linux?](linux.md#how-to-print-the-list-of-processes-in-terminal-linux)

## Patterns
- [Which architectural patterns you know?](patterns.md#which-architectural-patterns-you-know)
- [What does it mean single responsibility?](patterns.md#what-does-it-mean-single-responsibility)
- [What is the difference between facade and proxy/gateway?](patterns.md#what-is-the-difference-between-facade-and-proxygateway)
- [What can we do in the case of constructor with big number of parameters?](patterns.md#what-can-we-do-in-the-case-of-constructor-with-big-number-of-parameters)
- [How can be implemented builder?](patterns.md#how-can-be-implemented-builder)
- [What is pattern Visitor?](patterns.md#what-is-pattern-visitor)
- [What is the issue can be solved by visitor?](patterns.md#what-is-the-issue-can-be-solved-by-visitor)
- [What can you say about pattern observer?](patterns.md#what-can-you-say-about-pattern-observer)
- [How to initialize object depends on type?](patterns.md#how-to-initialize-object-depends-on-type)

## REST
- [What is rest architecture? What are the requirements?](rest.md#what-is-rest-architecture-what-are-the-requirements)
- [Is there state in rest architecture?](rest.md#is-there-state-in-rest-architecture)
- [Can be used query params in rest architecture?](rest.md#can-be-used-query-params-in-rest-architecture)
- [What is the difference get and post?](rest.md#what-is-the-difference-get-and-post)
- [What is the difference between soap and rest?](rest.md#what-is-the-difference-between-soap-and-rest)
- [Is it correct to update something during get request?](rest.md#is-it-correct-to-update-something-during-get-request)
- [Is it possible to use body in get requests?](rest.md#is-it-possible-to-use-body-in-get-requests)
- [What are possible types of requests for http protocol?](rest.md#what-are-possible-types-of-requests-for-http-protocol)
- [Why method options is needed?](rest.md#why-method-options-is-needed)
- [What is the difference between put and post?](rest.md#what-is-the-difference-between-put-and-post)
- [What can be used as rest client?](rest.md#what-can-be-used-as-rest-client)
- [How http protocol work?](rest.md#how-http-protocol-work)

## SQL
- [What is having in sql?](sql.md#what-is-having-in-sql)
- [What are the possible issues with indexes?](sql.md#what-are-the-possible-issues-with-indexes)

## Test
- [What is the difference between integration and unit tests?](test.md#what-is-the-difference-between-integration-and-unit-tests)
- [Unit test executes code from 2 classes, is it correct? Is it unit or integration test?](test.md#unit-test-executes-code-from-2-classes-is-it-correct-is-it-unit-or-integration-test)
- [What can be used for unit tests?](test.md#what-can-be-used-for-unit-tests)

## Transactions
- [What is transaction?](transaction.md#what-is-transaction)
- [What are the requirements for transactions?](transaction.md#what-are-the-requirements-for-transactions)
- [What is a distributed transaction?](transaction.md#what-is-a-distributed-transaction)
- [What are isolation levels?](transaction.md#what-are-isolation-levels)
- [What are the possible issues in the case of parallel access by transactions?](transaction.md#what-are-the-possible-issues-in-the-case-of-parallel-access-by-transactions)
- [What are possible options for implementing transactions in microservices](transaction.md#what-are-possible-options-for-implementing-transactions-in-microservices)
- [What is the difference between optimistic and pessimistic locking?](transaction.md#what-is-the-difference-between-optimistic-and-pessimistic-locking)

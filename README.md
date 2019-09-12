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
+ [Методы wait/notify для чего используются?](concurrency.md#методы-waitnotify-для-чего-используются)
+ [Где может быть использован метод wait?](concurrency.md#где-может-быть-использован-метод-wait)
+ [Что такое synchronized? как использовать?](concurrency.md#что-такое-synchronized-как-использовать)
+ [Ключевое слово volatile для чего используется?](concurrency.md#ключевое-слово-volatile-для-чего-используется)
+ [Как volatile связано с happens before?](concurrency.md#как-volatile-связано-с-happens-before)
+ [Какие есть concurrent коллекции?](concurrency.md#какие-есть-concurrent-коллекции)
+ [Что можете рассказать о CopyOnWriteArraylist?](concurrency.md#что-можете-рассказать-о-copyonwritearraylist)
+ [Что можете рассказать о ConcurrentHashMap?](concurrency.md#что-можете-рассказать-о-concurrenthashmap)
+ [В чем преимущества ConcurrentHashMap перед HashTable?](concurrency.md#в-чем-преимущества-concurrenthashmap-перед-hashtable)
+ [Что такое синхронизированный доступ?](concurrency.md#что-такое-синхронизированный-доступ)

## Spring
+ [Как сделать spring сервис thread-safe?](spring.md#как-сделать-spring-сервис-thread-safe)
+ [Что такое бин?](spring.md#что-такое-бин)
+ [Как бин попадает в контейнер?](spring.md#Как-бин-попадает-в-контейнер)
+ [Какие бывают spring scopes?](spring.md#какие-бывают-spring-scopes)
+ [В чем разница между @Service vs @Component?](spring.md#в-чем-разница-между-service-vs-component)
+ [После создания бина, можно ли его как-то подкрутить? что-то добавить и тд?](spring.md#после-создания-бина-можно-ли-его-как-то-подкрутить-что-то-добавить-и-тд)
+ [Scope для бина по умолчанию?](spring.md#scope-для-бина-по-умолчанию)
+ [Что такое prototype scope?](spring.md#что-такое-prototype-scope)
+ [Какие существуют виды DI?](spring.md#какие-существуют-виды-di)
+ [Какие зависимости лучше добавлять через конструктор, а какие через setter?](spring.md#какие-зависимости-лучше-добавлять-через-конструктор-а-какие-через-setter)
+ [Как обрабатывать исключения в контроллерах?](spring.md#как-обрабатывать-исключения-в-контроллерах)
+ [Что из себя представляет environment?](spring.md#что-из-себя-представляет-environment)
+ [В чем разница между BeanFactory и FactoryBean?](spring.md#в-чем-разница-между-beanfactory-и-factorybean)
+ [Различия между Spring и Spring Boot?](spring.md#различия-между-spring-и-spring-boot)
+ [Как добавить свои авто-конфигурации?](spring.md#как-добавить-свои-авто-конфигурации)
+ [Где можно хранить список конфигураций в meta-inf?](spring.md#где-можно-хранить-список-конфигураций-в-meta-inf)
+ [Возможные виды конфигураций в Spring?](spring.md#возможные-виды-конфигураций-в-spring)
+ [что такое lookup method?](spring.md#что-такое-lookup-method)
+ [что такое declarative transaction в spring?](spring.md#что-такое-declarative-transaction-в-spring)
+ [что создает прокси?](spring.md#что-создает-прокси)
+ [как сделать свою аннотацию @LoggableAutowired?](spring.md#как-сделать-свою-аннотацию-LoggableAutowired)
+ [вызов @transactional spring в том же классе](spring.md#вызов-transactional-spring-в-том-же-классе)

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

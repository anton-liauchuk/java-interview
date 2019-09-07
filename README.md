# Вопросы для Java собеседования

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
- [Какие нововведения в java 8?](core.md#какие-нововведения-в-java-8)
- [В чем концептуальное отличие stream api от collection?](core.md#в-чем-концептуальное-отличие-stream-api-от-collection)
- [Где хранится ссылка на объект?](core.md#где-хранится-ссылка-на-объект)
- [Типы памяти в Java?](core.md#типы-памяти-в-java)
- [Что такое java agent?](core.md#что-такое-java-agent)
- [Возможные средства troubleshooting?](core.md#возможные-средства-troubleshooting)
- [Что такое profiler?](core.md#что-такое-profiler)
- [Что такое stop the world?](core.md#что-такое-stop-the-world)
- [Чем отличается int, Integer, AtomicInteger?](core.md#чем-отличается-int-integer-atomicinteger)
- [i++ для Integer, что будет с памятью?](core.md#i-для-integer-что-будет-с-памятью)
- [Как ты относишься к использованию констант в интерфейсах?](core.md#как-ты-относишься-к-использованию-констант-в-интерфейсах)
- [Контракт equals/hashcode?](core.md#контракт-equalshashcode)
- [Правила переопределения equals/hashcode?](core.md#правила-переопределения-equalshashcode)
- [Для equals/hashcode нужны одни и те же поля?](core.md#для-equalshashcode-нужны-одни-и-те-же-поля)
- [Для чего используются вложенные классы?](core.md#для-чего-используются-вложенные-классы)
- [Что лучше использовать interfaces или abstract classes?](core.md#что-лучше-использовать-interfaces-или-abstract-classes)
- [Есть ли доступ к приватной переменной внешнего класса из внутреннего?](core.md#есть-ли-доступ-к-приватной-переменной-внешнего-класса-из-внутреннего)
- [Различия между статическим внутренним и нестатическим внутренним классами?](core.md#различия-между-статическим-внутренним-и-нестатическим-внутренним-классами)
- [Что не рекомендуется делать в параллельных стримах?](core.md#что-не-рекомендуется-делать-в-параллельных-стримах)
- [методы у класса object?](core.md#методы-у-класса-object)
- [что такое jmeter?](core.md#что-такое-jmeter)
- [снять дамп памяти для приложения? как это сделать?](core.md#снять-дамп-памяти-для-приложения-как-это-сделать)

## Collections
+ [Алгоритмическая сложность get в Hashmap?](collections.md#алгоритмическая-сложность-get-в-hashmap)
+ [Алгоритмическая сложность при get для HashMap для ключей, у которых hashcode = 1?](collections.md#алгоритмическая-сложность-при-get-для-hashmap-для-ключей-у-которых-hashcode--1)
+ [Какие есть коллекции? интерфейсы? реализации?](collections.md#какие-есть-коллекции-интерфейсы-реализации)
+ [В чем разница между LinkedList и ArrayList?](collections.md#в-чем-разница-между-linkedlist-и-arraylist)
+ [Что лучше использовать LinkedList или ArrayList?](collections.md#что-лучше-использовать-linkedlist-или-arraylist)
+ [Устройство HashMap?](collections.md#устройство-hashmap)
+ [Какие существуют реализации Map?](collections.md#какие-существуют-реализации-map)
+ [Сложность удаления из связного списка последнего элемента?](collections.md#сложность-удаления-из-связного-списка-последнего-элемента)
+ [Различия между Set и Map?](collections.md#различия-между-set-и-map)
+ [Какие есть мапы для многопоточной среды?](collections.md#какие-есть-мапы-для-многопоточной-среды)

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

## Algorithms

## Linux

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

## React

## REST

## SQL

## Test

## Transactions

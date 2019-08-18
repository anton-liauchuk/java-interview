# Spring
+ [Как сделать spring сервис thread-safe?](#как-сделать-spring-сервис-thread-safe)
+ [Что такое бин?](#что-такое-бин)
+ [Как бин попадает в контейнер?](#Как-бин-попадает-в-контейнер)
+ [Что в спринге реализовано для DI? какой паттерн используется?](#что-в-спринге-реализовано-для-di-какой-паттерн-используется)
+ [Какие бывают spring scopes?](#какие-бывают-spring-scopes)
+ [В чем разница между @Service vs @Component?](#в-чем-разница-между-service-vs-component)
+ [После создания бина, можно ли его как-то подкрутить? что-то добавить и тд?](#после-создания-бина-можно-ли-его-как-то-подкрутить-что-то-добавить-и-тд)
+ [Scope для бина по умолчанию?](#scope-для-бина-по-умолчанию)
+ [Что такое prototype scope?](#что-такое-prototype-scope)
+ [Какие существуют виды DI?](#какие-существуют-виды-di)
+ [Какие зависимости лучше добавлять через конструктор, а какие через setter?](#какие-зависимости-лучше-добавлять-через-конструктор-а-какие-через-setter)
+ [Как обрабатывать исключения в контроллерах?](#как-обрабатывать-исключения-в-контроллерах)
+ [Что из себя представляет environment?](#что-из-себя-представляет-environment)
+ [В чем разница между BeanFactory и FactoryBean?](#в-чем-разница-между-beanfactory-и-factorybean)
+ [Различия между Spring и Spring Boot?](#различия-между-spring-и-spring-boot)
+ [Как добавить свои авто-конфигурации?](#как-добавить-свои-авто-конфигурации)
+ [Где можно хранить список конфигураций в meta-inf?](#где-можно-хранить-список-конфигураций-в-meta-inf)
+ [Возможные виды конфигураций в Spring?](#возможные-виды-конфигураций-в-spring)
+ [Как авто-поднятие конфигураций происходит?](#как-авто-поднятие-конфигураций-происходит)

## Как сделать spring сервис thread-safe?
###### Relative links:
+ http://dolszewski.com/spring/spring-bean-thread-safety-guide/

## Что такое бин?
###### Relative links:

## Как бин попадает в контейнер?
###### Relative links:

## Что в спринге реализовано для DI? какой паттерн используется?
###### Relative links:

## Какие бывают spring scopes?
###### Relative links:

## В чем разница между @Service vs @Component?
###### Relative links:

## После создания бина, можно ли его как-то подкрутить? что-то добавить и тд?
###### Relative links:

## Scope для бина по умолчанию?
###### Relative links:

## Что такое prototype scope?
###### Relative links:

## Какие существуют виды DI?
###### Relative links:

## Какие зависимости лучше добавлять через конструктор, а какие через setter?
###### Relative links:

## Как обрабатывать исключения в контроллерах?
###### Relative links:

## Что из себя представляет environment?
###### Relative links:

## В чем разница между BeanFactory и FactoryBean?
The BeanFactory is an interface in Spring and is a factory class for managing beans. The BeanFactory is the core of the IOC container. The accusations include: instantiating, configuring objects in the application and establishing dependencies between them. The ApplicationContext is an advanced version of the BeanFactory.
FactoryBean is a way to customize the instantiation of the bean, through the implementation of the FactoryBean, complete the custom bean instantiation details. For example, the FactoryBean proxy object can be used to intercept all its methods to form AOP-like functions. Using FactoryBean avoids the need to configure various properties in the XML file, which is more flexible, but you need to encode the instantiation of the class in the implementation class of the FactoryBean.
###### Relative links:
+ http://www.programmersought.com/article/6987917473/

## Различия между Spring и Spring Boot?
###### Relative links:
+ https://dzone.com/articles/understanding-the-basics-of-spring-vs-spring-boot

## Как добавить свои авто-конфигурации?
###### Relative links:
+ https://www.baeldung.com/spring-boot-custom-auto-configuration

## Где можно хранить список конфигураций в meta-inf?
META-INF/spring.factories
###### Relative links:
+ https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-developing-auto-configuration.html

## Возможные виды конфигураций в Spring?
+ xml-based configuration, when you describe configuration in xml file;
+ java-based configuration, when configuration is Java class, marked with specific annotations;
+ groovy-based configuration, when configuration is file with Groovy code;
###### Relative links:
+ https://stackoverflow.com/questions/35807056/how-many-ways-are-there-to-configure-the-spring-framework-what-are-the-differen

## Как авто-поднятие конфигураций происходит?
###### Relative links:
+ https://www.javadevjournal.com/spring-boot/how-spring-boot-auto-configuration-works/

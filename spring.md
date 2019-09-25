# Spring
- [How make spring service thread-safe?](#how-make-spring-service-thread-safe)
- [What is bean?](#what-is-bean)
- [How bean gets into the container?](#how-bean-gets-into-the-container)
- [What are the possible bean scopes?](#what-are-the-possible-bean-scopes)
- [What is the difference @Service between @Component?](#what-is-the-difference-service-between-component)
- [How to call a method after bean initialization?](#how-to-call-a-method-after-bean-initialization)
- [What is the default scope?](#what-is-the-default-scope)
- [What is the prototype scope?](#what-is-the-prototype-scope)
- [What are the possible ways of Dependency Injection?](#what-are-the-possible-ways-of-dependency-injection)
- [Where better to use dependency injection via constructor? Where via setter?](#where-better-to-use-dependency-injection-via-constructor-where-via-setter)
- [How to catch the exceptions for controllers?](#how-to-catch-the-exceptions-for-controllers)
- [What is the difference between BeanFactory and FactoryBean?](#what-is-the-difference-between-beanfactory-and-factorybean)
- [What is the difference Spring and Spring Boot?](#what-is-the-difference-spring-and-spring-boot)
- [How to add own auto-configurations?](#how-to-add-own-auto-configurations)
- [Where can be stored the list of auto-configurations in META-INF?](#where-can-be-stored-the-list-of-auto-configurations-in-meta-inf)
- [What are the possible ways of configurations in Spring?](#what-are-the-possible-ways-of-configurations-in-spring)
- [What is the lookup method?](#what-is-the-lookup-method)
- [What is declarative transaction in Spring?](#what-is-declarative-transaction-in-spring)
- [What creates a proxy?](#what-creates-a-proxy)
- [Does @transactional method work in the case of execution in the same class?](#does-transactional-method-work-in-the-case-of-execution-in-the-same-class)
- [What is environment?](#what-is-environment)
- [How does auto-configuration work?](#how-does-auto-configuration-work)

## How make spring service thread-safe?
There are several ways, probably too long to list here but here are a few examples:
+ Design your beans immutable: for example have no setters and only use constructor arguments to create a bean. There are other ways, such as Builder pattern, etc..
+ Design your beans stateless: for example a bean that does something can be just a function (or several). This bean in most cases can and should be stateless, which means it does not have any state, it only does things with function arguments you provide each time (on each invocation)
+ Design your beans persistent: which is a special case of "immutable", but has some very nice properties. Usually is used in functional programming, where Spring (at least yet) not as useful as in imperative world, but I have used them with Scala/Spring projects.
+ Design your beans with locks [last resort]: I would recommend against this unless you are working on a lower level library. The reason is we (humans) are not good thinking in terms of locks. Just the way we are raised and nurtured. Everything happens in parallel without us needing to "put that rain on pause, let me get an umbrella". Computers however are all about locks when you are talking "multiple things at the same time", hence there are some of us (exceptional people) who are doing their fair share and implementing libraries based on these locks. Most of other humans can just use these libraries and worry not about concurrency.
###### Relative links:
+ http://dolszewski.com/spring/spring-bean-thread-safety-guide/
+ https://stackoverflow.com/questions/15745140/are-spring-objects-thread-safe

## What is bean?
The objects that form the backbone of your application and that are managed by the Spring IoC container are called beans. A bean is an object that is instantiated, assembled, and otherwise managed by a Spring IoC container. These beans are created with the configuration metadata that you supply to the container.
###### Relative links:
+ https://www.tutorialspoint.com/spring/spring_bean_definition.htm

## How bean gets into the container?
The IoC container receives metadata from either an XML file, Java annotations, or Java code. The container gets its instructions on what objects to instantiate, configure, and assemble from simple Plain Old Java Objects (POJO) by reading the configuration metadata provided. These created objects through this process called Spring Beans.

The responsibilities of IoC container are:
+ Instantiating the bean
+ Wiring the beans together
+ Configuring the beans
+ Managing the bean’s entire life-cycle
###### Relative links:
+ https://www.zoltanraffai.com/blog/how-does-spring-work-internally/

## What are the possible bean scopes?
+ ***singleton.*** Scopes a single bean definition to a single object instance per Spring IoC container.
+ ***prototype.*** Scopes a single bean definition to any number of object instances.
+ ***request.***  Scopes a single bean definition to the lifecycle of a single HTTP request; that is each and every HTTP request will have its own instance of a bean created off the back of a single bean definition. Only valid in the context of a web-aware Spring ApplicationContext.
+ ***session.*** Scopes a single bean definition to the lifecycle of a HTTP Session. Only valid in the context of a web-aware Spring ApplicationContext.
+ ***global session.*** Scopes a single bean definition to the lifecycle of a global HTTP Session. Typically only valid when used in a portlet context. Only valid in the context of a web-aware Spring ApplicationContext.
###### Relative links:
+ https://docs.spring.io/spring/docs/3.0.0.M3/reference/html/ch04s04.html

## What is the difference @Service between @Component?
Apart from the fact that it's used to indicate, that it's holding the business logic, there’s nothing else noticeable in this annotation; but who knows, Spring may add some additional exceptional in future.
###### Relative links:
+ https://stackoverflow.com/questions/6827752/whats-the-difference-between-component-repository-service-annotations-in

## How to call a method after bean initialization?
+ afterPropertiesSet method;
+ annotation @PostConstruct;
+ init-method attribute;
+ BeanPostProcessor;
###### Relative links:
+ https://codippa.com/callback-methods-in-spring-beans/
+ http://findnerd.com/list/view/How-to-call-a-method-after-bean-initialization-is-complete/7530/

## What is the default scope?
singleton
###### Relative links:
+ https://www.tutorialspoint.com/spring/spring_bean_scopes.htm

## What is the prototype scope?
Scopes a single bean definition to any number of object instances.
###### Relative links:
+ https://docs.spring.io/spring/docs/3.0.0.M3/reference/html/ch04s04.html

## What are the possible ways of Dependency Injection?
+ Constructor-Based Dependency Injection;
+ Setter-Based Dependency Injection;
+ Field-Based Dependency Injection;
###### Relative links:
+ https://www.baeldung.com/inversion-control-and-dependency-injection-in-spring
+ https://www.javacodegeeks.com/2019/02/field-setter-constructor-injection.html

## Where better to use dependency injection via constructor? Where via setter?
+ required dependencies via constructor;
+ optional dependencies via setter;
###### Relative links:
+ https://www.dariawan.com/tutorials/spring/constructor-vs-setter-dependency-injection/

## How to catch the exceptions for controllers?
***ExceptionHandler*** is a Spring annotation that provides a mechanism to treat exceptions that are thrown during execution of handlers (Controller operations). This annotation, if used on methods of controller classes, will serve as the entry point for handling exceptions thrown within this controller only. Altogether, the most common way is to use @ExceptionHandler on methods of @ControllerAdvice classes so that the exception handling will be applied globally or to a subset of controllers.
###### Relative links:
+ https://www.toptal.com/java/spring-boot-rest-api-error-handling

## What is the difference between BeanFactory and FactoryBean?
+ The ***BeanFactory*** is an interface in Spring and is a factory class for managing beans. The BeanFactory is the core of the IOC container. The accusations include: instantiating, configuring objects in the application and establishing dependencies between them. The ApplicationContext is an advanced version of the BeanFactory.
+ ***FactoryBean*** is a way to customize the instantiation of the bean, through the implementation of the FactoryBean, complete the custom bean instantiation details. For example, the FactoryBean proxy object can be used to intercept all its methods to form AOP-like functions. Using FactoryBean avoids the need to configure various properties in the XML file, which is more flexible, but you need to encode the instantiation of the class in the implementation class of the FactoryBean.
###### Relative links:
+ http://www.programmersought.com/article/6987917473/

## What is the difference Spring and Spring Boot?
+ Spring Boot does all of those using AutoConfiguration and will take care of all the internal dependencies that your application needs — all you need to do is run your application. Spring Boot will auto-configure with the Dispatcher Servlet, if Spring jar  is in the class path. It will auto-configue to the datasource, if Hibernate jar  is in the class path. Spring Boot gives us a pre-configured set of Starter Projects to be added as a dependency in our project.
+ During web-application development, we would need the jars that we want to use, which versions of the jars to use, and how to connect them together. All web applications have similar needs, for example, Spring MVC, Jackson Databind, Hibernate core, and Log4j (for logging). So, we had to choose the compatible versions of all these jars. In order to decrease the complexity, Spring Boot has introduced what we call Spring Boot Starters.
###### Relative links:
+ https://dzone.com/articles/understanding-the-basics-of-spring-vs-spring-boot
+ https://dzone.com/articles/spring-vs-spring-boot

## How to add own auto-configurations?
+ You need to opt-in to auto-configuration by adding the @EnableAutoConfiguration or @SpringBootApplication annotations to one of your @Configuration classes.
+ Spring Boot checks for the presence of a META-INF/spring.factories file within your published jar. The file should list your configuration classes under the EnableAutoConfiguration key, as shown in the following example:
###### Relative links:
+ https://www.baeldung.com/spring-boot-custom-auto-configuration
+ https://docs.spring.io/spring-boot/docs/current/reference/html/using-boot-auto-configuration.html

## Where can be stored the list of auto-configurations in META-INF?
META-INF/spring.factories
###### Relative links:
+ https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-developing-auto-configuration.html

## What are the possible ways of configurations in Spring?
+ xml-based configuration, when you describe configuration in xml file;
+ java-based configuration, when configuration is Java class, marked with specific annotations;
+ groovy-based configuration, when configuration is file with Groovy code;
###### Relative links:
+ https://stackoverflow.com/questions/35807056/how-many-ways-are-there-to-configure-the-spring-framework-what-are-the-differen

## What is the lookup method?
The getter method will return us the reference that is been set but suppose you want a new instance of the dependent bean each time you invoke the getter method
###### Relative links:
+ https://www.javacodegeeks.com/2015/05/spring-lookup-method-example.html

## What is declarative transaction in Spring?
1. Allows us to manage transactions through configuration.
2. This means separating transaction logic with business logic.
3. We use annotations (Or XML files) to manage transactions.
4. Easy to maintain. Boilerplate is kept away from business logic.
5. Preferred when working with large amount of Transaction logic.
###### Relative links:
+ https://stackoverflow.com/questions/11222103/declarative-or-programmatic-transaction-in-spring

## What creates a proxy?
After the bean instances are created they are run through a series of BeanPostProcessors - Based on the AOP advice, the proxies are created by a BeanPostProcessor called AnnotationAwareAspectJAutoProxyCreator (or possibly its subclasses)
###### Relative links:
+ https://stackoverflow.com/questions/12648394/when-does-spring-creates-proxies-in-the-beans-lifecycle
+ https://dzone.com/articles/spring-pitfalls-proxying
+ https://ntsim.uk/posts/a-closer-look-at-spring-proxies

## Does @transactional method work in the case of execution in the same class?
The problem here is, that Spring's AOP proxies don't extend but rather wrap your service instance to intercept calls. This has the effect, that any call to "this" from within your service instance is directly invoked on that instance and cannot be intercepted by the wrapping proxy (the proxy is not even aware of any such call).
###### Relative links:
+ https://stackoverflow.com/questions/3423972/spring-transaction-method-call-by-the-method-within-the-same-class-does-not-wo

## What is environment?
Interface representing the environment in which the current application is running. Models two key aspects of the application environment: profiles and properties. Methods related to property access are exposed via the PropertyResolver superinterface.

A profile is a named, logical group of bean definitions to be registered with the container only if the given profile is active. Beans may be assigned to a profile whether defined in XML or via annotations; see the spring-beans 3.1 schema or the @Profile annotation for syntax details. The role of the Environment object with relation to profiles is in determining which profiles (if any) are currently active, and which profiles (if any) should be active by default.

Properties play an important role in almost all applications, and may originate from a variety of sources: properties files, JVM system properties, system environment variables, JNDI, servlet context parameters, ad-hoc Properties objects, Maps, and so on. The role of the environment object with relation to properties is to provide the user with a convenient service interface for configuring property sources and resolving properties from them.
###### Relative links:
- https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/core/env/Environment.html

## How does auto-configuration work?
Under the hood, auto-configuration is implemented with standard @Configuration classes. Additional @Conditional annotations are used to constrain when the auto-configuration should apply. Usually, auto-configuration classes use @ConditionalOnClass and @ConditionalOnMissingBean annotations. This ensures that auto-configuration applies only when relevant classes are found and when you have not declared your own @Configuration.
###### Relative links:
- https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-developing-auto-configuration.html

[Home Page](README.md)

# Core

## Какие нововведения в java 8?
+ Lambda expressions, Method Reference , Optional, Streams added.
+ Advanced Date , Time, Zone and Calendar Classes introduced.
+ PermGen Removed.
###### Relative links:
+ https://codete.com/blog/java-8-java-11-quick-guide/
+ https://www.quora.com/What-are-the-differences-between-Java-8-9-10-and-11

## В чем концептуальное отличие stream api от collection?
Streams differ from collections in several ways:
+ No storage. A stream is not a data structure that stores elements; instead, it conveys elements from a source such as a data structure, an array, a generator function, or an I/O channel, through a pipeline of computational operations.
+ Functional in nature. An operation on a stream produces a result, but does not modify its source. For example, filtering a Stream obtained from a collection produces a new Stream without the filtered elements, rather than removing elements from the source collection.
+ Laziness-seeking. Many stream operations, such as filtering, mapping, or duplicate removal, can be implemented lazily, exposing opportunities for optimization. For example, "find the first  String with three consecutive vowels" need not examine all the input strings. Stream operations are divided into intermediate (Stream-producing) operations and terminal (value- or side-effect-producing) operations. Intermediate operations are always lazy.
+ Possibly unbounded. While collections have a finite size, streams need not. Short-circuiting operations such as limit(n) or findFirst() can allow computations on infinite streams to complete in finite time.
+ Consumable. The elements of a stream are only visited once during the life of a stream. Like an Iterator, a new stream must be generated to revisit the same elements of the source.
###### Relative links:
+ https://stackoverflow.com/questions/39432699/what-is-the-difference-between-streams-and-collections-in-java-8

## Где хранится ссылка на объект?
stack
###### Relative links:
+ https://stackoverflow.com/questions/13624462/where-does-class-object-reference-variable-get-stored-in-java-in-heap-or-stac

## Типы памяти в Java?
+ Cтек – участок памяти, тесно связанный с потоками. У каждого потока есть свой стек, которые хранит локальные переменные, параметры методов и стек вызовов. Переменная, хранящаяся в стеке одного потока, не видна для другого.
+ Куча – общий участок памяти, который делится между всеми потоками. Объекты, неважно локальные или любого другого уровня, создаются в куче. Для улучшения производительности, поток обычно кэширует значения из кучи в свой стек, в этом случае для того, чтобы указать потоку, что переменную следует читать из кучи используется ключевое слово volatile.
###### Relative links:
+ https://github.com/enhorse/java-interview/blob/master/concurrency.md#%D0%A0%D0%B0%D1%81%D1%81%D0%BA%D0%B0%D0%B6%D0%B8%D1%82%D0%B5-%D0%BE-%D0%BC%D0%BE%D0%B4%D0%B5%D0%BB%D0%B8-%D0%BF%D0%B0%D0%BC%D1%8F%D1%82%D0%B8-java

## Что такое java agent?
Сам агент это отдельное приложение которое предоставляет доступ к механизму манипуляции байт-кодом (java.lang.instrument) в runtime.
###### Relative links:
+ https://habr.com/ru/post/230239/
+ https://www.javacodegeeks.com/2015/09/java-agents.html

## Возможные средства troubleshooting?
+ Java Profilers
+ Tracing Java Web Requests and Transactions
+ Java Application Performance Management (APM)
+ Real User Monitoring (RUM)
+ JVM Performance Metrics
+ Web Server (Apache/Nginx) Access Logs
+ Tracking All Java Exceptions
+ Memory Analysis
###### Relative links:
+ https://stackify.com/java-performance-tools-8-types-tools-need-know/

## Что такое profiler?
A Java Profiler is a tool that monitors Java bytecode constructs and operations at the JVM level. These code constructs and operations include object creation, iterative executions (including recursive calls), method executions, thread executions, and garbage collections.
###### Relative links:
+ https://www.baeldung.com/java-profilers

## Что такое stop the world?
Stop-the-world will occur no matter which GC algorithm you choose. Stop-the-world means that the JVM is stopping the application from running to execute a GC. When stop-the-world occurs, every thread except for the threads needed for the GC will stop their tasks. The interrupted tasks will resume only after the GC task has completed. GC tuning often means reducing this stop-the-world time.
###### Relative links:
+ https://www.cubrid.org/blog/understanding-java-garbage-collection
+ https://stackoverflow.com/questions/16695874/why-does-the-jvm-full-gc-need-to-stop-the-world

## Чем отличается int, Integer, AtomicInteger?
+ int is a primitive type. Variables of type int store the actual binary value for the integer you want to represent. int.parseInt("1") doesn't make sense because int is not a class and therefore doesn't have any methods.
+ Integer is a class, no different from any other in the Java language. Variables of type Integer store references to Integer objects, just as with any other reference (object) type. Integer.parseInt("1") is a call to the static method parseInt from class Integer (note that this method actually returns an int and not an Integer). To be more specific, Integer is a class with a single field of type int. This class is used where you need an int to be treated like any other object, such as in generic types or situations where you need nullability.
+ AtomicInteger is used in multithreaded environments when you need to make sure that only one thread can update an int variable. The advantage is that no external synchronization is requried since the operations which modify it's value are executed in a thread-safe way.
###### Relative links:
+ https://stackoverflow.com/questions/8660691/what-is-the-difference-between-integer-and-int-in-java
+ https://stackoverflow.com/questions/38846976/what-is-the-difference-between-atomic-integer-and-normal-immutable-integer-class

## i++ для Integer, что будет с памятью?
variable will be changed
###### Relative links:
+ https://stackoverflow.com/questions/13280134/why-does-post-increment-work-on-wrapper-classes

## Как ты относишься к использованию констант в интерфейсах?
The constant interface pattern is a poor use of interfaces. That a class uses some constants internally is an implementation detail. Implementing a constant interface causes this implementation detail to leak into the class's exported API. It is of no consequence to the users of a class that the class implements a constant interface. In fact, it may even confuse them. Worse, it represents a commitment: if in a future release the class is modified so that it no longer needs to use the constants, it still must implement the interface to ensure binary compatibility. If a nonfinal class implements a constant interface, all of its subclasses will have their namespaces polluted by the constants in the interface. There are several constant interfaces in the java platform libraries, such as java.io.ObjectStreamConstants. These interfaces should be regarded as anomalies and should not be emulated.
###### Relative links:
+ https://stackoverflow.com/questions/2659593/what-is-the-use-of-interface-constants

## Контракт equals/hashcode?
objects which are .equals() MUST have the same .hashCode().
###### Relative links:
+ https://stackoverflow.com/questions/17027777/relationship-between-hashcode-and-equals-method-in-java

## Правила переопределения equals/hashcode?
+ Always use same attributes of an object to generate hashCode() and equals() both.
+ equals() must be consistent (if the objects are not modified, then it must keep returning the same value).
+ Whenever a.equals(b), then a.hashCode() must be same as b.hashCode().
+ If you override one, then you should override the other.
###### Relative links:
https://howtodoinjava.com/java/basics/java-hashcode-equals-methods/

## Для equals/hashcode нужны одни и те же поля?
The fields don't have to be the same. The requirement is for two objects that are equal, they must have the same hash code. If they have the same hash code, they don't have to be equal. For example, you could return 1 as your hash code always, and you would obey the hash code contract, no matter what fields you used in your equals method. Returning 1 all the time would improve the computation time of hashCode, but HashMap's performance would drop since it would have to resort to equals() more often.
###### Relative links:
+ https://stackoverflow.com/questions/22827652/different-fields-for-equals-and-hashcode

## Для чего используются вложенные классы?
+ It is a way of logically grouping classes that are only used in one place.
+ It increases encapsulation.
+ It can lead to more readable and maintainable code.
###### Relative links:
+ https://stackoverflow.com/questions/11398122/what-are-the-purposes-of-inner-classes
+ https://docs.oracle.com/javase/tutorial/java/javaOO/nested.html

## Что лучше использовать interfaces или abstract classes?
Use abstract classes when you have a class that A is kind of B and interface when A can do B.
+ A class can implement multiple interfaces, but it can only extend one abstract class.
+ Interfaces allow the creation of proxies that encapsulate a concrete class. This is used extensively by frameworks in order to intercept method calls to the concrete class (e.g., for starting a transaction before the method is executed or to write to the log).
###### Relative links:
+ https://stackoverflow.com/questions/2971265/situation-where-interface-is-better-than-abstract-class
+ https://stackoverflow.com/questions/11889588/choosing-interface-or-abstract-class

## Есть ли доступ к приватной переменной внешнего класса из внутреннего?
Inner classes has access to private fields from outer class.
###### Relative links:
+ https://www.geeksforgeeks.org/nested-classes-java/

## Различия между статическим внутренним и нестатическим внутренним классами?
+ Static nested classes do not directly have access to other members(non-static variables and methods) of the enclosing class because as it is static, it must access the non-static members of its enclosing class through an object. That is, it cannot refer to non-static members of its enclosing class directly. Because of this restriction, static nested classes are seldom used.
+ Non-static nested classes (inner classes) has access to all members(static and non-static variables and methods, including private) of its outer class and may refer to them directly in the same way that other non-static members of the outer class do.
###### Relative links:
+ https://www.geeksforgeeks.org/nested-classes-java/
+ https://stackoverflow.com/questions/253492/static-nested-class-in-java-why

## Что не рекомендуется делать в параллельных стримах?
The problem is that all parallel streams use common fork-join thread pool, and if you submit a long-running task, you effectively block all threads in the pool. Consequently, you block all other tasks that are using parallel streams.
###### Relative links:
+ https://dzone.com/articles/think-twice-using-java-8
+ https://stackoverflow.com/questions/20375176/should-i-always-use-a-parallel-stream-when-possible

## методы у класса object?
toString(), hashCode(), equals(Object obj), getClass(), finalize(), clone(), wait(), notify() notifyAll()
###### Relative links:
+ https://www.geeksforgeeks.org/object-class-in-java/

## что такое jmeter?
Apache JMeter is an open source, Java-based, load testing tool that can be used to analyze the functional behavior of a system and measure the performance of a system under a load test. A load test will simulate end-user behavior that approach the limits of an application’s specifications. Apache JMeter can be used to simulate varying or heavy loads on singular or multiple servers, networks or objects to test a system’s strength.
###### Relative links:
+ https://searchsoftwarequality.techtarget.com/definition/Apache-JMeter

## снять дамп памяти для приложения? как это сделать?
Possible options from the link.
###### Relative links:
+ https://www.baeldung.com/java-heap-dump-capture

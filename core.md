# Core
- [What's new in Java 8?](#whats-new-in-java-8)
- [What are the memory types in Java?](#what-are-the-memory-types-in-java)
- [What is java agent?](#what-is-java-agent)
- [Possible Performance Tools for Java?](#possible-performance-tools-for-java)
- [What is java profiler?](#what-is-java-profiler)
- [What is stop the world?](#what-is-stop-the-world)
- [What is the difference between int, Integer and AtomicInteger?](#what-is-the-difference-between-int-integer-and-atomicinteger)
- [How i++ will work for Integer?](#how-i-will-work-for-integer)
- [What can you say about interface constants?](#what-can-you-say-about-interface-constants)
- [What is the contract between equals and hashcode?](#what-is-the-contract-between-equals-and-hashcode)
- [What are the rules for overriding equals/hashcode methods?](#what-are-the-rules-for-overriding-equalshashcode-methods)
- [Are the same fields needed for equals/hashcode implementation?](#are-the-same-fields-needed-for-equalshashcode-implementation)
- [What are the purposes of inner classes?](#what-are-the-purposes-of-inner-classes)
- [What is better interfaces or abstract classes?](#what-is-better-interfaces-or-abstract-classes)
- [Do inner classes have access to private fields from outer class?](#do-inner-classes-have-access-to-private-fields-from-outer-class)
- [What are the differences between static nested classes and non-static nested classes?](#what-are-the-differences-between-static-nested-classes-and-non-static-nested-classes)
- [What are the methods of Object class?](#what-are-the-methods-of-object-class)
- [What is Jmeter?](#what-is-jmeter)
- [Possible Ways to Capture Java Heap Dumps?](#possible-ways-to-capture-java-heap-dumps)
- [What is the result of this code:](#what-is-the-result-of-this-code)
- [Are checked exceptions bad?](#are-checked-exceptions-bad)
- [How var in Java 10 can be used?](#how-var-in-java-10-can-be-used)
- [What is functional interface?](#what-is-functional-interface)
- [Functional interfaces vs abstract classes?](#functional-interfaces-vs-abstract-classes)
- [Why getters/setters?](#why-getterssetters)
- [Serialization?](#serialization)
- [Deserialization after changes in class? Possible issues?](#deserialization-after-changes-in-class-possible-issues)
- [What is the difference between cohesion and coupling?](#what-is-the-difference-between-cohesion-and-coupling)
- [@Override annotation?](#override-annotation)
- [Java modifiers?](#java-modifiers)
- [Exception Hierarchy?](#exception-hierarchy)
- [One exception is thrown by catch block and another one is thrown from finally block, which exception will be thrown by method?](#one-exception-is-thrown-by-catch-block-and-another-one-is-thrown-from-finally-block-which-exception-will-be-thrown-by-method)
- [Is it possible to serialize lambda expression?](#is-it-possible-to-serialize-lambda-expression)
- [Why can Java Collections not directly store Primitives types?](#why-can-java-collections-not-directly-store-primitives-types)
- [How is recursion implemented in Java?](#how-is-recursion-implemented-in-java)
- [Is it needed to document unchecked exceptions?](#is-it-needed-to-document-unchecked-exceptions)
- [Java Date classes?](#java-date-classes)
- [Why Do Local Variables Used in Lambdas Have to Be Final or Effectively Final?](#why-do-local-variables-used-in-lambdas-have-to-be-final-or-effectively-final)
- [orElse() vs orElseGet() in Optional?](#orelse-vs-orelseget-in-optional)
- [How to filter list of objects using Stream API without .filter()?](#howto-filter-list-of-objects-using-stream-without-filter)

## What's new in Java 8?
+ Lambda expressions, Method Reference , Optional, Streams added.
+ Advanced Date , Time, Zone and Calendar Classes introduced.
+ PermGen Removed.
###### Relative links:
+ https://codete.com/blog/java-8-java-11-quick-guide/
+ https://www.quora.com/What-are-the-differences-between-Java-8-9-10-and-11

## What are the memory types in Java?
+ ***Stack.*** Stack memory is responsible for holding references to heap objects and for storing value types (also known in Java as primitive types), which hold the value itself rather than a reference to an object from the heap.
+ ***Heap.*** This part of memory stores the actual object in memory. Those are referenced by the variables from the stack.
###### Relative links:
+ https://dzone.com/articles/java-memory-management

## What is java agent?
Java agents are able to “intrude” into the execution of Java applications running on the JVM at runtime by performing the direct modifications of the bytecode. Java agents are extremely as powerful as dangerous: they can do mostly everything however if something goes wrong, they can easily crash the JVM.
###### Relative links:
+ https://www.javacodegeeks.com/2015/09/java-agents.html
+ https://javabeat.net/introduction-to-java-agents/
+ https://docs.oracle.com/javase/7/docs/api/java/lang/instrument/package-summary.html

## Possible Performance Tools for Java?
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

## What is java profiler?
A Java Profiler is a tool that monitors Java bytecode constructs and operations at the JVM level. These code constructs and operations include object creation, iterative executions (including recursive calls), method executions, thread executions, and garbage collections.
###### Relative links:
+ https://www.baeldung.com/java-profilers

## What is stop the world?
Stop-the-world will occur no matter which GC algorithm you choose. Stop-the-world means that the JVM is stopping the application from running to execute a GC. When stop-the-world occurs, every thread except for the threads needed for the GC will stop their tasks. The interrupted tasks will resume only after the GC task has completed. GC tuning often means reducing this stop-the-world time.
###### Relative links:
+ https://www.cubrid.org/blog/understanding-java-garbage-collection
+ https://stackoverflow.com/questions/16695874/why-does-the-jvm-full-gc-need-to-stop-the-world

## What is the difference between int, Integer and AtomicInteger?
+ ***int*** is a primitive type. Variables of type int store the actual binary value for the integer you want to represent. int.parseInt("1") doesn't make sense because int is not a class and therefore doesn't have any methods.
+ ***Integer*** is a class, no different from any other in the Java language. Variables of type Integer store references to Integer objects, just as with any other reference (object) type. Integer.parseInt("1") is a call to the static method parseInt from class Integer (note that this method actually returns an int and not an Integer). To be more specific, Integer is a class with a single field of type int. This class is used where you need an int to be treated like any other object, such as in generic types or situations where you need nullability.
+ ***AtomicInteger*** is used in multithreaded environments when you need to make sure that only one thread can update an int variable. The advantage is that no external synchronization is requried since the operations which modify it's value are executed in a thread-safe way.
###### Relative links:
+ https://stackoverflow.com/questions/8660691/what-is-the-difference-between-integer-and-int-in-java
+ https://stackoverflow.com/questions/38846976/what-is-the-difference-between-atomic-integer-and-normal-immutable-integer-class

## How i++ will work for Integer?
variable will be changed
###### Relative links:
+ https://stackoverflow.com/questions/13280134/why-does-post-increment-work-on-wrapper-classes

## What can you say about interface constants?
The constant interface pattern is a poor use of interfaces. That a class uses some constants internally is an implementation detail. Implementing a constant interface causes this implementation detail to leak into the class's exported API. It is of no consequence to the users of a class that the class implements a constant interface. In fact, it may even confuse them. Worse, it represents a commitment: if in a future release the class is modified so that it no longer needs to use the constants, it still must implement the interface to ensure binary compatibility. If a nonfinal class implements a constant interface, all of its subclasses will have their namespaces polluted by the constants in the interface. There are several constant interfaces in the java platform libraries, such as java.io.ObjectStreamConstants. These interfaces should be regarded as anomalies and should not be emulated.
###### Relative links:
+ https://stackoverflow.com/questions/2659593/what-is-the-use-of-interface-constants

## What is the contract between equals and hashcode?
objects which are .equals() MUST have the same .hashCode().
###### Relative links:
+ https://stackoverflow.com/questions/17027777/relationship-between-hashcode-and-equals-method-in-java

## What are the rules for overriding equals/hashcode methods?
+ Always use same attributes of an object to generate hashCode() and equals() both.
+ equals() must be consistent (if the objects are not modified, then it must keep returning the same value).
+ Whenever a.equals(b), then a.hashCode() must be same as b.hashCode().
+ If you override one, then you should override the other.
###### Relative links:
+ https://howtodoinjava.com/java/basics/java-hashcode-equals-methods/

## Are the same fields needed for equals/hashcode implementation?
The fields don't have to be the same. The requirement is for two objects that are equal, they must have the same hash code. If they have the same hash code, they don't have to be equal. For example, you could return 1 as your hash code always, and you would obey the hash code contract, no matter what fields you used in your equals method. Returning 1 all the time would improve the computation time of hashCode, but HashMap's performance would drop since it would have to resort to equals() more often.
###### Relative links:
+ https://stackoverflow.com/questions/22827652/different-fields-for-equals-and-hashcode

## What are the purposes of inner classes?
+ It is a way of logically grouping classes that are only used in one place.
+ It increases encapsulation.
+ It can lead to more readable and maintainable code.
###### Relative links:
+ https://stackoverflow.com/questions/11398122/what-are-the-purposes-of-inner-classes
+ https://docs.oracle.com/javase/tutorial/java/javaOO/nested.html

## What is better interfaces or abstract classes?
Use abstract classes when you have a class that A is kind of B and interface when A can do B.
+ A class can implement multiple interfaces, but it can only extend one abstract class.
+ Interfaces allow the creation of proxies that encapsulate a concrete class. This is used extensively by frameworks in order to intercept method calls to the concrete class (e.g., for starting a transaction before the method is executed or to write to the log).
###### Relative links:
+ https://stackoverflow.com/questions/2971265/situation-where-interface-is-better-than-abstract-class
+ https://stackoverflow.com/questions/11889588/choosing-interface-or-abstract-class

## Do inner classes have access to private fields from outer class?
Inner classes has access to private fields from outer class.
###### Relative links:
+ https://www.geeksforgeeks.org/nested-classes-java/

## What are the differences between static nested classes and non-static nested classes?
+ Static nested classes do not directly have access to other members(non-static variables and methods) of the enclosing class because as it is static, it must access the non-static members of its enclosing class through an object. That is, it cannot refer to non-static members of its enclosing class directly. Because of this restriction, static nested classes are seldom used.
+ Non-static nested classes (inner classes) has access to all members(static and non-static variables and methods, including private) of its outer class and may refer to them directly in the same way that other non-static members of the outer class do.
###### Relative links:
+ https://www.geeksforgeeks.org/nested-classes-java/
+ https://stackoverflow.com/questions/253492/static-nested-class-in-java-why

## What are the methods of Object class?
toString(), hashCode(), equals(Object obj), getClass(), finalize(), clone(), wait(), notify() notifyAll()
###### Relative links:
+ https://www.geeksforgeeks.org/object-class-in-java/

## What is Jmeter?
Apache JMeter is an open source, Java-based, load testing tool that can be used to analyze the functional behavior of a system and measure the performance of a system under a load test. A load test will simulate end-user behavior that approach the limits of an application’s specifications. Apache JMeter can be used to simulate varying or heavy loads on singular or multiple servers, networks or objects to test a system’s strength.
###### Relative links:
+ https://searchsoftwarequality.techtarget.com/definition/Apache-JMeter

## Possible Ways to Capture Java Heap Dumps?
Possible options from the link.
###### Relative links:
+ https://www.baeldung.com/java-heap-dump-capture

## What is the result of this code:
```java
public static void main(String[] args) {
    Point pnt1 = new Point(0, 0);
    Point pnt2 = new Point(0, 0);
    System.out.println("X: " + pnt1.x + " Y: " + pnt1.y);
    System.out.println("X: " + pnt2.x + " Y: " + pnt2.y);
    System.out.println(" ");
    tricky(pnt1, pnt2);
    System.out.println("X: " + pnt1.x + " Y:" + pnt1.y);
    System.out.println("X: " + pnt2.x + " Y: " + pnt2.y);
}

public void tricky(Point arg1, Point arg2) {
    arg1.x = 100;
    arg1.y = 100;
    Point temp = arg1;
    arg1 = arg2;
    arg2 = temp;
}
```

If we execute this main() method, we see the following output:
```
X: 0 Y: 0
X: 0 Y: 0
X: 100 Y: 100
X: 0 Y: 0
```
The method successfully alters the value of pnt1, even though it is passed by value; however, a swap of pnt1 and pnt2 fails! This is the major source of confusion. In the main() method, pnt1 and pnt2 are nothing more than object references. When you pass pnt1 and pnt2 to the tricky() method, Java passes the references by value just like any other parameter. This means the references passed to the method are actually copies of the original references. 
###### Relative links:
- https://www.javaworld.com/article/2077424/learn-java-does-java-pass-by-reference-or-pass-by-value.html

## Are checked exceptions bad?
###### Relative links:
- https://www.javaworld.com/article/3142626/are-checked-exceptions-good-or-bad.html
- https://www.yegor256.com/2015/07/28/checked-vs-unchecked-exceptions.html
- https://medium.com/@eob/checked-exceptions-considered-evil-f7d07e051fa6

## How var in Java 10 can be used?
###### Relative links:
- https://dzone.com/articles/finally-java-10-has-var-to-declare-local-variables

## What is functional interface?
###### Relative links:
- https://www.geeksforgeeks.org/functional-interfaces-java/

## Functional interfaces vs abstract classes?
###### Relative links:
- https://stackoverflow.com/questions/19998454/interface-with-default-methods-vs-abstract-class-in-java-8

## Why getters/setters?
###### Relative links:
- https://stackoverflow.com/questions/1568091/why-use-getters-and-setters-accessors

## Serialization?
###### Relative links:
- https://dev.to/njnareshjoshi/what-is-serialization-everything-you-need-to-know-about-java-serialization-explained-with-example-9mj

## Deserialization after changes in class? Possible issues?
###### Relative links:
- https://howtodoinjava.com/java/serialization/a-mini-guide-for-implementing-serializable-interface-in-java/

## What is the difference between cohesion and coupling?
###### Relative links:
- https://stackoverflow.com/questions/3085285/difference-between-cohesion-and-coupling

## @Override annotation?
###### Relative links:
- https://www.tutorialspoint.com/importance-of-override-annotation-in-java

## Java modifiers?
###### Relative links:
- https://www.tutorialspoint.com/java/java_modifier_types.htm

## Exception Hierarchy?
###### Relative links:
- https://www.geeksforgeeks.org/exceptions-in-java/

## One exception is thrown by catch block and another one is thrown from finally block, which exception will be thrown by method?
###### Relative links:
- https://stackoverflow.com/questions/3779285/exception-thrown-in-catch-and-finally-clause

## Is it possible to serialize lambda expression?
###### Relative links:
- https://stackoverflow.com/questions/22807912/how-to-serialize-a-lambda

## Why can Java Collections not directly store Primitives types?
It's a combination of two facts:
- Java primitive types are not reference types (e.g. an int is not an Object)
- Java does generics using type-erasure of reference types (e.g. a List<?> is really a List<Object> at run-time)
###### Relative links:
- https://stackoverflow.com/questions/2504959/why-can-java-collections-not-directly-store-primitives-types

## How is recursion implemented in Java?
###### Relative links:
- https://freecontent.manning.com/stack-safe-recursion-in-java/

## Is it needed to document unchecked exceptions?
###### Relative links:
- https://books.google.by/books?id=ka2VUBqHiWkC&pg=PA252&lpg=PA252&dq=java+is+it+needed+document+unchecked+exceptions&source=bl&ots=y_KhOeo_M3&sig=ACfU3U0TpATCoEC62Irm3SaPj6tMWDnZLQ&hl=en&sa=X&ved=2ahUKEwiS7_vG4OvnAhXF8qQKHeniBtIQ6AEwD3oECAkQAQ#v=onepage&q&f=false

## Java Date classes?
###### Relative links:
- https://www.baeldung.com/java-8-date-time-intro

## Why Do Local Variables Used in Lambdas Have to Be Final or Effectively Final?
###### Relative links:
- https://www.baeldung.com/java-lambda-effectively-final-local-variables

## orElse() vs orElseGet() in Optional?
###### Relative links:
- https://www.baeldung.com/java-optional-or-else-vs-or-else-get

## How to filter list of objects using Stream API without .filter()?
```java
public static void main(String[] args) {

       final List<Person> list = Arrays.asList(Person.builder().setAge(25).build(), Person.builder().setAge(10).build(),
               Person.builder().setAge(15).build(), Person.builder().setAge(21).build());

        list.stream()
                .flatMap(person -> person.getAge() < 18 ? Stream.of(person) : Stream.empty())
                .forEach(person -> System.out.println(person.getAge()));
    }
```

[Home Page](README.md)

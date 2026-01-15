# Core
- [What is the difference between JDK and JRE?](#what-is-the-difference-between-jdk-and-jre)
- [What is ClassLoader? What are the types of class loaders?](#what-is-classloader-what-are-the-types-of-class-loaders)
- [What's new in Java 8?](#whats-new-in-java-8)
- [What are the memory types in Java?](#what-are-the-memory-types-in-java)
- [What is java agent?](#what-is-java-agent)
- [Possible Performance Tools for Java?](#possible-performance-tools-for-java)
- [What is java profiler?](#what-is-java-profiler)
- [What is stop the world?](#what-is-stop-the-world)
- [What is the difference between int, Integer and AtomicInteger?](#what-is-the-difference-between-int-integer-and-atomicinteger)
- [How does post-increment work for wrapper classes (for example, Integer)?](#how-does-post-increment-work-for-wrapper-classes-for-example-integer)
- [What can you say about interface constants?](#what-can-you-say-about-interface-constants)
- [What is the contract between equals and hashcode?](#what-is-the-contract-between-equals-and-hashcode)
- [What are the purposes of inner classes?](#what-are-the-purposes-of-inner-classes)
- [Why composition is preferred over inheritance?](#why-composition-is-preferred-over-inheritance)
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
- [How is recursion implemented in Java?](#how-is-recursion-implemented-in-java)
- [Is it needed to document unchecked exceptions?](#is-it-needed-to-document-unchecked-exceptions)
- [Java Date classes?](#java-date-classes)
- [Why Do Local Variables Used in Lambdas Have to Be Final or Effectively Final?](#why-do-local-variables-used-in-lambdas-have-to-be-final-or-effectively-final)
- [orElse() vs orElseGet() in Optional?](#orelse-vs-orelseget-in-optional)
- [How to filter list of objects using Stream API without .filter()?](#how-to-filter-list-of-objects-using-stream-api-without-filter)
- [What is String Pool? How do Strings get there?](#what-is-string-pool-how-do-strings-get-there)
- [What is the difference between StringBuilder and StringBuffer?](#what-is-the-difference-between-stringbuilder-and-stringbuffer)
- [Difference between <? super T> and <? extends T> ?](#difference-between-superT-and-extendsT)
- [How does JIT compiler work?](#how-does-jit-compiler-work)
- [Mutable vs Immutable object?](#mutable-vs-immutable-object)
- [Provide some examples when a finally block won't be executed in Java?](#provide-some-examples-when-a-finally-block-wont-be-executed-in-java)
- [What is type erasure?](#what-is-type-erasure)
- [What is built-in mechanism for creating singletons in Java?](#what-is-built-in-mechanism-for-creating-singletons-in-java)
- [How to understand a third-party library without source code?](#how-to-understand-a-third-party-library-without-source-code)

## What is the difference between JDK and JRE?
JRE runs Java programs. JDK is JRE + development tools.
###### Relative links:
+ https://www.geeksforgeeks.org/java/differences-jdk-jre-jvm/

## What is ClassLoader? What are the types of class loaders?
***ClassLoader*** is a subsystem of JVM responsible for loading class files into memory during runtime. Types of ClassLoader:
+ ***Bootstrap*** loads JDK internal classes, typically ***rt.jar*** and other core libs.
+ ***Platform*** loads standard core Java classes.
+ ***System*** loads classes from classpath.
###### Relative links:
+ https://www.baeldung.com/java-classloaders

## What's new in Java 8?
+ Lambda expressions, Method Reference, Optional, Streams added.
+ Advanced Date, Time, Zone and Calendar Classes introduced.
+ PermGen Removed.
###### Relative links:
+ https://www.oracle.com/java/technologies/javase/8-whats-new.html

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
+ https://stackoverflow.com/questions/16695874/why-does-the-jvm-full-gc-need-to-stop-the-world

## What is the difference between int, Integer and AtomicInteger?
+ ***int*** is a primitive type. Variables of type int store the actual binary value for the integer you want to represent. int.parseInt("1") doesn't make sense because int is not a class and therefore doesn't have any methods.
+ ***Integer*** is a class, no different from any other in the Java language. Variables of type Integer store references to Integer objects, just as with any other reference (object) type. Integer.parseInt("1") is a call to the static method parseInt from class Integer (note that this method actually returns an int and not an Integer). To be more specific, Integer is a class with a single field of type int. This class is used where you need an int to be treated like any other object, such as in generic types or situations where you need nullability.
+ ***AtomicInteger*** is used in multithreaded environments when you need to make sure that only one thread can update an int variable. The advantage is that no external synchronization is requried since the operations which modify it's value are executed in a thread-safe way.
###### Relative links:
+ https://stackoverflow.com/questions/8660691/what-is-the-difference-between-integer-and-int-in-java
+ https://stackoverflow.com/questions/38846976/what-is-the-difference-between-atomic-integer-and-normal-immutable-integer-class

## How does post-increment work for wrapper classes (for example, Integer)?
The result is assigned to a variable of the corresponding wrapper class (autoboxing/autounboxing feature).
###### Relative links:
+ https://docs.oracle.com/javase/tutorial/java/data/autoboxing.html

## What can you say about interface constants?
It goes against the purpose of an interface. When we create an interface full of constants, we’re not defining any behavior.
###### Relative links:
+ https://www.baeldung.com/java-constants-good-practices

## What is the contract between equals and hashcode?
+ Use same properties in both equals() and hashCode() method implementations, so that their contract doesn’t violate when any properties is updated.
+ It’s better to use immutable objects as Hash table key so that we can cache the hash code rather than calculating it on every call. That’s why String is a good candidate for Hash table key because it’s immutable and cache the hash code value.
+ Implement hashCode() method so that least number of hash collision occurs and entries are evenly distributed across all the buckets.
###### Relative links:
+ https://www.digitalocean.com/community/tutorials/java-equals-hashcode#best-practices-for-implementing-equals-and-hashcode-method

## What are the purposes of inner classes?
+ It is a way of logically grouping classes that are only used in one place.
+ It increases encapsulation.
+ It can lead to more readable and maintainable code.
###### Relative links:
+ https://stackoverflow.com/questions/11398122/what-are-the-purposes-of-inner-classes
+ https://docs.oracle.com/javase/tutorial/java/javaOO/nested.html

## Why composition is preferred over inheritance?
Inheritance is tightly coupled whereas composition is loosely coupled.
###### Relative links:
+ https://www.digitalocean.com/community/tutorials/composition-vs-inheritance
+ https://dev.to/leapcell/from-java-to-go-why-composition-is-preferred-over-inheritance-17h4

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

## What is String Pool? How do Strings get there?
String pool is the special memory region where Strings are stored by the JVM.
###### Relative links:
- https://www.baeldung.com/java-string-pool

## What is the difference between StringBuilder and StringBuffer?
All public methods of StringBuffer are synchronized, it provides Thread safety but on a performance cost.

## Difference between <? super T> and <? extends T> ?
###### Relative links:
- https://stackoverflow.com/questions/4343202/difference-between-super-t-and-extends-t-in-java

## How does JIT compiler work?
###### Relative links:
- https://aboullaite.me/understanding-jit-compiler-just-in-time-compiler/

## Mutable vs Immutable object?
###### Relative links:
- https://www.interviewcake.com/concept/java/mutable#:~:text=A%20mutable%20object%20can%20be,an%20immutable%20object%20can't.&text=That%20said%2C%20if%20you're,all%20fields%20final%20and%20private.&text=Strings%20are%20immutable%20in%20Java.
- https://www.edureka.co/blog/java-mutable-and-immutable-objects/

## Provide some examples when a finally block won't be executed in Java?
If the JVM exits while the try or catch code is being executed, then the finally block may not execute. Likewise, if the thread executing the try or catch code is interrupted or killed, the finally block may not execute even though the application as a whole continues.
###### Relative links:
- https://stackoverflow.com/questions/2417958/is-there-possibility-that-a-finally-block-might-not-execute

## What is type erasure?
Type erasure removes all type parameters and replaces them with their bounds or with Object if the type parameter is unbounded. This way, the bytecode after compilation contains only normal classes, interfaces and methods, ensuring that no new types are produced. Proper casting is applied as well to the Object type at compile time.
###### Relative links:
- https://www.baeldung.com/java-generics

## What is built-in mechanism for creating singletons in Java?
Java enum
###### Relative links:
- https://dzone.com/articles/java-singletons-using-enum

## How to understand a third-party library without source code?
One way to understand how a third-party library works without its source code is by using a **decompiler**. A decompiler converts the compiled bytecode (e.g., `.class` files in Java) back into readable source code.

[Home Page](README.md)

# Patterns
+ [Какие знаешь архитектурные паттерны?](#какие-знаешь-архитектурные-паттерны)
+ [В чем суть single responsibility?](#в-чем-суть-single-responsibility)
+ [Отличия фасада от proxy/gateway?](#отличия-фасада-от-proxygateway)
+ [что можно предложить вместо констуктора с большим количеством параметров?](#что-можно-предложить-вместо-констуктора-с-большим-количеством-параметров)
+ [как реализовать builder?](#как-реализовать-builder)
+ [Что можете рассказать о паттерне визитор?](#что-можете-рассказать-о-паттерне-визитор)
+ [какую проблему решает визитор?](#какую-проблему-решает-визитор)
+ [Что можете рассказать о паттерне observer?](#что-можете-рассказать-о-паттерне-observer)
+ [как инициализировать классы в зависимости от типа?](#как-инициализировать-классы-в-зависимости-от-типа)

## Какие знаешь архитектурные паттерны?
+ Layered Pattern
+ Microkernel
+ CQRS
+ Event Sourcing
+ Microservices
###### Relative links:
+ https://dzone.com/articles/software-architecture-the-5-patterns-you-need-to-k

## В чем суть single responsibility?
Every module should have one single responsibility. This means two separate concerns/responsibilities/tasks should always be implemented in separate modules. Robert C. Martin defines a “responsibility” as a “reason to change”. If a module has several responsibilities, there are several reasons to change this module—namely the requirements for each responsibility may change. On the other hand a reason to change a module also means that it is the responsibility of the module to implement the aspect that is changed.
###### Relative links:
+ http://www.principles-wiki.net/principles:single_responsibility_principle
+ https://javarush.ru/groups/posts/osnovnye-principy-dizajna-klassov-solid-v-java

## Отличия фасада от proxy/gateway?
Reviewing Facade in the GoF book and the link in another answer to Martin Fowler's Gateway, it appears that their focus is in opposite directions.
Facade provides a simple uniform view of complex internals to (one or more)external clients;
Gateway provides a simple uniform view of external resources to the internals of an application.
This distinction lets us focus on which is more important in a design :
With the Facade, the external system is our customer; it is better to add complexity facing inwards if it makes the external interface simpler.
With the Gateway, the internal system is our customer; give it all the help we can, even if the externals are more complex.
###### Relative links:
+ https://stackoverflow.com/questions/4422211/what-is-the-difference-between-facade-and-gateway-design-patterns

## что можно предложить вместо констуктора с большим количеством параметров?
Builder pattern.
###### Relative links:
+ https://stackoverflow.com/questions/222214/managing-constructors-with-many-parameters-in-java

## как реализовать builder?
We will configure all of the fields that we want on the builder, and then we'll use the builder to create models. At the same time, we'll remove the public constructor from the class and replace it with a private constructor so that models can only be created via the builder.
###### Relative links:
+ https://dzone.com/articles/design-patterns-the-builder-pattern

## Что можете рассказать о паттерне визитор?
The core of this pattern is the Visitor interface. This interface defines a visit operation for each type of ConcreteElement in the object structure. Meanwhile, the ConcreteVisitor implements the operations defined in the Visitor interface. The concrete visitor will store local state, typically as it traverses the set of elements. The element interface simply defines an accept method to allow the visitor to run some action over that element - the ConcreteElement will implement this accept method. 
###### Relative links:
+ https://dzone.com/articles/design-patterns-visitor
+ https://refactoring.guru/ru/design-patterns/visito

## какую проблему решает визитор?
So, while the Visitor may seem a bit strange at first, you can see how much it helps to clean up your code. That's the whole point of this pattern - to allow you seperate out certain logic from the elements themselves, keeping your data classes simple.
###### Relative links:
+ https://dzone.com/articles/design-patterns-visitor
+ https://refactoring.guru/ru/design-patterns/visitor

## Что можете рассказать о паттерне observer?
Observer is a behavioral design pattern. It specifies communication between objects: observable and observers. An observable is an object which notifies observers about the changes in its state.
###### Relative links:
+ https://www.baeldung.com/java-observer-pattern

## как инициализировать классы в зависимости от типа?
Abstract Factory, Factory method
###### Relative links:
+ https://www.geeksforgeeks.org/design-patterns-set-2-factory-method/
+ https://www.geeksforgeeks.org/abstract-factory-pattern/




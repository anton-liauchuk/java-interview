#Patterns
+ [Архитектурные паттерны в целом?](#алгоритмическая-сложность-get-в-hashmap)

## Архитектурные паттерны в целом?
###### Relative links:
+ https://dzone.com/articles/software-architecture-the-5-patterns-you-need-to-k

## single responsibility в чем суть?
###### Relative links:
+ https://javarush.ru/groups/posts/osnovnye-principy-dizajna-klassov-solid-v-java

## в чем проблема с классом с кучей статических внутренних классов с точки зрения безопасности?
###### Relative links:

## отличия фасада от proxy/gateway?
Reviewing Facade in the GoF book and the link in another answer to Martin Fowler's Gateway, it appears that their focus is in opposite directions.
Facade provides a simple uniform view of complex internals to (one or more)external clients;
Gateway provides a simple uniform view of external resources to the internals of an application.
This distinction lets us focus on which is more important in a design :
With the Facade, the external system is our customer; it is better to add complexity facing inwards if it makes the external interface simpler.
With the Gateway, the internal system is our customer; give it all the help we can, even if the externals are more complex.
###### Relative links:
+ https://stackoverflow.com/questions/4422211/what-is-the-difference-between-facade-and-gateway-design-patterns

## чем плох конструктор на 15 параметров?

## что можно предложить вместо констуктора с большим количеством параметров?

## паттерн визитор?
###### Relative links:
+ https://refactoring.guru/ru/design-patterns/visito
+ https://dzone.com/articles/design-patterns-visitorr

## какую проблему решает визитор?
###### Relative links:
https://refactoring.guru/ru/design-patterns/visitor

## как сделать builder?

## pattern observer?

## как инициализировать классы в зависимости от типа?




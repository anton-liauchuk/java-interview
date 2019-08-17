# Concurrency

## Методы wait/notify для чего используются?
Эти методы определены у класса Object и предназначены для взаимодействия потоков между собой при межпоточной синхронизации.
+ wait(): освобождает монитор и переводит вызывающий поток в состояние ожидания до тех пор, пока другой поток не вызовет метод notify()/notifyAll();
+ notify(): продолжает работу потока, у которого ранее был вызван метод wait();
+ notifyAll(): возобновляет работу всех потоков, у которых ранее был вызван метод wait().
###### Relative links:
+ https://github.com/enhorse/java-interview/blob/master/concurrency.md#%D0%BA%D0%B0%D0%BA-%D1%80%D0%B0%D0%B1%D0%BE%D1%82%D0%B0%D1%8E%D1%82-%D0%BC%D0%B5%D1%82%D0%BE%D0%B4%D1%8B-wait-%D0%B8-notifynotifyall

## Где может быть использован метод wait?
synchronized
###### Relative links:
+ https://stackoverflow.com/questions/2779484/why-must-wait-always-be-in-synchronized-block
+ https://github.com/enhorse/java-interview/blob/master/concurrency.md#%D0%BF%D0%BE%D1%87%D0%B5%D0%BC%D1%83-%D0%BC%D0%B5%D1%82%D0%BE%D0%B4%D1%8B-wait-%D0%B8-notify-%D0%B2%D1%8B%D0%B7%D1%8B%D0%B2%D0%B0%D1%8E%D1%82%D1%81%D1%8F-%D1%82%D0%BE%D0%BB%D1%8C%D0%BA%D0%BE-%D0%B2-%D1%81%D0%B8%D0%BD%D1%85%D1%80%D0%BE%D0%BD%D0%B8%D0%B7%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%BD%D0%BE%D0%BC-%D0%B1%D0%BB%D0%BE%D0%BA%D0%B5

## Что такое synchronized? как использовать?
A piece of logic marked with synchronized becomes a synchronized block, allowing only one thread to execute at any given time.
###### Relative links:
+ https://www.baeldung.com/java-synchronized

## Ключевое слово volatile для чего используется?
the volatile modifier guarantees that any thread that reads a field will see the most recently written value.
###### Relative links:
+ https://stackoverflow.com/questions/106591/what-is-the-volatile-keyword-useful-for

## Как volatile связано с happens before?
###### Relative links:
+ https://github.com/enhorse/java-interview/blob/master/concurrency.md#%D1%80%D0%B0%D1%81%D1%81%D0%BA%D0%B0%D0%B6%D0%B8%D1%82%D0%B5-%D0%BE-%D0%BC%D0%BE%D0%B4%D0%B5%D0%BB%D0%B8-%D0%BF%D0%B0%D0%BC%D1%8F%D1%82%D0%B8-java

## какие есть concurrent коллекции?
+ ConcurrentHashMap
+ CopyOnWriteArrayList/CopyOnWriteArraySet
+ BlockingQueue
###### Relative links:
+ https://habr.com/ru/company/luxoft/blog/157273/
+ https://medium.com/coding-corpus/concurrent-collections-in-java-9b131e41b3ad


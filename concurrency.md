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
the volatile modifier guarantees that any thread that reads a field will see the most recently written value. In Java, each thread has a separate memory space known as working memory; this holds the values of different variables used for performing operations. After performing an operation, thread copies the updated value of the variable to the main memory, and from there other threads can read the latest value. Simply put, the volatile keyword marks a variable to always go to main memory, for both reads and writes, in the case of multiple threads accessing it.
###### Relative links:
+ https://stackoverflow.com/questions/106591/what-is-the-volatile-keyword-useful-for
+ https://www.baeldung.com/java-volatile

## Как volatile связано с happens before?
###### Relative links:
+ https://github.com/enhorse/java-interview/blob/master/concurrency.md#%D1%80%D0%B0%D1%81%D1%81%D0%BA%D0%B0%D0%B6%D0%B8%D1%82%D0%B5-%D0%BE-%D0%BC%D0%BE%D0%B4%D0%B5%D0%BB%D0%B8-%D0%BF%D0%B0%D0%BC%D1%8F%D1%82%D0%B8-java

## Какие есть concurrent коллекции?
+ ConcurrentHashMap
+ CopyOnWriteArrayList/CopyOnWriteArraySet
+ BlockingQueue
###### Relative links:
+ https://habr.com/ru/company/luxoft/blog/157273/
+ https://medium.com/coding-corpus/concurrent-collections-in-java-9b131e41b3ad

## Что можете рассказать о CopyOnWriteArraylist?
Все операции по изменению коллекции (add, set, remove) приводят к созданию новой копии внутреннего массива. Тем самым гарантируется, что при проходе итератором по коллекции не кинется ConcurrentModificationException. Следует помнить, что при копировании массива копируются только референсы (ссылки) на объекты (shallow copy), т.ч. доступ к полям элементов не thread-safe. CopyOnWrite коллекции удобно использовать, когда write операции довольно редки, например при реализации механизма подписки listeners и прохода по ним.
###### Relative links:
+ https://habr.com/ru/company/luxoft/blog/157273/
+ https://medium.com/coding-corpus/concurrent-collections-in-java-9b131e41b3ad

## Что можете рассказать о ConcurrentHashMap?
Основные преимущества и особенности реализации ConcurrentHashMap:
+ Карта имеет схожий с hashmap интерфейс взаимодействия
+ Операции чтения не требуют блокировок и выполняются параллельно
+ Операции записи зачастую также могут выполняться параллельно без блокировок
+ При создании указывается требуемый concurrencyLevel, определяемый по статистике чтения и записи
+ Элементы карты имеют значение value, объявленное как volatile
###### Relative links:
+ https://habr.com/ru/post/132884/

## В чем преимущества ConcurrentHashMap перед HashTable?
ConcurrentHashMap uses multiple buckets to store data. This avoids read locks and greatly improves performance over a HashTable. Both are thread safe, but there are obvious performance wins with ConcurrentHashMap.
When you read from a ConcurrentHashMap using get(), there are no locks, contrary to the HashTable for which all operations are simply synchronized. HashTable was released in old versions of Java whereas ConcurrentHashMap is a java 5+ thing.
HashMap is the best thing to use in a single threaded application.
###### Relative links:
+ https://stackoverflow.com/questions/12646404/concurrenthashmap-and-hashtable-in-java

## Что такое синхронизированный доступ?
###### Relative links:


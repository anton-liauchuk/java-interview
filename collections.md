# Collections
+ [Алгоритмическая сложность get в Hashmap?](#алгоритмическая-сложность-get-в-hashmap)
+ [Алгоритмическая сложность при get для HashMap для ключей, у которых hashcode = 1?](#алгоритмическая-сложность-при-get-для-hashmap-для-ключей-у-которых-hashcode--1)
+ [Какие есть коллекции? интерфейсы? реализации?](#какие-есть-коллекции-интерфейсы-реализации)
+ [В чем разница между LinkedList и ArrayList?](#в-чем-разница-между-linkedlist-и-arraylist)
+ [Что лучше использовать LinkedList или ArrayList?](#что-лучше-использовать-linkedlist-или-arraylist)
+ [Устройство HashMap?](#устройство-hashmap)
+ [Какие существуют реализации Map?](#какие-существуют-реализации-map)
+ [Сложность удаления из связного списка последнего элемента?](#сложность-удаления-из-связного-списка-последнего-элемента)
+ [Различия между Set и Map?](#различия-между-set-и-map)
+ [Какие есть мапы для многопоточной среды?](#какие-есть-мапы-для-многопоточной-среды)

## Алгоритмическая сложность get в Hashmap?
It depends on many things. It's usually O(1), with a decent hash which itself is constant time... but you could have a hash which takes a long time to compute, and if there are multiple items in the hash map which return the same hash code, get will have to iterate over them calling equals on each of them to find a match.
###### Relative links:
+ https://stackoverflow.com/questions/4553624/hashmap-get-put-complexity

## Алгоритмическая сложность при get для HashMap для ключей, у которых hashcode = 1?
В случае возникновения коллизий объект node сохраняется в структуре данных "связанный список" и метод equals() используется для сравнения ключей. Это сравнения для поиска верного ключа в связанном списке -линейная операция и в худшем случае сложность равнa O(n). Для исправления этой проблемы в Java 8 после достижения определенного порога вместо связанных списков используются сбалансированные деревья. Это означает, что HashMap в начале сохраняет объекты в связанном списке, но после того, как колличество элементов в хэше достигает определенного порога происходит переход к сбалансированным деревьям. Что улучшает производительность в худшем случае с O(n) до O(log n).
###### Relative links:
+ https://habr.com/ru/post/421179/

## Какие есть коллекции? интерфейсы? реализации?
The collection interfaces are divided into two groups. The most basic interface, java.util.Collection, has the following descendants:
+ java.util.Set
+ java.util.SortedSet
+ java.util.NavigableSet
+ java.util.Queue
+ java.util.concurrent.BlockingQueue
+ java.util.concurrent.TransferQueue
+ java.util.Deque
+ java.util.concurrent.BlockingDeque

The other collection interfaces are based on java.util.Map and are not true collections. However, these interfaces contain collection-view operations, which enable them to be manipulated as collections. Map has the following offspring:
+ java.util.SortedMap
+ java.util.NavigableMap
+ java.util.concurrent.ConcurrentMap
+ java.util.concurrent.ConcurrentNavigableMap
###### Relative links:
+ https://docs.oracle.com/javase/8/docs/technotes/guides/collections/overview.html
+ https://habr.com/ru/post/237043/

## В чем разница между LinkedList и ArrayList?
From the hierarchy diagram, they all implement List interface. They are very similar to use. Their main difference is their implementation which causes different performance for different operations.  ArrayList is implemented as a resizable array. As more elements are added to ArrayList, its size is increased dynamically. It's elements can be accessed directly by using the get and set methods, since ArrayList is essentially an array. LinkedList is implemented as a double linked list. Its performance on add and remove is better than Arraylist, but worse on get and set methods.
###### Relative links:
+ https://dzone.com/articles/arraylist-vs-linkedlist-vs

## Что лучше использовать LinkedList или ArrayList?
The difference of their performance is obvious. LinkedList is faster in add and remove, but slower in get. Based on the complexity table and testing results, we can figure out when to use ArrayList or LinkedList. In brief, LinkedList should be preferred if: 
+ there are no large number of random access of element
+ there are a large number of add/remove operations
###### Relative links:
+ https://dzone.com/articles/arraylist-vs-linkedlist-vs
+ https://stackoverflow.com/questions/322715/when-to-use-linkedlist-over-arraylist-in-java

## Устройство HashMap?
Hashmap uses the array of Nodes(named as table), where Node has fields like the key, value (and much more). Here the Node is represented by class HashMapEntry. Basically, HashMap has an array where the key-value data is stored. It calculates the index in the array where the Node can be placed and it is placed there. Now while getting the element from HashMap, it again calculates the index of the element to retrieve and goes to the array index and returns the value of the element/Node(if exists).
###### Relative links:
+ https://medium.com/@mr.anmolsehgal/java-hashmap-internal-implementation-21597e1efec3
+ https://www.geeksforgeeks.org/java-util-hashmap-in-java/

## Какие существуют реализации Map?
+ Hashtable — хэш-таблица, методы которой синхронизированы. Не позволяет использовать null в качестве значения или ключа и не является упорядоченной.
+ HashMap — хэш-таблица. Позволяет использовать null в качестве значения или ключа и не является упорядоченной.
+ LinkedHashMap — упорядоченная реализация хэш-таблицы.
+ TreeMap — реализация основанная на красно-чёрных деревьях. Является упорядоченной и предоставляет возможность управлять порядком элементов в коллекции при помощи объекта Comparator, либо сохраняет элементы с использованием «natural ordering».
+ WeakHashMap — реализация хэш-таблицы, которая организована с использованием weak references для ключей (сборщик мусора автоматически удалит элемент из коллекции при следующей сборке мусора, если на ключ этого элемента нет жёстких ссылок).
###### Relative links:
+ https://github.com/enhorse/java-interview/blob/master/jcf.md#%D0%9D%D0%B0%D0%B7%D0%BE%D0%B2%D0%B8%D1%82%D0%B5-%D0%BE%D1%81%D0%BD%D0%BE%D0%B2%D0%BD%D1%8B%D0%B5-%D0%B8%D0%BD%D1%82%D0%B5%D1%80%D1%84%D0%B5%D0%B9%D1%81%D1%8B-jcf-%D0%B8-%D0%B8%D1%85-%D1%80%D0%B5%D0%B0%D0%BB%D0%B8%D0%B7%D0%B0%D1%86%D0%B8%D0%B8

## Сложность удаления из связного списка последнего элемента?
O(1)
###### Relative links:
+ https://stackoverflow.com/questions/322715/when-to-use-linkedlist-over-arraylist-in-java

## Различия между Set и Map?
Main differences between a Set and a Map in Java are:
+ Duplicate Elements: A Set does not allow inserting duplicate elements. A Map does not allow using duplicate keys, but it allows inserting duplicate values for unique keys.
+ Null values: A Set allows inserting maximum one null value. In a Map we can have single null key at most and any number of null values.
+ Ordering: A Set does not maintain any order of elements. Some of sub-classes of a Set can sort the elements in an order like LinkedHashSet. A Map does not maintain any order of its elements. Some of its sub-classes like TreeMap store elements of the map in ascending order of keys.
###### Relative links:
+ https://www.quora.com/What-is-the-difference-between-a-Set-and-a-Map-in-Java

## Какие есть мапы для многопоточной среды?
+ ConcurrentHashMap allows concurrent modification of the Map from several threads without the need to block them. Collections.synchronizedMap(map) creates a blocking Map which will degrade performance, albeit ensure consistency (if used properly).
+ Collections.synchronizedMap(Map) is the second option if you need to ensure data consistency, and each thread needs to have an up-to-date view of the map. Use the first if performance is critical, and each thread only inserts data to the map, with reads happening less frequently.
###### Relative links:
+ https://stackoverflow.com/questions/510632/whats-the-difference-between-concurrenthashmap-and-collections-synchronizedmap

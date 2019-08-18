# Collections
+ [Алгоритмическая сложность get в Hashmap?](#алгоритмическая-сложность-get-в-hashmap)
+ [Какие есть коллекции? интерфейсы? реализации?](#какие-есть-коллекции-интерфейсы-реализации)
+ [В чем разница между LinkedList и ArrayList?](#в-чем-разница-между-linkedlist-и-arraylist)
+ [Что лучше использовать LinkedList или ArrayList?](#что-лучше-использовать-linkedlist-или-arraylist)
+ [Устройство HashMap?](#устройство-hashmap)
+ [Реализации Map?](#реализации-map)
+ [Сложность удаления из связного списка последнего элемента?](#реализации-map)
+ [Различия между set и map?](#реализации-map)

## Алгоритмическая сложность get в Hashmap?
It depends on many things. It's usually O(1), with a decent hash which itself is constant time... but you could have a hash which takes a long time to compute, and if there are multiple items in the hash map which return the same hash code, get will have to iterate over them calling equals on each of them to find a match.
###### Relative links:
+ https://stackoverflow.com/questions/4553624/hashmap-get-put-complexity

## Алгоритмическая сложность при get для HashMap для ключей, у которыъ hashcode = 1?
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
###### Relative links:

## Что лучше использовать LinkedList или ArrayList?
###### Relative links:

## Устройство HashMap?
###### Relative links:

## Реализации Map?
+ Hashtable — хэш-таблица, методы которой синхронизированы. Не позволяет использовать null в качестве значения или ключа и не является упорядоченной.
+ HashMap — хэш-таблица. Позволяет использовать null в качестве значения или ключа и не является упорядоченной.
+ LinkedHashMap — упорядоченная реализация хэш-таблицы.
+ TreeMap — реализация основанная на красно-чёрных деревьях. Является упорядоченной и предоставляет возможность управлять порядком элементов в коллекции при помощи объекта Comparator, либо сохраняет элементы с использованием «natural ordering».
+ WeakHashMap — реализация хэш-таблицы, которая организована с использованием weak references для ключей (сборщик мусора автоматически удалит элемент из коллекции при следующей сборке мусора, если на ключ этого элемента нет жёстких ссылок).
###### Relative links:
+ https://github.com/enhorse/java-interview/blob/master/jcf.md#%D0%9D%D0%B0%D0%B7%D0%BE%D0%B2%D0%B8%D1%82%D0%B5-%D0%BE%D1%81%D0%BD%D0%BE%D0%B2%D0%BD%D1%8B%D0%B5-%D0%B8%D0%BD%D1%82%D0%B5%D1%80%D1%84%D0%B5%D0%B9%D1%81%D1%8B-jcf-%D0%B8-%D0%B8%D1%85-%D1%80%D0%B5%D0%B0%D0%BB%D0%B8%D0%B7%D0%B0%D1%86%D0%B8%D0%B8

## Сложность удаления из связного списка последнего элемента?
###### Relative links:

## Различия между Set и Map?
###### Relative links:

## Какие есть мапы для многопоточной среды?


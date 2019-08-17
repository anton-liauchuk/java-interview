# Collections
+ [Алгоритмическая сложность get в Hashmap?](#алгоритмическая-сложность-get-в-hashmap)
+ [Какие есть коллекции? интерфейсы? реализации?](#какие-есть-коллекции-интерфейсы-реализации)
+ [В чем разница между LinkedList и ArrayList?](#в-чем-разница-между-linkedlist-и-arraylist)
+ [Что лучше использовать LinkedList или ArrayList?](#что-лучше-использовать-linkedlist-или-arraylist)
+ [Устройство HashMap?](#устройство-hashmap)
+ [Реализации Map?](#реализации-map)

## Алгоритмическая сложность get в Hashmap?
It depends on many things. It's usually O(1), with a decent hash which itself is constant time... but you could have a hash which takes a long time to compute, and if there are multiple items in the hash map which return the same hash code, get will have to iterate over them calling equals on each of them to find a match.
###### Relative links:
+ https://stackoverflow.com/questions/4553624/hashmap-get-put-complexity

## Какие есть коллекции? интерфейсы? реализации?
###### Relative links:

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
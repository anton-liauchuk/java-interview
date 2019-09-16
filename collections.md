# Collections
- [What is the complexity for get in Hashmap?](#what-is-the-complexity-for-get-in-hashmap)
- [What is the complexity for get in Hashmap for keys with hashcode = 1?](#what-is-the-complexity-for-get-in-hashmap-for-keys-with-hashcode--1)
- [What is the hierarchy of collections?](#what-is-the-hierarchy-of-collections)
- [What is the difference between LinkedList and ArrayList?](#what-is-the-difference-between-linkedlist-and-arraylist)
- [What is better to use LinkedList or ArrayList?](#what-is-better-to-use-linkedlist-or-arraylist)
- [What is the implementation of HashMap?](#what-is-the-implementation-of-hashmap)
- [What are the implementations of Map?](#what-are-the-implementations-of-map)
- [What is the complexity of removing the last element from LinkedList?](#what-is-the-complexity-of-removing-the-last-element-from-linkedlist)
- [What are the differences between Set and Map?](#what-are-the-differences-between-set-and-map)
- [Possible maps in concurrency?](#possible-maps-in-concurrency)

## What is the complexity for get in Hashmap?
It depends on many things. It's usually O(1), with a decent hash which itself is constant time... but you could have a hash which takes a long time to compute, and if there are multiple items in the hash map which return the same hash code, get will have to iterate over them calling equals on each of them to find a match.
###### Relative links:
+ https://stackoverflow.com/questions/4553624/hashmap-get-put-complexity

## What is the complexity for get in Hashmap for keys with hashcode = 1?
If there are multiple items in the hash map which return the same hash code, get will have to iterate over them calling equals on each of them to find a match, so it's O(n) in this case.
###### Relative links:
+ https://stackoverflow.com/questions/4553624/hashmap-get-put-complexity

## What is the hierarchy of collections?
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

## What is the difference between LinkedList and ArrayList?
From the hierarchy diagram, they all implement List interface. They are very similar to use. Their main difference is their implementation which causes different performance for different operations.  ArrayList is implemented as a resizable array. As more elements are added to ArrayList, its size is increased dynamically. It's elements can be accessed directly by using the get and set methods, since ArrayList is essentially an array. LinkedList is implemented as a double linked list. Its performance on add and remove is better than Arraylist, but worse on get and set methods.
###### Relative links:
+ https://dzone.com/articles/arraylist-vs-linkedlist-vs

## What is better to use LinkedList or ArrayList?
The difference of their performance is obvious. LinkedList is faster in add and remove, but slower in get. Based on the complexity table and testing results, we can figure out when to use ArrayList or LinkedList. In brief, LinkedList should be preferred if: 
+ there are no large number of random access of element
+ there are a large number of add/remove operations
###### Relative links:
+ https://dzone.com/articles/arraylist-vs-linkedlist-vs
+ https://stackoverflow.com/questions/322715/when-to-use-linkedlist-over-arraylist-in-java

## What is the implementation of HashMap?
***HashMap*** uses the array of Nodes(named as table), where Node has fields like the key, value (and much more). Here the Node is represented by class HashMapEntry. Basically, HashMap has an array where the key-value data is stored. It calculates the index in the array where the Node can be placed and it is placed there. Now while getting the element from HashMap, it again calculates the index of the element to retrieve and goes to the array index and returns the value of the element/Node(if exists).
###### Relative links:
+ https://medium.com/@mr.anmolsehgal/java-hashmap-internal-implementation-21597e1efec3
+ https://www.geeksforgeeks.org/java-util-hashmap-in-java/

## What are the implementations of Map?
The Java platform contains three general-purpose Map implementations: ***HashMap***, ***TreeMap***, and ***LinkedHashMap***. Their behavior and performance are precisely analogous to HashSet, TreeSet, and LinkedHashSet
###### Relative links:
+ https://docs.oracle.com/javase/tutorial/collections/interfaces/map.html

## What is the complexity of removing the last element from LinkedList?
O(1)
###### Relative links:
+ https://stackoverflow.com/questions/322715/when-to-use-linkedlist-over-arraylist-in-java

## What are the differences between Set and Map?
Main differences between a ***Set*** and a ***Map*** in Java are:
+ Duplicate Elements: A Set does not allow inserting duplicate elements. A Map does not allow using duplicate keys, but it allows inserting duplicate values for unique keys.
+ Null values: A Set allows inserting maximum one null value. In a Map we can have single null key at most and any number of null values.
+ Ordering: A Set does not maintain any order of elements. Some of sub-classes of a Set can sort the elements in an order like LinkedHashSet. A Map does not maintain any order of its elements. Some of its sub-classes like TreeMap store elements of the map in ascending order of keys.
###### Relative links:
+ https://www.quora.com/What-is-the-difference-between-a-Set-and-a-Map-in-Java

## Possible maps in concurrency?
+ ***ConcurrentHashMap*** allows concurrent modification of the Map from several threads without the need to block them. Collections.synchronizedMap(map) creates a blocking Map which will degrade performance, albeit ensure consistency (if used properly).
+ ***Collections.synchronizedMap(Map)*** is the second option if you need to ensure data consistency, and each thread needs to have an up-to-date view of the map. Use the first if performance is critical, and each thread only inserts data to the map, with reads happening less frequently.
###### Relative links:
+ https://stackoverflow.com/questions/510632/whats-the-difference-between-concurrenthashmap-and-collections-synchronizedmap

[Home Page](README.md)

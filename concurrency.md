# Concurrency
- [What is usage of wait/notify methods?](#what-is-usage-of-waitnotify-methods)
- [Where wait() can be used?](#where-wait-can-be-used)
- [What is the keyword synchronized?](#what-is-the-keyword-synchronized)
- [What is the keyword volatile?](#what-is-the-keyword-volatile)
- [How volatile is related to happens before?](#how-volatile-is-related-to-happens-before)
- [What are the concurrent collections?](#what-are-the-concurrent-collections)
- [What is CopyOnWriteArrayList?](#what-is-copyonwritearraylist)
- [What can you say about ConcurrentHashMap?](#what-can-you-say-about-concurrenthashmap)
- [What are the benefits of using ConcurrentHashMap over HashTable?](#what-are-the-benefits-of-using-concurrenthashmap-over-hashtable)
- [What is the synchronized access?](#what-is-the-synchronized-access)
- [What is the monitor for non-static synchronized method?](#what-is-the-monitor-for-non-static-synchronized-method)
- [What are possible ways for synchronization threads?](#what-are-possible-ways-for-synchronization-threads)
- [How to wait for finish of thread?](#how-to-wait-for-finish-of-thread)
- [What is the result of this code?](#what-is-the-result-of-this-code)

## What is usage of wait/notify methods?
***wait().*** It tells the calling thread to give up the lock and go to sleep until some other thread enters the same monitor and calls notify().
***notify().*** It wakes up one single thread that called wait() on the same object. It should be noted that calling notify() does not actually give up a lock on a resource. It tells a waiting thread that that thread can wake up. However, the lock is not actually given up until the notifier’s synchronized block has completed.
***notifyAll().*** It wakes up all the threads that called wait() on the same object. The highest priority thread will run first in most of the situation, though not guaranteed. Other things are same as notify() method above.
###### Relative links:
+ https://howtodoinjava.com/java/multi-threading/wait-notify-and-notifyall-methods/

## Where wait() can be used?
synchronized
###### Relative links:
+ https://stackoverflow.com/questions/2779484/why-must-wait-always-be-in-synchronized-block

## What is the keyword synchronized?
A piece of logic marked with synchronized becomes a synchronized block, allowing only one thread to execute at any given time.
###### Relative links:
+ https://www.baeldung.com/java-synchronized

## What is the keyword volatile?
The ***volatile*** modifier guarantees that any thread that reads a field will see the most recently written value. In Java, each thread has a separate memory space known as working memory; this holds the values of different variables used for performing operations. After performing an operation, thread copies the updated value of the variable to the main memory, and from there other threads can read the latest value. Simply put, the volatile keyword marks a variable to always go to main memory, for both reads and writes, in the case of multiple threads accessing it.
###### Relative links:
+ https://stackoverflow.com/questions/106591/what-is-the-volatile-keyword-useful-for
+ https://www.baeldung.com/java-volatile

## How volatile is related to happens before?
To address the instruction reordering challenge, the Java volatile keyword gives a "happens-before" guarantee, in addition to the visibility guarantee. The happens-before guarantee guarantees that:
+ Reads from and writes to other variables cannot be reordered to occur after a write to a volatile variable, if the reads / writes originally occurred before the write to the volatile variable. The reads / writes before a write to a volatile variable are guaranteed to "happen before" the write to the volatile variable. Notice that it is still possible for e.g. reads / writes of other variables located after a write to a volatile to be reordered to occur before that write to the volatile. Just not the other way around. From after to before is allowed, but from before to after is not allowed.
+ Reads from and writes to other variables cannot be reordered to occur before a read of a volatile variable, if the reads / writes originally occurred after the read of the volatile variable. Notice that it is possible for reads of other variables that occur before the read of a volatile variable can be reordered to occur after the read of the volatile. Just not the other way around. From before to after is allowed, but from after to before is not allowed.

The above happens-before guarantee assures that the visibility guarantee of the volatile keyword are being enforced.
###### Relative links:
+ http://tutorials.jenkov.com/java-concurrency/volatile.html#the-java-volatile-happens-before-guarantee

## What are the concurrent collections?
+ ***ConcurrentHashMap***
+ ***CopyOnWriteArrayList/CopyOnWriteArraySet***
+ ***BlockingQueue***
###### Relative links:
+ https://medium.com/coding-corpus/concurrent-collections-in-java-9b131e41b3ad

## What is CopyOnWriteArrayList?
A thread-safe variant of ArrayList in which all mutative operations (add, set, and so on) are implemented by making a fresh copy of the underlying array.
###### Relative links:
+ https://docs.oracle.com/javase/7/docs/api/java/util/concurrent/CopyOnWriteArrayList.html
+ https://medium.com/coding-corpus/concurrent-collections-in-java-9b131e41b3ad

## What can you say about ConcurrentHashMap?
A hash table supporting full concurrency of retrievals and high expected concurrency for updates. This class obeys the same functional specification as Hashtable, and includes versions of methods corresponding to each method of Hashtable. However, even though all operations are thread-safe, retrieval operations do not entail locking, and there is not any support for locking the entire table in a way that prevents all access. This class is fully interoperable with Hashtable in programs that rely on its thread safety but not on its synchronization details.
###### Relative links:
+ https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/ConcurrentHashMap.html
+ https://habr.com/ru/post/132884/

## What are the benefits of using ConcurrentHashMap over HashTable?
ConcurrentHashMap uses multiple buckets to store data. This avoids read locks and greatly improves performance over a HashTable. Both are thread safe, but there are obvious performance wins with ConcurrentHashMap.
When you read from a ConcurrentHashMap using get(), there are no locks, contrary to the HashTable for which all operations are simply synchronized. HashTable was released in old versions of Java whereas ConcurrentHashMap is a java 5+ thing.
HashMap is the best thing to use in a single threaded application.
###### Relative links:
+ https://stackoverflow.com/questions/12646404/concurrenthashmap-and-hashtable-in-java

## What is the synchronized access?
Synchronized blocks in Java are marked with the synchronized keyword. A synchronized block in Java is synchronized on some object. All synchronized blocks synchronized on the same object can only have one thread executing inside them at the same time. All other threads attempting to enter the synchronized block are blocked until the thread inside the synchronized block exits the block.
###### Relative links:
- http://tutorials.jenkov.com/java-concurrency/synchronized.html

## What is the monitor for non-static synchronized method?
When synchronizing a non static method, the monitor belongs to the instance.
###### Relative links:
+ https://stackoverflow.com/questions/6367885/difference-between-synchronizing-a-static-method-and-a-non-static-method

## What are possible ways for synchronization threads?
- Volatile;
- Synchronized;
- Atomic Primitives;
- Locks;
- Concurrent Utilities (Semaphore, CyclicBarrier, CountDownLatch, Concurrent collections).
###### Relative links:
- https://proandroiddev.com/synchronization-and-thread-safety-techniques-in-java-and-kotlin-f63506370e6d

## How to wait for finish of thread?
Thread has a method that does that for you join which will block until the thread has finished executing.
###### Relative links:
- https://stackoverflow.com/questions/4691533/java-wait-for-thread-to-finish

## What is the result of this code?
```java
public class StopThread {
    private static boolean stopRequested;
    public static void main(String[] args)
            throws InterruptedException {
        Thread backgroundThread = new Thread(new Runnable() {
            public void run() {
                int i = 0;
                while (!stopRequested)
                    i++;
            }
        });
        backgroundThread.start();
        TimeUnit.SECONDS.sleep(1);
        stopRequested = true;
    }
}
```
Ideally, the program should run for 1 second and after the “stopRequested” has become true, the “backgroundThread” should end, terminating the whole program.

But if you run the above on a computer with multiple cores, you will observe that the program keeps on executing without getting terminated. The problem occurs with the write operation on the “stopRequested” variable. There is no guarantee that the change of the value in “stopRequested” variable (from the main thread) becoming visible to the “backgroundThread” that we created. As the write operation to the “stopRequested” variable to true from the main method is invisible to the “backgroundThread”, it will go into an infinite loop.

As the main thread and our “backgroundThread” is running on two different cores inside the processor, the “stopRequested” will be loaded into the cache of the core that executes the “backgroundThread”. The main thread will keep the updated value of the “stopRequested” value in a cache of a different core. Since now the “stopRequested” value resides in two different caches, the updated value may not be visible to the “backgroundThread”.
###### Relative links:
- https://medium.com/@kasunpdh/handling-java-memory-consistency-with-happens-before-relationship-95ddc837ab13

[Home Page](README.md)

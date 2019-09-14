# Hibernate
- [What is detached entity?](#what-is-detached-entity)
- [What is the use of flush?](#what-is-the-use-of-flush)
- [What are the cache levels?](#what-are-the-cache-levels)
- [What is the first-level cache?](#what-is-the-first-level-cache)

## What is detached entity?
- A `new` instance of a persistent class which is not associated with a `Session`, has no representation in the database and no identifier value is considered ***transient*** by Hibernate.
- A ***persistent*** instance has a representation in the database, an identifier value and is associated with a `Session`. You can make a transient instance ***persistent*** by associating it with a `Session`.
- If we `close` the Hibernate `Session`, the persistent instance will become a ***detached*** instance: it isn't attached to a `Session` anymore (but can still be modified and reattached to a new `Session` later though).
###### Relative links:
+ https://stackoverflow.com/questions/2573739/what-are-detached-persistent-and-transient-objects-in-hibernate

## What is the use of flush?
Flushing the session forces Hibernate to synchronize the in-memory state of the Session with the database (i.e. to write changes to the database). By default, Hibernate will flush changes automatically for you:
- before some query executions
- when a transaction is committed

Allowing to explicitly flush the Session gives finer control that may be required in some circumstances (to get an ID assigned, to control the size of the Session,...).
###### Relative links:
+ https://stackoverflow.com/questions/3220336/whats-the-use-of-session-flush-in-hibernate

## What are the cache levels?
+ ***Session Cache.*** The session cache caches objects within the current session. It is enabled by default in Hibernate. Read more about  Session Cache . Objects in the session cache reside in the same memory location.
+ ***Second Level Cache.*** The second level cache is responsible for caching objects across sessions. When this is turned on, objects will first be searched in the cache and if they are not found, a database query will be fired. Read here on how to implement  Second Level Cache. Second level cache will be used when the objects are loaded using their primary key. This includes fetching of associations. Second level cache objects are constructed and reside in different memory locations. 
+ ***Query Cache.*** Query Cache is used to cache the results of a query.
###### Relative links:
+ https://dzone.com/articles/all-about-hibernate-second
+ https://habr.com/ru/post/135176/

## What is the first-level cache?
***Session Cache.*** The session cache caches objects within the current session. It is enabled by default in Hibernate. Read more about  Session Cache . Objects in the session cache reside in the same memory location.
###### Relative links:
+ https://dzone.com/articles/all-about-hibernate-second
+ https://habr.com/ru/post/135176/

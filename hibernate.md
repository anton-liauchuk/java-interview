# Hibernate
- [What is detached entity?](#what-is-detached-entity)
- [What is the use of flush?](#what-is-the-use-of-flush)
- [What are the cache levels?](#what-are-the-cache-levels)
- [What is the first-level cache?](#what-is-the-first-level-cache)
- [Hibernate inheritance?](#hibernate-inheritance)
- [Common hibernate mistakes?](#common-hibernate-mistakes)
- [Hibernate best practice?](#hibernate-best-practice)
- [How to Define and Use a @NamedEntityGraph?](#how-to-define-and-use-a-namedentitygraph)
- [Is it required to implement equals and hashcode on JPA entities?](#is-it-required-to-implement-equals-and-hashcode-on-jpa-entities)
- [How lazy loading works in hibernate?](#how-lazy-loading-works-in-hibernate)
- [Optimal queries in Hibernate?](#optimal-queries-in-hibernate)
- [Possible enum mapping solutions?](#possible-enum-mapping-solutions)
- [In which cases LazyInitializationException can occur?](#in-which-cases-lazyinizializtion-can-occur)
- [There are three SQL statements in one transaction, during the first one exception occurred on DB level, what will happen with others if you catch the first one?](#there-are-three-sql-statements-in-one-transaction-during-the-first-one-exception-occurred-on-db-level-what-will-happen-with-others-if-you-catch-the-first-one)
- [What is the N+1 Query Problem? How to Solve the N+1 Query Problem?](#what-is-the-n1-query-problem-how-to-solve-the-n1-query-problem)

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
+ ***Session Cache.*** The session cache caches objects within the current session. It is enabled by default in Hibernate. Objects in the session cache reside in the same memory location.
+ ***Second Level Cache.*** The second level cache is responsible for caching objects across sessions. When this is turned on, objects will first be searched in the cache and if they are not found, a database query will be fired. Second level cache will be used when the objects are loaded using their primary key. This includes fetching of associations. Second level cache objects are constructed and reside in different memory locations. 
+ ***Query Cache.*** Query Cache is used to cache the results of a query.
###### Relative links:
+ https://dzone.com/articles/all-about-hibernate-second
+ https://habr.com/ru/post/135176/

## What is the first-level cache?
***Session Cache.*** The session cache caches objects within the current session. It is enabled by default in Hibernate. Read more about  Session Cache . Objects in the session cache reside in the same memory location.
###### Relative links:
+ https://dzone.com/articles/all-about-hibernate-second
+ https://habr.com/ru/post/135176/

## Hibernate inheritance?
###### Relative links:
- https://www.baeldung.com/hibernate-inheritance

## Common hibernate mistakes?
- When you’re defining your associations, you should prefer FetchType.LAZY and map many-to-many associations to a java.util.Set.
- If your use case uses a lazily fetched association, you should initialize it within the query that loads the entity, e.g., with a JOIN FETCH expression.
- Cascading and updating or removing multiple entities require more SQL statements than you might expect. It’s often better to implement a bulk operation as a native, JPQL or Criteria query.
###### Relative links:
- https://thoughts-on-java.org/5-common-hibernate-mistakes-that-cause-dozens-of-unexpected-queries/

## Hibernate best practice?
###### Relative links:
- https://thoughts-on-java.org/hibernate-best-practices/

## How to Define and Use a @NamedEntityGraph?
###### Relative links:
- https://thoughts-on-java.org/jpa-21-entity-graph-part-1-named-entity/

## Is it required to implement equals and hashcode on JPA entities?
The Hibernate documentation lists the situations when these two methods are required:
- when adding entities to Set collections
- when reattaching entities to a new persistence context
###### Relative links:
- https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
- https://vladmihalcea.com/hibernate-facts-equals-and-hashcode/
- https://docs.hibernate.org/stable/orm/userguide/html_single/#mapping-model-pojo-equalshashcode

## Scripts vs table generation from entity annotations?
###### Relative links:
- https://thoughts-on-java.org/create-generate-table-model/

## How lazy loading works in hibernate?
###### Relative links:
- https://howtodoinjava.com/hibernate/lazy-loading-in-hibernate/

## Optimal queries in Hibernate?
###### Relative links:
- https://thorben-janssen.com/optimal-query-and-projection-jpa-hibernate/

## Possible enum mapping solutions?
###### Relative links:
- https://thorben-janssen.com/hibernate-enum-mappings/#standardMapping

## In which cases LazyInitializationException can occur?
###### Relative links:
- https://thorben-janssen.com/lazyinitializationexception/ 

## There are three SQL statements in one transaction, during the first one exception occurred on DB level, what will happen with others if you catch the first one?
All Java code after Exception catching will be normally executed with other statements, but at the moment you want to try to close transaction, it won't commit any of statements, 
because transaction was marked as "to be rollbacked".

## What is the N+1 Query Problem? How to Solve the N+1 Query Problem?
N+1 query problem occurs when an application executes one query to fetch a list of records (1 query) and then N additional queries to fetch related data for each record (N queries). Potential solutions:
- Using `JOIN FETCH`
- Using `@EntityGraph`
- Using `@BatchSize` for Lazy Loading Optimization
- Using Subselect Fetching (`@Fetch(FetchMode.SUBSELECT)`)
###### Relative links:
- https://dev.to/devcorner/solving-the-n1-query-problem-in-hibernate-jpa-1ijj
- https://vladmihalcea.com/n-plus-1-query-problem/

[Home Page](README.md)

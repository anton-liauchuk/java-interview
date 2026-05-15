# SQL
- [What is having in sql?](#what-is-having-in-sql)
- [What are the possible issues with indexes?](#what-are-the-possible-issues-with-indexes)
- [When using a composite index, under what conditions will the database use it for a query that filters only on a subset of the indexed columns?](#when-using-a-composite-index-under-what-conditions-will-the-database-use-it-for-a-query-that-filters-only-on-a-subset-of-the-indexed-columns)
- [How to verify that an index was used in a query?](#how-to-verify-that-an-index-was-used-in-a-query)
- [Does it make sense to add an index on a column with a highly skewed distribution to selectively query the minority value?](#does-it-make-sense-to-add-an-index-on-a-column-with-a-highly-skewed-distribution-to-selectively-query-the-minority-value)
- [Sql works very slowly, what are the possible improvements (the database is MySQL, for example)?](#sql-works-very-slowly-what-are-the-possible-improvements-the-database-is-mysql-for-example)
- [NoSQL vs SQL Databases](#nosql-vs-sql-databases)
- [OLAP vs OLTP Databases](#olap-vs-oltp-databases)
- [By which instruments of DB is ACID supported?](#by-which-instruments-of-db-is-acid-supported)
- [What is Multi-Version Concurrency Control (MVCC)?](#what-is-multi-version-concurrency-control-mvcc)
- [What is the difference between keyset and offset pagination?](#what-is-the-difference-between-keyset-and-offset-pagination)

## What is having in sql?
+ HAVING filters records that work on summarized GROUP BY results.
+ HAVING applies to summarized group records, whereas WHERE applies to individual records.
+ Only the groups that meet the HAVING criteria will be returned.
+ HAVING requires that a GROUP BY clause is present.
+ WHERE and HAVING can be in the same query.
###### Relative links:
+ https://www.dofactory.com/sql/having

## What are the possible issues with indexes?
Although indexes are intended to enhance a database's performance, there are times when they should be avoided. The following guidelines indicate when the use of an index should be reconsidered.
+ Indexes should not be used on small tables.
+ Tables that have frequent, large batch updates or insert operations.
+ Indexes should not be used on columns that contain a high number of NULL values.
+ Columns that are frequently manipulated should not be indexed.
###### Relative links:
+ https://www.tutorialspoint.com/sql/sql-indexes.htm

## When using a composite index, under what conditions will the database use it for a query that filters only on a subset of the indexed columns?
The database uses the composite index only if the query filters on a leftmost prefix of the index columns. If the leftmost column is omitted, the index is typically not used for efficient seeks (though some databases offer skip‑scan optimization).
###### Relative links:
- https://oneuptime.com/blog/post/2026-01-30-composite-index-design/view

## How to verify that an index was used in a query?
The standard way is to examine the query's execution plan, which reveals the actual operations the database performs. The primary tool is the `EXPLAIN` command, which you prepend to your query.

## Does it make sense to add an index on a column with a highly skewed distribution to selectively query the minority value?
Partial indexes are a powerful tool for optimizing database performance when you consistently query a subset of your data.
###### Relative links:
- https://oneuptime.com/blog/post/2026-01-30-partial-index-design/view

## Sql works very slowly, what are the possible improvements (the database is MySQL, for example)?
1. Index All Columns Used in 'where', 'order by', and 'group by' Clauses
2. Optimize Like Statements With Union Clause
3. Avoid Like Expressions With Leading Wildcards
4. Take Advantage of MySQL Full-Text Searches
5. Optimize Your Database Schema
6. MySQL Query Caching
###### Relative links:
- https://dzone.com/articles/how-to-optimize-mysql-queries-for-speed-and-perfor

## NoSQL vs SQL Databases
###### Relative links:
- https://www.mongodb.com/nosql-explained/nosql-vs-sql

## OLAP vs OLTP Databases
###### Relative links:
- https://www.ibm.com/cloud/blog/olap-vs-oltp

## By which instruments of DB is ACID supported?
- Write-Ahead Logging – records changes before committing (Atomicity, Durability).
- Checkpointing – periodically flushes dirty pages to disk to speed recovery (Durability).
- Locks / MVCC – controls concurrent access to data (Isolation).
- Constraints & Triggers – enforce data integrity rules (Consistency).
###### Relative links:
- https://dev.to/jaiminbariya/implementation-of-acid-transaction-in-database-44nc

## What is Multi-Version Concurrency Control (MVCC)?
MVCC is a database technique that creates a new version of a record instead of overwriting it when updated. This lets readers view the old version while writers update a new version simultaneously without any read/write blocking. It uses timestamps and transaction IDs to maintain consistency, ensuring no transaction ever waits to read an object. The result is increased concurrency and minimized read delays.
###### Relative links:
- https://www.geeksforgeeks.org/dbms/what-is-multi-version-concurrency-control-mvcc-in-dbms/

## What is the difference between keyset and offset pagination?
- Offset pagination uses `OFFSET` and `LIMIT`. Performance degrades linearly (O(n)) as pages get deeper, and results can be inconsistent if data changes between page loads.
- Keyset pagination uses a `WHERE` clause on a unique, indexed column. It provides consistent O(1) performance regardless of dataset size and is immune to data changes, but it does not support jumping to random pages.
###### Relative links:
- https://www.stacksync.com/blog/keyset-cursors-postgres-pagination-fast-accurate-scalable

[Home Page](README.md)

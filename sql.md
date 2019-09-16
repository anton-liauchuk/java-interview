#SQL
- [What is having in sql?](#what-is-having-in-sql)
- [What are the possible issues with indexes?](#what-are-the-possible-issues-with-indexes)
- [Sql works very slowly, what are the possible improvements (the database is MySQL, for example)?](#sql-works-very-slowly-what-are-the-possible-improvements-the-database-is-mysql-for-example)

## What is having in sql?
+ HAVING filters records that work on summarized GROUP BY results.
+ HAVING applies to summarized group records, whereas WHERE applies to individual records.
+ Only the groups that meet the HAVING criteria will be returned.
+ HAVING requires that a GROUP BY clause is present.
+ WHERE and HAVING can be in the same query.
###### Relative links:
+ https://www.dofactory.com/sql/having

## What are the possible issues with indexes?
Although indexes are intended to enhance a database's performance, there are times when they should be avoided.
+ The following guidelines indicate when the use of an index should be reconsidered.
+ Indexes should not be used on small tables.
+ Tables that have frequent, large batch updates or insert operations.
+ Indexes should not be used on columns that contain a high number of NULL values.
+ Columns that are frequently manipulated should not be indexed.
###### Relative links:
+ https://www.tutorialspoint.com/sql/sql-indexes.htm

## Sql works very slowly, what are the possible improvements (the database is MySQL, for example)?
1. Index All Columns Used in 'where', 'order by', and 'group by' Clauses
2. Optimize Like Statements With Union Clause
3. Avoid Like Expressions With Leading Wildcards
4. Take Advantage of MySQL Full-Text Searches
5. Optimize Your Database Schema
6. MySQL Query Caching
###### Relative links:
- https://dzone.com/articles/how-to-optimize-mysql-queries-for-speed-and-perfor

[Home Page](README.md)

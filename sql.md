#SQL
- [что такое having в sql?](#что-такое-having-в-sql)
- [возможные проблемы индексов?](#возможные-проблемы-индексов)

## что такое having в sql?
+ HAVING filters records that work on summarized GROUP BY results.
+ HAVING applies to summarized group records, whereas WHERE applies to individual records.
+ Only the groups that meet the HAVING criteria will be returned.
+ HAVING requires that a GROUP BY clause is present.
+ WHERE and HAVING can be in the same query.
###### Relative links:
+ https://www.dofactory.com/sql/having

## возможные проблемы индексов?
Although indexes are intended to enhance a database's performance, there are times when they should be avoided.
+ The following guidelines indicate when the use of an index should be reconsidered.
+ Indexes should not be used on small tables.
+ Tables that have frequent, large batch updates or insert operations.
+ Indexes should not be used on columns that contain a high number of NULL values.
+ Columns that are frequently manipulated should not be indexed.
###### Relative links:
+ https://www.tutorialspoint.com/sql/sql-indexes.htm

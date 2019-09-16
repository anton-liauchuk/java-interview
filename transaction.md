#Transactions
- [What is transaction?](#what-is-transaction)
- [What are the requirements for transactions?](#what-are-the-requirements-for-transactions)
- [What is a distributed transaction?](#what-is-a-distributed-transaction)
- [What are isolation levels?](#what-are-isolation-levels)
- [What are the possible issues in the case of parallel access by transactions?](#what-are-the-possible-issues-in-the-case-of-parallel-access-by-transactions)
- [What are possible options for implementing transactions in microservices](#what-are-possible-options-for-implementing-transactions-in-microservices)
- [What is the difference between optimistic and pessimistic locking?](#what-is-the-difference-between-optimistic-and-pessimistic-locking)
- [What is Eventual consistency?](#what-is-eventual-consistency)

## What is transaction?
A **transaction** is a sequence of operations performed (using one or more SQL statements) on a database as a single logical unit of work. The effects of all the SQL statements in a transaction can be either all committed (applied to the database) or all rolled back (undone from the database). A database transaction must be atomic, consistent, isolated and durable.
###### Relative links:
+ https://www.w3resource.com/sql/controlling-transactions.php

## What are the requirements for transactions?
- ***Atomic:*** A transaction is a logical unit of work which must be either completed with all of its data modifications, or none of them is performed.
- ***Consistent:*** At the end of the transaction, all data must be left in a consistent state.
- ***Isolated:*** Modifications of data performed by a transaction must be independent of another transaction. Unless this happens, the outcome of a transaction may be erroneous.
- ***Durable:*** When the transaction is completed, effects of the modifications performed by the transaction must be permanent in the system.
###### Relative links:
- https://www.w3resource.com/sql/controlling-transactions.php
+ https://github.com/enhorse/java-interview/blob/master/db.md#%D0%BD%D0%B0%D0%B7%D0%BE%D0%B2%D0%B8%D1%82%D0%B5-%D0%BE%D1%81%D0%BD%D0%BE%D0%B2%D0%BD%D1%8B%D0%B5-%D1%81%D0%B2%D0%BE%D0%B9%D1%81%D1%82%D0%B2%D0%B0-%D1%82%D1%80%D0%B0%D0%BD%D0%B7%D0%B0%D0%BA%D1%86%D0%B8%D0%B8
+ https://habr.com/ru/post/446662/

## What is a distributed transaction?
**Distributed transactions** span multiple physical systems, whereas standard transactions do not. Synchronization amongst the systems becomes a need which traditionally would not exist in a standard transaction.
###### Relative links:
- https://stackoverflow.com/questions/4217270/what-is-a-distributed-transaction

## What are isolation levels?
- ***Read Uncommitted*** – Read Uncommitted is the lowest isolation level. In this level, one transaction may read not yet committed changes made by other transaction, thereby allowing dirty reads. In this level, transactions are not isolated from each other.
- ***Read Committed*** – This isolation level guarantees that any data read is committed at the moment it is read. Thus it does not allows dirty read. The transaction holds a read or write lock on the current row, and thus prevent other transactions from reading, updating or deleting it.
- ***Repeatable Read*** – This is the most restrictive isolation level. The transaction holds read locks on all rows it references and writes locks on all rows it inserts, updates, or deletes. Since other transaction cannot read, update or delete these rows, consequently it avoids non-repeatable read.
- ***Serializable*** – This is the Highest isolation level. A serializable execution is guaranteed to be serializable. Serializable execution is defined to be an execution of operations in which concurrently executing transactions appears to be serially executing.
###### Relative links:
+ https://www.geeksforgeeks.org/transaction-isolation-levels-dbms/

## What are the possible issues in the case of parallel access by transactions?
- ***Dirty Read*** – A Dirty read is the situation when a transaction reads a data that has not yet been committed. For example, Let’s say transaction 1 updates a row and leaves it uncommitted, meanwhile, Transaction 2 reads the updated row. If transaction 1 rolls back the change, transaction 2 will have read data that is considered never to have existed.
- ***Non Repeatable read*** – Non Repeatable read occurs when a transaction reads same row twice, and get a different value each time. For example, suppose transaction T1 reads data. Due to concurrency, another transaction T2 updates the same data and commit, Now if transaction T1 rereads the same data, it will retrieve a different value.
- ***Phantom Read*** – Phantom Read occurs when two same queries are executed, but the rows retrieved by the two, are different. For example, suppose transaction T1 retrieves a set of rows that satisfy some search criteria. Now, Transaction T2 generates some new rows that match the search criteria for transaction T1. If transaction T1 re-executes the statement that reads the rows, it gets a different set of rows this time.
###### Relative links:
+ https://www.geeksforgeeks.org/transaction-isolation-levels-dbms/

## What are possible options for implementing transactions in microservices
- ***Distributed transaction.*** A distributed transaction is a very complex process with a lot of moving parts that can fail. Also, if these parts run on different machines or even in different data centers, the process of committing a transaction could become very long and unreliable.
- ***Two-Phase Commit Protocol.*** The problem with 2PC is that it is quite slow compared to the time for operation of a single microservice. Coordinating the transaction between microservices, even if they are on the same network, can really slow the system down.
- ***Eventual Consistency and Compensation.*** By far, one of the most feasible models of handling consistency across microservices is eventual consistency. One way to solve it would be with a message-driven approach including compensation. The messaging platform could ensure that the messages sent by the microservices are persisted. Then they would be delivered at a later time if the receiver weren’t currently available
###### Relative links:
+ https://www.baeldung.com/transactions-across-microservices
+ https://habr.com/ru/company/nixsolutions/blog/321686/
+ https://habr.com/ru/company/nixsolutions/blog/322214/

## What is the difference between optimistic and pessimistic locking?
+ ***Optimistic Locking*** is a strategy where you read a record, take note of a version number (other methods to do this involve dates, timestamps or checksums/hashes) and check that the version hasn't changed before you write the record back. When you write the record back you filter the update on the version to make sure it's atomic. (i.e. hasn't been updated between when you check the version and write the record to the disk) and update the version in one hit.
+ ***Pessimistic Locking*** is when you lock the record for your exclusive use until you have finished with it. It has much better integrity than optimistic locking but requires you to be careful with your application design to avoid Deadlocks. To use pessimistic locking you need either a direct connection to the database (as would typically be the case in a two tier client server application) or an externally available transaction ID that can be used independently of the connection.
###### Relative links:
+ https://stackoverflow.com/questions/129329/optimistic-vs-pessimistic-locking

[Home Page](README.md)

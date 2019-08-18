## что такое транзакция?
Транзакция - это воздействие на базу данных, переводящее её из одного целостного состояния в другое и выражаемое в изменении данных, хранящихся в базе данных.
###### Relative links:
+ https://github.com/enhorse/java-interview/blob/master/db.md#%D0%A7%D1%82%D0%BE-%D1%82%D0%B0%D0%BA%D0%BE%D0%B5-%D1%82%D1%80%D0%B0%D0%BD%D0%B7%D0%B0%D0%BA%D1%86%D0%B8%D1%8F
+ https://proselyte.net/tutorials/sql/sql-transactions/

## Требования к транзакции? для чего нужны?
Атомарность (atomicity) гарантирует, что никакая транзакция не будет зафиксирована в системе частично. Будут либо выполнены все её подоперации, либо не выполнено ни одной.
Согласованность. При завершении транзакции не должны быть нарушены ограничения накладываемые на данные (например constraints в БД). Согласованность подразумевает, что система будет переведена из одного корректного состояния в другое корректное.
Изолированность (isolation). Во время выполнения транзакции параллельные транзакции не должны оказывать влияние на её результат.
Долговечность (durability). Независимо от проблем на нижних уровнях (к примеру, обесточивание системы или сбои в оборудовании) изменения, сделанные успешно завершённой транзакцией, должны остаться сохранёнными после возвращения системы в работу.
###### Relative links:
+ https://github.com/enhorse/java-interview/blob/master/db.md#%D0%BD%D0%B0%D0%B7%D0%BE%D0%B2%D0%B8%D1%82%D0%B5-%D0%BE%D1%81%D0%BD%D0%BE%D0%B2%D0%BD%D1%8B%D0%B5-%D1%81%D0%B2%D0%BE%D0%B9%D1%81%D1%82%D0%B2%D0%B0-%D1%82%D1%80%D0%B0%D0%BD%D0%B7%D0%B0%D0%BA%D1%86%D0%B8%D0%B8
+ https://habr.com/ru/post/446662/

## что такое распределенная транзакция?

## уровни изоляции транзакций?
В порядке увеличения изолированности транзакций и, соответственно, надёжности работы с данными:
+ Чтение неподтверждённых данных (грязное чтение) (read uncommitted, dirty read) — чтение незафиксированных изменений как своей транзакции, так и параллельных транзакций. Нет гарантии, что данные, изменённые другими транзакциями, не будут в любой момент изменены в результате их отката, поэтому такое чтение является потенциальным источником ошибок. Невозможны потерянные изменения, возможны неповторяемое чтение и фантомы.
+ Чтение подтверждённых данных (read committed) — чтение всех изменений своей транзакции и зафиксированных изменений параллельных транзакций. Потерянные изменения и грязное чтение не допускается, возможны неповторяемое чтение и фантомы.
+ Повторяемость чтения (repeatable read, snapshot) — чтение всех изменений своей транзакции, любые изменения, внесённые параллельными транзакциями после начала своей, недоступны. Потерянные изменения, грязное и неповторяемое чтение невозможны, возможны фантомы.
+ Упорядочиваемость (serializable) — результат параллельного выполнения сериализуемой транзакции с другими транзакциями должен быть логически эквивалентен результату их какого-либо последовательного выполнения. Проблемы синхронизации не возникают.
###### Relative links:
+ https://github.com/enhorse/java-interview/blob/master/db.md#%D0%BA%D0%B0%D0%BA%D0%B8%D0%B5-%D1%81%D1%83%D1%89%D0%B5%D1%81%D1%82%D0%B2%D1%83%D1%8E%D1%82-%D1%83%D1%80%D0%BE%D0%B2%D0%BD%D0%B8-%D0%B8%D0%B7%D0%BE%D0%BB%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%BD%D0%BE%D1%81%D1%82%D0%B8-%D1%82%D1%80%D0%B0%D0%BD%D0%B7%D0%B0%D0%BA%D1%86%D0%B8%D0%B9

## Какие проблемы могут возникать при параллельном доступе с использованием транзакций?
При параллельном выполнении транзакций возможны следующие проблемы:
+ Потерянное обновление (lost update) — при одновременном изменении одного блока данных разными транзакциями одно из изменений теряется;
+ «Грязное» чтение (dirty read) — чтение данных, добавленных или изменённых транзакцией, которая впоследствии не подтвердится (откатится);
+ Неповторяющееся чтение (non-repeatable read) — при повторном чтении в рамках одной транзакции ранее прочитанные данные оказываются изменёнными;
+ Фантомное чтение (phantom reads) — одна транзакция в ходе своего выполнения несколько раз выбирает множество записей по одним и тем же критериям. Другая транзакция в интервалах между этими выборками добавляет или удаляет записи или изменяет столбцы некоторых записей, используемых в критериях выборки первой транзакции, и успешно заканчивается. В результате получится, что одни и те же выборки в первой транзакции дают разные множества записей.
###### Relative links:
+ https://github.com/enhorse/java-interview/blob/master/db.md#%D0%BA%D0%B0%D0%BA%D0%B8%D0%B5-%D0%BF%D1%80%D0%BE%D0%B1%D0%BB%D0%B5%D0%BC%D1%8B-%D0%BC%D0%BE%D0%B3%D1%83%D1%82-%D0%B2%D0%BE%D0%B7%D0%BD%D0%B8%D0%BA%D0%B0%D1%82%D1%8C-%D0%BF%D1%80%D0%B8-%D0%BF%D0%B0%D1%80%D0%B0%D0%BB%D0%BB%D0%B5%D0%BB%D1%8C%D0%BD%D0%BE%D0%BC-%D0%B4%D0%BE%D1%81%D1%82%D1%83%D0%BF%D0%B5-%D1%81-%D0%B8%D1%81%D0%BF%D0%BE%D0%BB%D1%8C%D0%B7%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D0%B5%D0%BC-%D1%82%D1%80%D0%B0%D0%BD%D0%B7%D0%B0%D0%BA%D1%86%D0%B8%D0%B9

## Возможные варианты реализации транзакционности в микросервисах
Options:
1. Distributed transaction
A distributed transaction is a very complex process with a lot of moving parts that can fail. Also, if these parts run on different machines or even in different data centers, the process of committing a transaction could become very long and unreliable.
2. Two-Phase Commit Protocol
The problem with 2PC is that it is quite slow compared to the time for operation of a single microservice.
Coordinating the transaction between microservices, even if they are on the same network, can really slow the system down.
3. Eventual Consistency and Compensation
By far, one of the most feasible models of handling consistency across microservices is eventual consistency.
One way to solve it would be with a message-driven approach including compensation.
The messaging platform could ensure that the messages sent by the microservices are persisted. Then they would be delivered at a later time if the receiver weren’t currently available
###### Relative links:
+ https://www.baeldung.com/transactions-across-microservices
+ https://habr.com/ru/company/nixsolutions/blog/321686/
+ https://habr.com/ru/company/nixsolutions/blog/322214/

## В чем разница между optimistic и pessimistic locking?
+ Optimistic Locking is a strategy where you read a record, take note of a version number (other methods to do this involve dates, timestamps or checksums/hashes) and check that the version hasn't changed before you write the record back. When you write the record back you filter the update on the version to make sure it's atomic. (i.e. hasn't been updated between when you check the version and write the record to the disk) and update the version in one hit.
+ Pessimistic Locking is when you lock the record for your exclusive use until you have finished with it. It has much better integrity than optimistic locking but requires you to be careful with your application design to avoid Deadlocks. To use pessimistic locking you need either a direct connection to the database (as would typically be the case in a two tier client server application) or an externally available transaction ID that can be used independently of the connection.
###### Relative links:
+ https://stackoverflow.com/questions/129329/optimistic-vs-pessimistic-locking

## Что такое Eventual consistency?
Согласованность в конечном счете (eventual consistency) означает, что если в течение достаточно долгого периода времени в систему не поступают новые операции обновления данных, то можно ожидать, что результаты всех предыдущих операций обновления данных в конце концов распространятся по всем узлам системы, и все реплики данных согласуются
###### Relative links:
+ http://citforum.ru/database/articles/kuz_oltp_2010/2.shtml


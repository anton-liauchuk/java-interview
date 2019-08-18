# Hibernate
+ [Что значит attached/detached entity?](#алгоритмическая-сложность-get-в-hashmap)
+ [Зачем нужен flush?](#алгоритмическая-сложность-get-в-hashmap)
+ [Уровни кэша в hibernate?](#алгоритмическая-сложность-get-в-hashmap)
+ [Где находится кэш первого уровня?](#алгоритмическая-сложность-get-в-hashmap)

## Что значит attached/detached entity?
###### Relative links:
+ https://stackoverflow.com/questions/2573739/what-are-detached-persistent-and-transient-objects-in-hibernate

## Зачем нужен flush?
###### Relative links:
+ https://stackoverflow.com/questions/3220336/whats-the-use-of-session-flush-in-hibernate

## Уровни кэша в hibernate?
+ Кеш первого уровня (First-level cache);
+ Кеш второго уровня (Second-level cache);
+ Кеш запросов (Query cache);
###### Relative links:
+ https://habr.com/ru/post/135176/

## Где находится кэш первого уровня?
Кеш первого уровня всегда привязан к объекту сессии. Hibernate всегда по умолчанию использует этот кеш и его нельзя отключить.
###### Relative links:
+ https://habr.com/ru/post/135176/

# Hibernate
- [Что значит attached/detached entity?](#что-значит-attacheddetached-entity)
- [Зачем нужен flush?](#зачем-нужен-flush)
- [Уровни кэша в hibernate?](#уровни-кэша-в-hibernate)
- [Где находится кэш первого уровня?](#где-находится-кэш-первого-уровня)

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

## способы коммуникации между микросервисами?
###### Relative links:
+ https://dzone.com/articles/communication-between-microservices

## что можете расказать о message queue как о возможном способе коммуникации между микросервисами?
###### Relative links:
+ https://dev.to/matteojoliveau/microservices-communications-why-you-should-switch-to-message-queues--48ia

## exchange в message queue?
Exchange: a queue aggregator that abstract away message queues and routes messages to the appropriate queue based on some predefined logic.
###### Relative links:

## в чем плюсы микросервисов?

## минусы микросервисов?

## В микросервисах какие могут быть проблемы?
1. As if monitoring a monolith wasn’t hard enough
2. Logging is distributed between services
3. An issue that’s caused by one service, can cause trouble elsewhere
4. Finding the root cause of problems
5. Version management and cyclic dependencies between services
###### Relative links:
+ https://blog.overops.com/5-ways-to-not-f-up-your-microservices-in-production/

## как решается проблема с коммуникацией, когда какой-либо сервис не доступен?
1. The circuit breaker pattern is the solution to this problem. The basic idea behind the circuit breaker is very simple. You wrap a protected function call in a circuit breaker object, which monitors for failures. Once the failures reach a certain threshold, the circuit breaker trips, and all further calls to the circuit breaker return with an error or with some alternative service or default message, without the protected call being made at all. This will make sure system is responsive and threads are not waiting for an unresponsive call.
2. Retry Logic
###### Relative links:
+ https://blog.risingstack.com/designing-microservices-architecture-for-failure/
+ https://dzone.com/articles/circuit-breaker-pattern

## что такое rabbitMQ?
RabbitMQ, also known as Open-Source Message Broker, supports multiple message protocols and can be deployed on distributed systems. It is lightweight and makes it easy to deploy applications. It mainly acts as a queue where a message which is entered can first be operated on. RabbitMQ runs on many operating systems and cloud environments and provides a wide range of developer tools for most popular languages. It is a Producer-Consumer style pattern where the producer sends a message and the consumer consumes it. The main features of RabbitMQ are mentioned below:
+ Asynchronous Messaging
+ Distributed Deployment
+ Management & Monitoring
+ Enterprise- and Cloud-Ready
###### Relative links:
+ https://dzone.com/articles/rabbitmq-in-microservices

## оптимальный путь перехода от монолита к микросервисам?
https://martinfowler.com/articles/break-monolith-into-microservices.html
https://dzone.com/articles/from-monolith-to-microservices

## виды коммуникаций в микросервисах?

## асинхронный vs синхронный вид коммуникации?

## как организовать аутентификацию для микросервисов и web-приложения, в которое ты заходишь?
###### Relative links:
+ https://medium.com/tech-tajawal/microservice-authentication-and-authorization-solutions-e0e5e74b248a







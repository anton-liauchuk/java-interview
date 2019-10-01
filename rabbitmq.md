# RabbitMQ
- [What is the Exchange in RabbitMQ?](#what-is-the-exchange-in-rabbitmq)

## What is the Exchange in RabbitMQ?
Messages are not published directly to a queue. Instead, the producer sends messages to an exchange. Exchanges are message routing agents, defined by the virtual host within RabbitMQ. An exchange is responsible for routing the messages to different queues with the help of header attributes, bindings, and routing keys.
###### Relative links:
- https://www.cloudamqp.com/blog/2015-09-03-part4-rabbitmq-for-beginners-exchanges-routing-keys-bindings.html

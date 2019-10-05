# RabbitMQ
- [What is RabbitMQ?](#what-is-rabbitmq)
- [What are the advantages/disadvantages of using message brokers?](#what-are-the-advantagesdisadvantages-of-using-message-brokers)
- [What is the Exchange in RabbitMQ?](#what-is-the-exchange-in-rabbitmq)

## What is RabbitMQ?
RabbitMQ, also known as Open-Source Message Broker, supports multiple message protocols and can be deployed on distributed systems. It is lightweight and makes it easy to deploy applications. It mainly acts as a queue where a message which is entered can first be operated on. RabbitMQ runs on many operating systems and cloud environments and provides a wide range of developer tools for most popular languages. It is a Producer-Consumer style pattern where the producer sends a message and the consumer consumes it. The main features of RabbitMQ are mentioned below:
+ Asynchronous Messaging
+ Distributed Deployment
+ Management & Monitoring
+ Enterprise- and Cloud-Ready
###### Relative links:
+ https://dzone.com/articles/rabbitmq-in-microservices

## What are the advantages/disadvantages of using message brokers?
There are many advantages to using messaging:

- Decouples the client from the service – A client makes a request simply by sending a message to the appropriate channel. The client is completely unaware of the service instances. It does not need to use a discovery mechanism to determine the location of a service instance.
- Message buffering – With a synchronous request/response protocol, such as a HTTP, both the client and service must be available for the duration of the exchange. In contrast, a message broker queues up the messages written to a channel until they can be processed by the consumer. This means, for example, that an online store can accept orders from customers even when the order fulfillment system is slow or unavailable. The order messages simply queue up.
- Flexible client‑service interactions – Messaging supports all of the interaction styles described earlier.
- Explicit inter‑process communication – RPC‑based mechanisms attempt to make invoking a remote service look the same as calling a local service. However, because of the laws of physics and the possibility of partial failure, they are in fact quite different. Messaging makes these differences very explicit so developers are not lulled into a false sense of security.

There are, however, some downsides to using messaging:

- Additional operational complexity – The messaging system is yet another system component that must be installed, configured, and operated. It’s essential that the message broker be highly available, otherwise system reliability is impacted.
- Complexity of implementing request/response‑based interaction – Request/response‑style interaction requires some work to implement. Each request message must contain a reply channel identifier and a correlation identifier. The service writes a response message containing the correlation ID to the reply channel. The client uses the correlation ID to match the response with the request. It is often easier to use an IPC mechanism that directly supports request/response.
###### Relative links:
- https://www.nginx.com/blog/building-microservices-inter-process-communication/

## What is the Exchange in RabbitMQ?
Messages are not published directly to a queue. Instead, the producer sends messages to an exchange. Exchanges are message routing agents, defined by the virtual host within RabbitMQ. An exchange is responsible for routing the messages to different queues with the help of header attributes, bindings, and routing keys.
###### Relative links:
- https://www.cloudamqp.com/blog/2015-09-03-part4-rabbitmq-for-beginners-exchanges-routing-keys-bindings.html

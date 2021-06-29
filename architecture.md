# Architecture
- [What are the differences between monolith and microservices? (Performance/Deployability/Failure impact and etc)](#what-are-the-differences-between-monolith-and-microservices-performancedeployabilityfailure-impact-and-etc)
- [Imperative vs functional vs reactive programming?](#imperative-vs-functional-vs-reactive-programming)
- [What is Serverless](#what-is-serverless)
- [What is the difference between native code, machine code and assembly code?](#what-is-the-difference-between-native-code-machine-code-and-assembly-code)
- [What is the difference between sharding and partitioning for databases?](#what-is-the-difference-between-sharding-and-partitioning-for-databases)

## What are the differences between monolith and microservices? (Performance/Deployability/Failure impact and etc)
###### Relative links:
- http://www.kamilgrzybek.com/design/modular-monolith-architectural-drivers/

## Imperative vs functional vs reactive programming?
**Imperative programming** is fundamental to any programming language and even machine language is imperative. Internally other programming paradigm in some way or the other use imperative style internally but abstracts this out for the caller. **Imperative style is mostly sequential and follows a natural flow**, hence it is easy to write, debug and troubleshoot. In most case this offers better raw performance than other.

**Functional programming** is treating computation as “**mathematical functions**”, using pure function without side effect which does not change state. State are immutable in functional programming.

**Reactive programming** is typically **asynchronous events data stream over time and its propagation of change**. It is built on observable (publish/subscribe) & iterator pattern. Generally there are also functional programming and reactive programming done together for transformation of one streams to another.
###### Relative links:
- https://www.webagam.com/2018/11/24/imperative-functional-reactive-programming-which-one-to-use-when-and-for-what/

## What is Serverless
Like many trends in software, there’s no one clear view of what Serverless is. For starters, it encompasses two different but overlapping areas:

1. Serverless was first used to describe applications that significantly or fully incorporate third-party, cloud-hosted applications and services, to manage server-side logic and state. These are typically “rich client” applications—think single-page web apps, or mobile apps—that use the vast ecosystem of cloud-accessible databases (e.g., Parse, Firebase), authentication services (e.g., Auth0, AWS Cognito), and so on. These types of services have been previously described as “(Mobile) Backend as a Service", and I use "BaaS" as shorthand in the rest of this article.
2. Serverless can also mean applications where server-side logic is still written by the application developer, but, unlike traditional architectures, it’s run in stateless compute containers that are event-triggered, ephemeral (may only last for one invocation), and fully managed by a third party. One way to think of this is “Functions as a Service” or "FaaS". (Note: The original source for this name—a tweet by @marak—is no longer publicly available.) AWS Lambda is one of the most popular implementations of a Functions-as-a-Service platform at present, but there are many others, too.
###### Relative links:
- https://martinfowler.com/articles/serverless.html

## What is the difference between native code, machine code and assembly code?
###### Relative links:
- https://stackoverflow.com/questions/3434202/what-is-the-difference-between-native-code-machine-code-and-assembly-code

## What is the difference between sharding and partitioning for databases?
###### Relative links:
- https://hazelcast.com/glossary/sharding/
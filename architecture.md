# Architecture
- [What are the differences between monolith and microservices? (Performance/Deployability/Failure impact and etc)](#what-are-the-differences-between-monolith-and-microservices-performancedeployabilityfailure-impact-and-etc)
- [Imperative vs functional vs reactive programming?](#imperative-vs-functional-vs-reactive-programming)

## What are the differences between monolith and microservices? (Performance/Deployability/Failure impact and etc)
###### Relative links:
- http://www.kamilgrzybek.com/design/modular-monolith-architectural-drivers/

## Imperative vs functional vs reactive programming?
**Imperative programming** is fundamental to any programming language and even machine language is imperative. Internally other programming paradigm in some way or the other use imperative style internally but abstracts this out for the caller. **Imperative style is mostly sequential and follows a natural flow**, hence it is easy to write, debug and troubleshoot. In most case this offers better raw performance than other.

**Functional programming** is treating computation as “**mathematical functions**”, using pure function without side effect which does not change state. State are immutable in functional programming.

**Reactive programming** is typically **asynchronous events data stream over time and its propagation of change**. It is built on observable (publish/subscribe) & iterator pattern. Generally there are also functional programming and reactive programming done together for transformation of one streams to another.
###### Relative links:
- https://www.webagam.com/2018/11/24/imperative-functional-reactive-programming-which-one-to-use-when-and-for-what/

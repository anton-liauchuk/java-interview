# Core

## Какие нововведения в java 8, 9, 10, 11?
###### Relative links:
+ https://codete.com/blog/java-8-java-11-quick-guide/
+ https://www.quora.com/What-are-the-differences-between-Java-8-9-10-and-11

## В чем концептуальное отличие stream api от collection?
Streams differ from collections in several ways:
+ No storage. A stream is not a data structure that stores elements; instead, it conveys elements from a source such as a data structure, an array, a generator function, or an I/O channel, through a pipeline of computational operations.
+ Functional in nature. An operation on a stream produces a result, but does not modify its source. For example, filtering a Stream obtained from a collection produces a new Stream without the filtered elements, rather than removing elements from the source collection.
+ Laziness-seeking. Many stream operations, such as filtering, mapping, or duplicate removal, can be implemented lazily, exposing opportunities for optimization. For example, "find the first  String with three consecutive vowels" need not examine all the input strings. Stream operations are divided into intermediate (Stream-producing) operations and terminal (value- or side-effect-producing) operations. Intermediate operations are always lazy.
+ Possibly unbounded. While collections have a finite size, streams need not. Short-circuiting operations such as limit(n) or findFirst() can allow computations on infinite streams to complete in finite time.
+ Consumable. The elements of a stream are only visited once during the life of a stream. Like an Iterator, a new stream must be generated to revisit the same elements of the source.
###### Relative links:
+ https://stackoverflow.com/questions/39432699/what-is-the-difference-between-streams-and-collections-in-java-8

# Kafka
- [What are delivery guarantees in Kafka?](#what-are-delivery-guarantees-in-kafka)
- [What do in-sync replicas mean in Kafka, and what are the related configs?](#what-do-in-sync-replicas-mean-in-kafka-and-what-are-the-related-configs)
- [What happens if a consumer doesn't process a message in time?](#what-happens-if-a-consumer-doesnt-process-a-message-in-time)
- [If the number of consumers is greater than the number of partitions, what will happen?](#if-the-number-of-consumers-is-greater-than-the-number-of-partitions-what-will-happen)
- [There is increasing Kafka lag, but the service works as expected. What are possible options to solve the issue?](#there-is-increasing-kafka-lag-but-the-service-works-as-expected-what-are-possible-options-to-solve-the-issue)
- [Is it possible to change the number of partitions while downstream components are processing messages?](#is-it-possible-to-change-the-number-of-partitions-while-downstream-components-are-processing-messages)
- [How to calculate the optimal number of partitions per Kafka topic?](#how-to-calculate-the-optimal-number-of-partitions-per-kafka-topic)

## What are delivery guarantees in Kafka?
- At-most-once: Messages may be lost but never redelivered (e.g., acks=0). Fastest, least reliable.
- At-least-once: Messages are never lost but may be duplicated (e.g., acks=all). Default for most production use cases.
- Exactly-once: Each message is delivered and processed exactly once, using idempotent producers and transactions. Strongest guarantee, highest overhead.
###### Relative links:
- https://docs.confluent.io/kafka/design/delivery-semantics.html#exactly-once-support

## What do in-sync replicas mean in Kafka, and what are the related configs?
In-Sync Replicas are the set of replica followers that are fully caught up with the partition leader (no lag). Only ISR members can become the new leader after a failure, preventing data loss.
Key configs:
- `min.insync.replicas` – minimum ISR size required for a write with `acks=all`
- `replica.lag.time.max.ms` – max time a follower can lag before being removed from ISR
- `unclean.leader.election.enable=false` – prevents non-ISR replicas from becoming leader (avoids data loss)
###### Relative links:
- https://kafka.apache.org/42/design/design/#replication

## What happens if a consumer doesn't process a message in time?
The consumer is considered failed, leaves the consumer group, and triggers a rebalance to reassign its partitions. This is controlled by `max.poll.interval.ms` (default 300 seconds) – if `poll()` isn't called within this time, the consumer times out and exits the group.
###### Relative links:
- https://kafka.apache.org/42/configuration/consumer-configs/#consumerconfigs_max.poll.interval.ms

## If the number of consumers is greater than the number of partitions, what will happen?
The extra consumers will remain idle because each partition can be assigned to at most one consumer in a group.

## There is increasing Kafka lag, but the service works as expected. What are possible options to solve the issue?
1. Consumer group state → Is it Stable, Rebalancing, or Empty?
2. Partition lag distribution → Even lag or hot partitions?
3. Production rate → Did throughput spike on the source side?
4. Consumer processing time → Where is the time spent (fetch, process, write)?
5. Rebalance frequency → Are consumers bouncing?
6. GC pauses → Is the JVM stalling?
7. Sink health → Is the destination keeping up?
8. Scale or fix → Based on the bottleneck, choose the right action
###### Relative links:
- https://streamkap.com/resources-and-guides/debug-kafka-consumer-lag-runbook

## Is it possible to change the number of partitions while downstream components are processing messages?
Yes, but only to increase (cannot decrease). If you use message keys, ordering may break because hashing changes. Existing data is not redistributed.
###### Relative links:
- https://www.baeldung.com/kafka-add-partitions-topic

## How to calculate the optimal number of partitions per Kafka topic?
The optimal number balances producer/consumer throughput with minimal overhead. A simple formula: `max(target throughput / producer rate, target throughput / consumer rate)`.
###### Relative links:
- https://www.conduktor.io/blog/stop-over-partitioning-kafka

[Home Page](README.md)

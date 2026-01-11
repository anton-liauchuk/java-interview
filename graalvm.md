# GraalVM
- [What is GraalVM Native Image?](#what-is-graalvm-native-image)
- [Where would be better to use AOT cache feature and where would be better to use GraalVM Native Image?](#where-would-be-better-to-use-aot-cache-feature-and-where-would-be-better-to-use-graalvm-native-image)

## What is GraalVM Native Image?
**GraalVM Native Image** allows you to ahead-of-time compile Java code to a standalone executable, called a **native image**. This executable includes the application classes, classes from its dependencies, runtime library classes from JDK and statically linked native code from JDK. It does not run on the Java VM, but includes necessary components like memory management and thread scheduling from a different virtual machine, called “Substrate VM”. Substrate VM is the name for the runtime components (like the deoptimizer, garbage collector, thread scheduling etc.). The resulting program has faster startup time and lower runtime memory overhead compared to a Java VM.
###### Relative links:
- https://www.graalvm.org/docs/reference-manual/native-image/

## Where would be better to use AOT cache feature and where would be better to use GraalVM Native Image?
Use GraalVM Native Image when:
- Startup time is critical (serverless, CLI tools)
- Memory footprint must be minimal
- Application is relatively static with well-defined entry points
- You can invest in build time configuration

Use Java 25 AOT Cache when:
- You need significant startup improvements but not extreme optimization
- Dynamic features are essential (heavy reflection, dynamic proxies)
- Application compatibility is paramount
- You want a simpler deployment model
- Framework support for native compilation is limited
###### Relative links:
https://andrewbaker.ninja/2025/12/23/java-25-aot-cache-a-deep-dive-into-ahead-of-time-compilation-and-training/

[Home Page](README.md)

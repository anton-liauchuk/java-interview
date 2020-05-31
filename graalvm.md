# GraalVM
- [What is GraalVM Native Image?](#what-is-graalvm-native-image)

## What is GraalVM Native Image?
**GraalVM Native Image** allows you to ahead-of-time compile Java code to a standalone executable, called a **native image**. This executable includes the application classes, classes from its dependencies, runtime library classes from JDK and statically linked native code from JDK. It does not run on the Java VM, but includes necessary components like memory management and thread scheduling from a different virtual machine, called “Substrate VM”. Substrate VM is the name for the runtime components (like the deoptimizer, garbage collector, thread scheduling etc.). The resulting program has faster startup time and lower runtime memory overhead compared to a Java VM.
###### Relative links:
- https://www.graalvm.org/docs/reference-manual/native-image/

[Home Page](README.md)

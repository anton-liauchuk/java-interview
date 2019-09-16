# Maven
- [What is the difference between Maven and Gradle?](#what-is-the-difference-between-maven-and-gradle)
- [How will work Maven in the case of multiple version of the same dependency?](#how-will-work-maven-in-the-case-of-multiple-version-of-the-same-dependency)
- [What is the dependency management in Maven?](#what-is-the-dependency-management-in-maven)
- [Does maven support inheritance for pom files?](#does-maven-support-inheritance-for-pom-files)

## What is the difference between Maven and Gradle?
You can think of Gradle as goodness of Ant and Maven put together minus the noise of XML. And scriptability with groovy is very big plus.
- Gradle gives you conventions but still gives you power to override them easily.
- Gradle build files are less verbose as they are written in groovy.
- It provides very nice DSL for writing build tasks.
- Has lot of good plugins and vibrant ecosystem
- When to use Gradle and When to use Maven ?
###### Relative links:
- https://stackoverflow.com/questions/18072456/difference-between-gradle-and-maven

## How will work Maven in the case of multiple version of the same dependency?
For Java it doesn't matter how many versions of a class you provide. The default classloader will just pick the first one on the classpath it can find.
###### Relative links:
- https://stackoverflow.com/questions/35381533/maven-multiple-version-of-same-dependency
- https://stackoverflow.com/questions/24962607/multiple-versions-of-the-same-dependency-in-maven

## What is the dependency management in Maven?
The dependency management section is a mechanism for centralizing dependency information. When you have a set of projects that inherits a common parent it's possible to put all information about the dependency in the common POM and have simpler references to the artifacts in the child POMs.
###### Relative links:
- http://maven.apache.org/guides/introduction/introduction-to-dependency-mechanism.html#Dependency_Management

## Does maven support inheritance for pom files?
yes
###### Relative links:
- https://stackoverflow.com/questions/9299083/what-is-inherited-in-maven-projects
- http://maven.apache.org/pom.html#Inheritance

[Home Page](README.md)

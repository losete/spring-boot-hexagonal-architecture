# Spring-Boot - Ports-And-Adapters / Hexagonal Architecture

A POC of a Spring-Boot application based on **hexagonal architecture**

![alt hexagonal architecture / port and adapters](https://i.imgur.com/eseWVlB.png)

## checkstyle

In this project, checkstyle plugin is present. checkstyle tests are passed during validate phase. That is to say, by executing:
```
    $mvn validate
```
checkstyle tests will be passed.

Optionally, you can check without other validation tests if your .java files pass the tests by executing:
```
    $mvn checkstyle:check
```

## spotbugs

In this project, spotbugs plugin is present. spotbugs tests (-- with findsecbugs) are passed during test phase. That is to say, by executing:
```
    $mvn test
```
spotbugs tests will be passed.

Optionally, you can check without other tests if your project contains some type of bugs by executing:
```
    $mvn install
    $mvn spotbugs:check
```
mvn install is required due to spotbugs requirements

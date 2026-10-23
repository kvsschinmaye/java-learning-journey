# Abstraction in Java

##  Introduction

Abstraction is an OOP concept that hides implementation details and shows only the essential features of an object.

It focuses on **what an object does rather than how it does it**.

Java supports abstraction mainly through:
- Abstract classes
- Interfaces

## Abstract Class

An abstract class is declared using the `abstract` keyword. It cannot be instantiated directly and can contain both abstract and concrete methods.

### Important Points

- An abstract class is declared using the `abstract` keyword.
- An abstract class cannot be instantiated directly.
- It can contain abstract methods and concrete methods.
- It can have constructors, variables, and static methods.
- A child class must implement inherited abstract methods unless the child class is also abstract.
- An abstract class can be referenced by a variable that refers to an object of a concrete child class.

##  Abstract Method

An abstract method is declared without a method body and ends with a semicolon.

Example syntax:

```java
abstract double calculateArea();
```

The concrete child class provides the implementation of this method.

## Advantages of Abstraction

- Hides unnecessary implementation details.
- Reduces complexity.
- Improves code organisation and maintainability.
- Encourages a common structure for related classes.
- Supports runtime polymorphism when overridden instance methods are called through parent-class references.

## Summary

Abstraction hides implementation details while exposing essential functionality. In Java, abstract classes and interfaces help define common behaviour while allowing concrete classes to provide specific implementations.

# Method Overriding in Java

## Introduction

Method overriding occurs when a child class provides its own implementation of an inherited instance method using the same method signature and a compatible return type.

It allows a child class to modify or extend the behaviour inherited from its parent class.

##  Important Rules

1. Inheritance is required for method overriding.
2. The overriding method must have the same method name and parameter types.
3. The return type must be the same or a compatible covariant reference type.
4. The overriding method cannot have more restrictive access than the parent method.
5. The `@Override` annotation helps the compiler detect incorrect overriding.
6. `private` methods are not overridden because they are not inherited by the child class.
7. `final` methods cannot be overridden.
8. `static` methods are hidden, not overridden.
9. Constructors cannot be overridden because they are not inherited.
10. Method overriding supports runtime polymorphism.

##  Method Overloading vs Method Overriding

| Method Overloading | Method Overriding |
|---|---|
| Same method name with different parameter lists. | Same method signature in a child class. |
| Usually occurs within the same class. | Requires inheritance. |
| Compile-time polymorphism. | Supports runtime polymorphism. |

## Summary

Method overriding allows a child class to provide a specific implementation of an inherited instance method. It supports runtime polymorphism and promotes flexible, reusable code.

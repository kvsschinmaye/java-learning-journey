# Polymorphism in Java

## 1. Introduction

Polymorphism means **many forms**. In Java, it allows the same method name or reference to behave differently depending on the context.

Polymorphism improves code flexibility, reusability, and maintainability.

## 2. Types of Polymorphism

Java supports two main types of polymorphism:

- **Compile-Time Polymorphism:** Achieved through method overloading. The compiler determines which method to call based on the arguments.


- **Runtime Polymorphism:** Achieved through method overriding. The JVM selects the overridden instance method based on the actual object's class at runtime.

## 3. Important Rules

1. Method overloading uses the same method name with different parameter lists.
2. Method overriding requires inheritance and compatible method signatures.
3. A parent-class reference can refer to an object of its child class.
4. When an overridden instance method is called through a parent reference, the implementation belonging to the actual object's class executes.
5. The reference type determines which members are accessible at compile time.
6. Runtime polymorphism applies to overridden instance methods, not static methods.
7. Static methods are hidden rather than overridden.

## 4. Method Overloading vs. Method Overriding

| Method Overloading | Method Overriding |
|---|---|
| Same method name with different parameter lists. | Same method signature in a child class. |
| Usually occurs within the same class. | Requires inheritance. |
| Compile-time polymorphism. | Supports runtime polymorphism. |
| Method selection is determined at compile time. | Overridden instance method selection occurs at runtime. |

## 5. Advantages of Polymorphism

- Improves code flexibility and reusability.
- Supports extensible object-oriented designs.
- Allows different child classes to provide their own implementations of a common method.
- Reduces the need for code that handles every child class separately.

## 6. Summary

Polymorphism allows one interface or method name to represent different behaviours. Java achieves compile-time polymorphism through method overloading and runtime polymorphism through method overriding.

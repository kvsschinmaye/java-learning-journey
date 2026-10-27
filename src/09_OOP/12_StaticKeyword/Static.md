# Static Keyword in Java

## Introduction
The `static` keyword in Java is used for members that belong to the **class rather than individual objects**. Static members can be accessed using the class name without creating an object.

##  Uses of `static`

- **Static variable:** A single shared variable for all objects of a class.
- **Static method:** A method that can be called using the class name without creating an object.
- **Static block:** A block that executes once when the class is initialized, typically used to initialize static data.
- **Static nested class:** A nested class that does not require an instance of the outer class.

## Static vs Instance Members

| Static Members | Instance Members |
|---|---|
| Belong to the class | Belong to individual objects |
| Shared across objects (for static variables) | Each object has its own instance fields |
| Can be accessed using the class name | Usually accessed through an object |
| Cannot directly access instance members without an object reference | Can access both static and instance members |

##  Important Rules

- Static variables are shared among all instances of a class.
- Static methods can directly access static members but cannot directly access instance members.
- Static methods can access instance members through an object reference.
- The `this` and `super` keywords cannot be used in a static context.
- Static methods are hidden, not overridden, when a subclass declares a static method with the same signature.
- A static block executes when the class is initialized, before the class is used for the first time in a way that triggers initialization.
- Static members can be accessed through the class name, which is generally preferred over accessing them through an object.

##  Advantages of `static`

- Avoids creating separate copies of shared data.
- Allows utility methods to be called without creating objects.
- Supports class-level initialization.

##  Summary

The `static` keyword is useful when a variable, method, or initialization block should belong to the class rather than to individual objects. Common examples include shared counters, utility methods, and class-level configuration.
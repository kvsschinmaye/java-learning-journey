# Interfaces in Java

## 1. Introduction

An interface in Java defines a contract that specifies behaviours a class agrees to implement. It supports abstraction and allows different classes to provide their own implementations of common methods.

An interface is declared using the `interface` keyword, and a class implements it using the `implements` keyword.

## 2. Important Rules

1. Interface methods without a body are implicitly `public` and `abstract`.
2. Variables declared in an interface are implicitly `public`, `static`, and `final`.
3. A class uses the `implements` keyword to implement an interface.
4. Implemented abstract methods must be declared `public`.
5. A concrete class must implement all inherited abstract methods, unless it is declared abstract.
6. A class can implement multiple interfaces.
7. An interface cannot be instantiated directly.
8. An interface can extend one or more interfaces.
9. Interfaces can contain `default`, `static`, and `private` methods, subject to Java's interface rules.
10. Default methods provide an implementation that implementing classes can inherit or override.
11. Static interface methods belong to the interface and are called using the interface name.
12. An interface reference can refer to an object of a class that implements that interface.

## 3. Multiple Inheritance Through Interfaces

Java does not support multiple inheritance through classes, meaning a class cannot extend multiple classes.

However, a class can implement multiple interfaces, allowing it to provide behaviours defined by different interfaces.

## 4. Default and Static Methods

- **Default method:** Declared using the `default` keyword and includes a method body. Implementing classes can inherit or override it.
- **Static method:** Declared using the `static` keyword and belongs to the interface. It is called using the interface name.

## 5. Interface vs. Abstract Class

| Interface | Abstract Class |
|---|---|
| Declared using `interface`. | Declared using `abstract class`. |
| Implemented using `implements`. | Inherited using `extends`. |
| A class can implement multiple interfaces. | A class can extend only one class. |
| Fields are implicitly `public`, `static`, and `final`. | Can have instance variables and other kinds of fields. |
| Cannot have constructors. | Can have constructors. |
| Can contain abstract, default, static, and private methods. | Can contain abstract and concrete methods. |

## 6. Advantages of Interfaces

- Supports abstraction.
- Enables a class to implement multiple interfaces.
- Promotes loose coupling between classes.
- Improves flexibility and maintainability.
- Supports runtime polymorphism through interface references.

## 7. Summary

Interfaces define common contracts for classes to implement. They support abstraction, multiple interface implementation, flexible program design, and runtime polymorphism.


# Inheritance in Java

Inheritance is an Object-Oriented Programming (OOP) concept in which a class acquires accessible fields and methods from another class. It promotes code reusability and allows existing classes to be extended.

## 1. Basic Terminology

- **Parent class / Superclass:** The class whose accessible members are inherited.
- **Child class / Subclass:** The class that extends another class.
- **`extends`:** The keyword used for class inheritance.
- **Code reusability:** Reusing existing fields and methods instead of duplicating them.

### Syntax

```java
class Parent {
    // Fields and methods
}

class Child extends Parent {
    // Additional fields and methods
}
```

## 2. Types of Inheritance

### Single Inheritance

One child class inherits from one parent class.

Example: `Manager` extends `Employee`.

```text
Employee
   |
Manager
```

### Multilevel Inheritance

A class inherits from a child class, forming a chain of inheritance.

Example: `EBook` extends `Book`, and `Book` extends `LibraryItem`.

```text
LibraryItem
     |
    Book
     |
    EBook
```

An `EBook` object can access accessible inherited members from both `Book` and `LibraryItem`.

### Hierarchical Inheritance

Multiple child classes inherit from the same parent class.

Example: `CardPayment` and `UPIPayment` both extend `Payment`.

```text
       Payment
       /     \
CardPayment  UPIPayment
```

Both child classes inherit the accessible members of `Payment`, while maintaining their own additional fields and methods.

## 3. Accessing Inherited Members

A child class can use accessible inherited fields and methods directly.

```java
class Parent {
    String name;

    void displayName() {
        System.out.println(name);
    }
}

class Child extends Parent {
    void display() {
        displayName();
    }
}
```

The child class can reuse the parent's method without rewriting its implementation.

**Important:** Private members are not directly accessible in a subclass. Inheritance and accessibility depend on the member's access modifier.

## Advantages of Inheritance

- Promotes code reusability.
- Reduces duplicated code.
- Allows existing classes to be extended.
- Supports method overriding and runtime polymorphism.
- Helps represent relationships between related classes.

## Important Points

- Java uses `extends` for class inheritance.
- A Java class can directly extend only one class.
- Java supports single, multilevel, and hierarchical class inheritance.
- Multiple inheritance through classes is not supported.
- Multiple interfaces can be implemented by a class.
- Constructors are not inherited, although a subclass constructor can invoke a superclass constructor.
- Inheritance should represent a meaningful **is-a** relationship.
- A child class can add its own fields and methods to extend the parent's functionality.


## Summary

Inheritance allows a child class to reuse and extend accessible members of a parent class. Java supports single, multilevel, and hierarchical inheritance through classes, helping organize related classes and reduce code duplication.


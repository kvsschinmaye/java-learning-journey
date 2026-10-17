# Classes and Objects in Java

Classes and objects are fundamental concepts of Object-Oriented Programming (OOP) in Java.

## 1. Class

A class is a blueprint or template used to create objects. It defines the data and behavior that its objects can have.

A class can contain:
- Fields (variables)
- Methods
- Constructors
- Nested classes and interfaces

## 2. Object

An object is an instance of a class that represents an entity with its own state and behavior.

### Components of an Object

- **State:** Represented by instance variables.
- **Behavior:** Represented by methods.
- **Identity:** Distinguishes one object from another.

Example: In a `BankAccount` class, the account holder, account number, and balance represent state. Depositing and withdrawing money represent behavior.

## 3. Class Declaration

General syntax:

```java
class ClassName {
    // Instance variables
    // Methods
    // Constructors
}
```

## 4. Object Declaration and Initialization

Objects are commonly created using the `new` keyword.

```java
Student s1 = new Student();
```

This statement has three parts:

- `Student` – reference type.
- `s1` – reference variable.
- `new Student()` – creates an object and invokes its constructor.

Multiple objects can be created from the same class. Each object has its own instance variables.

## 5. Instance Variables and Instance Methods

### Instance Variables

- Declared inside a class but outside methods and constructors.
- Each object has its own copy of instance variables.
- Receive default values if not explicitly initialized.

### Instance Methods

- Define the behavior of objects.
- Can access instance variables and other instance methods directly.
- Can be called using an object reference.

Example: In `BankAccount`, `balance` is an instance variable, while `deposit()` and `withdraw()` are instance methods.

## 6. Accessing Members

Instance variables and methods can be accessed using the dot (`.`) operator.

```java
objectName.variableName;
objectName.methodName();
```

For example, `b1.displayAccountDetails()` calls the method on the object referenced by `b1`.

## 7. Multiple Objects

Objects created from the same class share the class's structure and behavior, but maintain separate instance state.

For example, `b1` and `b2` are two different `BankAccount` objects. Depositing money into `b1` does not change the balance of `b2`.

## 8. Array of Objects

An array can store references to multiple objects of the same type.

```java
BankAccount[] accounts = {b1, b2};
```

Objects can be accessed through array indexes:

```java
accounts[0].displayAccountDetails();
```

An array of objects stores references, not the actual objects themselves.

## 9. Ways to Create Objects in Java

Commonly discussed approaches include:

1. **Using `new`:** The standard approach for creating objects.
2. **Using reflection:** Creates objects dynamically from class information.
3. **Using `clone()`:** Creates a copy of an existing object when cloning is properly supported.
4. **Using deserialization:** Reconstructs an object from a serialized representation.
5. **Using factory methods:** A method returns an object instead of requiring the caller to create it directly.

**Important:** Reflection, cloning, and deserialization have additional requirements. Factory methods are a design approach, not a special object-creation keyword. The older `Class.newInstance()` method is deprecated; modern reflection uses a constructor's `newInstance()` method.

## Important Points

- A class defines the structure and behavior of objects.
- An object is an instance of a class.
- The `new` keyword commonly creates objects and invokes constructors.
- Each object has its own instance variables.
- Instance methods operate on the object they are called on.
- Objects of the same class can have different states.
- Reference variables refer to objects; they are not the objects themselves.
- Constructors and object initialization are covered in the next topic.
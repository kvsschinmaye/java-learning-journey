# Constructors in Java

A constructor is a special member of a class used to initialize an object when it is created.

## 1. Characteristics of Constructors

- The constructor name must match the class name.
- A constructor has no return type, not even `void`.
- It is invoked when an object is created through a constructor call.
- Constructors can be overloaded.
- Constructors are not inherited by subclasses.
- If no constructor is declared, Java provides a default constructor.

## 2. Types of Constructors

### No-Argument Constructor

A constructor that accepts no parameters.

It can initialize instance variables with predefined values.

**Note:** A programmer-defined no-argument constructor is different from the default constructor automatically provided by Java.

### Parameterized Constructor

A constructor that accepts parameters to initialize an object's instance variables with supplied values.

Different objects can be initialized with different values.

## 3. Constructor Overloading

Constructor overloading means defining multiple constructors in the same class with different parameter lists.

Constructors can differ in:
- Number of parameters
- Types of parameters
- Order of parameter types

The compiler selects the appropriate constructor based on the arguments supplied during object creation.

## 4. Constructor Chaining

Constructor chaining means calling one constructor from another constructor to reuse initialization logic.

### Using `this()`

- `this()` calls another constructor in the same class.
- It must be the first statement in a constructor.
- It helps avoid repeated initialization code.
- Constructor calls must eventually reach a constructor that does not call another constructor in the same chain.

### Example from Practice

In `ConstructorChaining.java`:
- The no-argument constructor calls the two-parameter constructor with predefined values.
- The one-parameter constructor supplies a default second value.
- The two-parameter constructor performs the actual initialization and calculations.

## 5. Constructor vs. Method

| Constructor | Method |
|---|---|
| Initializes an object | Performs an operation |
| Name must match the class name | Can have any valid method name |
| Has no return type | Has a return type or `void` |
| Invoked through object creation or constructor chaining | Called through a method invocation |
| Cannot be overridden | Can be overridden when inheritance rules permit |

## 6. Important Points

- If you declare any constructor, Java does not automatically provide the default constructor.
- Constructors can be overloaded but cannot be overridden.
- A constructor can call another constructor using `this()`.
- `this()` must be the first statement in a constructor.
- Constructors can have access modifiers.
- Constructors are not inherited, although a subclass constructor can invoke a superclass constructor using `super()`.

## Summary

Constructors initialize objects. Constructor overloading allows different ways to initialize objects, while constructor chaining reuses initialization logic and reduces code duplication.
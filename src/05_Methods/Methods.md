# Methods in Java

## Introduction

A method in Java is a block of code that performs a specific task and can be executed whenever required.

Methods help in:

- Code Reusability
- Modularity
- Readability
- Easier Maintenance
- Reduced Code Duplication

Instead of writing the same code multiple times, we can write it once inside a method and call it whenever needed.

---

# Method Syntax

```java
accessModifier returnType methodName(parameterList) {

    // method body
}
```

### Example

```java
public static void greet() {

    System.out.println("Welcome to Java");
}
```

---

# Components of a Method

## 1. Access Modifier

Defines the accessibility of a method.

Examples:

- `public`
- `private`
- `protected`
- default

```java
public void display() {
}
```

---

## 2. Return Type

Specifies the type of value returned by a method.

```java
int getNumber() {

    return 10;
}
```

If a method does not return any value, use:

```java
void display() {
}
```

---

## 3. Method Name

The name used to call the method.

### Naming Convention

- Start with a lowercase letter
- Follow camelCase notation

Examples:

```java
calculateArea()
displayMessage()
getSum()
```

---

## 4. Parameters

Parameters are variables declared in the method definition.

```java
void add(int a, int b) {
}
```

Here:

```text
a and b are parameters
```

Parameters are optional.

---

## 5. Method Body

Contains the actual logic of the method.

```java
void greet() {

    System.out.println("Hello");
}
```

---

# Types of Methods

## 1. Predefined Methods

Methods already provided by Java libraries.

Examples:

```java
Math.sqrt()
Math.pow()
System.out.println()
```

---

## 2. User-Defined Methods

Methods created by programmers.

```java
public static void greet() {

    System.out.println("Hello");
}
```

---

# Method Signature

A method signature consists of:

```text
Method Name + Parameter List
```

It does not include:

- Return Type
- Access Modifier

Example:

```java
int add(int a, int b)
```

Method Signature:

```text
add(int, int)
```

---

# Parameters vs Arguments

| Parameters | Arguments |
|------------|------------|
| Variables declared in method definition | Actual values passed during method call |
| Receive data | Supply data |

Example:

```java
void add(int a, int b)
```

**Here :**  a and b are parameters


```java
add(10, 20);
```

**Here :** 10 and 20 are arguments

---

# Instance Methods vs Static Methods

| Instance Method | Static Method |
|---|---|
| Belongs to an object | Belongs to a class |
| Requires object creation | No object required |
| Called using object reference | Called using class name |
| Can access instance members directly | Can access only static members directly |
| Can use `this` keyword | Cannot use `this` keyword |

### Instance Method

```java
class Student {

    void display() {

        System.out.println("Student");
    }
}
```

### Static Method

```java
class Student {

    static void display() {

        System.out.println("Student");
    }
}
```

---

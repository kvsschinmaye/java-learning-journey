# Method Overloading in Java

## Introduction

Method Overloading is a feature in Java that allows multiple methods to have the same name but different parameter lists within the same class.

It is an example of **Compile-Time Polymorphism (Static Polymorphism)**.

Method overloading improves code readability and reusability by allowing similar operations to be performed using the same method name.

---

## Definition

Method Overloading occurs when two or more methods in the same class have:

- Same method name
- Different parameter lists

The difference can be in:
- Number of parameters
- Data types of parameters
- Order of parameters

---

## Syntax

```java
returnType methodName(parameterList)
{
    // method body
}
```

Multiple methods can share the same name if their parameter lists differ.

---

# Ways to Achieve Method Overloading

## 1. Changing the Number of Parameters

```java
add(int a, int b)

add(int a, int b, int c)
```

---

## 2. Changing the Data Types of Parameters

```java
add(int a, int b)

add(double a, double b)
```

---

## 3. Changing the Order of Parameters

```java
display(String name, int age)

display(int age, String name)
```

---

## Example Structure

```text
add()
│
├── add(int, int)
├── add(double, double)
├── add(int, int, int)
└── add(int, double)
```

---

# Rules of Method Overloading

## Valid Overloading

```java
add(int a, int b)

add(double a, double b)
```

```java
display(String name, int age)

display(int age, String name)
```

---

## Invalid Overloading

Changing only the return type does not overload a method.

```java
int add(int a, int b)

double add(int a, int b)
```

This causes a compilation error.

---


# Java Data Types

## Introduction

A data type specifies the type of data that a variable can store.

Java is a **statically typed** and **strongly typed** programming language because every variable must be declared with a specific data type before use.

Example:

```java
int age = 20;
char grade = 'A';
double salary = 25000.50;
```

---

# Types of Data Types in Java

Java data types are mainly divided into two categories:

```text
Data Types
│
├── Primitive Data Types
│
└── Non-Primitive Data Types
```

---

# 1. Primitive Data Types

Primitive data types store single values and are predefined by Java.

There are **8 primitive data types** in Java:

```text
boolean
byte
short
int
long
float
double
char
```

---

# Classification of Primitive Data Types

```text
Primitive Data Types
│
├── Non-Numeric
│   ├── boolean
│   └── char
│
└── Numeric
    │
    ├── Integer
    │   ├── byte
    │   ├── short
    │   ├── int
    │   └── long
    │
    └── Floating Point
        ├── float
        └── double
```

---

# Memory Size of Primitive Data Types

| Data Type | Size | Range | Default Value |
|---|---|---|---|
| boolean | JVM dependent (typically 1 byte) | true / false | false |
| byte | 1 byte | -128 to 127 | 0 |
| short | 2 bytes | -32,768 to 32,767 | 0 |
| int | 4 bytes | -2³¹ to 2³¹ - 1 | 0 |
| long | 8 bytes | -2⁶³ to 2⁶³ - 1 | 0L |
| float | 4 bytes | Up to 7 decimal digits | 0.0f |
| double | 8 bytes | Up to 15-16 decimal digits | 0.0d |
| char | 2 bytes | 0 to 65,535 (Unicode) | '\u0000' |

---

## 1. boolean

- Stores logical values:
  - `true`
  - `false`
- Used in conditions and decision making.

Example:

```java
boolean isJavaFun = true;
```

---

## 2. byte

- 8-bit signed integer.
- Range:
  - `-128 to 127`
- Useful for saving memory in large arrays.

Example:

```java
byte age = 25;
```

---

## 3. short

- 16-bit signed integer.
- Used when memory saving is required.

Example:

```java
short salary = 25000;
```

---

## 4. int

- 32-bit signed integer.
- Most commonly used integer type in Java.

Example:

```java
int marks = 95;
```

---

## 5. long

- 64-bit signed integer.
- Used for very large values.

Example:

```java
long population = 14000000000L;
```

---

## 6. float

- 32-bit floating point number.
- Stores decimal values.
- Suffix `f` is required.

Example:

```java
float price = 99.99f;
```

---

## 7. double

- 64-bit floating point number.
- More accurate than float.
- Default choice for decimal values.

Example:

```java
double pi = 3.141592653;
```

---

## 8. char

- Stores a single Unicode character.
- Uses 16 bits.
- Supports Unicode characters.

Example:

```java
char grade = 'A';
```

---

# 2. Non-Primitive Data Types

Non-primitive data types are also called reference data types.

They store references (memory addresses) instead of actual values directly.

Their size is not fixed, and they can contain methods and properties.

Default value:

```text
null
```

---

# Types of Non-Primitive Data Types

```text
Non-Primitive Data Types
│
├── String
├── Class
├── Object
├── Interface
├── Array
└── Collection Classes
```

---

# 1. String

A String is a sequence of characters enclosed within double quotes.

Example:

```java
String name = "Chinmaye";
```

Features:
- Immutable
- Stores textual data
- Supports built-in methods

---

# 2. Class

A class is a blueprint used to create objects.

It contains:
- variables
- methods
- constructors

Example:

```java
class Student
```

---

# 3. Object

An object is an instance of a class.

Example:

```java
Student s1 = new Student();
```

Features:
- Stored in heap memory
- Accesses class members

---

# 4. Interface

An interface is used to achieve abstraction and multiple inheritance in Java.

Example:

```java
interface Animal
```

Features:
- Contains abstract methods
- Supports abstraction

---

# 5. Array

An array stores multiple values of the same type using a single variable.

Example:

```java
int[] numbers = {10, 20, 30};
```

Features:
- Fixed size
- Indexed from 0
- Arrays are objects in Java

---

# 6. Collection Classes

Collection classes store and manage groups of objects dynamically.

Examples:

```text
ArrayList
LinkedList
HashSet
HashMap
```

Features:
- Dynamic size
- Built-in methods
- Easy data manipulation

---

# Primitive vs Non-Primitive Data Types

| Primitive Data Types | Non-Primitive Data Types |
|---|---|
| Predefined by Java | Reference/User-defined |
| Stores actual values | Stores references |
| Fixed memory size | Memory size varies |
| Stored in stack memory | Stored in heap memory |
| Faster access | Slightly slower |
| Cannot be null | Can be null |


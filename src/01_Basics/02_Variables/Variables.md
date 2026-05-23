# Variables in Java

## Introduction

A variable is a name given to a memory location used to store data in a program.

It is the basic unit of storage in Java.

The value stored in a variable can change during program execution.

---

# Features of Variables

- Variables must be declared before use.
- Every variable has a specific data type.
- Variables are used to store values temporarily in memory.

---

# Declaration of Variables

Variable declaration specifies:
- data type
- variable name

Syntax:

```java
dataType variableName;
```

Example:

```java
int age;
```

---

# Initialization of Variables

Initialization means assigning a value to a variable.

Syntax:

```java
dataType variableName = value;
```

Example:

```java
int age = 20;
```

Here:
- `int` → data type
- `age` → variable name
- `20` → value stored in memory

---

# Ways of Assigning Values to Variables

Values can be assigned in two ways:

1. Variable Initialization
2. Taking Input from User

---

# Types of Variables in Java

```text
Variables
│
├── Local Variables
├── Instance Variables
└── Static Variables
```

---

# 1. Local Variables

Local variables are declared inside:
- methods
- constructors
- blocks

Features:
- Scope limited to method/block
- Created during method execution
- Destroyed after method ends

Example:

```java
public void display() {

    int number = 10;
}
```

---

# 2. Instance Variables

Instance variables are declared inside a class but outside methods.

Features:
- Belong to objects
- Separate copy for each object
- Accessed using object references

Example:

```java
class Student {

    int rollNo;
}
```

---

# 3. Static Variables

Static variables are also called class variables.

Declared using the `static` keyword.

Features:
- Shared among all objects
- Only one shared copy exists
- Accessed using class name

Example:

```java
class College {

    static String collegeName = "GEC";
}
```

---

# Difference Between Instance and Static Variables

| Instance Variables | Static Variables |
|---|---|
| Belong to objects | Belong to class |
| Separate copy for each object | Single shared copy |
| Accessed using objects | Accessed using class name |

---

# Scope and Lifetime of Variables

| Variable Type | Scope | Lifetime |
|---|---|---|
| Local Variable | Inside method/block | Until method ends |
| Instance Variable | Entire object | Until object is destroyed |
| Static Variable | Entire class | Until program ends |

---

# Naming Rules for Variables

- Variable names can contain:
    - letters
    - digits
    - `_`
    - `$`

- Variable names cannot:
    - start with digits
    - contain spaces
    - use Java keywords
  
- Java follows camelCase naming convention.

# Java Basic Syntax

### Simple Java Program

```java
public class Simple {

    public static void main(String[] args) {

        System.out.println("Welcome to Java");

    }
}
```

---

## 1. Class Definition

### public

- `public` is an access modifier
- It makes the class accessible from anywhere

---

### class

- `class` is a keyword used to define a class in Java

---

### Simple

- `Simple` is the name (identifier) of the class
- The class body is written inside curly braces `{ }`

---

## 2. Main Method

Every Java application must contain a `main()` method.

- It is the entry point of a Java program
- JVM starts execution from the `main()` method

### Syntax

```java
public static void main(String[] args)
```

---

### public

- Allows JVM to access the method from outside the class

---

### static

- Belongs to the class, not to objects
- No need to create an object to call the method

---

### void

- Indicates the method does not return any value

---

### main()

- Main method where program execution starts

---

### String[] args

- Stores command line arguments
- It is an array of String objects

---

## 3. Print Statement

### System

- A predefined final class in the `java.lang` package
- Provides standard input, output, and error streams

---

### out

- A static object of `PrintStream`
- Represents the standard output stream

---

### println()

- Method used to print output to the console
- Prints data and moves the cursor to the next line

### Example

```java
System.out.println("Hello Java");
```

---

## Difference Between print() and println()

| print() | println() |
|---|---|
| Prints output in same line | Prints output and moves to next line |

---

## Execution Flow

```text
System → out → println()
```


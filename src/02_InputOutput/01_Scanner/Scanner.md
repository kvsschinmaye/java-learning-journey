# Scanner Class in Java

## Introduction

In Java, input can be taken from the user using mainly two classes:

1. BufferedReader
2. Scanner

These classes help in handling input operations for different data types like:
- integers
- floating values
- characters
- strings

---

# Scanner Class

`Scanner` is a modern and user-friendly class used for taking input from the user.

It is available in the:

```java
java.util
```

package.

---

## Import Statement

```java
import java.util.Scanner;
```

---

## Creating Scanner Object

```java
Scanner sc = new Scanner(System.in);
```

- `System.in` represents standard input device (keyboard)
- `sc` is the Scanner object

---

## Common Scanner Methods

| Method | Purpose |
|---|---|
| `nextInt()` | Reads integer value |
| `nextFloat()` | Reads float value |
| `nextDouble()` | Reads double value |
| `next()` | Reads single word |
| `nextLine()` | Reads complete line |
| `next().charAt(0)` | Reads single character |


---

## BufferedReader vs Scanner

| BufferedReader | Scanner |
|---|---|
| Faster | Slower |
| Better for large input | Better for basic input |
| More complex | Easy to use |
| Requires exception handling | No checked exceptions needed |
| Reads data as text | Reads multiple data types directly |

---
### Closing of Scanner Object
- Always close Scanner object using:

```java
sc.close();
```


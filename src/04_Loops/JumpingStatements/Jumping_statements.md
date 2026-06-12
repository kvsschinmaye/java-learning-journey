# Jumping Statements in Java

## Introduction

Jumping statements are used to alter the normal flow of program execution.

They help in:
- terminating loops
- skipping iterations
- exiting methods

Java provides three main jumping statements:

```text
Jumping Statements
│
├── break
├── continue
└── return
```

---

# 1. break Statement

The `break` statement is used to terminate a loop or switch statement immediately.

When a `break` statement is encountered, control exits from the loop or switch and moves to the next statement after it.

### Syntax

```java
break;
```

### Features

- Terminates loop execution immediately
- Can be used inside loops and switch statements
- Improves control over program flow

### Example

```java
for(int i = 1; i <= 10; i++) {

    if(i == 5) {
        break;
    }

    System.out.println(i);
}
```

### Output

```text
1
2
3
4
```

---

# 2. continue Statement

The `continue` statement skips the current iteration and moves to the next iteration of the loop.

### Syntax

```java
continue;
```

### Features

- Skips current iteration
- Does not terminate the loop
- Useful for filtering specific values

### Example

```java
for(int i = 1; i <= 5; i++) {

    if(i == 3) {
        continue;
    }

    System.out.println(i);
}
```

### Output

```text
1
2
4
5
```

---

# 3. return Statement

The `return` statement is used to exit from a method.

It can optionally return a value to the calling method.

### Syntax

### Without Return Value

```java
return;
```

### With Return Value

```java
return value;
```

### Features

- Terminates method execution
- Can return values
- Commonly used in methods and functions

### Example

```java
public static void display() {

    System.out.println("Hello");

    return;
}
```

---

### Difference Between break, continue and return

| Statement | Purpose | Effect |
|------------|----------|----------|
| break | Terminates loop/switch | Exits loop immediately |
| continue | Skips current iteration | Moves to next iteration |
| return | Exits method | Stops method execution |


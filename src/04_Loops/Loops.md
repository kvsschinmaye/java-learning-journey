# Loops in Java

## Introduction

Loops are iterative statements used to execute a block of code repeatedly until a condition becomes false.

They help reduce code repetition and are useful for repetitive tasks.

---

## Types of Loops in Java

```text
Loops
│
├── for Loop
├── while Loop
└── do-while Loop
```

---

# Loop Classification

## 1. Entry Controlled Loops (Pre-Test Loops)

The condition is checked before executing the loop body.

If the condition is false initially, the loop body will not execute.

Examples:

* `for`
* `while`

---

## 2. Exit Controlled Loops (Post-Test Loops)

The condition is checked after executing the loop body.

The loop body executes at least once even if the condition is false.

Example:

* `do-while`

---

## 1. for Loop

The `for` loop is used when the number of iterations is known in advance.

It combines:

* initialization
* condition checking
* updation

in a single line.

---

### Syntax

```java
for(initialization; condition; update)
{
    // loop body
}
```
* Commonly used in counting operations
---

### Components of for Loop

* **Initialization** → sets initial value of loop variable
* **Condition** → loop runs while condition is true
* **Update** → increments/decrements loop variable


---

## Infinite for Loop

A loop whose condition never becomes false.

```java
for(;;)
{
    // infinite loop
}
```

---

## Nested for Loop

A loop inside another loop is called a nested loop.

Used for:

* patterns
* tables
* matrix operations

---

## for-each Loop (Enhanced for Loop)

Introduced in Java 5.

Used to iterate through arrays or collections without using indexes.

---

### Syntax

```java
for(dataType variable : array)
{
    // statements
}
```

* Simple and readable
* No index handling required
* Useful for arrays and collections

---

### Limitations

* Cannot directly modify array elements
* No index access
* Mostly used for forward traversal only

---

## 2. while Loop

The `while` loop executes repeatedly as long as the condition is true.

Used when the number of iterations is not known beforehand.

---

### Syntax

```java
while(condition)
{
    // statements

    // update expression
}
```


* Condition checked before execution
* Suitable for user-controlled loops

---

## Infinite while Loop

```java
while(true)
{
    // infinite loop
}
```

---

## 3. do-while Loop

The `do-while` loop executes the loop body first and checks the condition afterward.

Therefore, the loop executes at least once.

---

### Syntax

```java
do
{
    // statements

    // update expression

} while(condition);
```

* Useful for menu-driven programs

---

# Nested Loops

Placing one loop inside another loop is called nested looping.

Examples:

* `for` inside `for`
* `while` inside `for`
* `do-while` inside `while`

---
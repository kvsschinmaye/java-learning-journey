# Operators in Java

## Introduction

Operators are special symbols used to perform operations on variables and values.

Java provides different types of operators for performing mathematical, logical, comparison, and bit-level operations.

---

# Types of Operators in Java

```text
Operators
│
├── Arithmetic Operators
├── Unary Operators
├── Assignment Operators
├── Relational Operators
├── Logical Operators
├── Ternary Operator
├── Bitwise Operators
└── Shift Operators
```

---

# 1. Arithmetic Operators

Arithmetic operators are used to perform mathematical operations.

| Operator | Description |
|---|---|
| `+` | Addition |
| `-` | Subtraction |
| `*` | Multiplication |
| `/` | Division |
| `%` | Modulus (Remainder) |

---

# 2. Unary Operators

Unary operators work on a single operand.

| Operator | Description |
|---|---|
| `+` | Unary Plus |
| `-` | Unary Minus |
| `++` | Increment |
| `--` | Decrement |
| `!` | Logical NOT |
| `~` | Bitwise Complement |

---

## Increment and Decrement

### Post Increment

```java
a++
```

- Value is used first
- Then incremented

---

### Pre Increment

```java
++a
```

- Value is incremented first
- Then used

---

### Post Decrement

```java
a--
```

- Value is used first
- Then decremented

---

### Pre Decrement

```java
--a
```

- Value is decremented first
- Then used

---

# 3. Assignment Operators

Assignment operators are used to assign values to variables.

---

### Simple Assignment Operator

| Operator | Description |
|---|---|
| `=` | Assigns value |

---

### Compound Assignment Operators

These are shorthand operators.

| Operator | Equivalent To |
|---|---|
| `+=` | `a = a + b` |
| `-=` | `a = a - b` |
| `*=` | `a = a * b` |
| `/=` | `a = a / b` |
| `%=` | `a = a % b` |

---

# 4. Relational Operators

Relational operators compare two values and return a boolean result.

| Operator | Description |
|---|---|
| `==` | Equal to |
| `!=` | Not equal to |
| `>` | Greater than |
| `<` | Less than |
| `>=` | Greater than or equal to |
| `<=` | Less than or equal to |

---

# 5. Logical Operators

Logical operators are used to combine conditions.

| Operator | Description |
|----------|--|
| `&&`     | Logical AND |
| `\|\| `  | Logical OR |
| `!`      | Logical NOT |

---

## Logical AND (`&&`)

- Returns `true` if both conditions are true
- Returns `false` if any one condition is false

---

## Logical OR (`||`)

- Returns `true` if at least one condition is true
- Returns `false` only if both conditions are false

---

## Logical NOT (`!`)

- Reverses the boolean result
- `true` becomes `false`
- `false` becomes `true`

---

# 6. Ternary Operator

The ternary operator is a short form of `if-else`.

Syntax:

```java
condition ? expression1 : expression2;
```

- If condition is true → `expression1`
- Else → `expression2`

---

# 7. Bitwise Operators

Bitwise operators perform operations on binary bits.

| Operator | Description       |
|------|-------------------|
| `&`  | Bitwise AND       |
| `\|` |  Bitwise OR |
| `^`  | Bitwise XOR       |
| `~`  | Bitwise Complement |

---

# 8. Shift Operators

Shift operators shift bits to left or right.

| Operator | Description |
|---|---|
| `<<` | Left Shift |
| `>>` | Right Shift |
| `>>>` | Unsigned Right Shift |

---

## Left Shift Operator (`<<`)

- Shifts bits to the left
- Equivalent to multiplying by `2ⁿ`

Example:

```java
5 << 2 = 20
```

---

## Right Shift Operator (`>>`)

- Shifts bits to the right
- Equivalent to dividing by `2ⁿ`

Example:

```java
20 >> 2 = 5
```

---

## Unsigned Right Shift Operator (`>>>`)

- Shifts bits to the right
- Fills leftmost positions with `0`

---

# Important Points

- Arithmetic operators work on numeric values
- Relational operators always return boolean values
- Logical operators are mainly used in conditions
- Bitwise operators work on binary values
- Ternary operator is useful for short conditions

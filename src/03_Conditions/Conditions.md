# Decision Making Statements 

## Introduction

Decision-making statements are used to control the flow of program execution based on certain conditions.

These statements help the program choose different paths depending on whether a condition is true or false.

---

## Types of Decision Making Statements

```text
Decision Making Statements
│
├── if Statement
├── if-else Statement
├── if-else-if Ladder
├── Nested if
└── switch Statement
```

---

## 1. if Statement

The `if` statement executes a block of code only when the condition is true.

### Syntax

```java
if(condition) {

    // code to execute
}
```

- Accepts boolean conditions
- Executes block only if condition is true
- Skips block if condition is false

---

## 2. if-else Statement

The `if-else` statement executes one block when the condition is true and another block when the condition is false.

### Syntax

```java
if(condition) {

    // code if condition is true
}
else {

    // code if condition is false
}
```

- Used for two-way decision making
- Exactly one block gets executed

---

## 3. if-else-if Ladder

The `if-else-if` ladder is used to test multiple conditions sequentially.

### Syntax

```java
if(condition1) {

    // statement 1
}
else if(condition2) {

    // statement 2
}
else if(condition3) {

    // statement 3
}
else {

    // default statement
}
```

- Supports multiple conditions
- Conditions are checked from top to bottom
- Final `else` block is optional

---

## 4. Nested if

A nested `if` means placing one `if` statement inside another `if` statement.

### Syntax

```java
if(condition1) {

    if(condition2) {

        // code
    }
}
```

- Used for complex conditional checking
- Allows multiple levels of decision making
- Excessive nesting reduces readability

---

## 5. switch Statement

The `switch` statement is used for multi-way branching based on the value of an expression.

### Syntax

```java
switch(expression) {

    case value1:
        // statement
        break;

    case value2:
        // statement
        break;

    default:
        // default statement
}
```

- Used when multiple choices are available
- `break` prevents fall-through
- `default` executes if no case matches
- Supports:
    - int
    - char
    - byte
    - short
    - String
    - enum

---

## Time and Space Complexity

| Statement Type | Time Complexity | Space Complexity |
|---|---|---|
| if | O(1) | O(1) |
| if-else | O(1) | O(1) |
| else-if ladder | O(n) | O(1) |
| switch | O(1) | O(1) |

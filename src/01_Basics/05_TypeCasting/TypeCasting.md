# Type Casting in Java

## Definition

Type Casting is the process of changing the data type of a value or variable from one type to another.

---

## Types of Type Casting

1. Implicit Type Casting (Widening)
2. Explicit Type Casting (Narrowing)

---

## 1. Implicit Type Casting (Widening)

- Converting a smaller data type into a larger data type
- Done automatically by the compiler
- No data loss occurs
- Both data types must be compatible

### Syntax

```java
largerDataType variableName = smallerDataTypeVariable;
```

### Increasing Order of Size

```text
byte → short → int → long → float → double
```

---

## 2. Explicit Type Casting (Narrowing)

- Converting a larger data type into a smaller data type
- Done manually by the programmer
- May cause data loss
- Both data types must be compatible

### Syntax

```java
smallerDataType variableName = (smallerDataType) largerDataTypeVariable;
```

### Decreasing Order of Size

```text
double → float → long → int → short → byte
```

---

## Key Differences

| Implicit Casting | Explicit Casting |
|---|---|
| Automatic | Manual |
| Safe | May cause data loss |
| Smaller → Larger | Larger → Smaller |
| No type conversion syntax needed | Type conversion syntax required |


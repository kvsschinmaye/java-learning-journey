# Access Modifiers in Java

Access modifiers control the visibility and accessibility of classes, fields, constructors, and methods in Java.

Java has four access levels: `public`, `protected`, default (no modifier), and `private`.

## 1. Types of Access Modifiers

| Modifier | Same Class | Same Package | Subclass in Different Package | Other Packages |
|---|---|---|---|---|
| `private` | Yes | No | No | No |
| Default | Yes | Yes | No, unless also in the same package | No |
| `protected` | Yes | Yes | Yes, subject to protected-access rules | No, except through permitted subclass access |
| `public` | Yes | Yes | Yes | Yes, if the declaring type is accessible |

**Note:** Default access means no access modifier is specified. The table describes ordinary member access; class visibility and Java's protected-access rules also apply.

## 2. Public Modifier

The `public` modifier allows access from other classes and packages, provided the declaring class and other required types are accessible.

```java
public int publicField = 10;
```

Public methods can also provide access to data through controlled operations.

## 3. Private Modifier

The `private` modifier restricts direct access to the declaring class.

```java
private int privateField = 40;
```

A private field can be accessed directly inside its declaring class, but not directly from another top-level class.

A public method inside the declaring class can access that private field and expose selected information or behavior.

## 4. Default Access Modifier

When no modifier is specified, Java applies package-private access.

```java
int defaultField = 30;
```

The member can be accessed by classes in the same package but not by unrelated classes in other packages.

## 5. Protected Modifier

The `protected` modifier allows access:
- Within the declaring class.
- From classes in the same package.
- From subclasses in other packages, subject to Java's protected-access rules.

```java
protected int protectedField = 20;
```

A subclass in another package does not get unrestricted access to every protected member through every object reference. The rules depend on the context of the subclass access.

## 6. Access Modifiers in Practice

In `AccessModifiersDemo.java`, four fields and methods demonstrate the different access levels.

- **Inside `AccessModifiersDemo`:** All four fields are accessible.
- **Inside `main()`:** All four fields would be accessible because `main()` belongs to the declaring class.
- **Inside `TestAccess` in the same package:** `public`, `protected`, and default fields are accessible, but `privateField` cannot be accessed directly.
- **Calling `showPrivateField()`:** This is allowed from `TestAccess` because the method is public and accesses the private field inside its own class.

## 7. Important Points

- Access modifiers control visibility, not object creation or initialization.
- `private` is the most restrictive of the four access levels.
- Default access is also called package-private access.
- `protected` provides package access and qualified subclass access.
- A public method can use private fields internally without making those fields public.
- Access modifiers are important for encapsulation and designing maintainable classes.

## 8. Practice Program

- `AccessModifiersDemo.java` – demonstrates all four access levels inside a class, in `main()`, and from another class in the same package.

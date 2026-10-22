# Super Keyword in Java

## 1. Introduction

The `super` keyword in Java refers to the immediate parent class context. It is used to access parent class variables, methods, and constructors.

## 2. Uses of `super`

- **`super.variableName`** — accesses an accessible parent field when needed, such as when a child field hides it.
- **`super.methodName()`** — calls the parent class implementation of a method.
- **`super()`** — calls the parent class's no-argument constructor.
- **`super(arguments)`** — calls a matching parameterized constructor of the parent class.

## 3. Important Rules

1. `super()` calls the parent class's no-argument constructor.
2. `super(arguments)` calls a matching parent constructor.
3. An explicit `super(...)` constructor call must be the first statement in the constructor.
4. If no constructor invocation is written, Java normally inserts an implicit `super()` call, provided an accessible no-argument parent constructor exists.
5. If the child overrides a parent method, `super.methodName()` can call the parent's implementation.
6. If a method is inherited and not overridden, the child can call it directly without `super`.
7. `super` refers to the immediate parent class, not directly to any distant ancestor.
8. `super` cannot be used in a static context because it refers to the current object's parent-class context.

## 4. Difference Between `this` and `super`

| `this` | `super` |
|---|---|
| Refers to the current object. | Refers to the immediate parent class context. |
| `this.name` accesses the current object's `name` field. | `super.name` accesses the parent field when it is accessible and hidden by a child field. |
| `this()` calls another constructor in the same class. | `super()` calls a constructor in the parent class. |
| `this.method()` calls a method on the current object. | `super.method()` explicitly calls the parent's implementation of an instance method. |

## 5. Summary

The `super` keyword helps a child class reuse parent functionality, initialize inherited state through parent constructors, and call parent implementations of overridden methods.

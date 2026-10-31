# Final Keyword in Java

## 1. Introduction

The `final` keyword in Java is used to restrict modifications. It can be applied to variables, methods, and classes.

## 2. Uses of `final`

### Final Variable
- A final variable can be assigned only once.
- Once initialized, its value cannot be reassigned.
- It is commonly used to declare constants.

### Final Method
- A final method cannot be overridden by a subclass.
- It can still be inherited and called by child classes.

### Final Class
- A final class cannot be extended or inherited.
- Objects of a final class can still be created normally.

## 3. Important Rules

- A final variable must be initialized before it is used.
- A blank final variable can be initialized in a constructor.
- A final method cannot be overridden, but it can be overloaded.
- A final class cannot be extended.
- A final reference variable cannot point to another object, but the referenced object's contents may still be modified if it is mutable.
- Constructors cannot be declared `final` because they are not inherited or overridden.

## 4. Advantages of `final`

- Prevents unwanted changes.
- Helps create constants.
- Prevents method overriding and class inheritance where required.
- Makes code easier to maintain by enforcing restrictions.

## 5. Summary

The `final` keyword provides control over variables, methods, and classes. It is useful when reassignment, method overriding, or inheritance must be restricted.
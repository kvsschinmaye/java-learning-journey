# Encapsulation in Java

Encapsulation is an Object-Oriented Programming (OOP) concept that combines data and the methods that operate on it within a class while restricting direct access to the object's internal data.

It helps protect data and control how an object's state is modified.

## Key Concepts

- **Data hiding:** Restricting direct access to internal fields.
- **Private fields:** Declaring fields with the `private` modifier.
- **Public methods:** Providing controlled access to an object's data and behavior.
- **Validation:** Checking values before modifying the object's state.

##  How Encapsulation Works

Encapsulation is commonly implemented by:

1. Declaring instance variables as `private`.
2. Providing public methods for operations that need access to those variables.
3. Validating input before updating the object's state.
4. Exposing only the information and operations that are necessary.

## Getters and Setters

### Getter

A getter returns the value of a private field without directly exposing the field itself.

```java
public double getBalance() {
    return balance;
}
```

### Setter

A setter updates a private field, potentially after validating the supplied value.

```java
public void setName(String name) {
    if (name != null && !name.isBlank()) {
        this.name = name;
    }
}
```

Not every field needs a setter. For example, a bank account's balance should generally be changed through deposit and withdrawal operations rather than an unrestricted setter.

##  Encapsulation with a Bank Account

In `BankAccountEncapsulation.java`, the fields are:

- `accountHolder`
- `accountNumber`
- `balance`

These fields are declared `private`.

Public methods provide controlled access:

- `deposit()` – adds a valid amount to the balance.
- `withdraw()` – subtracts an amount when it is valid and sufficient funds are available.
- `currentBalance()` – returns the current balance.
- `displayAccountDetails()` – displays the account information.
- `setAccountHolder()` – updates the account holder's name after validation.

The constructor initializes the account. It should also prevent invalid initial values from being accepted.

## Advantages of Encapsulation

- Protects an object's internal data from unrestricted direct access.
- Helps prevent invalid state changes.
- Allows validation before data is modified.
- Makes implementation easier to change without exposing internal details.
- Improves maintainability and control over an object's behavior.

## Encapsulation vs. Data Hiding

- **Encapsulation:** Bundles data and related methods within a class and controls access to the object's state.
- **Data hiding:** Restricts direct access to internal implementation details, commonly through access modifiers such as `private`.

Data hiding is one technique used to achieve encapsulation.

## Important Points

- Encapsulation is commonly implemented using private fields and public methods.
- Private fields cannot be accessed directly from unrelated classes.
- Public methods can access private fields within their declaring class.
- Getters and setters are common techniques, but they are not mandatory for every field.
- Validation should be performed wherever invalid values could enter or modify an object's state.
- Encapsulation does not automatically guarantee security; the design of the exposed methods matters.

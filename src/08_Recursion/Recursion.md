
# Recursion in Java

Recursion is a technique where a method calls itself to solve a smaller version of the same problem.

## 1. Basic Structure

A recursive method contains:

- **Base Case** – stops the recursion.
- **Recursive Case** – calls the method again with a smaller/simpler input.

```java
returnType method(parameters) {
    if (baseCondition) {
        return result;
    }

    return method(smallerProblem);
}
````

## 2. How Recursion Works

Recursive calls are stored in the **call stack**.

```text
Method Call
    ↓
Recursive Call
    ↓
Recursive Call
    ↓
Base Case
    ↓
Results return back
```

## 3. Important Concepts

* Base Case
* Recursive Case
* Call Stack
* Recursive vs Iterative approach
* Time and space complexity
* Stack overflow

## 4. Common Recursion Patterns

* **Factorial** – decreasing number
* **Power** – decreasing exponent
* **GCD** – mathematical reduction
* **Reverse String** – reducing string
* **Palindrome** – moving indexes inward
* **Array Sum** – moving through array using index
* **Binary Search** – dividing search space
* **Fibonacci** – branching recursion
* **Tower of Hanoi** – multiple recursive subproblems

## 5. Advantages

* Simple and natural for recursive problems.
* Useful for trees, graphs, divide-and-conquer and backtracking.
* Can reduce complex logic into smaller problems.

## 6. Disadvantages

* Uses stack memory.
* Can cause `StackOverflowError` if recursion is too deep.
* Some recursive solutions can have high time complexity.

## 7. Important Points

* Every recursive method needs a proper **base case**.
* Each recursive call should move toward the base case.
* Recursion does not always mean better performance.
* Binary Search recursion: `O(log n)`
* Basic Fibonacci recursion: approximately `O(2^n)`
* Tower of Hanoi moves: `2^n - 1`

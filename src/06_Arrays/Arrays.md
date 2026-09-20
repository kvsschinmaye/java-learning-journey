
# Arrays in Java

Arrays are fixed-size data structures used to store multiple values of the **same type** under a single variable name.

```java
int[] marks = {86, 90, 78, 95};
````

---

## 1. Characteristics of Arrays

* Store multiple values of the same data type.
* Have a **fixed size** once created.
* Indexing starts from `0`.
* Elements are accessed using their index.
* Arrays are objects in Java.
* Can store primitive values or object references.
* Use the `length` property to get the size.
* Can be one-dimensional or multidimensional.

### Default Values

| Type      | Default Value |
| --------- | ------------- |
| Numeric   | `0` / `0.0`   |
| `char`    | `'\u0000'`    |
| `boolean` | `false`       |
| Reference | `null`        |

---

## 2. Array Declaration

```java
int[] numbers;
```

or

```java
int numbers[];
```

The first style is generally preferred.

Declaration only creates the array reference; the array itself is not created yet.

---

## 3. Creating an Array

Use the `new` keyword:

```java
int[] numbers = new int[5];
```

Creates an array of 5 integers:

```text
[0, 0, 0, 0, 0]
```

The size cannot be changed after creation.

---

## 4. Array Initialization

### Array Literal

```java
int[] numbers = {1, 2, 3, 4, 5};
```

### Default Initialization

```java
int[] numbers = new int[5];
```

### Individual Initialization

```java
int[] numbers = new int[3];

numbers[0] = 10;
numbers[1] = 20;
numbers[2] = 30;
```

### Using a Loop

```java
int[] numbers = new int[5];

for (int i = 0; i < numbers.length; i++) {
    numbers[i] = i + 1;
}
```

---

## 5. Accessing and Modifying Elements

Elements are accessed using their index.

```java
int[] numbers = {10, 20, 30, 40};

System.out.println(numbers[0]);  // 10
System.out.println(numbers[2]);  // 30
```

Indexes:

```text
Value:  10   20   30   40
Index:   0    1    2    3
```

Modify an element:

```java
numbers[1] = 50;
```

The last element:

```java
numbers[numbers.length - 1]
```

---

## 6. Array Length

Use the `length` property:

```java
int[] numbers = {10, 20, 30, 40};

System.out.println(numbers.length);  // 4
```

> **Array:** `array.length`
> **String:** `string.length()`

---

## 7. Traversing an Array

### Using `for` Loop

Useful when the index is required:

```java
for (int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
}
```

### Using Enhanced `for` Loop

Useful when only the values are required:

```java
for (int number : numbers) {
    System.out.println(number);
}
```

---

## 8. One-Dimensional Arrays

A 1D array stores elements in a linear sequence.

```java
int[] numbers = {1, 2, 3, 4, 5};
```

```text
Index:  0  1  2  3  4
Value:  1  2  3  4  5
```

---

## 9. Multidimensional Arrays

A 2D array stores data in rows and columns.

```java
int[][] matrix = new int[3][4];
```

This represents:

```text
3 rows × 4 columns
```

Access an element:

```java
matrix[row][column];
```

Example:

```java
matrix[1][2] = 50;
```

### 2D Array Initialization

```java
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
```

### Traversing a 2D Array

```java
for (int i = 0; i < matrix.length; i++) {
    for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
    }
    System.out.println();
}
```

* `matrix.length` → number of rows
* `matrix[i].length` → number of columns in that row

---

## 10. Jagged Arrays

In Java, multidimensional arrays are **arrays of arrays**, so rows can have different lengths.

```java
int[][] numbers = {
    {1, 2},
    {3, 4, 5},
    {6}
};
```

This is called a **jagged array**.

---

## 11. Arrays of Objects

Arrays can store references to objects.

```java
Student[] students = new Student[3];

students[0] = new Student();
students[1] = new Student();
students[2] = new Student();
```

The array stores references to the `Student` objects.

---

## 12. Common Array Operations

* Traversal
* Searching
* Updating
* Sum and average
* Minimum and maximum
* Counting elements
* Reversing
* Copying
* Merging
* Sorting

---

## 13. Searching

### Linear Search

Checks elements one by one.

```java
for (int i = 0; i < arr.length; i++) {
    if (arr[i] == key) {
        System.out.println("Found at index: " + i);
    }
}
```

**Time Complexity:** `O(n)`

Works with both sorted and unsorted arrays.

### Binary Search

Searches by repeatedly dividing a **sorted array** into halves.

**Time Complexity:** `O(log n)`

```java
Arrays.sort(arr);
int index = Arrays.binarySearch(arr, key);
```

> Binary search requires the array to be sorted.

---

## 14. Reversing an Array

Use the **two-pointer technique**:

```java
int left = 0;
int right = arr.length - 1;

while (left < right) {
    int temp = arr[left];
    arr[left] = arr[right];
    arr[right] = temp;

    left++;
    right--;
}
```

**Time Complexity:** `O(n)`
**Extra Space:** `O(1)`

This is an **in-place** operation.

---

## 15. Array Statistics

Common calculations:

* Sum
* Average
* Largest
* Smallest
* Even count
* Odd count

These can often be calculated in a single traversal.

```java
int sum = 0;

for (int value : arr) {
    sum += value;
}
```

---

## 16. Copying Arrays

### Manual Copy

```java
int[] copy = new int[arr.length];

for (int i = 0; i < arr.length; i++) {
    copy[i] = arr[i];
}
```

### `System.arraycopy()`

```java
System.arraycopy(arr, 0, copy, 0, arr.length);
```

### `Arrays.copyOf()`

```java
int[] copy = Arrays.copyOf(arr, arr.length);
```

For arrays of objects, these copy the **references**, not the objects themselves.

---

## 17. Merging Arrays

Two arrays can be combined into a new array.

```text
Array 1 → [1, 2, 3]
Array 2 → [4, 5, 6]

Merged  → [1, 2, 3, 4, 5, 6]
```

```java
int[] merged = new int[arr1.length + arr2.length];
```

**Time:** `O(n + m)`
**Space:** `O(n + m)`

---

# 18. 2D Array Operations

Important matrix operations:

* Matrix Addition
* Matrix Multiplication
* Matrix Transpose
* Primary Diagonal
* Secondary Diagonal

### Matrix Addition

Matrices must have the **same dimensions**.

```java
result[i][j] = matrix1[i][j] + matrix2[i][j];
```

### Matrix Multiplication

Multiplication is possible when:

```text
Columns of Matrix 1 = Rows of Matrix 2
```

If:

```text
A = m × n
B = n × p
```

then:

```text
Result = m × p
```

```java
result[i][j] += matrix1[i][k] * matrix2[k][j];
```

**Time:** `O(m × n × p)`

### Matrix Transpose

Rows become columns and columns become rows.

```java
transpose[j][i] = matrix[i][j];
```

For an `m × n` matrix:

```text
Transpose = n × m
```

### Matrix Diagonals

**Primary diagonal:**

```java
matrix[i][i]
```

**Secondary diagonal:**

```java
matrix[i][n - 1 - i]
```

For an odd-sized matrix, the center element belongs to both diagonals. Subtract it once when calculating the combined diagonal sum.

---

# 19. `Arrays` Utility Class

Import:

```java
import java.util.Arrays;
```

> `Arrays` is a utility class from `java.util` that provides useful methods for working with arrays.
### Sort

```java
Arrays.sort(arr);
```

### Print Array

```java
System.out.println(Arrays.toString(arr));
```

### Binary Search

```java
Arrays.binarySearch(arr, key);
```

> The array should be sorted before binary search.

### Copy

```java
Arrays.copyOf(arr, newLength);
```

### Compare

```java
Arrays.equals(arr1, arr2);
```

---

# 20. Important Points

* Arrays have a **fixed size**.
* Indexing starts from `0`.
* Last index is `length - 1`.
* Use `array.length`, not `array.length()`.
* Invalid indexes cause `ArrayIndexOutOfBoundsException`.
* Arrays can store primitive values or object references.
* Multidimensional arrays are **arrays of arrays**.
* Rows of a 2D array can have different lengths.
* Binary search requires a sorted array.
* Array reversal can be done using two pointers.
* `Arrays.sort()` sorts the original array.
* `Arrays.copyOf()` creates a new array.

---



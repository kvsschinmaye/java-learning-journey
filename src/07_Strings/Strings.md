# Strings in Java

A **String** is an object that represents a sequence of characters.

```java
String name = "Java";
```

Strings are widely used for storing and manipulating text.

---

## 1. Characteristics of Strings

* `String` is a class in `java.lang`.
* Strings are **objects** and are **immutable**.
* String indexing starts from `0`.
* Strings can be created using literals or the `new` keyword.
* Java provides many built-in methods for string manipulation.
* Strings support operations such as searching, comparison, extraction and replacement.

Example:

```java
String str = "Java Programming";
```

```text
Index:   0 1 2 3 4 5 6 7 8 ...
Character:
         J a v a   P r o g ...
```

---

# 2. Creating Strings

## String Literal

```java
String str1 = "Java";
```

String literals are stored in the **String Constant Pool**.

If the same literal already exists in the pool, Java can reuse the existing String object.

```java
String str1 = "Java";
String str2 = "Java";

System.out.println(str1 == str2);   // true
```

---

## Using `new` Keyword

```java
String str = new String("Java");
```

This creates a new String object.

```java
String str1 = "Java";
String str2 = new String("Java");

System.out.println(str1 == str2);       // false
System.out.println(str1.equals(str2));  // true
```

* `==` compares references.
* `equals()` compares string contents.

---

# 3. String Constant Pool

The **String Constant Pool** is a special area used by the JVM to store and reuse String literals.

```java
String str1 = "Java";
String str2 = "Java";
```

Both variables can refer to the same pooled String object.

### `intern()`

The `intern()` method returns the pooled representation of a String.

```java
String str1 = "Java";
String str2 = new String("Java");

String str3 = str2.intern();

System.out.println(str1 == str3);   // true
```

---

# 4. String Immutability

Strings are **immutable**, which means their contents cannot be changed after the String object is created.

```java
String str = "Java";

str.concat(" Programming");

System.out.println(str);
```

Output:

```text
Java
```

The `concat()` operation creates a **new String**.

To store the result:

```java
str = str.concat(" Programming");
```

Now:

```text
Java Programming
```

### Why Immutability?

String immutability provides benefits such as:

* Safe sharing of String objects
* Better use of the String Constant Pool
* Thread safety
* Predictable behavior when Strings are reused

---

# 5. Common String Methods

## `length()`

Returns the number of characters.

```java
String str = "Java";

System.out.println(str.length());   // 4
```

---

## `charAt()`

Returns the character at a specified index.

```java
System.out.println(str.charAt(0));   // J
```

---

## `substring()`

Returns a part of a String.

```java
String str = "Java Programming";

System.out.println(str.substring(5));
System.out.println(str.substring(0, 4));
```

> The ending index is exclusive.

---

## `indexOf()`

Returns the index of the first occurrence.

```java
System.out.println(str.indexOf("Java"));
```

Returns `-1` if the searched value is not found.

---

## `contains()`

Checks whether a sequence exists.

```java
System.out.println(str.contains("Java"));
```

Returns `true` or `false`.

---

## `toUpperCase()` and `toLowerCase()`

```java
System.out.println(str.toUpperCase());
System.out.println(str.toLowerCase());
```

These return new Strings.

---

## `trim()`

Removes leading and trailing whitespace.

```java
String str = "  Java  ";

System.out.println(str.trim());
```

---

## `replace()`

Replaces characters or character sequences.

```java
String str = "Java";

System.out.println(str.replace("Java", "Python"));
```

---

## `startsWith()` and `endsWith()`

```java
str.startsWith("Java");
str.endsWith("ing");
```

---

# 6. Comparing Strings

## `equals()`

Compares String contents.

```java
str1.equals(str2);
```

---

## `equalsIgnoreCase()`

Compares contents without considering case.

```java
"Java".equalsIgnoreCase("java");
```

---

## `compareTo()`

Compares two Strings lexicographically.

```java
int result = str1.compareTo(str2);
```

Returns:

```text
0       → Strings are equal
positive → str1 is greater
negative → str1 is smaller
```

---

## `==` Operator

The `==` operator compares **references**, not String contents.

```java
String str1 = "Java";
String str2 = "Java";

System.out.println(str1 == str2);
```

For content comparison, use:

```java
str1.equals(str2);
```

> **Remember:**  
> `==` → reference comparison  
> `equals()` → content comparison

---

# 7. String Concatenation

Concatenation means joining Strings together.

### Using `+`

```java
String first = "Hello";
String second = "World";

String result = first + " " + second;
```

### Using `concat()`

```java
String result = first.concat(" ").concat(second);
```

Output:

```text
Hello World
```

Since `String` is immutable, concatenation creates new String objects.

For frequent modifications or concatenations, `StringBuilder` is generally preferred.

---

# 8. Converting String to Character Array

Use `toCharArray()`:

```java
String str = "Java";

char[] chars = str.toCharArray();
```

Now:

```text
chars → ['J', 'a', 'v', 'a']
```

This is useful for problems such as:

* Reversing a String
* Character frequency
* Palindrome checking
* Character manipulation

---

# 9. String Constructors

The `String` class provides constructors for creating Strings from different sources.

Examples:

```java
String str1 = new String();
String str2 = new String("Java");
String str3 = new String(charArray);
String str4 = new String(byteArray);
```

Example:

```java
char[] chars = {'J', 'a', 'v', 'a'};

String str = new String(chars);
```

---

# 10. StringBuilder

`StringBuilder` is a **mutable sequence of characters**.

Unlike `String`, its contents can be modified without creating a new String for every operation.

```java
StringBuilder sb = new StringBuilder("Java");

sb.append(" Programming");

System.out.println(sb);
```

### Common Methods

```java
append()
insert()
replace()
delete()
deleteCharAt()
setCharAt()
reverse()
length()
capacity()
toString()
```

Examples:

```java
sb.append(" Java");
sb.insert(0, "Hello ");
sb.replace(0, 5, "Hi");
sb.delete(0, 3);
sb.deleteCharAt(2);
sb.setCharAt(0, 'X');
sb.reverse();
```

Convert to String:

```java
String str = sb.toString();
```

---

# 11. StringBuffer

`StringBuffer` is also a **mutable sequence of characters**.

It provides methods similar to `StringBuilder`.

```java
StringBuffer sb = new StringBuffer("Java");

sb.append(" Programming");
```

### StringBuilder vs StringBuffer

| Feature | StringBuilder | StringBuffer |
|---|---|---|
| Mutable | Yes | Yes |
| Thread-safe | No | Yes |
| Synchronization | No | Yes |
| Performance | Generally faster | Generally slower |
| Typical use | Single-threaded code | Multi-threaded code |

For most normal String manipulation, `StringBuilder` is commonly used.

---

# 12. StringTokenizer

`StringTokenizer` is used to divide a String into smaller tokens based on delimiters.

```java
StringTokenizer st =
    new StringTokenizer("Hello World Java");

while (st.hasMoreTokens()) {
    System.out.println(st.nextToken());
}
```

Output:

```text
Hello
World
Java
```

> `StringTokenizer` is an older utility. Modern applications often use methods such as `split()` or other parsing APIs depending on the requirement.

---

# 13. StringJoiner

`StringJoiner` is used to join multiple Strings using a delimiter.

```java
StringJoiner sj = new StringJoiner(", ");

sj.add("Java");
sj.add("Python");
sj.add("C");

System.out.println(sj);
```

Output:

```text
Java, Python, C
```

It can also use a prefix and suffix:

```java
StringJoiner sj =
    new StringJoiner(", ", "[", "]");

sj.add("Java");
sj.add("Python");
sj.add("C");
```

Output:

```text
[Java, Python, C]
```

---

# 14. `CharSequence`

`CharSequence` is an interface that represents a readable sequence of characters.

Classes such as:

* `String`
* `StringBuilder`
* `StringBuffer`

implement `CharSequence`.

This allows methods to accept different character-sequence implementations.

---


# 15. Important Points

* `String` is a class in `java.lang`.
* Strings are immutable.
* Indexing starts from `0`.
* Use `str.length()` for String length.
* Use `str.charAt(index)` to access a character.
* Use `equals()` to compare String contents.
* `==` compares String references.
* String literals can be stored and reused through the String Constant Pool.
* `new String()` creates a new String object.
* `intern()` can return the pooled representation of a String.
* `toCharArray()` converts a String into a character array.
* `StringBuilder` and `StringBuffer` are mutable.
* `StringBuilder` is generally preferred for single-threaded String modifications.
* `StringBuffer` provides synchronization for thread-safe operations.
* `StringTokenizer` can divide a String into tokens.
* `StringJoiner` can join multiple Strings using delimiters.

---

# 16. String vs StringBuilder vs StringBuffer

| Feature | String | StringBuilder | StringBuffer |
|---|---|---|---|
| Mutable | No | Yes | Yes |
| Thread-safe | Yes (immutable) | No | Yes |
| Modification | Creates new object | Modifies existing object | Modifies existing object |
| Typical use | Fixed text | Frequent modifications | Thread-safe modifications |

### Simple Rule

```text
Fixed text
   ↓
String

Frequent String modifications
   ↓
StringBuilder

Multiple threads modifying the same buffer
   ↓
StringBuffer
```
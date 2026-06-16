# 📘 Java Built-in Methods Cheat Sheet

## 1. String Class
- `length()` → returns string length
- `charAt(int index)` → character at position
- `substring(int start, int end)` → extract substring
- `toLowerCase()`, `toUpperCase()` → case conversion
- `equals()`, `equalsIgnoreCase()` → compare strings
- `contains(String s)` → check substring
- `replace(char old, char new)` → replace characters
- `trim()` → remove spaces
- `split(String regex)` → split into array
- `concat(String s)` → join strings

---

## 2. Math Class
- `abs(x)` → absolute value
- `max(a, b)`, `min(a, b)` → largest/smallest
- `pow(a, b)` → exponentiation
- `sqrt(x)` → square root
- `random()` → random double [0,1)
- `round(x)` → round to nearest integer
- `floor(x)`, `ceil(x)` → round down/up

---

## 3. Arrays (java.util.Arrays)
- `sort(array)` → sort array
- `toString(array)` → convert to string
- `equals(arr1, arr2)` → compare arrays
- `copyOf(array, newLength)` → copy array
- `binarySearch(array, key)` → search element

---

## 4. Character Class
- `isLetter(ch)` → check letter
- `isDigit(ch)` → check digit
- `isWhitespace(ch)` → check space/tab
- `isUpperCase(ch)` → uppercase?
- `isLowerCase(ch)` → lowercase?
- `toUpperCase(ch)` → convert to uppercase
- `toLowerCase(ch)` → convert to lowercase
- `getNumericValue(ch)` → numeric value of digit/letter
- `forDigit(digit, radix)` → char for digit in base

---

## 5. Collections (java.util.Collections)
- `sort(list)` → sort list
- `reverse(list)` → reverse order
- `shuffle(list)` → randomize order
- `max(list)`, `min(list)` → find extremes

---

## 6. ArrayList
- `add(element)` → insert
- `get(index)` → retrieve
- `set(index, element)` → update
- `remove(index)` → delete
- `size()` → number of elements
- `isEmpty()` → check empty
- `clear()` → remove all

---

## 📊 Comparison Table

| Class        | Common Methods | Example Usage |
|--------------|----------------|---------------|
| **String**   | `length()`, `substring()`, `equals()` | `"Hello".length()` → 5 |
| **Math**     | `sqrt()`, `pow()`, `random()` | `Math.sqrt(16)` → 4 |
| **Arrays**   | `sort()`, `binarySearch()` | `Arrays.sort(arr)` |
| **Character**| `isLetter()`, `toUpperCase()` | `Character.isLetter('A')` → true |
| **Collections** | `sort()`, `reverse()`, `shuffle()` | `Collections.sort(list)` |
| **ArrayList** | `add()`, `get()`, `remove()` | `list.add("Java")` |

---

⚠️ **Note:** This cheat sheet focuses only on the most exam‑relevant classes and their frequently used methods. The full Java API has thousands more, but these are the ones you’ll encounter most often in practice and exams.

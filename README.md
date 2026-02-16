# 🧮 BCD Adder in Java

## 📌 Overview

This project demonstrates the implementation of a **Binary Coded Decimal (BCD) Adder** using Java.

The program accepts two decimal digits (0–9), performs binary addition, and applies BCD correction logic when required.

If the sum exceeds 9, the program automatically adds **6 (0110)** to generate a valid BCD result and produces a carry.

---

## ⚙️ Features

* Accepts two decimal digits (0–9)
* Performs standard addition
* Applies BCD correction when sum > 9
* Displays corrected binary result
* Displays carry output
* Input validation included

---

## 🧠 BCD Logic Explained

In Binary Coded Decimal:

* Each decimal digit is represented using 4 bits.
* Valid BCD values range from:

  * `0000` (0)
  * to `1001` (9)
* If the binary sum exceeds `1001`, we must add `0110` (decimal 6) to correct the result.

This ensures the result remains a valid BCD representation.

---

## ▶️ Example

### Input

```
Enter first decimal digit: 8
Enter second decimal digit: 7
```

### Process

* Normal Sum = 15
* Since 15 > 9 → Add 6 (BCD correction)
* Corrected Result = 21

### Output

```
Binary Sum (after BCD correction): 10101
Carry: 1
```

---

## 🚀 How to Run

1. Compile the program:

   ```
   javac bcdAdder.java
   ```

2. Run the program:

   ```
   java bcdAdder
   ```

---

## 📚 Concepts Used

* Binary arithmetic
* Conditional logic
* Input validation
* BCD correction mechanism

---

## 🎯 Purpose

This project helps in understanding:

* Digital Electronics concepts
* Binary arithmetic and correction logic
* Implementation of hardware logic in software

---

## 👨‍💻 Author

**Aditya Bhardwaj**
B.Tech – Computer Science Engineering

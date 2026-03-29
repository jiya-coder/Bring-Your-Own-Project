# Bring-Your-Own-Project

# 🏦 Bank Account System (Java)

A simple **console-based banking application** built in Java that allows users to perform basic banking operations like deposit, withdrawal, and balance checking.

---

## 📌 Features

* Create a bank account with:

  * Name
  * Account Number
  * Initial Balance
* Deposit money 💰
* Withdraw money 💸 (with balance validation)
* Check account details 📊
* Masked account number for security 🔒
* Menu-driven interface

---

## 🛠️ Technologies Used

* Java
* OOP Concepts (Classes & Objects)
* Scanner for user input

---

## 📂 Project Structure

```
BankAccountSystem.java
 ├── class BankAccount
 │     ├── deposit()
 │     ├── withdraw()
 │     └── display()
 │
 └── main() method
       └── Menu-driven system
```

---

## ▶️ How to Run

1. **Compile the program**

   ```bash
   javac BankAccountSystem.java
   ```

2. **Run the program**

   ```bash
   java BankAccountSystem
   ```

---

## 🧾 Sample Output

```
Enter your name: Jiya
Enter account number: 12345678
Enter initial balance: 5000

--- Bank Menu ---
1. Deposit
2. Withdraw
3. Check Balance
4. Exit
```

---

## 🔐 Security Feature

* Account number is masked:

  ```
  XXXXXX5678
  ```

---

## ⚙️ Functional Overview

### 1. Deposit

Adds amount to the account balance.

### 2. Withdraw

Deducts amount if sufficient balance is available.

### 3. Display

Shows:

* Account Holder Name
* Masked Account Number
* Current Balance

---

## 🚀 Future Improvements

* Add multiple account support
* Add PIN/password authentication
* Store data using file handling or database
* GUI version using Java Swing/JavaFX

---

## 👩‍💻 Author

**Jiya Jaiswal**

---

## 📄 License

This project is for educational purposes.

---

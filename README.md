# Banking-Admin-Application
A Java console application that reads customer/account data from a CSV file and provisions Savings and Salary bank accounts using object-oriented programming (OOP). The app generates unique account numbers, applies account-specific interest rates, and prints account details.

## Features
- CSV-driven account creation (name, security number, account type, initial deposit)
- Account types:
  - **Savings Account**: deposit box ID + key, savings-specific interest rate
  - **Salary Account**: debit card number + PIN, salary-specific interest rate
- Core operations implemented in the `Account` base class:
  - `deposit`, `withdraw`, `transfer`, `compoundInt`
- OOP concepts: abstraction, inheritance, polymorphism, interfaces (`IntRate`)

## Project Structure (high level)
- `BankAccountApp.java` — entry point; reads CSV and creates account objects
- `Account.java` — abstract base class for shared state/behavior
- `SavingAcc.java` — savings account implementation
- `SalaryAcc.java` — salary account implementation
- `IntRate.java` — interface providing a base interest rate
- `Utilities/CSV_functionality.java` — CSV reader utility

## Input CSV Format
The application expects each row in the CSV to have 4 columns:
1. `name`
2. `secNo` (security number / identifier)
3. `accType` (`Savings` or `Salary`)
4. `initialDeposit` (numeric)
Example:
John Doe,123456789,Savings,1500.00
Jane Smith,987654321,Salary,2500.50

## How It Works
BankAccountApp reads the CSV and iterates over rows.
For each row, it creates either SavingAcc or SalaryAcc.
Account generates an account number using:
last 2 digits of secNo, an incrementing index and a random 3-digit suffix
Each subclass sets its own interest rate via setRate() and initializes extra fields.

## Prerequisites
Java 8+ (or any recent JDK)


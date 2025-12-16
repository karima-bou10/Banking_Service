# Banking Service – Technical Test 1
This project implements a simple banking service.

## Features
- Deposit money
- Withdraw money with balance validation
- Print bank statement (latest transaction first)

## Technical Choices
- `Account` implements the `AccountService` interface
- Transactions are stored in memory using `ArrayList`
- Each transaction keeps the balance after the operation
- Dates are generated automatically in `dd/MM/yyyy` format
- Exceptions are thrown for invalid operations (negative amount, insufficient balance)

## How to run
Run the `Main` class to execute a simple scenario and print the bank statement.

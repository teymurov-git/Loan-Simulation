# Bank Loan Simulation

This Java project simulates a simple **bank loan system** demonstrating **inheritance, `super`, static blocks, and instance blocks**. The system supports two types of loans: **ConsumerLoan** and **BusinessLoan**.

---

## Features
- **Parent class `Loan`** with private fields: `amount`, `interestRate`, `duration`.
- Constructor and method `calculateTotalPayment()` in `Loan`.
- **ConsumerLoan** and **BusinessLoan** extend `Loan` and override `calculateTotalPayment()` using `super`, applying different interest rates (e.g., BusinessLoan includes an additional 1% commission).
- **Instance blocks** print `"Loan created..."` whenever a loan object is instantiated.
- **Static block** prints `"Bank Loan System initialized"` once when the program starts.

---

## Usage

```java
public class Main {
    public static void main(String[] args) {
        Loan consumer = new ConsumerLoan(10000, 5, 12);
        Loan business = new BusinessLoan(50000, 7, 24);

        System.out.println("Consumer Loan Total Payment: " + consumer.calculateTotalPayment());
        System.out.println("Business Loan Total Payment: " + business.calculateTotalPayment());
    }
}

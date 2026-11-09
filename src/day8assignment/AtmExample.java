package day8assignment;

import java.util.Scanner;

public class AtmExample {

    static int balance = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to ATM:");
        System.out.println("1. DEPOSIT");
        System.out.println("2. WITHDRAW");
        System.out.println("3. CHECK BALANCE");
        System.out.println("Enter your choice:");

        int ch = sc.nextInt();

        try {
            switch (ch) {

            case 1:
                System.out.println("Welcome to Deposit:");
                System.out.println("Enter your amount:");

                int amount = sc.nextInt();
                deposit(amount);
                break;

            case 2:
                System.out.println("Welcome to Withdraw:");
                System.out.println("Available balance: " + balance);
                System.out.println("Enter withdrawal amount:");

                int withdrawAmount = sc.nextInt();
                withdraw(withdrawAmount);
                break;

            case 3:
                checkBalance();
                break;

            default:
                throw new InvalidChoiceException("Please enter a valid choice.");
            }
        }

        catch (AmountNegativeException e) {
            System.out.println(e.getMessage());
        }

        catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        catch (InvalidChoiceException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }

    private static void deposit(int amount) throws AmountNegativeException {

        if (amount <= 0) {
            throw new AmountNegativeException("Deposit amount must be greater than zero.");
        }

        balance += amount;
        System.out.println("Amount deposited successfully.");
        System.out.println("Total balance: " + balance);
    }

    private static void withdraw(int amount)
            throws AmountNegativeException, InsufficientBalanceException {

        if (amount <= 0) {
            throw new AmountNegativeException("Withdrawal amount must be greater than zero.");
        }

        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance!");
        }

        balance -= amount;

        System.out.println("Withdrawal successful.");
        System.out.println("Remaining balance: " + balance);
    }

    private static void checkBalance() {

        System.out.println("Available balance: " + balance);
    }
}
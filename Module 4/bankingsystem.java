//Write a program to implement a simple banking system using Map to store customer IDs and their account balances. 


import java.util.*;

public class BankingSystem {
    private final Map<String, Double> accounts;

    public BankingSystem() {
        this.accounts = new HashMap<>();
    }

   
    public void createAccount(String customerId, double initialBalance) {
        if (accounts.containsKey(customerId)) {
            System.out.println("Account already exists for customer ID: " + customerId);
        } else {
            accounts.put(customerId, initialBalance);
            System.out.println("Account created successfully for " + customerId);
        }
    }

 
    public void deposit(String customerId, double amount) {
        if (accounts.containsKey(customerId)) {
            accounts.put(customerId, accounts.get(customerId) + amount);
            System.out.println("Deposited " + amount + " into account " + customerId);
        } else {
            System.out.println("Account not found.");
        }
    }

    public void withdraw(String customerId, double amount) {
        if (accounts.containsKey(customerId)) {
            double currentBalance = accounts.get(customerId);
            if (amount > currentBalance) {
                System.out.println("Insufficient balance.");
            } else {
                accounts.put(customerId, currentBalance - amount);
                System.out.println("Withdrawn " + amount + " from account " + customerId);
            }
        } else {
            System.out.println("Account not found.");
        }
    }


    public double checkBalance(String customerId) {
        return accounts.getOrDefault(customerId, -1.0);
    }


    public void displayAccounts() {
        System.out.println("Bank Accounts: " + accounts);
    }

    public static void main(String[] args) {
        BankingSystem bank = new BankingSystem();
        bank.createAccount("C001", 500.0);
        bank.createAccount("C002", 1000.0);
        bank.deposit("C001", 200.0);
        bank.withdraw("C002", 300.0);
        System.out.println("Balance of C001: " + bank.checkBalance("C001"));
        bank.displayAccounts();
    }
}

package org.example.bank_account;

public class BankAccount {
    //Objective: Use classes, methods, and encapsulation.
    //Task: Create a BankAccount class with attributes like accountNumber, accountHolderName, and balance.
    // Add methods deposit, withdraw, and displayBalance.
    // Write a main program that creates a BankAccount object and allows the user to perform operations on it.

    private String accountNumber;
    private String accountHolderName;
    private double balance;
    public BankAccount(String accountNumber)
    {
        this(accountNumber,"Default Name");
    }


    public BankAccount(String accountNumber, String accountHolderName)
    {
        this(accountNumber,accountHolderName,0);
        //TEORIE: Cu this putem apela proprietati, putem apela constructori.
//        this.accountNumber = accountNumber;
//        this.accountHolderName = accountHolderName;
//        this.balance=0;
    }

    public BankAccount(String accountNumber, String accountHolderName, double balance)
    {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void withdraw( double amount)
    {
        if(amount > balance)
        {
            System.out.println("Fonduri insuficiente!");

        }
        else{
            balance = balance - amount;
        }




    }

    public void deposit(double amount)
    {
        if(amount > 0)
        {
            balance = balance + amount;
        }
        else{
            System.out.println("Suma introdusă este incorecta! ");
        }
    }

    public void displayBalance()
    {
        System.out.println("Balance: " + this.balance);
    }

}
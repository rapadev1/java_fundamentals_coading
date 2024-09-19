package org.example.bank_account;

import java.util.Scanner;

public class Main {
    //Objective: Use classes, methods, and encapsulation.
    //Task: Create a BankAccount class with attributes like accountNumber, accountHolderName, and balance.
    // Add methods deposit, withdraw, and displayBalance.
    // Write a main program that creates a BankAccount object and allows the user to perform operations on it.

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        BankAccount account = null;

        boolean isRunning = true;
        do{
            showMenu();
            int option = scanner.nextInt();
            // switch
            switch (option){
                case 1:
                    if(account != null) {
                        System.out.println("Introduceti suma dorita: ");
                        double amountDeposit = scanner.nextDouble();
                        account.deposit(amountDeposit);
                    }
                    else{
                        System.out.println("Vă rog să creati un cont!");
                    }
                    break;
                case 2:
                    if(account != null) {
                        System.out.println("Introduceti suma dorita: ");
                        double withdrawDeposit = scanner.nextDouble();
                        account.withdraw(withdrawDeposit);
                    }
                    else{
                        System.out.println("Vă rog să creati un cont!");
                    }
                    break;
                case 3:
                    if(account != null) {
                        account.displayBalance();
                    }
                    else{
                        System.out.println("Vă rog să creati un cont!");
                    }
                    break;
                case 4:
                    scanner.nextLine();

                    System.out.println("Account Number: ");
                    String accountNumber = scanner.nextLine();

                    System.out.println("Account Holder Name: ");
                    String  accountHolderName = scanner.nextLine();

                    account = new BankAccount(accountNumber,accountHolderName);
                    break;
                case 0:
                    //    return; // Este partial corect, deoarece nu avem cod dupa bucla while.
                    // La intalnirea keyword return, codul de dupa return nu se va mai executa.
                    isRunning = false;
                    break;
                default:
                    System.out.println("Optiunea introdusa nu exista! ");

            }
        }while(isRunning);


    }

    public static void showMenu()
    {
        System.out.println("1. Depunere numerar");
        System.out.println("2. Retragere numerar");
        System.out.println("3. Interogare sold");
        System.out.println("4. Creare cont bancar");
        System.out.println("0. Exit");
        System.out.println("Alege o optiune: ");
    }




}
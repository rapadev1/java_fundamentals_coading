package org.example.ghiceste_numar;

import java.util.Random;
import java.util.Scanner;

public class Main {
    /*
    . Number Guessing Game
Objective: Practice using loops, conditionals, and random number generation.
Task: Write a program that generates a random number between 1 and 100. The user
has to guess the number, and the program will give feedback like "Too high!" or
"Too low!" until the user guesses correctly.
     */

    public static void main(String[] args) {
        Random rand = new Random();
        int low = 0;
        int high = 100;
        int resoult = rand.nextInt(high - low) + low;



//        for (int i = 0; i < 3; i++) {
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Enter a number: ");
//            int number = sc.nextInt();
//            if (number == resoult) {
//                System.out.println("The number is correct ");
//                break;
//            } else if (number > resoult) {
//                System.out.println("The number is to high ");
//
//            } else {
//                System.out.println("The number is to low ");
//            }
//        }
        int numberTwo;
        do {
            System.out.println("Enter a number: ");
            Scanner sc = new Scanner(System.in);
            System.out.println(resoult);
            numberTwo = sc.nextInt();
            if (numberTwo == resoult) {
                System.out.println("The number is correct ");
            }
            else if(numberTwo > resoult) {
                System.out.println("The number is to high ");
            }
            else {
                System.out.println("The number is to low ");
            }

        }
        while (numberTwo != resoult);



//        String isCorrect = number == resoult ? "correct" : "incorrect";
//        System.out.println(isCorrect);
    }
}

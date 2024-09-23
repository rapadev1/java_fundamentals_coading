package org.example.sum_of_operation;

import java.util.Scanner;

public class Main {
    /*
    Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an first num: ");
        int firstNum = scanner.nextInt();
        System.out.println("Enter an second num: ");
        int secondNum = scanner.nextInt();

        int addition = firstNum + secondNum;
        int subtraction = firstNum - secondNum;
        int multiplication = firstNum * secondNum;
        int division = 0;
        double remainder = 0;
        if(secondNum == 0){
            System.out.println("Impossible");
        }else {
            division = firstNum / secondNum;
            remainder= firstNum % secondNum;

        }

        double sum = addition + subtraction + multiplication + division + remainder;
        System.out.println("The sum is: " + sum);

    }
}

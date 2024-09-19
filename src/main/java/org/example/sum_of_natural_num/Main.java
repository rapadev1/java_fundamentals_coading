package org.example.sum_of_natural_num;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        *6. Sum of Natural Numbers
Objective: Use loops to perform repetitive tasks.
Task: Write a program that uses a for loop to calculate the sum of
* all natural numbers from 1 to a user-defined value.
         */
        Scanner sccanner = new Scanner(System.in);
        System.out.println("Introduceti un numar natural: ");
        int naturalNumber = sccanner.nextInt();
//        int sum = 0;
//        for(int i =  1; i <= naturalNumber; i++){
//            sum = sum + i;
//        }
//        System.out.println("Suma este: " + sum);

        int sum = (naturalNumber*(naturalNumber + 1))/2; //suma lui Gauss n(n +1) /2
        System.out.println(sum);
    }
}

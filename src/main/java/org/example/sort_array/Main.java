package org.example.sort_array;

import java.util.Scanner;

public class Main {

    /*
    4. Array Manipulation
    Objective: Learn to handle arrays and use loops effectively.
    Task: Write a program that asks the user to input 10 integers
    into an array. Then, find and display the largest and smallest
    number in the array using a loop.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];

        System.out.println("Enter 10 integers:");


        for (int i = 0; i < 10; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        shouMinMax(array);


    }

    public static void shouMinMax(int[] array) {

        int smallest = array[0];
        int largest = array[0];


        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
            if (array[i] > largest) {
                largest = array[i];
            }
        }

        System.out.println("The smallest element is: " + smallest);
        System.out.println("The largest element is: " + largest);
    }
}

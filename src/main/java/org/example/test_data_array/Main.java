package org.example.test_data_array;

public class Main {
    /*
    Write a Java program to test if the first and last element of two integer arrays are the same.
    The array length must be greater than or equal to 2.
    Test Data: array1 = 50, -20, 0, 30, 40, 60, 12
    array2 = 45, 20, 10, 20, 30, 50, 11Write a Java program to test if the first and last element of two
    integer arrays are the same. The array length must be greater than or equal to 2.
    Test Data: array1 = 50, -20, 0, 30, 40, 60, 12
    array2 = 45, 20, 10, 20, 30, 50, 11
     */

    public static void main(String[] args) {
        int[] array1 = {50, -20, 0, 30, 40, 60, 12};
        int[] array2 = {45, 20, 10, 20, 30, 50, 11};

        int firstElementOfArray1 = array1[0];
        int firstElementOfArray2 = array2[0];
        int lastElementOfArray1 = array1[array1.length-1];
        int lastElementOfArray2 = array2[array2.length-1];

        if(array1.length < 2 && array2.length < 2) {
            System.out.println(false);
            return;
        }

        if (firstElementOfArray1 == firstElementOfArray2 && lastElementOfArray1 == lastElementOfArray2) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
}

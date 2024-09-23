package org.example.handle_div;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        double num2 = sc.nextInt();
        double result ;

        if(num2 == 0){
            System.out.println("Nu este posibil sa imparti la 0");
            return;
        }
        result = num1/num2;

        System.out.println("The result is: " + result);
    }
}

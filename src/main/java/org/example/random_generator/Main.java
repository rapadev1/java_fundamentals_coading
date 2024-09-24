package org.example.random_generator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int sum = 0;
        int avrage = 0;
        int product = 1;
        for (int i = 0; i < 10; i++) {
            int randomNumber = rand.nextInt(1, 10);
            sum += randomNumber;
            product *= randomNumber;

        }
        avrage = sum / 10;
        System.out.println("Average is "+ avrage);
        System.out.println("Sum is "+ sum);
        System.out.println("Product is "+ product);
    }

}

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int count = 1;
        int maxSum = 0;
        int minSum = 0;

        System.out.println("Enter number #");
        int number = scanner.nextInt();

        while (count < 11) {
            System.out.println("Enter number #");
            boolean hasNextInt = scanner.hasNextInt();

            if(hasNextInt) {
                count += 1;
                int number = scanner.nextInt();
                maxSum = number;
                maxSum = number;
            } else {
                System.out.println("Invalid Number");
                break;
            }

            if ()
        }

        System.out.println("Sum of numbers = " + numSum);
        scanner.close();
    }
}

package academy.learnprogramming;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random randomGenerator = new Random();

	    int firstNUmber = randomGenerator.nextInt(8) + 2;
        int secondNumber = randomGenerator.nextInt(8) + 2;

        var subtraction = randomGenerator.nextInt(8) + 2;
        int answer = firstNUmber * secondNumber - subtraction;

        String prompt = ". Don't type in the answer, just press ENTER when ready to continue.";

        System.out.println("Think of a number between 1 and 10" + prompt);
        scanner.nextLine();
        System.out.println("Multiply your number by " + firstNUmber + prompt);
        scanner.nextLine();
        System.out.println("Now multiply the result by " + secondNumber + prompt);
        scanner.nextLine();
        System.out.println("Divide the result by the number you originally thought of" + prompt);
        scanner.nextLine();
        System.out.println("Now subtract 7" + subtraction + prompt);
        scanner.nextLine();

        System.out.println("The answer is " + answer);

        scanner.close();

    }
}

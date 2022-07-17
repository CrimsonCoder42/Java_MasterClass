package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        System.out.println("10,000 at 2% interest = " + calculateInterest(10000, 2));

        for(int i=2; i < 9; i++){

            double returnedAnswer = calculateInterest(10000, i);
            System.out.printf("10,000 at %d interest = %f\n", i, returnedAnswer);
        }
    }

    public static double calculateInterest(double amount, double interestRate) {

        return(amount * (interestRate/100));


    }
}

package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        double a = 20.00;
        double b = 80.00;

        double c = (a + b) * 100;

        double remainder = c % 40.00;

        boolean isOrNotZero = remainder == 0;
        System.out.println(isOrNotZero);

        if (isOrNotZero) {
            System.out.println("Got some remainder");
        }



    }
}

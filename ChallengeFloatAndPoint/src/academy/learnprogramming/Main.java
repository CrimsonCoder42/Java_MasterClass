package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int pounds = 200;
        double conversion = .45359237;
        double kilos = pounds * conversion;

        System.out.printf("%d is equal to %f", pounds, kilos);
    }
}

package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        System.out.println(hasSameLastDigit(41,22,71));
    }

    public static boolean hasSameLastDigit(int a, int b, int c) {

        if((a < 10 || a > 1000) ||(b < 10 || b > 1000) || (c < 10 || c > 1000)) {

            return false;

        }

        int rDigitA = a % 10;
        int rDigitB = b % 10;
        int rDigitC = c % 10;

        if ((rDigitA == rDigitB) || (rDigitA == rDigitC)) {
            return true;
        }

        return rDigitB == rDigitC;
    }

    public static boolean isValid(int a) {

        if ((a < 10) || (a > 1000)) {
            return false;
        }

        return true;

    }


}

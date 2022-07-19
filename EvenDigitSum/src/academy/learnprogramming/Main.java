package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        System.out.println(getEvenDigitSum(-252));
    }

    public static int getEvenDigitSum(int number) {

        if(number < 0) {
            return -1;
        }

        int total = 0;

        while(number > 0) {

            int num = number % 10;
            if (num % 2 == 0) {
                total += num;
            }

            number = number / 10;

        }

        return total;

    }


}

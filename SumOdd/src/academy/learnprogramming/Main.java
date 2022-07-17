package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {



    }


    public static boolean isOdd(int num){

        if(num <= 0) {
            return false;
        }

        if (num % 2 != 0){

            return true;
        }

        return false;

    }

    public static int sumOdd(int start, int end) {

        if ((start < 1 || end < 1) || (start > end)) {
            return -1;
        }

        int sum = 0;

        for(int i = start; i < end + 1; i++) {

            boolean oddNum = isOdd(i);

            if(oddNum) {
                sum += i;
            }

        }

        return sum;

    }

}

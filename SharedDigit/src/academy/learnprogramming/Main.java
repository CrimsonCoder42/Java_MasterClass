package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        System.out.println(hasShardedDigit(9,99));

    }

    public static boolean hasShardedDigit(int a, int b){

        if((a < 10 || a > 99) || (b < 10 || b > 99)){
            return false;
        }

        int oneA = 0;
        int twoA = 0;
        int oneB = 0;
        int twoB = 0;

        while (a > 0 && b > 0) {

            oneA = a % 10;
            a = a / 10;
            twoA = a % 10;
            a = a / 10;
            oneB = b % 10;
            b = b / 10;
            twoB = b % 10;
            b = b / 10;
        }

        if ((oneA == oneB) || (oneA == twoB )) {
            return true;
        }

        return (twoA == oneB) || (twoA == twoB);

    }
}

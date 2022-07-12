package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        System.out.println(hasTeen(9,99,19));
    }


    public static boolean hasTeen(int a, int b, int c){

        return ((a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19));

    }


    public static boolean isTeen(int num) {

        return (num >= 13 && num <= 19);

    }

}

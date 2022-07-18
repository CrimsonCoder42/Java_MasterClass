package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        System.out.println(isPalindrome(11212));


    }

    public static boolean isPalindrome(int number){

        int reverse = 0;
        int newNum = number;

        while (number > 0) {

            reverse += number % 10;
            number = number / 10;
            reverse *= 10;

        }

        reverse = reverse / 10;

        while (newNum > 0) {

            int testReverse = reverse % 10;
            int testnewNum = newNum % 10;

            if(testReverse != testnewNum){
                return false;
            }

            reverse = reverse/ 10;
            newNum = newNum / 10;

        }

        return true;

    }
}

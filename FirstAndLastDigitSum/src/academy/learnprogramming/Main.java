package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        System.out.println(sumFirstAndLastDigit(-12345));
    }

    public static int sumFirstAndLastDigit(int number){

        if (number < 0){
            return -1;
        }

        int lastNum = number % 10;;
        int firstNum = 0;

        while (number > 0) {

            firstNum = number % 10;
            number = number / 10;

        }
       return firstNum + lastNum;

    }

}

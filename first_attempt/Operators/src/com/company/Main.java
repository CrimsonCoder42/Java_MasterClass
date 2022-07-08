package com.company;

public class Main {

    public static void main(String[] args) {
//	    int result = 1 + 2; // 1 + 2 = 3
//        System.out.println("1 + 2 = " + result);
//        int previousResult = result;
//        System.out.println("previousResult = " + previousResult);
//        result = result - 1; // 3 - 1 = 2
//        System.out.println("3 - 1 = " + result);
//
//        result = result * 10;
//        System.out.println(result);
//
//        result = result / 5;
//        System.out.println(result);
//
//        result = result % 3;
//        System.out.println(result);
//
//        result++;
//        System.out.println(result);
//
//        result--;
//        System.out.println(result);
//
//        result += 2;
//        System.out.println(result);
//
//        result *= 10;
//        System.out.println(result);
//
//        result /= 3;
//        System.out.println(result);
//
//        result -= 2;
//        System.out.println(result);

//        boolean isAlien = false;
//        if (isAlien) {
//            System.out.println("It is not an Alien!");
//            System.out.println("I am scared of Aliens!");
//        }
//
//        int topScore = 80;
//        if (topScore < 100){
//            System.out.println("You got the High Score!");
//        }
//
//        int secondTopScore = 81;
//        if ((topScore > secondTopScore) && (topScore < 100)) {
//            System.out.println("Greater than second top score and less than 100");
//        }
//
//        if ((topScore > 90) || (secondTopScore <= 90)) {
//            System.out.println("Either or both of the conditions are true!");
//        }
//
//
//        int newValue = 50;
//
//        if (newValue == 50) {
//            System.out.println("This is not an error");
//        }

//        boolean isCar = false;
//        if (!isCar) {
//            System.out.println("This is not suppose to happen!");
//        }
//
//
//        isCar = true;
//        boolean wasCar = isCar ? true : false;
//        if (wasCar) {
//            System.out.println("wasCar is true");
//        }

        double firstDouble = 20.00;
        double secondDouble = 80.00;

        double thirdDouble = (firstDouble + secondDouble) * 100.00;
        System.out.println("thirdDouble = " + thirdDouble );

        double remain = thirdDouble % 45.00;
        System.out.println("remain = " + remain );

        boolean checkIf;

        checkIf = remain == 0;
        System.out.println("checkIf = " + checkIf );

        if (!checkIf) {
            System.out.println("Got some remainder");
        }




    }
}

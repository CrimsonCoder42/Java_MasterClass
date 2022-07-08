package com.company;

public class Main {

    public static void main(String[] args) {
        calcFeetAndInchesToCentimeters(6,13);
        calcFeetAndInchesToCentimeters(10);
    }

    public static int calcFeetAndInchesToCentimeters(int feet, int inches) {
        if ((feet < 0) || ((inches < 0) || (inches >= 12))) {
            return -1;
        } else {
            int converter = (int) ((int) (feet * 30.48) + (inches * 2.54));
            System.out.println("converted to cetimeters: " + converter);
            return converter;
        }
    }

    public static int calcFeetAndInchesToCentimeters( int inches) {
        if (inches <= 0) {
            return -1;
        } else {
            double convert = inches / 12;
            System.out.println("Convert call " + convert);
            System.out.println(calcFeetAndInchesToCentimeters((int) convert, inches));
            return calcFeetAndInchesToCentimeters((int) convert, inches );
        }

    }
//
//    public static int calculateScore() {
//        System.out.println("No player name, no player score.");
//        return 0;
//    }


}

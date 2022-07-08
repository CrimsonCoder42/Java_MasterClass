package com.company;

public class Main {

    public static void main(String[] args) {
//        int value =3;
//        if(value == 1) {
//            System.out.println("Value was 1");
//        } else if (value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Was not 1 or 2");
//        }
//
//        int switchValue = 1;
//
//        switch (switchValue) {
//            case 1 -> System.out.println("Value was 1");
//            case 2 -> System.out.println("Value was 2");
//            default -> System.out.println("Was not 1 or 2");
//        }

        char switchLetter = 'Z';

            switch(switchLetter) {
                case 'A' -> System.out.println("This is the A");
                case 'B' -> System.out.println("This is the B");
                case 'C' -> System.out.println("This is the C");
                case 'D' -> System.out.println("This is the D");
                default -> System.out.println("Could not find A, B,C,D or E.");
            }
    }
}

package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

//        int count = 1;
//        while(count != 6) {
//            System.out.println("count value is " + count);
//            count++;
//
//        }
//
//        count = 0;
//        while(true) {
//            if(count == 5) {
//                break;
//            }
//
//            System.out.println("Count value = " + count);
//            count++;
//        }

//        int count = 1;
//        do{
//            System.out.println("Count value was " + count);
//            count++;
//        } while(count !=6);

        int number =4;
        int finsihNumber = 20;

        while(number <= finsihNumber) {

            number++;

            if (!isEvenNumber(number)) {
                continue;
            }

            System.out.println("Even number " + number);
        }

    }

    public static boolean isEvenNumber(int num) {

        if (num < 1) {
            return false;
        }

        if(num % 2 == 0) {
            return true;
        }
        return false;
    }


}

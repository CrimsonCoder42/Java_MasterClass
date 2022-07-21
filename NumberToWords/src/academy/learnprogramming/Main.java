package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        numberToWords(100);
    }


    public static void numberToWords(int number) {

        if (number < 0) {
            System.out.println("Invalid Value");
        }

        int numOrder = reverse(number);
        System.out.println(numOrder);

        while(numOrder > 0) {

            int num = numOrder % 10;
            numOrder = numOrder / 10;

            switch(num){
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("Not a number");
            }

        }

    }


    public static int reverse(int num) {

        int newNum =0;
        int count = 0;
        int officialCount = getDigitCount(num);

        while(num > 0){

            newNum = num % 10;
            newNum = newNum * 10;
            num = num /10;
            count++;
            System.out.println("newNum "+ newNum);
        }
        System.out.println("officialCount "+ officialCount);
        System.out.println("Count "+ count);


        if (officialCount != count){

            int difference = officialCount - count;
            while(difference > 0){
                newNum = newNum * 10;
                difference--;
            }

            return newNum;
        }

        return newNum / 10;
    }

    public static int getDigitCount(int digit) {

        if (digit < 0) {
            return -1;
        }

        int count = 0;

        while(digit > 0){

            digit = digit / 10;
            count++;

        }

        return count;
    }


}

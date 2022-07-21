package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        System.out.println(getLargestPrime(7));
    }

    public static int getLargestPrime(int number) {

        if (number < 2) {
            return -1;
        }
        int newNumber = number;

        if((number % 2 != 0) && (number % 3 !=0)){

            newNumber = number -1;
        }

        for(int i = newNumber; i > 0; i--) {
            if(number % i == 0 && (i % 2 != 0) && (i % 3 !=0)) {
                if(i == 1){
                    return number;
                }
                return i;
            }
        }

        return -1;
    }

}

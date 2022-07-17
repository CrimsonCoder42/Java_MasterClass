package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

//        System.out.println("10,000 at 2% interest = " + calculateInterest(10000, 2));


        int primeFound = 0;

        for(int i=1; i < 100; i++){
            boolean prime = isPrime(i);

            if(prime) {
                primeFound ++;
                System.out.println(i);
            }
            if(primeFound == 15){
                break;
            }
        }
    }

    public static boolean isPrime(int n) {

        if(n==1) {
            return false;
        }

        for(int i=2; i<=n/2; i++){
            if(n % i == 0) {
                return false;
            }
        }

        return true;

    }



    public static double calculateInterest(double amount, double interestRate) {

        return(amount * (interestRate/100));


    }
}

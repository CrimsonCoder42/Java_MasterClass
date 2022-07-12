package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
	// write your code here
    }

    public static boolean areEqualByThreeDecimalPlaces(double a, double b){

        double c = a * 1000;
        double d = b * 1000;

        if((int) c == (int) d) {
            return true;
        }

        return false;

    }

}

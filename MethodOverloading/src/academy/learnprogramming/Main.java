package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {


        System.out.println(calcFeetAndInchesToCentimeters(157));

//	    int newScore = calculateScore("Tim", 500);
//        System.out.println("New Score is " + newScore);
//        calculateScore(75);

    }

//    public static int calculateScore(String playerName, int score){
//
//        System.out.println("Player " + playerName + " scored " + score + " points");
//        return score * 1000;
//
//    }
//
//    public static int calculateScore(int score){
//
//        System.out.println("Unnamed player scored " + score + " points");
//        return score * 1000;
//
//    }
//
//    public static int calculateScore(){
//
//        System.out.println("No player name no player score");
//        return 0;
//
//    }


    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {

        if(feet < 0 || (inches < 0 || inches > 12)) {
            return -1;
        }

        return (feet * 30.48) + (inches * 2.54);

    }

    public static double calcFeetAndInchesToCentimeters(int inches) {

        if(inches < 0) {
            return -1;
        }

        double feet = (int) inches / 12;
        double NewInches = (int) inches % 12;

        System.out.println("feet "+ feet);
        System.out.println("inches "+ NewInches);

        return calcFeetAndInchesToCentimeters(feet, NewInches);


    }

}

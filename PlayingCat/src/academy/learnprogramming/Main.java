package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {


    }

    public static boolean isCatPlaying(boolean summer, int temperature) {

        if ((((summer) && temperature > 45 ) || ((!summer) && temperature > 35)) || temperature < 25) {
            return false;
        }

        return true;

    }
}
package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println(shouldWakeUp(false,1));
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        if(hourOfDay < 0 || hourOfDay > 23){
            return false;
        }

        if(barking){

            return hourOfDay > 22 || hourOfDay < 8;
        }

        return false;
    }
}

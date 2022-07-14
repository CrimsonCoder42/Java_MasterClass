package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDurationString(120,34));
    }

    public static String getDurationString(int minutes, int seconds) {

        if(minutes < 0 || (seconds < 0 || seconds > 59 )) {
            return "Invalid Value";
        }

        int hours = minutes / 60;
        int newMinutes = minutes % 60;

        return hours + "h " + newMinutes + "m " + seconds + "s" ;

    }

    public static String getDurationString(int seconds){
        if(seconds < 0) {
            return "Invalid Value";
        }

        int minutes = seconds / 60;
        int newSeconds = seconds % 60;

        getDurationString(minutes,newSeconds);

        return minutes + " m " + newSeconds+ " s";

    }

}

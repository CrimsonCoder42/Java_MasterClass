package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        System.out.println(isLeapYear(0));
    }


    public static boolean isLeapYear(int year) {

        if (year <= 0 || year > 9999) {
            return false;
        }

        if (year % 4 != 0){
            return false;
        }

        if (year % 100 == 0 && year % 400 != 0) {

            return false;
        }

        return true;

    }

    public static int getDaysInMonth(int month, int year) {

        if ( (month < 1 || month > 12) || (year < 1 || year > 9999)) {
            return -1;
        }

        boolean leapYear = isLeapYear(year);

        if(month == 2 && (leapYear)) {
            return 29;
        }

        int answer = -1;

        switch (month) {

            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                answer = 31;
                break;
            case 4: case 9: case 6: case 11:
                answer = 30;
                break;
            case 2:
                answer = 28;
                break;

        }

        return answer;
    }


}

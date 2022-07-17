package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int count = 1;
        while(count != 6) {
            System.out.println("count value is " + count);
            count++;

        }

        count = 0;
        while(true) {
            if(count == 5) {
                break;
            }

            System.out.println("Count value = " + count);
            count++;
        }

    }
}

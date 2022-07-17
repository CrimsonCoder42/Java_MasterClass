package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int sum =0;
        int count = 0;

        for (int i =0; i < 10001; i++){

            if(i % 3 ==0 && i % 5 == 0){
                sum += i;
                count++;
                System.out.println("condition number = " + i);
            }

            if(count == 5) {
                System.out.println(sum);
                break;
            }
        }



    }
}

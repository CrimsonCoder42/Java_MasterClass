package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        System.out.println(canPack(1,0,5));


    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        int bigCountKilos = bigCount * 5;

        if (bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }
        if(goal < 5 && goal > smallCount ) {

            return false;
        }

        if(goal > (bigCountKilos + smallCount)) {

            return false;
        }

        int remainder = goal % 5;
        int count = 0;

        while(goal > 1){

            goal= goal / 5;
            count++;
        }
        System.out.println(goal);

        if(count < bigCount && remainder > smallCount) {

            return false;
        }

        return true;
    }
}

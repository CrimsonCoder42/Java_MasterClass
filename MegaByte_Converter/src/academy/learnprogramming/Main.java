package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        printMegaBytesAndKiloBytes(5000);

    }

    public static void printMegaBytesAndKiloBytes(int kilobytes) {

        if(kilobytes < 0){
            System.out.println("Invalid Value");
        } else {
            int XX = kilobytes;
            int YY = XX / 1024;
            int ZZ = XX % 1024;

            System.out.println(XX + " KB = " + YY + " MB and " + ZZ + " KB" );
        }

    }
}

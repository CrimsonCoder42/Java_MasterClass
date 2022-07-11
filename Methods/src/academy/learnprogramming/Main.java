package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;
//
//        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
//        System.out.println("Your final score was " + highScore);
//
//        score = 10000;
//        levelCompleted = 8;
//        bonus = 200;
//
//        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
//        System.out.println("Your final score was " + highScore);

        int position = calculateHighScorePosition(1010);
        displayHighScorePosition("Tom", position );

        position = calculateHighScorePosition(501);
        displayHighScorePosition("Bill", position );

        position = calculateHighScorePosition(100);
        displayHighScorePosition("Luna", position );

        position = calculateHighScorePosition(500);
        displayHighScorePosition("Carol", position );


    }

    public static int calculateScore(boolean gameOver,int score, int levelCompleted, int bonus) {

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        }

        return -1;

    }

    public static void displayHighScorePosition( String name, int position) {
       System.out.println(name + " managed to get into position " + position);
    }

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if(score >= 500 && score < 1000) {
            return 2;
        } else if(score >= 100 && score < 500) {
            return 3;
        } else {
            return 4;
        }
    }

}

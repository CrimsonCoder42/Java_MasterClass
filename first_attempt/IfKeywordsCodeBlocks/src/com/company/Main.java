package com.company;

public class Main {

    public static void main(String[] args) {

//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;
//
//        int highScore = calculateScore(gameOver, score, levelCompleted, bonus );
//        System.out.println("Your final score was " + highScore);
//
//        score = 10000;
//        levelCompleted = 8;
//        bonus = 200;
//
//        highScore = calculateScore(gameOver, score, levelCompleted, bonus );
//        System.out.println("Your final score was " + highScore);
//
//    }
//
//    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
//
//        if(gameOver) {
//            int finalScore = score + (levelCompleted * bonus);
//            finalScore += 2000;
//            return finalScore;
//        } else {
//            return -1;
//        }

        int calcScore1 = calculateHighScorePosition(1500);
        displayHighScorePosition("Bob", calcScore1);

        int calcScore2 = calculateHighScorePosition(900);
        displayHighScorePosition("Tim", calcScore2);

        int calcScore3 = calculateHighScorePosition(400);
        displayHighScorePosition("Devin", calcScore3);

        int calcScore4 = calculateHighScorePosition(50);
        displayHighScorePosition("Izzy", calcScore4);


    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into position " + position);


    }

    public static int calculateHighScorePosition(int playerScore) {
//        if(playerScore >= 1000) {
//            return 1;
//        } else if (playerScore >= 500) {
//            return 2;
//        } else if (playerScore >= 100 ) {
//            return 3;
//        } else {
//            return 4;
//        }

        int position = 4;

        if (playerScore >= 1000) {
            position = 1;
        } else if(playerScore >= 500) {
            position = 2;
        } else if(playerScore >= 100); {
            position = 3;
        }

        return position;


    }




}

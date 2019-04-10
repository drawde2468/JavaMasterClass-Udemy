package com.company;

public class Main {

    public static void main(String[] args) {

        calculateScore(true, 800, 5, 100);
        calculateScore(true, 10000, 8, 200);

//        int highScore = calculateScore(true, 800, 5, 100);
//        System.out.println("Your final score was " + highScore);

        int highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Test1", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Test2", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Test3", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Test4", highScorePosition);


    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into position " + position + " on the high score table.");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        }
        return 4;
    }
}

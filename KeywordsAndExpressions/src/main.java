public class main {
    public static void main(String[] args) {
        int int2 = 5; // Can use keywords if extra characters are included
        double miles = 100;
        double kilometers = (miles * 1.609344);
        int highScore = 50;
        if (highScore > 25) {
            highScore = 1000 + highScore; // Add bonus points
        }
        calculateScore(true, 800, 5, 100);
        int caller = calculateScoreTwo(true, 8, 2, 100);
        System.out.println("The high score is " + caller);
        boolean gameOver = true;
        int score = 10000;
        int levelCompleted = 8;
        int bonus = 100;
        calculateScoreTwo(true, score, levelCompleted, bonus);
        System.out.println("Beans " + calculateScoreTwo(true, score, levelCompleted, bonus));

        int health = 100;


        if ((health < 25) && (highScore > 1000)) {
            highScore = highScore - 1000;
        }

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Robbie", highScorePosition);
        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Robert", highScorePosition);
        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Rob", highScorePosition);
        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Bob", highScorePosition);
        highScorePosition = calculateHighScorePosition(25);
        displayHighScorePosition("Bobby", highScorePosition);

    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = score;
        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }
    }
    public static int calculateScoreTwo(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = score;
        finalScore += (levelCompleted * bonus);
        finalScore += 1000;
        System.out.println("Your final score was " + finalScore);
        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;

        }
        return finalScore;

    }

    public static void displayHighScorePosition(String playerName, int playerPosition) {

        System.out.println(playerName + " managed to get position " + playerPosition + " on the high score list");


    }

    public static int calculateHighScorePosition(int playerScore) {
        int number = 0;
        if (playerScore >= 1000) {
            number = 1;
        }
        if ((playerScore >= 500) && (playerScore < 1000)) {
            number = 2;
        }
        if ((playerScore >= 100)  && (playerScore < 500)) {
            number = 3;
        }
        if (playerScore < 100) {
            number = 4;
        }
        int playerPosition = number;

        return playerPosition;
    }

}

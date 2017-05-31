/**
 * Created by Martynas on 2017-05-31.
 */
public class Methods {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int leveCompleted = 5;
        int bonus = 100;
        int highScore = calculateScore(gameOver, score, leveCompleted, bonus);
        System.out.println("Your final result is " + highScore);
        score = 10000;
        leveCompleted =8;
        bonus=200;

        highScore = calculateScore(gameOver, score, leveCompleted, bonus);
        System.out.println("Your final result is " + highScore);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Percy", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Gilbert", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Louise", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Tom", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Jimmy", highScorePosition);







    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {


        if (gameOver) {
            int finalscore = score + (levelCompleted * bonus);
            finalscore += 2000;
            return finalscore;

        } else {
            return -1;
        }
    }
    public static void displayHighScorePosition (String playerName, int highScorePosition){

        System.out.println(playerName +" managed to get into position " + highScorePosition + " on the high score table");
    }
    public static int calculateHighScorePosition (int playScore){
        if (playScore >= 1000 ){
            return 1;
        } else if (playScore >=500 && playScore <1000){
            return 2;
        } else if (playScore >=100 && playScore <500) {
            return 3;
        } else {
            return 4;
        }

    }
}

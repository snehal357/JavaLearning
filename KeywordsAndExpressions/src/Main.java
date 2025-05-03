public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        boolean gameOver = true;
        int score = 5000;
        int level = 5;
        int bonus = 500;

        int finalScore;

        finalScore = calcScore(gameOver, score, level, bonus);

        System.out.println("From Main, Final Score: "+ finalScore);

        score = 10000;
        level = 8;
        bonus = 800;

        finalScore = calcScore(gameOver, score, level, bonus);

        System.out.println("From Main, Final Score: "+ finalScore);
    }

    public static int calcScore(boolean gameOver, int score, int level, int bonus){

        int finalScore = score;

        if (gameOver) {
            finalScore += (level * bonus);
            finalScore += 1000;
            System.out.println("Your final Score was : " + finalScore);


        }
        return finalScore;
    }
}
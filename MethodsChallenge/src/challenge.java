public class challenge {
    public static void main(String[] args) {
        System.out.println("********Methods Challenge**********");

        displayHighScorePosition("Snehal", calculateHighScorePosition(1500));

        displayHighScorePosition("Dom", calculateHighScorePosition(1000));

        displayHighScorePosition("Mike", calculateHighScorePosition(500));

        displayHighScorePosition("Peter", calculateHighScorePosition(100));

        displayHighScorePosition("Tony", calculateHighScorePosition(25));
    }

    public static void displayHighScorePosition(String playerName, int position){
        System.out.println(playerName + " managed to get into position "+ position + " on the high score list.");
    }

    public static int  calculateHighScorePosition(int score){
        int pos;
        if (score >= 1000) 
            pos = 1;
        else if (score >=500)
            pos = 2;
        else if (score >=100)
            pos = 3;
        else
            pos = 4;

        return pos;
    }
}

package section00_DailyTasks.JavaCore.Easy.T22_RockPaperScissors;

public class RockPaperScissors {
    private static final String rock = "rock";
    private static final String paper = "paper";
    private static final String scissors = "scissors";

    public static String play(String player1, String player2) {
        if (player1.equals(player2)) {
            return "Draw!";
        }
        return (player1.equals(rock) && player2.equals(paper))
                || (player1.equals(paper) && player2.equals(scissors))
                || (player1.equals(scissors) && player2.equals(rock))
                ? "Player 2 won!" : "Player 1 won!";
    }
}

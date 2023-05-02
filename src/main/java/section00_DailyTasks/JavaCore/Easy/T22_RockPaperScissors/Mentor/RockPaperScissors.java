package section00_DailyTasks.JavaCore.Easy.T22_RockPaperScissors.Mentor;

public class RockPaperScissors {
    public static String play(String player1, String player2) {
        if (player1 == player2) {
            return "Draw!";
        }
        int winner = "scissorspaper paperrock rockscissors".contains(player1 + player2) ? 1 : 2;
        return "Player " + winner + " won!";
    }
}

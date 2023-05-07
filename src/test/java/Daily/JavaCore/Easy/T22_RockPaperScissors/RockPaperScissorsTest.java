package Daily.JavaCore.Easy.T22_RockPaperScissors;

import section00_DailyTasks.JavaCore.Easy.T22_RockPaperScissors.RockPaperScissors;
import org.junit.Assert;
import org.junit.Test;

public class RockPaperScissorsTest {
    @Test
    public void play_player1WinsWithRock() {
        Assert.assertEquals("Method should return the correct string if player1 won with rock\n",
                "Player 1 won!", RockPaperScissors.play("rock", "scissors"));
    }

    @Test
    public void play_player1WinsWithPaper() {
        Assert.assertEquals("Method should return the correct string if player1 won with paper\n",
                "Player 1 won!", RockPaperScissors.play("paper", "rock"));
    }

    @Test
    public void play_player1WinsWithScissors() {
        Assert.assertEquals("Method should return the correct string if player1 won with scissors\n",
                "Player 1 won!", RockPaperScissors.play("scissors", "paper"));
    }

    @Test
    public void play_player2WinsWithRock() {
        Assert.assertEquals("Method should return the correct string if player2 won with rock\n",
                "Player 2 won!", RockPaperScissors.play("scissors", "rock"));
    }

    @Test
    public void play_player2WinsWithPaper() {
        Assert.assertEquals("Method should return the correct string if player2 won with paper\n",
                "Player 2 won!", RockPaperScissors.play("rock", "paper"));
    }

    @Test
    public void play_player2WinsWithScissors() {
        Assert.assertEquals("Method should return the correct string if player2 won with scissors\n",
                "Player 2 won!", RockPaperScissors.play("paper", "scissors"));
    }

    @Test
    public void play_drawWithRock() {
        Assert.assertEquals("Method should return the correct string if both players played rock\n",
                "Draw!", RockPaperScissors.play("rock", "rock"));
    }

    @Test
    public void play_drawWithPaper() {
        Assert.assertEquals("Method should return the correct string if both players played paper\n",
                "Draw!", RockPaperScissors.play("paper", "paper"));
    }

    @Test
    public void play_drawWithScissors() {
        Assert.assertEquals("Method should return the correct string if both players played scissors\n",
                "Draw!", RockPaperScissors.play("scissors", "scissors"));
    }
}

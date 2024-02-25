package playermanagement;

import org.junit.Test;

import static org.junit.Assert.*;

public class DuelHandlerTest {

    @Test
    public void testRunDuelPlayer1Wins() {
        // Setting the attack of player2 to zero ensures that player1 always wins the duel
        Player player1 = new Player("John", 100, 60, 25);
        Player player2 = new Player("Merry", 80, 50, 0);

        DuelHandler duelHandler = new DuelHandler();

        // Act
        Player winner = duelHandler.runDuel(player1, player2);

        // Assert that player1 emerges victorious in the duel
        assertEquals(player1, winner);
    }

    @Test
    public void testRunDuelPlayer2Wins() {
        // Setting the strength of player2 very high to ensures that player2 always wins the duel
        Player player1 = new Player("John", 80, 50, 20);
        Player player2 = new Player("Merry", 100, 600, 25);

        DuelHandler duelHandler = new DuelHandler();

        // Act
        Player winner = duelHandler.runDuel(player1, player2);

        // Assert that player2 wins the duel
        assertEquals(player2, winner);
    }
}

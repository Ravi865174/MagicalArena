package playermanagement;

import static org.junit.Assert.*;
import org.junit.Test;

public class PlayerManagerTest {

    @Test
    public void testAddPlayer() {
        PlayerManager playerManager = new PlayerManager();
        Player player = new Player("Ramu", 100, 50, 20);

        playerManager.addPlayer(player);

        // Assert that the player was added successfully
        assertEquals(1, playerManager.getPlayersQueue().size());
        assertEquals(player, playerManager.getPlayersQueue().peek());
    }

    @Test
    public void testMatchPlayers() {
        PlayerManager playerManager = new PlayerManager();
        Player player1 = new Player("John", 100, 60, 25);
        Player player2 = new Player("Merry", 120, 70, 30);

        playerManager.addPlayer(player1);
        playerManager.addPlayer(player2);

        Player winner = playerManager.matchPlayers();

        // Assert that a winner is determined after the match
        assertNotNull(winner);
    }

    @Test(expected = RuntimeException.class)
    public void testMatchPlayersInsufficientPlayers() {
        PlayerManager playerManager = new PlayerManager();
        Player player = new Player("Ramu", 100, 50, 20);

        playerManager.addPlayer(player);

        // Attempt to match players with less than 2 players should throw an exception
        playerManager.matchPlayers();
    }

    @Test
    public void testMatchMultiplePlayers() {
        PlayerManager playerManager = new PlayerManager();
        Player player1 = new Player("John", 100, 60, 25);
        Player player2 = new Player("Merry", 120, 70, 30);
        Player player3 = new Player("Ketan", 90, 55, 22);
        Player player4 = new Player("Dhruv", 110, 65, 28);

        playerManager.addPlayer(player1);
        playerManager.addPlayer(player2);
        playerManager.addPlayer(player3);
        playerManager.addPlayer(player4);

        Player winner = playerManager.matchPlayers();

        // Assert that a winner is determined after matching multiple players
        assertNotNull(winner);

        // Assert that no players remain in the queue after the match
        assertEquals(0, playerManager.getPlayersQueue().size());
    }
}
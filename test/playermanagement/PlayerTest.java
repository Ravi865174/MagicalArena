package playermanagement;

import static org.junit.Assert.*;
import org.junit.Test;

public class PlayerTest {

    // Test the getter methods of the Player class
    @Test
    public void testGetters() {
        // Arrange
        Player player = new Player("Ramu", 100, 50, 20);

        // Act & Assert
        assertEquals("Ramu", player.getPlayerName());
        assertEquals(100, player.getHealth());
        assertEquals(50, player.getStrength());
        assertEquals(20, player.getAttack());
    }

    // Test the setHealth method of the Player class
    @Test
    public void testSetHealth() {
        // Arrange
        Player player = new Player("Eve", 100, 50, 20);

        // Simulate taking damage
        player.setHealth(30);
        assertEquals(70, player.getHealth());

        // Simulate taking more damage than current health
        player.setHealth(110);
        assertEquals(0, player.getHealth());
    }
}
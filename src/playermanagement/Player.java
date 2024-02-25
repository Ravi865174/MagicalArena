package playermanagement;

public class Player {
    private final String playerName;
    private int health;
    private final int strength;
    private final int attack;

    // Constructor
    public Player(String playerName, int health, int strength, int attack) {
        this.playerName = playerName;
        this.health = health;
        this.strength = strength;
        this.attack = attack;
    }

    public String getPlayerName() {
        return this.playerName;
    }

    // Getter methods
    public int getHealth() {
        return this.health;
    }

    public int getStrength() {
        return this.strength;
    }

    public int getAttack() {
        return this.attack;
    }

    public void setHealth(int damage) {
        this.health = Math.max(0, this.health - damage);
    }
}

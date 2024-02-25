package util;

public class Dice {
    public static int roll() {
        // Simulate rolling a 6-sided die
        return (int) (Math.random() * 6) + 1;
    }
}

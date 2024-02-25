package playermanagement;

import java.util.LinkedList;
import java.util.Queue;

// Class to manage and setup matches among multiple player.
public class PlayerManager {
    private final Queue<Player> playersQueue;

    public PlayerManager() {
        this.playersQueue = new LinkedList<>();
    }

    public void addPlayer(Player player) {
        playersQueue.add(player);
    }

    public Queue<Player> getPlayersQueue() {
        return playersQueue;
    }

    public Player matchPlayers() {
        if (playersQueue.size() < 2) {
            throw new RuntimeException("match not possible due to insufficient players.");
        }

        DuelHandler duelHandler = new DuelHandler();

        while (playersQueue.size() > 1) {
            Player player1 = playersQueue.poll();
            Player player2 = playersQueue.poll();

            assert player1 != null;
            assert player2 != null;
            System.out.println("Matching " + player1.getPlayerName() + " with " + player2.getPlayerName());

            System.out.println("__________________________________________________");
            Player winner = duelHandler.runDuel(player1, player2);
            System.out.println(winner.getPlayerName() + " wins");
            System.out.println("__________________________________________________");
            System.out.println();

            // Push the winner back to the queue
            playersQueue.offer(winner);
        }

        // Return the last player standing
        return playersQueue.poll();
    }
}
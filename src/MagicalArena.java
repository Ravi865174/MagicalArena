import playermanagement.Player;
import playermanagement.PlayerManager;

public class MagicalArena {
    public static void main(String[] args) {

        Player player1 = new Player("John", 100, 60, 25);
        Player player2 = new Player("merry", 120, 70, 30);
        Player player3 = new Player("Ketan", 90, 55, 22);
        Player player4 = new Player("Dhruv", 110, 65, 28);

        PlayerManager playerManager = new PlayerManager();
        playerManager.addPlayer(player1);
        playerManager.addPlayer(player2);
        playerManager.addPlayer(player3);
        playerManager.addPlayer(player4);

        System.out.println("---------------------Magic Arena----------------------");
        System.out.println();
        Player finalWinner = playerManager.matchPlayers();
        System.out.println("___________________" + finalWinner.getPlayerName() + " wins_____________________");
    }
}

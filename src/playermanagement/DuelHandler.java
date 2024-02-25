package playermanagement;

import util.Dice;

public class DuelHandler {
    public Player runDuel(Player player1, Player player2){
        if (player1.getHealth() < player2.getHealth())
            return match(player1, player2);
        else
            return match(player2, player1);
    }

    private Player match(Player player1, Player player2) {
        while (true) {
            attack(player1, player2);
            if (player2.getHealth() == 0) {
                return player1;
            }

            // Swap players so they can take turns
            Player temp = player1;
            player1 = player2;
            player2 = temp;
        }
    }

    //Simulates an attack between an attacker and a defender in the Magical Arena.
    private void attack(Player attacker, Player defender) {
        int attackerDieRoll = Dice.roll();
        int defenderDieRoll = Dice.roll();

        int attackDamage = attacker.getAttack() * attackerDieRoll;
        int defendingStrength = defender.getStrength() * defenderDieRoll;

        System.out.print(attacker.getPlayerName()+ "{" + attacker.getHealth() + "} " +
                "attacks with " + attackDamage + ", " + defender.getPlayerName() +
                "{" + defender.getHealth() + "} defends with " + defendingStrength);

        if (attackDamage > defendingStrength) {
            int damage = attackDamage - defendingStrength;
            System.out.println(" --> Damage " + damage);
            defender.setHealth(damage);
            if (defender.getHealth() == 0)
                System.out.println(defender.getPlayerName() + " dies");
        }
        else {
            System.out.println(" --> No Damage");
        }

    }
}

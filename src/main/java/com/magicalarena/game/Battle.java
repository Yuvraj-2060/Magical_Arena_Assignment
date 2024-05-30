package com.magicalarena.game;

public class Battle {
    private Player playerA;
    private Player playerB;
    private Dice attackDice;
    private Dice defendDice;

    public Battle(Player playerA, Player playerB) {
        this.playerA = playerA;
        this.playerB = playerB;
        this.attackDice = new Dice(6);
        this.defendDice = new Dice(6);
    }

    public void fight() {
        Player attacker, defender;
        while (playerA.isAlive() && playerB.isAlive()) {
            if (playerA.getHealth() <= playerB.getHealth()) {
                attacker = playerA;
                defender = playerB;
            } else {
                attacker = playerB;
                defender = playerA;
            }

            int attackRoll = attackDice.roll();
            int defendRoll = defendDice.roll();

            int attackDamage = attackRoll * attacker.getAttack();
            int defendStrength = defendRoll * defender.getStrength();
            int damage = attackDamage - defendStrength;
            if (damage > 0) {
                defender.takeDamage(damage);
                System.out.println(attacker.getName() + " attacks " + defender.getName() + " for " + damage + " damage.");
            } else {
                System.out.println(defender.getName() + " defends the attack.");
            }

            System.out.println(defender.getName() + " has " + defender.getHealth() + " health remaining.");

            // Swap roles
            Player temp = attacker;
            attacker = defender;
            defender = temp;
        }

        if (playerA.isAlive())  {
            System.out.println(playerA.getName() + " wins!");
        } else {
            System.out.println(playerB.getName() + " wins!");
        }
    }
}



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	// Set Stats
        Player player = new Player(100, 10, 15);
        Enemy enemy = new Enemy(100, 10, 15);

        Scanner scanner = new Scanner(System.in);
        
        // Dispay Stats
        System.out.println("Player Health: " + enemy.health());
        System.out.println("Enemey Health: " + player.health());
        System.out.println();
        
        while (player.isAlive() && enemy.isAlive()) {
            // Player's turn
            System.out.print("Press 'A' to attack: ");
            String input = scanner.nextLine();
            System.out.println();
            
            if (input.equalsIgnoreCase("a")) {
                int playerDamage = player.damage();
                enemy.takeDamage(playerDamage);
                System.out.println("Player attacks for " + playerDamage + " damage. Enemy health: " + enemy.health());

                // Enemy's turn
                if (enemy.isAlive()) {
                    int enemyDamage = enemy.damage();
                    player.takeDamage(enemyDamage);
                    System.out.println("Enemy attacks for " + enemyDamage + " damage. Player health: " + player.health());
                }
            } else {
                System.out.println("Invalid input. Press 'a' to attack.");
            }
        }

        scanner.close();

        if (player.isAlive()) {
            System.out.println("Player wins!");
        } else {
            System.out.println("Enemy wins!");
        }
    }
}


// Topics: Super, Extends, Parameter, Object, Polymorphism, Encapsulation, Abstraction
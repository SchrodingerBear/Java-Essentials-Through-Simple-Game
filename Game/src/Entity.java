

import java.util.Random;

class Entity {
    private int health;
    private int damageMin;
    private int damageMax;
    private Random rand = new Random();
    
    public Entity(int health, int damageMin, int damageMax) {
        this.health = health;
        this.damageMin = damageMin;
        this.damageMax = damageMax;
    }

    public int damage() {
        int damage = rand.nextInt(damageMax - damageMin + 1) + damageMin;
        return damage;
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
        }
    }

    public boolean isAlive() {
        return health > 0;
    }

    public int health() {
        return health;
    }
}






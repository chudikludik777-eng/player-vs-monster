public class Monster {
    private String name;
    private int health;
    private int damage;
    private int maxHealth;

    public Monster(String name, int health, int damage, int maxHealth) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.maxHealth = maxHealth;
    }

    public void defend() {
        System.out.println(name + " защищает себя и добавляет себе 20HP");
        health += 20;


    }


    public void takeDamage(int amount) {
        health -= amount;

        if (health <= 0) {
            System.out.println(name + " умер!");
            health = 0;
        }
    }

    public String getName() {
        return name;
    }

    public void attack(Player player) {
        System.out.println(name + " атакует " + player.getName());
        player.takeDamage(damage);
    }

    public void printInfo() {
        System.out.println("-------------------------------");
        System.out.println("name: " + name);
        System.out.println("health: " + health);
        System.out.println("-------------------------------");
    }

    public boolean isAlive() {
        return health > 0;
    }



}
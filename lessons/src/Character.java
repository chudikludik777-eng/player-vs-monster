public class Character {

    protected String name;
    protected int health;
    protected int damage;

    public Character(String name, int health, int damage) {
        this.name   = name;
        this.health = health;
        this.damage = damage;
    }

    public void takeDamage(int amount) {
        health -= amount;
        if (health <= 0) {
            health = 0;
            System.out.println(name + " умер!");
        }
    }

    public void defend() {
        health += 20;
        System.out.println(name + " защищается +20 HP");
    }

    public boolean isAlive()  { return health > 0; }
    public String  getName()  { return name; }

    public void printInfo() {
        System.out.println("--- " + name + " | HP: " + health + " ---");
    }

    public void heal(int amount) {
        health += amount;
        System.out.println(name + " добавляет к себе " + amount + "HP");
    }
}
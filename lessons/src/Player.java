public class Player extends Character {

    public Player(String name, int health, int damage) {
        super(name, health, damage);
    }

    public void attack(Boss target) {
        System.out.println(name + " стреляет " + target.getName());
        target.takeDamage(damage);
    }

    public void attack(Monster target) {
        System.out.println(name + " стреляет " + target.getName());
        target.takeDamage(damage);
    }


}
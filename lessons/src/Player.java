public class Player extends Character {

    public Player(String name, int health, int damage) {
        super(name, health, damage);
    }

    @Override
    public void attack(Character target) {
        System.out.println(name + " бьёт мечом ⚔️ " + target.getName());
        target.takeDamage(damage * 2);
    }
}

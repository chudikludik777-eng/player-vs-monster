public class Monster extends Character {

    public Monster(String name, int health, int damage) {
        super(name, health, damage);
    }

    @Override
    public void attack(Character target) {
        System.out.println(name + " кусает 🦷 " + target.getName());
        target.takeDamage(damage * 2);
    }
}

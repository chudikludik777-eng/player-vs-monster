public class Archer extends Character {

    public Archer(String name, int health, int damage) {
        super(name, health, damage);
    }

    @Override
    public void attack(Character target) {
        System.out.println(name + " стреляет из лука " + target.getName());
        target.takeDamage(damage * 3);
    }
}

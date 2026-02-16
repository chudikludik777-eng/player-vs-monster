public class Monster extends Character {

    public Monster(String name, int health, int damage) {
        super(name, health, damage);
    }

    public void attack(Player target) {
        System.out.println(name + " бьет кулоком " + target.getName());
        target.takeDamage(damage);
    }

    public void attack(Boss target) {
        System.out.println(name + " бьет кулаком " + target.getName());
        target.takeDamage(damage);
    }



}
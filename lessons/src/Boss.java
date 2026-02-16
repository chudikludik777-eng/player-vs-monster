public class Boss extends Character {

    public Boss(String name, int health, int damage) {
        super(name, health, damage);
    }

    public void attack(Monster target) {
        System.out.println(name + " Очень сильно ударил " + target.getName());
        target.takeDamage(damage);
    }

    public void attack(Player target) {
        System.out.println(name + " Очень сильно ударил " + target.getName());
        target.takeDamage(damage);
    }


}
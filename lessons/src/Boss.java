public class Boss extends Character {

    public Boss(String name, int health, int damage) {
        super(name, health, damage);
    }

    @Override
    public void attack(Character target) {
        System.out.println(name + " ударил мощно " + target.getName());
        target.takeDamage(damage * 3);
    } // 1. Закрывает метод attack
} // 2. Закрывает класс Boss

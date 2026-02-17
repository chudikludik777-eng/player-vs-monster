import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Character daniel = new Player("Daniel", 100, 20);
        Character ali    = new Monster("Ali",    100, 10);
        Character boss   = new Boss("Boss",   300, 30);

        Character[] enemies = { ali, boss };

        while (daniel.isAlive() && (ali.isAlive() || boss.isAlive())) {

            for (Character enemy : enemies) {
                if (daniel.isAlive() && enemy.isAlive()) {
                    daniel.attack(enemy);

                    if (enemy.isAlive()) {
                        enemy.attack(daniel);
                    }
                }
            }

        }
        System.out.println("Битва окончена!");


    }
}

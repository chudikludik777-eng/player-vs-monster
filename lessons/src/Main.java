import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {

        Character daniel = new Player("Daniel", 100, 20);
        Character ali    = new Monster("Ali",    100, 10);
        Character boss   = new Boss("Boss",   300, 30);
        Character bfr    = new Archer("Man", 120, 10);

        Character[] enemies = { ali, boss, bfr };

        while (daniel.isAlive() && (ali.isAlive() || boss.isAlive() || bfr.isAlive())) {

            for (Character enemy : enemies) {
                if (daniel.isAlive() && enemy.isAlive()) {
                    try {
                        TimeUnit.SECONDS.sleep(2);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    daniel.attack(enemy);
                    try {
                        TimeUnit.SECONDS.sleep(2);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    if (enemy.isAlive()) {
                        enemy.attack(daniel);
                    }
                }
            }

            if (daniel.isAlive()) {
                System.out.println("Победили игроки");
            } else {
                System.out.println("Победили враги...");
            }
        }
        System.out.println("Битва окончена!");
    }
}
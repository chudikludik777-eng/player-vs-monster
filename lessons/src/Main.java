public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Daniel", 100, 20);
        Monster monster1 = new Monster("Ali", 100, 15);
        Boss boss1 = new Boss("Ariet", 300, 40);

        System.out.println("=== БИТВА НАЧИНАЕТСЯ ===");

        while (true) {
            int aliveCount = (player1.isAlive() ? 1 : 0) +
                    (monster1.isAlive() ? 1 : 0) +
                    (boss1.isAlive() ? 1 : 0);

            if (aliveCount <= 1) break;

            if (player1.isAlive()) {
                if (boss1.isAlive()) player1.attack(boss1);
                else if (monster1.isAlive()) player1.attack(monster1);
            }

            if (monster1.isAlive()) {
                if (boss1.isAlive()) monster1.attack(boss1);
                else if (player1.isAlive()) monster1.attack(player1);
            }

            if (boss1.isAlive()) {
                if (monster1.isAlive()) boss1.attack(monster1);
                else if (player1.isAlive()) boss1.attack(player1);
            }

            System.out.println("\n--- Состояние после раунда ---");
            if (player1.isAlive()) player1.printInfo();
            if (monster1.isAlive()) monster1.printInfo();
            if (boss1.isAlive()) boss1.printInfo();
            System.out.println("------------------------------\n");
        }

        System.out.println("Битва окончена!");

        if (player1.isAlive()) System.out.println("ПОБЕДИТЕЛЬ: " + player1.getName());
        else if (boss1.isAlive()) System.out.println("ПОБЕДИТЕЛЬ: " + boss1.getName());
        else if (monster1.isAlive()) System.out.println("ПОБЕДИТЕЛЬ: " + monster1.getName());
        else System.out.println("Все погибли в славном бою!");
    }
}

public class Main {
    public static void main(String[] args) {

        Player  player1  = new Player("Daniel", 100, 20);
        Monster monster1 = new Monster("Ali",    100, 15);
        Boss boss1 = new Boss("Ariet", 150, 25);

        player1.printInfo();
        monster1.printInfo();
        boss1.printInfo();

        while (player1.isAlive() && (monster1.isAlive() || boss1.isAlive()) || (monster1.isAlive() && boss1.isAlive())) {
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

            System.out.println("\n--- Итоги раунда ---");
            if (player1.isAlive()) player1.printInfo();
            if (monster1.isAlive()) monster1.printInfo();
            if (boss1.isAlive()) boss1.printInfo();
            System.out.println("--------------------");

            int aliveCount = (player1.isAlive() ? 1 : 0) + (monster1.isAlive() ? 1 : 0) + (boss1.isAlive() ? 1 : 0);
            if (aliveCount <= 1) break;
        }

        System.out.println("Битва окончена");
    }
}
public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Daniel", 100, 20, 4);
        Monster monster1 = new Monster("Ali", 100, 20, 2);

        player1.printInfo();
        monster1.printInfo();

        player1.attack(monster1);
        monster1.printInfo();

        player1.defend();
        monster1.defend();

        player1.printInfo();
        monster1.printInfo();

        while (player1.isAlive() && monster1.isAlive()) {

            player1.attack(monster1);

            if (monster1.isAlive()) {
                monster1.attack(player1);
            }

            System.out.println();
            player1.printInfo();
            monster1.printInfo();
        }


    }
}

public class Main {
    public static void main(String[] args) {
        Hero[] heroes = {
                new Warrior(300, 20),
                new Mage(200, 50),
                new Cleric(200, 0, 100),
        };

        for (Hero hero : heroes) {
            hero.printInformation();
            hero.applyAbility(heroes);
            System.out.println();
            if (hero instanceof Cleric) {
                System.out.println("Cleric got heal points");
                ((Cleric) hero).increaseExperience();
                ((Cleric) hero).healPoints();
            }
        }
    }
}
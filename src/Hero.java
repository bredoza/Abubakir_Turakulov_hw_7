abstract class Hero implements HavingAbility {
    String className;
    int health;
    int damage;
    String ability;

    public Hero(String className, int health, int damage, String ability) {
        this.className = className;
        this.health = health;
        this.damage = damage;
        this.ability = ability;
    }

    public void printInformation() {
        System.out.println("Class: " + className);
        System.out.println("Health: " + health);
        if (damage > 0) {
            System.out.println("Damage: " + damage);
        }
        System.out.println("Ability: " + ability);
    }
}
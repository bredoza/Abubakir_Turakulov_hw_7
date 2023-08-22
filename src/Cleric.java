class Cleric extends Hero {
    int healPoints;

    public Cleric(int health, int damage, int healPoints) {
        super("Cleric", health, damage, "Heal");
        this.healPoints = healPoints;
    }

    void increaseExperience() {
        healPoints += healPoints * 0.1;
    }

    @Override
    public void applyAbility(Hero[] heroes) {
        System.out.println(className + " used ability " + ability);
    }

    @Override
    public void printInformation() {
        super.printInformation();
        System.out.println("Heal Points: " + healPoints);
    }

    public void healPoints() {
        System.out.println("Heal Points: " + healPoints);
    }
}
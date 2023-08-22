class Warrior extends Hero {
    public Warrior(int health, int damage) {
        super("Warrior", health, damage, "Heavy slash");
    }

    @Override
    public void applyAbility(Hero[] heroes) {
        System.out.println(className + " used ability " + ability);
    }
}
class Mage extends Hero {
    public Mage(int health, int damage) {
        super("Mage", health, damage, "Meteor");
    }

    @Override
    public void applyAbility(Hero[] heroes) {
        System.out.println(className + " used ability " + ability);
    }
}
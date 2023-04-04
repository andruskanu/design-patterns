package behaviorals.template;

public class VeggieSandwich extends Sandwich {

    @Override
    void addMeat() {

    }

    @Override
    void addCheese() {

    }

    @Override
    void addVegetables() {
        System.out.println("Add salad, tomatoes, cucumber");
    }

    @Override
    protected boolean customerWantsMeat() {
        return false;
    }

    @Override
    protected boolean customerWantsCheese() {
        return false;
    }
}

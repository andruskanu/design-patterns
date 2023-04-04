package behaviorals.template;

public class ItalianSandwich extends Sandwich{

    @Override
    void addMeat() {
        System.out.println("Add italian salami");
    }

    @Override
    void addCheese() {
        System.out.println("Add mozzarella");
    }

    @Override
    void addVegetables() {
        System.out.println("Add tomatoes and cucumber");
    }

}

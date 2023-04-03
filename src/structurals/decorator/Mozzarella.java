package structurals.decorator;

public class Mozzarella extends PizzaDecorator {


    public Mozzarella(Pizza pizza) {
        super(pizza);
        addIngredient(new Ingredient("Mozzarella",4.5));
    }
}

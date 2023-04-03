package structurals.decorator;

public class Olives extends PizzaDecorator{


    public Olives(Pizza pizza) {
        super(pizza);
        addIngredient(new Ingredient("Olive", 2.0));
    }
}

package structurals.decorator;

public class DecoratorMain {

    public static void main(String[] args) {

        Ingredient cheese = new Ingredient("Cheese",2.5);
        Ingredient salami = new Ingredient("Salami",3.8);
        Ingredient ham = new Ingredient("Ham", 3.0);

        System.out.println(cheese);

        System.out.println();

        PlainPizza pizza1 = new PlainPizza(10.0);
        pizza1.addIngredient(cheese);
        pizza1.addIngredient(salami);
        pizza1.addIngredient(ham);

        pizza1.showIngredients();
        System.out.println("Final price: " + pizza1.getPrice());

        System.out.println("-----------------------------------");

        PlainPizza pizza2 = new PlainPizza(10.0);

        Mozzarella mozzarella = new Mozzarella(pizza2);
        mozzarella.addIngredient(new Ingredient("Corn", 4.0));
        mozzarella.showIngredients();
        System.out.println(mozzarella.getPrice());

    }
}

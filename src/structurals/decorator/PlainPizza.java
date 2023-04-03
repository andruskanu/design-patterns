package structurals.decorator;

import java.util.ArrayList;
import java.util.List;

public class PlainPizza implements Pizza {

    private List<Ingredient> ingredients = new ArrayList<>();
    private double price;

    public PlainPizza(double price) {
        this.price = price;
        this.ingredients = new ArrayList<>();
    }

    @Override
    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }

    @Override
    public double getPrice() {
        double finalPrice = 0;
        for (Ingredient ingredient : ingredients) {
            finalPrice = finalPrice + ingredient.getPrice();
        }
        return finalPrice + price;
    }

    @Override
    public void showIngredients() {
        System.out.println(ingredients);
    }
}

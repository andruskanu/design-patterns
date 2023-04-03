package structurals.bridge;

public abstract class DrinkPurchase {

    private Drink drink;
    private String paymentMethod;

    public DrinkPurchase(Drink drink, String paymentMethod) {
        this.drink = drink;
        this.paymentMethod = paymentMethod;
    }

    public void makePayment(){
        System.out.println("Pay " + drink.getName()
                + " with payment method "
                + paymentMethod + " -> "
                + drink.getPrice());
    }
}

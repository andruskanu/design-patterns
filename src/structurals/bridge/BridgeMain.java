package structurals.bridge;

public class BridgeMain {

    public static void main(String[] args) {

        Drink c1 = new Coffee("Lavazza", 7.0);
        Drink t1 = new Tea("Green Tea", 5);

        DrinkPurchase card = new CardPurchase(c1);
        DrinkPurchase cash = new CashPurchase(t1);

        card.makePayment();
        cash.makePayment();

    }
}

package goodpractices.solid.dip;

public class DIPMain {

    public static void main(String[] args) {

        Delivery delivery = new Delivery();

        Bike bike = new Bike();
        Car car = new Car();

        delivery.deliverPackage("Box", car);
        delivery.deliverPackage("Food", bike);

    }
}

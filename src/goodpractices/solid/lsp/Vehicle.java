package goodpractices.solid.lsp;

public abstract class Vehicle {

    private String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                '}';
    }
}

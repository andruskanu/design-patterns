package goodpractices.solid.lsp;

public class LSPMain {

    public static void main(String[] args) {

        CarService carService = new CarService();

        Car bmw = new Car("BMW");

        Truck truck = new Truck("Volvo");

        carService.repairCar(bmw);
        carService.repairCar(truck);
    }
}
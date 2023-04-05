package goodpractices.solid.dip;

public class Car implements LandVehicle {


    @Override
    public void ride() {
        System.out.println("Riding the car");
    }
}

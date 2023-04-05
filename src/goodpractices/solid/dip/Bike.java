package goodpractices.solid.dip;

public class Bike implements LandVehicle{

    @Override
    public void ride(){
        System.out.println("Riding the bike");
    }
}

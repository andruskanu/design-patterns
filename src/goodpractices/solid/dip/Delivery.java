package goodpractices.solid.dip;

public class Delivery {

    public void deliverPackage(String packageName, LandVehicle landVehicle) {
        System.out.println("Take the package " + packageName);

        landVehicle.ride();

        System.out.println("Deliver package");

    }

}

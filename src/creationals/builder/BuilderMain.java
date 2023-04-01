package creationals.builder;

public class BuilderMain {

    public static void main(String[] args) {

        Car ford = new Car.CarBuilder("diesel", 4).withColor("red").withAcType("AC").build();

        System.out.println(ford);

        Car bmw = new Car.CarBuilder("gasoline",2).withSeatHeating(true).build();

        System.out.println(bmw);

    }
}

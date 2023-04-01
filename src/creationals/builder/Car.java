package creationals.builder;

public class Car {

    private String fuelType;
    private int numberOfDoors;
    private String color;
    private boolean seatHeating;
    private String acType;

    private Car(String fuelType, int numberOfDoors) {
        this.fuelType = fuelType;
        this.numberOfDoors = numberOfDoors;
    }

    public static class CarBuilder {
        private String fuelType;
        private int numberOfDoors;
        private String color;
        private String acType;
        private boolean seatHeating;

        public CarBuilder(String fuelType, int numberOfDoors) {
            this.fuelType = fuelType;
            this.numberOfDoors = numberOfDoors;
        }

        public CarBuilder withColor(String color) {
            this.color = color;
            return this;
        }

        public CarBuilder withAcType(String acType) {
            this.acType = acType;
            return this;
        }

        public CarBuilder withSeatHeating(boolean seatHeating) {
            this.seatHeating = seatHeating;
            return this;
        }

        public Car build() {
            Car car = new Car(fuelType, numberOfDoors);
            car.color = color;
            car.acType = acType;
            car.seatHeating = seatHeating;
            return car;
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "fuelType='" + fuelType + '\'' +
                ", numberOfDoors=" + numberOfDoors +
                ", color='" + color + '\'' +
                ", seatHeating=" + seatHeating +
                ", acType='" + acType + '\'' +
                '}';
    }
}

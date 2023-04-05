package goodpractices.solid.srp;

import java.time.LocalDate;

public class SRPMain {

    public static void main(String[] args) {

        Car seat = new Car(LocalDate.of(2011,06,15), LocalDate.of(2020, 4, 10));

        ServiceCar service = new ServiceCar();

        service.makeCarInspection(seat);
        System.out.println(seat.getLastInspectionDate());

    }
}

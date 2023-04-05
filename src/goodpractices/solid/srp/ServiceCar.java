package goodpractices.solid.srp;

import java.time.LocalDate;

public class ServiceCar {

    public void makeCarInspection(Car car){

        if(car.isInspectionOverdue()){
            System.out.println("WARNING: The car inspection is overdue");
        }
        System.out.println("Check break, check engine, ... " + car);
        car.setLastInspectionDate(LocalDate.now());

    }
}

package goodpractices.solid.srp;

import java.time.LocalDate;
import java.time.Period;

public class Car {

    private LocalDate fabricationDate;
    private LocalDate lastInspectionDate;

    public Car(LocalDate fabricationDate, LocalDate lastInspectionDate) {
        this.fabricationDate = fabricationDate;
        this.lastInspectionDate = lastInspectionDate;
    }

    public LocalDate getFabricationDate() {
        return fabricationDate;
    }

    public LocalDate getLastInspectionDate() {
        return lastInspectionDate;
    }

    public void setLastInspectionDate(LocalDate lastInspectionDate) {
        this.lastInspectionDate = lastInspectionDate;
    }

    public boolean isInspectionOverdue() {
        LocalDate currentDate = LocalDate.now();
        Period timeSinceLastInspection = Period.between(lastInspectionDate, currentDate);
        return timeSinceLastInspection.getYears() >= 2;
    }

    @Override
    public String toString() {
        return "Car{" +
                "fabricationDate=" + fabricationDate +
                ", lastInspectionDate=" + lastInspectionDate +
                '}';
    }
}

package hr.unipu.zadace.zadatak2;

public class Car extends Veichle {
    private boolean hasAC;
    private int numberOfDoors;

    public Car(String manufacturer, String model, String id, String power, String numberOfPassengers, double regularPrice, boolean hasAC, int numberOfDoors) {
        super(manufacturer, model, id, power, numberOfPassengers, regularPrice);
        this.hasAC = hasAC;
        this.numberOfDoors = numberOfDoors;
    }

    public boolean isHasAC() {
        return hasAC;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }
}

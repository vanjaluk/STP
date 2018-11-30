package hr.unipu.zadace.zadatak2;

public class Truck extends Veichle {
    int maxWeight;

    public Truck(String manufacturer, String model, String id, String power, String numberOfPassengers, double regularPrice, int maxWeight) {
        super(manufacturer, model, id, power, numberOfPassengers, regularPrice);
        this.maxWeight = maxWeight;
    }


}

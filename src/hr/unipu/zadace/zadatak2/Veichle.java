package hr.unipu.zadace.zadatak2;

public abstract class Veichle {
        public String manufacturer;
        public String model;
        public String id;
        public String power;
        public String numberOfPassengers;
        double regularPrice;

        public Veichle(String manufacturer, String model, String id, String power, String numberOfPassengers, double regularPrice) {
            this.manufacturer = manufacturer;
            this.model = model;
            this.id = id;
            this.power = power;
            this.numberOfPassengers = numberOfPassengers;
            this.regularPrice = regularPrice;
        }

        public String getManufacturer() {
            return manufacturer;
        }

        public String getModel() {
            return model;
        }

        public String getId() {
            return id;
        }

        public String getPower() {
            return power;
        }

        public String getNumberOfPassengers() {
            return numberOfPassengers;
        }

        public double getRegularPrice() {
            return regularPrice;
        }
    }
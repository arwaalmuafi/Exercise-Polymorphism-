public class Bake implements Vehicle {

    private String brand;
    private double hours;
    private static final double HOURLY_RATE = 10.0;

    public Bake(String brand, double hours) {
        this.brand = brand;
        this.hours = hours;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public double calculateRentalCost() {
        return hours * HOURLY_RATE;
    }

    @Override
    public void displayDetails() {
        System.out.println("_______________________");
        System.out.println("Bike Brand: " + brand);
        System.out.println("Hourly Rental Rate: " + HOURLY_RATE);
        System.out.println("Rental Cost: " + calculateRentalCost());
    }
}

public class Truck implements Vehicle {

    private String type;
    private int weeks;
    private static final double WEEKLY_RATE = 500.0;

    public Truck(String type, int weeks) {
        this.type = type;
        this.weeks = weeks;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWeeks() {
        return weeks;
    }

    public void setWeeks(int weeks) {
        this.weeks = weeks;
    }

    @Override
    public double calculateRentalCost() {
        return weeks * WEEKLY_RATE;
    }

    @Override
    public void displayDetails() {
        System.out.println("_______________________");
        System.out.println("Truck Type: " + type);
        System.out.println("Weekly Rental Rate: " + WEEKLY_RATE);
        System.out.println("Rental Cost: " + calculateRentalCost());
    }
}

public class Car extends Vehicle{
    private int numberOfSeats;
    String model;

    public Car(String model) {
        this.model = model;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }
}

public class Car extends Vehicle {
    private int numberOfSeats;
    private String model;

    public Car(String model, int numberOfSeats) {
        this.model = model;
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    // Nadpisujemy metodę start()
    @Override
    public void start() {
        System.out.println("Car " + model + " with " + numberOfSeats + " seats started");
    }

    // Nadpisujemy metodę stop()
    @Override
    public void stop() {
        System.out.println("Car " + model + " with " + numberOfSeats + " seats stopped");
    }

}


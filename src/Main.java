public class Main {
    public static void main(String[] args) {

        Car myCar = new Car("volvo_xc70", 5);
        Vehicle vehicles = new Vehicle();

        vehicles.start();
        vehicles.stop();

        myCar.start();
        myCar.stop();


        }
    }

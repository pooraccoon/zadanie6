public class Main {
    public static void main(String[] args) {

        Car myCar = new Car("volvo_xc70");
        Vehicle vehicles = new Vehicle();

        vehicles.start(myCar);
        vehicles.stop(myCar);


        }
    }

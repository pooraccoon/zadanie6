public class Main {
    public static void main(String[] args) {

        Car myCar = new Car("volvo_xc70", 5);
        Vehicle vehicles = new Vehicle();

        vehicles.start();
        vehicles.stop();

        myCar.start();
        myCar.stop();

        animal animal = new animal();
        weasel weasel = new weasel();
        rabbit rabbit = new rabbit();
        cat cat = new cat();
        beaver beaver = new beaver();

        animal.makeNoise();
        weasel.makeNoise();
        rabbit.makeNoise();
        cat.makeNoise();
        beaver.makeNoise();

        //aaaa, nie przeczytałam czwartego zadania! to dorobię więcej zwierząt

        dog dog = new dog();
        lion lion = new lion();
        wolf wolf = new wolf();
        feline feline = new feline();
        canine canine = new canine();

        dog.makeNoise();
        lion.makeNoise();
        wolf.makeNoise();
        animal.roam();
        feline.roam();
        canine.roam();



        }
    }

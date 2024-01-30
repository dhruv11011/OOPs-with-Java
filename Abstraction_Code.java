abstract class Car {
    String model;
    int id;
    String color;
    String NumberPlate;

    abstract void start();

    abstract void horn();

    abstract void stop();
}

class BMW extends Car {

    private String name = "BMW ";

    void start() {
        System.out.println(name + model + " is Starting");
    }

    void horn() {
        System.out.println(name + model + " is Horning");
    }

    void stop() {
        System.out.println(name + model + " is Stopping");
    }

}

class AUDI extends Car {

    private String name = "AUDI ";

    void start() {
        System.out.println(name + model + " is Starting");
    }

    void horn() {
        System.out.println(name + model + " is Horning");
    }

    void stop() {
        System.out.println(name + model + " is Stopping");
    }

}

public class Abstraction_Code {
    public static void main(String[] args) {

        BMW b1 = new BMW();
        AUDI a1 = new AUDI();

        b1.NumberPlate = "GJ01BM9090";
        b1.color = "Black";
        b1.model = "X7";

        a1.NumberPlate = "GJ01BM9091";
        a1.color = "Black";
        a1.model = "R8";

        b1.start();
        a1.start();
        System.out.println("Both Cars are ready for racing");

    }
}
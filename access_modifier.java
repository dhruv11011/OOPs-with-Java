class Car {
    protected String model;
    protected int id; // --> it can access within class and inherited class
    public String color;
    private String NumberPlate = "GJ01BM9090";

    void read() {
        System.out.println(NumberPlate);
    }
}

class Toyoto {
    String name="Fortuner";
    void start() {
        System.out.println(name + " is Starting");
    }

    void horn() {
        System.out.println(name + " is Horning");
    }

    void stop() {
        System.out.println(name + " is Stopping");
    }
}

class BMW extends Car {

    private String name = "BMW ";

    void start() {
        System.out.println(color + name + model + "id No. " + id + " is Starting");
    }

    void horn() {
        System.out.println(color + name + model + "id No. " + id + " is Horning");
    }

    void stop() {
        System.out.println(color + name + model + "id No. " + id + " is Stopping");
    }

}

class AUDI extends Car {

    private String name = "AUDI ";

    void start() {
        System.out.println(color + name + model + "id No. " + id + " is Starting");
    }

    void horn() {
        System.out.println(color + name + model + "id No. " + id + " is Horning");
    }

    void stop() {
        System.out.println(color + name + model + "id No. " + id + " is Stopping");
    }

}

public class access_modifier {
    public static void main(String[] args) {

        BMW b1 = new BMW();
        AUDI a1 = new AUDI();
        // Toyoto t1 = new Toyoto();

        // t1.id=3; --> This give Error because it does not inherited the Car class

        // b1.NumberPlate = "GJ01BM9090"; --> This Give Error Because NumberPlate is
        // Private
        b1.id = 1;
        b1.color = "Blue ";
        b1.model = "X7 ";

        // a1.NumberPlate = "GJ01BM9091"; --> This Give Error Because NumberPlate is
        // Private
        a1.id = 2;
        a1.color = "Black ";
        a1.model = "R8 ";

        b1.start();
        a1.start();
        System.out.println("Both Cars are ready for racing");
    }
}
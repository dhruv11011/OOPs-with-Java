class Animal {
    String name;

    public void walk() {
        System.out.println(name + " is walking");
    }

    public void run() {
        System.out.println(name + " is running");
    }

    public void eat() {
        System.out.println(name + " is eating");
    }
}

class dog extends Animal {
    int age;

    void pet() {
        System.out.println(name + " can pet");
    }
}

class tiger extends Animal {
    int age;

    void killer() {
        System.out.println(name + " kill the animals");
    }
}

public class Inheritance {
    public static void main(String[] args) {

        dog sheru = new dog();
        tiger vagh = new tiger();

        sheru.eat();
        sheru.name = "Sheru";
        sheru.eat();
        sheru.walk();
        vagh.name = "Vagh";

        System.out.println(sheru.name);
        System.out.println(vagh.name);
    }
}
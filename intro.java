class Animal {

    int age;
    String name;
    String Description;

    void run() {
    System.out.println(name +" "+ "is Running!!!"+ " " + name.length());
}

    void eat() {
    System.out.println(name +" "+ "is Eating!!!"+ " " + name.isEmpty());
}
}

public class intro {
    public static void main(String[] args) {
    System.out.println("This Program is For Understanding concept of Class, Object and Method.");

    Animal Dog = new Animal();
    Animal Lion = new Animal();

    Dog.name = "Sheru";
    Dog.age = 3;
    Lion.name = "Sher";
    Lion.age = 4;

    Dog.eat();
    Lion.run();
    }
}

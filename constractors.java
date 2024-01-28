class Person {

    String name;
    int age;

    Person() {
    name = "Anonymous";
    age = 18;
    }

    Person(String Name, int Age) {
    name = Name;
    age = Age;
    }
}

public class constractors {

    public static void main(String[] args) {
    Person p1 = new Person();
    Person p2 = new Person("Dhruv", 20);

    System.out.println(p1.name);
    System.out.println(p1.age);
    System.out.println(p2.name);
    System.out.println(p2.age);
    }
}

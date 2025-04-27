public class Human {
    String name;
    int age;
    double height;
    double weight;

    Human(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight; // this keyword refers to the current object
    }

    void eat() {
        System.out.println(this.name + " is eating");
    }
    void sleep() {
        System.out.println(this.name + " is sleeping");
    }
    void walk() {
        System.out.println(this.name + " is walking");
    }
    void speak() {
        System.out.println(this.name + " is speaking");
    }
}

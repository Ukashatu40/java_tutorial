public class Hero extends Person {
    
    String superPower;

    Hero(String name, int age, String superPower) {
        super(name, age);
        this.superPower = superPower;
    }
    public String toString() {
        return super.toString() + "Super Power: " + this.superPower + "\n";
    }
}

package generic;

public class Main2 {
    public static void main(String[] args) {
        
        // MyIntegerClass myInt = new MyIntegerClass(10);
        // MyDoubleClass myDouble = new MyDoubleClass(10.10);
        // MyCharacterClass myChar = new MyCharacterClass('A');
        // MyStringClass myString = new MyStringClass("UKASHA");

        // System.out.println(myInt.getValue());
        // System.out.println(myDouble.getValue());
        // System.out.println(myChar.getValue());
        // System.out.println(myString.getValue());

        MyGenericClass<Integer, Integer> myInt = new MyGenericClass<>(10,9);
        MyGenericClass<Double, Double> myDouble = new MyGenericClass<>(10.10, 9.9);
        
        MyGenericClass<Character, Character> myChar = new MyGenericClass<>('A', 'B');
        MyGenericClass<String, Character> myString = new MyGenericClass<>("UKASHA", 'B');

        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
        System.out.println(myChar.getValue());
        System.out.println(myString.getValue());
    }
}

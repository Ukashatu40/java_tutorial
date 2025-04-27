package generic;

public class Main {
    public static void main(String[] args) {
        // generics = enable types (classes and interfaces) to be parameters when defining classes, interfaces and methods
        //            - provide compile-time type safety for collections
        //            - are a way to implement abstract classes
        //            - enable types to be used as parameters when defining classes, interfaces and methods
        //            - allow you to implement generic algorithms
        //            - are the basis for Java Collections Framework
        //            - allow you to implement generic classes and interfaces

        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};
        String[] stringArray = {"UKASHA", "ABDULLAHI", "ABUBAKAR"};

        displayArray(intArray);
        displayArray(doubleArray);
        displayArray(charArray);
        displayArray(stringArray);

        System.out.println(getFirstElement(intArray));
        System.out.println(getFirstElement(doubleArray));
        System.out.println(getFirstElement(charArray));
        System.out.println(getFirstElement(stringArray));
    }

    public static <T> void displayArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static <Thing> Thing getFirstElement(Thing[] array) {
        return array[0];
    }
}


//import java.util.Scanner;

/**
 import javax.swing.JOptionPane;
 * 
 */
public class Main {

	
public static void main(String[] args) {

		// int myNum = 5;               // Integer (whole number)
        // float myFloatNum = 5.99f;    // Floating point number
        // char myLetter = 'D';         // Character
        // boolean myBool = true;       // Boolean
        // String myText = "Hello";     // String
		// TODO Auto-generated method stub
//		System.out.println("\tHello World\n");
//		System.out.println("It's \"really\" Good");
//		System.out.println();
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("What is your name:? ");
//		String name = scanner.nextLine();
//		System.out.println("What is your age:? ");
//		int age = scanner.nextInt();
//		scanner.nextLine();
//		System.out.println("What is your favorite food? ");
//		String food = scanner.nextLine();
//		
//		System.out.println("Hello "+name);
//		System.out.println("You are "+age+" Years old");
//		System.out.println("You like "+food);
		
		// GUI app
		//// String name = JOptionPane.showInputDialog("Enter your name");
		//// JOptionPane.showMessageDialog(null, "Hello "+ name);
		
		//// int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
		//// JOptionPane.showMessageDialog(null, "You are "+age+" Years old");
		
		//// double height = Double.parseDouble(JOptionPane.showInputDialog("Enter Height age"));
		//// JOptionPane.showMessageDialog(null, "You are "+height+" cm tall");
		///
		/// Math Class 
		/// Math.max(5, 10);
		/// Math.min(5, 10);
		///  Math.sqrt(x);
		///  Math.abs(x);
		/// Math.random();
		/// int randomNum = (int)(Math.random() * 101);  // 0 to 100
		///
		/// Short hand if...else
		/// int time = 20;
        // String result = (time < 18) ? "Good day." : "Good evening.";
        // System.out.println(result);
		// 
		// if....else
		// int myNum = 10; // Is this a positive or negative number?
        //  if (myNum > 0) {
        //	System.out.println("The value is a positive number.");
        //  } else if (myNum < 0) {
        //	System.out.println("The value is a negative number.");
        //  } else {
        //	System.out.println("The value is 0.");
        //  }

		// do..while loop 
		// int i = 0;
        // do {
        //   System.out.println(i);
        //   i++;
        // }
        // while (i < 5);

		// for Each loop
		// String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        // for (String i : cars) {
        //   System.out.println(i);
        // }
        // 
		// Arrays
		// int[] myNum = {10, 20, 30, 40};
		// String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        // cars[0] = "Opel";
        // System.out.println(cars[0]);
		// String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        // System.out.println(cars.length);

		// String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        // for (int i = 0; i < cars.length; i++) {
        //   System.out.println(cars[i]);
        // }

		// Multidimensional Arrays
		// int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
		// int x = myNumbers[1][2];
		// System.out.println(x);  // Outputs 7
		// 
		/// Multidimensional Arrays
		// int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
		// for (int i = 0; i < myNumbers.length; ++i) {
		//   for(int j = 0; j < myNumbers[i].length; ++j) {
		//     System.out.println(myNumbers[i][j]);
		//   }
		// }
		//
		// For each loop
		// int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
		// for (int[] i : myNumbers) {
		//   for(int j : i) {
		//     System.out.println(j);
		//   }
		// }
		//
		// String Methods
		// String txt = "Hello World";
		// System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
		// System.out.println(txt.toLowerCase());   // Outputs "hello world"
		// System.out.println(txt.length());   // Outputs 11
		// System.out.println(txt.indexOf("World"));   // Outputs 6
		// System.out.println(txt.indexOf("e"));   // Outputs 1
		// System.out.println(txt.indexOf("a"));   // Outputs -1
		// System.out.println(txt.charAt(0));   // Outputs H
		// System.out.println(txt.charAt(6));   // Outputs W
		// System.out.println(txt.substring(0, 5));   // Outputs Hello
		// System.out.println(txt.substring(6));   // Outputs World
		// System.out.println(txt.replace("H", "J"));   // Outputs Jello World
		// System.out.println(txt.replaceAll("H", "J"));   // Outputs Jello World
		// System.out.println(txt.replaceAll("Hello", "Hi"));   // Outputs Hi World
		// System.out.println(txt.trim());   // Outputs "Hello World"
		// System.out.println(txt.startsWith("Hello"));   // Outputs true
		// System.out.println(txt.endsWith("World"));   // Outputs true
		// System.out.println(txt.concat(" from Java"));   // Outputs Hello World from Java
		// System.out.println(txt + " from Java");   // Outputs Hello World from Java
		// System.out.println(txt.equals("Hello World"));   // Outputs true
		// System.out.println(txt.equalsIgnoreCase("hello world"));   // Outputs true
		// System.out.println(txt.compareTo("Hello World"));   // Outputs 0
		// System.out.println(txt.compareTo("hello world"));   // Outputs -32
		// System.out.println(txt.compareTo("hello"));   // Outputs 15
		// System.out.println(txt.compareTo("hello world from Java"));   // Outputs -10
		// System.out.println(txt.compareToIgnoreCase("hello world"));   // Outputs 0
		// System.out.println(txt.contains("Hello"));   // Outputs true
		// System.out.println(txt.contains("hello"));   // Outputs false
		// System.out.println(txt.contentEquals("Hello World"));   // Outputs true
		// System.out.println(txt.contentEquals("hello world"));   // Outputs false
		// System.out.println(txt.toCharArray());   // Outputs [C@15db9742
		// System.out.println(txt.getBytes());   // Outputs [B@6d06d69c
		// System.out.println(txt.codePointAt(0));   // Outputs 72

		// wrapper classes = provides way to use premitive datat types as reference data types 
		//                   reference data types contain useful methods
		//                   can be used with collections (ex. ArrayList)
        //
		//premitive       //wrapper
		//---------       //--------
		// boolean         Boolean
		// char            Char
		// int             Integer
		// double          Double

		// autoboxing = the automatic convertion that the java compiler makes between the primitive types and their corresponding object wrapper classes
		// unboxing = the reverse of autoboxing. Automatic conversion of wrapper class to primitive

		// Boolean myBool = true;
		// String myString = "Ukasha"; // String is not a wrapper class
		// Integer myInt = 5; // Integer is a wrapper class
		// Double myDouble = 5.99;  // Double is a wrapper class
		// Character myChar = 'A';  // Character is a wrapper class
		// System.out.println(myInt); // Output 5
		// System.out.println(myDouble); // Output 5.99
		// System.out.println(myChar);  // Output A
		// System.out.println(myInt.intValue()); // Output 5
		// System.out.println(myString); // Output Ukasha
		// System.out.println(myInt.toString()); // Output 5
		
		// Methods = a block of code which only runs when it is called
		//           you can pass data, known
		//           you can pass as many parameters as you want
		//           you can pass any data type
		//           you can return data
		//           you can call a method from another method
		//           you can call a method from another class

		// String name = "Ukasha";
		// int age = 25;

		// sayHello(name, age);

		// int x = 5;
		// int y = 3;

		// int z = add(x, y);
		// System.out.println(z);

		// Printf method = can be used to print formatted output
		//                use %d for integers, %f for floating point numbers, %s for strings, %c for characters, %b for booleans
		//                use %e for scientific numbers
		//                use %t for date/time
		//                use %n for new line
		//                use %% for percentage
		//                use %x for hexadecimal

		// System.out.printf("%s This is a format string %d %f ", "Ukasha", 314, 3.14);

		// width
		// System.out.printf("%10s", "Ukasha"); // Output "    Ukasha"

		// precision
		// System.out.printf("%.2f", 3.14159); // Output 3.14

		// flags
		// System.out.printf("%-10s", "Ukasha"); // Output "Ukasha    "
		// System.out.printf("%+d", 42); // Output +42
		// System.out.printf("%+d", -42); // Output -42
		// System.out.printf("%(d", -42); // Output (42)

		// System.out.printf("%d", 42); // Output 42

		// final keyword = means that the value of the variable cannot change
		//                once a variable is declared with the final keyword, it can no longer be reassigned
		//                typically used to define constants
		//                variable names are in uppercase
		//                multiple words are separated by an underscore


        // final int myNum = 15;
		// myNum = 20; // will generate an error: cannot assign a value to a final variable
		// System.out.println(myNum);

        // toString method =  
		/**
		 * Returns a string representation of the object.
		 * The toString() method returns a string that represents the state of the object.
		 * It is recommended to override this method in your own classes to provide a meaningful string representation.
		 * 
		 * @return a string representation of the object
		 */
		// @Override
		// public String toString() {
		// 	return "Main object";
		// }

		// Example usage:
		// Main obj = new Main();
		// System.out.println(obj.toString()); // Output: Main object

		// Car car = new Car();
		// System.out.println(car);
		// System.out.println(car.toString());

		// Arrays
		// int[] numbers = new int[3];
		// char[] characters = new char[4];
		// String[] strings = new String[5];

		// Food[] refrigerator = new Food[3];

		// Food food1 = new Food("pizza");
		// Food food2 = new Food("hamburger");
		// Food food3 = new Food("hotdog");

		// Food[] refrigerator = {food1,food2,food3};

		// refrigerator[0] = food1;  // Alternatives
		// refrigerator[1] = food2;
		// refrigerator[2] = food3;

		// System.out.println(refrigerator[0].name);
		// System.out.println(refrigerator[1].name);
		// System.out.println(refrigerator[2].name);




	}

    // static void sayHello(String name, int age) {
	// 	System.out.println("Hello "+name);
	// 	System.out.println("You are "+age+" Years old");
	// }

	// static int add(int x, int y) {
	// 	return x + y;
	// }

}
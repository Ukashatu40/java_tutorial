public class OOP {
    public static void main(String[] args) {
        // OOP = Object Oriented Programming
        // Classes and Objects
        // Class = template for objects
        // Object = instances of classes
        // Example: Car

        // Objects

        // Car myCar = new Car();
        // Car myCar2 = new Car();

        // System.out.println(myCar.make); // Print the value of the make attribute
        // System.out.println(myCar.model); // Print the value of the model attribute

        // myCar.drive(); // Call the drive method
        // myCar2.brake(); // Call the brake method

        // myCar.make = "Chevy"; // Change the value of the make attribute

        /// Constructors = special methods that are called when an object is instantiated
        ///              used to initialize object states
        ///             must have the same name as the class
        ///            have no return type
        ///           can take parameters
        ///         can be overloaded
        ///       can call other constructors
        ///    can call other methods
        /// 
        // Human Human1 = new Human("Ukasha", 25, 70.5, 75.5); // Create a Human object

        // System.out.println(Human1.name);
        // System.out.println(Human1.age);
        // System.out.println(Human1.height);
        // System.out.println(Human1.weight);
        // Human1.eat();
        // Human1.sleep(); // this keyword refers to the current object
        // Human1.walk(); 
        // Human1.speak();

        // DiceRoller diceRoller = new DiceRoller(); //

        // Overloaded Constructor = multiple constructors within a class with the same name but different parameters
        //                        used to initialize object states
        //                        provide multiple ways to create objects
        //                        can be chained together
        //                        can call other constructors
        //                        can call other methods
        //

        // Pizza pizza = new Pizza("thicc crust", "tomato", "mozzerella", "paperoni");

        // System.out.println(pizza.bread);
        // System.out.println(pizza.sauce);
        // System.out.println(pizza.cheese);
        // System.out.println(pizza.topping);

        // Object passing = passing objects as arguments

        // Garrage garrage = new Garrage(); // Create a Garrage object
        
        // Car myCar = new Car(); // Create a Car object
        // myCar.go(); // Call the go method
        // Bicycle myBike = new Bicycle(); // Create a Bicycle object
        // myBike.stop(); // Call the go method

        // garrage.park(myCar); // Pass the myCar object as an argument to the park method

        // static keyword = belongs to the class, not the object
        //                can be called before any objects of the class are created
        //                used to initialize static fields
        //                can be called directly in static methods

        // Method Overriding = defining a method in a child class that already exists in the parent class with the same signature (name + parameters)
        //                    used to provide a specific implementation of a method that is already provided by its super class
        //                    used in runtime polymorphism
        //                    can only be applied to inherited methods

        // Super keyword = refers to the superclass (parent) of an object
        //               is used to call superclass methods, constructors, and variables
        //               is used if a subclass (child) has
        //               overridden a superclass method

        // Hero hero = new Hero("Ukasha", 25, "Flying"); // Create a Hero object
        // Hero hero2 = new Hero("Umar", 25, "Speed"); // Create a Hero object

        // System.out.println(hero.name);
        // System.out.println(hero.age);
        // System.out.println(hero.superPower);

        // System.out.println(hero2.name);
        // System.out.println(hero2.age);
        // System.out.println(hero2.superPower);

        // System.out.println(hero.toString());

    }
}

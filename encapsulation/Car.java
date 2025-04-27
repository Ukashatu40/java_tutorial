package encapsulation;

public class Car {
    private String make; // private = restricted access
    private String model;
    private int year;

    Car(String make, String model, int year) {
        this.setMake(make);
        this.setModel(model); // this.model = model;
        this.setYear(year);
    }
    Car(Car car) {
        this.copy(car);
    }

    public String getMake() { // getter
        return this.make;
    }
    public String getModel() {
        return this.model;
    }
    public int getYear() {
        return this.year;
    }

    public void setMake(String make) { // setter
        this.make = make;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public void copy(Car car) {
        this.setMake(car.getMake());
        this.setModel(car.getModel());
        this.setYear(car.getYear());
    }
} 

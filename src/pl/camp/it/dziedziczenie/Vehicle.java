package pl.camp.it.dziedziczenie;

public class Vehicle {
    public String brand;
    public String model;
    public int year;
    public String plate;

    public Vehicle(String brand, String model, int year, String plate) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.plate = plate;
    }

    public void drive() {
        System.out.println("Jadę !!!!");
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", plate='" + plate + '\'' +
                '}';
    }
}

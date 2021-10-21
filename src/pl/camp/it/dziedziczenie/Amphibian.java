package pl.camp.it.dziedziczenie;

public class Amphibian extends Vehicle {

    public Amphibian(String brand, String model, int year, String plate) {
        super(brand, model, year, plate);
    }

    @Override
    public void drive() {
        System.out.println("Wysuwam koła !!");
        super.drive();
    }
}

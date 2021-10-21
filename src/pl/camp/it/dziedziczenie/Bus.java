package pl.camp.it.dziedziczenie;

public class Bus extends Vehicle {
    int passengers;

    public Bus(String brand, String model, int year, String plate, int passengers) {
        super(brand, model, year, plate);
        this.passengers = passengers;
    }

    public void openDoor() {
        System.out.println("Otwieram drzwi !!");
    }

    @Override
    public String toString() {
        return "marka: " + this.brand + " model: " + this.model + " rok: " + this.year + " rejestracja: " + this.plate + " pasażerowie: " + this.passengers;
    }
}

package pl.camp.it.dziedziczenie;

public class Car extends Vehicle {

    public Car(String brand, String model, int year, String plate) {
        super(brand, model, year, plate);
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Car)) {
            return false;
        }

        Car temp = (Car) obj;

        return this.plate.equals(temp.plate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("marka: ")
                .append(this.brand)
                .append(" model: ")
                .append(this.model)
                .append(" rok: ")
                .append(this.year)
                .append(" rejestracja: ")
                .append(this.plate);

        return sb.toString();
    }
}

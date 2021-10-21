package pl.camp.it.dziedziczenie.final1;

import pl.camp.it.dziedziczenie.Vehicle;

public class App {
    public static void main(String[] args) {
        final int a = 5;

        final Vehicle v = new Vehicle("Toyota", "Corolla", 2000, "KR1");

        System.out.println(v);

        v.brand = "Mazda";

        System.out.println(v);

        //v = new Vehicle("Toyota", "Corolla", 2000, "KR1");
    }
}

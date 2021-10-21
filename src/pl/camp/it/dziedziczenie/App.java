package pl.camp.it.dziedziczenie;

public class App {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", 2000, "KR1");

        System.out.println(car.brand);

        car.drive();

        Bus bus = new Bus("Toyota", "Corolla", 2000, "KR1", 50);

        System.out.println(bus.model);
        System.out.println(bus.passengers);
        bus.drive();
        bus.openDoor();

        Amphibian amphibian = new Amphibian("Toyota", "Corolla", 2000, "KR1");

        amphibian.drive();

        Bus c = new Bus("Toyota", "Corolla", 2000, "KR1", 50);

        c.drive();
        c.openDoor();
        c.passengers = 60;


        Vehicle v = new Bus("Toyota", "Corolla", 2000, "KR1", 50);

        v.drive();
        /*v.openDoor();
        v.passengers = 10;*/

        Bus b2 = (Bus) v;

        b2.passengers = 10;
        b2.openDoor();

        Vehicle[] pojazdy = new Vehicle[5];

        pojazdy[0] = new Car("Toyota", "Corolla", 2000, "KR1");
        pojazdy[1] = new Bus("Toyota", "Corolla", 2000, "KR1", 50);
        pojazdy[2] = new Amphibian("Toyota", "Corolla", 2000, "KR1");

        ((Bus) pojazdy[1]).openDoor();

        System.out.println("--------------------------------------------");
        pojazdy[0].drive();
        pojazdy[1].drive();
        pojazdy[2].drive();

        Vehicle a = new Amphibian("Toyota", "Corolla", 2000, "KR1");
        a.drive();

        Object o = new Vehicle("Toyota", "Corolla", 2000, "KR1");
        Object o2 = new Car("Toyota", "Corolla", 2000, "KR1");
        Object o3 = new Amphibian("Toyota", "Corolla", 2000, "KR1");
        Object o4 = new Bus("Toyota", "Corolla", 2000, "KR1", 50);
        Object o5 = new String();
        Object o6 = 6;
        Object o7 = true;

        Car c1 = new Car("Toyota", "Corolla", 2000, "KR1");
        Car c2 = new Car("Toyota", "Corolla", 2000, "KR1");

        System.out.println(c1.equals(c2));

        System.out.println(c1);
        Bus bus1 = new Bus("Toyota", "Corolla", 2000, "KR1", 50);
        System.out.println(bus1);

        Amphibian amphibian1 = new Amphibian("Toyota", "Corolla", 2000, "KR1");
        System.out.println(amphibian1);
    }
}

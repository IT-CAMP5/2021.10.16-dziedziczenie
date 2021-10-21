package pl.camp.it.dziedziczenie.static1;

public class App {
    public static void main(String[] args) {
        A.pole2 = 5;

        A a1 = new A();
        A a2 = new A();

        a1.pole = 10;
        a2.pole = 15;

        System.out.println(a1.pole);
        System.out.println(a2.pole);

        System.out.println(a1.pole2);
        System.out.println(a2.pole2);

        a1.pole2 = 20;

        System.out.println(a1.pole2);
        System.out.println(a2.pole2);
    }
}

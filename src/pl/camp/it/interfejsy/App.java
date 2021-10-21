package pl.camp.it.interfejsy;

public class App {
    public static void main(String[] args) {

        //????
        //???

        Umowa obiekt = new KlasaSpelniajacaUmowe();

        obiekt.wylicz(234);

        int[] tab = {2,34,45};
        obiekt.sortuj(tab);

        System.out.println(MathConstants.PI);

        /*Umowa umowa = new Umowa();

        umowa.wylicz(5);*/

        AbstractClass abstractClass = new AbstractClassImpl();

        abstractClass.a();
    }
}

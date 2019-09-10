package telacad.a1.cursOpt.generics;

public class Exemplu3 {

    public static void main(String[] args) {
        D<Integer, ? extends Number> d1;
        D<Integer, ? extends Number> d2;

        d1 = new D <Integer, Number>();  // w ar fi Number
        d2 = new D <Integer, Integer>();  // w ar fi Integer

        new F<String>();  // T din B e Integer si G din B e String

        new G<Integer, String>(); // T e String, G e Integer

        // clasa impreuna cu tipul ei generic formeaza deasemenea un tip referinta
        new A <G<Integer, B<String, A<B<String, A<B<String, Integer>>>>>>>();

    }

}

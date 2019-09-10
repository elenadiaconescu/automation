package telacad.a1.cursSase.singleTone;

public class Exemplu {

    public static void main(String[] args) {
        Pisica p1 = Pisica.getInstance();
        Pisica p2 = Pisica.getInstance();

        p1.nume = "Tom";

        System.out.println(p2.nume);  // afiseaza Tom desi p2 nu i-am alocat valoarea Tom

        Punct p = Punct.getInstance();
        System.out.println(p);
    }

}

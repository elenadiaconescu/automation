package telacad.a1.cursCinci.clasaAnonima;

public class Exemplu {
    public static void main(String[] args) {
        Angajat a1 = new Angajat(1000, 3);
        Angajat a2 = new Angajat(1000, 10);

        // clasa anonima aplicata unui obiect de tip Angajat
        Angajat gigel = new Angajat(1000, 1) {
            @Override
            public double calculeazaSalariul() {
                return 5000;
            }
        };

        System.out.println(a1.calculeazaSalariul());
        System.out.println(a2.calculeazaSalariul());
        System.out.println(gigel.calculeazaSalariul());

        // clasa anonima se poate folosit si pt interfata
        Instrument i = new Instrument() {
            public void play() {
            }
        };

        Instrument i2 = () -> {};

    }
}

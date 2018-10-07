package telacad.a1.cursUnuDoiTrei;

public class Gato {
    String nume;
    String culoare;
    int varsta;

    Gato(String nume, String culoare, int varsta) {
        this.nume = nume;
        this.culoare = culoare;
        this.varsta = varsta;
    }

    public void spuneMiau() {
        System.out.println("says MEEOOOWW " + this.nume);
    }

}

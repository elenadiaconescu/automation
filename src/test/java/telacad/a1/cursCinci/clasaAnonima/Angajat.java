package telacad.a1.cursCinci.clasaAnonima;

public class Angajat {
    double salariu;
    int vechime;


    public Angajat(double salariu, int vechime) {
        this.salariu = salariu;
        this.vechime = vechime;
    }

    public double calculeazaSalariul() {
        if (vechime > 5) {
            return salariu + 500;
        } else {
            return salariu;
        }
    }
}

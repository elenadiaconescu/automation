package telacad.a1.cursUnuDoiTrei;

public class ExemploGato {

    public static void main(String[] args) {

        Gato p1 = new Gato("Tom", "gray", 3);
        Gato p2 = p1;
        Gato p3 = new Gato("Felix", "ginger", 1);

        p1.spuneMiau();
        p2.spuneMiau();
        p3.spuneMiau();

    }

}

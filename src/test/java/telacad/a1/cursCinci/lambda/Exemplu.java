package telacad.a1.cursCinci.lambda;

public class Exemplu {

    public static void main(String[] args) {
        Predicat p1 = (x) -> x > 5;
        Predicat p2 = x -> x > 5;
        Predicat p3 = (int x) -> x > 5;
        Predicat p4 = x -> {
            return x > 5;
        };

        Functie f1 = (x, y) -> 10;
        Functie f2 = (x, y) -> x + y;
        Functie f3 = (int x, int y) -> x + y;
        Functie f4 = (int x, int y) -> {
            return x + y;
        };

        m((x, y) -> x + y, 10, 20);
        m((x, y) -> x * y, 10, 20);

    }

    public static void m(Functie f, int a, int b) {
        System.out.println(f.operatie(a, b));
    }

}

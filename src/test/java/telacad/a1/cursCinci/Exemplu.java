package telacad.a1.cursCinci;

public class Exemplu {
    public static void main(String[] args) {
        A1.A3 a3 = new A1.A3();  //  A3 e statica

        A1 a1 = new A1();
        A1.A2 a2 = a1.new A2();  // A2 e non-statica

        System.out.println(a1.x);  // 0
        a2.m1(); // modific instanta a1
        System.out.println(a1.x); // 10

    }
}

package telacad.a1.cursPatru;

public class Exemplu {
    public static void main(String[] args) {
        //*** constructorul super() si this() **//
//        new C();
//        new C("dum dum");

        //*** POLIMORFISM **//
        Bar b1 = new Bar();
        Foo f1 = new Foo();

        Bar a = new Foo(); // Foo extends Bar regula 1

        a.x = 10;  // regula 2
        // a.y = 10;  // regula 2 a e Bar si Bar are doar x

        a.m1();   /// regula 3
        System.out.println(a.w);  // regula 4
    }

}

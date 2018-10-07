package telacad.a1.cursOpt.generics;

public class A<T> {

    T x;

    public A() {

    }

    public A(T a) {
        this.x = a;
    }

    // in cazul in care vreau sa il folosesc in interiorul unui bloc static se poate dar trebuie sa il redeclar strict
    // pentru acel bloc static iar declararea ui se face prin a pune iniante tipului returnat din nou numele
    public static <T> void m3(T a) {

    }

    public T m1() {
        return x;
    }

    public void m2(T a) {

    }


    // nu am putea sa il folosesc pe tipul generic in definirea unei metode statice
    // incerc fie ca parametru, fie ca tip returnat - nu se poate
    // public static void m3( T a) {}


}

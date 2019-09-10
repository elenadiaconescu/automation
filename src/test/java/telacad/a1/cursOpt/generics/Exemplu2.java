package telacad.a1.cursOpt.generics;

public class Exemplu2 {
    public static void main(String[] args) {
        C<Integer> c1 = new C<>();
        //C<String> c2 = new C<>();  //  nu merge
        C<?> c2 = new C<>();
    }
}

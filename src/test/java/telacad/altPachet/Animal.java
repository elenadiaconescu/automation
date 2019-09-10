package telacad.altPachet;


public interface Animal { // interface expected

    //    private int x = 10;
//    abstract int i1 = 5;
//    public final static float c = 6.0f;
//    final short s = 10;
    static int speed = 2;
    String s = "speed";

    static void mainMeth() {

        System.out.println("static");
    } // should have body

    abstract void mainMethM();  // no body

    public abstract void m(); // no body

    public abstract String m2(); // no body

    default void print() {
        System.out.println("i");
    } // should have body
}

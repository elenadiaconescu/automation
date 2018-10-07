package telacad.a1.cursCinci.clasaAnonima;

@FunctionalInterface
public interface Instrument {
    public static final int x = 10;

    // nu are treaba cu overriden
    static void m2() {
    }

    default void m1() {
    }

    public void play();

}

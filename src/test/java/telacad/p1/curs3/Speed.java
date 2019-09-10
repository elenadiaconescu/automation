package telacad.p1.curs3;

public enum Speed {
    FAST(2),
    FASTER(3),
    SLOW(1);

    private final int speed;

    Speed(int i){ // nu compileaza cu public not allowed
        this.speed = 1;
    }
}

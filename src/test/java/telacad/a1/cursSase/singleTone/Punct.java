package telacad.a1.cursSase.singleTone;

// multi -thread
public class Punct {
    int x;
    int y;

    private Punct() {}

    public static Punct getInstance() {
        return SingleToneHolder.SINGLETON;
    }

    private static final class SingleToneHolder {
        private static final Punct SINGLETON = new Punct();
    }

}

package telacad.altPachet;

public class Outer {
    private int value1, value2;

    public Outer(int value1, int value2) {
        super();
        this.value1 = value1;
        this.value2 = value2;
    }

    public boolean doSomethingImportant() {
        Inner inner = new Inner();
        return inner.swap();
    }

    private class Inner {
        boolean swap() {
            int temp = value2;

            value2 = value1;
            value1 = temp;

            return (value1 > value2);
        }
    }

    public int getValue1() {
        return value1;
    }

    public int getValue2() {
        return value2;
    }
}

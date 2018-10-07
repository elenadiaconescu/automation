package telacad.a1.cursUnuDoiTrei;

public class Foo {

    public void transferPrinValoare(int x) {
        x = 10;
        System.out.println("x=" + x);
    }

    public void transferPrinReferinta(Punct p) {
        p.x = 10;
        System.out.println("x=" + p.x);
    }

}

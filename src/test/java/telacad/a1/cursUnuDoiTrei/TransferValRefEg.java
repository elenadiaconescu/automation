package telacad.a1.cursUnuDoiTrei;

public class TransferValRefEg {
    public static void main(String[] args) {
        Foo f1 = new Foo();

        int x = 40;

        Punct p1 = new Punct();
        p1.x = 40;

        f1.transferPrinValoare(x);
        System.out.println("x = " + x);

        f1.transferPrinReferinta(p1);
        System.out.println("p1.x = " + p1.x);
    }

}

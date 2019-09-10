package telacad.altPachet;

public abstract class BigMouse extends Exception {

    static void mainMeth() {

        System.out.println("static");
    } // missing body or declared abstract

    public String getName() {
        return "BigMouse";
    } // missing body or declared abstract

    public abstract void roar(); // no body

    abstract void mainMethM();  // no body

    ; //  has body OR is declared abstract

    public void m() {
    } // missing body or declared abstract

    public String m2() {
        return "3";
    } // has body OR is declared abstract


}

package telacad.a1.cursNoua;

public class Exemplu {

    public static void main(String[] args) {

        OddNumbThread t = new OddNumbThread();
        OddNumbThread t1 = new OddNumbThread();
        t.start();
        t1.run();
        System.out.println("End of Thread");

        EventNumberRunnable r = new EventNumberRunnable();
        // r.run();
        // r.start(); // nu merge

        Thread t2 = new Thread();
        t2.start();

        System.out.println("End of Thread runnable");

        // nu uita ca main e un thread = avem 4 threaduri aici
    }

}

package telacad.a1.cursSapte;

public class Exemplu {
    public static void main(String[] args) {
        try {
            Door d1 = new Door();
            Door d2 = new Door();
            {
                System.out.println("A");
                if (1 == 1) throw new RuntimeException("IN TRY");
                System.out.println("B");
                // folosim resursa
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());

            Throwable[] suppresed = e.getSuppressed();
            for (Throwable t : suppresed) {
                System.out.println(t);
            }
            //tratam exceptia
        } finally {
            System.out.println("C");
            // finally explicit
        }
    }
}

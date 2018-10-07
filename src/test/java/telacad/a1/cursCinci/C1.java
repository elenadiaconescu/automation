package telacad.a1.cursCinci;

public class C1 {
    static int y;
    int x;

    public static void m2() {
        class C3 {    //poate  doar in interiorul lui m2 sa fi instantiata  // nu se pot pune modificatori de access
            public void m4() {
                // x=10;
                y = 10;
            }
        }
    }

    public void m1(int k) {
        int q = 5;    // final e implicit, il poti adauga daca nu il adaugi in Java 8 e implicit
        int q1;

        class C2 {  // erroare de sintaxa, nu se poate aplica modificator
            public void m3() {
                x = 10;
                System.out.println(q);
                System.out.println(k);
            }
        }

        // q =10;  // nu putem face asta ; regula 3; q devine constanta
        q1 = 10; // asta e ok, pt ca nu o folosim in m3 si devine variabila locala
        // paremetrii metodei sunt variabile locale
    }

}

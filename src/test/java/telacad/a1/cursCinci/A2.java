package telacad.a1.cursCinci;

// class outer
// atribut care apartine instantei si numai instnatei / compileaza cu private

class A1 {
    static int y;
    int x;

    static class A3 {
        public void m2() {
            //x=10;
            y = 10;
        }

    }

    public class A2 extends A1 { // clasa inner
        int y;

        public void m1() {
            this.y = 5;
            A1.this.x = 10; // !!!
        }
    }
}

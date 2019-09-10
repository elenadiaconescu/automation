package telacad.a1.cursSase.exceptii;

public class Exemplu {
    public static void main(String[] args) {
        System.out.println("try to widraw");
        extrgeNumerar(10000);
        System.out.println("great success on withdraw");
    }

    public static void extrgeNumerar(double suma) {

        // compileaza dar nu executa
//        if (suma > 1000) {
//            throw new MyRuntimeException();
//        }

        // nu compileaza
//        if(suma>1000){
//            throw new MyException();
//        }

        // nu compileaza
//        if(suma>1000){
//            throw new MyException();
//        }

    }

}

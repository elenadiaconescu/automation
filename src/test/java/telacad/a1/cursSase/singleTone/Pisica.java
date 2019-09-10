package telacad.a1.cursSase.singleTone;

// single tone - ma asgir ca exita o singura Pisica
// clasa pisica e singure care se ocupa de creare de pisici
// single thread
public class Pisica {
    private static Pisica SINGLETONE;

    String nume;
    int varsta;

    private Pisica(){}

    // se va putea crea o instanta de tip Pisica
    // single thread
    public static Pisica getInstance(){
        if (SINGLETONE == null){
            SINGLETONE = new Pisica();
        }

        return SINGLETONE;
    }

}

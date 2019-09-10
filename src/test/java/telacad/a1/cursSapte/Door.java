package telacad.a1.cursSapte;

public class Door  implements AutoCloseable{

    public Door(){
        open();
    }

    private void open(){
        System.out.println("Open");
    }

    @Override
    public void close(){
        System.out.println("CLOSE");
        throw new RuntimeException("CLOSING");
    }
}

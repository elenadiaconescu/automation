package telacad.p1.curs3;


public class Mouse {


    static String value2 = "t";
    String value = "t";

    {
        value += "a";
        value2 += "c";
    }

    {
        value += "c";
    }

    public Mouse() {
        value += "b";
    }

    public Mouse(String s) {
        value += s;
    }

    public static void main(String[] args) {
        //break;

        Mouse m = new Mouse("f");  // tacf
//        Mouse m = new Mouse();  // tacb
        m = new Mouse();  //tacb
        System.out.println(m.value);
    }


//    static Integer x;
//    static Boolean b = new Boolean("T");
//    static int i;
//    byte Byte;
//    short Short;
//    int Integer;
//    char Character;
//    long Long;
//    float Float;
//    double Double;
//    String string;


//    int i;
//    char[] t = new char[3][3];
//
//    public static void main(String[] args) {
//        int array[] = new int[]{10, 12, 11};
//        System.out.println(array[i++]);
//        climb();
//
//    }
//
//    public void climb(){
//        System.out.println("x");
//    }

}

package telacad.p1.curs3;


public class Bird {

//
//    private void fly(){
//        System.out.println("Bird is flying");
//
//    }
//
//    public static void main(String[] args) {
//      //  Pelican p = new Pelican();
//      //  p.fly();
//    }


//    public static void main(String[] args) {
//       char[] myString = {'c','v'};
//        }
//
//    }


//    List<Integer> counts = Arrays.asList(1, 2, 3);
//    Stream<Integer> asStream = counts.stream();
//asStream.forEach(x-> System.out.print(x * 2));
//asStream.forEach(System.out::print);



    //Optional<Foo> fooOption = Optional.nullable();
    // Optional<Foo> fooOption = Optional.empty();   //da
    //  Optional<Foo> fooOption = Optional.of(foo);
    //  Optional<Foo> fooOption = Optional.ofNullable(foo);

}

class Pelican extends Bird{

    int id;
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Pelican(int id, String name){
        this.id = id;
        this.name = name;
        name = this.name;

    }

    protected void fly(){
        System.out.println("Pelican is flying");
    }


}



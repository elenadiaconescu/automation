package telacad.altPachet;

class MouseGirl {
    public MouseGirl() {
        System.out.print("Deer ");
    }

    public MouseGirl(int age) {
        System.out.print("DeerAge ");
    }

    public static void main(String[] args) {

    //    char[] myList = input.toCharArray();
    //    System.out.println("initial list " + myList);

    //    Arrays.sort(myList);
    //    System.out.println("sorted list " + myList);

//        List<String> myList = new ArrayList<String>(Arrays.asList(s));
//        System.out.println(myList);
////        myList.sort(Comparator.naturalOrder());
//        Collections.sort(myList);
//        System.out.println(myList);


//     //   MouseGirl m = new MouseBoy(5);
//      //  MouseBoy m2 = new MouseBoy(3);
//     //  System.out.print(", " + m2.hasHorns() + " " + m.hasHorns());
//        try{
//            System.out.println("A");
//            throw new RuntimeException("aa!!");
//        }catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("C");
//            //throw t;
//        }finally {
//            System.out.println("F");
//        }

//-----
//        List<String> list = Arrays.asList("Bob", "Bill", "Ben");
//        String message = "Welcome";
//        list.forEach( name -> System.out.println(message + " " + name) );
//        message = "Goodbye";
//-----
//
//        List<Integer> counts = Arrays.asList(1, 2, 3);
//        Stream<Integer> asStream = counts.stream();
//        asStream.forEach(x -> System.out.print(x * 2));
//        asStream.forEach(System.out::print);
//-----
//        List<String> names =
//                Arrays.asList("Bob", "Bill", "Ben");
      //  names.sort((a, b) -> (a.compareTo(b)));   // da
//        names.sort(a.compareTo(b));  // nu
        // There is no sort operation on Lists, use Collections.sort
        // names.orderBy((a) -> (a.toString())); // nu
//        System.out.println(names);
//-----
       // PayrollSystem payrollSystem = new PayrollSystem.getInstance();
//        PayrollSystem payrollSystem = PayrollSystem.getInstance();  //da
//        PayrollSystem payrollSystem = new PayrollSystem();
//        PayrollSystem payrollSystem = PayrollSystem.instance;
//-----
//        Outer outer = new Outer(99, 42);
//
//        if (outer.doSomethingImportant()){
//            System.out.println("Value1 = " + outer.getValue1());
//            System.out.println("Value2 = " + outer.getValue2());
//        }
//
//        else {
//            System.out.println("Value2 = " + outer.getValue2());
//            System.out.println("Value1 = " + outer.getValue1());
//        }

//-----

//        List<Plant> plants = new ArrayList<Tree>();
//        List<? extends Plant> trees = plants;
//        trees.add(new Tree());

//        List<Tree> trees = new ArrayList<Tree>();
//        trees.add(new Tree());
//        List<? extends Plant> plants = trees;
//        Tree tree = plants.get(0);

//        List<Tree> trees = new ArrayList<Tree>();
//        List<Plant> plants = trees;
//        plants.add(new Tree());

//        List<Plant> plants = new ArrayList<Plant>();
//        plants.add(new Plant());
//        List<? extends Plant> trees = plants;
//        Plant plant = trees.get(0);
//-----




    }

    private boolean hasHorns() {
        return false;
    }
}





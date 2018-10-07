package telacad.a1.cursOpt.generics;

public class Exemplu {

    A a1;
    A<?> a2;
    A<Integer> a3;
    A<? extends Number> a4;  // rule 3
    A<? super Number> a5;   // rule 4

 //   A<?>  a2 = new A();

//    a2 = new A<Integer>();
//    a2 = new A<int[]>();
//
//    a3 = new A<Integer>();
//
//    a4 = new A<Integer>();
//
//    // vreau mereu explicit tipul de adte din pasrtea stanga
//    a4 = new A<Number>();  // o sa mearga numai daca rule 3 e scrisa , altfel nu merge
//    a5 = new A<Object>();
//
//    a3 = new A<>();  // strucutra diamnond


}

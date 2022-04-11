package section2;

public class FunctionalInterfaceDemo {
     public static void main(String args){

         //		MyFunInterface fun = () -> System.out.println("hello");
//		fun.myMethod();
//
//		Integer x = 100;

         onTheFly(() -> System.out.println("Hello"));
     }

    public static void onTheFly(MyInterface fun) {
        fun.myMethod();
    }
}

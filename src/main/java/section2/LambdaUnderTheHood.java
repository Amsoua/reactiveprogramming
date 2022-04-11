package section2;

public class LambdaUnderTheHood {

    public static final void main(String[] args) {
      /*  MyInterface myInterface = new MyInterface(){

            @Override
            public void myMethod() {
                System.out.println("Implementation 1");
            }
        };

        MyInterface myInterface2 = new MyInterface(){

            @Override
            public void myMethod() {
                System.out.println("Implementation 2");
            }
        };*/

        MyInterface fun = () -> System.out.println("Implementation");
        fun.myMethod();

    }
}

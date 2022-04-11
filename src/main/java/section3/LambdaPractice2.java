package section3;

public class LambdaPractice2 {
    public static final void main(String args[]){
        MathOperation addition = (a, b) -> System.out.println(a+b);
        addition.operation(3,4);


        MathOperation multiplication = (a, b) -> System.out.println(a*b);
        multiplication.operation(3,4);

    }
}

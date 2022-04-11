package section4;

import java.util.function.BinaryOperator;

public class BinaryOpPractice {

    public static final void main(String[] args) {

        BinaryOperator<String> fun = (a, b) -> a + "." + b;

        System.out.println(fun.apply("basicStrongs", "com"));
    }
}

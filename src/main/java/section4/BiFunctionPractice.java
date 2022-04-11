package section4;

import java.util.function.BiFunction;

public class BiFunctionPractice {

    public static final void main(String[] args) {

        BiFunction<String, String, Integer> fun = (a, b) -> (a+b).length();

        System.out.println(fun.apply("Basics", "Strongs"));
    }
}

package section4;

import java.util.function.BiFunction;

public class StaticReference {

    public static final void main(String[] args){

        BiFunction<String, String, String> func = A_class :: stacticMethod;

        System.out.println(func.apply("Basics", "Strongs"));
    }
}

class A_class {
    static String stacticMethod(String a, String b){
        return a.concat(b);
    }

}
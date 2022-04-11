package section4;

public class FunctionalGenericDemo {
    public static void main(String[] args){

        FunctionalGenerics<String, String> fun = s -> s.substring(1,5);
        System.out.println(fun.execute("BasicsStrong"));

        FunctionalGenerics<String, String> fun2 = s -> s.concat(" Concat");
        System.out.println(fun2.execute("BasicsStrong"));

        FunctionalGenerics<String, Integer> fun1 = s -> s.length();
        System.out.println(fun1.execute("BasicsStrong"));
    }
}

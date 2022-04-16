package designpattern;

public class GenericsMethod {

    public static <T> String concat(T data) {
        return "Data is: "+data;
    }

    public static void main(String[] args) {
        System.out.println(concat("BasicStrongs"));
        System.out.println(concat(345));
    }
}

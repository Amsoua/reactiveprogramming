package designpattern;

import java.util.ArrayList;
import java.util.List;

public class WildCardDemo {

    public static void display(List<?> list){
        for (Object t:
             list) {
            System.out.println(t);
        }

    }
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        List<? super Integer> l1 = new ArrayList<Number>();
        List<? super Integer> l2 = new ArrayList<Integer>();
        List<? extends Number> l3 = new ArrayList<Integer>();

        list.add(34);
        list.add(57);

    }
}

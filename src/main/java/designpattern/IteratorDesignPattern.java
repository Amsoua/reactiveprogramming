package designpattern;

import java.util.*;

public class IteratorDesignPattern {
    public static void main(String[] args) {
        List<String> lines = new ArrayList<>();
        lines.add("Mark");
        lines.add("Kevin");
        lines.add("Phil");
        lines.add("Tony");

        Iterator<String>  iterator = lines.iterator();

        while(iterator.hasNext()) {
            System.out.println("Name: "+iterator.next());
        }

        System.out.println("Concrete Iterator wet get: "+iterator.toString());

        Set<String> setel = new HashSet<>();
        setel.add("Pierre");
        setel.add("Pat");
        setel.add("Cole");


        Iterator<String>  setIterator = setel.iterator();
        while(setIterator.hasNext()) {
            System.out.println("Name: "+setIterator.next());
        }
        System.out.println("Concrete Iterator wet get: "+setIterator.toString());

    }


}

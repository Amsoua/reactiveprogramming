package designpattern;

import generics.Box;

import java.util.ArrayList;
import java.util.List;

public class SubTyping {
    public static void main(String[] args) {
        Object o = new Object();
        Integer i = Integer.valueOf(11);
        o = i;

        List<Number> numbers = new ArrayList<>();
        numbers.add(Integer.valueOf(23));
        numbers.add(Double.valueOf(24.40));

        List<Box<Integer>> listBox = new ArrayList<>();
        listBox.add(new Box<>(List.of(23, 4,21)));
        listBox.add(new SquashBox<>(List.of(34,4,67)));

    }
}

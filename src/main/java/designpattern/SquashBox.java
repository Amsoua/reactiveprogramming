package designpattern;

import generics.Box;

import java.util.List;

public class SquashBox<T> extends Box<T> {
    public SquashBox(List<T> a) {
        super(a);
    }
}

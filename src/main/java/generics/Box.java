package generics;

import java.util.List;

public class Box<T> {
    List<T> a;

    public Box(List<T> a) {
        this.a = a;
    }

    /**
     * get field
     *
     * @return a
     */
    public List<T> getA() {
        return this.a;
    }

    /**
     * set field
     *
     * @param a
     */
    public void setA(List<T> a) {
        this.a = a;
    }
}

package generics;


import java.util.List;

public class RawTypeDemo {
    public static void main(String[] args) {
        Box<Integer> genBox = new Box<>(List.of(20,34,65,13));

        for (Integer element : genBox.getA()
             ) {
            System.out.println(element);

        }

        Box box = new Box(List.of(203,34,453, "BasicsStrong"));

    }
}

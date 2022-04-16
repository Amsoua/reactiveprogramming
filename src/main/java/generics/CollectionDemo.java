package generics;

import java.util.ArrayList;

public class CollectionDemo {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Test");
        //list.add(10);

        for (String o: list) {
            String str =  o;
            System.out.println(str);
        }

        Bin<String, Integer> bin = new Bin<>();
        bin.setDryTrash("qwsddddd");
        bin.setWetTrash(2934444);

        System.out.println("Dry Trash "+bin.getDryTrash()+ ", Wet Trash "+bin.getWetTrash());
    }
}

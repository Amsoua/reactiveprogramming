package designpattern;

import java.util.Arrays;
import java.util.List;

public class BoundedT {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(new Integer[]{3,5,6});
        List<Double> sList = Arrays.asList(new Double[]{4.6, 4.2, 1.0});
        DataSorter<Integer> sorterInt = new DataSorter<>(list);
        DataSorter<Double> sorterSt = new DataSorter<>(sList);

        sorterInt.getSortedData();
        sorterSt.getSortedData();

        CBounding ib = new CBounding();
        getSortedData(ib);
    }

    /**
     * get sorted data
     *
     * @param list 列表
     */
    public static <T extends IBounding & IBounding2> void getSortedData(T list){
       /* list.sort(null);
        for (T t: list) {
            System.out.println(t);
        }*/
    }
}

interface IBounding{}
interface IBounding2{}

class CBounding implements IBounding, IBounding2{

}
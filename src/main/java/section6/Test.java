package section6;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class Test {
    public static void main(String[] args) {
        System.out.println("hello");

        String[] array ={"a","ab","a","abc","abc","a","ab","ab","a"};
        Map<String,Integer> hm = new HashMap();

        var freq = Arrays.stream(array).collect(Collectors.groupingBy(x ->x, Collectors.counting()));
        Long[] stringValues= new Long[freq.keySet().size()];
        freq.values().toArray(stringValues);
        System.out.println(Arrays.toString(stringValues));

        for(String x:array){

            if(!hm.containsKey(x)){
                hm.put(x,1);
            }else{
                hm.put(x, hm.get(x)+1);
            }
        }
        System.out.println(hm);
        System.out.println("--------------------");
        System.out.println("Factorielle de 20 est: "+factorielle(20));
    }

    public static Long factorielle(int n){
        /*if(n <= 1)
            return 1l;
        else
            return n * factorielle(n - 1);*/
        return LongStream.rangeClosed(1, n).reduce(1, (a, b) -> a*b);
    }
}


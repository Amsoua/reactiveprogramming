package generics;


public class Demo {
    public static void main(String[] args) {
        Data<String> data1 = new Data<>("This is d1");

        System.out.println(data1.toString());

        Data<Integer> data2 = new Data<>(10);

        System.out.println(data2.toString());

        IData<String> data3 = new Data<>("We have implemented a generic interface");

        System.out.println(data3.toString());

        //generic type can be generic class or generic interface
        // Subclassing
        Data<String> data4 = new Data<>("This is d4");
        BaseData<String> b1 = data4;
    }
}

package designpattern;

public class LinkedListDemo {

    public static void main(String[] args) {
        DataNode<Integer> intNode2 = new DataNode<>(20, null);
        DataNode<Integer> intNode1 = new DataNode<>(35, intNode2);

        System.out.println(intNode1.toString());

        DataNode<Double> dNode2 = new DataNode<>(20.45, null);
        DataNode<Double> dNode1 = new DataNode<>(35.32, dNode2);
        DataNode<Number> nNode1 = new DataNode<>(35.32, null);
        nNode1.setNext(nNode1);

        System.out.println(nNode1.toString());
    }
}

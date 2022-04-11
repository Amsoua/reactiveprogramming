package designpattern;


import java.util.Iterator;
import java.util.List;

public class ObserverDesignPattern {

    public static void main(String[] args) {
       Book book = new Book("Amadou","Horror","Xxy",200, "SoldOut");

        EndUser userBob = new EndUser("Bob", book);
        EndUser userJohn = new EndUser("John", book);

        List<Observer> subscribers = book.getObsList();
        for (Iterator<Observer> itr = subscribers.iterator(); itr.hasNext();){
            EndUser endUser = (EndUser) itr.next();
            System.out.println(endUser.getName()+" has subscribed for "+book.getName()+" Book");
        }

        System.out.println(book.getInStock());

        book.setInStock("In Stock");

    }
}

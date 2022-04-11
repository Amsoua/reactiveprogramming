package section15;

public class ObserverDesignPattern {

    public static void main(String[] args) {
        Book book = new Book("Amadou","Horror","Xxy",200, "SoldOut");

        EndUser userBob = new EndUser("Bob", book);
        EndUser userJohn = new EndUser("John", book);

        System.out.println(book.getInStock());

        book.setInStock("In Stock");

    }
}

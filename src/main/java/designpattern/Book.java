package designpattern;


import java.util.ArrayList;
import java.util.List;

public class Book implements SubjectLibrary {

    private String name;
    private String author;
    private String type;
    private double price;
    private String inStock;
    List<Observer> obsList = new ArrayList<Observer>();

    public Book(String name, String author, String type, double price, String inStock) {
        this.name = name;
        this.author = author;
        this.type = type;
        this.price = price;
        this.inStock = inStock;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getInStock() {
        return inStock;
    }

    public void setInStock(String inStock) {
        this.inStock = inStock;
        System.out.println("Availability changed from Sold out, to Back in stock \n");
        notifyObserver();
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public List<Observer> getObsList() {
        return obsList;
    }

    public void setObsList(List<Observer> obsList) {
        this.obsList = obsList;
    }

    @Override
    public String toString() {
        return "Book [name=" + name + ", Author=" + author + ", type=" + type + ", price=" + price + ", inStock=" + inStock + "]";
    }

    @Override
    public void subscribeObserver(Observer ob) {
        obsList.add(ob);
    }

    @Override
    public void unSubscribeObserver(Observer ob) {
       obsList.remove(ob);
    }

    @Override
    public void notifyObserver() {
        System.out.println("name=" + name + ", " +
                "Author=" + author + ", " +
                "type=" + type + ", " +
                "price=" + price + ", " +
                "inStock=" + inStock );
        for (Observer o: obsList){
            o.update(this.inStock);
        }
    }
}

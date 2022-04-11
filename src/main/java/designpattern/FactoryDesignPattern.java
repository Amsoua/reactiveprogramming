package designpattern;

public class FactoryDesignPattern {
    public static void main(String[] args) {
        Database dc = null;

        dc = DatabaseFactory.getDatabase("RDBMS");

        System.out.println("Database: "+dc.getClass().getSimpleName());
        System.out.println(dc.connect());

        dc = DatabaseFactory.getDatabase("DBMS");

        System.out.println("Database: "+dc.getClass().getSimpleName());
        System.out.println(dc.connect());
    }
}

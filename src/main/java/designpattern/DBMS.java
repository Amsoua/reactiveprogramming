package designpattern;

public class DBMS implements Database {
    @Override
    public String connect() {
        return "Connection successfully to DBMS";
    }
}

package designpattern;

public class RDBMS implements Database {
    @Override
    public String connect() {
        return "Connection successfully to RDBMS";
    }
}

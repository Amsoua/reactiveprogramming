package designpattern;

public class DB {

    private String properties;

    private static final String p1 = "RDBMS properties";
    private static final String p2 = "DBMS properties";

    DB(String type){
        this.properties = type;
    }

    public static DB getRDMBMS(){
        return  new DB(p1);
    }

    public static DB getDMBMS(){
        return  new DB(p2);
    }
}

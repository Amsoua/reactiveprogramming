package designpattern;

public class DatabaseFactory {
    public static Database getDatabase(String database){
        Database dc = null;

        if("RDBMS".equalsIgnoreCase(database)){
            dc = new RDBMS();
        } else {
            dc = new DBMS();
        }

        return dc;
    }
}

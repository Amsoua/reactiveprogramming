package designpattern;

public class StrategyDesignPattern {

    public static void main(String[] args) {
        Context con = new Context();
        con.setCompressStrategy(new CompressToRar());
        con.generateFile("Abc.txt");
    }
}

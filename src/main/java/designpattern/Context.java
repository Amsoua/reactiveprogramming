package designpattern;

public class Context {

    Strategy compressStrategy;


    public void setCompressStrategy(Strategy compressStrategy) {
        this.compressStrategy = compressStrategy;
    }

    public void generateFile(String filename){
        compressStrategy.compressFile(filename);
    }
}

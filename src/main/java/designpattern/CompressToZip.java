package designpattern;

public class CompressToZip implements Strategy{

    @Override
    public void compressFile(String filename) {
        System.out.println(filename+" has been compressed successful to .zip file");
    }
}

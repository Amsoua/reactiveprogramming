package designpattern;

public class CompressToRar implements Strategy {
    @Override
    public void compressFile(String filename) {
        System.out.println(filename+" has been compressed successful to .rar file");
    }
}

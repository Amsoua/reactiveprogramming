package section3;

public class LambdaPractice1 {
    public static final void main(String[] args) {

        Name name = () -> System.out.println("John");
        name.myName();

    }
}

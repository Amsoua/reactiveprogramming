package designpattern;

//Director
public class Manufacturer {

    public static Mobile createCompleteObject(){
        MobileBuilder builder = new MobileConcreteBuilder();

        return builder.buildMobile();
    }

}

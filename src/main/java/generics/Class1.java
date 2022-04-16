package generics;


interface Iinterface<T>{}
interface Iinterface2{}

// generic class can implements a non Interface
class  Class2<T> implements  Iinterface2{

}

//generic class can implements a generic Interface and can extends generic class
class Class3<T> extends Class2<T> implements Iinterface<Iinterface2>{
}
//Non generic class can implements a generic Interface
public class Class1 implements Iinterface<Iinterface2>{
}

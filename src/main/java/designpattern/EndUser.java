package designpattern;




public class EndUser implements Observer {

    private  String name;

    public EndUser(String name, SubjectLibrary subject) {
        this.name = name;
        subject.subscribeObserver(this);

    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(String stock) {

        System.out.println("Hello "+ name +"! we are glad to notify you that your book is now available "+stock);
    }
}

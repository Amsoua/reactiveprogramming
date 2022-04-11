package section15;


import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import lombok.val;

import java.util.concurrent.Future;

public class EndUser implements OberServer{

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

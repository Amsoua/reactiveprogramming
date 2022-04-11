package rxjava;

import io.reactivex.rxjava3.subjects.PublishSubject;
import io.reactivex.rxjava3.subjects.Subject;

public class SubjectDemo {

    public static void main(String[] args) {
        PublishSubject<String> subject = PublishSubject.create();

        Subject<String> objectSerializer = subject.toSerialized();

        /*subject.subscribe(System.out::println);
        subject.subscribe(e ->System.out.println("Observer 2: "+e));

        subject.onNext("Hello");
        subject.onNext("Amadou");
        subject.onComplete();
        subject.onNext("How Are You");*/

        System.out.println("<------------------------------------------------->");

        objectSerializer.subscribe(System.out::println);
        objectSerializer.subscribe(e ->System.out.println("Observer 2: "+e));

        objectSerializer.onNext("Hello");
        objectSerializer.onNext("Amadou");
        objectSerializer.onComplete();
        objectSerializer.onNext("How Are You");
    }
}

package rxjava;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.schedulers.Schedulers;
import io.reactivex.rxjava3.subjects.PublishSubject;
import io.reactivex.rxjava3.subjects.Subject;

public class Subjects {
    public static void main(String[] args) throws InterruptedException {

        Observable<Integer> source1 = Observable.just(203,3,500,80).subscribeOn(Schedulers.computation());
        Observable<Integer> source2 = Observable.just(10,120,45,60,100).subscribeOn(Schedulers.computation());


        //source1.subscribe(o -> System.out.println("Observer 1: "+o));
        //source2.subscribe(o -> System.out.println("Observer 2: "+o));

        Subject<Object> subjects = PublishSubject.create();
        subjects.subscribe(o -> System.out.println("Subject execute by: "+Thread.currentThread().getName()+" "+o));

        source1.subscribe(subjects);
        source2.subscribe(subjects);

        Thread.sleep(5000);

    }
}

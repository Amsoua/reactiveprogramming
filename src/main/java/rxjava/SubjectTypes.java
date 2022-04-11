package rxjava;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.subjects.*;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class SubjectTypes {

    public static void main(String[] args) throws InterruptedException {
        Subject<String> subject = PublishSubject.create();


        subject.subscribe(e ->System.out.println("Observer 1: "+e));
        subject.onNext("A");
        subject.onNext("B");
        subject.onNext("C");
        subject.subscribe(e ->System.out.println("Observer 2: "+e));
        subject.onNext("D");
        subject.onNext("E");

        Subject<String> subjectReplay = ReplaySubject.create();
        subjectReplay.subscribe(e ->System.out.println("Replay Observer 1: "+e));
        subjectReplay.onNext("A");
        subjectReplay.onNext("B");
        subjectReplay.onNext("C");
        subjectReplay.subscribe(e ->System.out.println("Replay Observer 2: "+e));
        subjectReplay.onNext("D");
        subjectReplay.onNext("E");

        Subject<String> subjectBehavior = BehaviorSubject.create();
        subjectBehavior.subscribe(e ->System.out.println("Replay Observer 1: "+e));
        subjectBehavior.onNext("A");
        subjectBehavior.onNext("B");
        subjectBehavior.onNext("C");
        subjectBehavior.subscribe(e ->System.out.println("Replay Observer 2: "+e));
        subjectBehavior.onNext("D");
        subjectBehavior.onNext("E");

        Subject<String> subjectAsync = AsyncSubject.create();
        subjectAsync.subscribe(e ->System.out.println("Replay Observer 1: "+e));
        subjectAsync.onNext("A");
        subjectAsync.onNext("B");
        subjectAsync.onNext("C");
        subjectAsync.subscribe(e ->System.out.println("Replay Observer 2: "+e));
        subjectAsync.onNext("D");
        subjectAsync.onNext("E");
        subjectAsync.onComplete();


        Observable<String> src = Observable.just("John", "Rick", "Emile", "Rose")
                .concatMap(s -> Observable.just(s))
                .delay(ThreadLocalRandom.current().nextInt(1000), TimeUnit.MILLISECONDS);

        Observable.interval(3, TimeUnit.SECONDS)
                .switchMap(s -> src.doOnDispose(
                        () -> System.out.println("Disposing et restart again")
                )
                )
                .subscribe(System.out::println);

        Thread.sleep(15000);

    }
}

package rxjava;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;

public class Variants {
    public static void main(String[] args) {
        Observable<String> source = Observable.just("Alex", "Justin", "Jack");
        Observable<String> source1 = Observable.empty();

        source1.first("Name").subscribe(System.out::println);

        //Single
        Single<String> single = Single.just("Alex");
        single.subscribe(System.out::println);

        //Maybe
        source1.firstElement().subscribe(System.out::println, Throwable::printStackTrace, ()->System.out.println("Completed"));

        Completable completable = Completable.complete();
        System.out.println();
        completable.subscribe(() -> System.out.println("Completable"));

        Completable.fromRunnable(() -> System.out.println("Some process executing"))
                .subscribe(() -> System.out.println("The process executed successful"));
    }
}

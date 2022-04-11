package rxjava;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class IoSchedulers {

    public static void main(String[] args) throws InterruptedException {
        Observable<String> source = Observable.just("Pasta", "Pizza", "Fries", "Curry", "Chow mein")
                .subscribeOn(Schedulers.io());

        source.subscribe(e -> compute());
        source.subscribe(e -> compute());
        source.subscribe(e -> compute());
        source.subscribe(e -> compute());
        source.subscribe(e -> compute());

        Thread.sleep(500000);
    }

    private static void compute() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Computation done by "+Thread.currentThread().getName());
    }
}

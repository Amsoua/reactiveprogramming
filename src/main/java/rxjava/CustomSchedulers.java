package rxjava;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.schedulers.Schedulers;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CustomSchedulers {

    public static void main(String[] args) throws InterruptedException {

        ExecutorService executor = Executors.newFixedThreadPool(20);

        Scheduler schedulers = Schedulers.from(executor);
        Observable<String> source = Observable.just("Pasta", "Pizza", "Fries", "Curry", "Chow mein")
                .subscribeOn(schedulers)
                .doFinally(executor::shutdown);

        source.subscribe(e -> compute());

        source.subscribe(e -> compute());
        source.subscribe(e -> compute());
        source.subscribe(e -> compute());
        source.subscribe(e -> compute());

        Thread.sleep(50000);
    }

    private static void compute() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Computation done by "+Thread.currentThread().getName());
    }
}

package rxjava;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class SubscribeOn {
    public static void main(String[] args) throws InterruptedException {
        Observable.just("Pasta", "Pizza", "Fries", "Curry", "Chow mein")
                .subscribeOn(Schedulers.computation())
                .map(String::toUpperCase)
                .doOnNext(e -> System.out.println(Thread.currentThread().getName()))
                .observeOn(Schedulers.newThread())
                .filter(e -> e.startsWith("P"))
                .observeOn(Schedulers.io())
                .subscribe(SubscribeOn::print);
        Thread.sleep(6000);
    }

    private static void print(String element) throws InterruptedException {
        System.out.println(element + " printed by " + Thread.currentThread().getName());
    }
}

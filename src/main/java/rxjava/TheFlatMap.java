package rxjava;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.schedulers.Schedulers;

import java.time.LocalDateTime;

public class TheFlatMap {
    public static void main(String[] args) throws InterruptedException {
        Observable.just("Pasta", "Pizza", "Fries", "Curry", "Chow mein")
                .flatMap(e -> Observable.just(e)
                        .subscribeOn(Schedulers.computation())
                            .map(str -> compute(str)))
                .subscribe(System.out::println);
        Thread.sleep(5000);
    }

    private static String compute(String element) throws InterruptedException {
        String el = element + " Printed by " + Thread.currentThread().getName()+ " at : "+ LocalDateTime.now();
        return el;
    }
}

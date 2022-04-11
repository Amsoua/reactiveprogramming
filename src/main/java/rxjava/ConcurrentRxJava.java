package rxjava;

import io.reactivex.rxjava3.core.Observable;

public class ConcurrentRxJava {
    public static void main(String[] args) {
        Observable<String> source = Observable.create(

                emitter -> {
                    new Thread( () -> {
                    emitter.onNext("Hello");
                    emitter.onNext("RxJava");
                }).start();
                }
                );

        source.subscribe(item -> System.out.println("Oberver 1 "+item+ " Thread "+Thread.currentThread().getName()));

        source.subscribe(item -> System.out.println("Oberver 2 "+item+ " Thread "+Thread.currentThread().getName()));
    }
}

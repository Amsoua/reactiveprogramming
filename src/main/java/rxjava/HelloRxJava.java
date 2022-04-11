package rxjava;

import io.reactivex.rxjava3.core.Observable;

public class HelloRxJava {
    public static void main(String[] args) {
        Observable<String> source = Observable.create(
                emitter -> {
                    emitter.onNext("Hello");
                    emitter.onNext("RxJava");
                }
        );

        source.subscribe(item -> System.out.println("Oberver 1 "+item+ " Thread "+Thread.currentThread().getName()));

        source.subscribe(item -> System.out.println("Oberver 2 "+item+ " Thread "+Thread.currentThread().getName()));
    }
}

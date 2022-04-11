package rxjava;

import io.reactivex.rxjava3.core.Observable;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class Ambiguous {
    public static void main(String[] args) throws InterruptedException {
        Observable<String> source1 = Observable.interval(1, TimeUnit.SECONDS).take(10)
                .map(e -> "Ob 1 : "+e);
        Observable<String> source2 = Observable.interval(1, TimeUnit.MICROSECONDS).take(10)
                .map(e -> "Ob 2 : "+e);

        Observable.amb(Arrays.asList(source1, source2))
                .subscribe(System.out::println);
        Thread.sleep(11000);
    }
}

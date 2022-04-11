package rxjava;

import io.reactivex.rxjava3.core.Observable;

import java.util.concurrent.TimeUnit;

public class Replaying {
    public static void main(String[] args) throws InterruptedException {

        Observable<Long> source = Observable.interval(1, TimeUnit.SECONDS)
                .replay(3,4, TimeUnit.SECONDS)
                .autoConnect();


        source.subscribe(o -> System.out.println("Observer 1: "+o));

        Thread.sleep(5000);

        source.subscribe(o -> System.out.println("Observer 2: "+o));

        Thread.sleep(5000);
    }
}

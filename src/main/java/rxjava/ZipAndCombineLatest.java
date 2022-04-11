package rxjava;

import io.reactivex.rxjava3.core.Observable;

import java.util.concurrent.TimeUnit;

public class ZipAndCombineLatest {
    public static void main(String[] args) throws InterruptedException {
        Observable<Long> source1 = Observable.interval(200, TimeUnit.MILLISECONDS ).take(10);
        Observable<Long> source2 = Observable.interval(1, TimeUnit.SECONDS).take(10);

       /* Observable.zip(source1, source2, (e1, e2) -> "Source 1 "+e1+" Source 2 "+e2)
                .subscribe(System.out::println);*/

        System.out.println("---------------------");
        Observable.combineLatest(source1, source2, (e1, e2) -> "Source 1 "+e1+" Source 2 "+e2)
                .subscribe(System.out::println);
        Thread.sleep(11000);
    }
}

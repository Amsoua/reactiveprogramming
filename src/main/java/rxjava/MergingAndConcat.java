package rxjava;

import io.reactivex.rxjava3.core.Observable;

import java.util.concurrent.TimeUnit;

public class MergingAndConcat {
    public static void main(String[] args) throws InterruptedException {
        //Observable<String> src1 = Observable.just("Alicia", "Kent", "Milana");
        //Observable<String> src2 = Observable.just("Patricia", "Michael" );

        Observable<String> src1 = Observable.interval(1, TimeUnit.SECONDS).map(e ->"src1 : "+e);
        Observable<String> src2 = Observable.interval(1, TimeUnit.SECONDS).map(e ->"src2 : "+e);

        Observable.concat(src1, src2)
                .subscribe(System.out::println);

        /*System.out.println("----------------");
        Observable.concat(src1, src2)
                .subscribe(System.out::println);*/
        src1.concatWith(src2).subscribe(System.out::println);

        Thread.sleep(10000);
    }
}

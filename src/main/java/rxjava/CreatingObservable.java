package rxjava;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;

import java.util.List;
import java.util.concurrent.*;

public class CreatingObservable {

    public static void main(String[] args) throws InterruptedException {
        //create
        System.out.println("---------------fromArray-----------------");
        Observable<Integer> source = Observable.create(
                e -> {
                    e.onNext(10);
                    e.onNext(20);
                    e.onComplete();
                }
        );
        source.subscribe(System.out::println);

        //just
        System.out.println("---------------just-----------------");
        Observable<String> just = Observable.just("Amadou", "Moussa", "Mamadou");
        just.subscribe(System.out::println);

        //fromIterable
        System.out.println("---------------fromIterable-----------------");
        List<String> list = List.of("Ryan", "Sham", "Mike");
        @NonNull
        Observable<String> fromIterable = Observable.fromIterable(list);
        fromIterable.subscribe(System.out::println);

        //range
        Observable<Integer> range = Observable.range(2, 5);
        range.subscribe(System.out::println);

        //interval
        System.out.println("---------------interval-----------------");
        Observable<Long> clock = Observable.interval(1, TimeUnit.SECONDS);

        clock.subscribe(time -> {
            if (time % 2 == 0) {
                System.out.println("Tick : "+time);
            } else {
                System.out.println("Tock : "+time);
            }
        });

        //fromfuture
        System.out.println("---------------fromFuture-----------------");
        ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();

        Future<String> future = executor.schedule(() -> "Hello world!", 1, TimeUnit.SECONDS);

        Observable<String> fromFuture = Observable.fromFuture(future);

        fromFuture.subscribe(
                item -> System.out.println(item),
                error -> error.printStackTrace(),
                () -> System.out.println("Done"));

        executor.shutdown();

        //defer
        System.out.println("---------------defer-----------------");
        Observable<Long> deferObservable = Observable.defer(() -> {
            long time = System.currentTimeMillis();
            return Observable.just(time);
        });

        deferObservable.subscribe(time -> System.out.println(time));

        Thread.sleep(1000);

        deferObservable.subscribe(time -> System.out.println(time));

        //fromCallable
        System.out.println("---------------fromCallable-----------------");
        Callable<String> callable = () -> {
            System.out.println("Hello World!");
            return "Hello World!";
        };

        Observable<String> fromCallable = Observable.fromCallable(callable);

        fromCallable.subscribe(item -> System.out.println(item), error -> error.printStackTrace(),
                () -> System.out.println("FromCallable Done"));

        //fromArray
        System.out.println("---------------fromArray-----------------");
        Integer[] array = new Integer[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        Observable<Integer> fromArray = Observable.fromArray(array);

        fromArray.subscribe(item -> System.out.println(item), error -> error.printStackTrace(),
                () -> System.out.println("FromArray Done"));
    }
}

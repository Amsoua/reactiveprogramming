package rxjava;

import io.reactivex.rxjava3.core.Observable;

public class CreatingOberver {

    public static void main(String[] args) {
        Observable<String> oberver = Observable.just("Orange", "Black", "Red");

        oberver.subscribe(System.out::println, Throwable::printStackTrace, () -> System.out.println("Completed"));
        System.out.println();
        oberver.subscribe(System.out::println, Throwable::printStackTrace);
        System.out.println();
        oberver.subscribe(System.out::println);

    }
}

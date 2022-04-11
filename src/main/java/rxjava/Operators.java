package rxjava;

import io.reactivex.rxjava3.core.Observable;

public class Operators {
    public static void main(String[] args) {
        Observable.just(45, 60, 79, 76, 92, 89, 100)
                .filter(e -> e > 70)
                .sorted()
                .subscribe(e -> System.out.println("Grade A with: "+e));
    }
}

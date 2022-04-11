package rxjava;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.operators.observable.ObservableCreate;

public class ObservableAndObserver {

    public static void main(String[] args) {
        Observable<Integer> source = new ObservableCreate<Integer>(new ObservableOnSubscribe<Integer>() {
            @Override
            public void subscribe(ObservableEmitter<Integer> emitter) throws Throwable {
                try {
                    emitter.onNext(10);
                    emitter.onNext(11);
                    emitter.onComplete();
                } catch (Throwable e) {
                    emitter.onError(e);
                }
            }
        });

        Observer Observer = new Observer() {
            @Override
            public void onSubscribe(@NonNull Disposable d) {
                System.out.println("onSubscribe");
            }

            @Override
            public void onNext(Object o) {
                System.out.println("On Next: "+o);
            }

            @Override
            public void onError(@NonNull Throwable e) {
                e.printStackTrace();
            }

            @Override
            public void onComplete() {
                System.out.println("Completed!");
            }
        };

        source.subscribe(Observer);
    }
}

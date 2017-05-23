package creating_observables;

import io.reactivex.Observable;
import io.reactivex.ObservableOnSubscribe;

/**
 * Description：TODO
 * Create Time：2017/5/23 16:56
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
public class create {
    public static void main(String[] args) {
        Observable.create((ObservableOnSubscribe<Integer>) observableEmitter -> {
            for (int i = 0; i < 5; i++) {
                observableEmitter.onNext(i);
            }

        }).subscribe(integer -> System.out.println(integer));
    }
}

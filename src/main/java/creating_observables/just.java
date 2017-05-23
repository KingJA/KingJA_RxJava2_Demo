package creating_observables;

import io.reactivex.Observable;

/**
 * Description：TODO
 * Create Time：2017/5/23 16:56
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
public class just {
    public static void main(String[] args) {
        Observable.just(1,2,3,4,5,6,7,8,9,10).subscribe(integer -> System.out.println(integer));
    }
}

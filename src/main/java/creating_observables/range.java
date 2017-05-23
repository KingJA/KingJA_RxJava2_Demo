package creating_observables;

import io.reactivex.Observable;

/**
 * Description：TODO
 * Create Time：2017/5/23 17:00
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
public class range {
    public static void main(String[] args) {
        Observable.range(1,8).subscribe(integer-> System.out.println(integer));
    }
}

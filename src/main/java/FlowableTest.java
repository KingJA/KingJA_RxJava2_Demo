import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

import java.util.concurrent.TimeUnit;

/**
 * Description：TODO
 * Create Time：2017/5/23 13:53
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
public class FlowableTest {
    public static void main(String[] args) {
//        Flowable<Long> flowable = Flowable.create(new FlowableOnSubscribe<Long>() {
//            public void subscribe(FlowableEmitter<Long> flowableEmitter) throws Exception {
//                Observable.interval(10, TimeUnit.MILLISECONDS)
//                        .take(Integer.MAX_VALUE)
//                        .subscribe(new Consumer<Long>() {
//                            public void accept(Long aLong) throws Exception {
//                                Thread.sleep(100);
//                                System.out.println("out:"+aLong);
//                            }
//                        });
//            }
//        }, BackpressureStrategy.DROP);

        Observable.create(observableEmitter -> Observable.interval(10, TimeUnit.MILLISECONDS)
                .take(Integer.MAX_VALUE)
                .subscribe(aLong -> {
                    Thread.sleep(100);
                    System.out.println("out:" + aLong);
                }));
//        Observable.interval(10, TimeUnit.MILLISECONDS)
//                .take(Integer.MAX_VALUE)
//                .subscribe(new Observer<Long>() {
//                    @Override
//                    public void onSubscribe(Disposable disposable) {
//
//                    }
//
//                    @Override
//                    public void onNext(Long aLong) {
//
//                        System.out.println("out:" + aLong);
//                    }
//
//                    @Override
//                    public void onError(Throwable throwable) {
//                        System.out.println("onError:");
//                    }
//
//                    @Override
//                    public void onComplete() {
//                        System.out.println("onComplete:");
//                    }
//                });

        Observable.range(1, 100000).take(Integer.MAX_VALUE).subscribe(new Observer<Integer>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(Integer value) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("out:" + value);
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        });

    }
}

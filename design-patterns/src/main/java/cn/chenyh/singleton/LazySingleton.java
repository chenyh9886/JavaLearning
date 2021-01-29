package cn.chenyh.singleton;

/**
 * @version 1.0.0
 * @Description:
 * @author: chenYH
 * @date: 2021/1/29 17:34
 */
public class LazySingleton {

    private volatile static LazySingleton lazySingleton;

    private LazySingleton() {}

    public synchronized LazySingleton getLazySingleton() {
        if(lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}

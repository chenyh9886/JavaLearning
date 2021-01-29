package cn.chenyh.singleton;

/**
 * @version 1.0.0
 * @Description: 双检锁单例
 * @author: chenYH
 * @date: 2021/1/29 19:45
 */
public class DCLSingleton {

    private static volatile DCLSingleton dclSingleton;

    private DCLSingleton() {
    }

    public static DCLSingleton getDclSingleton() {
        if (dclSingleton == null) {
            synchronized (DCLSingleton.class) {
                if (dclSingleton == null) {
                    dclSingleton = new DCLSingleton();
                }
            }
        }
        return dclSingleton;
    }
}

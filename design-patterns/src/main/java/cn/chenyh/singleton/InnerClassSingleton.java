package cn.chenyh.singleton;

/**
 * @version 1.0.0
 * @Description: 静态内部类单例
 * @author: chenYH
 * @date: 2021/1/29 19:55
 */
public class InnerClassSingleton {

    private InnerClassSingleton() {
    }

    private static class SingletonHolder {
        private static InnerClassSingleton INNERCLASSSINGLETON = new InnerClassSingleton();
    }

    public static InnerClassSingleton getInstance() {
        return SingletonHolder.INNERCLASSSINGLETON;
    }
}

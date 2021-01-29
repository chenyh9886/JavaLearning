package cn.chenyh.singleton;

/**
 * @version 1.0.0
 * @Description: 枚举单例
 * @author: chenYH
 * @date: 2021/1/29 17:44
 */
public enum EnumSingleton {

    SINGLETON;

    public void doSomething(){
        System.out.println("枚举做些事情");
    }

    public static void main(String[] args) {
        EnumSingleton.SINGLETON.doSomething();
    }

}

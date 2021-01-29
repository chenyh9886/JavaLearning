package cn.chenyh.singleton;

import cn.chenyh.product.Phone;

/**
 * @version 1.0.0
 * @Description: 饿汉式
 * @author: chenYH
 * @date: 2021/1/29 15:43
 */
public class HungrySingleton {

    private static HungrySingleton HUNGRY_SINGLETON = new HungrySingleton();

    private HungrySingleton(){}

    public static HungrySingleton getHungrySingleton(){
        return HUNGRY_SINGLETON;
    }
}

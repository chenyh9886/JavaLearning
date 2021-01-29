package cn.chenyh.factory;

import cn.chenyh.product.Desktop;
import cn.chenyh.product.IProduct;
import cn.chenyh.product.Phone;

/**
 * @version 1.0.0
 * @Description: 简单工厂
 * @author: chenYH
 * @date: 2021/1/29 14:53
 */
public class SimpleFactory {

    public IProduct getProductByName(String name) {
        if("phone".equalsIgnoreCase(name)) {
            return new Phone();
        } else {
            return new Desktop();
        }
    }
}

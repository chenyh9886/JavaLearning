package cn.chenyh.proxy;

import cn.chenyh.factory.IFactory;
import cn.chenyh.product.Desktop;
import cn.chenyh.product.Phone;

/**
 * @version 1.0.0
 * @Description: 真实工厂
 * @author: chenYH
 * @date: 2021/1/30 13:08
 */
public class RealFactory implements IProxyFactory {

    @Override
    public Phone createPhone() {
        System.out.println("创建了一个手机");
        return new Phone();
    }


    public Desktop createDesktop() {
        System.out.println("创建了一个22");
        return new Desktop();
    }
}

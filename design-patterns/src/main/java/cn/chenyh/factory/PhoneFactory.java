package cn.chenyh.factory;

import cn.chenyh.product.Desktop;
import cn.chenyh.product.Phone;

/**
 * @version 1.0.0
 * @Description: 手机工厂
 * @author: chenYH
 * @date: 2021/1/29 12:58
 */
public class PhoneFactory implements IFactory{

    @Override
    public Phone createPhone() {
        return new Phone();
    }

}

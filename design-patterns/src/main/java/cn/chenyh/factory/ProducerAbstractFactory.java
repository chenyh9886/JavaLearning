package cn.chenyh.factory;

import cn.chenyh.adapter.DesktopFactory;
import cn.chenyh.adapter.PhoneFactory;

/**
 * @version 1.0.0
 * @Description: 适配器模式
 * @author: chenYH
 * @date: 2021/1/29 13:20
 */
public class ProducerAbstractFactory implements IFactory {

    public IFactory getFactoryByName(String name) {
        if("phone".equalsIgnoreCase(name)) {
            return new PhoneFactory();
        } else {
            return new DesktopFactory();
        }
    }
}

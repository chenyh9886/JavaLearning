package cn.chenyh.adapter;

import cn.chenyh.factory.IFactory;

/**
 * @version 1.0.0
 * @Description: 适配器模式
 * @author: chenYH
 * @date: 2021/1/29 13:20
 */
public class ElectronicFactoryAdapter implements IFactory {

    public IFactory getFactoryByName(String name) {
        if("phone".equalsIgnoreCase(name)) {
            return new PhoneFactory();
        } else {
            return new DesktopFactory();
        }
    }
}

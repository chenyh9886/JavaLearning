package cn.chenyh.factory;

/**
 * @version 1.0.0
 * @Description: 电子厂
 * @author: chenYH
 * @date: 2021/1/29 13:20
 */
public class ElectronicFactory implements IFactory {

    public IFactory getFactoryByName(String name) {
        if("phone".equalsIgnoreCase(name)) {
            return new PhoneFactory();
        } else {
            return new DesktopFactory();
        }
    }
}

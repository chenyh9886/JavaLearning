package cn.chenyh.adapter;

import cn.chenyh.factory.IFactory;
import cn.chenyh.product.Desktop;

/**
 * @version 1.0.0
 * @Description: 电脑工厂
 * @author: chenYH
 * @date: 2021/1/29 13:06
 */
public class DesktopFactory implements IFactory {

    @Override
    public Desktop createDesktop() {
        return new Desktop();
    }
}

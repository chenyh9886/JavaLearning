package cn.chenyh.proxy;

import cn.chenyh.product.Desktop;
import cn.chenyh.product.Phone;

/**
 * @version 1.0.0
 * @Description: 代理抽象工厂
 * @author: chenYH
 * @date: 2021/1/30 13:37
 */
public interface IProxyFactory {

    default Phone createPhone() {
        return null;
    }


    default Desktop createDesktop() {
        return null;
    }
}

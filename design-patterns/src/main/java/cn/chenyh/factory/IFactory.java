package cn.chenyh.factory;

import cn.chenyh.product.Desktop;
import cn.chenyh.product.Phone;

/**
 * @version 1.0.0
 * @Description: 工厂接口
 * @author: chenYH
 * @date: 2021/1/29 12:56
 */
public interface IFactory {

    default Phone createPhone() {
      return null;
    }

    default Desktop createDesktop() {
        return null;
    }
}

package cn.chenyh;

import cn.chenyh.factory.ElectronicFactory;
import cn.chenyh.factory.IFactory;
import cn.chenyh.factory.PhoneFactory;
import cn.chenyh.product.Phone;
import org.junit.Test;

/**
 * @version 1.0.0
 * @Description: 抽象工厂测试
 * @author: chenYH
 * @date: 2021/1/29 13:10
 */
public class AbstractFactoryTest {

    @Test
    public void getProduct() {
        ElectronicFactory factory = new ElectronicFactory();

        IFactory phoneFactory = factory.getFactoryByName("phone");
        System.out.println(phoneFactory.createPhone().getDescription());

        IFactory desktopFactory = factory.getFactoryByName("phone2");
        System.out.println(desktopFactory.createDesktop().getDescription());
    }
}

package cn.chenyh;


import cn.chenyh.adapter.ElectronicFactoryAdapter;
import cn.chenyh.factory.IFactory;
import cn.chenyh.factory.ProducerAbstractFactory;
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
        ProducerAbstractFactory factory = new ProducerAbstractFactory();

        IFactory phoneFactory = factory.getFactoryByName("phone");
        System.out.println(phoneFactory.createPhone().getDescription());

        IFactory desktopFactory = factory.getFactoryByName("phone2");
        System.out.println(desktopFactory.createDesktop().getDescription());
    }
}

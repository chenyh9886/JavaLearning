package cn.chenyh;

import cn.chenyh.factory.SimpleFactory;
import org.junit.Test;

/**
 * @version 1.0.0
 * @Description: 简单工厂
 * @author: chenYH
 * @date: 2021/1/29 15:03
 */
public class SimpleFactoryTest {

    @Test
    public void testSimpleFactory() {
        System.out.println(new SimpleFactory().getProductByName("phone").getDescription());
        System.out.println(new SimpleFactory().getProductByName("de").getDescription());
    }
}

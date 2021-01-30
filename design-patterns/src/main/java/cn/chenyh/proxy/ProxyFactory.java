//package cn.chenyh.proxy;
//
//import cn.chenyh.factory.IFactory;
//import cn.chenyh.product.Phone;
//
///**
// * @version 1.0.0
// * @Description: 代理工厂
// * @author: chenYH
// * @date: 2021/1/30 13:04
// */
//public class ProxyFactory implements IFactory {
//
//    private IProxyFactory realFactory;
//
//    public ProxyFactory(IProxyFactory realFactory) {
//        this.realFactory = realFactory;
//    }
//
//    private void band() {
//        System.out.println("贴一个品牌。。。。。");
//    }
//
//    @Override
//    public Phone createPhone() {
//        if(realFactory ==null) {
//            realFactory = new RealFactory();
//        }
//        Phone phone = realFactory.createPhone();
//
//        band();
//
//        return phone;
//    }
//
//    public static void main(String[] args) {
//        RealFactory realFactory = new RealFactory();
//        IFactory proxyFactory = new ProxyFactory(realFactory);
//        proxyFactory.createPhone();
//
//    }
//}

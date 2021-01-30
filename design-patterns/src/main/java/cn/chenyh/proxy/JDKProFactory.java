package cn.chenyh.proxy;

import cn.chenyh.factory.IFactory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @version 1.0.0
 * @Description: jdk代理
 * @author: chenYH
 * @date: 2021/1/30 13:25
 */
public class JDKProFactory {
    private Object target;

    public JDKProFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        Object invoke = method.invoke(target, args);
                        return invoke;
                    }
                }
        );
    }

    public static void main(String[] args) {
        RealFactory realFactory = new RealFactory();
        IProxyFactory proxyInstance = (IProxyFactory)new JDKProFactory(realFactory).getProxyInstance();
        proxyInstance.createPhone();
        proxyInstance.createDesktop();
    }

}

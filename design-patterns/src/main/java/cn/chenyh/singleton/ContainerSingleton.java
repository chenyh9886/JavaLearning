package cn.chenyh.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * @version 1.0.0
 * @Description: 容器单例
 * @author: chenYH
 * @date: 2021/1/29 20:01
 */
public class ContainerSingleton {

    private static Map<String, Object> containerMap = new HashMap<String, Object>();

    private ContainerSingleton() {
    }

    public static void registerService(String key, Object instance) {
        if(!containerMap.containsKey(key)) {
            containerMap.put(key, instance);
        }
    }

    public static Object getService(String key) {
        return containerMap.get(key);
    }

}

package houzm.accumulation.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * author: hzm_dream@163.com
 * date: 2018/12/7 17:04
 * description:
 */
public class StarProxy implements InvocationHandler {

    public Object object;

    public StarProxy(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(object, args);
        return result;
    }
}

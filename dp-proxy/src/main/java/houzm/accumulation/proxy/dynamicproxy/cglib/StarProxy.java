package houzm.accumulation.proxy.dynamicproxy.cglib;

import java.lang.reflect.Method;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * author: hzm_dream@163.com
 * date: 2018/12/7 17:37
 * description:
 */
public class StarProxy implements MethodInterceptor {
    public Object target;

    public Object getInstance(Object target) {
        this.target = target;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(this.target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object object, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("前增强");
        Object invoke = methodProxy.invoke(target, args);
        System.out.println("后增强");
        return invoke;
    }
}

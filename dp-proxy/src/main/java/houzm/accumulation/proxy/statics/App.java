package houzm.accumulation.proxy.statics;

/**
 * author: hzm_dream@163.com
 * date: 2018/12/7 16:54
 * description:
 */
public class App {
    public static void main(String[] args) {
        StarAProxy starAProxy = new StarAProxy(new StarA());
        starAProxy.performance();
    }
}

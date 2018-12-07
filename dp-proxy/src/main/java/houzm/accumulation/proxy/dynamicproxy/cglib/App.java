package houzm.accumulation.proxy.dynamicproxy.cglib;

/**
 * author: hzm_dream@163.com
 * date: 2018/12/7 17:42
 * description:
 */
public class App {
    public static void main(String[] args) {
        StarA star = new StarA();
        StarProxy starProxy = new StarProxy();
        StarA starPro = (StarA) starProxy.getInstance(star);
        starPro.p();
    }
}

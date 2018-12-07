package houzm.accumulation.proxy.statics;

/**
 * author: hzm_dream@163.com
 * date: 2018/12/7 16:44
 * description:
 */
public class StarAProxy implements Star {

    private Star star;

    public StarAProxy(Star star) {
        this.star = star;
    }

    @Override
    public void performance() {
        System.out.println("我是Start的代理人，商演之前我们有些事要处理");
        star.performance();
        System.out.println("我是Start的代理人，商演之后我们需要进行交易转账");
    }
}

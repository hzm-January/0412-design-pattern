package houzm.accumulation.decorator;

/**
 * author: hzm_dream@163.com
 * date: 2018/12/7 14:24
 * description: 武器
 *
 */
public class Weapon implements Equip {
    @Override
    public int attack() {
        return 10;
    }

    @Override
    public String description() {
        return "打野刀";
    }
}

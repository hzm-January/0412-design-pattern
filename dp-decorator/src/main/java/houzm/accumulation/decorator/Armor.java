package houzm.accumulation.decorator;

/**
 * author: hzm_dream@163.com
 * date: 2018/12/7 14:26
 * description: 护甲
 */
public class Armor implements Equip {
    @Override
    public int attack() {
        return 8;
    }

    @Override
    public String description() {
        return "魔女斗篷";
    }
}

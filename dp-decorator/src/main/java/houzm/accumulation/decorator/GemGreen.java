package houzm.accumulation.decorator;

/**
 * author: hzm_dream@163.com
 * date: 2018/12/7 14:28
 * description: 装饰者--红宝石--提供5个攻击力
 *
 */
public class GemGreen extends Gem {

    private Equip equip;


    //方式二：通过构造方法传入 装备对象
    public GemGreen(Equip equip) {
        this.equip = equip;
    }

    //方式一：通过set方法传入 装备对象
//    public GemRed() {
//    }
//    public void setEquip(Equip equip) {
//        this.equip = equip;
//    }

    @Override
    public int attack() {
        return 4 + equip.attack();
    }

    @Override
    public String description() {
        return equip.description().concat(" 绿宝石");
    }
}
